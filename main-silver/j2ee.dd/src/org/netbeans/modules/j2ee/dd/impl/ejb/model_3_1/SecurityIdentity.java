/**
 *	This generated bean class SecurityIdentity matches the schema element 'security-identityType'.
 *  The root bean class is EjbJar
 *
 *	===============================================================
 *	
 *	
 *	        The security-identityType specifies whether the caller's
 *	        security identity is to be used for the execution of the
 *	        methods of the enterprise bean or whether a specific run-as
 *	        identity is to be used. It contains an optional description
 *	        and a specification of the security identity to be used.
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

public class SecurityIdentity extends org.netbeans.modules.j2ee.dd.impl.common.DescriptionBeanMultiple
	 implements org.netbeans.modules.j2ee.dd.api.ejb.SecurityIdentity
{

	static Vector comparators = new Vector();
	private static final org.netbeans.modules.schema2beans.Version runtimeVersion = new org.netbeans.modules.schema2beans.Version(5, 0, 0);
	;	// NOI18N

	static public final String ID = "Id";	// NOI18N
	static public final String DESCRIPTION = "Description";	// NOI18N
	static public final String DESCRIPTIONID = "DescriptionId";	// NOI18N
	static public final String DESCRIPTIONXMLLANG = "DescriptionXmlLang";	// NOI18N
	static public final String USE_CALLER_IDENTITY = "UseCallerIdentity";	// NOI18N
	static public final String USECALLERIDENTITYID = "UseCallerIdentityId";	// NOI18N
	static public final String RUN_AS = "RunAs";	// NOI18N

	public SecurityIdentity() {
		this(Common.USE_DEFAULT_VALUES);
	}

	public SecurityIdentity(int options)
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
		this.createProperty("use-caller-identity", 	// NOI18N
			USE_CALLER_IDENTITY, Common.SEQUENCE_OR | 
			Common.TYPE_0_1 | Common.TYPE_BOOLEAN | Common.TYPE_KEY, 
			Boolean.class);
		this.createAttribute(USE_CALLER_IDENTITY, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("run-as", 	// NOI18N
			RUN_AS, Common.SEQUENCE_OR | 
			Common.TYPE_1 | Common.TYPE_BEAN | Common.TYPE_KEY, 
			RunAs.class);
		this.createAttribute(RUN_AS, "id", "Id", 
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

	// This attribute is mandatory
	public void setUseCallerIdentity(boolean value) {
		this.setValue(USE_CALLER_IDENTITY, (value ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE));
		if (value != false) {
			// It's a mutually exclusive property.
			setRunAs(null);
		}
	}

	//
	public boolean isUseCallerIdentity() {
		Boolean ret = (Boolean)this.getValue(USE_CALLER_IDENTITY);
		if (ret == null)
			ret = (Boolean)Common.defaultScalarValue(Common.TYPE_BOOLEAN);
		return ((java.lang.Boolean)ret).booleanValue();
	}

	// This attribute is optional
	public void setUseCallerIdentityId(java.lang.String value) {
		// Make sure we've got a place to put this attribute.
		if (size(USE_CALLER_IDENTITY) == 0) {
			setValue(USE_CALLER_IDENTITY, java.lang.Boolean.TRUE);
		}
		setAttributeValue(USE_CALLER_IDENTITY, "Id", value);
	}

	//
	public java.lang.String getUseCallerIdentityId() {
		// If our element does not exist, then the attribute does not exist.
		if (size(USE_CALLER_IDENTITY) == 0) {
			return null;
		} else {
			return getAttributeValue(USE_CALLER_IDENTITY, "Id");
		}
	}

	// This attribute is mandatory
	public void setRunAs(org.netbeans.modules.j2ee.dd.api.common.RunAs valueInterface) {
		RunAs value = (RunAs) valueInterface;
		this.setValue(RUN_AS, value);
		if (value != null) {
			// It's a mutually exclusive property.
			setUseCallerIdentity(false);
		}
	}

	//
	public org.netbeans.modules.j2ee.dd.api.common.RunAs getRunAs() {
		return (RunAs)this.getValue(RUN_AS);
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public org.netbeans.modules.j2ee.dd.api.common.RunAs newRunAs() {
		return new RunAs();
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
		// Validating property useCallerIdentity
		if (isUseCallerIdentity() != false) {
			if (getRunAs() != null) {
				throw new org.netbeans.modules.schema2beans.ValidateException("mutually exclusive properties: UseCallerIdentity and RunAs", org.netbeans.modules.schema2beans.ValidateException.FailureType.MUTUALLY_EXCLUSIVE, "RunAs", this);	// NOI18N
			}
		}
		// Validating property useCallerIdentityId
		if (getUseCallerIdentityId() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getUseCallerIdentityId() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "useCallerIdentityId", this);	// NOI18N
			}
		}
		// Validating property runAs
		if (getRunAs() != null) {
			((RunAs)getRunAs()).validate();
		}
		if (getRunAs() != null) {
			if (isUseCallerIdentity() != false) {
				throw new org.netbeans.modules.schema2beans.ValidateException("mutually exclusive properties: RunAs and UseCallerIdentity", org.netbeans.modules.schema2beans.ValidateException.FailureType.MUTUALLY_EXCLUSIVE, "UseCallerIdentity", this);	// NOI18N
			}
		}
		if (getRunAs() == null && isUseCallerIdentity() == false) {
			throw new org.netbeans.modules.schema2beans.ValidateException("required properties: getRunAs() == null && isUseCallerIdentity() == false", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "RunAs", this);	// NOI18N
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
		str.append("UseCallerIdentity");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append((this.isUseCallerIdentity()?"true":"false"));
		this.dumpAttributes(USE_CALLER_IDENTITY, 0, str, indent);

		str.append(indent);
		str.append("RunAs");	// NOI18N
		n = (org.netbeans.modules.schema2beans.BaseBean) this.getRunAs();
		if (n != null)
			n.dump(str, indent + "\t");	// NOI18N
		else
			str.append(indent+"\tnull");	// NOI18N
		this.dumpAttributes(RUN_AS, 0, str, indent);

	}
	public String dumpBeanNode(){
		StringBuffer str = new StringBuffer();
		str.append("SecurityIdentity\n");	// NOI18N
		this.dump(str, "\n  ");	// NOI18N
		return str.toString();
	}}

// END_NOI18N

