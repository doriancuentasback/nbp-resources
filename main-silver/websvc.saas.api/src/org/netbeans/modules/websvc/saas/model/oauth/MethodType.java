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
 * 
 *             specifies REST method used to obtain (request/access) token.
 *           
 * 
 * <p>Clase Java para methodType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="methodType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="method-name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="request-style" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="FORM"/>
 *             &lt;enumeration value="PATH"/>
 *             &lt;enumeration value="QUERY"/>
 *             &lt;enumeration value="HEADER"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="request-param" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="response-style" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="FORM"/>
 *             &lt;enumeration value="XML"/>
 *             &lt;enumeration value="JSON"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="signature-method" type="{http://netbeans.org/ns/oauth/metadata/1}signature-methodType" />
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="nonce" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="timestamp" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="callback" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="verifier" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "methodType")
public class MethodType {

    @XmlAttribute(name = "method-name", required = true)
    protected String methodName;
    @XmlAttribute(name = "request-style", required = true)
    protected String requestStyle;
    @XmlAttribute(name = "request-param")
    protected String requestParam;
    @XmlAttribute(name = "response-style", required = true)
    protected String responseStyle;
    @XmlAttribute(name = "signature-method")
    protected SignatureMethodType signatureMethod;
    @XmlAttribute(name = "version")
    protected String version;
    @XmlAttribute(name = "nonce")
    protected Boolean nonce;
    @XmlAttribute(name = "timestamp")
    protected Boolean timestamp;
    @XmlAttribute(name = "callback")
    protected Boolean callback;
    @XmlAttribute(name = "verifier")
    protected Boolean verifier;

    /**
     * Obtiene el valor de la propiedad methodName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMethodName() {
        return methodName;
    }

    /**
     * Define el valor de la propiedad methodName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMethodName(String value) {
        this.methodName = value;
    }

    /**
     * Obtiene el valor de la propiedad requestStyle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestStyle() {
        return requestStyle;
    }

    /**
     * Define el valor de la propiedad requestStyle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestStyle(String value) {
        this.requestStyle = value;
    }

    /**
     * Obtiene el valor de la propiedad requestParam.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestParam() {
        return requestParam;
    }

    /**
     * Define el valor de la propiedad requestParam.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestParam(String value) {
        this.requestParam = value;
    }

    /**
     * Obtiene el valor de la propiedad responseStyle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseStyle() {
        return responseStyle;
    }

    /**
     * Define el valor de la propiedad responseStyle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseStyle(String value) {
        this.responseStyle = value;
    }

    /**
     * Obtiene el valor de la propiedad signatureMethod.
     * 
     * @return
     *     possible object is
     *     {@link SignatureMethodType }
     *     
     */
    public SignatureMethodType getSignatureMethod() {
        return signatureMethod;
    }

    /**
     * Define el valor de la propiedad signatureMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureMethodType }
     *     
     */
    public void setSignatureMethod(SignatureMethodType value) {
        this.signatureMethod = value;
    }

    /**
     * Obtiene el valor de la propiedad version.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Define el valor de la propiedad version.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Obtiene el valor de la propiedad nonce.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNonce() {
        return nonce;
    }

    /**
     * Define el valor de la propiedad nonce.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNonce(Boolean value) {
        this.nonce = value;
    }

    /**
     * Obtiene el valor de la propiedad timestamp.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTimestamp() {
        return timestamp;
    }

    /**
     * Define el valor de la propiedad timestamp.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTimestamp(Boolean value) {
        this.timestamp = value;
    }

    /**
     * Obtiene el valor de la propiedad callback.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCallback() {
        return callback;
    }

    /**
     * Define el valor de la propiedad callback.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCallback(Boolean value) {
        this.callback = value;
    }

    /**
     * Obtiene el valor de la propiedad verifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVerifier() {
        return verifier;
    }

    /**
     * Define el valor de la propiedad verifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVerifier(Boolean value) {
        this.verifier = value;
    }

}
