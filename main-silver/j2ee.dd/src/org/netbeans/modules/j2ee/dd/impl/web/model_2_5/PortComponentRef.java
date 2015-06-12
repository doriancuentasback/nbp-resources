/**
 *	This generated bean class PortComponentRef matches the schema element 'port-component-refType'.
 *  The root bean class is WebApp
 *
 *	===============================================================
 *	
 *	
 *		    The port-component-ref element declares a client dependency
 *		    on the container for resolving a Service Endpoint Interface
 *		    to a WSDL port. It optionally associates the Service Endpoint
 *		    Interface with a particular port-component. This is only used
 *		    by the container for a Service.getPort(Class) method call.
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

public class PortComponentRef extends org.netbeans.modules.schema2beans.BaseBean
	 implements  
                org.netbeans.modules.j2ee.dd.api.common.PortComponentRef
            
{

	static Vector comparators = new Vector();
	private static final org.netbeans.modules.schema2beans.Version runtimeVersion = new org.netbeans.modules.schema2beans.Version(5, 0, 0);
	;	// NOI18N

	static public final String ID = "Id";	// NOI18N
	static public final String SERVICE_ENDPOINT_INTERFACE = "ServiceEndpointInterface";	// NOI18N
	static public final String ENABLE_MTOM = "EnableMtom";	// NOI18N
	static public final String PORT_COMPONENT_LINK = "PortComponentLink";	// NOI18N
	static public final String PORTCOMPONENTLINKID = "PortComponentLinkId";	// NOI18N

	public PortComponentRef() {
		this(Common.USE_DEFAULT_VALUES);
	}

	public PortComponentRef(int options)
	{
		super(comparators, runtimeVersion);
		// Properties (see root bean comments for the bean graph)
		initPropertyTables(3);
		this.createProperty("service-endpoint-interface", 	// NOI18N
			SERVICE_ENDPOINT_INTERFACE, 
			Common.TYPE_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createProperty("enable-mtom", 	// NOI18N
			ENABLE_MTOM, 
			Common.TYPE_0_1 | Common.TYPE_BOOLEAN | Common.TYPE_SHOULD_NOT_BE_EMPTY | Common.TYPE_KEY, 
			Boolean.class);
		this.createProperty("port-component-link", 	// NOI18N
			PORT_COMPONENT_LINK, 
			Common.TYPE_0_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createAttribute(PORT_COMPONENT_LINK, "id", "Id", 
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
	public void setServiceEndpointInterface(java.lang.String value) {
		this.setValue(SERVICE_ENDPOINT_INTERFACE, value);
	}

	//
	public java.lang.String getServiceEndpointInterface() {
		return (java.lang.String)this.getValue(SERVICE_ENDPOINT_INTERFACE);
	}

	// This attribute is optional
	public void setEnableMtom(boolean value) {
		this.setValue(ENABLE_MTOM, (value ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE));
	}

	//
	public boolean isEnableMtom() {
		Boolean ret = (Boolean)this.getValue(ENABLE_MTOM);
		if (ret == null)
			ret = (Boolean)Common.defaultScalarValue(Common.TYPE_BOOLEAN);
		return ((java.lang.Boolean)ret).booleanValue();
	}

	// This attribute is optional
	public void setPortComponentLink(java.lang.String value) {
		this.setValue(PORT_COMPONENT_LINK, value);
	}

	//
	public java.lang.String getPortComponentLink() {
		return (java.lang.String)this.getValue(PORT_COMPONENT_LINK);
	}

	// This attribute is optional
	public void setPortComponentLinkId(java.lang.String value) {
		// Make sure we've got a place to put this attribute.
		if (size(PORT_COMPONENT_LINK) == 0) {
			setValue(PORT_COMPONENT_LINK, "");
		}
		setAttributeValue(PORT_COMPONENT_LINK, "Id", value);
	}

	//
	public java.lang.String getPortComponentLinkId() {
		// If our element does not exist, then the attribute does not exist.
		if (size(PORT_COMPONENT_LINK) == 0) {
			return null;
		} else {
			return getAttributeValue(PORT_COMPONENT_LINK, "Id");
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
		// Validating property serviceEndpointInterface
		if (getServiceEndpointInterface() == null) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getServiceEndpointInterface() == null", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "serviceEndpointInterface", this);	// NOI18N
		}
		// Validating property enableMtom
		{
			boolean patternPassed = false;
			if ((isEnableMtom() ? "true" : "false").matches("(true|false)")) {
				patternPassed = true;
			}
			restrictionFailure = !patternPassed;
		}
		if (restrictionFailure) {
			throw new org.netbeans.modules.schema2beans.ValidateException("isEnableMtom()", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "enableMtom", this);	// NOI18N
		}
		// Validating property portComponentLink
		if (getPortComponentLink() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getPortComponentLink() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "portComponentLink", this);	// NOI18N
			}
		}
		// Validating property portComponentLinkId
		if (getPortComponentLinkId() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getPortComponentLinkId() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "portComponentLinkId", this);	// NOI18N
			}
		}
	}

	// Dump the content of this bean returning it as a String
	public void dump(StringBuffer str, String indent){
		String s;
		Object o;
		org.netbeans.modules.schema2beans.BaseBean n;
		str.append(indent);
		str.append("ServiceEndpointInterface");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getServiceEndpointInterface();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(SERVICE_ENDPOINT_INTERFACE, 0, str, indent);

		str.append(indent);
		str.append("EnableMtom");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append((this.isEnableMtom()?"true":"false"));
		this.dumpAttributes(ENABLE_MTOM, 0, str, indent);

		str.append(indent);
		str.append("PortComponentLink");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getPortComponentLink();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(PORT_COMPONENT_LINK, 0, str, indent);

	}
	public String dumpBeanNode(){
		StringBuffer str = new StringBuffer();
		str.append("PortComponentRef\n");	// NOI18N
		this.dump(str, "\n  ");	// NOI18N
		return str.toString();
	}}

// END_NOI18N

