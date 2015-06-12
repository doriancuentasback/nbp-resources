/**
 *	This generated bean class SessionBean matches the schema element 'session-beanType'.
 *  The root bean class is EjbJar
 *
 *	===============================================================
 *	
 *	
 *		This group keeps the usage of the contained JNDI environment
 *		reference elements consistent across J2EE deployment descriptors.
 *	
 *	      
 *	===============================================================
 * @Generated
 */

package org.netbeans.modules.j2ee.dd.impl.ejb.model_2_1;

import org.w3c.dom.*;
import org.netbeans.modules.schema2beans.*;
import java.beans.*;
import java.util.*;

// BEGIN_NOI18N

public class SessionBean extends org.netbeans.modules.j2ee.dd.impl.common.ComponentBeanMultiple
	 implements org.netbeans.modules.j2ee.dd.api.ejb.Session,org.netbeans.modules.j2ee.dd.impl.common.KeyBean
{

	static Vector comparators = new Vector();
	static{
		SessionBean.addComparator(new org.netbeans.modules.j2ee.dd.impl.common.Comparator());
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
	static public final String EJB_NAME = "EjbName";	// NOI18N
	static public final String HOME = "Home";	// NOI18N
	static public final String REMOTE = "Remote";	// NOI18N
	static public final String LOCAL_HOME = "LocalHome";	// NOI18N
	static public final String LOCAL = "Local";	// NOI18N
	static public final String SERVICE_ENDPOINT = "ServiceEndpoint";	// NOI18N
	static public final String EJB_CLASS = "EjbClass";	// NOI18N
	static public final String SESSION_TYPE = "SessionType";	// NOI18N
	static public final String TRANSACTION_TYPE = "TransactionType";	// NOI18N
	static public final String ENV_ENTRY = "EnvEntry";	// NOI18N
	static public final String EJB_REF = "EjbRef";	// NOI18N
	static public final String EJB_LOCAL_REF = "EjbLocalRef";	// NOI18N
	static public final String SERVICE_REF = "ServiceRef";	// NOI18N
	static public final String RESOURCE_REF = "ResourceRef";	// NOI18N
	static public final String RESOURCE_ENV_REF = "ResourceEnvRef";	// NOI18N
	static public final String MESSAGE_DESTINATION_REF = "MessageDestinationRef";	// NOI18N
	static public final String SECURITY_ROLE_REF = "SecurityRoleRef";	// NOI18N
	static public final String SECURITY_IDENTITY = "SecurityIdentity";	// NOI18N

	public SessionBean() {
		this(Common.USE_DEFAULT_VALUES);
	}

	public SessionBean(int options)
	{
		super(comparators, runtimeVersion);
		// Properties (see root bean comments for the bean graph)
		initPropertyTables(21);
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
		this.createProperty("ejb-name", 	// NOI18N
			EJB_NAME, 
			Common.TYPE_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createProperty("home", 	// NOI18N
			HOME, 
			Common.TYPE_0_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createProperty("remote", 	// NOI18N
			REMOTE, 
			Common.TYPE_0_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createProperty("local-home", 	// NOI18N
			LOCAL_HOME, 
			Common.TYPE_0_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createProperty("local", 	// NOI18N
			LOCAL, 
			Common.TYPE_0_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createProperty("service-endpoint", 	// NOI18N
			SERVICE_ENDPOINT, 
			Common.TYPE_0_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createProperty("ejb-class", 	// NOI18N
			EJB_CLASS, 
			Common.TYPE_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createProperty("session-type", 	// NOI18N
			SESSION_TYPE, 
			Common.TYPE_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createProperty("transaction-type", 	// NOI18N
			TRANSACTION_TYPE, 
			Common.TYPE_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createProperty("env-entry", 	// NOI18N
			ENV_ENTRY, 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			EnvEntry.class);
		this.createAttribute(ENV_ENTRY, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("ejb-ref", 	// NOI18N
			EJB_REF, 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			EjbRef.class);
		this.createAttribute(EJB_REF, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("ejb-local-ref", 	// NOI18N
			EJB_LOCAL_REF, 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			EjbLocalRef.class);
		this.createAttribute(EJB_LOCAL_REF, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("service-ref", 	// NOI18N
			SERVICE_REF, 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			ServiceRef.class);
		this.createAttribute(SERVICE_REF, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("resource-ref", 	// NOI18N
			RESOURCE_REF, 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			ResourceRef.class);
		this.createAttribute(RESOURCE_REF, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("resource-env-ref", 	// NOI18N
			RESOURCE_ENV_REF, 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			ResourceEnvRef.class);
		this.createAttribute(RESOURCE_ENV_REF, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("message-destination-ref", 	// NOI18N
			MESSAGE_DESTINATION_REF, 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			MessageDestinationRef.class);
		this.createAttribute(MESSAGE_DESTINATION_REF, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("security-role-ref", 	// NOI18N
			SECURITY_ROLE_REF, 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			SecurityRoleRef.class);
		this.createAttribute(SECURITY_ROLE_REF, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("security-identity", 	// NOI18N
			SECURITY_IDENTITY, 
			Common.TYPE_0_1 | Common.TYPE_BEAN | Common.TYPE_KEY, 
			SecurityIdentity.class);
		this.createAttribute(SECURITY_IDENTITY, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.initialize(options);
	}

	// Setting the default values of the properties
	void initialize(int options) {
		if ((options & Common.USE_DEFAULT_VALUES) == Common.USE_DEFAULT_VALUES) {
			setSessionType("Stateful");
			setTransactionType("Bean");
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
	public void setIcon(int index, org.netbeans.modules.j2ee.dd.api.common.Icon valueInterface) {
		Icon value = (Icon) valueInterface;
		this.setValue(ICON, index, value);
	}

	//
	public org.netbeans.modules.j2ee.dd.api.common.Icon getIcon(int index) {
		return (Icon)this.getValue(ICON, index);
	}

	// Return the number of properties
	public int sizeIcon() {
		return this.size(ICON);
	}

	// This attribute is an array, possibly empty
	public void setIcon(org.netbeans.modules.j2ee.dd.api.common.Icon[] value) {
		this.setValue(ICON, value);
	}

	//
	public org.netbeans.modules.j2ee.dd.api.common.Icon[] getIcon() {
		return (Icon[])this.getValues(ICON);
	}

	// Add a new element returning its index in the list
	public int addIcon(org.netbeans.modules.j2ee.dd.api.common.Icon valueInterface) {
		Icon value = (Icon) valueInterface;
		int positionOfNewItem = this.addValue(ICON, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeIcon(org.netbeans.modules.j2ee.dd.api.common.Icon valueInterface) {
		Icon value = (Icon) valueInterface;
		return this.removeValue(ICON, value);
	}

	// This attribute is mandatory
	public void setEjbName(java.lang.String value) {
		this.setValue(EJB_NAME, value);
	}

	//
	public java.lang.String getEjbName() {
		return (java.lang.String)this.getValue(EJB_NAME);
	}

	// This attribute is optional
	public void setHome(java.lang.String value) {
		this.setValue(HOME, value);
	}

	//
	public java.lang.String getHome() {
		return (java.lang.String)this.getValue(HOME);
	}

	// This attribute is optional
	public void setRemote(java.lang.String value) {
		this.setValue(REMOTE, value);
	}

	//
	public java.lang.String getRemote() {
		return (java.lang.String)this.getValue(REMOTE);
	}

	// This attribute is optional
	public void setLocalHome(java.lang.String value) {
		this.setValue(LOCAL_HOME, value);
	}

	//
	public java.lang.String getLocalHome() {
		return (java.lang.String)this.getValue(LOCAL_HOME);
	}

	// This attribute is optional
	public void setLocal(java.lang.String value) {
		this.setValue(LOCAL, value);
	}

	//
	public java.lang.String getLocal() {
		return (java.lang.String)this.getValue(LOCAL);
	}

	// This attribute is optional
	public void setServiceEndpoint(java.lang.String value) {
		this.setValue(SERVICE_ENDPOINT, value);
	}

	//
	public java.lang.String getServiceEndpoint() {
		return (java.lang.String)this.getValue(SERVICE_ENDPOINT);
	}

	// This attribute is mandatory
	public void setEjbClass(java.lang.String value) {
		this.setValue(EJB_CLASS, value);
	}

	//
	public java.lang.String getEjbClass() {
		return (java.lang.String)this.getValue(EJB_CLASS);
	}

	// This attribute is mandatory
	public void setSessionType(java.lang.String value) {
		this.setValue(SESSION_TYPE, value);
	}

	//
	public java.lang.String getSessionType() {
		return (java.lang.String)this.getValue(SESSION_TYPE);
	}

	// This attribute is mandatory
	public void setTransactionType(java.lang.String value) {
		this.setValue(TRANSACTION_TYPE, value);
	}

	//
	public java.lang.String getTransactionType() {
		return (java.lang.String)this.getValue(TRANSACTION_TYPE);
	}

	// This attribute is an array, possibly empty
	public void setEnvEntry(int index, org.netbeans.modules.j2ee.dd.api.common.EnvEntry valueInterface) {
		EnvEntry value = (EnvEntry) valueInterface;
		this.setValue(ENV_ENTRY, index, value);
	}

	//
	public org.netbeans.modules.j2ee.dd.api.common.EnvEntry getEnvEntry(int index) {
		return (EnvEntry)this.getValue(ENV_ENTRY, index);
	}

	// Return the number of properties
	public int sizeEnvEntry() {
		return this.size(ENV_ENTRY);
	}

	// This attribute is an array, possibly empty
	public void setEnvEntry(org.netbeans.modules.j2ee.dd.api.common.EnvEntry[] value) {
		this.setValue(ENV_ENTRY, value);
	}

	//
	public org.netbeans.modules.j2ee.dd.api.common.EnvEntry[] getEnvEntry() {
		return (EnvEntry[])this.getValues(ENV_ENTRY);
	}

	// Add a new element returning its index in the list
	public int addEnvEntry(org.netbeans.modules.j2ee.dd.api.common.EnvEntry valueInterface) {
		EnvEntry value = (EnvEntry) valueInterface;
		int positionOfNewItem = this.addValue(ENV_ENTRY, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeEnvEntry(org.netbeans.modules.j2ee.dd.api.common.EnvEntry valueInterface) {
		EnvEntry value = (EnvEntry) valueInterface;
		return this.removeValue(ENV_ENTRY, value);
	}

	// This attribute is an array, possibly empty
	public void setEjbRef(int index, org.netbeans.modules.j2ee.dd.api.common.EjbRef valueInterface) {
		EjbRef value = (EjbRef) valueInterface;
		this.setValue(EJB_REF, index, value);
	}

	//
	public org.netbeans.modules.j2ee.dd.api.common.EjbRef getEjbRef(int index) {
		return (EjbRef)this.getValue(EJB_REF, index);
	}

	// Return the number of properties
	public int sizeEjbRef() {
		return this.size(EJB_REF);
	}

	// This attribute is an array, possibly empty
	public void setEjbRef(org.netbeans.modules.j2ee.dd.api.common.EjbRef[] value) {
		this.setValue(EJB_REF, value);
	}

	//
	public org.netbeans.modules.j2ee.dd.api.common.EjbRef[] getEjbRef() {
		return (EjbRef[])this.getValues(EJB_REF);
	}

	// Add a new element returning its index in the list
	public int addEjbRef(org.netbeans.modules.j2ee.dd.api.common.EjbRef valueInterface) {
		EjbRef value = (EjbRef) valueInterface;
		int positionOfNewItem = this.addValue(EJB_REF, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeEjbRef(org.netbeans.modules.j2ee.dd.api.common.EjbRef valueInterface) {
		EjbRef value = (EjbRef) valueInterface;
		return this.removeValue(EJB_REF, value);
	}

	// This attribute is an array, possibly empty
	public void setEjbLocalRef(int index, org.netbeans.modules.j2ee.dd.api.common.EjbLocalRef valueInterface) {
		EjbLocalRef value = (EjbLocalRef) valueInterface;
		this.setValue(EJB_LOCAL_REF, index, value);
	}

	//
	public org.netbeans.modules.j2ee.dd.api.common.EjbLocalRef getEjbLocalRef(int index) {
		return (EjbLocalRef)this.getValue(EJB_LOCAL_REF, index);
	}

	// Return the number of properties
	public int sizeEjbLocalRef() {
		return this.size(EJB_LOCAL_REF);
	}

	// This attribute is an array, possibly empty
	public void setEjbLocalRef(org.netbeans.modules.j2ee.dd.api.common.EjbLocalRef[] value) {
		this.setValue(EJB_LOCAL_REF, value);
	}

	//
	public org.netbeans.modules.j2ee.dd.api.common.EjbLocalRef[] getEjbLocalRef() {
		return (EjbLocalRef[])this.getValues(EJB_LOCAL_REF);
	}

	// Add a new element returning its index in the list
	public int addEjbLocalRef(org.netbeans.modules.j2ee.dd.api.common.EjbLocalRef valueInterface) {
		EjbLocalRef value = (EjbLocalRef) valueInterface;
		int positionOfNewItem = this.addValue(EJB_LOCAL_REF, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeEjbLocalRef(org.netbeans.modules.j2ee.dd.api.common.EjbLocalRef valueInterface) {
		EjbLocalRef value = (EjbLocalRef) valueInterface;
		return this.removeValue(EJB_LOCAL_REF, value);
	}

	// This attribute is an array, possibly empty
	public void setServiceRef(int index, org.netbeans.modules.j2ee.dd.api.common.ServiceRef valueInterface) {
		ServiceRef value = (ServiceRef) valueInterface;
		this.setValue(SERVICE_REF, index, value);
	}

	//
	public org.netbeans.modules.j2ee.dd.api.common.ServiceRef getServiceRef(int index) {
		return (ServiceRef)this.getValue(SERVICE_REF, index);
	}

	// Return the number of properties
	public int sizeServiceRef() {
		return this.size(SERVICE_REF);
	}

	// This attribute is an array, possibly empty
	public void setServiceRef(org.netbeans.modules.j2ee.dd.api.common.ServiceRef[] value) {
		this.setValue(SERVICE_REF, value);
	}

	//
	public org.netbeans.modules.j2ee.dd.api.common.ServiceRef[] getServiceRef() {
		return (ServiceRef[])this.getValues(SERVICE_REF);
	}

	// Add a new element returning its index in the list
	public int addServiceRef(org.netbeans.modules.j2ee.dd.api.common.ServiceRef valueInterface) {
		ServiceRef value = (ServiceRef) valueInterface;
		int positionOfNewItem = this.addValue(SERVICE_REF, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeServiceRef(org.netbeans.modules.j2ee.dd.api.common.ServiceRef valueInterface) {
		ServiceRef value = (ServiceRef) valueInterface;
		return this.removeValue(SERVICE_REF, value);
	}

	// This attribute is an array, possibly empty
	public void setResourceRef(int index, org.netbeans.modules.j2ee.dd.api.common.ResourceRef valueInterface) {
		ResourceRef value = (ResourceRef) valueInterface;
		this.setValue(RESOURCE_REF, index, value);
	}

	//
	public org.netbeans.modules.j2ee.dd.api.common.ResourceRef getResourceRef(int index) {
		return (ResourceRef)this.getValue(RESOURCE_REF, index);
	}

	// Return the number of properties
	public int sizeResourceRef() {
		return this.size(RESOURCE_REF);
	}

	// This attribute is an array, possibly empty
	public void setResourceRef(org.netbeans.modules.j2ee.dd.api.common.ResourceRef[] value) {
		this.setValue(RESOURCE_REF, value);
	}

	//
	public org.netbeans.modules.j2ee.dd.api.common.ResourceRef[] getResourceRef() {
		return (ResourceRef[])this.getValues(RESOURCE_REF);
	}

	// Add a new element returning its index in the list
	public int addResourceRef(org.netbeans.modules.j2ee.dd.api.common.ResourceRef valueInterface) {
		ResourceRef value = (ResourceRef) valueInterface;
		int positionOfNewItem = this.addValue(RESOURCE_REF, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeResourceRef(org.netbeans.modules.j2ee.dd.api.common.ResourceRef valueInterface) {
		ResourceRef value = (ResourceRef) valueInterface;
		return this.removeValue(RESOURCE_REF, value);
	}

	// This attribute is an array, possibly empty
	public void setResourceEnvRef(int index, org.netbeans.modules.j2ee.dd.api.common.ResourceEnvRef valueInterface) {
		ResourceEnvRef value = (ResourceEnvRef) valueInterface;
		this.setValue(RESOURCE_ENV_REF, index, value);
	}

	//
	public org.netbeans.modules.j2ee.dd.api.common.ResourceEnvRef getResourceEnvRef(int index) {
		return (ResourceEnvRef)this.getValue(RESOURCE_ENV_REF, index);
	}

	// Return the number of properties
	public int sizeResourceEnvRef() {
		return this.size(RESOURCE_ENV_REF);
	}

	// This attribute is an array, possibly empty
	public void setResourceEnvRef(org.netbeans.modules.j2ee.dd.api.common.ResourceEnvRef[] value) {
		this.setValue(RESOURCE_ENV_REF, value);
	}

	//
	public org.netbeans.modules.j2ee.dd.api.common.ResourceEnvRef[] getResourceEnvRef() {
		return (ResourceEnvRef[])this.getValues(RESOURCE_ENV_REF);
	}

	// Add a new element returning its index in the list
	public int addResourceEnvRef(org.netbeans.modules.j2ee.dd.api.common.ResourceEnvRef valueInterface) {
		ResourceEnvRef value = (ResourceEnvRef) valueInterface;
		int positionOfNewItem = this.addValue(RESOURCE_ENV_REF, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeResourceEnvRef(org.netbeans.modules.j2ee.dd.api.common.ResourceEnvRef valueInterface) {
		ResourceEnvRef value = (ResourceEnvRef) valueInterface;
		return this.removeValue(RESOURCE_ENV_REF, value);
	}

	// This attribute is an array, possibly empty
	public void setMessageDestinationRef(int index, org.netbeans.modules.j2ee.dd.api.common.MessageDestinationRef valueInterface) {
		MessageDestinationRef value = (MessageDestinationRef) valueInterface;
		this.setValue(MESSAGE_DESTINATION_REF, index, value);
	}

	//
	public org.netbeans.modules.j2ee.dd.api.common.MessageDestinationRef getMessageDestinationRef(int index) {
		return (MessageDestinationRef)this.getValue(MESSAGE_DESTINATION_REF, index);
	}

	// Return the number of properties
	public int sizeMessageDestinationRef() {
		return this.size(MESSAGE_DESTINATION_REF);
	}

	// This attribute is an array, possibly empty
	public void setMessageDestinationRef(org.netbeans.modules.j2ee.dd.api.common.MessageDestinationRef[] value) {
		this.setValue(MESSAGE_DESTINATION_REF, value);
	}

	//
	public org.netbeans.modules.j2ee.dd.api.common.MessageDestinationRef[] getMessageDestinationRef() {
		return (MessageDestinationRef[])this.getValues(MESSAGE_DESTINATION_REF);
	}

	// Add a new element returning its index in the list
	public int addMessageDestinationRef(org.netbeans.modules.j2ee.dd.api.common.MessageDestinationRef valueInterface) {
		MessageDestinationRef value = (MessageDestinationRef) valueInterface;
		int positionOfNewItem = this.addValue(MESSAGE_DESTINATION_REF, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeMessageDestinationRef(org.netbeans.modules.j2ee.dd.api.common.MessageDestinationRef valueInterface) {
		MessageDestinationRef value = (MessageDestinationRef) valueInterface;
		return this.removeValue(MESSAGE_DESTINATION_REF, value);
	}

	// This attribute is an array, possibly empty
	public void setSecurityRoleRef(int index, org.netbeans.modules.j2ee.dd.api.common.SecurityRoleRef valueInterface) {
		SecurityRoleRef value = (SecurityRoleRef) valueInterface;
		this.setValue(SECURITY_ROLE_REF, index, value);
	}

	//
	public org.netbeans.modules.j2ee.dd.api.common.SecurityRoleRef getSecurityRoleRef(int index) {
		return (SecurityRoleRef)this.getValue(SECURITY_ROLE_REF, index);
	}

	// Return the number of properties
	public int sizeSecurityRoleRef() {
		return this.size(SECURITY_ROLE_REF);
	}

	// This attribute is an array, possibly empty
	public void setSecurityRoleRef(org.netbeans.modules.j2ee.dd.api.common.SecurityRoleRef[] value) {
		this.setValue(SECURITY_ROLE_REF, value);
	}

	//
	public org.netbeans.modules.j2ee.dd.api.common.SecurityRoleRef[] getSecurityRoleRef() {
		return (SecurityRoleRef[])this.getValues(SECURITY_ROLE_REF);
	}

	// Add a new element returning its index in the list
	public int addSecurityRoleRef(org.netbeans.modules.j2ee.dd.api.common.SecurityRoleRef valueInterface) {
		SecurityRoleRef value = (SecurityRoleRef) valueInterface;
		int positionOfNewItem = this.addValue(SECURITY_ROLE_REF, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeSecurityRoleRef(org.netbeans.modules.j2ee.dd.api.common.SecurityRoleRef valueInterface) {
		SecurityRoleRef value = (SecurityRoleRef) valueInterface;
		return this.removeValue(SECURITY_ROLE_REF, value);
	}

	// This attribute is optional
	public void setSecurityIdentity(org.netbeans.modules.j2ee.dd.api.ejb.SecurityIdentity valueInterface) {
		SecurityIdentity value = (SecurityIdentity) valueInterface;
		this.setValue(SECURITY_IDENTITY, value);
	}

	//
	public org.netbeans.modules.j2ee.dd.api.ejb.SecurityIdentity getSecurityIdentity() {
		return (SecurityIdentity)this.getValue(SECURITY_IDENTITY);
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
	public org.netbeans.modules.j2ee.dd.api.common.EnvEntry newEnvEntry() {
		return new EnvEntry();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public org.netbeans.modules.j2ee.dd.api.common.EjbRef newEjbRef() {
		return new EjbRef();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public org.netbeans.modules.j2ee.dd.api.common.EjbLocalRef newEjbLocalRef() {
		return new EjbLocalRef();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public org.netbeans.modules.j2ee.dd.api.common.ServiceRef newServiceRef() {
		return new ServiceRef();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public org.netbeans.modules.j2ee.dd.api.common.ResourceRef newResourceRef() {
		return new ResourceRef();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public org.netbeans.modules.j2ee.dd.api.common.ResourceEnvRef newResourceEnvRef() {
		return new ResourceEnvRef();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public org.netbeans.modules.j2ee.dd.api.common.MessageDestinationRef newMessageDestinationRef() {
		return new MessageDestinationRef();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public org.netbeans.modules.j2ee.dd.api.common.SecurityRoleRef newSecurityRoleRef() {
		return new SecurityRoleRef();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public org.netbeans.modules.j2ee.dd.api.ejb.SecurityIdentity newSecurityIdentity() {
		return new SecurityIdentity();
	}

	//
	public static void addComparator(org.netbeans.modules.schema2beans.BeanComparator c) {
		comparators.add(c);
	}

	//
	public static void removeComparator(org.netbeans.modules.schema2beans.BeanComparator c) {
		comparators.remove(c);
	}

	
                public String getKeyProperty() { 
                    return "EjbName"; 
                }
                public org.netbeans.modules.j2ee.dd.api.ejb.EjbJar getRoot() { 
                    return (org.netbeans.modules.j2ee.dd.api.ejb.EjbJar) _getRoot(); 
                }
                // EJB 3.0
                public void setMappedName(String value) throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public String getMappedName() throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public void setTimeoutMethod(org.netbeans.modules.j2ee.dd.api.ejb.NamedMethod valueInterface) throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public org.netbeans.modules.j2ee.dd.api.ejb.NamedMethod getTimeoutMethod() throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public void setAroundInvoke(int index, org.netbeans.modules.j2ee.dd.api.ejb.AroundInvoke valueInterface) throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public org.netbeans.modules.j2ee.dd.api.ejb.AroundInvoke getAroundInvoke(int index) throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public int sizeAroundInvoke() throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public void setAroundInvoke(org.netbeans.modules.j2ee.dd.api.ejb.AroundInvoke[] value) throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public org.netbeans.modules.j2ee.dd.api.ejb.AroundInvoke[] getAroundInvoke() throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public int addAroundInvoke(org.netbeans.modules.j2ee.dd.api.ejb.AroundInvoke valueInterface) throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public int removeAroundInvoke(org.netbeans.modules.j2ee.dd.api.ejb.AroundInvoke valueInterface) throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public void setPersistenceContextRef(int index, org.netbeans.modules.j2ee.dd.api.ejb.PersistenceContextRef valueInterface) throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public org.netbeans.modules.j2ee.dd.api.ejb.PersistenceContextRef getPersistenceContextRef(int index) throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public int sizePersistenceContextRef() throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public void setPersistenceContextRef(org.netbeans.modules.j2ee.dd.api.ejb.PersistenceContextRef[] value) throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public org.netbeans.modules.j2ee.dd.api.ejb.PersistenceContextRef[] getPersistenceContextRef() throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public int addPersistenceContextRef(org.netbeans.modules.j2ee.dd.api.ejb.PersistenceContextRef valueInterface) throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public int removePersistenceContextRef(org.netbeans.modules.j2ee.dd.api.ejb.PersistenceContextRef valueInterface) throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public void setPersistenceUnitRef(int index, org.netbeans.modules.j2ee.dd.api.ejb.PersistenceUnitRef valueInterface) throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public org.netbeans.modules.j2ee.dd.api.ejb.PersistenceUnitRef getPersistenceUnitRef(int index) throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public int sizePersistenceUnitRef() throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public void setPersistenceUnitRef(org.netbeans.modules.j2ee.dd.api.ejb.PersistenceUnitRef[] value) throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public org.netbeans.modules.j2ee.dd.api.ejb.PersistenceUnitRef[] getPersistenceUnitRef() throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public int addPersistenceUnitRef(org.netbeans.modules.j2ee.dd.api.ejb.PersistenceUnitRef valueInterface) throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public int removePersistenceUnitRef(org.netbeans.modules.j2ee.dd.api.ejb.PersistenceUnitRef valueInterface) throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public void setPostConstruct(int index, org.netbeans.modules.j2ee.dd.api.ejb.LifecycleCallback valueInterface) throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public org.netbeans.modules.j2ee.dd.api.ejb.LifecycleCallback getPostConstruct(int index) throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public int sizePostConstruct() throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public void setPostConstruct(org.netbeans.modules.j2ee.dd.api.ejb.LifecycleCallback[] value) throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public org.netbeans.modules.j2ee.dd.api.ejb.LifecycleCallback[] getPostConstruct() throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public int addPostConstruct(org.netbeans.modules.j2ee.dd.api.ejb.LifecycleCallback valueInterface) throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public int removePostConstruct(org.netbeans.modules.j2ee.dd.api.ejb.LifecycleCallback valueInterface) throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public void setPreDestroy(int index, org.netbeans.modules.j2ee.dd.api.ejb.LifecycleCallback valueInterface) throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public org.netbeans.modules.j2ee.dd.api.ejb.LifecycleCallback getPreDestroy(int index) throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public int sizePreDestroy() throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public void setPreDestroy(org.netbeans.modules.j2ee.dd.api.ejb.LifecycleCallback[] value) throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public org.netbeans.modules.j2ee.dd.api.ejb.LifecycleCallback[] getPreDestroy() throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public int addPreDestroy(org.netbeans.modules.j2ee.dd.api.ejb.LifecycleCallback valueInterface) throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public int removePreDestroy(org.netbeans.modules.j2ee.dd.api.ejb.LifecycleCallback valueInterface) throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public org.netbeans.modules.j2ee.dd.api.ejb.NamedMethod newNamedMethod() throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public org.netbeans.modules.j2ee.dd.api.ejb.AroundInvoke newAroundInvoke() throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public org.netbeans.modules.j2ee.dd.api.ejb.PersistenceContextRef newPersistenceContextRef() throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public org.netbeans.modules.j2ee.dd.api.ejb.PersistenceUnitRef newPersistenceUnitRef() throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public org.netbeans.modules.j2ee.dd.api.ejb.LifecycleCallback newLifecycleCallback() throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                // EJB 3.0
                public void setBusinessLocal(int index, String value) throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public String getBusinessLocal(int index) throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public int sizeBusinessLocal() throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public void setBusinessLocal(String[] value) throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public String[] getBusinessLocal() throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public int addBusinessLocal(String value) throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public int removeBusinessLocal(String value) throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public void setBusinessRemote(int index, String value) throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public String getBusinessRemote(int index) throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public int sizeBusinessRemote() throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public void setBusinessRemote(String[] value) throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public String[] getBusinessRemote() throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public int addBusinessRemote(String value) throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public int removeBusinessRemote(String value) throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public void setInitMethod(int index, org.netbeans.modules.j2ee.dd.api.ejb.InitMethod valueInterface) throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public org.netbeans.modules.j2ee.dd.api.ejb.InitMethod getInitMethod(int index) throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public int sizeInitMethod() throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public void setInitMethod(org.netbeans.modules.j2ee.dd.api.ejb.InitMethod[] value) throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public org.netbeans.modules.j2ee.dd.api.ejb.InitMethod[] getInitMethod() throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public int addInitMethod(org.netbeans.modules.j2ee.dd.api.ejb.InitMethod valueInterface) throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public int removeInitMethod(org.netbeans.modules.j2ee.dd.api.ejb.InitMethod valueInterface) throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public void setRemoveMethod(int index, org.netbeans.modules.j2ee.dd.api.ejb.RemoveMethod valueInterface) throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public org.netbeans.modules.j2ee.dd.api.ejb.RemoveMethod getRemoveMethod(int index) throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public int sizeRemoveMethod() throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public void setRemoveMethod(org.netbeans.modules.j2ee.dd.api.ejb.RemoveMethod[] value) throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public org.netbeans.modules.j2ee.dd.api.ejb.RemoveMethod[] getRemoveMethod() throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public int addRemoveMethod(org.netbeans.modules.j2ee.dd.api.ejb.RemoveMethod valueInterface) throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public int removeRemoveMethod(org.netbeans.modules.j2ee.dd.api.ejb.RemoveMethod valueInterface) throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public void setPostActivate(int index, org.netbeans.modules.j2ee.dd.api.ejb.LifecycleCallback valueInterface) throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public org.netbeans.modules.j2ee.dd.api.ejb.LifecycleCallback getPostActivate(int index) throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public int sizePostActivate() throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public void setPostActivate(org.netbeans.modules.j2ee.dd.api.ejb.LifecycleCallback[] value) throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public org.netbeans.modules.j2ee.dd.api.ejb.LifecycleCallback[] getPostActivate() throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public int addPostActivate(org.netbeans.modules.j2ee.dd.api.ejb.LifecycleCallback valueInterface) throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public int removePostActivate(org.netbeans.modules.j2ee.dd.api.ejb.LifecycleCallback valueInterface) throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public void setPrePassivate(int index, org.netbeans.modules.j2ee.dd.api.ejb.LifecycleCallback valueInterface) throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public org.netbeans.modules.j2ee.dd.api.ejb.LifecycleCallback getPrePassivate(int index) throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public int sizePrePassivate() throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public void setPrePassivate(org.netbeans.modules.j2ee.dd.api.ejb.LifecycleCallback[] value) throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public org.netbeans.modules.j2ee.dd.api.ejb.LifecycleCallback[] getPrePassivate() throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public int addPrePassivate(org.netbeans.modules.j2ee.dd.api.ejb.LifecycleCallback valueInterface) throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public int removePrePassivate(org.netbeans.modules.j2ee.dd.api.ejb.LifecycleCallback valueInterface) throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public org.netbeans.modules.j2ee.dd.api.ejb.InitMethod newInitMethod() throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                public org.netbeans.modules.j2ee.dd.api.ejb.RemoveMethod newRemoveMethod() throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.ejb.EjbJar.VERSION_2_1);
                }
                //EJB 3.1
                public boolean isLocalBean() {
                    return false;
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
			org.netbeans.modules.j2ee.dd.impl.ejb.model_2_1.Icon element = (org.netbeans.modules.j2ee.dd.impl.ejb.model_2_1.Icon) getIcon(_index);
			if (element != null) {
				((Icon)element).validate();
			}
		}
		// Validating property ejbName
		if (getEjbName() == null) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getEjbName() == null", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "ejbName", this);	// NOI18N
		}
		// Validating property home
		// Validating property remote
		// Validating property localHome
		// Validating property local
		// Validating property serviceEndpoint
		// Validating property ejbClass
		if (getEjbClass() == null) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getEjbClass() == null", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "ejbClass", this);	// NOI18N
		}
		// Validating property sessionType
		if (getSessionType() == null) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getSessionType() == null", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "sessionType", this);	// NOI18N
		}
		final java.lang.String[] enumRestrictionSessionType = {"Stateful", "Stateless"};
		restrictionFailure = true;
		for (int _index2 = 0; _index2 < enumRestrictionSessionType.length; 
			++_index2) {
			if (enumRestrictionSessionType[_index2].equals(getSessionType())) {
				restrictionFailure = false;
				break;
			}
		}
		if (restrictionFailure) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getSessionType() enumeration test", org.netbeans.modules.schema2beans.ValidateException.FailureType.ENUM_RESTRICTION, "sessionType", this);	// NOI18N
		}
		// Validating property transactionType
		if (getTransactionType() == null) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getTransactionType() == null", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "transactionType", this);	// NOI18N
		}
		final java.lang.String[] enumRestrictionTransactionType = {"Bean", "Container"};
		restrictionFailure = true;
		for (int _index2 = 0; 
			_index2 < enumRestrictionTransactionType.length; ++_index2) {
			if (enumRestrictionTransactionType[_index2].equals(getTransactionType())) {
				restrictionFailure = false;
				break;
			}
		}
		if (restrictionFailure) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getTransactionType() enumeration test", org.netbeans.modules.schema2beans.ValidateException.FailureType.ENUM_RESTRICTION, "transactionType", this);	// NOI18N
		}
		// Validating property envEntry
		for (int _index = 0; _index < sizeEnvEntry(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.ejb.model_2_1.EnvEntry element = (org.netbeans.modules.j2ee.dd.impl.ejb.model_2_1.EnvEntry) getEnvEntry(_index);
			if (element != null) {
				((EnvEntry)element).validate();
			}
		}
		// Validating property ejbRef
		for (int _index = 0; _index < sizeEjbRef(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.ejb.model_2_1.EjbRef element = (org.netbeans.modules.j2ee.dd.impl.ejb.model_2_1.EjbRef) getEjbRef(_index);
			if (element != null) {
				((EjbRef)element).validate();
			}
		}
		// Validating property ejbLocalRef
		for (int _index = 0; _index < sizeEjbLocalRef(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.ejb.model_2_1.EjbLocalRef element = (org.netbeans.modules.j2ee.dd.impl.ejb.model_2_1.EjbLocalRef) getEjbLocalRef(_index);
			if (element != null) {
				((EjbLocalRef)element).validate();
			}
		}
		// Validating property serviceRef
		for (int _index = 0; _index < sizeServiceRef(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.ejb.model_2_1.ServiceRef element = (org.netbeans.modules.j2ee.dd.impl.ejb.model_2_1.ServiceRef) getServiceRef(_index);
			if (element != null) {
				((ServiceRef)element).validate();
			}
		}
		// Validating property resourceRef
		for (int _index = 0; _index < sizeResourceRef(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.ejb.model_2_1.ResourceRef element = (org.netbeans.modules.j2ee.dd.impl.ejb.model_2_1.ResourceRef) getResourceRef(_index);
			if (element != null) {
				((ResourceRef)element).validate();
			}
		}
		// Validating property resourceEnvRef
		for (int _index = 0; _index < sizeResourceEnvRef(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.ejb.model_2_1.ResourceEnvRef element = (org.netbeans.modules.j2ee.dd.impl.ejb.model_2_1.ResourceEnvRef) getResourceEnvRef(_index);
			if (element != null) {
				((ResourceEnvRef)element).validate();
			}
		}
		// Validating property messageDestinationRef
		for (int _index = 0; _index < sizeMessageDestinationRef(); 
			++_index) {
			org.netbeans.modules.j2ee.dd.impl.ejb.model_2_1.MessageDestinationRef element = (org.netbeans.modules.j2ee.dd.impl.ejb.model_2_1.MessageDestinationRef) getMessageDestinationRef(_index);
			if (element != null) {
				((MessageDestinationRef)element).validate();
			}
		}
		// Validating property securityRoleRef
		for (int _index = 0; _index < sizeSecurityRoleRef(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.ejb.model_2_1.SecurityRoleRef element = (org.netbeans.modules.j2ee.dd.impl.ejb.model_2_1.SecurityRoleRef) getSecurityRoleRef(_index);
			if (element != null) {
				((SecurityRoleRef)element).validate();
			}
		}
		// Validating property securityIdentity
		if (getSecurityIdentity() != null) {
			((SecurityIdentity)getSecurityIdentity()).validate();
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
		str.append("EjbName");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getEjbName();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(EJB_NAME, 0, str, indent);

		str.append(indent);
		str.append("Home");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getHome();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(HOME, 0, str, indent);

		str.append(indent);
		str.append("Remote");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getRemote();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(REMOTE, 0, str, indent);

		str.append(indent);
		str.append("LocalHome");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getLocalHome();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(LOCAL_HOME, 0, str, indent);

		str.append(indent);
		str.append("Local");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getLocal();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(LOCAL, 0, str, indent);

		str.append(indent);
		str.append("ServiceEndpoint");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getServiceEndpoint();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(SERVICE_ENDPOINT, 0, str, indent);

		str.append(indent);
		str.append("EjbClass");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getEjbClass();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(EJB_CLASS, 0, str, indent);

		str.append(indent);
		str.append("SessionType");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getSessionType();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(SESSION_TYPE, 0, str, indent);

		str.append(indent);
		str.append("TransactionType");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getTransactionType();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(TRANSACTION_TYPE, 0, str, indent);

		str.append(indent);
		str.append("EnvEntry["+this.sizeEnvEntry()+"]");	// NOI18N
		for(int i=0; i<this.sizeEnvEntry(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getEnvEntry(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(ENV_ENTRY, i, str, indent);
		}

		str.append(indent);
		str.append("EjbRef["+this.sizeEjbRef()+"]");	// NOI18N
		for(int i=0; i<this.sizeEjbRef(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getEjbRef(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(EJB_REF, i, str, indent);
		}

		str.append(indent);
		str.append("EjbLocalRef["+this.sizeEjbLocalRef()+"]");	// NOI18N
		for(int i=0; i<this.sizeEjbLocalRef(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getEjbLocalRef(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(EJB_LOCAL_REF, i, str, indent);
		}

		str.append(indent);
		str.append("ServiceRef["+this.sizeServiceRef()+"]");	// NOI18N
		for(int i=0; i<this.sizeServiceRef(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getServiceRef(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(SERVICE_REF, i, str, indent);
		}

		str.append(indent);
		str.append("ResourceRef["+this.sizeResourceRef()+"]");	// NOI18N
		for(int i=0; i<this.sizeResourceRef(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getResourceRef(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(RESOURCE_REF, i, str, indent);
		}

		str.append(indent);
		str.append("ResourceEnvRef["+this.sizeResourceEnvRef()+"]");	// NOI18N
		for(int i=0; i<this.sizeResourceEnvRef(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getResourceEnvRef(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(RESOURCE_ENV_REF, i, str, indent);
		}

		str.append(indent);
		str.append("MessageDestinationRef["+this.sizeMessageDestinationRef()+"]");	// NOI18N
		for(int i=0; i<this.sizeMessageDestinationRef(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getMessageDestinationRef(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(MESSAGE_DESTINATION_REF, i, str, indent);
		}

		str.append(indent);
		str.append("SecurityRoleRef["+this.sizeSecurityRoleRef()+"]");	// NOI18N
		for(int i=0; i<this.sizeSecurityRoleRef(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getSecurityRoleRef(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(SECURITY_ROLE_REF, i, str, indent);
		}

		str.append(indent);
		str.append("SecurityIdentity");	// NOI18N
		n = (org.netbeans.modules.schema2beans.BaseBean) this.getSecurityIdentity();
		if (n != null)
			n.dump(str, indent + "\t");	// NOI18N
		else
			str.append(indent+"\tnull");	// NOI18N
		this.dumpAttributes(SECURITY_IDENTITY, 0, str, indent);

	}
	public String dumpBeanNode(){
		StringBuffer str = new StringBuffer();
		str.append("SessionBean\n");	// NOI18N
		this.dump(str, "\n  ");	// NOI18N
		return str.toString();
	}}

// END_NOI18N

