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
 * <p>Clase Java para UseGenerator complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="UseGenerator">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="login" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="sign" type="{http://xml.netbeans.org/websvc/saas/services/1.0}Sign" minOccurs="0"/>
 *                   &lt;element name="method" type="{http://xml.netbeans.org/websvc/saas/services/1.0}Method"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="token" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="sign" type="{http://xml.netbeans.org/websvc/saas/services/1.0}Sign" minOccurs="0"/>
 *                   &lt;element name="method" type="{http://xml.netbeans.org/websvc/saas/services/1.0}Method"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="logout" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="sign" type="{http://xml.netbeans.org/websvc/saas/services/1.0}Sign" minOccurs="0"/>
 *                   &lt;element name="method" type="{http://xml.netbeans.org/websvc/saas/services/1.0}Method"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UseGenerator", propOrder = {
    "login",
    "token",
    "logout"
})
public class UseGenerator {

    protected UseGenerator.Login login;
    protected UseGenerator.Token token;
    protected UseGenerator.Logout logout;

    /**
     * Obtiene el valor de la propiedad login.
     * 
     * @return
     *     possible object is
     *     {@link UseGenerator.Login }
     *     
     */
    public UseGenerator.Login getLogin() {
        return login;
    }

    /**
     * Define el valor de la propiedad login.
     * 
     * @param value
     *     allowed object is
     *     {@link UseGenerator.Login }
     *     
     */
    public void setLogin(UseGenerator.Login value) {
        this.login = value;
    }

    /**
     * Obtiene el valor de la propiedad token.
     * 
     * @return
     *     possible object is
     *     {@link UseGenerator.Token }
     *     
     */
    public UseGenerator.Token getToken() {
        return token;
    }

    /**
     * Define el valor de la propiedad token.
     * 
     * @param value
     *     allowed object is
     *     {@link UseGenerator.Token }
     *     
     */
    public void setToken(UseGenerator.Token value) {
        this.token = value;
    }

    /**
     * Obtiene el valor de la propiedad logout.
     * 
     * @return
     *     possible object is
     *     {@link UseGenerator.Logout }
     *     
     */
    public UseGenerator.Logout getLogout() {
        return logout;
    }

    /**
     * Define el valor de la propiedad logout.
     * 
     * @param value
     *     allowed object is
     *     {@link UseGenerator.Logout }
     *     
     */
    public void setLogout(UseGenerator.Logout value) {
        this.logout = value;
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
     *         &lt;element name="sign" type="{http://xml.netbeans.org/websvc/saas/services/1.0}Sign" minOccurs="0"/>
     *         &lt;element name="method" type="{http://xml.netbeans.org/websvc/saas/services/1.0}Method"/>
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
        "sign",
        "method"
    })
    public static class Login {

        protected Sign sign;
        @XmlElement(required = true)
        protected Method method;

        /**
         * Obtiene el valor de la propiedad sign.
         * 
         * @return
         *     possible object is
         *     {@link Sign }
         *     
         */
        public Sign getSign() {
            return sign;
        }

        /**
         * Define el valor de la propiedad sign.
         * 
         * @param value
         *     allowed object is
         *     {@link Sign }
         *     
         */
        public void setSign(Sign value) {
            this.sign = value;
        }

        /**
         * Obtiene el valor de la propiedad method.
         * 
         * @return
         *     possible object is
         *     {@link Method }
         *     
         */
        public Method getMethod() {
            return method;
        }

        /**
         * Define el valor de la propiedad method.
         * 
         * @param value
         *     allowed object is
         *     {@link Method }
         *     
         */
        public void setMethod(Method value) {
            this.method = value;
        }

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
     *         &lt;element name="sign" type="{http://xml.netbeans.org/websvc/saas/services/1.0}Sign" minOccurs="0"/>
     *         &lt;element name="method" type="{http://xml.netbeans.org/websvc/saas/services/1.0}Method"/>
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
        "sign",
        "method"
    })
    public static class Logout {

        protected Sign sign;
        @XmlElement(required = true)
        protected Method method;

        /**
         * Obtiene el valor de la propiedad sign.
         * 
         * @return
         *     possible object is
         *     {@link Sign }
         *     
         */
        public Sign getSign() {
            return sign;
        }

        /**
         * Define el valor de la propiedad sign.
         * 
         * @param value
         *     allowed object is
         *     {@link Sign }
         *     
         */
        public void setSign(Sign value) {
            this.sign = value;
        }

        /**
         * Obtiene el valor de la propiedad method.
         * 
         * @return
         *     possible object is
         *     {@link Method }
         *     
         */
        public Method getMethod() {
            return method;
        }

        /**
         * Define el valor de la propiedad method.
         * 
         * @param value
         *     allowed object is
         *     {@link Method }
         *     
         */
        public void setMethod(Method value) {
            this.method = value;
        }

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
     *         &lt;element name="sign" type="{http://xml.netbeans.org/websvc/saas/services/1.0}Sign" minOccurs="0"/>
     *         &lt;element name="method" type="{http://xml.netbeans.org/websvc/saas/services/1.0}Method"/>
     *       &lt;/sequence>
     *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "sign",
        "method"
    })
    public static class Token {

        protected Sign sign;
        @XmlElement(required = true)
        protected Method method;
        @XmlAttribute(name = "id", required = true)
        protected String id;

        /**
         * Obtiene el valor de la propiedad sign.
         * 
         * @return
         *     possible object is
         *     {@link Sign }
         *     
         */
        public Sign getSign() {
            return sign;
        }

        /**
         * Define el valor de la propiedad sign.
         * 
         * @param value
         *     allowed object is
         *     {@link Sign }
         *     
         */
        public void setSign(Sign value) {
            this.sign = value;
        }

        /**
         * Obtiene el valor de la propiedad method.
         * 
         * @return
         *     possible object is
         *     {@link Method }
         *     
         */
        public Method getMethod() {
            return method;
        }

        /**
         * Define el valor de la propiedad method.
         * 
         * @param value
         *     allowed object is
         *     {@link Method }
         *     
         */
        public void setMethod(Method value) {
            this.method = value;
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

    }

}
