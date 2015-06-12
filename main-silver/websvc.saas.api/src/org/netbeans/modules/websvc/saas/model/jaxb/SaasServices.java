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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SaasServices complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SaasServices">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="display-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://xml.netbeans.org/websvc/saas/services/1.0}saas-metadata" minOccurs="0"/>
 *         &lt;element name="header" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="params" type="{http://xml.netbeans.org/websvc/saas/services/1.0}Params" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="methods" type="{http://xml.netbeans.org/websvc/saas/services/1.0}Methods" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="url" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="api-doc" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaasServices", propOrder = {
    "description",
    "displayName",
    "saasMetadata",
    "header",
    "methods"
})
public class SaasServices {

    @XmlElement(required = true)
    protected String description;
    @XmlElement(name = "display-name", required = true)
    protected String displayName;
    @XmlElement(name = "saas-metadata")
    protected SaasMetadata saasMetadata;
    protected SaasServices.Header header;
    protected Methods methods;
    @XmlAttribute(name = "type", required = true)
    protected String type;
    @XmlAttribute(name = "url")
    protected String url;
    @XmlAttribute(name = "api-doc", required = true)
    protected String apiDoc;

    /**
     * Obtiene el valor de la propiedad description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Define el valor de la propiedad description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Obtiene el valor de la propiedad displayName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Define el valor de la propiedad displayName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Obtiene el valor de la propiedad saasMetadata.
     * 
     * @return
     *     possible object is
     *     {@link SaasMetadata }
     *     
     */
    public SaasMetadata getSaasMetadata() {
        return saasMetadata;
    }

    /**
     * Define el valor de la propiedad saasMetadata.
     * 
     * @param value
     *     allowed object is
     *     {@link SaasMetadata }
     *     
     */
    public void setSaasMetadata(SaasMetadata value) {
        this.saasMetadata = value;
    }

    /**
     * Obtiene el valor de la propiedad header.
     * 
     * @return
     *     possible object is
     *     {@link SaasServices.Header }
     *     
     */
    public SaasServices.Header getHeader() {
        return header;
    }

    /**
     * Define el valor de la propiedad header.
     * 
     * @param value
     *     allowed object is
     *     {@link SaasServices.Header }
     *     
     */
    public void setHeader(SaasServices.Header value) {
        this.header = value;
    }

    /**
     * Obtiene el valor de la propiedad methods.
     * 
     * @return
     *     possible object is
     *     {@link Methods }
     *     
     */
    public Methods getMethods() {
        return methods;
    }

    /**
     * Define el valor de la propiedad methods.
     * 
     * @param value
     *     allowed object is
     *     {@link Methods }
     *     
     */
    public void setMethods(Methods value) {
        this.methods = value;
    }

    /**
     * Obtiene el valor de la propiedad type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Define el valor de la propiedad type.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Obtiene el valor de la propiedad url.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Define el valor de la propiedad url.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Obtiene el valor de la propiedad apiDoc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApiDoc() {
        return apiDoc;
    }

    /**
     * Define el valor de la propiedad apiDoc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApiDoc(String value) {
        this.apiDoc = value;
    }


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
     *         &lt;element name="params" type="{http://xml.netbeans.org/websvc/saas/services/1.0}Params" minOccurs="0"/>
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
        "params"
    })
    public static class Header {

        protected Params params;

        /**
         * Obtiene el valor de la propiedad params.
         * 
         * @return
         *     possible object is
         *     {@link Params }
         *     
         */
        public Params getParams() {
            return params;
        }

        /**
         * Define el valor de la propiedad params.
         * 
         * @param value
         *     allowed object is
         *     {@link Params }
         *     
         */
        public void setParams(Params value) {
            this.params = value;
        }

    }

}
