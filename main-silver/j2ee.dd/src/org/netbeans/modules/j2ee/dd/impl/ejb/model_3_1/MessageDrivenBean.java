/**
 *	This generated bean class MessageDrivenBean matches the schema element 'message-driven-beanType'.
 *  The root bean class is EjbJar
 *
 *	===============================================================
 *	
 *	
 *	        This group keeps the usage of the contained JNDI environment
 *	        reference elements consistent across Java EE deployment descriptors.
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

public class MessageDrivenBean extends org.netbeans.modules.j2ee.dd.impl.common.ComponentBeanMultiple
	 implements org.netbeans.modules.j2ee.dd.api.ejb.MessageDriven,org.netbeans.modules.j2ee.dd.impl.common.KeyBean
{

	static Vector comparators = new Vector();
	static{
		MessageDrivenBean.addComparator(new org.netbeans.modules.j2ee.dd.impl.common.Comparator());
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
	static public final String MAPPED_NAME = "MappedName";	// NOI18N
	static public final String MAPPEDNAMEID = "MappedNameId";	// NOI18N
	static public final String EJB_CLASS = "EjbClass";	// NOI18N
	static public final String MESSAGING_TYPE = "MessagingType";	// NOI18N
	static public final String TIMEOUT_METHOD = "TimeoutMethod";	// NOI18N
	static public final String TIMER = "Timer";	// NOI18N
	static public final String TRANSACTION_TYPE = "TransactionType";	// NOI18N
	static public final String MESSAGE_DESTINATION_TYPE = "MessageDestinationType";	// NOI18N
	static public final String MESSAGE_DESTINATION_LINK = "MessageDestinationLink";	// NOI18N
	static public final String ACTIVATION_CONFIG = "ActivationConfig";	// NOI18N
	static public final String AROUND_INVOKE = "AroundInvoke";	// NOI18N
	static public final String AROUND_TIMEOUT = "AroundTimeout";	// NOI18N
	static public final String ENV_ENTRY = "EnvEntry";	// NOI18N
	static public final String EJB_REF = "EjbRef";	// NOI18N
	static public final String EJB_LOCAL_REF = "EjbLocalRef";	// NOI18N
	static public final String SERVICE_REF = "ServiceRef";	// NOI18N
	static public final String RESOURCE_REF = "ResourceRef";	// NOI18N
	static public final String RESOURCE_ENV_REF = "ResourceEnvRef";	// NOI18N
	static public final String MESSAGE_DESTINATION_REF = "MessageDestinationRef";	// NOI18N
	static public final String PERSISTENCE_CONTEXT_REF = "PersistenceContextRef";	// NOI18N
	static public final String PERSISTENCE_UNIT_REF = "PersistenceUnitRef";	// NOI18N
	static public final String POST_CONSTRUCT = "PostConstruct";	// NOI18N
	static public final String PRE_DESTROY = "PreDestroy";	// NOI18N
	static public final String DATA_SOURCE = "DataSource";	// NOI18N
	static public final String SECURITY_ROLE_REF = "SecurityRoleRef";	// NOI18N
	static public final String SECURITY_IDENTITY = "SecurityIdentity";	// NOI18N

	public MessageDrivenBean() {
		this(Common.USE_DEFAULT_VALUES);
	}

	public MessageDrivenBean(int options)
	{
		super(comparators, runtimeVersion);
		// Properties (see root bean comments for the bean graph)
		initPropertyTables(29);
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
		this.createProperty("mapped-name", 	// NOI18N
			MAPPED_NAME, 
			Common.TYPE_0_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createAttribute(MAPPED_NAME, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("ejb-class", 	// NOI18N
			EJB_CLASS, 
			Common.TYPE_0_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createProperty("messaging-type", 	// NOI18N
			MESSAGING_TYPE, 
			Common.TYPE_0_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createProperty("timeout-method", 	// NOI18N
			TIMEOUT_METHOD, 
			Common.TYPE_0_1 | Common.TYPE_BEAN | Common.TYPE_KEY, 
			NamedMethod.class);
		this.createAttribute(TIMEOUT_METHOD, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("timer", 	// NOI18N
			TIMER, 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			TimerType.class);
		this.createAttribute(TIMER, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("transaction-type", 	// NOI18N
			TRANSACTION_TYPE, 
			Common.TYPE_0_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createProperty("message-destination-type", 	// NOI18N
			MESSAGE_DESTINATION_TYPE, 
			Common.TYPE_0_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createProperty("message-destination-link", 	// NOI18N
			MESSAGE_DESTINATION_LINK, 
			Common.TYPE_0_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createProperty("activation-config", 	// NOI18N
			ACTIVATION_CONFIG, 
			Common.TYPE_0_1 | Common.TYPE_BEAN | Common.TYPE_KEY, 
			ActivationConfig.class);
		this.createAttribute(ACTIVATION_CONFIG, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("around-invoke", 	// NOI18N
			AROUND_INVOKE, 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			AroundInvoke.class);
		this.createProperty("around-timeout", 	// NOI18N
			AROUND_TIMEOUT, 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			AroundTimeoutType.class);
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
		this.createProperty("persistence-context-ref", 	// NOI18N
			PERSISTENCE_CONTEXT_REF, 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			PersistenceContextRef.class);
		this.createAttribute(PERSISTENCE_CONTEXT_REF, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("persistence-unit-ref", 	// NOI18N
			PERSISTENCE_UNIT_REF, 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			PersistenceUnitRef.class);
		this.createAttribute(PERSISTENCE_UNIT_REF, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("post-construct", 	// NOI18N
			POST_CONSTRUCT, 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			LifecycleCallback.class);
		this.createProperty("pre-destroy", 	// NOI18N
			PRE_DESTROY, 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			LifecycleCallback.class);
		this.createProperty("data-source", 	// NOI18N
			DATA_SOURCE, 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			DataSourceType.class);
		this.createAttribute(DATA_SOURCE, "id", "Id", 
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

	// This attribute is optional
	public void setEjbClass(java.lang.String value) {
		this.setValue(EJB_CLASS, value);
	}

	//
	public java.lang.String getEjbClass() {
		return (java.lang.String)this.getValue(EJB_CLASS);
	}

	// This attribute is optional
	public void setMessagingType(java.lang.String value) {
		this.setValue(MESSAGING_TYPE, value);
	}

	//
	public java.lang.String getMessagingType() {
		return (java.lang.String)this.getValue(MESSAGING_TYPE);
	}

	// This attribute is optional
	public void setTimeoutMethod(org.netbeans.modules.j2ee.dd.api.ejb.NamedMethod valueInterface) {
		NamedMethod value = (NamedMethod) valueInterface;
		this.setValue(TIMEOUT_METHOD, value);
	}

	//
	public org.netbeans.modules.j2ee.dd.api.ejb.NamedMethod getTimeoutMethod() {
		return (NamedMethod)this.getValue(TIMEOUT_METHOD);
	}

	// This attribute is an array, possibly empty
	public void setTimer(int index, TimerType value) {
		this.setValue(TIMER, index, value);
	}

	//
	public TimerType getTimer(int index) {
		return (TimerType)this.getValue(TIMER, index);
	}

	// Return the number of properties
	public int sizeTimer() {
		return this.size(TIMER);
	}

	// This attribute is an array, possibly empty
	public void setTimer(TimerType[] value) {
		this.setValue(TIMER, value);
	}

	//
	public TimerType[] getTimer() {
		return (TimerType[])this.getValues(TIMER);
	}

	// Add a new element returning its index in the list
	public int addTimer(org.netbeans.modules.j2ee.dd.impl.ejb.model_3_1.TimerType value) {
		int positionOfNewItem = this.addValue(TIMER, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeTimer(org.netbeans.modules.j2ee.dd.impl.ejb.model_3_1.TimerType value) {
		return this.removeValue(TIMER, value);
	}

	// This attribute is optional
	public void setTransactionType(java.lang.String value) {
		this.setValue(TRANSACTION_TYPE, value);
	}

	//
	public java.lang.String getTransactionType() {
		return (java.lang.String)this.getValue(TRANSACTION_TYPE);
	}

	// This attribute is optional
	public void setMessageDestinationType(java.lang.String value) {
		this.setValue(MESSAGE_DESTINATION_TYPE, value);
	}

	//
	public java.lang.String getMessageDestinationType() {
		return (java.lang.String)this.getValue(MESSAGE_DESTINATION_TYPE);
	}

	// This attribute is optional
	public void setMessageDestinationLink(java.lang.String value) {
		this.setValue(MESSAGE_DESTINATION_LINK, value);
	}

	//
	public java.lang.String getMessageDestinationLink() {
		return (java.lang.String)this.getValue(MESSAGE_DESTINATION_LINK);
	}

	// This attribute is optional
	public void setActivationConfig(org.netbeans.modules.j2ee.dd.api.ejb.ActivationConfig valueInterface) {
		ActivationConfig value = (ActivationConfig) valueInterface;
		this.setValue(ACTIVATION_CONFIG, value);
	}

	//
	public org.netbeans.modules.j2ee.dd.api.ejb.ActivationConfig getActivationConfig() {
		return (ActivationConfig)this.getValue(ACTIVATION_CONFIG);
	}

	// This attribute is an array, possibly empty
	public void setAroundInvoke(int index, org.netbeans.modules.j2ee.dd.api.ejb.AroundInvoke valueInterface) {
		AroundInvoke value = (AroundInvoke) valueInterface;
		this.setValue(AROUND_INVOKE, index, value);
	}

	//
	public org.netbeans.modules.j2ee.dd.api.ejb.AroundInvoke getAroundInvoke(int index) {
		return (AroundInvoke)this.getValue(AROUND_INVOKE, index);
	}

	// Return the number of properties
	public int sizeAroundInvoke() {
		return this.size(AROUND_INVOKE);
	}

	// This attribute is an array, possibly empty
	public void setAroundInvoke(org.netbeans.modules.j2ee.dd.api.ejb.AroundInvoke[] value) {
		this.setValue(AROUND_INVOKE, value);
	}

	//
	public org.netbeans.modules.j2ee.dd.api.ejb.AroundInvoke[] getAroundInvoke() {
		return (AroundInvoke[])this.getValues(AROUND_INVOKE);
	}

	// Add a new element returning its index in the list
	public int addAroundInvoke(org.netbeans.modules.j2ee.dd.api.ejb.AroundInvoke valueInterface) {
		AroundInvoke value = (AroundInvoke) valueInterface;
		int positionOfNewItem = this.addValue(AROUND_INVOKE, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeAroundInvoke(org.netbeans.modules.j2ee.dd.api.ejb.AroundInvoke valueInterface) {
		AroundInvoke value = (AroundInvoke) valueInterface;
		return this.removeValue(AROUND_INVOKE, value);
	}

	// This attribute is an array, possibly empty
	public void setAroundTimeout(int index, AroundTimeoutType value) {
		this.setValue(AROUND_TIMEOUT, index, value);
	}

	//
	public AroundTimeoutType getAroundTimeout(int index) {
		return (AroundTimeoutType)this.getValue(AROUND_TIMEOUT, index);
	}

	// Return the number of properties
	public int sizeAroundTimeout() {
		return this.size(AROUND_TIMEOUT);
	}

	// This attribute is an array, possibly empty
	public void setAroundTimeout(AroundTimeoutType[] value) {
		this.setValue(AROUND_TIMEOUT, value);
	}

	//
	public AroundTimeoutType[] getAroundTimeout() {
		return (AroundTimeoutType[])this.getValues(AROUND_TIMEOUT);
	}

	// Add a new element returning its index in the list
	public int addAroundTimeout(org.netbeans.modules.j2ee.dd.impl.ejb.model_3_1.AroundTimeoutType value) {
		int positionOfNewItem = this.addValue(AROUND_TIMEOUT, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeAroundTimeout(org.netbeans.modules.j2ee.dd.impl.ejb.model_3_1.AroundTimeoutType value) {
		return this.removeValue(AROUND_TIMEOUT, value);
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
	public void setPersistenceContextRef(int index, org.netbeans.modules.j2ee.dd.api.ejb.PersistenceContextRef valueInterface) {
		PersistenceContextRef value = (PersistenceContextRef) valueInterface;
		this.setValue(PERSISTENCE_CONTEXT_REF, index, value);
	}

	//
	public org.netbeans.modules.j2ee.dd.api.ejb.PersistenceContextRef getPersistenceContextRef(int index) {
		return (PersistenceContextRef)this.getValue(PERSISTENCE_CONTEXT_REF, index);
	}

	// Return the number of properties
	public int sizePersistenceContextRef() {
		return this.size(PERSISTENCE_CONTEXT_REF);
	}

	// This attribute is an array, possibly empty
	public void setPersistenceContextRef(org.netbeans.modules.j2ee.dd.api.ejb.PersistenceContextRef[] value) {
		this.setValue(PERSISTENCE_CONTEXT_REF, value);
	}

	//
	public org.netbeans.modules.j2ee.dd.api.ejb.PersistenceContextRef[] getPersistenceContextRef() {
		return (PersistenceContextRef[])this.getValues(PERSISTENCE_CONTEXT_REF);
	}

	// Add a new element returning its index in the list
	public int addPersistenceContextRef(org.netbeans.modules.j2ee.dd.api.ejb.PersistenceContextRef valueInterface) {
		PersistenceContextRef value = (PersistenceContextRef) valueInterface;
		int positionOfNewItem = this.addValue(PERSISTENCE_CONTEXT_REF, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removePersistenceContextRef(org.netbeans.modules.j2ee.dd.api.ejb.PersistenceContextRef valueInterface) {
		PersistenceContextRef value = (PersistenceContextRef) valueInterface;
		return this.removeValue(PERSISTENCE_CONTEXT_REF, value);
	}

	// This attribute is an array, possibly empty
	public void setPersistenceUnitRef(int index, org.netbeans.modules.j2ee.dd.api.ejb.PersistenceUnitRef valueInterface) {
		PersistenceUnitRef value = (PersistenceUnitRef) valueInterface;
		this.setValue(PERSISTENCE_UNIT_REF, index, value);
	}

	//
	public org.netbeans.modules.j2ee.dd.api.ejb.PersistenceUnitRef getPersistenceUnitRef(int index) {
		return (PersistenceUnitRef)this.getValue(PERSISTENCE_UNIT_REF, index);
	}

	// Return the number of properties
	public int sizePersistenceUnitRef() {
		return this.size(PERSISTENCE_UNIT_REF);
	}

	// This attribute is an array, possibly empty
	public void setPersistenceUnitRef(org.netbeans.modules.j2ee.dd.api.ejb.PersistenceUnitRef[] value) {
		this.setValue(PERSISTENCE_UNIT_REF, value);
	}

	//
	public org.netbeans.modules.j2ee.dd.api.ejb.PersistenceUnitRef[] getPersistenceUnitRef() {
		return (PersistenceUnitRef[])this.getValues(PERSISTENCE_UNIT_REF);
	}

	// Add a new element returning its index in the list
	public int addPersistenceUnitRef(org.netbeans.modules.j2ee.dd.api.ejb.PersistenceUnitRef valueInterface) {
		PersistenceUnitRef value = (PersistenceUnitRef) valueInterface;
		int positionOfNewItem = this.addValue(PERSISTENCE_UNIT_REF, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removePersistenceUnitRef(org.netbeans.modules.j2ee.dd.api.ejb.PersistenceUnitRef valueInterface) {
		PersistenceUnitRef value = (PersistenceUnitRef) valueInterface;
		return this.removeValue(PERSISTENCE_UNIT_REF, value);
	}

	// This attribute is an array, possibly empty
	public void setPostConstruct(int index, org.netbeans.modules.j2ee.dd.api.ejb.LifecycleCallback valueInterface) {
		LifecycleCallback value = (LifecycleCallback) valueInterface;
		this.setValue(POST_CONSTRUCT, index, value);
	}

	//
	public org.netbeans.modules.j2ee.dd.api.ejb.LifecycleCallback getPostConstruct(int index) {
		return (LifecycleCallback)this.getValue(POST_CONSTRUCT, index);
	}

	// Return the number of properties
	public int sizePostConstruct() {
		return this.size(POST_CONSTRUCT);
	}

	// This attribute is an array, possibly empty
	public void setPostConstruct(org.netbeans.modules.j2ee.dd.api.ejb.LifecycleCallback[] value) {
		this.setValue(POST_CONSTRUCT, value);
	}

	//
	public org.netbeans.modules.j2ee.dd.api.ejb.LifecycleCallback[] getPostConstruct() {
		return (LifecycleCallback[])this.getValues(POST_CONSTRUCT);
	}

	// Add a new element returning its index in the list
	public int addPostConstruct(org.netbeans.modules.j2ee.dd.api.ejb.LifecycleCallback valueInterface) {
		LifecycleCallback value = (LifecycleCallback) valueInterface;
		int positionOfNewItem = this.addValue(POST_CONSTRUCT, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removePostConstruct(org.netbeans.modules.j2ee.dd.api.ejb.LifecycleCallback valueInterface) {
		LifecycleCallback value = (LifecycleCallback) valueInterface;
		return this.removeValue(POST_CONSTRUCT, value);
	}

	// This attribute is an array, possibly empty
	public void setPreDestroy(int index, org.netbeans.modules.j2ee.dd.api.ejb.LifecycleCallback valueInterface) {
		LifecycleCallback value = (LifecycleCallback) valueInterface;
		this.setValue(PRE_DESTROY, index, value);
	}

	//
	public org.netbeans.modules.j2ee.dd.api.ejb.LifecycleCallback getPreDestroy(int index) {
		return (LifecycleCallback)this.getValue(PRE_DESTROY, index);
	}

	// Return the number of properties
	public int sizePreDestroy() {
		return this.size(PRE_DESTROY);
	}

	// This attribute is an array, possibly empty
	public void setPreDestroy(org.netbeans.modules.j2ee.dd.api.ejb.LifecycleCallback[] value) {
		this.setValue(PRE_DESTROY, value);
	}

	//
	public org.netbeans.modules.j2ee.dd.api.ejb.LifecycleCallback[] getPreDestroy() {
		return (LifecycleCallback[])this.getValues(PRE_DESTROY);
	}

	// Add a new element returning its index in the list
	public int addPreDestroy(org.netbeans.modules.j2ee.dd.api.ejb.LifecycleCallback valueInterface) {
		LifecycleCallback value = (LifecycleCallback) valueInterface;
		int positionOfNewItem = this.addValue(PRE_DESTROY, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removePreDestroy(org.netbeans.modules.j2ee.dd.api.ejb.LifecycleCallback valueInterface) {
		LifecycleCallback value = (LifecycleCallback) valueInterface;
		return this.removeValue(PRE_DESTROY, value);
	}

	// This attribute is an array, possibly empty
	public void setDataSource(int index, DataSourceType value) {
		this.setValue(DATA_SOURCE, index, value);
	}

	//
	public DataSourceType getDataSource(int index) {
		return (DataSourceType)this.getValue(DATA_SOURCE, index);
	}

	// Return the number of properties
	public int sizeDataSource() {
		return this.size(DATA_SOURCE);
	}

	// This attribute is an array, possibly empty
	public void setDataSource(DataSourceType[] value) {
		this.setValue(DATA_SOURCE, value);
	}

	//
	public DataSourceType[] getDataSource() {
		return (DataSourceType[])this.getValues(DATA_SOURCE);
	}

	// Add a new element returning its index in the list
	public int addDataSource(org.netbeans.modules.j2ee.dd.impl.ejb.model_3_1.DataSourceType value) {
		int positionOfNewItem = this.addValue(DATA_SOURCE, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeDataSource(org.netbeans.modules.j2ee.dd.impl.ejb.model_3_1.DataSourceType value) {
		return this.removeValue(DATA_SOURCE, value);
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
	public org.netbeans.modules.j2ee.dd.api.ejb.NamedMethod newNamedMethod() {
		return new NamedMethod();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public TimerType newTimerType() {
		return new TimerType();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public org.netbeans.modules.j2ee.dd.api.ejb.ActivationConfig newActivationConfig() {
		return new ActivationConfig();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public org.netbeans.modules.j2ee.dd.api.ejb.AroundInvoke newAroundInvoke() {
		return new AroundInvoke();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public AroundTimeoutType newAroundTimeoutType() {
		return new AroundTimeoutType();
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
	public org.netbeans.modules.j2ee.dd.api.ejb.PersistenceContextRef newPersistenceContextRef() {
		return new PersistenceContextRef();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public org.netbeans.modules.j2ee.dd.api.ejb.PersistenceUnitRef newPersistenceUnitRef() {
		return new PersistenceUnitRef();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public org.netbeans.modules.j2ee.dd.api.ejb.LifecycleCallback newLifecycleCallback() {
		return new LifecycleCallback();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public DataSourceType newDataSourceType() {
		return new DataSourceType();
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

	 
                public org.netbeans.modules.j2ee.dd.api.ejb.EjbJar getRoot() {  
                    return (org.netbeans.modules.j2ee.dd.api.ejb.EjbJar) _getRoot();  
                } 
                // not needed for with 3.1
                public String getKeyProperty() {  
                    return "EjbName";  
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
			org.netbeans.modules.j2ee.dd.impl.ejb.model_3_1.Icon element = (org.netbeans.modules.j2ee.dd.impl.ejb.model_3_1.Icon) getIcon(_index);
			if (element != null) {
				((Icon)element).validate();
			}
		}
		// Validating property ejbName
		if (getEjbName() == null) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getEjbName() == null", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "ejbName", this);	// NOI18N
		}
		// Validating property mappedName
		// Validating property mappedNameId
		if (getMappedNameId() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getMappedNameId() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "mappedNameId", this);	// NOI18N
			}
		}
		// Validating property ejbClass
		// Validating property messagingType
		// Validating property timeoutMethod
		if (getTimeoutMethod() != null) {
			((NamedMethod)getTimeoutMethod()).validate();
		}
		// Validating property timer
		for (int _index = 0; _index < sizeTimer(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.ejb.model_3_1.TimerType element = getTimer(_index);
			if (element != null) {
				element.validate();
			}
		}
		// Validating property transactionType
		if (getTransactionType() != null) {
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
		}
		// Validating property messageDestinationType
		// Validating property messageDestinationLink
		// Validating property activationConfig
		if (getActivationConfig() != null) {
			((ActivationConfig)getActivationConfig()).validate();
		}
		// Validating property aroundInvoke
		for (int _index = 0; _index < sizeAroundInvoke(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.ejb.model_3_1.AroundInvoke element = (org.netbeans.modules.j2ee.dd.impl.ejb.model_3_1.AroundInvoke) getAroundInvoke(_index);
			if (element != null) {
				((AroundInvoke)element).validate();
			}
		}
		// Validating property aroundTimeout
		for (int _index = 0; _index < sizeAroundTimeout(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.ejb.model_3_1.AroundTimeoutType element = getAroundTimeout(_index);
			if (element != null) {
				element.validate();
			}
		}
		// Validating property envEntry
		for (int _index = 0; _index < sizeEnvEntry(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.ejb.model_3_1.EnvEntry element = (org.netbeans.modules.j2ee.dd.impl.ejb.model_3_1.EnvEntry) getEnvEntry(_index);
			if (element != null) {
				((EnvEntry)element).validate();
			}
		}
		// Validating property ejbRef
		for (int _index = 0; _index < sizeEjbRef(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.ejb.model_3_1.EjbRef element = (org.netbeans.modules.j2ee.dd.impl.ejb.model_3_1.EjbRef) getEjbRef(_index);
			if (element != null) {
				((EjbRef)element).validate();
			}
		}
		// Validating property ejbLocalRef
		for (int _index = 0; _index < sizeEjbLocalRef(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.ejb.model_3_1.EjbLocalRef element = (org.netbeans.modules.j2ee.dd.impl.ejb.model_3_1.EjbLocalRef) getEjbLocalRef(_index);
			if (element != null) {
				((EjbLocalRef)element).validate();
			}
		}
		// Validating property serviceRef
		for (int _index = 0; _index < sizeServiceRef(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.ejb.model_3_1.ServiceRef element = (org.netbeans.modules.j2ee.dd.impl.ejb.model_3_1.ServiceRef) getServiceRef(_index);
			if (element != null) {
				((ServiceRef)element).validate();
			}
		}
		// Validating property resourceRef
		for (int _index = 0; _index < sizeResourceRef(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.ejb.model_3_1.ResourceRef element = (org.netbeans.modules.j2ee.dd.impl.ejb.model_3_1.ResourceRef) getResourceRef(_index);
			if (element != null) {
				((ResourceRef)element).validate();
			}
		}
		// Validating property resourceEnvRef
		for (int _index = 0; _index < sizeResourceEnvRef(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.ejb.model_3_1.ResourceEnvRef element = (org.netbeans.modules.j2ee.dd.impl.ejb.model_3_1.ResourceEnvRef) getResourceEnvRef(_index);
			if (element != null) {
				((ResourceEnvRef)element).validate();
			}
		}
		// Validating property messageDestinationRef
		for (int _index = 0; _index < sizeMessageDestinationRef(); 
			++_index) {
			org.netbeans.modules.j2ee.dd.impl.ejb.model_3_1.MessageDestinationRef element = (org.netbeans.modules.j2ee.dd.impl.ejb.model_3_1.MessageDestinationRef) getMessageDestinationRef(_index);
			if (element != null) {
				((MessageDestinationRef)element).validate();
			}
		}
		// Validating property persistenceContextRef
		for (int _index = 0; _index < sizePersistenceContextRef(); 
			++_index) {
			org.netbeans.modules.j2ee.dd.impl.ejb.model_3_1.PersistenceContextRef element = (org.netbeans.modules.j2ee.dd.impl.ejb.model_3_1.PersistenceContextRef) getPersistenceContextRef(_index);
			if (element != null) {
				((PersistenceContextRef)element).validate();
			}
		}
		// Validating property persistenceUnitRef
		for (int _index = 0; _index < sizePersistenceUnitRef(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.ejb.model_3_1.PersistenceUnitRef element = (org.netbeans.modules.j2ee.dd.impl.ejb.model_3_1.PersistenceUnitRef) getPersistenceUnitRef(_index);
			if (element != null) {
				((PersistenceUnitRef)element).validate();
			}
		}
		// Validating property postConstruct
		for (int _index = 0; _index < sizePostConstruct(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.ejb.model_3_1.LifecycleCallback element = (org.netbeans.modules.j2ee.dd.impl.ejb.model_3_1.LifecycleCallback) getPostConstruct(_index);
			if (element != null) {
				((LifecycleCallback)element).validate();
			}
		}
		// Validating property preDestroy
		for (int _index = 0; _index < sizePreDestroy(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.ejb.model_3_1.LifecycleCallback element = (org.netbeans.modules.j2ee.dd.impl.ejb.model_3_1.LifecycleCallback) getPreDestroy(_index);
			if (element != null) {
				((LifecycleCallback)element).validate();
			}
		}
		// Validating property dataSource
		for (int _index = 0; _index < sizeDataSource(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.ejb.model_3_1.DataSourceType element = getDataSource(_index);
			if (element != null) {
				element.validate();
			}
		}
		// Validating property securityRoleRef
		for (int _index = 0; _index < sizeSecurityRoleRef(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.ejb.model_3_1.SecurityRoleRef element = (org.netbeans.modules.j2ee.dd.impl.ejb.model_3_1.SecurityRoleRef) getSecurityRoleRef(_index);
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
		str.append("MappedName");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getMappedName();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(MAPPED_NAME, 0, str, indent);

		str.append(indent);
		str.append("EjbClass");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getEjbClass();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(EJB_CLASS, 0, str, indent);

		str.append(indent);
		str.append("MessagingType");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getMessagingType();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(MESSAGING_TYPE, 0, str, indent);

		str.append(indent);
		str.append("TimeoutMethod");	// NOI18N
		n = (org.netbeans.modules.schema2beans.BaseBean) this.getTimeoutMethod();
		if (n != null)
			n.dump(str, indent + "\t");	// NOI18N
		else
			str.append(indent+"\tnull");	// NOI18N
		this.dumpAttributes(TIMEOUT_METHOD, 0, str, indent);

		str.append(indent);
		str.append("Timer["+this.sizeTimer()+"]");	// NOI18N
		for(int i=0; i<this.sizeTimer(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getTimer(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(TIMER, i, str, indent);
		}

		str.append(indent);
		str.append("TransactionType");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getTransactionType();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(TRANSACTION_TYPE, 0, str, indent);

		str.append(indent);
		str.append("MessageDestinationType");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getMessageDestinationType();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(MESSAGE_DESTINATION_TYPE, 0, str, indent);

		str.append(indent);
		str.append("MessageDestinationLink");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getMessageDestinationLink();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(MESSAGE_DESTINATION_LINK, 0, str, indent);

		str.append(indent);
		str.append("ActivationConfig");	// NOI18N
		n = (org.netbeans.modules.schema2beans.BaseBean) this.getActivationConfig();
		if (n != null)
			n.dump(str, indent + "\t");	// NOI18N
		else
			str.append(indent+"\tnull");	// NOI18N
		this.dumpAttributes(ACTIVATION_CONFIG, 0, str, indent);

		str.append(indent);
		str.append("AroundInvoke["+this.sizeAroundInvoke()+"]");	// NOI18N
		for(int i=0; i<this.sizeAroundInvoke(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getAroundInvoke(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(AROUND_INVOKE, i, str, indent);
		}

		str.append(indent);
		str.append("AroundTimeout["+this.sizeAroundTimeout()+"]");	// NOI18N
		for(int i=0; i<this.sizeAroundTimeout(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getAroundTimeout(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(AROUND_TIMEOUT, i, str, indent);
		}

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
		str.append("PersistenceContextRef["+this.sizePersistenceContextRef()+"]");	// NOI18N
		for(int i=0; i<this.sizePersistenceContextRef(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getPersistenceContextRef(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(PERSISTENCE_CONTEXT_REF, i, str, indent);
		}

		str.append(indent);
		str.append("PersistenceUnitRef["+this.sizePersistenceUnitRef()+"]");	// NOI18N
		for(int i=0; i<this.sizePersistenceUnitRef(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getPersistenceUnitRef(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(PERSISTENCE_UNIT_REF, i, str, indent);
		}

		str.append(indent);
		str.append("PostConstruct["+this.sizePostConstruct()+"]");	// NOI18N
		for(int i=0; i<this.sizePostConstruct(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getPostConstruct(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(POST_CONSTRUCT, i, str, indent);
		}

		str.append(indent);
		str.append("PreDestroy["+this.sizePreDestroy()+"]");	// NOI18N
		for(int i=0; i<this.sizePreDestroy(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getPreDestroy(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(PRE_DESTROY, i, str, indent);
		}

		str.append(indent);
		str.append("DataSource["+this.sizeDataSource()+"]");	// NOI18N
		for(int i=0; i<this.sizeDataSource(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getDataSource(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(DATA_SOURCE, i, str, indent);
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
		str.append("MessageDrivenBean\n");	// NOI18N
		this.dump(str, "\n  ");	// NOI18N
		return str.toString();
	}}

// END_NOI18N

