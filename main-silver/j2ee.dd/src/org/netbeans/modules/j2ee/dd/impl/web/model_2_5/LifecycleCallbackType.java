/**
 *	This generated bean class LifecycleCallbackType matches the schema element 'lifecycle-callbackType'.
 *  The root bean class is WebApp
 *
 *	===============================================================
 *	
 *	
 *		The lifecycle-callback type specifies a method on a
 *		class to be called when a lifecycle event occurs.
 *		Note that each class may have only one lifecycle callback
 *	        method for any given event and that the method may not
 *		be overloaded.
 *	
 *	        If the lifefycle-callback-class element is missing then
 *	        the class defining the callback is assumed to be the
 *	        component class in scope at the place in the descriptor
 *	        in which the callback definition appears.
 *	
 *	      
 *	===============================================================
 * @Generated
 */

package org.netbeans.modules.j2ee.dd.impl.web.model_2_5;

import org.w3c.dom.*;
import org.netbeans.modules.schema2beans.*;
import java.beans.*;
import java.util.*;

// BEGIN_NOI18N

public class LifecycleCallbackType extends org.netbeans.modules.schema2beans.BaseBean
{

	static Vector comparators = new Vector();
	private static final org.netbeans.modules.schema2beans.Version runtimeVersion = new org.netbeans.modules.schema2beans.Version(5, 0, 0);
	;	// NOI18N

	static public final String LIFECYCLE_CALLBACK_CLASS = "LifecycleCallbackClass";	// NOI18N
	static public final String LIFECYCLE_CALLBACK_METHOD = "LifecycleCallbackMethod";	// NOI18N

	public LifecycleCallbackType() {
		this(Common.USE_DEFAULT_VALUES);
	}

	public LifecycleCallbackType(int options)
	{
		super(comparators, runtimeVersion);
		// Properties (see root bean comments for the bean graph)
		initPropertyTables(2);
		this.createProperty("lifecycle-callback-class", 	// NOI18N
			LIFECYCLE_CALLBACK_CLASS, 
			Common.TYPE_0_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createProperty("lifecycle-callback-method", 	// NOI18N
			LIFECYCLE_CALLBACK_METHOD, 
			Common.TYPE_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.initialize(options);
	}

	// Setting the default values of the properties
	void initialize(int options) {

	}

	// This attribute is optional
	public void setLifecycleCallbackClass(java.lang.String value) {
		this.setValue(LIFECYCLE_CALLBACK_CLASS, value);
	}

	//
	public java.lang.String getLifecycleCallbackClass() {
		return (java.lang.String)this.getValue(LIFECYCLE_CALLBACK_CLASS);
	}

	// This attribute is mandatory
	public void setLifecycleCallbackMethod(java.lang.String value) {
		this.setValue(LIFECYCLE_CALLBACK_METHOD, value);
	}

	//
	public java.lang.String getLifecycleCallbackMethod() {
		return (java.lang.String)this.getValue(LIFECYCLE_CALLBACK_METHOD);
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
		// Validating property lifecycleCallbackClass
		// Validating property lifecycleCallbackMethod
		if (getLifecycleCallbackMethod() == null) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getLifecycleCallbackMethod() == null", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "lifecycleCallbackMethod", this);	// NOI18N
		}
		{
			boolean patternPassed = false;
			if ((getLifecycleCallbackMethod()).matches("($|_|\\p{L})(\\p{L}|\\p{Nd}|_|$)*")) {
				patternPassed = true;
			}
			restrictionFailure = !patternPassed;
		}
		if (restrictionFailure) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getLifecycleCallbackMethod()", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "lifecycleCallbackMethod", this);	// NOI18N
		}
	}

	// Dump the content of this bean returning it as a String
	public void dump(StringBuffer str, String indent){
		String s;
		Object o;
		org.netbeans.modules.schema2beans.BaseBean n;
		str.append(indent);
		str.append("LifecycleCallbackClass");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getLifecycleCallbackClass();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(LIFECYCLE_CALLBACK_CLASS, 0, str, indent);

		str.append(indent);
		str.append("LifecycleCallbackMethod");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getLifecycleCallbackMethod();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(LIFECYCLE_CALLBACK_METHOD, 0, str, indent);

	}
	public String dumpBeanNode(){
		StringBuffer str = new StringBuffer();
		str.append("LifecycleCallbackType\n");	// NOI18N
		this.dump(str, "\n  ");	// NOI18N
		return str.toString();
	}}

// END_NOI18N

