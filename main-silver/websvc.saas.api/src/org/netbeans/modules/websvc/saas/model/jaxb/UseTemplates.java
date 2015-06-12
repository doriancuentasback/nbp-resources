//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.06.11 a las 03:16:53 PM COT 
//


package org.netbeans.modules.websvc.saas.model.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para UseTemplates complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="UseTemplates">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="desktop" type="{http://xml.netbeans.org/websvc/saas/services/1.0}TemplateType" minOccurs="0"/>
 *         &lt;element name="nb-module" type="{http://xml.netbeans.org/websvc/saas/services/1.0}TemplateType" minOccurs="0"/>
 *         &lt;element name="web" type="{http://xml.netbeans.org/websvc/saas/services/1.0}TemplateType" minOccurs="0"/>
 *         &lt;element name="web-ee7" type="{http://xml.netbeans.org/websvc/saas/services/1.0}TemplateType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UseTemplates", propOrder = {
    "desktop",
    "nbModule",
    "web",
    "webEe7"
})
public class UseTemplates {

    protected TemplateType desktop;
    @XmlElement(name = "nb-module")
    protected TemplateType nbModule;
    protected TemplateType web;
    @XmlElement(name = "web-ee7")
    protected TemplateType webEe7;

    /**
     * Obtiene el valor de la propiedad desktop.
     * 
     * @return
     *     possible object is
     *     {@link TemplateType }
     *     
     */
    public TemplateType getDesktop() {
        return desktop;
    }

    /**
     * Define el valor de la propiedad desktop.
     * 
     * @param value
     *     allowed object is
     *     {@link TemplateType }
     *     
     */
    public void setDesktop(TemplateType value) {
        this.desktop = value;
    }

    /**
     * Obtiene el valor de la propiedad nbModule.
     * 
     * @return
     *     possible object is
     *     {@link TemplateType }
     *     
     */
    public TemplateType getNbModule() {
        return nbModule;
    }

    /**
     * Define el valor de la propiedad nbModule.
     * 
     * @param value
     *     allowed object is
     *     {@link TemplateType }
     *     
     */
    public void setNbModule(TemplateType value) {
        this.nbModule = value;
    }

    /**
     * Obtiene el valor de la propiedad web.
     * 
     * @return
     *     possible object is
     *     {@link TemplateType }
     *     
     */
    public TemplateType getWeb() {
        return web;
    }

    /**
     * Define el valor de la propiedad web.
     * 
     * @param value
     *     allowed object is
     *     {@link TemplateType }
     *     
     */
    public void setWeb(TemplateType value) {
        this.web = value;
    }

    /**
     * Obtiene el valor de la propiedad webEe7.
     * 
     * @return
     *     possible object is
     *     {@link TemplateType }
     *     
     */
    public TemplateType getWebEe7() {
        return webEe7;
    }

    /**
     * Define el valor de la propiedad webEe7.
     * 
     * @param value
     *     allowed object is
     *     {@link TemplateType }
     *     
     */
    public void setWebEe7(TemplateType value) {
        this.webEe7 = value;
    }

}
