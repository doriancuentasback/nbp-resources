//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.06.11 a las 03:16:53 PM COT 
//


package org.netbeans.modules.websvc.saas.model.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SaasMetadata complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SaasMetadata">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="localizing-bundle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://xml.netbeans.org/websvc/saas/services/1.0}group"/>
 *         &lt;element name="code-gen" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="artifacts" type="{http://xml.netbeans.org/websvc/saas/services/1.0}Artifacts" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="packageName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="authentication" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="authenticator" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://xml.netbeans.org/websvc/saas/services/1.0}Authenticator">
 *                           &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;choice>
 *                     &lt;element name="http-basic">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="authenticator" type="{http://xml.netbeans.org/websvc/saas/services/1.0}Authenticator"/>
 *                             &lt;/sequence>
 *                             &lt;attribute name="username" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                             &lt;attribute name="password" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="api-key">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="signed-url" maxOccurs="unbounded" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="sign" type="{http://xml.netbeans.org/websvc/saas/services/1.0}Sign" minOccurs="0"/>
 *                               &lt;element name="authenticator" type="{http://xml.netbeans.org/websvc/saas/services/1.0}Authenticator" minOccurs="0"/>
 *                             &lt;/sequence>
 *                             &lt;attribute name="sig-id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                             &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="session-key" maxOccurs="unbounded" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="sign" type="{http://xml.netbeans.org/websvc/saas/services/1.0}Sign"/>
 *                               &lt;element name="authenticator" type="{http://xml.netbeans.org/websvc/saas/services/1.0}Authenticator"/>
 *                             &lt;/sequence>
 *                             &lt;attribute name="session-id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                             &lt;attribute name="api-id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                             &lt;attribute name="sig-id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                             &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="custom" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                   &lt;/choice>
 *                 &lt;/sequence>
 *                 &lt;attribute name="profile" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "SaasMetadata", propOrder = {
    "localizingBundle",
    "group",
    "codeGen",
    "authentication"
})
public class SaasMetadata {

    @XmlElement(name = "localizing-bundle")
    protected String localizingBundle;
    @XmlElement(required = true)
    protected Group group;
    @XmlElement(name = "code-gen")
    protected SaasMetadata.CodeGen codeGen;
    protected SaasMetadata.Authentication authentication;

    /**
     * Obtiene el valor de la propiedad localizingBundle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalizingBundle() {
        return localizingBundle;
    }

    /**
     * Define el valor de la propiedad localizingBundle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalizingBundle(String value) {
        this.localizingBundle = value;
    }

    /**
     * Obtiene el valor de la propiedad group.
     * 
     * @return
     *     possible object is
     *     {@link Group }
     *     
     */
    public Group getGroup() {
        return group;
    }

    /**
     * Define el valor de la propiedad group.
     * 
     * @param value
     *     allowed object is
     *     {@link Group }
     *     
     */
    public void setGroup(Group value) {
        this.group = value;
    }

    /**
     * Obtiene el valor de la propiedad codeGen.
     * 
     * @return
     *     possible object is
     *     {@link SaasMetadata.CodeGen }
     *     
     */
    public SaasMetadata.CodeGen getCodeGen() {
        return codeGen;
    }

    /**
     * Define el valor de la propiedad codeGen.
     * 
     * @param value
     *     allowed object is
     *     {@link SaasMetadata.CodeGen }
     *     
     */
    public void setCodeGen(SaasMetadata.CodeGen value) {
        this.codeGen = value;
    }

    /**
     * Obtiene el valor de la propiedad authentication.
     * 
     * @return
     *     possible object is
     *     {@link SaasMetadata.Authentication }
     *     
     */
    public SaasMetadata.Authentication getAuthentication() {
        return authentication;
    }

