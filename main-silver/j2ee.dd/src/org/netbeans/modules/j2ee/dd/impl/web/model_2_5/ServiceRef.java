/**
 *	This generated bean class ServiceRef matches the schema element 'service-refType'.
 *  The root bean class is WebApp
 *
 *	===============================================================
 *	
 *	
 *		This group collects elements that are common to all the
 *		JNDI resource elements.
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

public class ServiceRef extends org.netbeans.modules.j2ee.dd.impl.common.ComponentBeanMultiple
	 implements  
                org.netbeans.modules.j2ee.dd.api.common.ServiceRef, org.netbeans.modules.j2ee.dd.impl.common.KeyBean
            
{

	static Vector comparators = new Vector();
	static{
		ServiceRef.addComparator(new org.netbeans.modules.j2ee.dd.impl.common.Comparator());
	}
	private static final org.netbeans.modules.schema2beans.Version runtimeVersion = new org.netbeans.modules.schema2beans.Version(5, 0, 0);
	;	// NOI18N

	static public final String ID = "Id";	// NOI18N
	static public final String DESCRIPTION = "Description";	// NOI18N
	static public final String DESCRIPTIONID = "DescriptionId";	// NOI18N
	static public final String DESCRIPTIONXMLLANG = "DescriptionXmlLang";	// NOI18N
	static public final String DISPLAY_NAME = "DisplayName";	// NOI18N
	static public final String DISPLAYNAMEID = "DisplayNameId";	// NOI18N
	static public final String DISPLAYNAMEXMLLANG = "DisplayNameXmlLang";	// NOI18N
	static public final String ICON = "Icon";	// NOI18N
	static public final String SERVICE_REF_NAME = "ServiceRefName";	// NOI18N
	static public final String SERVICE_INTERFACE = "ServiceInterface";	// NOI18N
	static public final String SERVICE_REF_TYPE = "ServiceRefType";	// NOI18N
	static public final String WSDL_FILE = "WsdlFile";	// NOI18N
	static public final String WSDLFILEID = "WsdlFileId";	// NOI18N
	static public final String JAXRPC_MAPPING_FILE = "JaxrpcMappingFile";	// NOI18N
	static public final String SERVICE_QNAME = "ServiceQname";	// NOI18N
	static public final String SERVICEQNAMEID = "ServiceQnameId";	// NOI18N
	static public final String PORT_COMPONENT_REF = "PortComponentRef";	// NOI18N
	static public final String HANDLER = "Handler";	// NOI18N
	static public final String HANDLER_CHAINS = "HandlerChains";	// NOI18N
	static public final String MAPPED_NAME = "MappedName";	// NOI18N
	static public final String MAPPEDNAMEID = "MappedNameId";	// NOI18N
	static public final String INJECTION_TARGET = "InjectionTarget";	// NOI18N

	public ServiceRef() {
		this(Common.USE_DEFAULT_VALUES);
	}

	public ServiceRef(int options)
	{
		super(comparators, runtimeVersion);
		// Properties (see root bean comments for the bean graph)
		initPropertyTables(14);
		this.createProperty("description", 	// NOI18N
			DESCRIPTION, 
			Common.TYPE_0_N | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createAttribute(DESCRIPTION, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createAttribute(DESCRIPTION, "xml:lang", "XmlLang", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("display-name", 	// NOI18N
			DISPLAY_NAME, 
			Common.TYPE_0_N | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createAttribute(DISPLAY_NAME, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createAttribute(DISPLAY_NAME, "xml:lang", "XmlLang", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("icon", 	// NOI18N
			ICON, 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			Icon.class);
		this.createAttribute(ICON, "xml:lang", "XmlLang", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createAttribute(ICON, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("service-ref-name", 	// NOI18N
			SERVICE_REF_NAME, 
			Common.TYPE_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createProperty("service-interface", 	// NOI18N
			SERVICE_INTERFACE, 
			Common.TYPE_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createProperty("service-ref-type", 	// NOI18N
			SERVICE_REF_TYPE, 
			Common.TYPE_0_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createProperty("wsdl-file", 	// NOI18N
			WSDL_FILE, 
			Common.TYPE_0_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.net.URI.class);
		this.createAttribute(WSDL_FILE, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("jaxrpc-mapping-file", 	// NOI18N
			JAXRPC_MAPPING_FILE, 
			Common.TYPE_0_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createProperty("service-qname", 	// NOI18N
			SERVICE_QNAME, 
			Common.TYPE_0_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createAttribute(SERVICE_QNAME, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("port-component-ref", 	// NOI18N
			PORT_COMPONENT_REF, 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			PortComponentRef.class);
		this.createAttribute(PORT_COMPONENT_REF, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("handler", 	// NOI18N
			HANDLER, Common.SEQUENCE_OR | 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			ServiceRefHandler.class);
		this.createAttribute(HANDLER, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("handler-chains", 	// NOI18N
			HANDLER_CHAINS, Common.SEQUENCE_OR | 
			Common.TYPE_0_1 | Common.TYPE_BEAN | Common.TYPE_KEY, 
			ServiceRefHandlerChains.class);
		this.createAttribute(HANDLER_CHAINS, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("mapped-name", 	// NOI18N
			MAPPED_NAME, 
			Common.TYPE_0_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createAttribute(MAPPED_NAME, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("injection-target", 	// NOI18N
			INJECTION_TARGET, 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			InjectionTarget.class);
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
	public void setDescription(int index, java.lang.String value) {
		this.setValue(DESCRIPTION, index, value);
	}

	//
	public java.lang.String getDescription(int index) {
		return (java.lang.String)this.getValue(DESCRIPTION, index);
	}

	// Return the number of properties
	public int sizeDescription() {
		return this.size(DESCRIPTION);
	}

	// This attribute is an array, possibly empty
	public void setDescription(java.lang.String[] value) {
		this.setValue(DESCRIPTION, value);
	}

	//
	public java.lang.String[] getDescription() {
		return (java.lang.String[])this.getValues(DESCRIPTION);
	}

	// Add a new element returning its index in the list
	public int addDescription(java.lang.String value) {
		int positionOfNewItem = this.addValue(DESCRIPTION, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeDescription(java.lang.String value) {
		return this.removeValue(DESCRIPTION, value);
	}

	// This attribute is an array, possibly empty
	public void setDescriptionId(int index, java.lang.String value) {
		// Make sure we've got a place to put this attribute.
		if (size(DESCRIPTION) == 0) {
			addValue(DESCRIPTION, "");
		}
		setAttributeValue(DESCRIPTION, index, "Id", value);
	}

	//
	public java.lang.String getDescriptionId(int index) {
		// If our element does not exist, then the attribute does not exist.
		if (size(DESCRIPTION) == 0) {
			return null;
		} else {
			return getAttributeValue(DESCRIPTION, index, "Id");
		}
	}

	// Return the number of properties
	public int sizeDescriptionId() {
		return this.size(DESCRIPTION);
	}

	// This attribute is an array, possibly empty
	public void setDescriptionXmlLang(int index, java.lang.String value) {
		// Make sure we've got a place to put this attribute.
		if (size(DESCRIPTION) == 0) {
			addValue(DESCRIPTION, "");
		}
		setAttributeValue(DESCRIPTION, index, "XmlLang", value);
	}

	//
	public java.lang.String getDescriptionXmlLang(int index) {
		// If our element does not exist, then the attribute does not exist.
		if (size(DESCRIPTION) == 0) {
			return null;
		} else {
			return getAttributeValue(DESCRIPTION, index, "XmlLang");
		}
	}

	// Return the number of properties
	public int sizeDescriptionXmlLang() {
		return this.size(DESCRIPTION);
	}

	// This attribute is an array, possibly empty
	public void setDisplayName(int index, java.lang.String value) {
		this.setValue(DISPLAY_NAME, index, value);
	}

	//
	public java.lang.String getDisplayName(int index) {
		return (java.lang.String)this.getValue(DISPLAY_NAME, index);
	}

	// Return the number of properties
	public int sizeDisplayName() {
		return this.size(DISPLAY_NAME);
	}

	// This attribute is an array, possibly empty
	public void setDisplayName(java.lang.String[] value) {
		this.setValue(DISPLAY_NAME, value);
	}

	//
	public java.lang.String[] getDisplayName() {
		return (java.lang.String[])this.getValues(DISPLAY_NAME);
	}

	// Add a new element returning its index in the list
	public int addDisplayName(java.lang.String value) {
		int positionOfNewItem = this.addValue(DISPLAY_NAME, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeDisplayName(java.lang.String value) {
		return this.removeValue(DISPLAY_NAME, value);
	}

	// This attribute is an array, possibly empty
	public void setDisplayNameId(int index, java.lang.String value) {
		// Make sure we've got a place to put this attribute.
		if (size(DISPLAY_NAME) == 0) {
			addValue(DISPLAY_NAME, "");
		}
		setAttributeValue(DISPLAY_NAME, index, "Id", value);
	}

	//
	public java.lang.String getDisplayNameId(int index) {
		// If our element does not exist, then the attribute does not exist.
		if (size(DISPLAY_NAME) == 0) {
			return null;
		} else {
			return getAttributeValue(DISPLAY_NAME, index, "Id");
		}
	}

	// Return the number of properties
	public int sizeDisplayNameId() {
		return this.size(DISPLAY_NAME);
	}

	// This attribute is an array, possibly empty
	public void setDisplayNameXmlLang(int index, java.lang.String value) {
		// Make sure we've got a place to put this attribute.
		if (size(DISPLAY_NAME) == 0) {
			addValue(DISPLAY_NAME, "");
		}
		setAttributeValue(DISPLAY_NAME, index, "XmlLang", value);
	}

	//
	public java.lang.String getDisplayNameXmlLang(int index) {
		// If our element does not exist, then the attribute does not exist.
		if (size(DISPLAY_NAME) == 0) {
			return null;
		} else {
			return getAttributeValue(DISPLAY_NAME, index, "XmlLang");
		}
	}

	// Return the number of properties
	public int sizeDisplayNameXmlLang() {
		return this.size(DISPLAY_NAME);
	}

	// This attribute is an array, possibly empty
	public void setIcon(int index,  
                org.netbeans.modules.j2ee.dd.api.common.Icon
             valueInterface) {
		Icon value = (Icon) valueInterface;
		this.setValue(ICON, index, value);
	}

	//
	public  
                org.netbeans.modules.j2ee.dd.api.common.Icon
             getIcon(int index) {
		return (Icon)this.getValue(ICON, index);
	}

	// Return the number of properties
	public int sizeIcon() {
		return this.size(ICON);
	}

	// This attribute is an array, possibly empty
	public void setIcon( 
                org.netbeans.modules.j2ee.dd.api.common.Icon
            [] value) {
		this.setValue(ICON, value);
	}

	//
	public  
                org.netbeans.modules.j2ee.dd.api.common.Icon
            [] getIcon() {
		return (Icon[])this.getValues(ICON);
	}

	// Add a new element returning its index in the list
	public int addIcon( 
                org.netbeans.modules.j2ee.dd.api.common.Icon
             valueInterface) {
		Icon value = (Icon) valueInterface;
		int positionOfNewItem = this.addValue(ICON, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeIcon( 
                org.netbeans.modules.j2ee.dd.api.common.Icon
             valueInterface) {
		Icon value = (Icon) valueInterface;
		return this.removeValue(ICON, value);
	}

	// This attribute is mandatory
	public void setServiceRefName(java.lang.String value) {
		this.setValue(SERVICE_REF_NAME, value);
	}

	//
	public java.lang.String getServiceRefName() {
		return (java.lang.String)this.getValue(SERVICE_REF_NAME);
	}

	// This attribute is mandatory
	public void setServiceInterface(java.lang.String value) {
		this.setValue(SERVICE_INTERFACE, value);
	}

	//
	public java.lang.String getServiceInterface() {
		return (java.lang.String)this.getValue(SERVICE_INTERFACE);
	}

	// This attribute is optional
	public void setServiceRefType(java.lang.String value) {
		this.setValue(SERVICE_REF_TYPE, value);
	}

	//
	public java.lang.String getServiceRefType() {
		return (java.lang.String)this.getValue(SERVICE_REF_TYPE);
	}

	// This attribute is optional
	public void setWsdlFile(java.net.URI value) {
		this.setValue(WSDL_FILE, value);
	}

	//
	public java.net.URI getWsdlFile() {
		return (java.net.URI)this.getValue(WSDL_FILE);
	}

	// This attribute is optional
	public void setWsdlFileId(java.lang.String value) {
		// Make sure we've got a place to put this attribute.
		if (size(WSDL_FILE) == 0) {
			setValue(WSDL_FILE, "");
		}
		setAttributeValue(WSDL_FILE, "Id", value);
	}

	//
	public java.lang.String getWsdlFileId() {
		// If our element does not exist, then the attribute does not exist.
		if (size(WSDL_FILE) == 0) {
			return null;
		} else {
			return getAttributeValue(WSDL_FILE, "Id");
		}
	}

	// This attribute is optional
	public void setJaxrpcMappingFile(java.lang.String value) {
		this.setValue(JAXRPC_MAPPING_FILE, value);
	}

	//
	public java.lang.String getJaxrpcMappingFile() {
		return (java.lang.String)this.getValue(JAXRPC_MAPPING_FILE);
	}

	// This attribute is optional
	public void setServiceQname(java.lang.String value) {
		this.setValue(SERVICE_QNAME, value);
	}

	//
	public java.lang.String getServiceQname() {
		return (java.lang.String)this.getValue(SERVICE_QNAME);
	}

	// This attribute is optional
	public void setServiceQnameId(java.lang.String value) {
		// Make sure we've got a place to put this attribute.
		if (size(SERVICE_QNAME) == 0) {
			setValue(SERVICE_QNAME, "");
		}
		setAttributeValue(SERVICE_QNAME, "Id", value);
	}

	//
	public java.lang.String getServiceQnameId() {
		// If our element does not exist, then the attribute does not exist.
		if (size(SERVICE_QNAME) == 0) {
			return null;
		} else {
			return getAttributeValue(SERVICE_QNAME, "Id");
		}
	}

	// This attribute is an array, possibly empty
	public void setPortComponentRef(int index,  
                org.netbeans.modules.j2ee.dd.api.common.PortComponentRef
             valueInterface) {
		PortComponentRef value = (PortComponentRef) valueInterface;
		this.setValue(PORT_COMPONENT_REF, index, value);
	}

	//
	public  
                org.netbeans.modules.j2ee.dd.api.common.PortComponentRef
             getPortComponentRef(int index) {
		return (PortComponentRef)this.getValue(PORT_COMPONENT_REF, index);
	}

	// Return the number of properties
	public int sizePortComponentRef() {
		return this.size(PORT_COMPONENT_REF);
	}

	// This attribute is an array, possibly empty
	public void setPortComponentRef( 
                org.netbeans.modules.j2ee.dd.api.common.PortComponentRef
            [] value) {
		this.setValue(PORT_COMPONENT_REF, value);
	}

	//
	public  
                org.netbeans.modules.j2ee.dd.api.common.PortComponentRef
            [] getPortComponentRef() {
		return (PortComponentRef[])this.getValues(PORT_COMPONENT_REF);
	}

	// Add a new element returning its index in the list
	public int addPortComponentRef( 
                org.netbeans.modules.j2ee.dd.api.common.PortComponentRef
             valueInterface) {
		PortComponentRef value = (PortComponentRef) valueInterface;
		int positionOfNewItem = this.addValue(PORT_COMPONENT_REF, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removePortComponentRef( 
                org.netbeans.modules.j2ee.dd.api.common.PortComponentRef
             valueInterface) {
		PortComponentRef value = (PortComponentRef) valueInterface;
		return this.removeValue(PORT_COMPONENT_REF, value);
	}

	// This attribute is an array, possibly empty
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

	// This attribute is an array, possibly empty
	public void setHandler( 
                org.netbeans.modules.j2ee.dd.api.common.ServiceRefHandler[] value) {
		this.setValue(HANDLER, value);
		if (value != null && value.length > 0) {
			// It's a mutually exclusive property.
			setHandlerChains(null);
		}
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
		if (positionOfNewItem == 0) {
			// It's a mutually exclusive property.
			setHandlerChains(null);
		}
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

	// This attribute is optional
	public void setHandlerChains(org.netbeans.modules.j2ee.dd.api.common.ServiceRefHandlerChains valueInterface) {
		ServiceRefHandlerChains value = (ServiceRefHandlerChains) valueInterface;
		this.setValue(HANDLER_CHAINS, value);
		if (value != null) {
			// It's a mutually exclusive property.
			setHandler(null);
		}
	}

	//
	public org.netbeans.modules.j2ee.dd.api.common.ServiceRefHandlerChains getHandlerChains() {
		return (ServiceRefHandlerChains)this.getValue(HANDLER_CHAINS);
	}

	// This attribute is optional
	public void setMappedName(java.lang.String value) {
		this.setValue(MAPPED_NAME, value);
	}

	//
	public java.lang.String getMappedName() {
		return (java.lang.String)this.getValue(MAPPED_NAME);
	}

	// This attribute is optional
	public void setMappedNameId(java.lang.String value) {
		// Make sure we've got a place to put this attribute.
		if (size(MAPPED_NAME) == 0) {
			setValue(MAPPED_NAME, "");
		}
		setAttributeValue(MAPPED_NAME, "Id", value);
	}

	//
	public java.lang.String getMappedNameId() {
		// If our element does not exist, then the attribute does not exist.
		if (size(MAPPED_NAME) == 0) {
			return null;
		} else {
			return getAttributeValue(MAPPED_NAME, "Id");
		}
	}

	// This attribute is an array, possibly empty
	public void setInjectionTarget(int index, org.netbeans.modules.j2ee.dd.api.common.InjectionTarget valueInterface) {
		InjectionTarget value = (InjectionTarget) valueInterface;
		this.setValue(INJECTION_TARGET, index, value);
	}

	//
	public org.netbeans.modules.j2ee.dd.api.common.InjectionTarget getInjectionTarget(int index) {
		return (InjectionTarget)this.getValue(INJECTION_TARGET, index);
	}

	// Return the number of properties
	public int sizeInjectionTarget() {
		return this.size(INJECTION_TARGET);
	}

	// This attribute is an array, possibly empty
	public void setInjectionTarget(org.netbeans.modules.j2ee.dd.api.common.InjectionTarget[] value) {
		this.setValue(INJECTION_TARGET, value);
	}

	//
	public org.netbeans.modules.j2ee.dd.api.common.InjectionTarget[] getInjectionTarget() {
		return (InjectionTarget[])this.getValues(INJECTION_TARGET);
	}

	// Add a new element returning its index in the list
	public int addInjectionTarget(org.netbeans.modules.j2ee.dd.api.common.InjectionTarget valueInterface) {
		InjectionTarget value = (InjectionTarget) valueInterface;
		int positionOfNewItem = this.addValue(INJECTION_TARGET, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeInjectionTarget(org.netbeans.modules.j2ee.dd.api.common.InjectionTarget valueInterface) {
		InjectionTarget value = (InjectionTarget) valueInterface;
		return this.removeValue(INJECTION_TARGET, value);
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public org.netbeans.modules.j2ee.dd.api.common.Icon newIcon() {
		return new Icon();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public org.netbeans.modules.j2ee.dd.api.common.PortComponentRef newPortComponentRef() {
		return new PortComponentRef();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public org.netbeans.modules.j2ee.dd.api.common.ServiceRefHandler newServiceRefHandler() {
		return new ServiceRefHandler();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public org.netbeans.modules.j2ee.dd.api.common.ServiceRefHandlerChains newServiceRefHandlerChains() {
		return new ServiceRefHandlerChains();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public org.netbeans.modules.j2ee.dd.api.common.InjectionTarget newInjectionTarget() {
		return new InjectionTarget();
	}

	//
	public static void addComparator(org.netbeans.modules.schema2beans.BeanComparator c) {
		comparators.add(c);
	}

	//
	public static void removeComparator(org.netbeans.modules.schema2beans.BeanComparator c) {
		comparators.remove(c);
	}

	
                public String getKeyProperty() { return "ServiceRefName"; }
            
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
		// Validating property description
		// Validating property descriptionId
		// Validating property descriptionXmlLang
		// Validating property displayName
		for (int _index = 0; _index < sizeDisplayName(); ++_index) {
			java.lang.String element = getDisplayName(_index);
			if (element != null) {
				// has whitespace restriction
				if (restrictionFailure) {
					throw new org.netbeans.modules.schema2beans.ValidateException("element whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "displayName", this);	// NOI18N
				}
			}
		}
		// Validating property displayNameId
		// Validating property displayNameXmlLang
		// Validating property icon
		for (int _index = 0; _index < sizeIcon(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.web.model_2_5.Icon element = (org.netbeans.modules.j2ee.dd.impl.web.model_2_5.Icon) getIcon(_index);
			if (element != null) {
				((Icon)element).validate();
			}
		}
		// Validating property serviceRefName
		if (getServiceRefName() == null) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getServiceRefName() == null", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "serviceRefName", this);	// NOI18N
		}
		// Validating property serviceInterface
		if (getServiceInterface() == null) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getServiceInterface() == null", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "serviceInterface", this);	// NOI18N
		}
		// Validating property serviceRefType
		// Validating property wsdlFile
		// Validating property wsdlFileId
		if (getWsdlFileId() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getWsdlFileId() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "wsdlFileId", this);	// NOI18N
			}
		}
		// Validating property jaxrpcMappingFile
		// Validating property serviceQname
		// Validating property serviceQnameId
		if (getServiceQnameId() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getServiceQnameId() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "serviceQnameId", this);	// NOI18N
			}
		}
		// Validating property portComponentRef
		for (int _index = 0; _index < sizePortComponentRef(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.web.model_2_5.PortComponentRef element = (org.netbeans.modules.j2ee.dd.impl.web.model_2_5.PortComponentRef) getPortComponentRef(_index);
			if (element != null) {
				((PortComponentRef)element).validate();
			}
		}
		// Validating property handler
		for (int _index = 0; _index < sizeHandler(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.web.model_2_5.ServiceRefHandler element = (org.netbeans.modules.j2ee.dd.impl.web.model_2_5.ServiceRefHandler) getHandler(_index);
			if (element != null) {
				((ServiceRefHandler)element).validate();
			}
		}
		if (sizeHandler() > 0) {
			if (getHandlerChains() != null) {
				throw new org.netbeans.modules.schema2beans.ValidateException("mutually exclusive properties: Handler and HandlerChains", org.netbeans.modules.schema2beans.ValidateException.FailureType.MUTUALLY_EXCLUSIVE, "HandlerChains", this);	// NOI18N
			}
		}
		// Validating property handlerChains
		if (getHandlerChains() != null) {
			((ServiceRefHandlerChains)getHandlerChains()).validate();
		}
		if (getHandlerChains() != null) {
			if (sizeHandler() > 0) {
				throw new org.netbeans.modules.schema2beans.ValidateException("mutually exclusive properties: HandlerChains and Handler", org.netbeans.modules.schema2beans.ValidateException.FailureType.MUTUALLY_EXCLUSIVE, "Handler", this);	// NOI18N
			}
		}
		// Validating property mappedName
		// Validating property mappedNameId
		if (getMappedNameId() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getMappedNameId() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "mappedNameId", this);	// NOI18N
			}
		}
		// Validating property injectionTarget
		for (int _index = 0; _index < sizeInjectionTarget(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.web.model_2_5.InjectionTarget element = (org.netbeans.modules.j2ee.dd.impl.web.model_2_5.InjectionTarget) getInjectionTarget(_index);
			if (element != null) {
				((InjectionTarget)element).validate();
			}
		}
		if (getHandlerChains() == null && sizeHandler() == 0) {
			throw new org.netbeans.modules.schema2beans.ValidateException("required properties: getHandlerChains() == null && sizeHandler() == 0", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "HandlerChains", this);	// NOI18N
		}
	}

	// Dump the content of this bean returning it as a String
	public void dump(StringBuffer str, String indent){
		String s;
		Object o;
		org.netbeans.modules.schema2beans.BaseBean n;
		str.append(indent);
		str.append("Description["+this.sizeDescription()+"]");	// NOI18N
		for(int i=0; i<this.sizeDescription(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			str.append(indent+"\t");	// NOI18N
			str.append("<");	// NOI18N
			o = this.getDescription(i);
			str.append((o==null?"null":o.toString().trim()));	// NOI18N
			str.append(">\n");	// NOI18N
			this.dumpAttributes(DESCRIPTION, i, str, indent);
		}

		str.append(indent);
		str.append("DisplayName["+this.sizeDisplayName()+"]");	// NOI18N
		for(int i=0; i<this.sizeDisplayName(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			str.append(indent+"\t");	// NOI18N
			str.append("<");	// NOI18N
			o = this.getDisplayName(i);
			str.append((o==null?"null":o.toString().trim()));	// NOI18N
			str.append(">\n");	// NOI18N
			this.dumpAttributes(DISPLAY_NAME, i, str, indent);
		}

		str.append(indent);
		str.append("Icon["+this.sizeIcon()+"]");	// NOI18N
		for(int i=0; i<this.sizeIcon(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getIcon(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(ICON, i, str, indent);
		}

		str.append(indent);
		str.append("ServiceRefName");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getServiceRefName();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(SERVICE_REF_NAME, 0, str, indent);

		str.append(indent);
		str.append("ServiceInterface");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getServiceInterface();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(SERVICE_INTERFACE, 0, str, indent);

		str.append(indent);
		str.append("ServiceRefType");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getServiceRefType();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(SERVICE_REF_TYPE, 0, str, indent);

		str.append(indent);
		str.append("WsdlFile");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getWsdlFile();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(WSDL_FILE, 0, str, indent);

		str.append(indent);
		str.append("JaxrpcMappingFile");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getJaxrpcMappingFile();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(JAXRPC_MAPPING_FILE, 0, str, indent);

		str.append(indent);
		str.append("ServiceQname");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getServiceQname();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(SERVICE_QNAME, 0, str, indent);

		str.append(indent);
		str.append("PortComponentRef["+this.sizePortComponentRef()+"]");	// NOI18N
		for(int i=0; i<this.sizePortComponentRef(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getPortComponentRef(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(PORT_COMPONENT_REF, i, str, indent);
		}

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

		str.append(indent);
		str.append("HandlerChains");	// NOI18N
		n = (org.netbeans.modules.schema2beans.BaseBean) this.getHandlerChains();
		if (n != null)
			n.dump(str, indent + "\t");	// NOI18N
		else
			str.append(indent+"\tnull");	// NOI18N
		this.dumpAttributes(HANDLER_CHAINS, 0, str, indent);

		str.append(indent);
		str.append("MappedName");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getMappedName();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(MAPPED_NAME, 0, str, indent);

		str.append(indent);
		str.append("InjectionTarget["+this.sizeInjectionTarget()+"]");	// NOI18N
		for(int i=0; i<this.sizeInjectionTarget(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getInjectionTarget(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(INJECTION_TARGET, i, str, indent);
		}

	}
	public String dumpBeanNode(){
		StringBuffer str = new StringBuffer();
		str.append("ServiceRef\n");	// NOI18N
		this.dump(str, "\n  ");	// NOI18N
		return str.toString();
	}}

// END_NOI18N

