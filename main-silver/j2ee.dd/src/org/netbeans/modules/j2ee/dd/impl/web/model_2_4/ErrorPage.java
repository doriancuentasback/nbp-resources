/**
 *	This generated bean class ErrorPage matches the schema element 'error-pageType'.
 *  The root bean class is WebApp
 *
 *	===============================================================
 *	
 *	
 *		The error-pageType contains a mapping between an error code
 *		or exception type to the path of a resource in the web
 *		application.
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

public class ErrorPage extends org.netbeans.modules.schema2beans.BaseBean
	 implements  
                org.netbeans.modules.j2ee.dd.api.web.ErrorPage, org.netbeans.modules.j2ee.dd.impl.common.KeyBean
            
{

	static Vector comparators = new Vector();
	static{
		ErrorPage.addComparator(new org.netbeans.modules.j2ee.dd.impl.common.Comparator());
	}
	private static final org.netbeans.modules.schema2beans.Version runtimeVersion = new org.netbeans.modules.schema2beans.Version(5, 0, 0);
	;	// NOI18N

	static public final String ID = "Id";	// NOI18N
	static public final String ERROR_CODE = "ErrorCode";	// NOI18N
	static public final String EXCEPTION_TYPE = "ExceptionType";	// NOI18N
	static public final String LOCATION = "Location";	// NOI18N

	public ErrorPage() {
		this(Common.USE_DEFAULT_VALUES);
	}

	public ErrorPage(int options)
	{
		super(comparators, runtimeVersion);
		// Properties (see root bean comments for the bean graph)
		initPropertyTables(3);
		this.createProperty("error-code", 	// NOI18N
			ERROR_CODE, Common.SEQUENCE_OR | 
			Common.TYPE_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.Integer.class);
		this.createProperty("exception-type", 	// NOI18N
			EXCEPTION_TYPE, Common.SEQUENCE_OR | 
			Common.TYPE_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createProperty("location", 	// NOI18N
			LOCATION, 
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
	public void setErrorCode(java.lang.Integer value) {
		this.setValue(ERROR_CODE, value);
		if (value != null) {
			// It's a mutually exclusive property.
			setExceptionType(null);
		}
	}

	//
	public java.lang.Integer getErrorCode() {
		return (java.lang.Integer)this.getValue(ERROR_CODE);
	}

	// This attribute is mandatory
	public void setExceptionType(java.lang.String value) {
		this.setValue(EXCEPTION_TYPE, value);
		if (value != null) {
			// It's a mutually exclusive property.
			setErrorCode(null);
		}
	}

	//
	public java.lang.String getExceptionType() {
		return (java.lang.String)this.getValue(EXCEPTION_TYPE);
	}

	// This attribute is mandatory
	public void setLocation(java.lang.String value) {
		this.setValue(LOCATION, value);
	}

	//
	public java.lang.String getLocation() {
		return (java.lang.String)this.getValue(LOCATION);
	}

	//
	public static void addComparator(org.netbeans.modules.schema2beans.BeanComparator c) {
		comparators.add(c);
	}

	//
	public static void removeComparator(org.netbeans.modules.schema2beans.BeanComparator c) {
		comparators.remove(c);
	}

	
                public String getKeyProperty() { return "ErrorCode"; }
            
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
		// Validating property errorCode
		if (getErrorCode() != null) {
			{
				boolean patternPassed = false;
				if ((getErrorCode().toString()).matches("\\d{3}")) {
					patternPassed = true;
				}
				restrictionFailure = !patternPassed;
			}
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getErrorCode()", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "errorCode", this);	// NOI18N
			}
		}
		if (getErrorCode() != null) {
			if (getExceptionType() != null) {
				throw new org.netbeans.modules.schema2beans.ValidateException("mutually exclusive properties: ErrorCode and ExceptionType", org.netbeans.modules.schema2beans.ValidateException.FailureType.MUTUALLY_EXCLUSIVE, "ExceptionType", this);	// NOI18N
			}
		}
		// Validating property exceptionType
		if (getExceptionType() != null) {
			if (getErrorCode() != null) {
				throw new org.netbeans.modules.schema2beans.ValidateException("mutually exclusive properties: ExceptionType and ErrorCode", org.netbeans.modules.schema2beans.ValidateException.FailureType.MUTUALLY_EXCLUSIVE, "ErrorCode", this);	// NOI18N
			}
		}
		// Validating property location
		if (getLocation() == null) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getLocation() == null", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "location", this);	// NOI18N
		}
		{
			boolean patternPassed = false;
			if ((getLocation()).matches("/.*")) {
				patternPassed = true;
			}
			restrictionFailure = !patternPassed;
		}
		if (restrictionFailure) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getLocation()", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "location", this);	// NOI18N
		}
		if (getErrorCode() == null && getExceptionType() == null) {
			throw new org.netbeans.modules.schema2beans.ValidateException("required properties: getErrorCode() == null && getExceptionType() == null", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "ExceptionType", this);	// NOI18N
		}
	}

	// Dump the content of this bean returning it as a String
	public void dump(StringBuffer str, String indent){
		String s;
		Object o;
		org.netbeans.modules.schema2beans.BaseBean n;
		str.append(indent);
		str.append("ErrorCode");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getErrorCode();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(ERROR_CODE, 0, str, indent);

		str.append(indent);
		str.append("ExceptionType");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getExceptionType();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(EXCEPTION_TYPE, 0, str, indent);

		str.append(indent);
		str.append("Location");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getLocation();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(LOCATION, 0, str, indent);

	}
	public String dumpBeanNode(){
		StringBuffer str = new StringBuffer();
		str.append("ErrorPage\n");	// NOI18N
		this.dump(str, "\n  ");	// NOI18N
		return str.toString();
	}}

// END_NOI18N

