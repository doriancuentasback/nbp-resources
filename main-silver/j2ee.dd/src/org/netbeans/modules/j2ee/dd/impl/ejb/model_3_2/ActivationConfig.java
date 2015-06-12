/**
 *	This generated bean class ActivationConfig matches the schema element 'activation-configType'.
 *  The root bean class is EjbJar
 *
 *	===============================================================
 *	
 *	
 *	        The activation-configType defines information about the
 *	        expected configuration properties of the message-driven bean
 *	        in its operational environment. This may include information
 *	        about message acknowledgement, message selector, expected
 *	        destination type, destination or connection factory lookup
 *	        string, subscription name, etc.
 *	        
 *	        The configuration information is expressed in terms of
 *	        name/value configuration properties.
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

public class ActivationConfig extends org.netbeans.modules.j2ee.dd.impl.common.DescriptionBeanMultiple
	 implements org.netbeans.modules.j2ee.dd.api.ejb.ActivationConfig
{

	static Vector comparators = new Vector();
	private static final org.netbeans.modules.schema2beans.Version runtimeVersion = new org.netbeans.modules.schema2beans.Version(5, 0, 0);
	;	// NOI18N

	static public final String ID = "Id";	// NOI18N
	static public final String DESCRIPTION = "Description";	// NOI18N
	static public final String DESCRIPTIONID = "DescriptionId";	// NOI18N
	static public final String DESCRIPTIONXMLLANG = "DescriptionXmlLang";	// NOI18N
	static public final String ACTIVATION_CONFIG_PROPERTY = "ActivationConfigProperty";	// NOI18N

	public ActivationConfig() {
		this(Common.USE_DEFAULT_VALUES);
	}

	public ActivationConfig(int options)
	{
		super(comparators, runtimeVersion);
		// Properties (see root bean comments for the bean graph)
		initPropertyTables(2);
		this.createProperty("description", 	// NOI18N
			DESCRIPTION, 
			Common.TYPE_0_N | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createAttribute(DESCRIPTION, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createAttribute(DESCRIPTION, "xml:lang", "XmlLang", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("activation-config-property", 	// NOI18N
			ACTIVATION_CONFIG_PROPERTY, 
			Common.TYPE_1_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			ActivationConfigProperty.class);
		this.createAttribute(ACTIVATION_CONFIG_PROPERTY, "id", "Id", 
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

	// This attribute is an array, possibly empty
	public void setDescription(int index, java.lang.String value) {
		this.setValue(DESCRIPTION, index, value);
	}

	//
	public java.lang.String getDescription(int index) {
		return (java.lang.String)this.getValue(DESCRIPTION, index);
	}

	// Return the number of properties
	public int sizeDescription() {
		return this.size(DESCRIPTION);
	}

	// This attribute is an array, possibly empty
	public void setDescription(java.lang.String[] value) {
		this.setValue(DESCRIPTION, value);
	}

	//
	public java.lang.String[] getDescription() {
		return (java.lang.String[])this.getValues(DESCRIPTION);
	}

	// Add a new element returning its index in the list
	public int addDescription(java.lang.String value) {
		int positionOfNewItem = this.addValue(DESCRIPTION, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeDescription(java.lang.String value) {
		return this.removeValue(DESCRIPTION, value);
	}

	// This attribute is an array, possibly empty
	public void setDescriptionId(int index, java.lang.String value) {
		// Make sure we've got a place to put this attribute.
		if (size(DESCRIPTION) == 0) {
			addValue(DESCRIPTION, "");
		}
		setAttributeValue(DESCRIPTION, index, "Id", value);
	}

	//
	public java.lang.String getDescriptionId(int index) {
		// If our element does not exist, then the attribute does not exist.
		if (size(DESCRIPTION) == 0) {
			return null;
		} else {
			return getAttributeValue(DESCRIPTION, index, "Id");
		}
	}

	// Return the number of properties
	public int sizeDescriptionId() {
		return this.size(DESCRIPTION);
	}

	// This attribute is an array, possibly empty
	public void setDescriptionXmlLang(int index, java.lang.String value) {
		// Make sure we've got a place to put this attribute.
		if (size(DESCRIPTION) == 0) {
			addValue(DESCRIPTION, "");
		}
		setAttributeValue(DESCRIPTION, index, "XmlLang", value);
	}

	//
	public java.lang.String getDescriptionXmlLang(int index) {
		// If our element does not exist, then the attribute does not exist.
		if (size(DESCRIPTION) == 0) {
			return null;
		} else {
			return getAttributeValue(DESCRIPTION, index, "XmlLang");
		}
	}

	// Return the number of properties
	public int sizeDescriptionXmlLang() {
		return this.size(DESCRIPTION);
	}

	// This attribute is an array containing at least one element
	public void setActivationConfigProperty(int index, org.netbeans.modules.j2ee.dd.api.ejb.ActivationConfigProperty valueInterface) {
		ActivationConfigProperty value = (ActivationConfigProperty) valueInterface;
		this.setValue(ACTIVATION_CONFIG_PROPERTY, index, value);
	}

	//
	public org.netbeans.modules.j2ee.dd.api.ejb.ActivationConfigProperty getActivationConfigProperty(int index) {
		return (ActivationConfigProperty)this.getValue(ACTIVATION_CONFIG_PROPERTY, index);
	}

	// Return the number of properties
	public int sizeActivationConfigProperty() {
		return this.size(ACTIVATION_CONFIG_PROPERTY);
	}

	// This attribute is an array containing at least one element
	public void setActivationConfigProperty(org.netbeans.modules.j2ee.dd.api.ejb.ActivationConfigProperty[] value) {
		this.setValue(ACTIVATION_CONFIG_PROPERTY, value);
	}

	//
	public org.netbeans.modules.j2ee.dd.api.ejb.ActivationConfigProperty[] getActivationConfigProperty() {
		return (ActivationConfigProperty[])this.getValues(ACTIVATION_CONFIG_PROPERTY);
	}

	// Add a new element returning its index in the list
	public int addActivationConfigProperty(org.netbeans.modules.j2ee.dd.api.ejb.ActivationConfigProperty valueInterface) {
		ActivationConfigProperty value = (ActivationConfigProperty) valueInterface;
		int positionOfNewItem = this.addValue(ACTIVATION_CONFIG_PROPERTY, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeActivationConfigProperty(org.netbeans.modules.j2ee.dd.api.ejb.ActivationConfigProperty valueInterface) {
		ActivationConfigProperty value = (ActivationConfigProperty) valueInterface;
		return this.removeValue(ACTIVATION_CONFIG_PROPERTY, value);
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public org.netbeans.modules.j2ee.dd.api.ejb.ActivationConfigProperty newActivationConfigProperty() {
		return new ActivationConfigProperty();
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
		// Validating property description
		// Validating property descriptionId
		// Validating property descriptionXmlLang
		// Validating property activationConfigProperty
		if (sizeActivationConfigProperty() == 0) {
			throw new org.netbeans.modules.schema2beans.ValidateException("sizeActivationConfigProperty() == 0", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "activationConfigProperty", this);	// NOI18N
		}
		for (int _index = 0; _index < sizeActivationConfigProperty(); 
			++_index) {
			org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2.ActivationConfigProperty element = (org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2.ActivationConfigProperty) getActivationConfigProperty(_index);
			if (element != null) {
				((ActivationConfigProperty)element).validate();
			}
		}
	}

	// Dump the content of this bean returning it as a String
	public void dump(StringBuffer str, String indent){
		String s;
		Object o;
		org.netbeans.modules.schema2beans.BaseBean n;
		str.append(indent);
		str.append("Description["+this.sizeDescription()+"]");	// NOI18N
		for(int i=0; i<this.sizeDescription(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			str.append(indent+"\t");	// NOI18N
			str.append("<");	// NOI18N
			o = this.getDescription(i);
			str.append((o==null?"null":o.toString().trim()));	// NOI18N
			str.append(">\n");	// NOI18N
			this.dumpAttributes(DESCRIPTION, i, str, indent);
		}

		str.append(indent);
		str.append("ActivationConfigProperty["+this.sizeActivationConfigProperty()+"]");	// NOI18N
		for(int i=0; i<this.sizeActivationConfigProperty(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getActivationConfigProperty(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(ACTIVATION_CONFIG_PROPERTY, i, str, indent);
		}

	}
	public String dumpBeanNode(){
		StringBuffer str = new StringBuffer();
		str.append("ActivationConfig\n");	// NOI18N
		this.dump(str, "\n  ");	// NOI18N
		return str.toString();
	}}

// END_NOI18N

