/**
 *	This generated bean class LoginConfig matches the schema element 'login-configType'.
 *  The root bean class is WebApp
 *
 *	===============================================================
 *	
 *	
 *		The login-configType is used to configure the authentication
 *		method that should be used, the realm name that should be
 *		used for this application, and the attributes that are
 *		needed by the form login mechanism.
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

public class LoginConfig extends org.netbeans.modules.j2ee.dd.impl.common.EnclosingBean
	 implements  
                    org.netbeans.modules.j2ee.dd.api.web.LoginConfig
                
{

	static Vector comparators = new Vector();
	static{
		LoginConfig.addComparator(new org.netbeans.modules.j2ee.dd.impl.common.Comparator());
	}
	private static final org.netbeans.modules.schema2beans.Version runtimeVersion = new org.netbeans.modules.schema2beans.Version(5, 0, 0);
	;	// NOI18N

	static public final String ID = "Id";	// NOI18N
	static public final String AUTH_METHOD = "AuthMethod";	// NOI18N
	static public final String REALM_NAME = "RealmName";	// NOI18N
	static public final String REALMNAMEID = "RealmNameId";	// NOI18N
	static public final String FORM_LOGIN_CONFIG = "FormLoginConfig";	// NOI18N

	public LoginConfig() {
		this(Common.USE_DEFAULT_VALUES);
	}

	public LoginConfig(int options)
	{
		super(comparators, runtimeVersion);
		// Properties (see root bean comments for the bean graph)
		initPropertyTables(3);
		this.createProperty("auth-method", 	// NOI18N
			AUTH_METHOD, 
			Common.TYPE_0_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createProperty("realm-name", 	// NOI18N
			REALM_NAME, 
			Common.TYPE_0_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createAttribute(REALM_NAME, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("form-login-config", 	// NOI18N
			FORM_LOGIN_CONFIG, 
			Common.TYPE_0_1 | Common.TYPE_BEAN | Common.TYPE_KEY, 
			FormLoginConfig.class);
		this.createAttribute(FORM_LOGIN_CONFIG, "id", "Id", 
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

	// This attribute is optional
	public void setAuthMethod(java.lang.String value) {
		this.setValue(AUTH_METHOD, value);
	}

	//
	public java.lang.String getAuthMethod() {
		return (java.lang.String)this.getValue(AUTH_METHOD);
	}

	// This attribute is optional
	public void setRealmName(java.lang.String value) {
		this.setValue(REALM_NAME, value);
	}

	//
	public java.lang.String getRealmName() {
		return (java.lang.String)this.getValue(REALM_NAME);
	}

	// This attribute is optional
	public void setRealmNameId(java.lang.String value) {
		// Make sure we've got a place to put this attribute.
		if (size(REALM_NAME) == 0) {
			setValue(REALM_NAME, "");
		}
		setAttributeValue(REALM_NAME, "Id", value);
	}

	//
	public java.lang.String getRealmNameId() {
		// If our element does not exist, then the attribute does not exist.
		if (size(REALM_NAME) == 0) {
			return null;
		} else {
			return getAttributeValue(REALM_NAME, "Id");
		}
	}

	// This attribute is optional
	public void setFormLoginConfig( 
                    org.netbeans.modules.j2ee.dd.api.web.FormLoginConfig
                 valueInterface) {
		FormLoginConfig value = (FormLoginConfig) valueInterface;
		this.setValue(FORM_LOGIN_CONFIG, value);
	}

	//
	public  
                    org.netbeans.modules.j2ee.dd.api.web.FormLoginConfig
                 getFormLoginConfig() {
		return (FormLoginConfig)this.getValue(FORM_LOGIN_CONFIG);
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public org.netbeans.modules.j2ee.dd.api.web.FormLoginConfig newFormLoginConfig() {
		return new FormLoginConfig();
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
		// Validating property authMethod
		// Validating property realmName
		if (getRealmName() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getRealmName() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "realmName", this);	// NOI18N
			}
		}
		// Validating property realmNameId
		if (getRealmNameId() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getRealmNameId() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "realmNameId", this);	// NOI18N
			}
		}
		// Validating property formLoginConfig
		if (getFormLoginConfig() != null) {
			((FormLoginConfig)getFormLoginConfig()).validate();
		}
	}

	// Dump the content of this bean returning it as a String
	public void dump(StringBuffer str, String indent){
		String s;
		Object o;
		org.netbeans.modules.schema2beans.BaseBean n;
		str.append(indent);
		str.append("AuthMethod");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getAuthMethod();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(AUTH_METHOD, 0, str, indent);

		str.append(indent);
		str.append("RealmName");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getRealmName();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(REALM_NAME, 0, str, indent);

		str.append(indent);
		str.append("FormLoginConfig");	// NOI18N
		n = (org.netbeans.modules.schema2beans.BaseBean) this.getFormLoginConfig();
		if (n != null)
			n.dump(str, indent + "\t");	// NOI18N
		else
			str.append(indent+"\tnull");	// NOI18N
		this.dumpAttributes(FORM_LOGIN_CONFIG, 0, str, indent);

	}
	public String dumpBeanNode(){
		StringBuffer str = new StringBuffer();
		str.append("LoginConfig\n");	// NOI18N
		this.dump(str, "\n  ");	// NOI18N
		return str.toString();
	}}

// END_NOI18N

