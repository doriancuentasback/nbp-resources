/**
 *	This generated bean class MethodParams matches the schema element 'method-paramsType'.
 *  The root bean class is EjbJar
 *
 *	===============================================================
 *	
 *	
 *	        The method-paramsType defines a list of the
 *	        fully-qualified Java type names of the method parameters.
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

public class MethodParams extends org.netbeans.modules.j2ee.dd.impl.common.EnclosingBean
	 implements org.netbeans.modules.j2ee.dd.api.ejb.MethodParams
{

	static Vector comparators = new Vector();
	private static final org.netbeans.modules.schema2beans.Version runtimeVersion = new org.netbeans.modules.schema2beans.Version(5, 0, 0);
	;	// NOI18N

	static public final String ID = "Id";	// NOI18N
	static public final String METHOD_PARAM = "MethodParam";	// NOI18N

	public MethodParams() {
		this(Common.USE_DEFAULT_VALUES);
	}

	public MethodParams(int options)
	{
		super(comparators, runtimeVersion);
		// Properties (see root bean comments for the bean graph)
		initPropertyTables(1);
		this.createProperty("method-param", 	// NOI18N
			METHOD_PARAM, 
			Common.TYPE_0_N | Common.TYPE_STRING | Common.TYPE_KEY, 
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

	// This attribute is an array, possibly empty
	public void setMethodParam(int index, java.lang.String value) {
		this.setValue(METHOD_PARAM, index, value);
	}

	//
	public java.lang.String getMethodParam(int index) {
		return (java.lang.String)this.getValue(METHOD_PARAM, index);
	}

	// Return the number of properties
	public int sizeMethodParam() {
		return this.size(METHOD_PARAM);
	}

	// This attribute is an array, possibly empty
	public void setMethodParam(java.lang.String[] value) {
		this.setValue(METHOD_PARAM, value);
	}

	//
	public java.lang.String[] getMethodParam() {
		return (java.lang.String[])this.getValues(METHOD_PARAM);
	}

	// Add a new element returning its index in the list
	public int addMethodParam(java.lang.String value) {
		int positionOfNewItem = this.addValue(METHOD_PARAM, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeMethodParam(java.lang.String value) {
		return this.removeValue(METHOD_PARAM, value);
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
		// Validating property methodParam
		for (int _index = 0; _index < sizeMethodParam(); ++_index) {
			java.lang.String element = getMethodParam(_index);
			if (element != null) {
				{
					boolean patternPassed = false;
					if ((element).matches("[^\\p{Z}]*")) {
						patternPassed = true;
					}
					restrictionFailure = !patternPassed;
				}
				if (restrictionFailure) {
					throw new org.netbeans.modules.schema2beans.ValidateException("element", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "methodParam", this);	// NOI18N
				}
			}
		}
	}

	// Dump the content of this bean returning it as a String
	public void dump(StringBuffer str, String indent){
		String s;
		Object o;
		org.netbeans.modules.schema2beans.BaseBean n;
		str.append(indent);
		str.append("MethodParam["+this.sizeMethodParam()+"]");	// NOI18N
		for(int i=0; i<this.sizeMethodParam(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			str.append(indent+"\t");	// NOI18N
			str.append("<");	// NOI18N
			o = this.getMethodParam(i);
			str.append((o==null?"null":o.toString().trim()));	// NOI18N
			str.append(">\n");	// NOI18N
			this.dumpAttributes(METHOD_PARAM, i, str, indent);
		}

	}
	public String dumpBeanNode(){
		StringBuffer str = new StringBuffer();
		str.append("MethodParams\n");	// NOI18N
		this.dump(str, "\n  ");	// NOI18N
		return str.toString();
	}}

// END_NOI18N