    /**
     * Define el valor de la propiedad authentication.
     * 
     * @param value
     *     allowed object is
     *     {@link SaasMetadata.Authentication }
     *     
     */
    public void setAuthentication(SaasMetadata.Authentication value) {
        this.authentication = value;
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
     *         &lt;element name="authenticator" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://xml.netbeans.org/websvc/saas/services/1.0}Authenticator">
     *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;choice>
     *           &lt;element name="http-basic">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;element name="authenticator" type="{http://xml.netbeans.org/websvc/saas/services/1.0}Authenticator"/>
     *                   &lt;/sequence>
     *                   &lt;attribute name="username" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                   &lt;attribute name="password" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="api-key">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="signed-url" maxOccurs="unbounded" minOccurs="0">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;element name="sign" type="{http://xml.netbeans.org/websvc/saas/services/1.0}Sign" minOccurs="0"/>
     *                     &lt;element name="authenticator" type="{http://xml.netbeans.org/websvc/saas/services/1.0}Authenticator" minOccurs="0"/>
     *                   &lt;/sequence>
     *                   &lt;attribute name="sig-id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                   &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="session-key" maxOccurs="unbounded" minOccurs="0">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;element name="sign" type="{http://xml.netbeans.org/websvc/saas/services/1.0}Sign"/>
     *                     &lt;element name="authenticator" type="{http://xml.netbeans.org/websvc/saas/services/1.0}Authenticator"/>
     *                   &lt;/sequence>
     *                   &lt;attribute name="session-id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                   &lt;attribute name="api-id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                   &lt;attribute name="sig-id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                   &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="custom" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *         &lt;/choice>
     *       &lt;/sequence>
     *       &lt;attribute name="profile" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "authenticator",
        "httpBasic",
        "apiKey",
        "signedUrl",
        "sessionKey",
        "custom"
    })
    public static class Authentication {

        protected List<SaasMetadata.Authentication.Authenticator> authenticator;
        @XmlElement(name = "http-basic")
        protected SaasMetadata.Authentication.HttpBasic httpBasic;
        @XmlElement(name = "api-key")
        protected SaasMetadata.Authentication.ApiKey apiKey;
        @XmlElement(name = "signed-url")
        protected List<SaasMetadata.Authentication.SignedUrl> signedUrl;
        @XmlElement(name = "session-key")
        protected List<SaasMetadata.Authentication.SessionKey> sessionKey;
        protected Object custom;
        @XmlAttribute(name = "profile")
        protected String profile;

        /**
         * Gets the value of the authenticator property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the authenticator property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAuthenticator().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SaasMetadata.Authentication.Authenticator }
         * 
         * 
         */
        public List<SaasMetadata.Authentication.Authenticator> getAuthenticator() {
            if (authenticator == null) {
                authenticator = new ArrayList<SaasMetadata.Authentication.Authenticator>();
            }
            return this.authenticator;
        }

        /**
         * Obtiene el valor de la propiedad httpBasic.
         * 
         * @return
         *     possible object is
         *     {@link SaasMetadata.Authentication.HttpBasic }
         *     
         */
        public SaasMetadata.Authentication.HttpBasic getHttpBasic() {
            return httpBasic;
        }

        /**
         * Define el valor de la propiedad httpBasic.
         * 
         * @param value
         *     allowed object is
         *     {@link SaasMetadata.Authentication.HttpBasic }
         *     
         */
        public void setHttpBasic(SaasMetadata.Authentication.HttpBasic value) {
            this.httpBasic = value;
        }

        /**
         * Obtiene el valor de la propiedad apiKey.
         * 
         * @return
         *     possible object is
         *     {@link SaasMetadata.Authentication.ApiKey }
         *     
         */
        public SaasMetadata.Authentication.ApiKey getApiKey() {
            return apiKey;
        }

        /**
         * Define el valor de la propiedad apiKey.
         * 
         * @param value
         *     allowed object is
         *     {@link SaasMetadata.Authentication.ApiKey }
         *     
         */
        public void setApiKey(SaasMetadata.Authentication.ApiKey value) {
            this.apiKey = value;
        }

