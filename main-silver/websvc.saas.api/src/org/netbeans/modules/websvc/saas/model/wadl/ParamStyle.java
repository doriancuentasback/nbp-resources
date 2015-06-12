//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.06.11 a las 03:16:54 PM COT 
//


package org.netbeans.modules.websvc.saas.model.wadl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ParamStyle.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="ParamStyle">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="plain"/>
 *     &lt;enumeration value="query"/>
 *     &lt;enumeration value="matrix"/>
 *     &lt;enumeration value="header"/>
 *     &lt;enumeration value="template"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ParamStyle")
@XmlEnum
public enum ParamStyle {

    @XmlEnumValue("plain")
    PLAIN("plain"),
    @XmlEnumValue("query")
    QUERY("query"),
    @XmlEnumValue("matrix")
    MATRIX("matrix"),
    @XmlEnumValue("header")
    HEADER("header"),
    @XmlEnumValue("template")
    TEMPLATE("template");
    private final String value;

    ParamStyle(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ParamStyle fromValue(String v) {
        for (ParamStyle c: ParamStyle.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
