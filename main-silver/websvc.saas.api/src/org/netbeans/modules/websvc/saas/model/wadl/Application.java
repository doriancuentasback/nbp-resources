//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.06.11 a las 03:16:54 PM COT 
//


package org.netbeans.modules.websvc.saas.model.wadl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://wadl.dev.java.net/2009/02}doc" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://wadl.dev.java.net/2009/02}grammars" minOccurs="0"/>
 *         &lt;element ref="{http://wadl.dev.java.net/2009/02}resources" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{http://wadl.dev.java.net/2009/02}resource_type"/>
 *           &lt;element ref="{http://wadl.dev.java.net/2009/02}method"/>
 *           &lt;element ref="{http://wadl.dev.java.net/2009/02}representation"/>
 *           &lt;element ref="{http://wadl.dev.java.net/2009/02}param"/>
 *         &lt;/choice>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "doc",
    "grammars",
    "resources",
    "resourceTypeOrMethodOrRepresentation",
    "any"
})
@XmlRootElement(name = "application")
public class Application {

    protected List<Doc> doc;
    protected Grammars grammars;
    protected List<Resources> resources;
    @XmlElements({
        @XmlElement(name = "resource_type", type = ResourceType.class),
        @XmlElement(name = "method", type = Method.class),
        @XmlElement(name = "representation", type = Representation.class),
        @XmlElement(name = "param", type = Param.class)
    })
    protected List<Object> resourceTypeOrMethodOrRepresentation;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the doc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the doc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDoc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Doc }
     * 
     * 
     */
    public List<Doc> getDoc() {
        if (doc == null) {
            doc = new ArrayList<Doc>();
        }
        return this.doc;
    }

    /**
     * Obtiene el valor de la propiedad grammars.
     * 
     * @return
     *     possible object is
     *     {@link Grammars }
     *     
     */
    public Grammars getGrammars() {
        return grammars;
    }

    /**
     * Define el valor de la propiedad grammars.
     * 
     * @param value
     *     allowed object is
     *     {@link Grammars }
     *     
     */
    public void setGrammars(Grammars value) {
        this.grammars = value;
    }

    /**
     * Gets the value of the resources property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resources property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResources().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Resources }
     * 
     * 
     */
    public List<Resources> getResources() {
        if (resources == null) {
            resources = new ArrayList<Resources>();
        }
        return this.resources;
    }

    /**
     * Gets the value of the resourceTypeOrMethodOrRepresentation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resourceTypeOrMethodOrRepresentation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResourceTypeOrMethodOrRepresentation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceType }
     * {@link Method }
     * {@link Representation }
     * {@link Param }
     * 
     * 
     */
    public List<Object> getResourceTypeOrMethodOrRepresentation() {
        if (resourceTypeOrMethodOrRepresentation == null) {
            resourceTypeOrMethodOrRepresentation = new ArrayList<Object>();
        }
        return this.resourceTypeOrMethodOrRepresentation;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

}
