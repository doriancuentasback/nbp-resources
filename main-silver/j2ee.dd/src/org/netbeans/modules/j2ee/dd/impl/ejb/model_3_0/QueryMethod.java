/**
 *	This generated bean class QueryMethod matches the schema element 'query-methodType'.
 *  The root bean class is EjbJar
 *
 *	===============================================================
 *	
 *		
 *	
 *		  The query-method specifies the method for a finder or select
 *		  query.
 *	
 *		  The method-name element specifies the name of a finder or select
 *		  method in the entity bean's implementation class.
 *	
 *		  Each method-param must be defined for a query-method using the
 *		  method-params element.
 *	
 *		  It is used by the query-method element.
 *	
 *		  Example:
 *	
 *		  <query>
 *		      <description>Method finds large orders</description>
 *		      <query-method>
 *			  <method-name>findLargeOrders</method-name>
 *			  <method-params></method-params>
 *		      </query-method>
 *		      <ejb-ql>
 *			SELECT OBJECT(o) FROM Order o
 *			  WHERE o.amount &gt; 1000
 *		      </ejb-ql>
 *		  </query>
 *	
 *		  
 *	      
 *	===============================================================
 * @Generated
 */

package org.netbeans.modules.j2ee.dd.impl.ejb.model_3_0;

import org.w3c.dom.*;
import org.netbeans.modules.schema2beans.*;
import java.beans.*;
import java.util.*;

// BEGIN_NOI18N

public class QueryMethod extends org.netbeans.modules.j2ee.dd.impl.common.EnclosingBean
	 implements org.netbeans.modules.j2ee.dd.api.ejb.QueryMethod
{

	static Vector comparators = new Vector();
	private static final org.netbeans.modules.schema2beans.Version runtimeVersion = new org.netbeans.modules.schema2beans.Version(5, 0, 0);
	;	// NOI18N

	static public final String ID = "Id";	// NOI18N
	static public final String METHOD_NAME = "MethodName";	// NOI18N
	static public final String METHOD_PARAMS = "MethodParams";	// NOI18N

	public QueryMethod() {
		this(Common.USE_DEFAULT_VALUES);
	}

	public QueryMethod(int options)
	{
		super(comparators, runtimeVersion);
		// Properties (see root bean comments for the bean graph)
		initPropertyTables(2);
		this.createProperty("method-name", 	// NOI18N
			METHOD_NAME, 
			Common.TYPE_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createProperty("method-params", 	// NOI18N
			METHOD_PARAMS, 
			Common.TYPE_1 | Common.TYPE_BEAN | Common.TYPE_KEY, 
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

	// This attribute is mandatory
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
		// Validating property methodParams
		if (getMethodParams() == null) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getMethodParams() == null", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "methodParams", this);	// NOI18N
		}
		((MethodParams)getMethodParams()).validate();
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
		str.append("QueryMethod\n");	// NOI18N
		this.dump(str, "\n  ");	// NOI18N
		return str.toString();
	}}

// END_NOI18N

