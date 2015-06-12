/**
 *	This generated bean class StatefulTimeoutType matches the schema element 'stateful-timeoutType'.
 *  The root bean class is EjbJar
 *
 *	===============================================================
 *	
 *	
 *	        The stateful-timeoutType represents the amount of time
 *	        a stateful session bean can be idle(not receive any client
 *	        invocations) before it is eligible for removal by the container.
 *	        
 *	        A timeout value of 0 means the bean is immediately eligible for removal.
 *	        
 *	        A timeout value of -1 means the bean will never be removed due to timeout.
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

public class StatefulTimeoutType extends org.netbeans.modules.schema2beans.BaseBean
{

	static Vector comparators = new Vector();
	private static final org.netbeans.modules.schema2beans.Version runtimeVersion = new org.netbeans.modules.schema2beans.Version(5, 0, 0);
	;	// NOI18N

	static public final String ID = "Id";	// NOI18N
	static public final String TIMEOUT = "Timeout";	// NOI18N
	static public final String TIMEOUTID = "TimeoutId";	// NOI18N
	static public final String UNIT = "Unit";	// NOI18N

	public StatefulTimeoutType() {
		this(Common.USE_DEFAULT_VALUES);
	}

	public StatefulTimeoutType(int options)
	{
		super(comparators, runtimeVersion);
		// Properties (see root bean comments for the bean graph)
		initPropertyTables(2);
		this.createProperty("timeout", 	// NOI18N
			TIMEOUT, 
			Common.TYPE_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.math.BigInteger.class);
		this.createAttribute(TIMEOUT, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("unit", 	// NOI18N
			UNIT, 
			Common.TYPE_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.initialize(options);
	}

	// Setting the default values of the properties
	void initialize(int options) {
		if ((options & Common.USE_DEFAULT_VALUES) == Common.USE_DEFAULT_VALUES) {
			setUnit("Days");
		}

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
	public void setTimeout(java.math.BigInteger value) {
		this.setValue(TIMEOUT, value);
	}

	//
	public java.math.BigInteger getTimeout() {
		return (java.math.BigInteger)this.getValue(TIMEOUT);
	}

	// This attribute is optional
	public void setTimeoutId(java.lang.String value) {
		// Make sure we've got a place to put this attribute.
		if (size(TIMEOUT) == 0) {
			setValue(TIMEOUT, "");
		}
		setAttributeValue(TIMEOUT, "Id", value);
	}

	//
	public java.lang.String getTimeoutId() {
		// If our element does not exist, then the attribute does not exist.
		if (size(TIMEOUT) == 0) {
			return null;
		} else {
			return getAttributeValue(TIMEOUT, "Id");
		}
	}

	// This attribute is mandatory
	public void setUnit(java.lang.String value) {
		this.setValue(UNIT, value);
	}

	//
	public java.lang.String getUnit() {
		return (java.lang.String)this.getValue(UNIT);
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
		// Validating property timeout
		if (getTimeout() == null) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getTimeout() == null", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "timeout", this);	// NOI18N
		}
		// Validating property timeoutId
		if (getTimeoutId() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getTimeoutId() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "timeoutId", this);	// NOI18N
			}
		}
		// Validating property unit
		if (getUnit() == null) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getUnit() == null", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "unit", this);	// NOI18N
		}
		final java.lang.String[] enumRestrictionUnit = {"Days", "Hours", "Minutes", "Seconds", "Milliseconds", "Microseconds", "Nanoseconds"};
		restrictionFailure = true;
		for (int _index2 = 0; _index2 < enumRestrictionUnit.length; 
			++_index2) {
			if (enumRestrictionUnit[_index2].equals(getUnit())) {
				restrictionFailure = false;
				break;
			}
		}
		if (restrictionFailure) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getUnit() enumeration test", org.netbeans.modules.schema2beans.ValidateException.FailureType.ENUM_RESTRICTION, "unit", this);	// NOI18N
		}
	}

	// Dump the content of this bean returning it as a String
	public void dump(StringBuffer str, String indent){
		String s;
		Object o;
		org.netbeans.modules.schema2beans.BaseBean n;
		str.append(indent);
		str.append("Timeout");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getTimeout();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(TIMEOUT, 0, str, indent);

		str.append(indent);
		str.append("Unit");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getUnit();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(UNIT, 0, str, indent);

	}
	public String dumpBeanNode(){
		StringBuffer str = new StringBuffer();
		str.append("StatefulTimeoutType\n");	// NOI18N
		this.dump(str, "\n  ");	// NOI18N
		return str.toString();
	}}

// END_NOI18N

