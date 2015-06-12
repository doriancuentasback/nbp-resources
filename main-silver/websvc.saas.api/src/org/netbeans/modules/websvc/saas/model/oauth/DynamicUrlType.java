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
 *             specifies dynamic-url of authorization page,
 *             obtained during request-token step - as auth-param-name
 *           
 * 
 * <p>Clase Java para dynamic-urlType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="dynamic-urlType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="auth-param-name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dynamic-urlType")
public class DynamicUrlType {

    @XmlAttribute(name = "auth-param-name", required = true)
    protected String authParamName;

    /**
     * Obtiene el valor de la propiedad authParamName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthParamName() {
        return authParamName;
    }

    /**
     * Define el valor de la propiedad authParamName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthParamName(String value) {
        this.authParamName = value;
    }

}
