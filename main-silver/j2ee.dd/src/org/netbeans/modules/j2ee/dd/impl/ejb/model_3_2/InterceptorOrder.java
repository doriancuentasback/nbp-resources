/**
 *	This generated bean class InterceptorOrder matches the schema element 'interceptor-orderType'.
 *  The root bean class is EjbJar
 *
 *	===============================================================
 *	
 *	
 *	        The interceptor-orderType element describes a total ordering
 *	        of interceptor classes.
 *	        
 *	      
 *	===============================================================
 * @Generated
 */

package org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2;

import org.w3c.dom.*;
import org.netbeans.modules.schema2beans.*;
import java.beans.*;
import java.util.*;

// BEGIN_NOI18N

public class InterceptorOrder extends org.netbeans.modules.schema2beans.BaseBean
	 implements org.netbeans.modules.j2ee.dd.api.ejb.InterceptorOrder
{

	static Vector comparators = new Vector();
	private static final org.netbeans.modules.schema2beans.Version runtimeVersion = new org.netbeans.modules.schema2beans.Version(5, 0, 0);
	;	// NOI18N

	static public final String ID = "Id";	// NOI18N
	static public final String INTERCEPTOR_CLASS = "InterceptorClass";	// NOI18N

	public InterceptorOrder() {
		this(Common.USE_DEFAULT_VALUES);
	}

	public InterceptorOrder(int options)
	{
		super(comparators, runtimeVersion);
		// Properties (see root bean comments for the bean graph)
		initPropertyTables(1);
		this.createProperty("interceptor-class", 	// NOI18N
			INTERCEPTOR_CLASS, 
			Common.TYPE_1_N | Common.TYPE_STRING | Common.TYPE_KEY, 
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

	// This attribute is an array containing at least one element
	public void setInterceptorClass(int index, java.lang.String value) {
		this.setValue(INTERCEPTOR_CLASS, index, value);
	}

	//
	public java.lang.String getInterceptorClass(int index) {
		return (java.lang.String)this.getValue(INTERCEPTOR_CLASS, index);
	}

	// Return the number of properties
	public int sizeInterceptorClass() {
		return this.size(INTERCEPTOR_CLASS);
	}

	// This attribute is an array containing at least one element
	public void setInterceptorClass(java.lang.String[] value) {
		this.setValue(INTERCEPTOR_CLASS, value);
	}

	//
	public java.lang.String[] getInterceptorClass() {
		return (java.lang.String[])this.getValues(INTERCEPTOR_CLASS);
	}

	// Add a new element returning its index in the list
	public int addInterceptorClass(java.lang.String value) {
		int positionOfNewItem = this.addValue(INTERCEPTOR_CLASS, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeInterceptorClass(java.lang.String value) {
		return this.removeValue(INTERCEPTOR_CLASS, value);
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
		// Validating property interceptorClass
		if (sizeInterceptorClass() == 0) {
			throw new org.netbeans.modules.schema2beans.ValidateException("sizeInterceptorClass() == 0", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "interceptorClass", this);	// NOI18N
		}
	}

	// Dump the content of this bean returning it as a String
	public void dump(StringBuffer str, String indent){
		String s;
		Object o;
		org.netbeans.modules.schema2beans.BaseBean n;
		str.append(indent);
		str.append("InterceptorClass["+this.sizeInterceptorClass()+"]");	// NOI18N
		for(int i=0; i<this.sizeInterceptorClass(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			str.append(indent+"\t");	// NOI18N
			str.append("<");	// NOI18N
			o = this.getInterceptorClass(i);
			str.append((o==null?"null":o.toString().trim()));	// NOI18N
			str.append(">\n");	// NOI18N
			this.dumpAttributes(INTERCEPTOR_CLASS, i, str, indent);
		}

	}
	public String dumpBeanNode(){
		StringBuffer str = new StringBuffer();
		str.append("InterceptorOrder\n");	// NOI18N
		this.dump(str, "\n  ");	// NOI18N
		return str.toString();
	}}

// END_NOI18N

