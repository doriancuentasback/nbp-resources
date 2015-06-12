/**
 *	This generated bean class ActivationConfigProperty matches the schema element 'activation-config-propertyType'.
 *  The root bean class is EjbJar
 *
 *	===============================================================
 *	
 *	
 *	        The activation-config-propertyType contains a name/value
 *	        configuration property pair for a message-driven bean.
 *	        
 *	        The properties that are recognized for a particular
 *	        message-driven bean are determined by the messaging type.
 *	        
 *	      
 *	===============================================================
 * @Generated
 */

package org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2;

import org.w3c.dom.*;
import org.netbeans.modules.schema2beans.*;
import java.beans.*;
import java.util.*;

// BEGIN_NOI18N

public class ActivationConfigProperty extends org.netbeans.modules.j2ee.dd.impl.common.DescriptionBeanMultiple
	 implements org.netbeans.modules.j2ee.dd.api.ejb.ActivationConfigProperty
{

	static Vector comparators = new Vector();
	private static final org.netbeans.modules.schema2beans.Version runtimeVersion = new org.netbeans.modules.schema2beans.Version(5, 0, 0);
	;	// NOI18N

	static public final String ID = "Id";	// NOI18N
	static public final String ACTIVATION_CONFIG_PROPERTY_NAME = "ActivationConfigPropertyName";	// NOI18N
	static public final String ACTIVATIONCONFIGPROPERTYNAMEID = "ActivationConfigPropertyNameId";	// NOI18N
	static public final String ACTIVATION_CONFIG_PROPERTY_VALUE = "ActivationConfigPropertyValue";	// NOI18N
	static public final String ACTIVATIONCONFIGPROPERTYVALUEID = "ActivationConfigPropertyValueId";	// NOI18N

	public ActivationConfigProperty() {
		this(Common.USE_DEFAULT_VALUES);
	}

	public ActivationConfigProperty(int options)
	{
		super(comparators, runtimeVersion);
		// Properties (see root bean comments for the bean graph)
		initPropertyTables(2);
		this.createProperty("activation-config-property-name", 	// NOI18N
			ACTIVATION_CONFIG_PROPERTY_NAME, 
			Common.TYPE_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createAttribute(ACTIVATION_CONFIG_PROPERTY_NAME, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("activation-config-property-value", 	// NOI18N
			ACTIVATION_CONFIG_PROPERTY_VALUE, 
			Common.TYPE_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createAttribute(ACTIVATION_CONFIG_PROPERTY_VALUE, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.initialize(options);
	}

	// Setting the default values of the properties
	void initialize(int options) {

	}

	// This attribute is optional
	public void setId(java.lang.String value) {
		setAttributeValue(ID, value);
	}

	//
	public java.lang.String getId() {
		return getAttributeValue(ID);
	}

	// This attribute is mandatory
	public void setActivationConfigPropertyName(java.lang.String value) {
		this.setValue(ACTIVATION_CONFIG_PROPERTY_NAME, value);
	}

	//
	public java.lang.String getActivationConfigPropertyName() {
		return (java.lang.String)this.getValue(ACTIVATION_CONFIG_PROPERTY_NAME);
	}

	// This attribute is optional
	public void setActivationConfigPropertyNameId(java.lang.String value) {
		// Make sure we've got a place to put this attribute.
		if (size(ACTIVATION_CONFIG_PROPERTY_NAME) == 0) {
			setValue(ACTIVATION_CONFIG_PROPERTY_NAME, "");
		}
		setAttributeValue(ACTIVATION_CONFIG_PROPERTY_NAME, "Id", value);
	}

	//
	public java.lang.String getActivationConfigPropertyNameId() {
		// If our element does not exist, then the attribute does not exist.
		if (size(ACTIVATION_CONFIG_PROPERTY_NAME) == 0) {
			return null;
		} else {
			return getAttributeValue(ACTIVATION_CONFIG_PROPERTY_NAME, "Id");
		}
	}

	// This attribute is mandatory
	public void setActivationConfigPropertyValue(java.lang.String value) {
		this.setValue(ACTIVATION_CONFIG_PROPERTY_VALUE, value);
	}

	//
	public java.lang.String getActivationConfigPropertyValue() {
		return (java.lang.String)this.getValue(ACTIVATION_CONFIG_PROPERTY_VALUE);
	}

	// This attribute is optional
	public void setActivationConfigPropertyValueId(java.lang.String value) {
		// Make sure we've got a place to put this attribute.
		if (size(ACTIVATION_CONFIG_PROPERTY_NAME) == 0) {
			setValue(ACTIVATION_CONFIG_PROPERTY_NAME, "");
		}
		setAttributeValue(ACTIVATION_CONFIG_PROPERTY_NAME, "Id", value);
	}

	//
	public java.lang.String getActivationConfigPropertyValueId() {
		// If our element does not exist, then the attribute does not exist.
		if (size(ACTIVATION_CONFIG_PROPERTY_NAME) == 0) {
			return null;
		} else {
			return getAttributeValue(ACTIVATION_CONFIG_PROPERTY_NAME, "Id");
		}
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
		// Validating property id
		if (getId() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getId() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "id", this);	// NOI18N
			}
		}
		// Validating property activationConfigPropertyName
		if (getActivationConfigPropertyName() == null) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getActivationConfigPropertyName() == null", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "activationConfigPropertyName", this);	// NOI18N
		}
		// Validating property activationConfigPropertyNameId
		if (getActivationConfigPropertyNameId() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getActivationConfigPropertyNameId() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "activationConfigPropertyNameId", this);	// NOI18N
			}
		}
		// Validating property activationConfigPropertyValue
		if (getActivationConfigPropertyValue() == null) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getActivationConfigPropertyValue() == null", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "activationConfigPropertyValue", this);	// NOI18N
		}
		// Validating property activationConfigPropertyValueId
		if (getActivationConfigPropertyValueId() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getActivationConfigPropertyValueId() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "activationConfigPropertyValueId", this);	// NOI18N
			}
		}
	}

	// Dump the content of this bean returning it as a String
	public void dump(StringBuffer str, String indent){
		String s;
		Object o;
		org.netbeans.modules.schema2beans.BaseBean n;
		str.append(indent);
		str.append("ActivationConfigPropertyName");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getActivationConfigPropertyName();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(ACTIVATION_CONFIG_PROPERTY_NAME, 0, str, indent);

		str.append(indent);
		str.append("ActivationConfigPropertyValue");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getActivationConfigPropertyValue();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(ACTIVATION_CONFIG_PROPERTY_VALUE, 0, str, indent);

	}
	public String dumpBeanNode(){
		StringBuffer str = new StringBuffer();
		str.append("ActivationConfigProperty\n");	// NOI18N
		this.dump(str, "\n  ");	// NOI18N
		return str.toString();
	}}

// END_NOI18N

