/**
 *	This generated bean class ServiceRefHandlerChainType matches the schema element 'handler-chainType'.
 *  The root bean class is EjbJar
 *
 *	===============================================================
 *	
 *	
 *	        The handler-chain element defines the handlerchain. 
 *	        Handlerchain can be defined such that the handlers in the
 *	        handlerchain operate,all ports of a service, on a specific
 *	        port or on a list of protocol-bindings. The choice of elements
 *	        service-name-pattern, port-name-pattern and protocol-bindings
 *	        are used to specify whether the handlers in handler-chain are
 *	        for a service, port or protocol binding. If none of these 
 *	        choices are specified with the handler-chain element then the
 *	        handlers specified in the handler-chain will be applied on 
 *	        everything.
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

public class ServiceRefHandlerChainType extends org.netbeans.modules.schema2beans.BaseBean
	 implements org.netbeans.modules.j2ee.dd.api.common.ServiceRefHandlerChain
{

	static Vector comparators = new Vector();
	private static final org.netbeans.modules.schema2beans.Version runtimeVersion = new org.netbeans.modules.schema2beans.Version(5, 0, 0);
	;	// NOI18N

	static public final String ID = "Id";	// NOI18N
	static public final String SERVICE_NAME_PATTERN = "ServiceNamePattern";	// NOI18N
	static public final String PORT_NAME_PATTERN = "PortNamePattern";	// NOI18N
	static public final String PROTOCOL_BINDINGS = "ProtocolBindings";	// NOI18N
	static public final String HANDLER = "Handler";	// NOI18N

	public ServiceRefHandlerChainType() {
		this(Common.USE_DEFAULT_VALUES);
	}

	public ServiceRefHandlerChainType(int options)
	{
		super(comparators, runtimeVersion);
		// Properties (see root bean comments for the bean graph)
		initPropertyTables(4);
		this.createProperty("service-name-pattern", 	// NOI18N
			SERVICE_NAME_PATTERN, Common.SEQUENCE_OR | 
			Common.TYPE_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createProperty("port-name-pattern", 	// NOI18N
			PORT_NAME_PATTERN, Common.SEQUENCE_OR | 
			Common.TYPE_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createProperty("protocol-bindings", 	// NOI18N
			PROTOCOL_BINDINGS, Common.SEQUENCE_OR | 
			Common.TYPE_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			String.class);
		this.createProperty("handler", 	// NOI18N
			HANDLER, 
			Common.TYPE_1_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			ServiceRefHandler.class);
		this.createAttribute(HANDLER, "id", "Id", 
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
	public void setServiceNamePattern(java.lang.String value) {
		this.setValue(SERVICE_NAME_PATTERN, value);
		if (value != null) {
			// It's a mutually exclusive property.
			setPortNamePattern(null);
			setProtocolBindings(null);
		}
	}

	//
	public java.lang.String getServiceNamePattern() {
		return (java.lang.String)this.getValue(SERVICE_NAME_PATTERN);
	}

	// This attribute is mandatory
	public void setPortNamePattern(java.lang.String value) {
		this.setValue(PORT_NAME_PATTERN, value);
		if (value != null) {
			// It's a mutually exclusive property.
			setServiceNamePattern(null);
			setProtocolBindings(null);
		}
	}

	//
	public java.lang.String getPortNamePattern() {
		return (java.lang.String)this.getValue(PORT_NAME_PATTERN);
	}

	// This attribute is mandatory
	public void setProtocolBindings(String value) {
		this.setValue(PROTOCOL_BINDINGS, value);
		if (value != null) {
			// It's a mutually exclusive property.
			setServiceNamePattern(null);
			setPortNamePattern(null);
		}
	}

	//
	public String getProtocolBindings() {
		return (String)this.getValue(PROTOCOL_BINDINGS);
	}

	// This attribute is an array containing at least one element
	public void setHandler(int index, 
                org.netbeans.modules.j2ee.dd.api.common.ServiceRefHandler valueInterface) {
		ServiceRefHandler value = (ServiceRefHandler) valueInterface;
		this.setValue(HANDLER, index, value);
	}

	//
	public 
                org.netbeans.modules.j2ee.dd.api.common.ServiceRefHandler getHandler(int index) {
		return (ServiceRefHandler)this.getValue(HANDLER, index);
	}

	// Return the number of properties
	public int sizeHandler() {
		return this.size(HANDLER);
	}

	// This attribute is an array containing at least one element
	public void setHandler(
                org.netbeans.modules.j2ee.dd.api.common.ServiceRefHandler[] value) {
		this.setValue(HANDLER, value);
	}

	//
	public 
                org.netbeans.modules.j2ee.dd.api.common.ServiceRefHandler[] getHandler() {
		return (ServiceRefHandler[])this.getValues(HANDLER);
	}

	// Add a new element returning its index in the list
	public int addHandler(
                org.netbeans.modules.j2ee.dd.api.common.ServiceRefHandler valueInterface) {
		ServiceRefHandler value = (ServiceRefHandler) valueInterface;
		int positionOfNewItem = this.addValue(HANDLER, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeHandler(
                org.netbeans.modules.j2ee.dd.api.common.ServiceRefHandler valueInterface) {
		ServiceRefHandler value = (ServiceRefHandler) valueInterface;
		return this.removeValue(HANDLER, value);
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public org.netbeans.modules.j2ee.dd.api.common.ServiceRefHandler newServiceRefHandler() {
		return new ServiceRefHandler();
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
		// Validating property serviceNamePattern
		if (getServiceNamePattern() != null) {
			{
				boolean patternPassed = false;
				if ((getServiceNamePattern()).matches("\\*|([[_A-Za-z]][[-._A-Za-z0-9]]*:)?[[_A-Za-z]][[-._A-Za-z0-9]]*\\*?")) {
					patternPassed = true;
				}
				restrictionFailure = !patternPassed;
			}
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getServiceNamePattern()", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "serviceNamePattern", this);	// NOI18N
			}
		}
		// Validating property portNamePattern
		if (getPortNamePattern() != null) {
			{
				boolean patternPassed = false;
				if ((getPortNamePattern()).matches("\\*|([[_A-Za-z]][[-._A-Za-z0-9]]*:)?[[_A-Za-z]][[-._A-Za-z0-9]]*\\*?")) {
					patternPassed = true;
				}
				restrictionFailure = !patternPassed;
			}
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getPortNamePattern()", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "portNamePattern", this);	// NOI18N
			}
		}
		// Validating property protocolBindings
		// Validating property handler
		if (sizeHandler() == 0) {
			throw new org.netbeans.modules.schema2beans.ValidateException("sizeHandler() == 0", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "handler", this);	// NOI18N
		}
		for (int _index = 0; _index < sizeHandler(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2.ServiceRefHandler element = (org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2.ServiceRefHandler) getHandler(_index);
			if (element != null) {
				((ServiceRefHandler)element).validate();
			}
		}
	}

	// Dump the content of this bean returning it as a String
	public void dump(StringBuffer str, String indent){
		String s;
		Object o;
		org.netbeans.modules.schema2beans.BaseBean n;
		str.append(indent);
		str.append("ServiceNamePattern");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getServiceNamePattern();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(SERVICE_NAME_PATTERN, 0, str, indent);

		str.append(indent);
		str.append("PortNamePattern");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getPortNamePattern();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(PORT_NAME_PATTERN, 0, str, indent);

		str.append(indent);
		str.append("ProtocolBindings");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getProtocolBindings();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(PROTOCOL_BINDINGS, 0, str, indent);

		str.append(indent);
		str.append("Handler["+this.sizeHandler()+"]");	// NOI18N
		for(int i=0; i<this.sizeHandler(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getHandler(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(HANDLER, i, str, indent);
		}

	}
	public String dumpBeanNode(){
		StringBuffer str = new StringBuffer();
		str.append("ServiceRefHandlerChainType\n");	// NOI18N
		this.dump(str, "\n  ");	// NOI18N
		return str.toString();
	}}

// END_NOI18N