        /**
         * Gets the value of the signedUrl property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the signedUrl property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSignedUrl().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SaasMetadata.Authentication.SignedUrl }
         * 
         * 
         */
        public List<SaasMetadata.Authentication.SignedUrl> getSignedUrl() {
            if (signedUrl == null) {
                signedUrl = new ArrayList<SaasMetadata.Authentication.SignedUrl>();
            }
            return this.signedUrl;
        }

        /**
         * Gets the value of the sessionKey property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the sessionKey property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSessionKey().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SaasMetadata.Authentication.SessionKey }
         * 
         * 
         */
        public List<SaasMetadata.Authentication.SessionKey> getSessionKey() {
            if (sessionKey == null) {
                sessionKey = new ArrayList<SaasMetadata.Authentication.SessionKey>();
            }
            return this.sessionKey;
        }

        /**
         * Obtiene el valor de la propiedad custom.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getCustom() {
            return custom;
        }

        /**
         * Define el valor de la propiedad custom.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setCustom(Object value) {
            this.custom = value;
        }

        /**
         * Obtiene el valor de la propiedad profile.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProfile() {
            return profile;
        }

        /**
         * Define el valor de la propiedad profile.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProfile(String value) {
            this.profile = value;
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
         *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ApiKey {

            @XmlAttribute(name = "id")
            protected String id;

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


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://xml.netbeans.org/websvc/saas/services/1.0}Authenticator">
         *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Authenticator
            extends org.netbeans.modules.websvc.saas.model.jaxb.Authenticator
        {

            @XmlAttribute(name = "name", required = true)
            protected String name;

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
         *         &lt;element name="authenticator" type="{http://xml.netbeans.org/websvc/saas/services/1.0}Authenticator"/>
         *       &lt;/sequence>
         *       &lt;attribute name="username" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="password" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "authenticator"
        })
        public static class HttpBasic {

            @XmlElement(required = true)
            protected org.netbeans.modules.websvc.saas.model.jaxb.Authenticator authenticator;
            @XmlAttribute(name = "username", required = true)
            protected String username;
            @XmlAttribute(name = "password", required = true)
            protected String password;

            /**
             * Obtiene el valor de la propiedad authenticator.
             * 
             * @return
             *     possible object is
             *     {@link org.netbeans.modules.websvc.saas.model.jaxb.Authenticator }
             *     
             */
            public org.netbeans.modules.websvc.saas.model.jaxb.Authenticator getAuthenticator() {
                return authenticator;
            }

            /**
             * Define el valor de la propiedad authenticator.
             * 
             * @param value
             *     allowed object is
             *     {@link org.netbeans.modules.websvc.saas.model.jaxb.Authenticator }
             *     
             */
            public void setAuthenticator(org.netbeans.modules.websvc.saas.model.jaxb.Authenticator value) {
                this.authenticator = value;
            }

            /**
             * Obtiene el valor de la propiedad username.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUsername() {
                return username;
            }

            /**
             * Define el valor de la propiedad username.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUsername(String value) {
                this.username = value;
            }

            /**
             * Obtiene el valor de la propiedad password.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPassword() {
                return password;
            }

            /**
             * Define el valor de la propiedad password.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPassword(String value) {
                this.password = value;
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
         *         &lt;element name="sign" type="{http://xml.netbeans.org/websvc/saas/services/1.0}Sign"/>
         *         &lt;element name="authenticator" type="{http://xml.netbeans.org/websvc/saas/services/1.0}Authenticator"/>
         *       &lt;/sequence>
         *       &lt;attribute name="session-id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="api-id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="sig-id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
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
            "authenticator"
        })
        public static class SessionKey {

            @XmlElement(required = true)
            protected Sign sign;
            @XmlElement(required = true)
            protected org.netbeans.modules.websvc.saas.model.jaxb.Authenticator authenticator;
            @XmlAttribute(name = "session-id", required = true)
            protected String sessionId;
            @XmlAttribute(name = "api-id", required = true)
            protected String apiId;
            @XmlAttribute(name = "sig-id", required = true)
            protected String sigId;
            @XmlAttribute(name = "id")
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
             * Obtiene el valor de la propiedad authenticator.
             * 
             * @return
             *     possible object is
             *     {@link org.netbeans.modules.websvc.saas.model.jaxb.Authenticator }
             *     
             */
            public org.netbeans.modules.websvc.saas.model.jaxb.Authenticator getAuthenticator() {
                return authenticator;
            }

