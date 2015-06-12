/**
 *	This generated bean class FormLoginConfig matches the schema element 'form-login-configType'.
 *  The root bean class is WebApp
 *
 *	===============================================================
 *	
 *	
 *		The form-login-configType specifies the login and error
 *		pages that should be used in form based login. If form based
 *		authentication is not used, these elements are ignored.
 *	
 *		Used in: login-config
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

public class FormLoginConfig extends org.netbeans.modules.schema2beans.BaseBean
	 implements  
                    org.netbeans.modules.j2ee.dd.api.web.FormLoginConfig
                
{

	static Vector comparators = new Vector();
	private static final org.netbeans.modules.schema2beans.Version runtimeVersion = new org.netbeans.modules.schema2beans.Version(5, 0, 0);
	;	// NOI18N

	static public final String ID = "Id";	// NOI18N
	static public final String FORM_LOGIN_PAGE = "FormLoginPage";	// NOI18N
	static public final String FORM_ERROR_PAGE = "FormErrorPage";	// NOI18N

	public FormLoginConfig() {
		this(Common.USE_DEFAULT_VALUES);
	}

	public FormLoginConfig(int options)
	{
		super(comparators, runtimeVersion);
		// Properties (see root bean comments for the bean graph)
		initPropertyTables(2);
		this.createProperty("form-login-page", 	// NOI18N
			FORM_LOGIN_PAGE, 
			Common.TYPE_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createProperty("form-error-page", 	// NOI18N
			FORM_ERROR_PAGE, 
			Common.TYPE_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
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

	// This attribute is mandatory
	public void setFormLoginPage(java.lang.String value) {
		this.setValue(FORM_LOGIN_PAGE, value);
	}

	//
	public java.lang.String getFormLoginPage() {
		return (java.lang.String)this.getValue(FORM_LOGIN_PAGE);
	}

	// This attribute is mandatory
	public void setFormErrorPage(java.lang.String value) {
		this.setValue(FORM_ERROR_PAGE, value);
	}

	//
	public java.lang.String getFormErrorPage() {
		return (java.lang.String)this.getValue(FORM_ERROR_PAGE);
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
		// Validating property formLoginPage
		if (getFormLoginPage() == null) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getFormLoginPage() == null", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "formLoginPage", this);	// NOI18N
		}
		{
			boolean patternPassed = false;
			if ((getFormLoginPage()).matches("/.*")) {
				patternPassed = true;
			}
			restrictionFailure = !patternPassed;
		}
		if (restrictionFailure) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getFormLoginPage()", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "formLoginPage", this);	// NOI18N
		}
		// Validating property formErrorPage
		if (getFormErrorPage() == null) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getFormErrorPage() == null", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "formErrorPage", this);	// NOI18N
		}
		{
			boolean patternPassed = false;
			if ((getFormErrorPage()).matches("/.*")) {
				patternPassed = true;
			}
			restrictionFailure = !patternPassed;
		}
		if (restrictionFailure) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getFormErrorPage()", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "formErrorPage", this);	// NOI18N
		}
	}

	// Dump the content of this bean returning it as a String
	public void dump(StringBuffer str, String indent){
		String s;
		Object o;
		org.netbeans.modules.schema2beans.BaseBean n;
		str.append(indent);
		str.append("FormLoginPage");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getFormLoginPage();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(FORM_LOGIN_PAGE, 0, str, indent);

		str.append(indent);
		str.append("FormErrorPage");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getFormErrorPage();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(FORM_ERROR_PAGE, 0, str, indent);

	}
	public String dumpBeanNode(){
		StringBuffer str = new StringBuffer();
		str.append("FormLoginConfig\n");	// NOI18N
		this.dump(str, "\n  ");	// NOI18N
		return str.toString();
	}}

// END_NOI18N

