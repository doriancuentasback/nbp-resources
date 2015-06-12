//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.06.11 a las 03:16:55 PM COT 
//


package org.netbeans.modules.websvc.saas.model.oauth;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             specifies 3 phases of OAuth authentication mechanism:
 *             1. obtaining request-token,
 *             2. consumer authorization and getting access-token
 *             3. obtaining access-token
 *           
 * 
 * <p>Clase Java para flowType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="flowType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="request-token" type="{http://netbeans.org/ns/oauth/metadata/1}methodType"/>
 *         &lt;element name="authorization" type="{http://netbeans.org/ns/oauth/metadata/1}authorizationType"/>
 *         &lt;element name="access-token" type="{http://netbeans.org/ns/oauth/metadata/1}methodType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "flowType", propOrder = {
    "requestToken",
    "authorization",
    "accessToken"
})
public class FlowType {

    @XmlElement(name = "request-token", required = true)
    protected MethodType requestToken;
    @XmlElement(required = true)
    protected AuthorizationType authorization;
    @XmlElement(name = "access-token", required = true)
    protected MethodType accessToken;

    /**
     * Obtiene el valor de la propiedad requestToken.
     * 
     * @return
     *     possible object is
     *     {@link MethodType }
     *     
     */
    public MethodType getRequestToken() {
        return requestToken;
    }

    /**
     * Define el valor de la propiedad requestToken.
     * 
     * @param value
     *     allowed object is
     *     {@link MethodType }
     *     
     */
    public void setRequestToken(MethodType value) {
        this.requestToken = value;
    }

    /**
     * Obtiene el valor de la propiedad authorization.
     * 
     * @return
     *     possible object is
     *     {@link AuthorizationType }
     *     
     */
    public AuthorizationType getAuthorization() {
        return authorization;
    }

    /**
     * Define el valor de la propiedad authorization.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorizationType }
     *     
     */
    public void setAuthorization(AuthorizationType value) {
        this.authorization = value;
    }

    /**
     * Obtiene el valor de la propiedad accessToken.
     * 
     * @return
     *     possible object is
     *     {@link MethodType }
     *     
     */
    public MethodType getAccessToken() {
        return accessToken;
    }

    /**
     * Define el valor de la propiedad accessToken.
     * 
     * @param value
     *     allowed object is
     *     {@link MethodType }
     *     
     */
    public void setAccessToken(MethodType value) {
        this.accessToken = value;
    }

}
