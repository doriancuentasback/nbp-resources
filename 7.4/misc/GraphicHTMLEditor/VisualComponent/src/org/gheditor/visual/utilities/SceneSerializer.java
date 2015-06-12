package org.gheditor.visual.utilities;

import java.awt.Dimension;
import java.awt.Point;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import org.gheditor.visual.items.filesupport.Item;
import org.gheditor.visual.widget.ItemWidget;
import org.netbeans.api.visual.widget.Scene;
import org.netbeans.api.visual.widget.Widget;
import org.openide.util.Exceptions;
import org.openide.xml.XMLUtil;
import org.w3c.dom.Attr;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class SceneSerializer {

    private static final String SCENE_ELEMENT = "advert";
    private static final String VERSION_ATTR = "version";
    private static final String NODE_ELEMENT = "item";
    private static final String NODE_ID = "id";
    private static final String NODE_X = "x";
    private static final String NODE_Y = "y";
    private static final String NODE_WIDTH = "width";
    private static final String NODE_HEIGHT = "height";
    private static final String HEADER_ELEMENT = "header";
    private static final String BODY_ELEMENT = "body";
    private static final String FOOTER_ELEMENT = "footer";
    private static final String NODE_ID_NAME = "name";
    private static final String VERSION_VALUE_1 = "1";

    private static Document document = null;
    private static Node sceneElement = null;
    private static Node headerElement = null;
    private static Node bodyElement = null;
    private static Node footerElement = null;

    private static Set<String> uniqueItems = null;

    public static void serialize(Scene scene, Item item, File file) {
        // basics:
        if (uniqueItems == null) {
            uniqueItems = new HashSet<String>();
        }
        if (document == null) {
            document = XMLUtil.createDocument(SCENE_ELEMENT, null, null, null);
        }
        if (sceneElement == null) {
            sceneElement = document.getFirstChild();
            setAttribute(document, sceneElement, VERSION_ATTR, VERSION_VALUE_1);
        }
        if (headerElement == null) {
            headerElement = document.createElement(HEADER_ELEMENT);
            sceneElement.appendChild(headerElement);
        }
        if (bodyElement == null) {
            bodyElement = document.createElement(BODY_ELEMENT);
            sceneElement.appendChild(bodyElement);
        }
        if (footerElement == null) {
            footerElement = document.createElement(FOOTER_ELEMENT);
            sceneElement.appendChild(footerElement);
        }
        parseItem(item);
        write(file, document);
    }
    
      // call in AWT to deserialize scene
//    public static void deserialize (Scene scene, File file) {
//        if (! VERSION_VALUE_1.equals (getAttributeValue (sceneElement, VERSION_ATTR)))
//            return;
//        scene.nodeIDcounter = Long.parseLong (getAttributeValue (sceneElement, SCENE_NODE_COUNTER_ATTR));
//        for (Node element : getChildNode (sceneElement)) {
//            if (NODE_ELEMENT.equals (element.getNodeName ())) {
//                String type = getAttributeValue (element, NODE_ID_ATTR);
//                int x = Integer.parseInt (getAttributeValue (element, NODE_X_ATTR));
//                int y = Integer.parseInt (getAttributeValue (element, NODE_Y_ATTR));
//                int width = Integer.parseInt (getAttributeValue (element, NODE_WIDTH));
//                int height = Integer.parseInt (getAttributeValue (element, NODE_HEIGHT));
//                ItemWidget aWidget = new ItemWidget();
//                aWidget.setType(type);
//                Widget nodeWidget = scene.addChild(aWidget);
//                nodeWidget.setPreferredLocation (new Point (x, y));
//                nodeWidget.setPreferredSize (new Dimension (width, height));
//            } 
//        }
//    }

    private static void parseItem(Item item) throws DOMException {
        // Use the Item:
        Element nodeElement = document.createElement(NODE_ELEMENT);
        if (!uniqueItems.add(item.getUniqueId())) {
            // The widget has moved, so reset its x and y values.
            final String x = String.valueOf(item.getX());
            final String y = String.valueOf(item.getY());
            final String width = String.valueOf(item.getWidth());
            final String height = String.valueOf(item.getHeight());
            // x and y and width and height element:
            for (int i = 0; i < document.getElementsByTagName(NODE_ELEMENT).getLength(); i++) {
                Node node = document.getElementsByTagName(NODE_ELEMENT).item(i);
                String uniqueIdOfNode = node.getAttributes().getNamedItem(NODE_ID).getNodeValue();
                if (item.getUniqueId().equals(uniqueIdOfNode)){
                    for (int k = 0; k < node.getChildNodes().getLength(); k++) {
                        Node nodeInCorrectItem = node.getChildNodes().item(k);
                        if (nodeInCorrectItem.getNodeName().equals(NODE_X)) {
                            nodeInCorrectItem.setTextContent(x);
                        }
                        if (nodeInCorrectItem.getNodeName().equals(NODE_Y)) {
                            nodeInCorrectItem.setTextContent(y);
                        }
                        if (nodeInCorrectItem.getNodeName().equals(NODE_WIDTH)) {
                            nodeInCorrectItem.setTextContent(width);
                        }
                        if (nodeInCorrectItem.getNodeName().equals(NODE_HEIGHT)) {
                            nodeInCorrectItem.setTextContent(height);
                        }
                    }
                }
            }
        } else {
            String id = item.getUniqueId();
            String name = item.getDisplayname();
            String x = String.valueOf(item.getX());
            String y = String.valueOf(item.getY());
            String w = String.valueOf(item.getWidth());
            String h = String.valueOf(item.getHeight());
            setAttribute(document, nodeElement, NODE_ID, id);
            // name element:
            Element nameElement = document.createElement(NODE_ID_NAME);
            nameElement.setTextContent(name);
            nodeElement.appendChild(nameElement);
            // width element:
            Element widthElement = document.createElement(NODE_WIDTH);
            widthElement.setTextContent(w);
            nodeElement.appendChild(widthElement);
            // height element:
            Element heightElement = document.createElement(NODE_HEIGHT);
            heightElement.setTextContent(h);
            nodeElement.appendChild(heightElement);
            // x element:
            Element xElement = document.createElement(NODE_X);
            xElement.setTextContent(x);
            nodeElement.appendChild(xElement);
            // y element:
            Element yElement = document.createElement(NODE_Y);
            yElement.setTextContent(y);
            nodeElement.appendChild(yElement);
            // attach node to correct section:
            if (item.getType().equals("header")) {
                headerElement.appendChild(nodeElement);
            } else if (item.getType().equals("body")) {
                bodyElement.appendChild(nodeElement);
            } else if (item.getType().equals("footer")) {
                footerElement.appendChild(nodeElement);
            }
        }
    }

    private static void write(File file, Document document) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(file);
            XMLUtil.write(document, fos, "UTF-8"); // NOI18N
        } catch (IOException e) {
            Exceptions.printStackTrace(e);
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                Exceptions.printStackTrace(e);
            }
        }
    }

    private static void setAttribute(
            Document xml,
            Node node,
            String name,
            String value) {
        NamedNodeMap map = node.getAttributes();
        Attr attribute = xml.createAttribute(name);
        attribute.setValue(value);
        map.setNamedItem(attribute);
    }
    
    private static String getAttributeValue (Node node, String attr) {
        try {
            if (node != null) {
                NamedNodeMap map = node.getAttributes ();
                if (map != null) {
                    node = map.getNamedItem (attr);
                    if (node != null)
                        return node.getNodeValue ();
                }
            }
        } catch (DOMException e) {
            Exceptions.printStackTrace (e);
        }
        return null;
    }

    private static Node[] getChildNode (Node node) {
        NodeList childNodes = node.getChildNodes ();
        Node[] nodes = new Node[childNodes != null ? childNodes.getLength () : 0];
        for (int i = 0; i < nodes.length; i++)
            nodes[i] = childNodes.item (i);
        return nodes;
    }

}
