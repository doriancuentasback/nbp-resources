//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.06.11 a las 03:16:55 PM COT 
//


package org.netbeans.modules.websvc.saas.model.oauth;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para paramType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="paramType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="oauth-name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="param-name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="oauth-prefix" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="oauth-postfix" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="xpath" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paramType")
public class ParamType {

    @XmlAttribute(name = "oauth-name", required = true)
    protected String oauthName;
    @XmlAttribute(name = "param-name")
    protected String paramName;
    @XmlAttribute(name = "oauth-prefix")
    protected String oauthPrefix;
    @XmlAttribute(name = "oauth-postfix")
    protected String oauthPostfix;
    @XmlAttribute(name = "xpath")
    protected String xpath;

    /**
     * Obtiene el valor de la propiedad oauthName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOauthName() {
        return oauthName;
    }

    /**
     * Define el valor de la propiedad oauthName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOauthName(String value) {
        this.oauthName = value;
    }

    /**
     * Obtiene el valor de la propiedad paramName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParamName() {
        return paramName;
    }

    /**
     * Define el valor de la propiedad paramName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParamName(String value) {
        this.paramName = value;
    }

    /**
     * Obtiene el valor de la propiedad oauthPrefix.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOauthPrefix() {
        return oauthPrefix;
    }

    /**
     * Define el valor de la propiedad oauthPrefix.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOauthPrefix(String value) {
        this.oauthPrefix = value;
    }

    /**
     * Obtiene el valor de la propiedad oauthPostfix.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOauthPostfix() {
        return oauthPostfix;
    }

    /**
     * Define el valor de la propiedad oauthPostfix.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOauthPostfix(String value) {
        this.oauthPostfix = value;
    }

    /**
     * Obtiene el valor de la propiedad xpath.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXpath() {
        return xpath;
    }

    /**
     * Define el valor de la propiedad xpath.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXpath(String value) {
        this.xpath = value;
    }

}
