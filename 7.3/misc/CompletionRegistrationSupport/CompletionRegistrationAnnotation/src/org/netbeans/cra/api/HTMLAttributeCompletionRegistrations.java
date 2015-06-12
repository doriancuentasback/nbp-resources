package org.netbeans.cra.api;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.PACKAGE)
public @interface HTMLAttributeCompletionRegistrations {
    HTMLAttributeCompletionRegistration[] value();
}
