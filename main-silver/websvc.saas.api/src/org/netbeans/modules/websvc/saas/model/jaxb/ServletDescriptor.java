//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.06.11 a las 03:16:53 PM COT 
//


package org.netbeans.modules.websvc.saas.model.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ServletDescriptor complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ServletDescriptor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="method-descriptor" type="{http://xml.netbeans.org/websvc/saas/services/1.0}MethodDescriptor" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="field-descriptor" type="{http://xml.netbeans.org/websvc/saas/services/1.0}FieldDescriptor" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="modifiers" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="class-name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="servlet-mapping" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServletDescriptor", propOrder = {
    "methodDescriptor",
    "fieldDescriptor"
})
public class ServletDescriptor {

    @XmlElement(name = "method-descriptor")
    protected List<MethodDescriptor> methodDescriptor;
    @XmlElement(name = "field-descriptor")
    protected List<FieldDescriptor> fieldDescriptor;
    @XmlAttribute(name = "modifiers")
    protected String modifiers;
    @XmlAttribute(name = "class-name")
    protected String className;
    @XmlAttribute(name = "servlet-mapping")
    protected String servletMapping;

    /**
     * Gets the value of the methodDescriptor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the methodDescriptor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMethodDescriptor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MethodDescriptor }
     * 
     * 
     */
    public List<MethodDescriptor> getMethodDescriptor() {
        if (methodDescriptor == null) {
            methodDescriptor = new ArrayList<MethodDescriptor>();
        }
        return this.methodDescriptor;
    }

    /**
     * Gets the value of the fieldDescriptor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fieldDescriptor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFieldDescriptor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FieldDescriptor }
     * 
     * 
     */
    public List<FieldDescriptor> getFieldDescriptor() {
        if (fieldDescriptor == null) {
            fieldDescriptor = new ArrayList<FieldDescriptor>();
        }
        return this.fieldDescriptor;
    }

    /**
     * Obtiene el valor de la propiedad modifiers.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifiers() {
        return modifiers;
    }

    /**
     * Define el valor de la propiedad modifiers.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifiers(String value) {
        this.modifiers = value;
    }

    /**
     * Obtiene el valor de la propiedad className.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassName() {
        return className;
    }

    /**
     * Define el valor de la propiedad className.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassName(String value) {
        this.className = value;
    }

    /**
     * Obtiene el valor de la propiedad servletMapping.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServletMapping() {
        return servletMapping;
    }

    /**
     * Define el valor de la propiedad servletMapping.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServletMapping(String value) {
        this.servletMapping = value;
    }

}
