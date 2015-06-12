/**
 *	This generated bean class SessionConfig matches the schema element 'session-configType'.
 *  The root bean class is WebApp
 *
 *	===============================================================
 *	
 *	
 *		The session-configType defines the session parameters
 *		for this web application.
 *	
 *		Used in: web-app
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

public class SessionConfig extends org.netbeans.modules.schema2beans.BaseBean
	 implements  
                org.netbeans.modules.j2ee.dd.api.web.SessionConfig
            
{

	static Vector comparators = new Vector();
	static{
		SessionConfig.addComparator(new org.netbeans.modules.j2ee.dd.impl.common.Comparator());
	}
	private static final org.netbeans.modules.schema2beans.Version runtimeVersion = new org.netbeans.modules.schema2beans.Version(5, 0, 0);
	;	// NOI18N

	static public final String ID = "Id";	// NOI18N
	static public final String SESSION_TIMEOUT = "SessionTimeout";	// NOI18N
	static public final String SESSIONTIMEOUTID = "SessionTimeoutId";	// NOI18N

	public SessionConfig() {
		this(Common.USE_DEFAULT_VALUES);
	}

	public SessionConfig(int options)
	{
		super(comparators, runtimeVersion);
		// Properties (see root bean comments for the bean graph)
		initPropertyTables(1);
		this.createProperty("session-timeout", 	// NOI18N
			SESSION_TIMEOUT, 
			Common.TYPE_0_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.math.BigInteger.class);
		this.createAttribute(SESSION_TIMEOUT, "id", "Id", 
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

	// This attribute is optional
	public void setSessionTimeout(java.math.BigInteger value) {
		this.setValue(SESSION_TIMEOUT, value);
	}

	//
	public java.math.BigInteger getSessionTimeout() {
		return (java.math.BigInteger)this.getValue(SESSION_TIMEOUT);
	}

	// This attribute is optional
	public void setSessionTimeoutId(java.lang.String value) {
		// Make sure we've got a place to put this attribute.
		if (size(SESSION_TIMEOUT) == 0) {
			setValue(SESSION_TIMEOUT, "");
		}
		setAttributeValue(SESSION_TIMEOUT, "Id", value);
	}

	//
	public java.lang.String getSessionTimeoutId() {
		// If our element does not exist, then the attribute does not exist.
		if (size(SESSION_TIMEOUT) == 0) {
			return null;
		} else {
			return getAttributeValue(SESSION_TIMEOUT, "Id");
		}
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
		// Validating property sessionTimeout
		// Validating property sessionTimeoutId
		if (getSessionTimeoutId() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getSessionTimeoutId() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "sessionTimeoutId", this);	// NOI18N
			}
		}
	}

	// Dump the content of this bean returning it as a String
	public void dump(StringBuffer str, String indent){
		String s;
		Object o;
		org.netbeans.modules.schema2beans.BaseBean n;
		str.append(indent);
		str.append("SessionTimeout");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getSessionTimeout();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(SESSION_TIMEOUT, 0, str, indent);

	}
	public String dumpBeanNode(){
		StringBuffer str = new StringBuffer();
		str.append("SessionConfig\n");	// NOI18N
		this.dump(str, "\n  ");	// NOI18N
		return str.toString();
	}}

// END_NOI18N

