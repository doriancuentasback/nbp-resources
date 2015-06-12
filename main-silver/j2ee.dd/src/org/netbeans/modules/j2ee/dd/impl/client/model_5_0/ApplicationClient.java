/**
 *	This generated bean class ApplicationClient matches the schema element 'application-client'.
 *
 *	===============================================================
 *	
 *	
 *		This group keeps the usage of the contained description related
 *		elements consistent across Java EE deployment descriptors.
 *	
 *		All elements may occur multiple times with different languages,
 *		to support localization of the content.
 *	
 *	      
 *	===============================================================
 *
 *	This class matches the root element of the XML Schema,
 *	and is the root of the following bean graph:
 *
 *	applicationClient <application-client> : ApplicationClient
 *		[attr: version CDATA #FIXED 5 : java.math.BigDecimal] 	[whiteSpace (collapse)]
 *		[attr: metadata-complete CDATA #IMPLIED  : boolean]
 *		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *		description <description> : java.lang.String[0,n]
 *			[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *			[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		displayName <display-name> : java.lang.String[0,n] 	[whiteSpace (collapse)]
 *			[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *			[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *		icon <icon> : Icon[0,n]
 *			[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *			[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *			smallIcon <small-icon> : java.lang.String[0,1]
 *			largeIcon <large-icon> : java.lang.String[0,1]
 *		envEntry <env-entry> : EnvEntry[0,n]
 *			[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *			description <description> : java.lang.String[0,n]
 *				[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *				[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *			envEntryName <env-entry-name> : java.lang.String
 *			envEntryType <env-entry-type> : java.lang.String[0,1] 	[enumeration (java.lang.Boolean), enumeration (java.lang.Byte), enumeration (java.lang.Character), enumeration (java.lang.String), enumeration (java.lang.Short), enumeration (java.lang.Integer), enumeration (java.lang.Long), enumeration (java.lang.Float), enumeration (java.lang.Double)]
 *			envEntryValue <env-entry-value> : java.lang.String[0,1]
 *				[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *			mappedName <mapped-name> : java.lang.String[0,1]
 *				[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *			injectionTarget <injection-target> : InjectionTarget[0,n]
 *				injectionTargetClass <injection-target-class> : java.lang.String
 *				injectionTargetName <injection-target-name> : java.lang.String 	[pattern (($|_|\p{L})(\p{L}|\p{Nd}|_|$)*)]
 *		ejbRef <ejb-ref> : EjbRef[0,n]
 *			[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *			description <description> : java.lang.String[0,n]
 *				[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *				[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *			ejbRefName <ejb-ref-name> : java.lang.String
 *			ejbRefType <ejb-ref-type> : java.lang.String[0,1] 	[enumeration (Entity), enumeration (Session)]
 *			home <home> : java.lang.String[0,1]
 *			remote <remote> : java.lang.String[0,1]
 *			ejbLink <ejb-link> : java.lang.String[0,1]
 *			mappedName <mapped-name> : java.lang.String[0,1]
 *				[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *			injectionTarget <injection-target> : InjectionTarget[0,n]
 *				injectionTargetClass <injection-target-class> : java.lang.String
 *				injectionTargetName <injection-target-name> : java.lang.String 	[pattern (($|_|\p{L})(\p{L}|\p{Nd}|_|$)*)]
 *		serviceRef <service-ref> : ServiceRef[0,n] 	[key name='service-ref_handler-name-key']
 *			[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *			description <description> : java.lang.String[0,n]
 *				[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *				[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *			displayName <display-name> : java.lang.String[0,n] 	[whiteSpace (collapse)]
 *				[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *				[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *			icon <icon> : Icon[0,n]
 *				[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *				[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *				smallIcon <small-icon> : java.lang.String[0,1]
 *				largeIcon <large-icon> : java.lang.String[0,1]
 *			serviceRefName <service-ref-name> : java.lang.String
 *			serviceInterface <service-interface> : java.lang.String
 *			serviceRefType <service-ref-type> : java.lang.String[0,1]
 *			wsdlFile <wsdl-file> : java.net.URI[0,1]
 *				[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *			jaxrpcMappingFile <jaxrpc-mapping-file> : java.lang.String[0,1]
 *			serviceQname <service-qname> : java.lang.String[0,1]
 *				[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *			portComponentRef <port-component-ref> : PortComponentRef[0,n]
 *				[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *				serviceEndpointInterface <service-endpoint-interface> : java.lang.String
 *				enableMtom <enable-mtom> : boolean[0,1] 	[pattern ((true|false))]
 *				portComponentLink <port-component-link> : java.lang.String[0,1] 	[whiteSpace (collapse)]
 *					[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *			| handler <handler> : ServiceRefHandler[0,n]
 *			| 	[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *			| 	description <description> : java.lang.String[0,n]
 *			| 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *			| 		[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *			| 	displayName <display-name> : java.lang.String[0,n] 	[whiteSpace (collapse)]
 *			| 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *			| 		[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *			| 	icon <icon> : Icon[0,n]
 *			| 		[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *			| 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *			| 		smallIcon <small-icon> : java.lang.String[0,1]
 *			| 		largeIcon <large-icon> : java.lang.String[0,1]
 *			| 	handlerName <handler-name> : java.lang.String 	[whiteSpace (collapse)]
 *			| 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *			| 	handlerClass <handler-class> : java.lang.String
 *			| 	initParam <init-param> : InitParam[0,n]
 *			| 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *			| 		description <description> : java.lang.String[0,n]
 *			| 			[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *			| 			[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *			| 		paramName <param-name> : java.lang.String 	[whiteSpace (collapse)]
 *			| 			[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *			| 		paramValue <param-value> : java.lang.String
 *			| 			[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *			| 	soapHeader <soap-header> : java.lang.String[0,n]
 *			| 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *			| 	soapRole <soap-role> : java.lang.String[0,n] 	[whiteSpace (collapse)]
 *			| 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *			| 	portName <port-name> : java.lang.String[0,n] 	[whiteSpace (collapse)]
 *			| 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *			| handlerChains <handler-chains> : ServiceRefHandlerChains[0,1]
 *			| 	[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *			| 	handlerChain <handler-chain> : ServiceRefHandlerChainType[0,n]
 *			| 		[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *			| 		(
 *			| 		  | serviceNamePattern <service-name-pattern> : java.lang.String 	[pattern (\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?)]
 *			| 		  | portNamePattern <port-name-pattern> : java.lang.String 	[pattern (\*|([\i-[:]][\c-[:]]*:)?[\i-[:]][\c-[:]]*\*?)]
 *			| 		  | protocolBindings <protocol-bindings> : String
 *			| 		)[0,1]
 *			| 		handler <handler> : ServiceRefHandler[1,n]
 *			| 			[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *			| 			description <description> : java.lang.String[0,n]
 *			| 				[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *			| 				[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *			| 			displayName <display-name> : java.lang.String[0,n] 	[whiteSpace (collapse)]
 *			| 				[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *			| 				[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *			| 			icon <icon> : Icon[0,n]
 *			| 				[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *			| 				[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *			| 				smallIcon <small-icon> : java.lang.String[0,1]
 *			| 				largeIcon <large-icon> : java.lang.String[0,1]
 *			| 			handlerName <handler-name> : java.lang.String 	[whiteSpace (collapse)]
 *			| 				[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *			| 			handlerClass <handler-class> : java.lang.String
 *			| 			initParam <init-param> : InitParam[0,n]
 *			| 				[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *			| 				description <description> : java.lang.String[0,n]
 *			| 					[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *			| 					[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *			| 				paramName <param-name> : java.lang.String 	[whiteSpace (collapse)]
 *			| 					[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *			| 				paramValue <param-value> : java.lang.String
 *			| 					[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *			| 			soapHeader <soap-header> : java.lang.String[0,n]
 *			| 				[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *			| 			soapRole <soap-role> : java.lang.String[0,n] 	[whiteSpace (collapse)]
 *			| 				[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *			| 			portName <port-name> : java.lang.String[0,n] 	[whiteSpace (collapse)]
 *			| 				[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *			mappedName <mapped-name> : java.lang.String[0,1]
 *				[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *			injectionTarget <injection-target> : InjectionTarget[0,n]
 *				injectionTargetClass <injection-target-class> : java.lang.String
 *				injectionTargetName <injection-target-name> : java.lang.String 	[pattern (($|_|\p{L})(\p{L}|\p{Nd}|_|$)*)]
 *		resourceRef <resource-ref> : ResourceRef[0,n]
 *			[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *			description <description> : java.lang.String[0,n]
 *				[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *				[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *			resRefName <res-ref-name> : java.lang.String
 *			resType <res-type> : java.lang.String[0,1]
 *			resAuth <res-auth> : java.lang.String[0,1] 	[enumeration (Application), enumeration (Container)]
 *			resSharingScope <res-sharing-scope> : java.lang.String[0,1] 	[enumeration (Shareable), enumeration (Unshareable)]
 *			mappedName <mapped-name> : java.lang.String[0,1]
 *				[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *			injectionTarget <injection-target> : InjectionTarget[0,n]
 *				injectionTargetClass <injection-target-class> : java.lang.String
 *				injectionTargetName <injection-target-name> : java.lang.String 	[pattern (($|_|\p{L})(\p{L}|\p{Nd}|_|$)*)]
 *		resourceEnvRef <resource-env-ref> : ResourceEnvRef[0,n]
 *			[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *			description <description> : java.lang.String[0,n]
 *				[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *				[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *			resourceEnvRefName <resource-env-ref-name> : java.lang.String
 *			resourceEnvRefType <resource-env-ref-type> : java.lang.String[0,1]
 *			mappedName <mapped-name> : java.lang.String[0,1]
 *				[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *			injectionTarget <injection-target> : InjectionTarget[0,n]
 *				injectionTargetClass <injection-target-class> : java.lang.String
 *				injectionTargetName <injection-target-name> : java.lang.String 	[pattern (($|_|\p{L})(\p{L}|\p{Nd}|_|$)*)]
 *		messageDestinationRef <message-destination-ref> : MessageDestinationRef[0,n]
 *			[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *			description <description> : java.lang.String[0,n]
 *				[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *				[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *			messageDestinationRefName <message-destination-ref-name> : java.lang.String
 *			messageDestinationType <message-destination-type> : java.lang.String[0,1]
 *			messageDestinationUsage <message-destination-usage> : java.lang.String[0,1] 	[enumeration (Consumes), enumeration (Produces), enumeration (ConsumesProduces)]
 *			messageDestinationLink <message-destination-link> : java.lang.String[0,1]
 *			mappedName <mapped-name> : java.lang.String[0,1]
 *				[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *			injectionTarget <injection-target> : InjectionTarget[0,n]
 *				injectionTargetClass <injection-target-class> : java.lang.String
 *				injectionTargetName <injection-target-name> : java.lang.String 	[pattern (($|_|\p{L})(\p{L}|\p{Nd}|_|$)*)]
 *		persistenceUnitRef <persistence-unit-ref> : PersistenceUnitRefType[0,n]
 *			[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *			description <description> : java.lang.String[0,n]
 *				[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *				[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *			persistenceUnitRefName <persistence-unit-ref-name> : java.lang.String
 *			persistenceUnitName <persistence-unit-name> : java.lang.String[0,1] 	[whiteSpace (collapse)]
 *				[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *			mappedName <mapped-name> : java.lang.String[0,1]
 *				[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *			injectionTarget <injection-target> : InjectionTarget[0,n]
 *				injectionTargetClass <injection-target-class> : java.lang.String
 *				injectionTargetName <injection-target-name> : java.lang.String 	[pattern (($|_|\p{L})(\p{L}|\p{Nd}|_|$)*)]
 *		postConstruct <post-construct> : LifecycleCallbackType[0,n]
 *			lifecycleCallbackClass <lifecycle-callback-class> : java.lang.String[0,1]
 *			lifecycleCallbackMethod <lifecycle-callback-method> : java.lang.String 	[pattern (($|_|\p{L})(\p{L}|\p{Nd}|_|$)*)]
 *		preDestroy <pre-destroy> : LifecycleCallbackType[0,n]
 *			lifecycleCallbackClass <lifecycle-callback-class> : java.lang.String[0,1]
 *			lifecycleCallbackMethod <lifecycle-callback-method> : java.lang.String 	[pattern (($|_|\p{L})(\p{L}|\p{Nd}|_|$)*)]
 *		callbackHandler <callback-handler> : java.lang.String[0,1]
 *		messageDestination <message-destination> : MessageDestination[0,n]
 *			[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *			description <description> : java.lang.String[0,n]
 *				[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *				[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *			displayName <display-name> : java.lang.String[0,n] 	[whiteSpace (collapse)]
 *				[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *				[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *			icon <icon> : Icon[0,n]
 *				[attr: xml:lang CDATA #IMPLIED  : java.lang.String]
 *				[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *				smallIcon <small-icon> : java.lang.String[0,1]
 *				largeIcon <large-icon> : java.lang.String[0,1]
 *			messageDestinationName <message-destination-name> : java.lang.String 	[whiteSpace (collapse)]
 *				[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *			mappedName <mapped-name> : java.lang.String[0,1]
 *				[attr: id CDATA #IMPLIED  : java.lang.String] 	[whiteSpace (collapse)]
 *
 * @Generated
 */

