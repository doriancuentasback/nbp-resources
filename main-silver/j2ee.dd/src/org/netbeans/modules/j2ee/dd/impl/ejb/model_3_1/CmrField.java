/**
 *	This generated bean class CmrField matches the schema element 'cmr-fieldType'.
 *  The root bean class is EjbJar
 *
 *	===============================================================
 *	
 *	
 *	        The cmr-fieldType describes the bean provider's view of
 *	        a relationship. It consists of an optional description, and
 *	        the name and the class type of a field in the source of a
 *	        role of a relationship. The cmr-field-name element
 *	        corresponds to the name used for the get and set accessor
 *	        methods for the relationship. The cmr-field-type element is
 *	        used only for collection-valued cmr-fields. It specifies the
 *	        type of the collection that is used.
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

public class CmrField extends org.netbeans.modules.j2ee.dd.impl.common.DescriptionBeanMultiple
	 implements org.netbeans.modules.j2ee.dd.api.ejb.CmrField
{

	static Vector comparators = new Vector();
	private static final org.netbeans.modules.schema2beans.Version runtimeVersion = new org.netbeans.modules.schema2beans.Version(5, 0, 0);
	;	// NOI18N

	static public final String ID = "Id";	// NOI18N
	static public final String DESCRIPTION = "Description";	// NOI18N
	static public final String DESCRIPTIONID = "DescriptionId";	// NOI18N
	static public final String DESCRIPTIONXMLLANG = "DescriptionXmlLang";	// NOI18N
	static public final String CMR_FIELD_NAME = "CmrFieldName";	// NOI18N
	static public final String CMRFIELDNAMEID = "CmrFieldNameId";	// NOI18N
	static public final String CMR_FIELD_TYPE = "CmrFieldType";	// NOI18N

	public CmrField() {
		this(Common.USE_DEFAULT_VALUES);
	}

	public CmrField(int options)
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
		this.createProperty("cmr-field-name", 	// NOI18N
			CMR_FIELD_NAME, 
			Common.TYPE_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createAttribute(CMR_FIELD_NAME, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("cmr-field-type", 	// NOI18N
			CMR_FIELD_TYPE, 
			Common.TYPE_0_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
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

	// This attribute is mandatory
	public void setCmrFieldName(java.lang.String value) {
		this.setValue(CMR_FIELD_NAME, value);
	}

	//
	public java.lang.String getCmrFieldName() {
		return (java.lang.String)this.getValue(CMR_FIELD_NAME);
	}

	// This attribute is optional
	public void setCmrFieldNameId(java.lang.String value) {
		// Make sure we've got a place to put this attribute.
		if (size(CMR_FIELD_NAME) == 0) {
			setValue(CMR_FIELD_NAME, "");
		}
		setAttributeValue(CMR_FIELD_NAME, "Id", value);
	}

	//
	public java.lang.String getCmrFieldNameId() {
		// If our element does not exist, then the attribute does not exist.
		if (size(CMR_FIELD_NAME) == 0) {
			return null;
		} else {
			return getAttributeValue(CMR_FIELD_NAME, "Id");
		}
	}

	// This attribute is optional
	public void setCmrFieldType(java.lang.String value) {
		this.setValue(CMR_FIELD_TYPE, value);
	}

	//
	public java.lang.String getCmrFieldType() {
		return (java.lang.String)this.getValue(CMR_FIELD_TYPE);
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
		// Validating property cmrFieldName
		if (getCmrFieldName() == null) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getCmrFieldName() == null", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "cmrFieldName", this);	// NOI18N
		}
		// has whitespace restriction
		if (restrictionFailure) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getCmrFieldName() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "cmrFieldName", this);	// NOI18N
		}
		// Validating property cmrFieldNameId
		if (getCmrFieldNameId() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getCmrFieldNameId() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "cmrFieldNameId", this);	// NOI18N
			}
		}
		// Validating property cmrFieldType
		if (getCmrFieldType() != null) {
			final java.lang.String[] enumRestrictionCmrFieldType = {"java.util.Collection", "java.util.Set"};
			restrictionFailure = true;
			for (int _index2 = 0; 
				_index2 < enumRestrictionCmrFieldType.length; ++_index2) {
				if (enumRestrictionCmrFieldType[_index2].equals(getCmrFieldType())) {
					restrictionFailure = false;
					break;
				}
			}
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getCmrFieldType() enumeration test", org.netbeans.modules.schema2beans.ValidateException.FailureType.ENUM_RESTRICTION, "cmrFieldType", this);	// NOI18N
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
		str.append("CmrFieldName");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getCmrFieldName();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(CMR_FIELD_NAME, 0, str, indent);

		str.append(indent);
		str.append("CmrFieldType");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getCmrFieldType();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(CMR_FIELD_TYPE, 0, str, indent);

	}
	public String dumpBeanNode(){
		StringBuffer str = new StringBuffer();
		str.append("CmrField\n");	// NOI18N
		this.dump(str, "\n  ");	// NOI18N
		return str.toString();
	}}

// END_NOI18N

