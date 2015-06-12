/**
 *	This generated bean class RemoveMethod matches the schema element 'remove-methodType'.
 *  The root bean class is EjbJar
 *
 *	===============================================================
 *	
 *	
 *		    The remove-method element specifies the mappings for
 *		    EJB 2.x style remove methods for an EJB 3.0 bean.
 *		    This element can only be specified for stateful
 *	            session beans.
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

public class RemoveMethod extends org.netbeans.modules.schema2beans.BaseBean
	 implements org.netbeans.modules.j2ee.dd.api.ejb.RemoveMethod
{

	static Vector comparators = new Vector();
	private static final org.netbeans.modules.schema2beans.Version runtimeVersion = new org.netbeans.modules.schema2beans.Version(5, 0, 0);
	;	// NOI18N

	static public final String ID = "Id";	// NOI18N
	static public final String BEAN_METHOD = "BeanMethod";	// NOI18N
	static public final String RETAIN_IF_EXCEPTION = "RetainIfException";	// NOI18N

	public RemoveMethod() {
		this(Common.USE_DEFAULT_VALUES);
	}

	public RemoveMethod(int options)
	{
		super(comparators, runtimeVersion);
		// Properties (see root bean comments for the bean graph)
		initPropertyTables(2);
		this.createProperty("bean-method", 	// NOI18N
			BEAN_METHOD, 
			Common.TYPE_1 | Common.TYPE_BEAN | Common.TYPE_KEY, 
			NamedMethod.class);
		this.createAttribute(BEAN_METHOD, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("retain-if-exception", 	// NOI18N
			RETAIN_IF_EXCEPTION, 
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
	public void setBeanMethod(org.netbeans.modules.j2ee.dd.api.ejb.NamedMethod valueInterface) {
		NamedMethod value = (NamedMethod) valueInterface;
		this.setValue(BEAN_METHOD, value);
	}

	//
	public org.netbeans.modules.j2ee.dd.api.ejb.NamedMethod getBeanMethod() {
		return (NamedMethod)this.getValue(BEAN_METHOD);
	}

	// This attribute is optional
	public void setRetainIfException(boolean value) {
		this.setValue(RETAIN_IF_EXCEPTION, (value ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE));
	}

	//
	public boolean isRetainIfException() {
		Boolean ret = (Boolean)this.getValue(RETAIN_IF_EXCEPTION);
		if (ret == null)
			ret = (Boolean)Common.defaultScalarValue(Common.TYPE_BOOLEAN);
		return ((java.lang.Boolean)ret).booleanValue();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public org.netbeans.modules.j2ee.dd.api.ejb.NamedMethod newNamedMethod() {
		return new NamedMethod();
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
		// Validating property beanMethod
		if (getBeanMethod() == null) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getBeanMethod() == null", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "beanMethod", this);	// NOI18N
		}
		((NamedMethod)getBeanMethod()).validate();
		// Validating property retainIfException
		{
			boolean patternPassed = false;
			if ((isRetainIfException() ? "true" : "false").matches("(true|false)")) {
				patternPassed = true;
			}
			restrictionFailure = !patternPassed;
		}
		if (restrictionFailure) {
			throw new org.netbeans.modules.schema2beans.ValidateException("isRetainIfException()", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "retainIfException", this);	// NOI18N
		}
	}

	// Dump the content of this bean returning it as a String
	public void dump(StringBuffer str, String indent){
		String s;
		Object o;
		org.netbeans.modules.schema2beans.BaseBean n;
		str.append(indent);
		str.append("BeanMethod");	// NOI18N
		n = (org.netbeans.modules.schema2beans.BaseBean) this.getBeanMethod();
		if (n != null)
			n.dump(str, indent + "\t");	// NOI18N
		else
			str.append(indent+"\tnull");	// NOI18N
		this.dumpAttributes(BEAN_METHOD, 0, str, indent);

		str.append(indent);
		str.append("RetainIfException");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append((this.isRetainIfException()?"true":"false"));
		this.dumpAttributes(RETAIN_IF_EXCEPTION, 0, str, indent);

	}
	public String dumpBeanNode(){
		StringBuffer str = new StringBuffer();
		str.append("RemoveMethod\n");	// NOI18N
		this.dump(str, "\n  ");	// NOI18N
		return str.toString();
	}}

// END_NOI18N

