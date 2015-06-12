//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.06.11 a las 03:16:53 PM COT 
//


package org.netbeans.modules.websvc.saas.model.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para MethodDescriptor complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MethodDescriptor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="modifiers" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="return-type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="throws" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="body" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="body-ref" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="param-types" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="param-names" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MethodDescriptor")
public class MethodDescriptor {

    @XmlAttribute(name = "modifiers")
    protected String modifiers;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "return-type")
    protected String returnType;
    @XmlAttribute(name = "throws")
    protected String _throws;
    @XmlAttribute(name = "body")
    protected String body;
    @XmlAttribute(name = "body-ref")
    protected String bodyRef;
    @XmlAttribute(name = "param-types")
    protected String paramTypes;
    @XmlAttribute(name = "param-names")
    protected String paramNames;

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
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad returnType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnType() {
        return returnType;
    }

    /**
     * Define el valor de la propiedad returnType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnType(String value) {
        this.returnType = value;
    }

    /**
     * Obtiene el valor de la propiedad throws.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThrows() {
        return _throws;
    }

    /**
     * Define el valor de la propiedad throws.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThrows(String value) {
        this._throws = value;
    }

    /**
     * Obtiene el valor de la propiedad body.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBody() {
        return body;
    }

    /**
     * Define el valor de la propiedad body.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBody(String value) {
        this.body = value;
    }

    /**
     * Obtiene el valor de la propiedad bodyRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBodyRef() {
        return bodyRef;
    }

    /**
     * Define el valor de la propiedad bodyRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBodyRef(String value) {
        this.bodyRef = value;
    }

    /**
     * Obtiene el valor de la propiedad paramTypes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParamTypes() {
        return paramTypes;
    }

    /**
     * Define el valor de la propiedad paramTypes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParamTypes(String value) {
        this.paramTypes = value;
    }

    /**
     * Obtiene el valor de la propiedad paramNames.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParamNames() {
        return paramNames;
    }

    /**
     * Define el valor de la propiedad paramNames.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParamNames(String value) {
        this.paramNames = value;
    }

}
