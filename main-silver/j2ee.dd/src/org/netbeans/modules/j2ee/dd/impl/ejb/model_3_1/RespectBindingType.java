/**
 *	This generated bean class RespectBindingType matches the schema element 'respect-bindingType'.
 *  The root bean class is EjbJar
 *
 *	===============================================================
 *	
 *	
 *	        Corresponds to the javax.xml.ws.RespectBinding annotation
 *	        or its corresponding javax.xml.ws.RespectBindingFeature web
 *	        service feature. This is used to control whether a JAX-WS
 *	        implementation must respect/honor the contents of the
 *	        wsdl:binding in the WSDL that is associated with the service.
 *	        
 *	        If the "enabled" element is "true", wsdl:binding in the
 *	        associated WSDL, if any, must be respected/honored.
 *	        
 *	      
 *	===============================================================
 * @Generated
 */

package org.netbeans.modules.j2ee.dd.impl.ejb.model_3_1;

import org.w3c.dom.*;
import org.netbeans.modules.schema2beans.*;
import java.beans.*;
import java.util.*;

// BEGIN_NOI18N

public class RespectBindingType extends org.netbeans.modules.schema2beans.BaseBean
{

	static Vector comparators = new Vector();
	private static final org.netbeans.modules.schema2beans.Version runtimeVersion = new org.netbeans.modules.schema2beans.Version(5, 0, 0);
	;	// NOI18N

	static public final String ENABLED = "Enabled";	// NOI18N

	public RespectBindingType() {
		this(Common.USE_DEFAULT_VALUES);
	}

	public RespectBindingType(int options)
	{
		super(comparators, runtimeVersion);
		// Properties (see root bean comments for the bean graph)
		initPropertyTables(1);
		this.createProperty("enabled", 	// NOI18N
			ENABLED, 
			Common.TYPE_0_1 | Common.TYPE_BOOLEAN | Common.TYPE_SHOULD_NOT_BE_EMPTY | Common.TYPE_KEY, 
			Boolean.class);
		this.initialize(options);
	}

	// Setting the default values of the properties
	void initialize(int options) {

	}

	// This attribute is optional
	public void setEnabled(boolean value) {
		this.setValue(ENABLED, (value ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE));
	}

	//
	public boolean isEnabled() {
		Boolean ret = (Boolean)this.getValue(ENABLED);
		if (ret == null)
			ret = (Boolean)Common.defaultScalarValue(Common.TYPE_BOOLEAN);
		return ((java.lang.Boolean)ret).booleanValue();
	}

	//
	public static void addComparator(org.netbeans.modules.schema2beans.BeanComparator c) {
		comparators.add(c);
	}

	//
	public static void removeComparator(org.netbeans.modules.schema2beans.BeanComparator c) {
		comparators.remove(c);
	}
	public void validate() throws org.netbeans.modules.schema2beans.ValidateException {
		boolean restrictionFailure = false;
		boolean restrictionPassed = false;
		// Validating property enabled
		{
			boolean patternPassed = false;
			if ((isEnabled() ? "true" : "false").matches("(true|false)")) {
				patternPassed = true;
			}
			restrictionFailure = !patternPassed;
		}
		if (restrictionFailure) {
			throw new org.netbeans.modules.schema2beans.ValidateException("isEnabled()", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "enabled", this);	// NOI18N
		}
	}

	// Dump the content of this bean returning it as a String
	public void dump(StringBuffer str, String indent){
		String s;
		Object o;
		org.netbeans.modules.schema2beans.BaseBean n;
		str.append(indent);
		str.append("Enabled");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append((this.isEnabled()?"true":"false"));
		this.dumpAttributes(ENABLED, 0, str, indent);

	}
	public String dumpBeanNode(){
		StringBuffer str = new StringBuffer();
		str.append("RespectBindingType\n");	// NOI18N
		this.dump(str, "\n  ");	// NOI18N
		return str.toString();
	}}

// END_NOI18N

