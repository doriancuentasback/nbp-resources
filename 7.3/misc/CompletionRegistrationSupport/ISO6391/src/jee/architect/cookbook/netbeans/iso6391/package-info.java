@HTMLAttributeCompletionRegistrations({
    /**
     * This attribute specifies that the "lang" attribute will
     * have code completion defined by attributes "content" and "iconBase",
     * by specifying "csv" contentType, the "content" will be treated as a CSV file:
     */
    @HTMLAttributeCompletionRegistration(
        id = "jee-architect-cookbook-netbeans-iso6391-LanguageAttributeCompletionProvider",
        attribute = "lang",
        iconBase = "jee/architect/cookbook/netbeans/iso6391/bubble.png",
        content = "jee/architect/cookbook/netbeans/iso6391/ISO6391.csv",
        contentType="csv"),
    /**
     * This attribute specifies that the "country" attribute will
     * have code completion defined by attributes "content" and "iconBase",
     * by specifying "json" contentType, the "content" will be treated as an online URL to JSON:
     * http://api.worldbank.org/country?format=json
     */
    @HTMLAttributeCompletionRegistration(
        id = "jee-architect-cookbook-netbeans-iso6391-CountriesAttributeCompletionProvider",
        attribute = "accesskey",
        iconBase = "jee/architect/cookbook/netbeans/iso6391/bubble.png",
        content = "http://api.worldbank.org/country?format=json",
        contentType="json"),
    /**
     * This attribute specifies that the "bla" attribute will
     * have code completion defined by attributes "content" and "iconBase",
     * by specifying "basic" contentType, the "content" will be treated as a list:
     */
    @HTMLAttributeCompletionRegistration(
        id = "jee-architect-cookbook-netbeans-iso6391-BlaAttributeCompletionProvider",
        attribute = "bla",
        iconBase = "jee/architect/cookbook/netbeans/iso6391/bubble.png",
        content = "tom,dick,harry",
        contentType="basic")
})
package jee.architect.cookbook.netbeans.iso6391;

import org.netbeans.cra.api.HTMLAttributeCompletionRegistration;
import org.netbeans.cra.api.HTMLAttributeCompletionRegistrations;
