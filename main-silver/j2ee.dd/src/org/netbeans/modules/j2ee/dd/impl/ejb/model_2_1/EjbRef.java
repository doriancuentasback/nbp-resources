/**
 *	This generated bean class EjbRef matches the schema element 'ejb-refType'.
 *  The root bean class is EjbJar
 *
 *	===============================================================
 *	
 *	
 *		The ejb-refType is used by ejb-ref elements for the
 *		declaration of a reference to an enterprise bean's home. The
 *		declaration consists of:
 *	
 *		    - an optional description
 *		    - the EJB reference name used in the code of
 *		      the Deployment Component that's referencing the enterprise
 *		      bean
 *		    - the expected type of the referenced enterprise bean
 *		    - the expected home and remote interfaces of the referenced
 *		      enterprise bean
 *		    - optional ejb-link information, used to specify the
 *		      referenced enterprise bean
 *	
 *	      
 *	===============================================================
 * @Generated
 */

package org.netbeans.modules.j2ee.dd.impl.ejb.model_2_1;

import org.w3c.dom.*;
import org.netbeans.modules.schema2beans.*;
import java.beans.*;
import java.util.*;

// BEGIN_NOI18N

public class EjbRef extends org.netbeans.modules.j2ee.dd.impl.common.DescriptionBeanMultiple
	 implements org.netbeans.modules.j2ee.dd.api.common.EjbRef
{

	static Vector comparators = new Vector();
	private static final org.netbeans.modules.schema2beans.Version runtimeVersion = new org.netbeans.modules.schema2beans.Version(5, 0, 0);
	;	// NOI18N

	static public final String ID = "Id";	// NOI18N
	static public final String DESCRIPTION = "Description";	// NOI18N
	static public final String DESCRIPTIONID = "DescriptionId";	// NOI18N
	static public final String DESCRIPTIONXMLLANG = "DescriptionXmlLang";	// NOI18N
	static public final String EJB_REF_NAME = "EjbRefName";	// NOI18N
	static public final String EJB_REF_TYPE = "EjbRefType";	// NOI18N
	static public final String HOME = "Home";	// NOI18N
	static public final String REMOTE = "Remote";	// NOI18N
	static public final String EJB_LINK = "EjbLink";	// NOI18N

	public EjbRef() {
		this(Common.USE_DEFAULT_VALUES);
	}

	public EjbRef(int options)
	{
		super(comparators, runtimeVersion);
		// Properties (see root bean comments for the bean graph)
		initPropertyTables(6);
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
		this.createProperty("ejb-ref-name", 	// NOI18N
			EJB_REF_NAME, 
			Common.TYPE_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createProperty("ejb-ref-type", 	// NOI18N
			EJB_REF_TYPE, 
			Common.TYPE_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createProperty("home", 	// NOI18N
			HOME, 
			Common.TYPE_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createProperty("remote", 	// NOI18N
			REMOTE, 
			Common.TYPE_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createProperty("ejb-link", 	// NOI18N
			EJB_LINK, 
			Common.TYPE_0_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.initialize(options);
	}

	// Setting the default values of the properties
	void initialize(int options) {
		if ((options & Common.USE_DEFAULT_VALUES) == Common.USE_DEFAULT_VALUES) {
			setEjbRefType("Entity");
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

	// This attribute is mandatory
	public void setEjbRefName(java.lang.String value) {
		this.setValue(EJB_REF_NAME, value);
	}

	//
	public java.lang.String getEjbRefName() {
		return (java.lang.String)this.getValue(EJB_REF_NAME);
	}

	// This attribute is mandatory
	public void setEjbRefType(java.lang.String value) {
		this.setValue(EJB_REF_TYPE, value);
	}

	//
	public java.lang.String getEjbRefType() {
		return (java.lang.String)this.getValue(EJB_REF_TYPE);
	}

	// This attribute is mandatory
	public void setHome(java.lang.String value) {
		this.setValue(HOME, value);
	}

	//
	public java.lang.String getHome() {
		return (java.lang.String)this.getValue(HOME);
	}

	// This attribute is mandatory
	public void setRemote(java.lang.String value) {
		this.setValue(REMOTE, value);
	}

	//
	public java.lang.String getRemote() {
		return (java.lang.String)this.getValue(REMOTE);
	}

	// This attribute is optional
	public void setEjbLink(java.lang.String value) {
		this.setValue(EJB_LINK, value);
	}

	//
	public java.lang.String getEjbLink() {
		return (java.lang.String)this.getValue(EJB_LINK);
	}

	//
	public static void addComparator(org.netbeans.modules.schema2beans.BeanComparator c) {
		comparators.add(c);
	}

	//
	public static void removeComparator(org.netbeans.modules.schema2beans.BeanComparator c) {
		comparators.remove(c);
	}

	
                // EJB 3.0
                public void setMappedName(String value) throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public int removeInjectionTarget(org.netbeans.modules.j2ee.dd.api.common.InjectionTarget valueInterface) throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public int addInjectionTarget(org.netbeans.modules.j2ee.dd.api.common.InjectionTarget valueInterface) throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public void setInjectionTarget(int index, org.netbeans.modules.j2ee.dd.api.common.InjectionTarget valueInterface) throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public org.netbeans.modules.j2ee.dd.api.common.InjectionTarget getInjectionTarget(int index) throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public void setInjectionTarget(org.netbeans.modules.j2ee.dd.api.common.InjectionTarget[] value) throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public int sizeInjectionTarget() throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public org.netbeans.modules.j2ee.dd.api.common.InjectionTarget newInjectionTarget() throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public String getMappedName() throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public org.netbeans.modules.j2ee.dd.api.common.InjectionTarget[] getInjectionTarget() throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
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
		// Validating property ejbRefName
		if (getEjbRefName() == null) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getEjbRefName() == null", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "ejbRefName", this);	// NOI18N
		}
		// Validating property ejbRefType
		if (getEjbRefType() == null) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getEjbRefType() == null", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "ejbRefType", this);	// NOI18N
		}
		final java.lang.String[] enumRestrictionEjbRefType = {"Entity", "Session"};
		restrictionFailure = true;
		for (int _index2 = 0; _index2 < enumRestrictionEjbRefType.length; 
			++_index2) {
			if (enumRestrictionEjbRefType[_index2].equals(getEjbRefType())) {
				restrictionFailure = false;
				break;
			}
		}
		if (restrictionFailure) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getEjbRefType() enumeration test", org.netbeans.modules.schema2beans.ValidateException.FailureType.ENUM_RESTRICTION, "ejbRefType", this);	// NOI18N
		}
		// Validating property home
		if (getHome() == null) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getHome() == null", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "home", this);	// NOI18N
		}
		// Validating property remote
		if (getRemote() == null) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getRemote() == null", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "remote", this);	// NOI18N
		}
		// Validating property ejbLink
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
		str.append("EjbRefName");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getEjbRefName();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(EJB_REF_NAME, 0, str, indent);

		str.append(indent);
		str.append("EjbRefType");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getEjbRefType();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(EJB_REF_TYPE, 0, str, indent);

		str.append(indent);
		str.append("Home");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getHome();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(HOME, 0, str, indent);

		str.append(indent);
		str.append("Remote");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getRemote();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(REMOTE, 0, str, indent);

		str.append(indent);
		str.append("EjbLink");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getEjbLink();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(EJB_LINK, 0, str, indent);

	}
	public String dumpBeanNode(){
		StringBuffer str = new StringBuffer();
		str.append("EjbRef\n");	// NOI18N
		this.dump(str, "\n  ");	// NOI18N
		return str.toString();
	}}

// END_NOI18N