            /**
             * Define el valor de la propiedad authenticator.
             * 
             * @param value
             *     allowed object is
             *     {@link org.netbeans.modules.websvc.saas.model.jaxb.Authenticator }
             *     
             */
            public void setAuthenticator(org.netbeans.modules.websvc.saas.model.jaxb.Authenticator value) {
                this.authenticator = value;
            }

            /**
             * Obtiene el valor de la propiedad sessionId.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSessionId() {
                return sessionId;
            }

            /**
             * Define el valor de la propiedad sessionId.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSessionId(String value) {
                this.sessionId = value;
            }

            /**
             * Obtiene el valor de la propiedad apiId.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getApiId() {
                return apiId;
            }

            /**
             * Define el valor de la propiedad apiId.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setApiId(String value) {
                this.apiId = value;
            }

            /**
             * Obtiene el valor de la propiedad sigId.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSigId() {
                return sigId;
            }

            /**
             * Define el valor de la propiedad sigId.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSigId(String value) {
                this.sigId = value;
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
         *         &lt;element name="authenticator" type="{http://xml.netbeans.org/websvc/saas/services/1.0}Authenticator" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="sig-id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
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
            "authenticator"
        })
        public static class SignedUrl {

            protected Sign sign;
            protected org.netbeans.modules.websvc.saas.model.jaxb.Authenticator authenticator;
            @XmlAttribute(name = "sig-id", required = true)
            protected String sigId;
            @XmlAttribute(name = "id")
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
             * Obtiene el valor de la propiedad authenticator.
             * 
             * @return
             *     possible object is
             *     {@link org.netbeans.modules.websvc.saas.model.jaxb.Authenticator }
             *     
             */
            public org.netbeans.modules.websvc.saas.model.jaxb.Authenticator getAuthenticator() {
                return authenticator;
            }

            /**
             * Define el valor de la propiedad authenticator.
             * 
             * @param value
             *     allowed object is
             *     {@link org.netbeans.modules.websvc.saas.model.jaxb.Authenticator }
             *     
             */
            public void setAuthenticator(org.netbeans.modules.websvc.saas.model.jaxb.Authenticator value) {
                this.authenticator = value;
            }

            /**
             * Obtiene el valor de la propiedad sigId.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSigId() {
                return sigId;
            }

            /**
             * Define el valor de la propiedad sigId.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSigId(String value) {
                this.sigId = value;
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
     *         &lt;element name="artifacts" type="{http://xml.netbeans.org/websvc/saas/services/1.0}Artifacts" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="packageName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "artifacts"
    })
    public static class CodeGen {

        protected List<Artifacts> artifacts;
        @XmlAttribute(name = "packageName")
        protected String packageName;

        /**
         * Gets the value of the artifacts property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the artifacts property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getArtifacts().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Artifacts }
         * 
         * 
         */
        public List<Artifacts> getArtifacts() {
            if (artifacts == null) {
                artifacts = new ArrayList<Artifacts>();
            }
            return this.artifacts;
        }

        /**
         * Obtiene el valor de la propiedad packageName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPackageName() {
            return packageName;
        }

        /**
         * Define el valor de la propiedad packageName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPackageName(String value) {
            this.packageName = value;
        }

    }

}
