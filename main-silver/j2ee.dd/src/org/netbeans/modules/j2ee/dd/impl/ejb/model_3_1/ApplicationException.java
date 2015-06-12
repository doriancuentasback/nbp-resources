/**
 *	This generated bean class ApplicationException matches the schema element 'application-exceptionType'.
 *  The root bean class is EjbJar
 *
 *	===============================================================
 *	
 *	
 *	        The application-exceptionType declares an application
 *	        exception. The declaration consists of:
 *	        
 *	        - the exception class. When the container receives
 *	        an exception of this type, it is required to 
 *	        forward this exception as an applcation exception 
 *	        to the client regardless of whether it is a checked
 *	        or unchecked exception.
 *	        - an optional rollback element. If this element is 
 *	        set to true, the container must rollback the current 
 *	        transaction before forwarding the exception to the
 *	        client.  If not specified, it defaults to false.
 *	        - an optional inherited element. If this element is 
 *	        set to true, subclasses of the exception class type
 *	        are also automatically considered application 
 *	        exceptions (unless overriden at a lower level).
 *	        If set to false, only the exception class type is
 *	        considered an application-exception, not its
 *	        exception subclasses. If not specified, this
 *	        value defaults to true.
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

public class ApplicationException extends org.netbeans.modules.schema2beans.BaseBean
	 implements org.netbeans.modules.j2ee.dd.api.ejb.ApplicationException
{

	static Vector comparators = new Vector();
	private static final org.netbeans.modules.schema2beans.Version runtimeVersion = new org.netbeans.modules.schema2beans.Version(5, 0, 0);
	;	// NOI18N

	static public final String ID = "Id";	// NOI18N
	static public final String EXCEPTION_CLASS = "ExceptionClass";	// NOI18N
	static public final String ROLLBACK = "Rollback";	// NOI18N
	static public final String INHERITED = "Inherited";	// NOI18N

	public ApplicationException() {
		this(Common.USE_DEFAULT_VALUES);
	}

	public ApplicationException(int options)
	{
		super(comparators, runtimeVersion);
		// Properties (see root bean comments for the bean graph)
		initPropertyTables(3);
		this.createProperty("exception-class", 	// NOI18N
			EXCEPTION_CLASS, 
			Common.TYPE_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createProperty("rollback", 	// NOI18N
			ROLLBACK, 
			Common.TYPE_0_1 | Common.TYPE_BOOLEAN | Common.TYPE_SHOULD_NOT_BE_EMPTY | Common.TYPE_KEY, 
			Boolean.class);
		this.createProperty("inherited", 	// NOI18N
			INHERITED, 
			Common.TYPE_0_1 | Common.TYPE_BOOLEAN | Common.TYPE_SHOULD_NOT_BE_EMPTY | Common.TYPE_KEY, 
			Boolean.class);
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
	public void setExceptionClass(java.lang.String value) {
		this.setValue(EXCEPTION_CLASS, value);
	}

	//
	public java.lang.String getExceptionClass() {
		return (java.lang.String)this.getValue(EXCEPTION_CLASS);
	}

	// This attribute is optional
	public void setRollback(boolean value) {
		this.setValue(ROLLBACK, (value ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE));
	}

	//
	public boolean isRollback() {
		Boolean ret = (Boolean)this.getValue(ROLLBACK);
		if (ret == null)
			ret = (Boolean)Common.defaultScalarValue(Common.TYPE_BOOLEAN);
		return ((java.lang.Boolean)ret).booleanValue();
	}

	// This attribute is optional
	public void setInherited(boolean value) {
		this.setValue(INHERITED, (value ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE));
	}

	//
	public boolean isInherited() {
		Boolean ret = (Boolean)this.getValue(INHERITED);
		if (ret == null)
			ret = (Boolean)Common.defaultScalarValue(Common.TYPE_BOOLEAN);
		return ((java.lang.Boolean)ret).booleanValue();
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
		// Validating property exceptionClass
		if (getExceptionClass() == null) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getExceptionClass() == null", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "exceptionClass", this);	// NOI18N
		}
		// Validating property rollback
		{
			boolean patternPassed = false;
			if ((isRollback() ? "true" : "false").matches("(true|false)")) {
				patternPassed = true;
			}
			restrictionFailure = !patternPassed;
		}
		if (restrictionFailure) {
			throw new org.netbeans.modules.schema2beans.ValidateException("isRollback()", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "rollback", this);	// NOI18N
		}
		// Validating property inherited
		{
			boolean patternPassed = false;
			if ((isInherited() ? "true" : "false").matches("(true|false)")) {
				patternPassed = true;
			}
			restrictionFailure = !patternPassed;
		}
		if (restrictionFailure) {
			throw new org.netbeans.modules.schema2beans.ValidateException("isInherited()", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "inherited", this);	// NOI18N
		}
	}

	// Dump the content of this bean returning it as a String
	public void dump(StringBuffer str, String indent){
		String s;
		Object o;
		org.netbeans.modules.schema2beans.BaseBean n;
		str.append(indent);
		str.append("ExceptionClass");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getExceptionClass();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(EXCEPTION_CLASS, 0, str, indent);

		str.append(indent);
		str.append("Rollback");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append((this.isRollback()?"true":"false"));
		this.dumpAttributes(ROLLBACK, 0, str, indent);

		str.append(indent);
		str.append("Inherited");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append((this.isInherited()?"true":"false"));
		this.dumpAttributes(INHERITED, 0, str, indent);

	}
	public String dumpBeanNode(){
		StringBuffer str = new StringBuffer();
		str.append("ApplicationException\n");	// NOI18N
		this.dump(str, "\n  ");	// NOI18N
		return str.toString();
	}}

// END_NOI18N

