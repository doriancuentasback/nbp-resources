/**
 *	This generated bean class SecurityConstraint matches the schema element 'security-constraintType'.
 *  The root bean class is WebApp
 *
 *	===============================================================
 *	
 *	
 *		The security-constraintType is used to associate
 *		security constraints with one or more web resource
 *		collections
 *	
 *		Used in: web-app
 *	
 *	      
 *	===============================================================
 * @Generated
 */

package org.netbeans.modules.j2ee.dd.impl.web.model_2_4;

import org.w3c.dom.*;
import org.netbeans.modules.schema2beans.*;
import java.beans.*;
import java.util.*;

// BEGIN_NOI18N

public class SecurityConstraint extends org.netbeans.modules.j2ee.dd.impl.common.ComponentBeanMultiple
	 implements  
                    org.netbeans.modules.j2ee.dd.api.web.SecurityConstraint
                
{

	static Vector comparators = new Vector();
	static{
		SecurityConstraint.addComparator(new org.netbeans.modules.j2ee.dd.impl.common.Comparator());
	}
	private static final org.netbeans.modules.schema2beans.Version runtimeVersion = new org.netbeans.modules.schema2beans.Version(5, 0, 0);
	;	// NOI18N

	static public final String ID = "Id";	// NOI18N
	static public final String DISPLAY_NAME = "DisplayName";	// NOI18N
	static public final String DISPLAYNAMEID = "DisplayNameId";	// NOI18N
	static public final String DISPLAYNAMEXMLLANG = "DisplayNameXmlLang";	// NOI18N
	static public final String WEB_RESOURCE_COLLECTION = "WebResourceCollection";	// NOI18N
	static public final String AUTH_CONSTRAINT = "AuthConstraint";	// NOI18N
	static public final String USER_DATA_CONSTRAINT = "UserDataConstraint";	// NOI18N

	public SecurityConstraint() {
		this(Common.USE_DEFAULT_VALUES);
	}

	public SecurityConstraint(int options)
	{
		super(comparators, runtimeVersion);
		// Properties (see root bean comments for the bean graph)
		initPropertyTables(4);
		this.createProperty("display-name", 	// NOI18N
			DISPLAY_NAME, 
			Common.TYPE_0_N | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createAttribute(DISPLAY_NAME, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createAttribute(DISPLAY_NAME, "xml:lang", "XmlLang", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("web-resource-collection", 	// NOI18N
			WEB_RESOURCE_COLLECTION, 
			Common.TYPE_1_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			WebResourceCollection.class);
		this.createAttribute(WEB_RESOURCE_COLLECTION, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("auth-constraint", 	// NOI18N
			AUTH_CONSTRAINT, 
			Common.TYPE_0_1 | Common.TYPE_BEAN | Common.TYPE_KEY, 
			AuthConstraint.class);
		this.createAttribute(AUTH_CONSTRAINT, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("user-data-constraint", 	// NOI18N
			USER_DATA_CONSTRAINT, 
			Common.TYPE_0_1 | Common.TYPE_BEAN | Common.TYPE_KEY, 
			UserDataConstraint.class);
		this.createAttribute(USER_DATA_CONSTRAINT, "id", "Id", 
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
	public void setDisplayName(int index, java.lang.String value) {
		this.setValue(DISPLAY_NAME, index, value);
	}

	//
	public java.lang.String getDisplayName(int index) {
		return (java.lang.String)this.getValue(DISPLAY_NAME, index);
	}

	// Return the number of properties
	public int sizeDisplayName() {
		return this.size(DISPLAY_NAME);
	}

	// This attribute is an array, possibly empty
	public void setDisplayName(java.lang.String[] value) {
		this.setValue(DISPLAY_NAME, value);
	}

	//
	public java.lang.String[] getDisplayName() {
		return (java.lang.String[])this.getValues(DISPLAY_NAME);
	}

	// Add a new element returning its index in the list
	public int addDisplayName(java.lang.String value) {
		int positionOfNewItem = this.addValue(DISPLAY_NAME, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeDisplayName(java.lang.String value) {
		return this.removeValue(DISPLAY_NAME, value);
	}

	// This attribute is an array, possibly empty
	public void setDisplayNameId(int index, java.lang.String value) {
		// Make sure we've got a place to put this attribute.
		if (size(DISPLAY_NAME) == 0) {
			addValue(DISPLAY_NAME, "");
		}
		setAttributeValue(DISPLAY_NAME, index, "Id", value);
	}

	//
	public java.lang.String getDisplayNameId(int index) {
		// If our element does not exist, then the attribute does not exist.
		if (size(DISPLAY_NAME) == 0) {
			return null;
		} else {
			return getAttributeValue(DISPLAY_NAME, index, "Id");
		}
	}

	// Return the number of properties
	public int sizeDisplayNameId() {
		return this.size(DISPLAY_NAME);
	}

	// This attribute is an array, possibly empty
	public void setDisplayNameXmlLang(int index, java.lang.String value) {
		// Make sure we've got a place to put this attribute.
		if (size(DISPLAY_NAME) == 0) {
			addValue(DISPLAY_NAME, "");
		}
		setAttributeValue(DISPLAY_NAME, index, "XmlLang", value);
	}

	//
	public java.lang.String getDisplayNameXmlLang(int index) {
		// If our element does not exist, then the attribute does not exist.
		if (size(DISPLAY_NAME) == 0) {
			return null;
		} else {
			return getAttributeValue(DISPLAY_NAME, index, "XmlLang");
		}
	}

	// Return the number of properties
	public int sizeDisplayNameXmlLang() {
		return this.size(DISPLAY_NAME);
	}

	// This attribute is an array containing at least one element
	public void setWebResourceCollection(int index,  
                org.netbeans.modules.j2ee.dd.api.web.WebResourceCollection valueInterface) {
		WebResourceCollection value = (WebResourceCollection) valueInterface;
		this.setValue(WEB_RESOURCE_COLLECTION, index, value);
	}

	//
	public  
                org.netbeans.modules.j2ee.dd.api.web.WebResourceCollection getWebResourceCollection(int index) {
		return (WebResourceCollection)this.getValue(WEB_RESOURCE_COLLECTION, index);
	}

	// Return the number of properties
	public int sizeWebResourceCollection() {
		return this.size(WEB_RESOURCE_COLLECTION);
	}

	// This attribute is an array containing at least one element
	public void setWebResourceCollection( 
                org.netbeans.modules.j2ee.dd.api.web.WebResourceCollection[] value) {
		this.setValue(WEB_RESOURCE_COLLECTION, value);
	}

	//
	public  
                org.netbeans.modules.j2ee.dd.api.web.WebResourceCollection[] getWebResourceCollection() {
		return (WebResourceCollection[])this.getValues(WEB_RESOURCE_COLLECTION);
	}

	// Add a new element returning its index in the list
	public int addWebResourceCollection( 
                org.netbeans.modules.j2ee.dd.api.web.WebResourceCollection valueInterface) {
		WebResourceCollection value = (WebResourceCollection) valueInterface;
		int positionOfNewItem = this.addValue(WEB_RESOURCE_COLLECTION, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeWebResourceCollection( 
                org.netbeans.modules.j2ee.dd.api.web.WebResourceCollection valueInterface) {
		WebResourceCollection value = (WebResourceCollection) valueInterface;
		return this.removeValue(WEB_RESOURCE_COLLECTION, value);
	}

	// This attribute is optional
	public void setAuthConstraint( 
                    org.netbeans.modules.j2ee.dd.api.web.AuthConstraint
                 valueInterface) {
		AuthConstraint value = (AuthConstraint) valueInterface;
		this.setValue(AUTH_CONSTRAINT, value);
	}

	//
	public  
                    org.netbeans.modules.j2ee.dd.api.web.AuthConstraint
                 getAuthConstraint() {
		return (AuthConstraint)this.getValue(AUTH_CONSTRAINT);
	}

	// This attribute is optional
	public void setUserDataConstraint( 
                    org.netbeans.modules.j2ee.dd.api.web.UserDataConstraint
                 valueInterface) {
		UserDataConstraint value = (UserDataConstraint) valueInterface;
		this.setValue(USER_DATA_CONSTRAINT, value);
	}

	//
	public  
                    org.netbeans.modules.j2ee.dd.api.web.UserDataConstraint
                 getUserDataConstraint() {
		return (UserDataConstraint)this.getValue(USER_DATA_CONSTRAINT);
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public org.netbeans.modules.j2ee.dd.api.web.WebResourceCollection newWebResourceCollection() {
		return new WebResourceCollection();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public org.netbeans.modules.j2ee.dd.api.web.AuthConstraint newAuthConstraint() {
		return new AuthConstraint();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public org.netbeans.modules.j2ee.dd.api.web.UserDataConstraint newUserDataConstraint() {
		return new UserDataConstraint();
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
		// Validating property displayName
		for (int _index = 0; _index < sizeDisplayName(); ++_index) {
			java.lang.String element = getDisplayName(_index);
			if (element != null) {
				// has whitespace restriction
				if (restrictionFailure) {
					throw new org.netbeans.modules.schema2beans.ValidateException("element whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "displayName", this);	// NOI18N
				}
			}
		}
		// Validating property displayNameId
		// Validating property displayNameXmlLang
		// Validating property webResourceCollection
		if (sizeWebResourceCollection() == 0) {
			throw new org.netbeans.modules.schema2beans.ValidateException("sizeWebResourceCollection() == 0", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "webResourceCollection", this);	// NOI18N
		}
		for (int _index = 0; _index < sizeWebResourceCollection(); 
			++_index) {
			org.netbeans.modules.j2ee.dd.impl.web.model_2_4.WebResourceCollection element = (org.netbeans.modules.j2ee.dd.impl.web.model_2_4.WebResourceCollection) getWebResourceCollection(_index);
			if (element != null) {
				((WebResourceCollection)element).validate();
			}
		}
		// Validating property authConstraint
		if (getAuthConstraint() != null) {
			((AuthConstraint)getAuthConstraint()).validate();
		}
		// Validating property userDataConstraint
		if (getUserDataConstraint() != null) {
			((UserDataConstraint)getUserDataConstraint()).validate();
		}
	}

	// Dump the content of this bean returning it as a String
	public void dump(StringBuffer str, String indent){
		String s;
		Object o;
		org.netbeans.modules.schema2beans.BaseBean n;
		str.append(indent);
		str.append("DisplayName["+this.sizeDisplayName()+"]");	// NOI18N
		for(int i=0; i<this.sizeDisplayName(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			str.append(indent+"\t");	// NOI18N
			str.append("<");	// NOI18N
			o = this.getDisplayName(i);
			str.append((o==null?"null":o.toString().trim()));	// NOI18N
			str.append(">\n");	// NOI18N
			this.dumpAttributes(DISPLAY_NAME, i, str, indent);
		}

		str.append(indent);
		str.append("WebResourceCollection["+this.sizeWebResourceCollection()+"]");	// NOI18N
		for(int i=0; i<this.sizeWebResourceCollection(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getWebResourceCollection(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(WEB_RESOURCE_COLLECTION, i, str, indent);
		}

		str.append(indent);
		str.append("AuthConstraint");	// NOI18N
		n = (org.netbeans.modules.schema2beans.BaseBean) this.getAuthConstraint();
		if (n != null)
			n.dump(str, indent + "\t");	// NOI18N
		else
			str.append(indent+"\tnull");	// NOI18N
		this.dumpAttributes(AUTH_CONSTRAINT, 0, str, indent);

		str.append(indent);
		str.append("UserDataConstraint");	// NOI18N
		n = (org.netbeans.modules.schema2beans.BaseBean) this.getUserDataConstraint();
		if (n != null)
			n.dump(str, indent + "\t");	// NOI18N
		else
			str.append(indent+"\tnull");	// NOI18N
		this.dumpAttributes(USER_DATA_CONSTRAINT, 0, str, indent);

	}
	public String dumpBeanNode(){
		StringBuffer str = new StringBuffer();
		str.append("SecurityConstraint\n");	// NOI18N
		this.dump(str, "\n  ");	// NOI18N
		return str.toString();
	}}

// END_NOI18N

