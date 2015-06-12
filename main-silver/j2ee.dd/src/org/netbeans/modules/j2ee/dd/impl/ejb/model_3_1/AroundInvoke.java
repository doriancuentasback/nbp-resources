/**
 *	This generated bean class AroundInvoke matches the schema element 'around-invokeType'.
 *  The root bean class is EjbJar
 *
 *	===============================================================
 *	
 *	
 *	        The around-invoke type specifies a method on a
 *	        class to be called during the around invoke portion of an 
 *	        ejb invocation.  Note that each class may have only one
 *	        around invoke method and that the method may not be
 *	        overloaded.
 *	        
 *	        If the class element is missing then
 *	        the class defining the callback is assumed to be the
 *	        interceptor class or component class in scope at the
 *	        location in the descriptor in which the around invoke
 *	        definition appears.
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

public class AroundInvoke extends org.netbeans.modules.schema2beans.BaseBean
	 implements org.netbeans.modules.j2ee.dd.api.ejb.AroundInvoke
{

	static Vector comparators = new Vector();
	private static final org.netbeans.modules.schema2beans.Version runtimeVersion = new org.netbeans.modules.schema2beans.Version(5, 0, 0);
	;	// NOI18N

	static public final String CLASS2 = "Class2";	// NOI18N
	static public final String METHOD_NAME = "MethodName";	// NOI18N

	public AroundInvoke() {
		this(Common.USE_DEFAULT_VALUES);
	}

	public AroundInvoke(int options)
	{
		super(comparators, runtimeVersion);
		// Properties (see root bean comments for the bean graph)
		initPropertyTables(2);
		this.createProperty("class", 	// NOI18N
			CLASS2, 
			Common.TYPE_0_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createProperty("method-name", 	// NOI18N
			METHOD_NAME, 
			Common.TYPE_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.initialize(options);
	}

	// Setting the default values of the properties
	void initialize(int options) {

	}

	// This attribute is optional
	public void setClass2(java.lang.String value) {
		this.setValue(CLASS2, value);
	}

	//
	public java.lang.String getClass2() {
		return (java.lang.String)this.getValue(CLASS2);
	}

	// This attribute is mandatory
	public void setMethodName(java.lang.String value) {
		this.setValue(METHOD_NAME, value);
	}

	//
	public java.lang.String getMethodName() {
		return (java.lang.String)this.getValue(METHOD_NAME);
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
		// Validating property class2
		// Validating property methodName
		if (getMethodName() == null) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getMethodName() == null", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "methodName", this);	// NOI18N
		}
		{
			boolean patternPassed = false;
			if ((getMethodName()).matches("($|_|\\p{L})(\\p{L}|\\p{Nd}|_|$)*")) {
				patternPassed = true;
			}
			restrictionFailure = !patternPassed;
		}
		if (restrictionFailure) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getMethodName()", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "methodName", this);	// NOI18N
		}
	}

	// Dump the content of this bean returning it as a String
	public void dump(StringBuffer str, String indent){
		String s;
		Object o;
		org.netbeans.modules.schema2beans.BaseBean n;
		str.append(indent);
		str.append("Class2");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getClass2();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(CLASS2, 0, str, indent);

		str.append(indent);
		str.append("MethodName");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getMethodName();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(METHOD_NAME, 0, str, indent);

	}
	public String dumpBeanNode(){
		StringBuffer str = new StringBuffer();
		str.append("AroundInvoke\n");	// NOI18N
		this.dump(str, "\n  ");	// NOI18N
		return str.toString();
	}}

// END_NOI18N

