/**
 *	This generated bean class ConcurrentMethodType matches the schema element 'concurrent-methodType'.
 *  The root bean class is EjbJar
 *
 *	===============================================================
 *	
 *	
 *	        The concurrent-methodType specifies information about a method
 *	        of a bean with container managed concurrency.
 *	        
 *	        The optional lock element specifies the kind of concurrency 
 *	        lock asssociated with the method.
 *	        
 *	        The optional access-timeout element specifies the amount of
 *	        time (in a given time unit) the container should wait for a
 *	        concurrency lock before throwing an exception to the client.
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

public class ConcurrentMethodType extends org.netbeans.modules.schema2beans.BaseBean
{

	static Vector comparators = new Vector();
	private static final org.netbeans.modules.schema2beans.Version runtimeVersion = new org.netbeans.modules.schema2beans.Version(5, 0, 0);
	;	// NOI18N

	static public final String ID = "Id";	// NOI18N
	static public final String METHOD = "Method";	// NOI18N
	static public final String LOCK = "Lock";	// NOI18N
	static public final String ACCESS_TIMEOUT = "AccessTimeout";	// NOI18N

	public ConcurrentMethodType() {
		this(Common.USE_DEFAULT_VALUES);
	}

	public ConcurrentMethodType(int options)
	{
		super(comparators, runtimeVersion);
		// Properties (see root bean comments for the bean graph)
		initPropertyTables(3);
		this.createProperty("method", 	// NOI18N
			METHOD, 
			Common.TYPE_1 | Common.TYPE_BEAN | Common.TYPE_KEY, 
			NamedMethod.class);
		this.createAttribute(METHOD, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("lock", 	// NOI18N
			LOCK, 
			Common.TYPE_0_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createProperty("access-timeout", 	// NOI18N
			ACCESS_TIMEOUT, 
			Common.TYPE_0_1 | Common.TYPE_BEAN | Common.TYPE_KEY, 
			AccessTimeoutType.class);
		this.createAttribute(ACCESS_TIMEOUT, "id", "Id", 
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
	public void setMethod(org.netbeans.modules.j2ee.dd.api.ejb.NamedMethod valueInterface) {
		NamedMethod value = (NamedMethod) valueInterface;
		this.setValue(METHOD, value);
	}

	//
	public org.netbeans.modules.j2ee.dd.api.ejb.NamedMethod getMethod() {
		return (NamedMethod)this.getValue(METHOD);
	}

	// This attribute is optional
	public void setLock(java.lang.String value) {
		this.setValue(LOCK, value);
	}

	//
	public java.lang.String getLock() {
		return (java.lang.String)this.getValue(LOCK);
	}

	// This attribute is optional
	public void setAccessTimeout(AccessTimeoutType value) {
		this.setValue(ACCESS_TIMEOUT, value);
	}

	//
	public AccessTimeoutType getAccessTimeout() {
		return (AccessTimeoutType)this.getValue(ACCESS_TIMEOUT);
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public org.netbeans.modules.j2ee.dd.api.ejb.NamedMethod newNamedMethod() {
		return new NamedMethod();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public AccessTimeoutType newAccessTimeoutType() {
		return new AccessTimeoutType();
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
		// Validating property method
		if (getMethod() == null) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getMethod() == null", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "method", this);	// NOI18N
		}
		((NamedMethod)getMethod()).validate();
		// Validating property lock
		if (getLock() != null) {
			final java.lang.String[] enumRestrictionLock = {"Read", "Write"};
			restrictionFailure = true;
			for (int _index2 = 0; _index2 < enumRestrictionLock.length; 
				++_index2) {
				if (enumRestrictionLock[_index2].equals(getLock())) {
					restrictionFailure = false;
					break;
				}
			}
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getLock() enumeration test", org.netbeans.modules.schema2beans.ValidateException.FailureType.ENUM_RESTRICTION, "lock", this);	// NOI18N
			}
		}
		// Validating property accessTimeout
		if (getAccessTimeout() != null) {
			getAccessTimeout().validate();
		}
	}

	// Dump the content of this bean returning it as a String
	public void dump(StringBuffer str, String indent){
		String s;
		Object o;
		org.netbeans.modules.schema2beans.BaseBean n;
		str.append(indent);
		str.append("Method");	// NOI18N
		n = (org.netbeans.modules.schema2beans.BaseBean) this.getMethod();
		if (n != null)
			n.dump(str, indent + "\t");	// NOI18N
		else
			str.append(indent+"\tnull");	// NOI18N
		this.dumpAttributes(METHOD, 0, str, indent);

		str.append(indent);
		str.append("Lock");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getLock();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(LOCK, 0, str, indent);

		str.append(indent);
		str.append("AccessTimeout");	// NOI18N
		n = (org.netbeans.modules.schema2beans.BaseBean) this.getAccessTimeout();
		if (n != null)
			n.dump(str, indent + "\t");	// NOI18N
		else
			str.append(indent+"\tnull");	// NOI18N
		this.dumpAttributes(ACCESS_TIMEOUT, 0, str, indent);

	}
	public String dumpBeanNode(){
		StringBuffer str = new StringBuffer();
		str.append("ConcurrentMethodType\n");	// NOI18N
		this.dump(str, "\n  ");	// NOI18N
		return str.toString();
	}}

// END_NOI18N

