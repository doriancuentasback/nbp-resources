/**
 *	This generated bean class InjectionTarget matches the schema element 'injection-targetType'.
 *  The root bean class is WebApp
 *
 *	===============================================================
 *	
 *	
 *		An injection target specifies a class and a name within
 *		that class into which a resource should be injected.
 *	
 *		The injection target class specifies the fully qualified
 *		class name that is the target of the injection.  The
 *		Java EE specifications describe which classes can be an
 *		injection target.
 *	
 *		The injection target name specifies the target within
 *		the specified class.  The target is first looked for as a
 *		JavaBeans property name.  If not found, the target is
 *		looked for as a field name.
 *	
 *		The specified resource will be injected into the target
 *		during initialization of the class by either calling the
 *		set method for the target property or by setting a value
 *		into the named field.
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

public class InjectionTarget extends org.netbeans.modules.j2ee.dd.impl.common.EnclosingBean
	 implements org.netbeans.modules.j2ee.dd.api.common.InjectionTarget
{

	static Vector comparators = new Vector();
	private static final org.netbeans.modules.schema2beans.Version runtimeVersion = new org.netbeans.modules.schema2beans.Version(5, 0, 0);
	;	// NOI18N

	static public final String INJECTION_TARGET_CLASS = "InjectionTargetClass";	// NOI18N
	static public final String INJECTION_TARGET_NAME = "InjectionTargetName";	// NOI18N

	public InjectionTarget() {
		this(Common.USE_DEFAULT_VALUES);
	}

	public InjectionTarget(int options)
	{
		super(comparators, runtimeVersion);
		// Properties (see root bean comments for the bean graph)
		initPropertyTables(2);
		this.createProperty("injection-target-class", 	// NOI18N
			INJECTION_TARGET_CLASS, 
			Common.TYPE_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createProperty("injection-target-name", 	// NOI18N
			INJECTION_TARGET_NAME, 
			Common.TYPE_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.initialize(options);
	}

	// Setting the default values of the properties
	void initialize(int options) {

	}

	// This attribute is mandatory
	public void setInjectionTargetClass(java.lang.String value) {
		this.setValue(INJECTION_TARGET_CLASS, value);
	}

	//
	public java.lang.String getInjectionTargetClass() {
		return (java.lang.String)this.getValue(INJECTION_TARGET_CLASS);
	}

	// This attribute is mandatory
	public void setInjectionTargetName(java.lang.String value) {
		this.setValue(INJECTION_TARGET_NAME, value);
	}

	//
	public java.lang.String getInjectionTargetName() {
		return (java.lang.String)this.getValue(INJECTION_TARGET_NAME);
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
		// Validating property injectionTargetClass
		if (getInjectionTargetClass() == null) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getInjectionTargetClass() == null", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "injectionTargetClass", this);	// NOI18N
		}
		// Validating property injectionTargetName
		if (getInjectionTargetName() == null) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getInjectionTargetName() == null", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "injectionTargetName", this);	// NOI18N
		}
		{
			boolean patternPassed = false;
			if ((getInjectionTargetName()).matches("($|_|\\p{L})(\\p{L}|\\p{Nd}|_|$)*")) {
				patternPassed = true;
			}
			restrictionFailure = !patternPassed;
		}
		if (restrictionFailure) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getInjectionTargetName()", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "injectionTargetName", this);	// NOI18N
		}
	}

	// Dump the content of this bean returning it as a String
	public void dump(StringBuffer str, String indent){
		String s;
		Object o;
		org.netbeans.modules.schema2beans.BaseBean n;
		str.append(indent);
		str.append("InjectionTargetClass");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getInjectionTargetClass();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(INJECTION_TARGET_CLASS, 0, str, indent);

		str.append(indent);
		str.append("InjectionTargetName");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getInjectionTargetName();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(INJECTION_TARGET_NAME, 0, str, indent);

	}
	public String dumpBeanNode(){
		StringBuffer str = new StringBuffer();
		str.append("InjectionTarget\n");	// NOI18N
		this.dump(str, "\n  ");	// NOI18N
		return str.toString();
	}}

// END_NOI18N

