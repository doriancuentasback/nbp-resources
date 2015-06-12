//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.06.11 a las 03:16:55 PM COT 
//


package org.netbeans.modules.websvc.saas.model.oauth;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.netbeans.modules.websvc.saas.model.oauth package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Metadata_QNAME = new QName("http://netbeans.org/ns/oauth/metadata/1", "metadata");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.netbeans.modules.websvc.saas.model.oauth
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Metadata }
     * 
     */
    public Metadata createMetadata() {
        return new Metadata();
    }

    /**
     * Create an instance of {@link FlowType }
     * 
     */
    public FlowType createFlowType() {
        return new FlowType();
    }

    /**
     * Create an instance of {@link MethodType }
     * 
     */
    public MethodType createMethodType() {
        return new MethodType();
    }

    /**
     * Create an instance of {@link FixedUrlType }
     * 
     */
    public FixedUrlType createFixedUrlType() {
        return new FixedUrlType();
    }

    /**
     * Create an instance of {@link AuthorizationType }
     * 
     */
    public AuthorizationType createAuthorizationType() {
        return new AuthorizationType();
    }

    /**
     * Create an instance of {@link DynamicUrlType }
     * 
     */
    public DynamicUrlType createDynamicUrlType() {
        return new DynamicUrlType();
    }

    /**
     * Create an instance of {@link ParamType }
     * 
     */
    public ParamType createParamType() {
        return new ParamType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Metadata }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://netbeans.org/ns/oauth/metadata/1", name = "metadata")
    public JAXBElement<Metadata> createMetadata(Metadata value) {
        return new JAXBElement<Metadata>(_Metadata_QNAME, Metadata.class, null, value);
    }

}
