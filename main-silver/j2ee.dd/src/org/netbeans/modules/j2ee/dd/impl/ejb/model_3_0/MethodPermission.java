/**
 *	This generated bean class MethodPermission matches the schema element 'method-permissionType'.
 *  The root bean class is EjbJar
 *
 *	===============================================================
 *	
 *	
 *		The method-permissionType specifies that one or more
 *		security roles are allowed to invoke one or more enterprise
 *		bean methods. The method-permissionType consists of an
 *		optional description, a list of security role names or an
 *		indicator to state that the method is unchecked for
 *		authorization, and a list of method elements.
 *	
 *		The security roles used in the method-permissionType
 *		must be defined in the security-role elements of the
 *		deployment descriptor, and the methods must be methods
 *		defined in the enterprise bean's business, home, component
 *	        and/or web service endpoint interfaces.
 *	
 *	      
 *	===============================================================
 * @Generated
 */

package org.netbeans.modules.j2ee.dd.impl.ejb.model_3_0;

import org.w3c.dom.*;
import org.netbeans.modules.schema2beans.*;
import java.beans.*;
import java.util.*;

// BEGIN_NOI18N

public class MethodPermission extends org.netbeans.modules.j2ee.dd.impl.common.DescriptionBeanMultiple
	 implements org.netbeans.modules.j2ee.dd.api.ejb.MethodPermission
{

	static Vector comparators = new Vector();
	private static final org.netbeans.modules.schema2beans.Version runtimeVersion = new org.netbeans.modules.schema2beans.Version(5, 0, 0);
	;	// NOI18N

	static public final String ID = "Id";	// NOI18N
	static public final String DESCRIPTION = "Description";	// NOI18N
	static public final String DESCRIPTIONID = "DescriptionId";	// NOI18N
	static public final String DESCRIPTIONXMLLANG = "DescriptionXmlLang";	// NOI18N
	static public final String ROLE_NAME = "RoleName";	// NOI18N
	static public final String UNCHECKED = "Unchecked";	// NOI18N
	static public final String UNCHECKEDID = "UncheckedId";	// NOI18N
	static public final String METHOD = "Method";	// NOI18N

	public MethodPermission() {
		this(Common.USE_DEFAULT_VALUES);
	}

	public MethodPermission(int options)
	{
		super(comparators, runtimeVersion);
		// Properties (see root bean comments for the bean graph)
		initPropertyTables(4);
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
		this.createProperty("role-name", 	// NOI18N
			ROLE_NAME, Common.SEQUENCE_OR | 
			Common.TYPE_1_N | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createProperty("unchecked", 	// NOI18N
			UNCHECKED, Common.SEQUENCE_OR | 
			Common.TYPE_0_1 | Common.TYPE_BOOLEAN | Common.TYPE_KEY, 
			Boolean.class);
		this.createAttribute(UNCHECKED, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("method", 	// NOI18N
			METHOD, 
			Common.TYPE_1_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			Method.class);
		this.createAttribute(METHOD, "id", "Id", 
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
	public void setRoleName(int index, java.lang.String value) {
		this.setValue(ROLE_NAME, index, value);
	}

	//
	public java.lang.String getRoleName(int index) {
		return (java.lang.String)this.getValue(ROLE_NAME, index);
	}

	// Return the number of properties
	public int sizeRoleName() {
		return this.size(ROLE_NAME);
	}

	// This attribute is an array containing at least one element
	public void setRoleName(java.lang.String[] value) {
		this.setValue(ROLE_NAME, value);
		if (value != null && value.length > 0) {
			// It's a mutually exclusive property.
			setUnchecked(false);
		}
	}

	//
	public java.lang.String[] getRoleName() {
		return (java.lang.String[])this.getValues(ROLE_NAME);
	}

	// Add a new element returning its index in the list
	public int addRoleName(java.lang.String value) {
		int positionOfNewItem = this.addValue(ROLE_NAME, value);
		if (positionOfNewItem == 0) {
			// It's a mutually exclusive property.
			setUnchecked(false);
		}
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeRoleName(java.lang.String value) {
		return this.removeValue(ROLE_NAME, value);
	}

	// This attribute is mandatory
	public void setUnchecked(boolean value) {
		this.setValue(UNCHECKED, (value ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE));
		if (value != false) {
			// It's a mutually exclusive property.
			setRoleName(null);
		}
	}

	//
	public boolean isUnchecked() {
		Boolean ret = (Boolean)this.getValue(UNCHECKED);
		if (ret == null)
			ret = (Boolean)Common.defaultScalarValue(Common.TYPE_BOOLEAN);
		return ((java.lang.Boolean)ret).booleanValue();
	}

	// This attribute is optional
	public void setUncheckedId(java.lang.String value) {
		// Make sure we've got a place to put this attribute.
		if (size(UNCHECKED) == 0) {
			setValue(UNCHECKED, java.lang.Boolean.TRUE);
		}
		setAttributeValue(UNCHECKED, "Id", value);
	}

	//
	public java.lang.String getUncheckedId() {
		// If our element does not exist, then the attribute does not exist.
		if (size(UNCHECKED) == 0) {
			return null;
		} else {
			return getAttributeValue(UNCHECKED, "Id");
		}
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
		// Validating property roleName
		if (sizeRoleName() > 0) {
			if (isUnchecked() != false) {
				throw new org.netbeans.modules.schema2beans.ValidateException("mutually exclusive properties: RoleName and Unchecked", org.netbeans.modules.schema2beans.ValidateException.FailureType.MUTUALLY_EXCLUSIVE, "Unchecked", this);	// NOI18N
			}
		}
		// Validating property unchecked
		if (isUnchecked() != false) {
			if (sizeRoleName() > 0) {
				throw new org.netbeans.modules.schema2beans.ValidateException("mutually exclusive properties: Unchecked and RoleName", org.netbeans.modules.schema2beans.ValidateException.FailureType.MUTUALLY_EXCLUSIVE, "RoleName", this);	// NOI18N
			}
		}
		// Validating property uncheckedId
		if (getUncheckedId() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getUncheckedId() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "uncheckedId", this);	// NOI18N
			}
		}
		// Validating property method
		if (sizeMethod() == 0) {
			throw new org.netbeans.modules.schema2beans.ValidateException("sizeMethod() == 0", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "method", this);	// NOI18N
		}
		for (int _index = 0; _index < sizeMethod(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.ejb.model_3_0.Method element = (org.netbeans.modules.j2ee.dd.impl.ejb.model_3_0.Method) getMethod(_index);
			if (element != null) {
				((Method)element).validate();
			}
		}
		if (isUnchecked() == false && sizeRoleName() == 0) {
			throw new org.netbeans.modules.schema2beans.ValidateException("required properties: isUnchecked() == false && sizeRoleName() == 0", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "Unchecked", this);	// NOI18N
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
		str.append("RoleName["+this.sizeRoleName()+"]");	// NOI18N
		for(int i=0; i<this.sizeRoleName(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			str.append(indent+"\t");	// NOI18N
			str.append("<");	// NOI18N
			o = this.getRoleName(i);
			str.append((o==null?"null":o.toString().trim()));	// NOI18N
			str.append(">\n");	// NOI18N
			this.dumpAttributes(ROLE_NAME, i, str, indent);
		}

		str.append(indent);
		str.append("Unchecked");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append((this.isUnchecked()?"true":"false"));
		this.dumpAttributes(UNCHECKED, 0, str, indent);

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

	}
	public String dumpBeanNode(){
		StringBuffer str = new StringBuffer();
		str.append("MethodPermission\n");	// NOI18N
		this.dump(str, "\n  ");	// NOI18N
		return str.toString();
	}}

// END_NOI18N