package org.netbeans.modules.j2ee.dd.impl.client.model_5_0;

import org.w3c.dom.*;
import org.netbeans.modules.schema2beans.*;
import java.beans.*;
import java.util.*;
import java.io.*;

// BEGIN_NOI18N

public class ApplicationClient extends org.netbeans.modules.j2ee.dd.impl.common.ComponentBeanMultiple
	 implements org.netbeans.modules.j2ee.dd.api.client.AppClient
{

	static Vector comparators = new Vector();
	private static final org.netbeans.modules.schema2beans.Version runtimeVersion = new org.netbeans.modules.schema2beans.Version(5, 0, 0);
	private static final String SERIALIZATION_HELPER_CHARSET = "UTF-8";	// NOI18N

	static public final String VERSION = "Version";	// NOI18N
	static public final String METADATACOMPLETE = "MetadataComplete";	// NOI18N
	static public final String ID = "Id";	// NOI18N
	static public final String DESCRIPTION = "Description";	// NOI18N
	static public final String DESCRIPTIONID = "DescriptionId";	// NOI18N
	static public final String DESCRIPTIONXMLLANG = "DescriptionXmlLang";	// NOI18N
	static public final String DISPLAY_NAME = "DisplayName";	// NOI18N
	static public final String DISPLAYNAMEID = "DisplayNameId";	// NOI18N
	static public final String DISPLAYNAMEXMLLANG = "DisplayNameXmlLang";	// NOI18N
	static public final String ICON = "Icon";	// NOI18N
	static public final String ENV_ENTRY = "EnvEntry";	// NOI18N
	static public final String EJB_REF = "EjbRef";	// NOI18N
	static public final String SERVICE_REF = "ServiceRef";	// NOI18N
	static public final String RESOURCE_REF = "ResourceRef";	// NOI18N
	static public final String RESOURCE_ENV_REF = "ResourceEnvRef";	// NOI18N
	static public final String MESSAGE_DESTINATION_REF = "MessageDestinationRef";	// NOI18N
	static public final String PERSISTENCE_UNIT_REF = "PersistenceUnitRef";	// NOI18N
	static public final String POST_CONSTRUCT = "PostConstruct";	// NOI18N
	static public final String PRE_DESTROY = "PreDestroy";	// NOI18N
	static public final String CALLBACK_HANDLER = "CallbackHandler";	// NOI18N
	static public final String MESSAGE_DESTINATION = "MessageDestination";	// NOI18N

	public ApplicationClient() {
		this(null, Common.USE_DEFAULT_VALUES);
	}

	public ApplicationClient(org.w3c.dom.Node doc, int options) {
		this(Common.NO_DEFAULT_VALUES);
		try {
			initFromNode(doc, options);
		}
		catch (Schema2BeansException e) {
			throw new RuntimeException(e);
		}
	}
	protected void initFromNode(org.w3c.dom.Node doc, int options) throws Schema2BeansException
	{
		if (doc == null)
		{
			doc = GraphManager.createRootElementNode("application-client");	// NOI18N
			if (doc == null)
				throw new Schema2BeansException(Common.getMessage(
					"CantCreateDOMRoot_msg", "application-client"));
		}
		Node n = GraphManager.getElementNode("application-client", doc);	// NOI18N
		if (n == null)
			throw new Schema2BeansException(Common.getMessage(
				"DocRootNotInDOMGraph_msg", "application-client", doc.getFirstChild().getNodeName()));

		this.graphManager.setXmlDocument(doc);

		// Entry point of the createBeans() recursive calls
		this.createBean(n, this.graphManager());
		this.initialize(options);
	}
	public ApplicationClient(int options)
	{
		super(comparators, runtimeVersion);
		initOptions(options);
	}
	protected void initOptions(int options)
	{
		// The graph manager is allocated in the bean root
		this.graphManager = new GraphManager(this);
		this.createRoot("application-client", "ApplicationClient",	// NOI18N
			Common.TYPE_1 | Common.TYPE_BEAN, ApplicationClient.class);

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
		this.createProperty("persistence-unit-ref", 	// NOI18N
			PERSISTENCE_UNIT_REF, 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			PersistenceUnitRefType.class);
		this.createAttribute(PERSISTENCE_UNIT_REF, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("post-construct", 	// NOI18N
			POST_CONSTRUCT, 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			LifecycleCallbackType.class);
		this.createProperty("pre-destroy", 	// NOI18N
			PRE_DESTROY, 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			LifecycleCallbackType.class);
		this.createProperty("callback-handler", 	// NOI18N
			CALLBACK_HANDLER, 
			Common.TYPE_0_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createProperty("message-destination", 	// NOI18N
			MESSAGE_DESTINATION, 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			MessageDestination.class);
		this.createAttribute(MESSAGE_DESTINATION, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createAttribute("version", "Version", 
						AttrProp.CDATA | AttrProp.FIXED,
						null, "5");
		this.createAttribute("metadata-complete", "MetadataComplete", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createAttribute("id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.initialize(options);
	}

	// Setting the default values of the properties
	void initialize(int options) {
		setDefaultNamespace("http://java.sun.com/xml/ns/javaee");
		if ((options & Common.USE_DEFAULT_VALUES) == Common.USE_DEFAULT_VALUES) {
			setVersion(new java.math.BigDecimal("5"));
		}

	}

	// This attribute is mandatory
	public void setVersion(java.math.BigDecimal value) {
		setAttributeValue(VERSION, value.toString());
	}

	//
	public java.math.BigDecimal getVersion() {
		return new java.math.BigDecimal(getAttributeValue(VERSION));
	}

	// This attribute is optional
	public void setMetadataComplete(boolean value) {
		setAttributeValue(METADATACOMPLETE, ""+value);
	}

	//
	public boolean isMetadataComplete() {
		return (getAttributeValue(METADATACOMPLETE) == null) ? false : ("true".equalsIgnoreCase(getAttributeValue(METADATACOMPLETE)) || "1".equals(getAttributeValue(METADATACOMPLETE)));
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

	// This attribute is an array, possibly empty
	public void setEnvEntry(int index,  
                org.netbeans.modules.j2ee.dd.api.common.EnvEntry valueInterface) {
		EnvEntry value = (EnvEntry) valueInterface;
		this.setValue(ENV_ENTRY, index, value);
	}

	//
	public  
                org.netbeans.modules.j2ee.dd.api.common.EnvEntry getEnvEntry(int index) {
		return (EnvEntry)this.getValue(ENV_ENTRY, index);
	}

	// Return the number of properties
	public int sizeEnvEntry() {
		return this.size(ENV_ENTRY);
	}

	// This attribute is an array, possibly empty
	public void setEnvEntry( 
                org.netbeans.modules.j2ee.dd.api.common.EnvEntry[] value) {
		this.setValue(ENV_ENTRY, value);
	}

	//
	public  
                org.netbeans.modules.j2ee.dd.api.common.EnvEntry[] getEnvEntry() {
		return (EnvEntry[])this.getValues(ENV_ENTRY);
	}

	// Add a new element returning its index in the list
	public int addEnvEntry( 
                org.netbeans.modules.j2ee.dd.api.common.EnvEntry valueInterface) {
		EnvEntry value = (EnvEntry) valueInterface;
		int positionOfNewItem = this.addValue(ENV_ENTRY, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeEnvEntry( 
                org.netbeans.modules.j2ee.dd.api.common.EnvEntry valueInterface) {
		EnvEntry value = (EnvEntry) valueInterface;
		return this.removeValue(ENV_ENTRY, value);
	}

	// This attribute is an array, possibly empty
	public void setEjbRef(int index,  
                org.netbeans.modules.j2ee.dd.api.common.EjbRef valueInterface) {
		EjbRef value = (EjbRef) valueInterface;
		this.setValue(EJB_REF, index, value);
	}

	//
	public  
                org.netbeans.modules.j2ee.dd.api.common.EjbRef getEjbRef(int index) {
		return (EjbRef)this.getValue(EJB_REF, index);
	}

	// Return the number of properties
	public int sizeEjbRef() {
		return this.size(EJB_REF);
	}

	// This attribute is an array, possibly empty
	public void setEjbRef( 
                org.netbeans.modules.j2ee.dd.api.common.EjbRef[] value) {
		this.setValue(EJB_REF, value);
	}

	//
	public  
                org.netbeans.modules.j2ee.dd.api.common.EjbRef[] getEjbRef() {
		return (EjbRef[])this.getValues(EJB_REF);
	}

	// Add a new element returning its index in the list
	public int addEjbRef( 
                org.netbeans.modules.j2ee.dd.api.common.EjbRef valueInterface) {
		EjbRef value = (EjbRef) valueInterface;
		int positionOfNewItem = this.addValue(EJB_REF, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeEjbRef( 
                org.netbeans.modules.j2ee.dd.api.common.EjbRef valueInterface) {
		EjbRef value = (EjbRef) valueInterface;
		return this.removeValue(EJB_REF, value);
	}

	// This attribute is an array, possibly empty
	public void setServiceRef(int index,  
                org.netbeans.modules.j2ee.dd.api.common.ServiceRef valueInterface) {
		ServiceRef value = (ServiceRef) valueInterface;
		this.setValue(SERVICE_REF, index, value);
	}

	//
	public  
                org.netbeans.modules.j2ee.dd.api.common.ServiceRef getServiceRef(int index) {
		return (ServiceRef)this.getValue(SERVICE_REF, index);
	}

	// Return the number of properties
	public int sizeServiceRef() {
		return this.size(SERVICE_REF);
	}

	// This attribute is an array, possibly empty
	public void setServiceRef( 
                org.netbeans.modules.j2ee.dd.api.common.ServiceRef[] value) {
		this.setValue(SERVICE_REF, value);
	}

	//
	public  
                org.netbeans.modules.j2ee.dd.api.common.ServiceRef[] getServiceRef() {
		return (ServiceRef[])this.getValues(SERVICE_REF);
	}

	// Add a new element returning its index in the list
	public int addServiceRef( 
                org.netbeans.modules.j2ee.dd.api.common.ServiceRef valueInterface) {
		ServiceRef value = (ServiceRef) valueInterface;
		int positionOfNewItem = this.addValue(SERVICE_REF, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeServiceRef( 
                org.netbeans.modules.j2ee.dd.api.common.ServiceRef valueInterface) {
		ServiceRef value = (ServiceRef) valueInterface;
		return this.removeValue(SERVICE_REF, value);
	}

	// This attribute is an array, possibly empty
	public void setResourceRef(int index,  
                org.netbeans.modules.j2ee.dd.api.common.ResourceRef valueInterface) {
		ResourceRef value = (ResourceRef) valueInterface;
		this.setValue(RESOURCE_REF, index, value);
	}

	//
	public  
                org.netbeans.modules.j2ee.dd.api.common.ResourceRef getResourceRef(int index) {
		return (ResourceRef)this.getValue(RESOURCE_REF, index);
	}

	// Return the number of properties
	public int sizeResourceRef() {
		return this.size(RESOURCE_REF);
	}

	// This attribute is an array, possibly empty
	public void setResourceRef( 
                org.netbeans.modules.j2ee.dd.api.common.ResourceRef[] value) {
		this.setValue(RESOURCE_REF, value);
	}

	//
	public  
                org.netbeans.modules.j2ee.dd.api.common.ResourceRef[] getResourceRef() {
		return (ResourceRef[])this.getValues(RESOURCE_REF);
	}

	// Add a new element returning its index in the list
	public int addResourceRef( 
                org.netbeans.modules.j2ee.dd.api.common.ResourceRef valueInterface) {
		ResourceRef value = (ResourceRef) valueInterface;
		int positionOfNewItem = this.addValue(RESOURCE_REF, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeResourceRef( 
                org.netbeans.modules.j2ee.dd.api.common.ResourceRef valueInterface) {
		ResourceRef value = (ResourceRef) valueInterface;
		return this.removeValue(RESOURCE_REF, value);
	}

	// This attribute is an array, possibly empty
	public void setResourceEnvRef(int index,  
                org.netbeans.modules.j2ee.dd.api.common.ResourceEnvRef valueInterface) {
		ResourceEnvRef value = (ResourceEnvRef) valueInterface;
		this.setValue(RESOURCE_ENV_REF, index, value);
	}

	//
	public  
                org.netbeans.modules.j2ee.dd.api.common.ResourceEnvRef getResourceEnvRef(int index) {
		return (ResourceEnvRef)this.getValue(RESOURCE_ENV_REF, index);
	}

	// Return the number of properties
	public int sizeResourceEnvRef() {
		return this.size(RESOURCE_ENV_REF);
	}

	// This attribute is an array, possibly empty
	public void setResourceEnvRef( 
                org.netbeans.modules.j2ee.dd.api.common.ResourceEnvRef[] value) {
		this.setValue(RESOURCE_ENV_REF, value);
	}

	//
	public  
                org.netbeans.modules.j2ee.dd.api.common.ResourceEnvRef[] getResourceEnvRef() {
		return (ResourceEnvRef[])this.getValues(RESOURCE_ENV_REF);
	}

	// Add a new element returning its index in the list
	public int addResourceEnvRef( 
                org.netbeans.modules.j2ee.dd.api.common.ResourceEnvRef valueInterface) {
		ResourceEnvRef value = (ResourceEnvRef) valueInterface;
		int positionOfNewItem = this.addValue(RESOURCE_ENV_REF, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeResourceEnvRef( 
                org.netbeans.modules.j2ee.dd.api.common.ResourceEnvRef valueInterface) {
		ResourceEnvRef value = (ResourceEnvRef) valueInterface;
		return this.removeValue(RESOURCE_ENV_REF, value);
	}

	// This attribute is an array, possibly empty
	public void setMessageDestinationRef(int index,  
                org.netbeans.modules.j2ee.dd.api.common.MessageDestinationRef valueInterface) {
		MessageDestinationRef value = (MessageDestinationRef) valueInterface;
		this.setValue(MESSAGE_DESTINATION_REF, index, value);
	}

	//
	public  
                org.netbeans.modules.j2ee.dd.api.common.MessageDestinationRef getMessageDestinationRef(int index) {
		return (MessageDestinationRef)this.getValue(MESSAGE_DESTINATION_REF, index);
	}

	// Return the number of properties
	public int sizeMessageDestinationRef() {
		return this.size(MESSAGE_DESTINATION_REF);
	}

	// This attribute is an array, possibly empty
	public void setMessageDestinationRef( 
                org.netbeans.modules.j2ee.dd.api.common.MessageDestinationRef[] value) {
		this.setValue(MESSAGE_DESTINATION_REF, value);
	}

	//
	public  
                org.netbeans.modules.j2ee.dd.api.common.MessageDestinationRef[] getMessageDestinationRef() {
		return (MessageDestinationRef[])this.getValues(MESSAGE_DESTINATION_REF);
	}

	// Add a new element returning its index in the list
	public int addMessageDestinationRef( 
                org.netbeans.modules.j2ee.dd.api.common.MessageDestinationRef valueInterface) {
		MessageDestinationRef value = (MessageDestinationRef) valueInterface;
		int positionOfNewItem = this.addValue(MESSAGE_DESTINATION_REF, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeMessageDestinationRef( 
                org.netbeans.modules.j2ee.dd.api.common.MessageDestinationRef valueInterface) {
		MessageDestinationRef value = (MessageDestinationRef) valueInterface;
		return this.removeValue(MESSAGE_DESTINATION_REF, value);
	}

	// This attribute is an array, possibly empty
	public void setPersistenceUnitRef(int index, PersistenceUnitRefType value) {
		this.setValue(PERSISTENCE_UNIT_REF, index, value);
	}

	//
	public PersistenceUnitRefType getPersistenceUnitRef(int index) {
		return (PersistenceUnitRefType)this.getValue(PERSISTENCE_UNIT_REF, index);
	}

	// Return the number of properties
	public int sizePersistenceUnitRef() {
		return this.size(PERSISTENCE_UNIT_REF);
	}

	// This attribute is an array, possibly empty
	public void setPersistenceUnitRef(PersistenceUnitRefType[] value) {
		this.setValue(PERSISTENCE_UNIT_REF, value);
	}

	//
	public PersistenceUnitRefType[] getPersistenceUnitRef() {
		return (PersistenceUnitRefType[])this.getValues(PERSISTENCE_UNIT_REF);
	}

	// Add a new element returning its index in the list
	public int addPersistenceUnitRef(org.netbeans.modules.j2ee.dd.impl.client.model_5_0.PersistenceUnitRefType value) {
		int positionOfNewItem = this.addValue(PERSISTENCE_UNIT_REF, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removePersistenceUnitRef(org.netbeans.modules.j2ee.dd.impl.client.model_5_0.PersistenceUnitRefType value) {
		return this.removeValue(PERSISTENCE_UNIT_REF, value);
	}

	// This attribute is an array, possibly empty
	public void setPostConstruct(int index, LifecycleCallbackType value) {
		this.setValue(POST_CONSTRUCT, index, value);
	}

	//
	public LifecycleCallbackType getPostConstruct(int index) {
		return (LifecycleCallbackType)this.getValue(POST_CONSTRUCT, index);
	}

	// Return the number of properties
	public int sizePostConstruct() {
		return this.size(POST_CONSTRUCT);
	}

	// This attribute is an array, possibly empty
	public void setPostConstruct(LifecycleCallbackType[] value) {
		this.setValue(POST_CONSTRUCT, value);
	}

	//
	public LifecycleCallbackType[] getPostConstruct() {
		return (LifecycleCallbackType[])this.getValues(POST_CONSTRUCT);
	}

	// Add a new element returning its index in the list
	public int addPostConstruct(org.netbeans.modules.j2ee.dd.impl.client.model_5_0.LifecycleCallbackType value) {
		int positionOfNewItem = this.addValue(POST_CONSTRUCT, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removePostConstruct(org.netbeans.modules.j2ee.dd.impl.client.model_5_0.LifecycleCallbackType value) {
		return this.removeValue(POST_CONSTRUCT, value);
	}

	// This attribute is an array, possibly empty
	public void setPreDestroy(int index, LifecycleCallbackType value) {
		this.setValue(PRE_DESTROY, index, value);
	}

	//
	public LifecycleCallbackType getPreDestroy(int index) {
		return (LifecycleCallbackType)this.getValue(PRE_DESTROY, index);
	}

	// Return the number of properties
	public int sizePreDestroy() {
		return this.size(PRE_DESTROY);
	}

	// This attribute is an array, possibly empty
	public void setPreDestroy(LifecycleCallbackType[] value) {
		this.setValue(PRE_DESTROY, value);
	}

	//
	public LifecycleCallbackType[] getPreDestroy() {
		return (LifecycleCallbackType[])this.getValues(PRE_DESTROY);
	}

	// Add a new element returning its index in the list
	public int addPreDestroy(org.netbeans.modules.j2ee.dd.impl.client.model_5_0.LifecycleCallbackType value) {
		int positionOfNewItem = this.addValue(PRE_DESTROY, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removePreDestroy(org.netbeans.modules.j2ee.dd.impl.client.model_5_0.LifecycleCallbackType value) {
		return this.removeValue(PRE_DESTROY, value);
	}

	// This attribute is optional
	public void setCallbackHandler(java.lang.String value) {
		this.setValue(CALLBACK_HANDLER, value);
	}

	//
	public java.lang.String getCallbackHandler() {
		return (java.lang.String)this.getValue(CALLBACK_HANDLER);
	}

	// This attribute is an array, possibly empty
	public void setMessageDestination(int index,  
                org.netbeans.modules.j2ee.dd.api.common.MessageDestination valueInterface) {
		MessageDestination value = (MessageDestination) valueInterface;
		this.setValue(MESSAGE_DESTINATION, index, value);
	}

	//
	public  
                org.netbeans.modules.j2ee.dd.api.common.MessageDestination getMessageDestination(int index) {
		return (MessageDestination)this.getValue(MESSAGE_DESTINATION, index);
	}

	// Return the number of properties
	public int sizeMessageDestination() {
		return this.size(MESSAGE_DESTINATION);
	}

	// This attribute is an array, possibly empty
	public void setMessageDestination( 
                org.netbeans.modules.j2ee.dd.api.common.MessageDestination[] value) {
		this.setValue(MESSAGE_DESTINATION, value);
	}

	//
	public  
                org.netbeans.modules.j2ee.dd.api.common.MessageDestination[] getMessageDestination() {
		return (MessageDestination[])this.getValues(MESSAGE_DESTINATION);
	}

	// Add a new element returning its index in the list
	public int addMessageDestination( 
                org.netbeans.modules.j2ee.dd.api.common.MessageDestination valueInterface) {
		MessageDestination value = (MessageDestination) valueInterface;
		int positionOfNewItem = this.addValue(MESSAGE_DESTINATION, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeMessageDestination( 
                org.netbeans.modules.j2ee.dd.api.common.MessageDestination valueInterface) {
		MessageDestination value = (MessageDestination) valueInterface;
		return this.removeValue(MESSAGE_DESTINATION, value);
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
	public PersistenceUnitRefType newPersistenceUnitRefType() {
		return new PersistenceUnitRefType();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public LifecycleCallbackType newLifecycleCallbackType() {
		return new LifecycleCallbackType();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public org.netbeans.modules.j2ee.dd.api.common.MessageDestination newMessageDestination() {
		return new MessageDestination();
	}

	//
	public static void addComparator(org.netbeans.modules.schema2beans.BeanComparator c) {
		comparators.add(c);
	}

	//
	public static void removeComparator(org.netbeans.modules.schema2beans.BeanComparator c) {
		comparators.remove(c);
	}
	//
	// This method returns the root of the bean graph
	// Each call creates a new bean graph from the specified DOM graph
	//
	public static ApplicationClient createGraph(org.w3c.dom.Node doc) {
		return new ApplicationClient(doc, Common.NO_DEFAULT_VALUES);
	}

	public static ApplicationClient createGraph(java.io.File f) throws java.io.IOException {
		java.io.InputStream in = new java.io.FileInputStream(f);
		try {
			return createGraph(in, false);
		} finally {
			in.close();
		}
	}

	public static ApplicationClient createGraph(java.io.InputStream in) {
		return createGraph(in, false);
	}

	public static ApplicationClient createGraph(java.io.InputStream in, boolean validate) {
		try {
			Document doc = GraphManager.createXmlDocument(in, validate);
			return createGraph(doc);
		}
		catch (Exception t) {
			throw new RuntimeException(Common.getMessage(
				"DOMGraphCreateFailed_msg",
				t));
		}
	}

	//
	// This method returns the root for a new empty bean graph
	//
	public static ApplicationClient createGraph() {
		return new ApplicationClient();
	}


	
                    public org.xml.sax.SAXParseException getError() {
                        return null;
                    }
                    public int getStatus() {
                        return STATE_VALID;
                    }
                
	public void validate() throws org.netbeans.modules.schema2beans.ValidateException {
		boolean restrictionFailure = false;
		boolean restrictionPassed = false;
		// Validating property version
		if (getVersion() == null) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getVersion() == null", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "version", this);	// NOI18N
		}
		// has whitespace restriction
		if (restrictionFailure) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getVersion() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "version", this);	// NOI18N
		}
		// Validating property metadataComplete
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
			org.netbeans.modules.j2ee.dd.impl.client.model_5_0.Icon element = (org.netbeans.modules.j2ee.dd.impl.client.model_5_0.Icon) getIcon(_index);
			if (element != null) {
				((Icon)element).validate();
			}
		}
		// Validating property envEntry
		for (int _index = 0; _index < sizeEnvEntry(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.client.model_5_0.EnvEntry element = (org.netbeans.modules.j2ee.dd.impl.client.model_5_0.EnvEntry) getEnvEntry(_index);
			if (element != null) {
				((EnvEntry)element).validate();
			}
		}
		// Validating property ejbRef
		for (int _index = 0; _index < sizeEjbRef(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.client.model_5_0.EjbRef element = (org.netbeans.modules.j2ee.dd.impl.client.model_5_0.EjbRef) getEjbRef(_index);
			if (element != null) {
				((EjbRef)element).validate();
			}
		}
		// Validating property serviceRef
		for (int _index = 0; _index < sizeServiceRef(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.client.model_5_0.ServiceRef element = (org.netbeans.modules.j2ee.dd.impl.client.model_5_0.ServiceRef) getServiceRef(_index);
			if (element != null) {
				((ServiceRef)element).validate();
			}
		}
		// Validating property resourceRef
		for (int _index = 0; _index < sizeResourceRef(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.client.model_5_0.ResourceRef element = (org.netbeans.modules.j2ee.dd.impl.client.model_5_0.ResourceRef) getResourceRef(_index);
			if (element != null) {
				((ResourceRef)element).validate();
			}
		}
		// Validating property resourceEnvRef
		for (int _index = 0; _index < sizeResourceEnvRef(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.client.model_5_0.ResourceEnvRef element = (org.netbeans.modules.j2ee.dd.impl.client.model_5_0.ResourceEnvRef) getResourceEnvRef(_index);
			if (element != null) {
				((ResourceEnvRef)element).validate();
			}
		}
		// Validating property messageDestinationRef
		for (int _index = 0; _index < sizeMessageDestinationRef(); 
			++_index) {
			org.netbeans.modules.j2ee.dd.impl.client.model_5_0.MessageDestinationRef element = (org.netbeans.modules.j2ee.dd.impl.client.model_5_0.MessageDestinationRef) getMessageDestinationRef(_index);
			if (element != null) {
				((MessageDestinationRef)element).validate();
			}
		}
		// Validating property persistenceUnitRef
		for (int _index = 0; _index < sizePersistenceUnitRef(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.client.model_5_0.PersistenceUnitRefType element = getPersistenceUnitRef(_index);
			if (element != null) {
				element.validate();
			}
		}
		// Validating property postConstruct
		for (int _index = 0; _index < sizePostConstruct(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.client.model_5_0.LifecycleCallbackType element = getPostConstruct(_index);
			if (element != null) {
				element.validate();
			}
		}
		// Validating property preDestroy
		for (int _index = 0; _index < sizePreDestroy(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.client.model_5_0.LifecycleCallbackType element = getPreDestroy(_index);
			if (element != null) {
				element.validate();
			}
		}
		// Validating property callbackHandler
		// Validating property messageDestination
		for (int _index = 0; _index < sizeMessageDestination(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.client.model_5_0.MessageDestination element = (org.netbeans.modules.j2ee.dd.impl.client.model_5_0.MessageDestination) getMessageDestination(_index);
			if (element != null) {
				((MessageDestination)element).validate();
			}
		}
	}

	// Special serializer: output XML as serialization
	private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException{
		out.defaultWriteObject();
		final int MAX_SIZE = 0XFFFF;
		final ByteArrayOutputStream baos = new ByteArrayOutputStream();
		try{
			write(baos, SERIALIZATION_HELPER_CHARSET);
			final byte [] array = baos.toByteArray();
			final int numStrings = array.length / MAX_SIZE;
			final int leftover = array.length % MAX_SIZE;
			out.writeInt(numStrings + (0 == leftover ? 0 : 1));
			out.writeInt(MAX_SIZE);
			int offset = 0;
			for (int i = 0; i < numStrings; i++){
				out.writeUTF(new String(array, offset, MAX_SIZE, SERIALIZATION_HELPER_CHARSET));
				offset += MAX_SIZE;
			}
			if (leftover > 0){
				final int count = array.length - offset;
				out.writeUTF(new String(array, offset, count, SERIALIZATION_HELPER_CHARSET));
			}
		}
		catch (Schema2BeansException ex){
			throw new Schema2BeansRuntimeException(ex);
		}
	}
	// Special deserializer: read XML as deserialization
	private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException{
		try{
			in.defaultReadObject();
			init(comparators, runtimeVersion);
			// init(comparators, new GenBeans.Version(1, 0, 8))
			final int numStrings = in.readInt();
			final int max_size = in.readInt();
			final StringBuilder sb = new StringBuilder(numStrings * max_size);
			for (int i = 0; i < numStrings; i++){
				sb.append(in.readUTF());
			}
			ByteArrayInputStream bais = new ByteArrayInputStream(sb.toString().getBytes(SERIALIZATION_HELPER_CHARSET));
			Document doc = GraphManager.createXmlDocument(bais, false);
			initOptions(Common.NO_DEFAULT_VALUES);
			initFromNode(doc, Common.NO_DEFAULT_VALUES);
		}
		catch (Schema2BeansException e){
			throw new RuntimeException(e);
		}
	}

	public void _setSchemaLocation(String location) {
		if (beanProp().getAttrProp("xsi:schemaLocation", true) == null) {
			createAttribute("xmlns:xsi", "xmlns:xsi", AttrProp.CDATA | AttrProp.IMPLIED, null, "http://www.w3.org/2001/XMLSchema-instance");
			setAttributeValue("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
			createAttribute("xsi:schemaLocation", "xsi:schemaLocation", AttrProp.CDATA | AttrProp.IMPLIED, null, location);
		}
		setAttributeValue("xsi:schemaLocation", location);
	}

	public String _getSchemaLocation() {
		if (beanProp().getAttrProp("xsi:schemaLocation", true) == null) {
			createAttribute("xmlns:xsi", "xmlns:xsi", AttrProp.CDATA | AttrProp.IMPLIED, null, "http://www.w3.org/2001/XMLSchema-instance");
			setAttributeValue("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
			createAttribute("xsi:schemaLocation", "xsi:schemaLocation", AttrProp.CDATA | AttrProp.IMPLIED, null, null);
		}
		return getAttributeValue("xsi:schemaLocation");
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
		str.append("CallbackHandler");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getCallbackHandler();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(CALLBACK_HANDLER, 0, str, indent);

		str.append(indent);
		str.append("MessageDestination["+this.sizeMessageDestination()+"]");	// NOI18N
		for(int i=0; i<this.sizeMessageDestination(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getMessageDestination(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(MESSAGE_DESTINATION, i, str, indent);
		}

	}
	public String dumpBeanNode(){
		StringBuffer str = new StringBuffer();
		str.append("ApplicationClient\n");	// NOI18N
		this.dump(str, "\n  ");	// NOI18N
		return str.toString();
	}}

// END_NOI18N


/*
		The following schema file has been used for generation:

<?xml version="1.0" encoding="UTF-8"?>
<xsd:schema xmlns="http://www.w3.org/2001/XMLSchema"
	    targetNamespace="http://java.sun.com/xml/ns/javaee"
	    xmlns:javaee="http://java.sun.com/xml/ns/javaee"
	    xmlns:xsd="http://www.w3.org/2001/XMLSchema"
	    elementFormDefault="qualified"
	    attributeFormDefault="unqualified"
	    version="5">
  <xsd:annotation>
    <xsd:documentation>
      @(#)application-client_5.xsds	1.26 02/17/06
    </xsd:documentation>
  </xsd:annotation>

  <xsd:annotation>
    <xsd:documentation>

      DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.

      Copyright 2003-2010 Oracle and/or its affiliates. All rights reserved.

Oracle and Java are registered trademarks of Oracle and/or its affiliates.
Other names may be trademarks of their respective owners.

      The contents of this file are subject to the terms of either the
      GNU General Public License Version 2 only ("GPL") or the Common
      Development and Distribution License("CDDL") (collectively, the
      "License").  You may not use this file except in compliance with
      the License. You can obtain a copy of the License at
      https://glassfish.dev.java.net/public/CDDL+GPL.html or
      glassfish/bootstrap/legal/LICENSE.txt.  See the License for the
      specific language governing permissions and limitations under the
      License.

      When distributing the software, include this License Header
      Notice in each file and include the License file at
      glassfish/bootstrap/legal/LICENSE.txt.  Sun designates this
      particular file as subject to the "Classpath" exception as
      provided by Sun in the GPL Version 2 section of the License file
      that accompanied this code.  If applicable, add the following
      below the License Header, with the fields enclosed by brackets []
      replaced by your own identifying information:
      "Portions Copyrighted [year] [name of copyright owner]"

      Contributor(s):

      If you wish your version of this file to be governed by only the
      CDDL or only the GPL Version 2, indicate your decision by adding
      "[Contributor] elects to include this software in this
      distribution under the [CDDL or GPL Version 2] license."  If you
      don't indicate a single choice of license, a recipient has the
      option to distribute your version of this file under either the
      CDDL, the GPL Version 2 or to extend the choice of license to its
      licensees as provided above.  However, if you add GPL Version 2
      code and therefore, elected the GPL Version 2 license, then the
      option applies only if the new code is made subject to such
      option by the copyright holder.

    </xsd:documentation>
  </xsd:annotation>

  <xsd:annotation>
    <xsd:documentation>
      <![CDATA[

	This is the XML Schema for the application client 5
	deployment descriptor.  The deployment descriptor must
	be named "META-INF/application-client.xml" in the
	application client's jar file.  All application client
	deployment descriptors must indicate the application
	client schema by using the Java EE namespace:

	http://java.sun.com/xml/ns/javaee

	and indicate the version of the schema by
	using the version element as shown below:

	    <application-client xmlns="http://java.sun.com/xml/ns/javaee"
	      xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	      xsi:schemaLocation="http://java.sun.com/xml/ns/javaee
		http://java.sun.com/xml/ns/javaee/application-client_5.xsd"
	      version="5">
	      ...
	    </application-client>

	The instance documents may indicate the published version of
	the schema using the xsi:schemaLocation attribute for Java EE
	namespace with the following location:

	http://java.sun.com/xml/ns/javaee/application-client_5.xsd

	]]>
    </xsd:documentation>
  </xsd:annotation>

  <xsd:annotation>
    <xsd:documentation>

      The following conventions apply to all Java EE
      deployment descriptor elements unless indicated otherwise.

      - In elements that specify a pathname to a file within the
	same JAR file, relative filenames (i.e., those not
	starting with "/") are considered relative to the root of
	the JAR file's namespace.  Absolute filenames (i.e., those
	starting with "/") also specify names in the root of the
	JAR file's namespace.  In general, relative names are
	preferred.  The exception is .war files where absolute
	names are preferred for consistency with the Servlet API.

    </xsd:documentation>
  </xsd:annotation>

  <xsd:include schemaLocation="javaee_5.xsd"/>


<!-- **************************************************** -->

  <xsd:element name="application-client" type="javaee:application-clientType">
    <xsd:annotation>
      <xsd:documentation>

	The application-client element is the root element of an
	application client deployment descriptor.  The application
	client deployment descriptor describes the EJB components
	and external resources referenced by the application
	client.

      </xsd:documentation>
    </xsd:annotation>

    <xsd:unique name="env-entry-name-uniqueness">
      <xsd:annotation>
	<xsd:documentation>

	  The env-entry-name element contains the name of an
	  application client's environment entry.  The name is a JNDI
	  name relative to the java:comp/env context.  The name must
	  be unique within an application client.

	</xsd:documentation>
      </xsd:annotation>
      <xsd:selector xpath="javaee:env-entry"/>
      <xsd:field    xpath="javaee:env-entry-name"/>
    </xsd:unique>

    <xsd:unique name="ejb-ref-name-uniqueness">
      <xsd:annotation>
	<xsd:documentation>

	  The ejb-ref-name element contains the name of an EJB
	  reference. The EJB reference is an entry in the application
	  client's environment and is relative to the
	  java:comp/env context. The name must be unique within the
	  application client.

	  It is recommended that name is prefixed with "ejb/".

	</xsd:documentation>
      </xsd:annotation>
      <xsd:selector xpath="javaee:ejb-ref"/>
      <xsd:field    xpath="javaee:ejb-ref-name"/>
    </xsd:unique>

    <xsd:unique name="res-ref-name-uniqueness">
      <xsd:annotation>
	<xsd:documentation>

	  The res-ref-name element specifies the name of a
	  resource manager connection factory reference.The name
	  is a JNDI name relative to the java:comp/env context.
	  The name must be unique within an application client.

	</xsd:documentation>
      </xsd:annotation>
      <xsd:selector xpath="javaee:resource-ref"/>
      <xsd:field    xpath="javaee:res-ref-name"/>
    </xsd:unique>

    <xsd:unique name="resource-env-ref-uniqueness">
      <xsd:annotation>
	<xsd:documentation>

	  The resource-env-ref-name element specifies the name of
	  a resource environment reference; its value is the
	  environment entry name used in the application client
	  code. The name is a JNDI name relative to the
	  java:comp/env context and must be unique within an
	  application client.

	</xsd:documentation>
      </xsd:annotation>
      <xsd:selector xpath="javaee:resource-env-ref"/>
      <xsd:field    xpath="javaee:resource-env-ref-name"/>
    </xsd:unique>

    <xsd:unique name="message-destination-ref-uniqueness">
      <xsd:annotation>
	<xsd:documentation>

	  The message-destination-ref-name element specifies the
	  name of a message destination reference; its value is
	  the message destination reference name used in the
	  application client code. The name is a JNDI name
	  relative to the java:comp/env context and must be unique
	  within an application client.

	</xsd:documentation>
      </xsd:annotation>
      <xsd:selector xpath="javaee:message-destination-ref"/>
      <xsd:field    xpath="javaee:message-destination-ref-name"/>
    </xsd:unique>
  </xsd:element>

<!-- **************************************************** -->

  <xsd:complexType name="application-clientType">
    <xsd:sequence>
      <xsd:group ref="javaee:descriptionGroup"/>
      <xsd:element name="env-entry"
		   type="javaee:env-entryType"
		   minOccurs="0" maxOccurs="unbounded"/>
      <xsd:element name="ejb-ref"
		   type="javaee:ejb-refType"
		   minOccurs="0" maxOccurs="unbounded"/>
      <xsd:group ref="javaee:service-refGroup"/>
      <xsd:element name="resource-ref"
		   type="javaee:resource-refType"
		   minOccurs="0" maxOccurs="unbounded"/>
      <xsd:element name="resource-env-ref"
		   type="javaee:resource-env-refType"
		   minOccurs="0" maxOccurs="unbounded"/>
      <xsd:element name="message-destination-ref"
		   type="javaee:message-destination-refType"
		   minOccurs="0" maxOccurs="unbounded"/>
      <xsd:element name="persistence-unit-ref"
		   type="javaee:persistence-unit-refType"
		   minOccurs="0" maxOccurs="unbounded"/>
      <xsd:element name="post-construct"
		   type="javaee:lifecycle-callbackType"
		   minOccurs="0" maxOccurs="unbounded"/>
      <xsd:element name="pre-destroy"
		   type="javaee:lifecycle-callbackType"
		   minOccurs="0" maxOccurs="unbounded"/>
      <xsd:element name="callback-handler"
		   type="javaee:fully-qualified-classType"
		   minOccurs="0">
	<xsd:annotation>
	  <xsd:documentation>

	    The callback-handler element names a class provided by
	    the application.  The class must have a no args
	    constructor and must implement the
	    javax.security.auth.callback.CallbackHandler
	    interface.  The class will be instantiated by the
	    application client container and used by the container
	    to collect authentication information from the user.

	  </xsd:documentation>
	</xsd:annotation>
      </xsd:element>
      <xsd:element name="message-destination"
		   type="javaee:message-destinationType"
		   minOccurs="0"
		   maxOccurs="unbounded"/>
    </xsd:sequence>

    <xsd:attribute name="version"
		   type="javaee:dewey-versionType"
		   fixed="5"
		   use="required">
      <xsd:annotation>
	<xsd:documentation>

	  The required value for the version is 5.

	</xsd:documentation>
      </xsd:annotation>

    </xsd:attribute>

    <xsd:attribute name="metadata-complete" type="xsd:boolean">
      <xsd:annotation>
	<xsd:documentation>

	  The metadata-complete attribute defines whether this
	  deployment descriptor and other related deployment
	  descriptors for this module (e.g., web service
	  descriptors) are complete, or whether the class
	  files available to this module and packaged with
	  this application should be examined for annotations
	  that specify deployment information.

	  If metadata-complete is set to "true", the deployment
	  tool must ignore any annotations that specify deployment
	  information, which might be present in the class files
	  of the application.

	  If metadata-complete is not specified or is set to
	  "false", the deployment tool must examine the class
	  files of the application for annotations, as
	  specified by the specifications.

	</xsd:documentation>
      </xsd:annotation>

    </xsd:attribute>

    <xsd:attribute name="id" type="xsd:ID"/>
  </xsd:complexType>

</xsd:schema>


*/
