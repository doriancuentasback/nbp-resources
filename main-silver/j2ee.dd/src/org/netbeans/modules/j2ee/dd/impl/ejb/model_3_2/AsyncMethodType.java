/**
 *	This generated bean class AsyncMethodType matches the schema element 'async-methodType'.
 *  The root bean class is EjbJar
 *
 *	===============================================================
 *	
 *	
 *	        The async-methodType element specifies that a session
 *	        bean method has asynchronous invocation semantics.
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

public class AsyncMethodType extends org.netbeans.modules.schema2beans.BaseBean
{

	static Vector comparators = new Vector();
	private static final org.netbeans.modules.schema2beans.Version runtimeVersion = new org.netbeans.modules.schema2beans.Version(5, 0, 0);
	;	// NOI18N

	static public final String ID = "Id";	// NOI18N
	static public final String METHOD_NAME = "MethodName";	// NOI18N
	static public final String METHODNAMEID = "MethodNameId";	// NOI18N
	static public final String METHOD_PARAMS = "MethodParams";	// NOI18N

	public AsyncMethodType() {
		this(Common.USE_DEFAULT_VALUES);
	}

	public AsyncMethodType(int options)
	{
		super(comparators, runtimeVersion);
		// Properties (see root bean comments for the bean graph)
		initPropertyTables(2);
		this.createProperty("method-name", 	// NOI18N
			METHOD_NAME, 
			Common.TYPE_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createAttribute(METHOD_NAME, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("method-params", 	// NOI18N
			METHOD_PARAMS, 
			Common.TYPE_0_1 | Common.TYPE_BEAN | Common.TYPE_KEY, 
			MethodParams.class);
		this.createAttribute(METHOD_PARAMS, "id", "Id", 
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

	// This attribute is mandatory
	public void setMethodName(java.lang.String value) {
		this.setValue(METHOD_NAME, value);
	}

	//
	public java.lang.String getMethodName() {
		return (java.lang.String)this.getValue(METHOD_NAME);
	}

	// This attribute is optional
	public void setMethodNameId(java.lang.String value) {
		// Make sure we've got a place to put this attribute.
		if (size(METHOD_NAME) == 0) {
			setValue(METHOD_NAME, "");
		}
		setAttributeValue(METHOD_NAME, "Id", value);
	}

	//
	public java.lang.String getMethodNameId() {
		// If our element does not exist, then the attribute does not exist.
		if (size(METHOD_NAME) == 0) {
			return null;
		} else {
			return getAttributeValue(METHOD_NAME, "Id");
		}
	}

	// This attribute is optional
	public void setMethodParams(org.netbeans.modules.j2ee.dd.api.ejb.MethodParams valueInterface) {
		MethodParams value = (MethodParams) valueInterface;
		this.setValue(METHOD_PARAMS, value);
	}

	//
	public org.netbeans.modules.j2ee.dd.api.ejb.MethodParams getMethodParams() {
		return (MethodParams)this.getValue(METHOD_PARAMS);
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public org.netbeans.modules.j2ee.dd.api.ejb.MethodParams newMethodParams() {
		return new MethodParams();
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
		// Validating property methodName
		if (getMethodName() == null) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getMethodName() == null", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "methodName", this);	// NOI18N
		}
		// has whitespace restriction
		if (restrictionFailure) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getMethodName() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "methodName", this);	// NOI18N
		}
		// Validating property methodNameId
		if (getMethodNameId() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getMethodNameId() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "methodNameId", this);	// NOI18N
			}
		}
		// Validating property methodParams
		if (getMethodParams() != null) {
			((MethodParams)getMethodParams()).validate();
		}
	}

	// Dump the content of this bean returning it as a String
	public void dump(StringBuffer str, String indent){
		String s;
		Object o;
		org.netbeans.modules.schema2beans.BaseBean n;
		str.append(indent);
		str.append("MethodName");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getMethodName();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(METHOD_NAME, 0, str, indent);

		str.append(indent);
		str.append("MethodParams");	// NOI18N
		n = (org.netbeans.modules.schema2beans.BaseBean) this.getMethodParams();
		if (n != null)
			n.dump(str, indent + "\t");	// NOI18N
		else
			str.append(indent+"\tnull");	// NOI18N
		this.dumpAttributes(METHOD_PARAMS, 0, str, indent);

	}
	public String dumpBeanNode(){
		StringBuffer str = new StringBuffer();
		str.append("AsyncMethodType\n");	// NOI18N
		this.dump(str, "\n  ");	// NOI18N
		return str.toString();
	}}

// END_NOI18N

