//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.06.11 a las 03:16:55 PM COT 
//


package org.netbeans.modules.websvc.saas.model.oauth;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             specifies authorization step, that can be either
 *             1. fixed-url URL with one ore more OAuth parameters
 *             2. dynamic-url obtained during first step (request-token)
 *           
 * 
 * <p>Clase Java para authorizationType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="authorizationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="fixed-url" type="{http://netbeans.org/ns/oauth/metadata/1}fixed-urlType"/>
 *           &lt;element name="dynamic-url" type="{http://netbeans.org/ns/oauth/metadata/1}dynamic-urlType"/>
 *         &lt;/choice>
 *         &lt;element name="param" type="{http://netbeans.org/ns/oauth/metadata/1}paramType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "authorizationType", propOrder = {
    "fixedUrl",
    "dynamicUrl",
    "param"
})
public class AuthorizationType {

    @XmlElement(name = "fixed-url")
    protected FixedUrlType fixedUrl;
    @XmlElement(name = "dynamic-url")
    protected DynamicUrlType dynamicUrl;
    protected List<ParamType> param;

    /**
     * Obtiene el valor de la propiedad fixedUrl.
     * 
     * @return
     *     possible object is
     *     {@link FixedUrlType }
     *     
     */
    public FixedUrlType getFixedUrl() {
        return fixedUrl;
    }

    /**
     * Define el valor de la propiedad fixedUrl.
     * 
     * @param value
     *     allowed object is
     *     {@link FixedUrlType }
     *     
     */
    public void setFixedUrl(FixedUrlType value) {
        this.fixedUrl = value;
    }

    /**
     * Obtiene el valor de la propiedad dynamicUrl.
     * 
     * @return
     *     possible object is
     *     {@link DynamicUrlType }
     *     
     */
    public DynamicUrlType getDynamicUrl() {
        return dynamicUrl;
    }

    /**
     * Define el valor de la propiedad dynamicUrl.
     * 
     * @param value
     *     allowed object is
     *     {@link DynamicUrlType }
     *     
     */
    public void setDynamicUrl(DynamicUrlType value) {
        this.dynamicUrl = value;
    }

    /**
     * Gets the value of the param property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the param property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParam().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParamType }
     * 
     * 
     */
    public List<ParamType> getParam() {
        if (param == null) {
            param = new ArrayList<ParamType>();
        }
        return this.param;
    }

}
