/**
 *	This generated bean class ServiceRefHandlerChainType matches the schema element 'handler-chainType'.
 *  The root bean class is ApplicationClient
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

package org.netbeans.modules.j2ee.dd.impl.client.model_7_0;

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
			org.netbeans.modules.j2ee.dd.impl.client.model_7_0.ServiceRefHandler element = (org.netbeans.modules.j2ee.dd.impl.client.model_7_0.ServiceRefHandler) getHandler(_index);
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


/*
		The following schema file has been used for generation:

<?xml version="1.0" encoding="UTF-8"?>
<xsd:schema xmlns="http://www.w3.org/2001/XMLSchema"
            targetNamespace="http://xmlns.jcp.org/xml/ns/javaee"
            xmlns:javaee="http://xmlns.jcp.org/xml/ns/javaee"
            xmlns:xsd="http://www.w3.org/2001/XMLSchema"
            elementFormDefault="qualified"
            attributeFormDefault="unqualified"
            version="7">
  <xsd:annotation>
    <xsd:documentation>

      DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
      
      Copyright (c) 2009-2013 Oracle and/or its affiliates. All rights reserved.
      
      The contents of this file are subject to the terms of either the GNU
      General Public License Version 2 only ("GPL") or the Common Development
      and Distribution License("CDDL") (collectively, the "License").  You
      may not use this file except in compliance with the License.  You can
      obtain a copy of the License at
      https://glassfish.dev.java.net/public/CDDL+GPL_1_1.html
      or packager/legal/LICENSE.txt.  See the License for the specific
      language governing permissions and limitations under the License.
      
      When distributing the software, include this License Header Notice in each
      file and include the License file at packager/legal/LICENSE.txt.
      
      GPL Classpath Exception:
      Oracle designates this particular file as subject to the "Classpath"
      exception as provided by Oracle in the GPL Version 2 section of the License
      file that accompanied this code.
      
      Modifications:
      If applicable, add the following below the License Header, with the fields
      enclosed by brackets [] replaced by your own identifying information:
      "Portions Copyright [year] [name of copyright owner]"
      
      Contributor(s):
      If you wish your version of this file to be governed by only the CDDL or
      only the GPL Version 2, indicate your decision by adding "[Contributor]
      elects to include this software in this distribution under the [CDDL or GPL
      Version 2] license."  If you don't indicate a single choice of license, a
      recipient has the option to distribute your version of this file under
      either the CDDL, the GPL Version 2 or to extend the choice of license to
      its licensees as provided above.  However, if you add GPL Version 2 code
      and therefore, elected the GPL Version 2 license, then the option applies
      only if the new code is made subject to such option by the copyright
      holder.
      
    </xsd:documentation>
  </xsd:annotation>

  <xsd:annotation>
    <xsd:documentation>
      <![CDATA[[
      This is the XML Schema for the application client 7
      deployment descriptor.  The deployment descriptor must
      be named "META-INF/application-client.xml" in the
      application client's jar file.  All application client
      deployment descriptors must indicate the application
      client schema by using the Java EE namespace:
      
      http://xmlns.jcp.org/xml/ns/javaee
      
      and indicate the version of the schema by
      using the version element as shown below:
      
      <application-client xmlns="http://xmlns.jcp.org/xml/ns/javaee"
      xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
      xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee 
      	http://xmlns.jcp.org/xml/ns/javaee/application-client_7.xsd"
      version="7">
      ...
      </application-client>
      
      The instance documents may indicate the published version of
      the schema using the xsi:schemaLocation attribute for Java EE
      namespace with the following location:
      
      http://xmlns.jcp.org/xml/ns/javaee/application-client_7.xsd
      
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

  <xsd:include schemaLocation="javaee_7.xsd"/>


<!-- **************************************************** -->

  <xsd:element name="application-client"
               type="javaee:application-clientType">
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
      <xsd:field xpath="javaee:env-entry-name"/>
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
      <xsd:field xpath="javaee:ejb-ref-name"/>
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
      <xsd:field xpath="javaee:res-ref-name"/>
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
      <xsd:field xpath="javaee:resource-env-ref-name"/>
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
      <xsd:field xpath="javaee:message-destination-ref-name"/>
    </xsd:unique>
  </xsd:element>


<!-- **************************************************** -->

  <xsd:complexType name="application-clientType">
    <xsd:sequence>
      <xsd:element name="module-name"
                   type="javaee:string"
                   minOccurs="0"/>
      <xsd:group ref="javaee:descriptionGroup"/>
      <xsd:element name="env-entry"
                   type="javaee:env-entryType"
                   minOccurs="0"
                   maxOccurs="unbounded"/>
      <xsd:element name="ejb-ref"
                   type="javaee:ejb-refType"
                   minOccurs="0"
                   maxOccurs="unbounded"/>
      <xsd:group ref="javaee:service-refGroup"/>
      <xsd:element name="resource-ref"
                   type="javaee:resource-refType"
                   minOccurs="0"
                   maxOccurs="unbounded"/>
      <xsd:element name="resource-env-ref"
                   type="javaee:resource-env-refType"
                   minOccurs="0"
                   maxOccurs="unbounded"/>
      <xsd:element name="message-destination-ref"
                   type="javaee:message-destination-refType"
                   minOccurs="0"
                   maxOccurs="unbounded"/>
      <xsd:element name="persistence-unit-ref"
                   type="javaee:persistence-unit-refType"
                   minOccurs="0"
                   maxOccurs="unbounded"/>
      <xsd:element name="post-construct"
                   type="javaee:lifecycle-callbackType"
                   minOccurs="0"
                   maxOccurs="unbounded"/>
      <xsd:element name="pre-destroy"
                   type="javaee:lifecycle-callbackType"
                   minOccurs="0"
                   maxOccurs="unbounded"/>
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
      <xsd:element name="data-source"
                   type="javaee:data-sourceType"
                   minOccurs="0"
                   maxOccurs="unbounded"/>
      <xsd:element name="jms-connection-factory"
                   type="javaee:jms-connection-factoryType"
                   minOccurs="0"
                   maxOccurs="unbounded"/>
      <xsd:element name="jms-destination"
                   type="javaee:jms-destinationType"
                   minOccurs="0"
                   maxOccurs="unbounded"/>
      <xsd:element name="mail-session"
                   type="javaee:mail-sessionType"
                   minOccurs="0"
                   maxOccurs="unbounded"/>
      <xsd:element name="connection-factory"
                   type="javaee:connection-factory-resourceType"
                   minOccurs="0"
                   maxOccurs="unbounded"/>
      <xsd:element name="administered-object"
                   type="javaee:administered-objectType"
                   minOccurs="0"
                   maxOccurs="unbounded"/>
    </xsd:sequence>
    <xsd:attribute name="version"
                   type="javaee:dewey-versionType"
                   fixed="7"
                   use="required">
      <xsd:annotation>
        <xsd:documentation>

          The required value for the version is 7.
          
        </xsd:documentation>
      </xsd:annotation>
    </xsd:attribute>
    <xsd:attribute name="metadata-complete"
                   type="xsd:boolean">
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
    <xsd:attribute name="id"
                   type="xsd:ID"/>
  </xsd:complexType>

</xsd:schema>

*/
