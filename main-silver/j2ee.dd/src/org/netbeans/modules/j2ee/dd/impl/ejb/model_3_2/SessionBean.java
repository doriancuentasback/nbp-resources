/**
 *	This generated bean class SessionBean matches the schema element 'session-beanType'.
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

package org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2;

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
	static public final String MAPPED_NAME = "MappedName";	// NOI18N
	static public final String MAPPEDNAMEID = "MappedNameId";	// NOI18N
	static public final String HOME = "Home";	// NOI18N
	static public final String REMOTE = "Remote";	// NOI18N
	static public final String LOCAL_HOME = "LocalHome";	// NOI18N
	static public final String LOCAL = "Local";	// NOI18N
	static public final String BUSINESS_LOCAL = "BusinessLocal";	// NOI18N
	static public final String BUSINESS_REMOTE = "BusinessRemote";	// NOI18N
	static public final String LOCAL_BEAN = "LocalBean";	// NOI18N
	static public final String LOCALBEANID = "LocalBeanId";	// NOI18N
	static public final String SERVICE_ENDPOINT = "ServiceEndpoint";	// NOI18N
	static public final String EJB_CLASS = "EjbClass";	// NOI18N
	static public final String SESSION_TYPE = "SessionType";	// NOI18N
	static public final String STATEFUL_TIMEOUT = "StatefulTimeout";	// NOI18N
	static public final String TIMEOUT_METHOD = "TimeoutMethod";	// NOI18N
	static public final String TIMER = "Timer";	// NOI18N
	static public final String INIT_ON_STARTUP = "InitOnStartup";	// NOI18N
	static public final String CONCURRENCY_MANAGEMENT_TYPE = "ConcurrencyManagementType";	// NOI18N
	static public final String CONCURRENT_METHOD = "ConcurrentMethod";	// NOI18N
	static public final String DEPENDS_ON = "DependsOn";	// NOI18N
	static public final String INIT_METHOD = "InitMethod";	// NOI18N
	static public final String REMOVE_METHOD = "RemoveMethod";	// NOI18N
	static public final String ASYNC_METHOD = "AsyncMethod";	// NOI18N
	static public final String TRANSACTION_TYPE = "TransactionType";	// NOI18N
	static public final String AFTER_BEGIN_METHOD = "AfterBeginMethod";	// NOI18N
	static public final String BEFORE_COMPLETION_METHOD = "BeforeCompletionMethod";	// NOI18N
	static public final String AFTER_COMPLETION_METHOD = "AfterCompletionMethod";	// NOI18N
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
	static public final String JMS_CONNECTION_FACTORY = "JmsConnectionFactory";	// NOI18N
	static public final String JMS_DESTINATION = "JmsDestination";	// NOI18N
	static public final String MAIL_SESSION = "MailSession";	// NOI18N
	static public final String CONNECTION_FACTORY = "ConnectionFactory";	// NOI18N
	static public final String ADMINISTERED_OBJECT = "AdministeredObject";	// NOI18N
	static public final String POST_ACTIVATE = "PostActivate";	// NOI18N
	static public final String PRE_PASSIVATE = "PrePassivate";	// NOI18N
	static public final String SECURITY_ROLE_REF = "SecurityRoleRef";	// NOI18N
	static public final String SECURITY_IDENTITY = "SecurityIdentity";	// NOI18N
	static public final String PASSIVATION_CAPABLE = "PassivationCapable";	// NOI18N

	public SessionBean() {
		this(Common.USE_DEFAULT_VALUES);
	}

	public SessionBean(int options)
	{
		super(comparators, runtimeVersion);
		// Properties (see root bean comments for the bean graph)
		initPropertyTables(53);
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
		this.createProperty("business-local", 	// NOI18N
			BUSINESS_LOCAL, 
			Common.TYPE_0_N | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createProperty("business-remote", 	// NOI18N
			BUSINESS_REMOTE, 
			Common.TYPE_0_N | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createProperty("local-bean", 	// NOI18N
			LOCAL_BEAN, 
			Common.TYPE_0_1 | Common.TYPE_BOOLEAN | Common.TYPE_KEY, 
			Boolean.class);
		this.createAttribute(LOCAL_BEAN, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("service-endpoint", 	// NOI18N
			SERVICE_ENDPOINT, 
			Common.TYPE_0_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createProperty("ejb-class", 	// NOI18N
			EJB_CLASS, 
			Common.TYPE_0_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createProperty("session-type", 	// NOI18N
			SESSION_TYPE, 
			Common.TYPE_0_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createProperty("stateful-timeout", 	// NOI18N
			STATEFUL_TIMEOUT, 
			Common.TYPE_0_1 | Common.TYPE_BEAN | Common.TYPE_KEY, 
			StatefulTimeoutType.class);
		this.createAttribute(STATEFUL_TIMEOUT, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
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
		this.createProperty("init-on-startup", 	// NOI18N
			INIT_ON_STARTUP, 
			Common.TYPE_0_1 | Common.TYPE_BOOLEAN | Common.TYPE_SHOULD_NOT_BE_EMPTY | Common.TYPE_KEY, 
			Boolean.class);
		this.createProperty("concurrency-management-type", 	// NOI18N
			CONCURRENCY_MANAGEMENT_TYPE, 
			Common.TYPE_0_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createProperty("concurrent-method", 	// NOI18N
			CONCURRENT_METHOD, 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			ConcurrentMethodType.class);
		this.createAttribute(CONCURRENT_METHOD, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("depends-on", 	// NOI18N
			DEPENDS_ON, 
			Common.TYPE_0_1 | Common.TYPE_BEAN | Common.TYPE_KEY, 
			DependsOnType.class);
		this.createAttribute(DEPENDS_ON, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("init-method", 	// NOI18N
			INIT_METHOD, 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			InitMethod.class);
		this.createAttribute(INIT_METHOD, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("remove-method", 	// NOI18N
			REMOVE_METHOD, 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			RemoveMethod.class);
		this.createAttribute(REMOVE_METHOD, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("async-method", 	// NOI18N
			ASYNC_METHOD, 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			AsyncMethodType.class);
		this.createAttribute(ASYNC_METHOD, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("transaction-type", 	// NOI18N
			TRANSACTION_TYPE, 
			Common.TYPE_0_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createProperty("after-begin-method", 	// NOI18N
			AFTER_BEGIN_METHOD, 
			Common.TYPE_0_1 | Common.TYPE_BEAN | Common.TYPE_KEY, 
			NamedMethod.class);
		this.createAttribute(AFTER_BEGIN_METHOD, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("before-completion-method", 	// NOI18N
			BEFORE_COMPLETION_METHOD, 
			Common.TYPE_0_1 | Common.TYPE_BEAN | Common.TYPE_KEY, 
			NamedMethod.class);
		this.createAttribute(BEFORE_COMPLETION_METHOD, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("after-completion-method", 	// NOI18N
			AFTER_COMPLETION_METHOD, 
			Common.TYPE_0_1 | Common.TYPE_BEAN | Common.TYPE_KEY, 
			NamedMethod.class);
		this.createAttribute(AFTER_COMPLETION_METHOD, "id", "Id", 
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
		this.createProperty("jms-connection-factory", 	// NOI18N
			JMS_CONNECTION_FACTORY, 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			JmsConnectionFactoryType.class);
		this.createAttribute(JMS_CONNECTION_FACTORY, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("jms-destination", 	// NOI18N
			JMS_DESTINATION, 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			JmsDestinationType.class);
		this.createAttribute(JMS_DESTINATION, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("mail-session", 	// NOI18N
			MAIL_SESSION, 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			MailSessionType.class);
		this.createAttribute(MAIL_SESSION, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("connection-factory", 	// NOI18N
			CONNECTION_FACTORY, 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			ConnectionFactoryResourceType.class);
		this.createAttribute(CONNECTION_FACTORY, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("administered-object", 	// NOI18N
			ADMINISTERED_OBJECT, 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			AdministeredObjectType.class);
		this.createAttribute(ADMINISTERED_OBJECT, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("post-activate", 	// NOI18N
			POST_ACTIVATE, 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			LifecycleCallback.class);
		this.createProperty("pre-passivate", 	// NOI18N
			PRE_PASSIVATE, 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			LifecycleCallback.class);
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
		this.createProperty("passivation-capable", 	// NOI18N
			PASSIVATION_CAPABLE, 
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

	// This attribute is an array, possibly empty
	public void setBusinessLocal(int index, java.lang.String value) {
		this.setValue(BUSINESS_LOCAL, index, value);
	}

	//
	public java.lang.String getBusinessLocal(int index) {
		return (java.lang.String)this.getValue(BUSINESS_LOCAL, index);
	}

	// Return the number of properties
	public int sizeBusinessLocal() {
		return this.size(BUSINESS_LOCAL);
	}

	// This attribute is an array, possibly empty
	public void setBusinessLocal(java.lang.String[] value) {
		this.setValue(BUSINESS_LOCAL, value);
	}

	//
	public java.lang.String[] getBusinessLocal() {
		return (java.lang.String[])this.getValues(BUSINESS_LOCAL);
	}

	// Add a new element returning its index in the list
	public int addBusinessLocal(java.lang.String value) {
		int positionOfNewItem = this.addValue(BUSINESS_LOCAL, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeBusinessLocal(java.lang.String value) {
		return this.removeValue(BUSINESS_LOCAL, value);
	}

	// This attribute is an array, possibly empty
	public void setBusinessRemote(int index, java.lang.String value) {
		this.setValue(BUSINESS_REMOTE, index, value);
	}

	//
	public java.lang.String getBusinessRemote(int index) {
		return (java.lang.String)this.getValue(BUSINESS_REMOTE, index);
	}

	// Return the number of properties
	public int sizeBusinessRemote() {
		return this.size(BUSINESS_REMOTE);
	}

	// This attribute is an array, possibly empty
	public void setBusinessRemote(java.lang.String[] value) {
		this.setValue(BUSINESS_REMOTE, value);
	}

	//
	public java.lang.String[] getBusinessRemote() {
		return (java.lang.String[])this.getValues(BUSINESS_REMOTE);
	}

	// Add a new element returning its index in the list
	public int addBusinessRemote(java.lang.String value) {
		int positionOfNewItem = this.addValue(BUSINESS_REMOTE, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeBusinessRemote(java.lang.String value) {
		return this.removeValue(BUSINESS_REMOTE, value);
	}

	// This attribute is optional
	public void setLocalBean(boolean value) {
		this.setValue(LOCAL_BEAN, (value ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE));
	}

	//
	public boolean isLocalBean() {
		Boolean ret = (Boolean)this.getValue(LOCAL_BEAN);
		if (ret == null)
			ret = (Boolean)Common.defaultScalarValue(Common.TYPE_BOOLEAN);
		return ((java.lang.Boolean)ret).booleanValue();
	}

	// This attribute is optional
	public void setLocalBeanId(java.lang.String value) {
		// Make sure we've got a place to put this attribute.
		if (size(LOCAL_BEAN) == 0) {
			setValue(LOCAL_BEAN, java.lang.Boolean.TRUE);
		}
		setAttributeValue(LOCAL_BEAN, "Id", value);
	}

	//
	public java.lang.String getLocalBeanId() {
		// If our element does not exist, then the attribute does not exist.
		if (size(LOCAL_BEAN) == 0) {
			return null;
		} else {
			return getAttributeValue(LOCAL_BEAN, "Id");
		}
	}

	// This attribute is optional
	public void setServiceEndpoint(java.lang.String value) {
		this.setValue(SERVICE_ENDPOINT, value);
	}

	//
	public java.lang.String getServiceEndpoint() {
		return (java.lang.String)this.getValue(SERVICE_ENDPOINT);
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
	public void setSessionType(java.lang.String value) {
		this.setValue(SESSION_TYPE, value);
	}

	//
	public java.lang.String getSessionType() {
		return (java.lang.String)this.getValue(SESSION_TYPE);
	}

	// This attribute is optional
	public void setStatefulTimeout(StatefulTimeoutType value) {
		this.setValue(STATEFUL_TIMEOUT, value);
	}

	//
	public StatefulTimeoutType getStatefulTimeout() {
		return (StatefulTimeoutType)this.getValue(STATEFUL_TIMEOUT);
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
	public int addTimer(org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2.TimerType value) {
		int positionOfNewItem = this.addValue(TIMER, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeTimer(org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2.TimerType value) {
		return this.removeValue(TIMER, value);
	}

	// This attribute is optional
	public void setInitOnStartup(boolean value) {
		this.setValue(INIT_ON_STARTUP, (value ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE));
	}

	//
	public boolean isInitOnStartup() {
		Boolean ret = (Boolean)this.getValue(INIT_ON_STARTUP);
		if (ret == null)
			ret = (Boolean)Common.defaultScalarValue(Common.TYPE_BOOLEAN);
		return ((java.lang.Boolean)ret).booleanValue();
	}

	// This attribute is optional
	public void setConcurrencyManagementType(java.lang.String value) {
		this.setValue(CONCURRENCY_MANAGEMENT_TYPE, value);
	}

	//
	public java.lang.String getConcurrencyManagementType() {
		return (java.lang.String)this.getValue(CONCURRENCY_MANAGEMENT_TYPE);
	}

	// This attribute is an array, possibly empty
	public void setConcurrentMethod(int index, ConcurrentMethodType value) {
		this.setValue(CONCURRENT_METHOD, index, value);
	}

	//
	public ConcurrentMethodType getConcurrentMethod(int index) {
		return (ConcurrentMethodType)this.getValue(CONCURRENT_METHOD, index);
	}

	// Return the number of properties
	public int sizeConcurrentMethod() {
		return this.size(CONCURRENT_METHOD);
	}

	// This attribute is an array, possibly empty
	public void setConcurrentMethod(ConcurrentMethodType[] value) {
		this.setValue(CONCURRENT_METHOD, value);
	}

	//
	public ConcurrentMethodType[] getConcurrentMethod() {
		return (ConcurrentMethodType[])this.getValues(CONCURRENT_METHOD);
	}

	// Add a new element returning its index in the list
	public int addConcurrentMethod(org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2.ConcurrentMethodType value) {
		int positionOfNewItem = this.addValue(CONCURRENT_METHOD, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeConcurrentMethod(org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2.ConcurrentMethodType value) {
		return this.removeValue(CONCURRENT_METHOD, value);
	}

	// This attribute is optional
	public void setDependsOn(DependsOnType value) {
		this.setValue(DEPENDS_ON, value);
	}

	//
	public DependsOnType getDependsOn() {
		return (DependsOnType)this.getValue(DEPENDS_ON);
	}

	// This attribute is an array, possibly empty
	public void setInitMethod(int index, org.netbeans.modules.j2ee.dd.api.ejb.InitMethod valueInterface) {
		InitMethod value = (InitMethod) valueInterface;
		this.setValue(INIT_METHOD, index, value);
	}

	//
	public org.netbeans.modules.j2ee.dd.api.ejb.InitMethod getInitMethod(int index) {
		return (InitMethod)this.getValue(INIT_METHOD, index);
	}

	// Return the number of properties
	public int sizeInitMethod() {
		return this.size(INIT_METHOD);
	}

	// This attribute is an array, possibly empty
	public void setInitMethod(org.netbeans.modules.j2ee.dd.api.ejb.InitMethod[] value) {
		this.setValue(INIT_METHOD, value);
	}

	//
	public org.netbeans.modules.j2ee.dd.api.ejb.InitMethod[] getInitMethod() {
		return (InitMethod[])this.getValues(INIT_METHOD);
	}

	// Add a new element returning its index in the list
	public int addInitMethod(org.netbeans.modules.j2ee.dd.api.ejb.InitMethod valueInterface) {
		InitMethod value = (InitMethod) valueInterface;
		int positionOfNewItem = this.addValue(INIT_METHOD, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeInitMethod(org.netbeans.modules.j2ee.dd.api.ejb.InitMethod valueInterface) {
		InitMethod value = (InitMethod) valueInterface;
		return this.removeValue(INIT_METHOD, value);
	}

	// This attribute is an array, possibly empty
	public void setRemoveMethod(int index, org.netbeans.modules.j2ee.dd.api.ejb.RemoveMethod valueInterface) {
		RemoveMethod value = (RemoveMethod) valueInterface;
		this.setValue(REMOVE_METHOD, index, value);
	}

	//
	public org.netbeans.modules.j2ee.dd.api.ejb.RemoveMethod getRemoveMethod(int index) {
		return (RemoveMethod)this.getValue(REMOVE_METHOD, index);
	}

	// Return the number of properties
	public int sizeRemoveMethod() {
		return this.size(REMOVE_METHOD);
	}

	// This attribute is an array, possibly empty
	public void setRemoveMethod(org.netbeans.modules.j2ee.dd.api.ejb.RemoveMethod[] value) {
		this.setValue(REMOVE_METHOD, value);
	}

	//
	public org.netbeans.modules.j2ee.dd.api.ejb.RemoveMethod[] getRemoveMethod() {
		return (RemoveMethod[])this.getValues(REMOVE_METHOD);
	}

	// Add a new element returning its index in the list
	public int addRemoveMethod(org.netbeans.modules.j2ee.dd.api.ejb.RemoveMethod valueInterface) {
		RemoveMethod value = (RemoveMethod) valueInterface;
		int positionOfNewItem = this.addValue(REMOVE_METHOD, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeRemoveMethod(org.netbeans.modules.j2ee.dd.api.ejb.RemoveMethod valueInterface) {
		RemoveMethod value = (RemoveMethod) valueInterface;
		return this.removeValue(REMOVE_METHOD, value);
	}

	// This attribute is an array, possibly empty
	public void setAsyncMethod(int index, AsyncMethodType value) {
		this.setValue(ASYNC_METHOD, index, value);
	}

	//
	public AsyncMethodType getAsyncMethod(int index) {
		return (AsyncMethodType)this.getValue(ASYNC_METHOD, index);
	}

	// Return the number of properties
	public int sizeAsyncMethod() {
		return this.size(ASYNC_METHOD);
	}

	// This attribute is an array, possibly empty
	public void setAsyncMethod(AsyncMethodType[] value) {
		this.setValue(ASYNC_METHOD, value);
	}

	//
	public AsyncMethodType[] getAsyncMethod() {
		return (AsyncMethodType[])this.getValues(ASYNC_METHOD);
	}

	// Add a new element returning its index in the list
	public int addAsyncMethod(org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2.AsyncMethodType value) {
		int positionOfNewItem = this.addValue(ASYNC_METHOD, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeAsyncMethod(org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2.AsyncMethodType value) {
		return this.removeValue(ASYNC_METHOD, value);
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
	public void setAfterBeginMethod(org.netbeans.modules.j2ee.dd.api.ejb.NamedMethod valueInterface) {
		NamedMethod value = (NamedMethod) valueInterface;
		this.setValue(AFTER_BEGIN_METHOD, value);
	}

	//
	public org.netbeans.modules.j2ee.dd.api.ejb.NamedMethod getAfterBeginMethod() {
		return (NamedMethod)this.getValue(AFTER_BEGIN_METHOD);
	}

	// This attribute is optional
	public void setBeforeCompletionMethod(org.netbeans.modules.j2ee.dd.api.ejb.NamedMethod valueInterface) {
		NamedMethod value = (NamedMethod) valueInterface;
		this.setValue(BEFORE_COMPLETION_METHOD, value);
	}

	//
	public org.netbeans.modules.j2ee.dd.api.ejb.NamedMethod getBeforeCompletionMethod() {
		return (NamedMethod)this.getValue(BEFORE_COMPLETION_METHOD);
	}

	// This attribute is optional
	public void setAfterCompletionMethod(org.netbeans.modules.j2ee.dd.api.ejb.NamedMethod valueInterface) {
		NamedMethod value = (NamedMethod) valueInterface;
		this.setValue(AFTER_COMPLETION_METHOD, value);
	}

	//
	public org.netbeans.modules.j2ee.dd.api.ejb.NamedMethod getAfterCompletionMethod() {
		return (NamedMethod)this.getValue(AFTER_COMPLETION_METHOD);
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
	public int addAroundTimeout(org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2.AroundTimeoutType value) {
		int positionOfNewItem = this.addValue(AROUND_TIMEOUT, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeAroundTimeout(org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2.AroundTimeoutType value) {
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
	public int addDataSource(org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2.DataSourceType value) {
		int positionOfNewItem = this.addValue(DATA_SOURCE, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeDataSource(org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2.DataSourceType value) {
		return this.removeValue(DATA_SOURCE, value);
	}

	// This attribute is an array, possibly empty
	public void setJmsConnectionFactory(int index, JmsConnectionFactoryType value) {
		this.setValue(JMS_CONNECTION_FACTORY, index, value);
	}

	//
	public JmsConnectionFactoryType getJmsConnectionFactory(int index) {
		return (JmsConnectionFactoryType)this.getValue(JMS_CONNECTION_FACTORY, index);
	}

	// Return the number of properties
	public int sizeJmsConnectionFactory() {
		return this.size(JMS_CONNECTION_FACTORY);
	}

	// This attribute is an array, possibly empty
	public void setJmsConnectionFactory(JmsConnectionFactoryType[] value) {
		this.setValue(JMS_CONNECTION_FACTORY, value);
	}

	//
	public JmsConnectionFactoryType[] getJmsConnectionFactory() {
		return (JmsConnectionFactoryType[])this.getValues(JMS_CONNECTION_FACTORY);
	}

	// Add a new element returning its index in the list
	public int addJmsConnectionFactory(org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2.JmsConnectionFactoryType value) {
		int positionOfNewItem = this.addValue(JMS_CONNECTION_FACTORY, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeJmsConnectionFactory(org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2.JmsConnectionFactoryType value) {
		return this.removeValue(JMS_CONNECTION_FACTORY, value);
	}

	// This attribute is an array, possibly empty
	public void setJmsDestination(int index, JmsDestinationType value) {
		this.setValue(JMS_DESTINATION, index, value);
	}

	//
	public JmsDestinationType getJmsDestination(int index) {
		return (JmsDestinationType)this.getValue(JMS_DESTINATION, index);
	}

	// Return the number of properties
	public int sizeJmsDestination() {
		return this.size(JMS_DESTINATION);
	}

	// This attribute is an array, possibly empty
	public void setJmsDestination(JmsDestinationType[] value) {
		this.setValue(JMS_DESTINATION, value);
	}

	//
	public JmsDestinationType[] getJmsDestination() {
		return (JmsDestinationType[])this.getValues(JMS_DESTINATION);
	}

	// Add a new element returning its index in the list
	public int addJmsDestination(org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2.JmsDestinationType value) {
		int positionOfNewItem = this.addValue(JMS_DESTINATION, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeJmsDestination(org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2.JmsDestinationType value) {
		return this.removeValue(JMS_DESTINATION, value);
	}

	// This attribute is an array, possibly empty
	public void setMailSession(int index, MailSessionType value) {
		this.setValue(MAIL_SESSION, index, value);
	}

	//
	public MailSessionType getMailSession(int index) {
		return (MailSessionType)this.getValue(MAIL_SESSION, index);
	}

	// Return the number of properties
	public int sizeMailSession() {
		return this.size(MAIL_SESSION);
	}

	// This attribute is an array, possibly empty
	public void setMailSession(MailSessionType[] value) {
		this.setValue(MAIL_SESSION, value);
	}

	//
	public MailSessionType[] getMailSession() {
		return (MailSessionType[])this.getValues(MAIL_SESSION);
	}

	// Add a new element returning its index in the list
	public int addMailSession(org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2.MailSessionType value) {
		int positionOfNewItem = this.addValue(MAIL_SESSION, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeMailSession(org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2.MailSessionType value) {
		return this.removeValue(MAIL_SESSION, value);
	}

	// This attribute is an array, possibly empty
	public void setConnectionFactory(int index, ConnectionFactoryResourceType value) {
		this.setValue(CONNECTION_FACTORY, index, value);
	}

	//
	public ConnectionFactoryResourceType getConnectionFactory(int index) {
		return (ConnectionFactoryResourceType)this.getValue(CONNECTION_FACTORY, index);
	}

	// Return the number of properties
	public int sizeConnectionFactory() {
		return this.size(CONNECTION_FACTORY);
	}

	// This attribute is an array, possibly empty
	public void setConnectionFactory(ConnectionFactoryResourceType[] value) {
		this.setValue(CONNECTION_FACTORY, value);
	}

	//
	public ConnectionFactoryResourceType[] getConnectionFactory() {
		return (ConnectionFactoryResourceType[])this.getValues(CONNECTION_FACTORY);
	}

	// Add a new element returning its index in the list
	public int addConnectionFactory(org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2.ConnectionFactoryResourceType value) {
		int positionOfNewItem = this.addValue(CONNECTION_FACTORY, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeConnectionFactory(org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2.ConnectionFactoryResourceType value) {
		return this.removeValue(CONNECTION_FACTORY, value);
	}

	// This attribute is an array, possibly empty
	public void setAdministeredObject(int index, AdministeredObjectType value) {
		this.setValue(ADMINISTERED_OBJECT, index, value);
	}

	//
	public AdministeredObjectType getAdministeredObject(int index) {
		return (AdministeredObjectType)this.getValue(ADMINISTERED_OBJECT, index);
	}

	// Return the number of properties
	public int sizeAdministeredObject() {
		return this.size(ADMINISTERED_OBJECT);
	}

	// This attribute is an array, possibly empty
	public void setAdministeredObject(AdministeredObjectType[] value) {
		this.setValue(ADMINISTERED_OBJECT, value);
	}

	//
	public AdministeredObjectType[] getAdministeredObject() {
		return (AdministeredObjectType[])this.getValues(ADMINISTERED_OBJECT);
	}

	// Add a new element returning its index in the list
	public int addAdministeredObject(org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2.AdministeredObjectType value) {
		int positionOfNewItem = this.addValue(ADMINISTERED_OBJECT, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeAdministeredObject(org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2.AdministeredObjectType value) {
		return this.removeValue(ADMINISTERED_OBJECT, value);
	}

	// This attribute is an array, possibly empty
	public void setPostActivate(int index, org.netbeans.modules.j2ee.dd.api.ejb.LifecycleCallback valueInterface) {
		LifecycleCallback value = (LifecycleCallback) valueInterface;
		this.setValue(POST_ACTIVATE, index, value);
	}

	//
	public org.netbeans.modules.j2ee.dd.api.ejb.LifecycleCallback getPostActivate(int index) {
		return (LifecycleCallback)this.getValue(POST_ACTIVATE, index);
	}

	// Return the number of properties
	public int sizePostActivate() {
		return this.size(POST_ACTIVATE);
	}

	// This attribute is an array, possibly empty
	public void setPostActivate(org.netbeans.modules.j2ee.dd.api.ejb.LifecycleCallback[] value) {
		this.setValue(POST_ACTIVATE, value);
	}

	//
	public org.netbeans.modules.j2ee.dd.api.ejb.LifecycleCallback[] getPostActivate() {
		return (LifecycleCallback[])this.getValues(POST_ACTIVATE);
	}

	// Add a new element returning its index in the list
	public int addPostActivate(org.netbeans.modules.j2ee.dd.api.ejb.LifecycleCallback valueInterface) {
		LifecycleCallback value = (LifecycleCallback) valueInterface;
		int positionOfNewItem = this.addValue(POST_ACTIVATE, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removePostActivate(org.netbeans.modules.j2ee.dd.api.ejb.LifecycleCallback valueInterface) {
		LifecycleCallback value = (LifecycleCallback) valueInterface;
		return this.removeValue(POST_ACTIVATE, value);
	}

	// This attribute is an array, possibly empty
	public void setPrePassivate(int index, org.netbeans.modules.j2ee.dd.api.ejb.LifecycleCallback valueInterface) {
		LifecycleCallback value = (LifecycleCallback) valueInterface;
		this.setValue(PRE_PASSIVATE, index, value);
	}

	//
	public org.netbeans.modules.j2ee.dd.api.ejb.LifecycleCallback getPrePassivate(int index) {
		return (LifecycleCallback)this.getValue(PRE_PASSIVATE, index);
	}

	// Return the number of properties
	public int sizePrePassivate() {
		return this.size(PRE_PASSIVATE);
	}

	// This attribute is an array, possibly empty
	public void setPrePassivate(org.netbeans.modules.j2ee.dd.api.ejb.LifecycleCallback[] value) {
		this.setValue(PRE_PASSIVATE, value);
	}

	//
	public org.netbeans.modules.j2ee.dd.api.ejb.LifecycleCallback[] getPrePassivate() {
		return (LifecycleCallback[])this.getValues(PRE_PASSIVATE);
	}

	// Add a new element returning its index in the list
	public int addPrePassivate(org.netbeans.modules.j2ee.dd.api.ejb.LifecycleCallback valueInterface) {
		LifecycleCallback value = (LifecycleCallback) valueInterface;
		int positionOfNewItem = this.addValue(PRE_PASSIVATE, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removePrePassivate(org.netbeans.modules.j2ee.dd.api.ejb.LifecycleCallback valueInterface) {
		LifecycleCallback value = (LifecycleCallback) valueInterface;
		return this.removeValue(PRE_PASSIVATE, value);
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

	// This attribute is optional
	public void setPassivationCapable(boolean value) {
		this.setValue(PASSIVATION_CAPABLE, (value ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE));
	}

	//
	public boolean isPassivationCapable() {
		Boolean ret = (Boolean)this.getValue(PASSIVATION_CAPABLE);
		if (ret == null)
			ret = (Boolean)Common.defaultScalarValue(Common.TYPE_BOOLEAN);
		return ((java.lang.Boolean)ret).booleanValue();
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
	public StatefulTimeoutType newStatefulTimeoutType() {
		return new StatefulTimeoutType();
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
	public ConcurrentMethodType newConcurrentMethodType() {
		return new ConcurrentMethodType();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public DependsOnType newDependsOnType() {
		return new DependsOnType();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public org.netbeans.modules.j2ee.dd.api.ejb.InitMethod newInitMethod() {
		return new InitMethod();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public org.netbeans.modules.j2ee.dd.api.ejb.RemoveMethod newRemoveMethod() {
		return new RemoveMethod();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public AsyncMethodType newAsyncMethodType() {
		return new AsyncMethodType();
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
	public JmsConnectionFactoryType newJmsConnectionFactoryType() {
		return new JmsConnectionFactoryType();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public JmsDestinationType newJmsDestinationType() {
		return new JmsDestinationType();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public MailSessionType newMailSessionType() {
		return new MailSessionType();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public ConnectionFactoryResourceType newConnectionFactoryResourceType() {
		return new ConnectionFactoryResourceType();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public AdministeredObjectType newAdministeredObjectType() {
		return new AdministeredObjectType();
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
			org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2.Icon element = (org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2.Icon) getIcon(_index);
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
		// Validating property home
		// Validating property remote
		// Validating property localHome
		// Validating property local
		// Validating property businessLocal
		// Validating property businessRemote
		// Validating property localBean
		// Validating property localBeanId
		if (getLocalBeanId() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getLocalBeanId() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "localBeanId", this);	// NOI18N
			}
		}
		// Validating property serviceEndpoint
		// Validating property ejbClass
		// Validating property sessionType
		if (getSessionType() != null) {
			final java.lang.String[] enumRestrictionSessionType = {"Singleton", "Stateful", "Stateless"};
			restrictionFailure = true;
			for (int _index2 = 0; 
				_index2 < enumRestrictionSessionType.length; ++_index2) {
				if (enumRestrictionSessionType[_index2].equals(getSessionType())) {
					restrictionFailure = false;
					break;
				}
			}
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getSessionType() enumeration test", org.netbeans.modules.schema2beans.ValidateException.FailureType.ENUM_RESTRICTION, "sessionType", this);	// NOI18N
			}
		}
		// Validating property statefulTimeout
		if (getStatefulTimeout() != null) {
			getStatefulTimeout().validate();
		}
		// Validating property timeoutMethod
		if (getTimeoutMethod() != null) {
			((NamedMethod)getTimeoutMethod()).validate();
		}
		// Validating property timer
		for (int _index = 0; _index < sizeTimer(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2.TimerType element = getTimer(_index);
			if (element != null) {
				element.validate();
			}
		}
		// Validating property initOnStartup
		{
			boolean patternPassed = false;
			if ((isInitOnStartup() ? "true" : "false").matches("(true|false)")) {
				patternPassed = true;
			}
			restrictionFailure = !patternPassed;
		}
		if (restrictionFailure) {
			throw new org.netbeans.modules.schema2beans.ValidateException("isInitOnStartup()", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "initOnStartup", this);	// NOI18N
		}
		// Validating property concurrencyManagementType
		if (getConcurrencyManagementType() != null) {
			final java.lang.String[] enumRestrictionConcurrencyManagementType = {"Bean", "Container"};
			restrictionFailure = true;
			for (int _index2 = 0; 
				_index2 < enumRestrictionConcurrencyManagementType.length; 
				++_index2) {
				if (enumRestrictionConcurrencyManagementType[_index2].equals(getConcurrencyManagementType())) {
					restrictionFailure = false;
					break;
				}
			}
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getConcurrencyManagementType() enumeration test", org.netbeans.modules.schema2beans.ValidateException.FailureType.ENUM_RESTRICTION, "concurrencyManagementType", this);	// NOI18N
			}
		}
		// Validating property concurrentMethod
		for (int _index = 0; _index < sizeConcurrentMethod(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2.ConcurrentMethodType element = getConcurrentMethod(_index);
			if (element != null) {
				element.validate();
			}
		}
		// Validating property dependsOn
		if (getDependsOn() != null) {
			getDependsOn().validate();
		}
		// Validating property initMethod
		for (int _index = 0; _index < sizeInitMethod(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2.InitMethod element = (org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2.InitMethod) getInitMethod(_index);
			if (element != null) {
				((InitMethod)element).validate();
			}
		}
		// Validating property removeMethod
		for (int _index = 0; _index < sizeRemoveMethod(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2.RemoveMethod element = (org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2.RemoveMethod) getRemoveMethod(_index);
			if (element != null) {
				((RemoveMethod)element).validate();
			}
		}
		// Validating property asyncMethod
		for (int _index = 0; _index < sizeAsyncMethod(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2.AsyncMethodType element = getAsyncMethod(_index);
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
		// Validating property afterBeginMethod
		if (getAfterBeginMethod() != null) {
			((NamedMethod)getAfterBeginMethod()).validate();
		}
		// Validating property beforeCompletionMethod
		if (getBeforeCompletionMethod() != null) {
			((NamedMethod)getBeforeCompletionMethod()).validate();
		}
		// Validating property afterCompletionMethod
		if (getAfterCompletionMethod() != null) {
			((NamedMethod)getAfterCompletionMethod()).validate();
		}
		// Validating property aroundInvoke
		for (int _index = 0; _index < sizeAroundInvoke(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2.AroundInvoke element = (org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2.AroundInvoke) getAroundInvoke(_index);
			if (element != null) {
				((AroundInvoke)element).validate();
			}
		}
		// Validating property aroundTimeout
		for (int _index = 0; _index < sizeAroundTimeout(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2.AroundTimeoutType element = getAroundTimeout(_index);
			if (element != null) {
				element.validate();
			}
		}
		// Validating property envEntry
		for (int _index = 0; _index < sizeEnvEntry(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2.EnvEntry element = (org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2.EnvEntry) getEnvEntry(_index);
			if (element != null) {
				((EnvEntry)element).validate();
			}
		}
		// Validating property ejbRef
		for (int _index = 0; _index < sizeEjbRef(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2.EjbRef element = (org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2.EjbRef) getEjbRef(_index);
			if (element != null) {
				((EjbRef)element).validate();
			}
		}
		// Validating property ejbLocalRef
		for (int _index = 0; _index < sizeEjbLocalRef(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2.EjbLocalRef element = (org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2.EjbLocalRef) getEjbLocalRef(_index);
			if (element != null) {
				((EjbLocalRef)element).validate();
			}
		}
		// Validating property serviceRef
		for (int _index = 0; _index < sizeServiceRef(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2.ServiceRef element = (org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2.ServiceRef) getServiceRef(_index);
			if (element != null) {
				((ServiceRef)element).validate();
			}
		}
		// Validating property resourceRef
		for (int _index = 0; _index < sizeResourceRef(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2.ResourceRef element = (org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2.ResourceRef) getResourceRef(_index);
			if (element != null) {
				((ResourceRef)element).validate();
			}
		}
		// Validating property resourceEnvRef
		for (int _index = 0; _index < sizeResourceEnvRef(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2.ResourceEnvRef element = (org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2.ResourceEnvRef) getResourceEnvRef(_index);
			if (element != null) {
				((ResourceEnvRef)element).validate();
			}
		}
		// Validating property messageDestinationRef
		for (int _index = 0; _index < sizeMessageDestinationRef(); 
			++_index) {
			org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2.MessageDestinationRef element = (org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2.MessageDestinationRef) getMessageDestinationRef(_index);
			if (element != null) {
				((MessageDestinationRef)element).validate();
			}
		}
		// Validating property persistenceContextRef
		for (int _index = 0; _index < sizePersistenceContextRef(); 
			++_index) {
			org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2.PersistenceContextRef element = (org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2.PersistenceContextRef) getPersistenceContextRef(_index);
			if (element != null) {
				((PersistenceContextRef)element).validate();
			}
		}
		// Validating property persistenceUnitRef
		for (int _index = 0; _index < sizePersistenceUnitRef(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2.PersistenceUnitRef element = (org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2.PersistenceUnitRef) getPersistenceUnitRef(_index);
			if (element != null) {
				((PersistenceUnitRef)element).validate();
			}
		}
		// Validating property postConstruct
		for (int _index = 0; _index < sizePostConstruct(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2.LifecycleCallback element = (org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2.LifecycleCallback) getPostConstruct(_index);
			if (element != null) {
				((LifecycleCallback)element).validate();
			}
		}
		// Validating property preDestroy
		for (int _index = 0; _index < sizePreDestroy(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2.LifecycleCallback element = (org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2.LifecycleCallback) getPreDestroy(_index);
			if (element != null) {
				((LifecycleCallback)element).validate();
			}
		}
		// Validating property dataSource
		for (int _index = 0; _index < sizeDataSource(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2.DataSourceType element = getDataSource(_index);
			if (element != null) {
				element.validate();
			}
		}
		// Validating property jmsConnectionFactory
		for (int _index = 0; _index < sizeJmsConnectionFactory(); 
			++_index) {
			org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2.JmsConnectionFactoryType element = getJmsConnectionFactory(_index);
			if (element != null) {
				element.validate();
			}
		}
		// Validating property jmsDestination
		for (int _index = 0; _index < sizeJmsDestination(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2.JmsDestinationType element = getJmsDestination(_index);
			if (element != null) {
				element.validate();
			}
		}
		// Validating property mailSession
		for (int _index = 0; _index < sizeMailSession(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2.MailSessionType element = getMailSession(_index);
			if (element != null) {
				element.validate();
			}
		}
		// Validating property connectionFactory
		for (int _index = 0; _index < sizeConnectionFactory(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2.ConnectionFactoryResourceType element = getConnectionFactory(_index);
			if (element != null) {
				element.validate();
			}
		}
		// Validating property administeredObject
		for (int _index = 0; _index < sizeAdministeredObject(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2.AdministeredObjectType element = getAdministeredObject(_index);
			if (element != null) {
				element.validate();
			}
		}
		// Validating property postActivate
		for (int _index = 0; _index < sizePostActivate(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2.LifecycleCallback element = (org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2.LifecycleCallback) getPostActivate(_index);
			if (element != null) {
				((LifecycleCallback)element).validate();
			}
		}
		// Validating property prePassivate
		for (int _index = 0; _index < sizePrePassivate(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2.LifecycleCallback element = (org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2.LifecycleCallback) getPrePassivate(_index);
			if (element != null) {
				((LifecycleCallback)element).validate();
			}
		}
		// Validating property securityRoleRef
		for (int _index = 0; _index < sizeSecurityRoleRef(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2.SecurityRoleRef element = (org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2.SecurityRoleRef) getSecurityRoleRef(_index);
			if (element != null) {
				((SecurityRoleRef)element).validate();
			}
		}
		// Validating property securityIdentity
		if (getSecurityIdentity() != null) {
			((SecurityIdentity)getSecurityIdentity()).validate();
		}
		// Validating property passivationCapable
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
		str.append("BusinessLocal["+this.sizeBusinessLocal()+"]");	// NOI18N
		for(int i=0; i<this.sizeBusinessLocal(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			str.append(indent+"\t");	// NOI18N
			str.append("<");	// NOI18N
			o = this.getBusinessLocal(i);
			str.append((o==null?"null":o.toString().trim()));	// NOI18N
			str.append(">\n");	// NOI18N
			this.dumpAttributes(BUSINESS_LOCAL, i, str, indent);
		}

		str.append(indent);
		str.append("BusinessRemote["+this.sizeBusinessRemote()+"]");	// NOI18N
		for(int i=0; i<this.sizeBusinessRemote(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			str.append(indent+"\t");	// NOI18N
			str.append("<");	// NOI18N
			o = this.getBusinessRemote(i);
			str.append((o==null?"null":o.toString().trim()));	// NOI18N
			str.append(">\n");	// NOI18N
			this.dumpAttributes(BUSINESS_REMOTE, i, str, indent);
		}

		str.append(indent);
		str.append("LocalBean");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append((this.isLocalBean()?"true":"false"));
		this.dumpAttributes(LOCAL_BEAN, 0, str, indent);

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
		str.append("StatefulTimeout");	// NOI18N
		n = (org.netbeans.modules.schema2beans.BaseBean) this.getStatefulTimeout();
		if (n != null)
			n.dump(str, indent + "\t");	// NOI18N
		else
			str.append(indent+"\tnull");	// NOI18N
		this.dumpAttributes(STATEFUL_TIMEOUT, 0, str, indent);

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
		str.append("InitOnStartup");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append((this.isInitOnStartup()?"true":"false"));
		this.dumpAttributes(INIT_ON_STARTUP, 0, str, indent);

		str.append(indent);
		str.append("ConcurrencyManagementType");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getConcurrencyManagementType();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(CONCURRENCY_MANAGEMENT_TYPE, 0, str, indent);

		str.append(indent);
		str.append("ConcurrentMethod["+this.sizeConcurrentMethod()+"]");	// NOI18N
		for(int i=0; i<this.sizeConcurrentMethod(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getConcurrentMethod(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(CONCURRENT_METHOD, i, str, indent);
		}

		str.append(indent);
		str.append("DependsOn");	// NOI18N
		n = (org.netbeans.modules.schema2beans.BaseBean) this.getDependsOn();
		if (n != null)
			n.dump(str, indent + "\t");	// NOI18N
		else
			str.append(indent+"\tnull");	// NOI18N
		this.dumpAttributes(DEPENDS_ON, 0, str, indent);

		str.append(indent);
		str.append("InitMethod["+this.sizeInitMethod()+"]");	// NOI18N
		for(int i=0; i<this.sizeInitMethod(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getInitMethod(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(INIT_METHOD, i, str, indent);
		}

		str.append(indent);
		str.append("RemoveMethod["+this.sizeRemoveMethod()+"]");	// NOI18N
		for(int i=0; i<this.sizeRemoveMethod(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getRemoveMethod(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(REMOVE_METHOD, i, str, indent);
		}

		str.append(indent);
		str.append("AsyncMethod["+this.sizeAsyncMethod()+"]");	// NOI18N
		for(int i=0; i<this.sizeAsyncMethod(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getAsyncMethod(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(ASYNC_METHOD, i, str, indent);
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
		str.append("AfterBeginMethod");	// NOI18N
		n = (org.netbeans.modules.schema2beans.BaseBean) this.getAfterBeginMethod();
		if (n != null)
			n.dump(str, indent + "\t");	// NOI18N
		else
			str.append(indent+"\tnull");	// NOI18N
		this.dumpAttributes(AFTER_BEGIN_METHOD, 0, str, indent);

		str.append(indent);
		str.append("BeforeCompletionMethod");	// NOI18N
		n = (org.netbeans.modules.schema2beans.BaseBean) this.getBeforeCompletionMethod();
		if (n != null)
			n.dump(str, indent + "\t");	// NOI18N
		else
			str.append(indent+"\tnull");	// NOI18N
		this.dumpAttributes(BEFORE_COMPLETION_METHOD, 0, str, indent);

		str.append(indent);
		str.append("AfterCompletionMethod");	// NOI18N
		n = (org.netbeans.modules.schema2beans.BaseBean) this.getAfterCompletionMethod();
		if (n != null)
			n.dump(str, indent + "\t");	// NOI18N
		else
			str.append(indent+"\tnull");	// NOI18N
		this.dumpAttributes(AFTER_COMPLETION_METHOD, 0, str, indent);

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
		str.append("JmsConnectionFactory["+this.sizeJmsConnectionFactory()+"]");	// NOI18N
		for(int i=0; i<this.sizeJmsConnectionFactory(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getJmsConnectionFactory(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(JMS_CONNECTION_FACTORY, i, str, indent);
		}

		str.append(indent);
		str.append("JmsDestination["+this.sizeJmsDestination()+"]");	// NOI18N
		for(int i=0; i<this.sizeJmsDestination(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getJmsDestination(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(JMS_DESTINATION, i, str, indent);
		}

		str.append(indent);
		str.append("MailSession["+this.sizeMailSession()+"]");	// NOI18N
		for(int i=0; i<this.sizeMailSession(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getMailSession(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(MAIL_SESSION, i, str, indent);
		}

		str.append(indent);
		str.append("ConnectionFactory["+this.sizeConnectionFactory()+"]");	// NOI18N
		for(int i=0; i<this.sizeConnectionFactory(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getConnectionFactory(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(CONNECTION_FACTORY, i, str, indent);
		}

		str.append(indent);
		str.append("AdministeredObject["+this.sizeAdministeredObject()+"]");	// NOI18N
		for(int i=0; i<this.sizeAdministeredObject(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getAdministeredObject(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(ADMINISTERED_OBJECT, i, str, indent);
		}

		str.append(indent);
		str.append("PostActivate["+this.sizePostActivate()+"]");	// NOI18N
		for(int i=0; i<this.sizePostActivate(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getPostActivate(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(POST_ACTIVATE, i, str, indent);
		}

		str.append(indent);
		str.append("PrePassivate["+this.sizePrePassivate()+"]");	// NOI18N
		for(int i=0; i<this.sizePrePassivate(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getPrePassivate(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(PRE_PASSIVATE, i, str, indent);
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

		str.append(indent);
		str.append("PassivationCapable");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append((this.isPassivationCapable()?"true":"false"));
		this.dumpAttributes(PASSIVATION_CAPABLE, 0, str, indent);

	}
	public String dumpBeanNode(){
		StringBuffer str = new StringBuffer();
		str.append("SessionBean\n");	// NOI18N
		this.dump(str, "\n  ");	// NOI18N
		return str.toString();
	}}

// END_NOI18N

