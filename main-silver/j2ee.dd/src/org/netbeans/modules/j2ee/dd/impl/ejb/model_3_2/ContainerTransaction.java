/**
 *	This generated bean class ContainerTransaction matches the schema element 'container-transactionType'.
 *  The root bean class is EjbJar
 *
 *	===============================================================
 *	
 *	
 *	        The container-transactionType specifies how the container
 *	        must manage transaction scopes for the enterprise bean's
 *	        method invocations. It defines an optional description, a
 *	        list of method elements, and a transaction attribute. The
 *	        transaction attribute is to be applied to all the specified
 *	        methods.
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

public class ContainerTransaction extends org.netbeans.modules.j2ee.dd.impl.common.DescriptionBeanMultiple
	 implements org.netbeans.modules.j2ee.dd.api.ejb.ContainerTransaction
{

	static Vector comparators = new Vector();
	private static final org.netbeans.modules.schema2beans.Version runtimeVersion = new org.netbeans.modules.schema2beans.Version(5, 0, 0);
	;	// NOI18N

	static public final String ID = "Id";	// NOI18N
	static public final String DESCRIPTION = "Description";	// NOI18N
	static public final String DESCRIPTIONID = "DescriptionId";	// NOI18N
	static public final String DESCRIPTIONXMLLANG = "DescriptionXmlLang";	// NOI18N
	static public final String METHOD = "Method";	// NOI18N
	static public final String TRANS_ATTRIBUTE = "TransAttribute";	// NOI18N

	public ContainerTransaction() {
		this(Common.USE_DEFAULT_VALUES);
	}

	public ContainerTransaction(int options)
	{
		super(comparators, runtimeVersion);
		// Properties (see root bean comments for the bean graph)
		initPropertyTables(3);
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
		this.createProperty("method", 	// NOI18N
			METHOD, 
			Common.TYPE_1_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			Method.class);
		this.createAttribute(METHOD, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("trans-attribute", 	// NOI18N
			TRANS_ATTRIBUTE, 
			Common.TYPE_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.initialize(options);
	}

	// Setting the default values of the properties
	void initialize(int options) {
		if ((options & Common.USE_DEFAULT_VALUES) == Common.USE_DEFAULT_VALUES) {
			setTransAttribute("NotSupported");
		}

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
	public void setMethod(int index, org.netbeans.modules.j2ee.dd.api.ejb.Method valueInterface) {
		Method value = (Method) valueInterface;
		this.setValue(METHOD, index, value);
	}

	//
	public org.netbeans.modules.j2ee.dd.api.ejb.Method getMethod(int index) {
		return (Method)this.getValue(METHOD, index);
	}

	// Return the number of properties
	public int sizeMethod() {
		return this.size(METHOD);
	}

	// This attribute is an array containing at least one element
	public void setMethod(org.netbeans.modules.j2ee.dd.api.ejb.Method[] value) {
		this.setValue(METHOD, value);
	}

	//
	public org.netbeans.modules.j2ee.dd.api.ejb.Method[] getMethod() {
		return (Method[])this.getValues(METHOD);
	}

	// Add a new element returning its index in the list
	public int addMethod(org.netbeans.modules.j2ee.dd.api.ejb.Method valueInterface) {
		Method value = (Method) valueInterface;
		int positionOfNewItem = this.addValue(METHOD, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeMethod(org.netbeans.modules.j2ee.dd.api.ejb.Method valueInterface) {
		Method value = (Method) valueInterface;
		return this.removeValue(METHOD, value);
	}

	// This attribute is mandatory
	public void setTransAttribute(java.lang.String value) {
		this.setValue(TRANS_ATTRIBUTE, value);
	}

	//
	public java.lang.String getTransAttribute() {
		return (java.lang.String)this.getValue(TRANS_ATTRIBUTE);
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public org.netbeans.modules.j2ee.dd.api.ejb.Method newMethod() {
		return new Method();
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
		// Validating property method
		if (sizeMethod() == 0) {
			throw new org.netbeans.modules.schema2beans.ValidateException("sizeMethod() == 0", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "method", this);	// NOI18N
		}
		for (int _index = 0; _index < sizeMethod(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2.Method element = (org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2.Method) getMethod(_index);
			if (element != null) {
				((Method)element).validate();
			}
		}
		// Validating property transAttribute
		if (getTransAttribute() == null) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getTransAttribute() == null", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "transAttribute", this);	// NOI18N
		}
		final java.lang.String[] enumRestrictionTransAttribute = {"NotSupported", "Supports", "Required", "RequiresNew", "Mandatory", "Never"};
		restrictionFailure = true;
		for (int _index2 = 0; 
			_index2 < enumRestrictionTransAttribute.length; ++_index2) {
			if (enumRestrictionTransAttribute[_index2].equals(getTransAttribute())) {
				restrictionFailure = false;
				break;
			}
		}
		if (restrictionFailure) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getTransAttribute() enumeration test", org.netbeans.modules.schema2beans.ValidateException.FailureType.ENUM_RESTRICTION, "transAttribute", this);	// NOI18N
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
		str.append("Method["+this.sizeMethod()+"]");	// NOI18N
		for(int i=0; i<this.sizeMethod(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getMethod(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(METHOD, i, str, indent);
		}

		str.append(indent);
		str.append("TransAttribute");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getTransAttribute();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(TRANS_ATTRIBUTE, 0, str, indent);

	}
	public String dumpBeanNode(){
		StringBuffer str = new StringBuffer();
		str.append("ContainerTransaction\n");	// NOI18N
		this.dump(str, "\n  ");	// NOI18N
		return str.toString();
	}}

// END_NOI18N

