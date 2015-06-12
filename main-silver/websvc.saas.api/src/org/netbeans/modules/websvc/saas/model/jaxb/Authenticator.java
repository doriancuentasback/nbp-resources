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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Authenticator complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Authenticator">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="use-templates" type="{http://xml.netbeans.org/websvc/saas/services/1.0}UseTemplates" minOccurs="0"/>
 *         &lt;element name="use-generator" type="{http://xml.netbeans.org/websvc/saas/services/1.0}UseGenerator" minOccurs="0"/>
 *       &lt;/choice>
 *       &lt;attribute name="xref" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Authenticator", propOrder = {
    "useTemplates",
    "useGenerator"
})
@XmlSeeAlso({
    org.netbeans.modules.websvc.saas.model.jaxb.SaasMetadata.Authentication.Authenticator.class
})
public class Authenticator {

    @XmlElement(name = "use-templates")
    protected UseTemplates useTemplates;
    @XmlElement(name = "use-generator")
    protected UseGenerator useGenerator;
    @XmlAttribute(name = "xref")
    protected String xref;

    /**
     * Obtiene el valor de la propiedad useTemplates.
     * 
     * @return
     *     possible object is
     *     {@link UseTemplates }
     *     
     */
    public UseTemplates getUseTemplates() {
        return useTemplates;
    }

    /**
     * Define el valor de la propiedad useTemplates.
     * 
     * @param value
     *     allowed object is
     *     {@link UseTemplates }
     *     
     */
    public void setUseTemplates(UseTemplates value) {
        this.useTemplates = value;
    }

    /**
     * Obtiene el valor de la propiedad useGenerator.
     * 
     * @return
     *     possible object is
     *     {@link UseGenerator }
     *     
     */
    public UseGenerator getUseGenerator() {
        return useGenerator;
    }

    /**
     * Define el valor de la propiedad useGenerator.
     * 
     * @param value
     *     allowed object is
     *     {@link UseGenerator }
     *     
     */
    public void setUseGenerator(UseGenerator value) {
        this.useGenerator = value;
    }

    /**
     * Obtiene el valor de la propiedad xref.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXref() {
        return xref;
    }

    /**
     * Define el valor de la propiedad xref.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXref(String value) {
        this.xref = value;
    }

}
