/**
 *	This generated bean class AddressingType matches the schema element 'addressingType'.
 *  The root bean class is EjbJar
 *
 *	===============================================================
 *	
 *	
 *	        This specifies the WS-Addressing requirements for a JAX-WS web service.
 *	        It corresponds to javax.xml.ws.soap.Addressing annotation or its
 *	        feature javax.xml.ws.soap.AddressingFeature.
 *	        
 *	        If the "enabled" element is "true", WS-Addressing is enabled.
 *	        It means that the endpoint supports WS-Addressing but does not require
 *	        its use. The default value for "enabled" is "true".
 *	        
 *	        If the WS-Addressing is enabled and the "required" element is "true",
 *	        it means that the endpoint requires WS-Addressing. The default value
 *	        for "required" is "false".
 *	        
 *	        If WS-Addressing is enabled, the "responses" element determines
 *	        if an endpoint requires the use of only anonymous responses,
 *	        or only non-anonymous responses, or all. The value of the "responses"
 *	        element must be one of the following:
 *	        
 *	        ANONYMOUS
 *	        NON_ANONYMOUS
 *	        ALL
 *	        
 *	        The default value for the "responses" is ALL.
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

public class AddressingType extends org.netbeans.modules.schema2beans.BaseBean
{

	static Vector comparators = new Vector();
	private static final org.netbeans.modules.schema2beans.Version runtimeVersion = new org.netbeans.modules.schema2beans.Version(5, 0, 0);
	;	// NOI18N

	static public final String ENABLED = "Enabled";	// NOI18N
	static public final String REQUIRED = "Required";	// NOI18N
	static public final String RESPONSES = "Responses";	// NOI18N

	public AddressingType() {
		this(Common.USE_DEFAULT_VALUES);
	}

	public AddressingType(int options)
	{
		super(comparators, runtimeVersion);
		// Properties (see root bean comments for the bean graph)
		initPropertyTables(3);
		this.createProperty("enabled", 	// NOI18N
			ENABLED, 
			Common.TYPE_0_1 | Common.TYPE_BOOLEAN | Common.TYPE_SHOULD_NOT_BE_EMPTY | Common.TYPE_KEY, 
			Boolean.class);
		this.createProperty("required", 	// NOI18N
			REQUIRED, 
			Common.TYPE_0_1 | Common.TYPE_BOOLEAN | Common.TYPE_SHOULD_NOT_BE_EMPTY | Common.TYPE_KEY, 
			Boolean.class);
		this.createProperty("responses", 	// NOI18N
			RESPONSES, 
			Common.TYPE_0_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
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

	// This attribute is optional
	public void setRequired(boolean value) {
		this.setValue(REQUIRED, (value ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE));
	}

	//
	public boolean isRequired() {
		Boolean ret = (Boolean)this.getValue(REQUIRED);
		if (ret == null)
			ret = (Boolean)Common.defaultScalarValue(Common.TYPE_BOOLEAN);
		return ((java.lang.Boolean)ret).booleanValue();
	}

	// This attribute is optional
	public void setResponses(java.lang.String value) {
		this.setValue(RESPONSES, value);
	}

	//
	public java.lang.String getResponses() {
		return (java.lang.String)this.getValue(RESPONSES);
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
		// Validating property required
		{
			boolean patternPassed = false;
			if ((isRequired() ? "true" : "false").matches("(true|false)")) {
				patternPassed = true;
			}
			restrictionFailure = !patternPassed;
		}
		if (restrictionFailure) {
			throw new org.netbeans.modules.schema2beans.ValidateException("isRequired()", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "required", this);	// NOI18N
		}
		// Validating property responses
		if (getResponses() != null) {
			final java.lang.String[] enumRestrictionResponses = {"ANONYMOUS", "NON_ANONYMOUS", "ALL"};
			restrictionFailure = true;
			for (int _index2 = 0; 
				_index2 < enumRestrictionResponses.length; ++_index2) {
				if (enumRestrictionResponses[_index2].equals(getResponses())) {
					restrictionFailure = false;
					break;
				}
			}
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getResponses() enumeration test", org.netbeans.modules.schema2beans.ValidateException.FailureType.ENUM_RESTRICTION, "responses", this);	// NOI18N
			}
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

		str.append(indent);
		str.append("Required");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append((this.isRequired()?"true":"false"));
		this.dumpAttributes(REQUIRED, 0, str, indent);

		str.append(indent);
		str.append("Responses");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getResponses();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(RESPONSES, 0, str, indent);

	}
	public String dumpBeanNode(){
		StringBuffer str = new StringBuffer();
		str.append("AddressingType\n");	// NOI18N
		this.dump(str, "\n  ");	// NOI18N
		return str.toString();
	}}

// END_NOI18N

