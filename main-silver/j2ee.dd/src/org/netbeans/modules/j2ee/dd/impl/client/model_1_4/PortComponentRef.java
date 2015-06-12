/**
 *	This generated bean class PortComponentRef matches the schema element 'port-component-refType'.
 *  The root bean class is ApplicationClient
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

package org.netbeans.modules.j2ee.dd.impl.client.model_1_4;

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
	static public final String PORT_COMPONENT_LINK = "PortComponentLink";	// NOI18N
	static public final String PORTCOMPONENTLINKID = "PortComponentLinkId";	// NOI18N

	public PortComponentRef() {
		this(Common.USE_DEFAULT_VALUES);
	}

	public PortComponentRef(int options)
	{
		super(comparators, runtimeVersion);
		// Properties (see root bean comments for the bean graph)
		initPropertyTables(2);
		this.createProperty("service-endpoint-interface", 	// NOI18N
			SERVICE_ENDPOINT_INTERFACE, 
			Common.TYPE_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
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


/*
		The following schema file has been used for generation:

<?xml version="1.0" encoding="UTF-8"?>
<xsd:schema xmlns="http://www.w3.org/2001/XMLSchema"
	    targetNamespace="http://java.sun.com/xml/ns/j2ee"
	    xmlns:j2ee="http://java.sun.com/xml/ns/j2ee"
	    xmlns:xsd="http://www.w3.org/2001/XMLSchema"
	    elementFormDefault="qualified"
	    attributeFormDefault="unqualified"
	    version="1.4">
  <xsd:annotation>
    <xsd:documentation>
      @(#)application-client_1_4.xsds	1.17 02/11/03
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

	This is the XML Schema for the application client 1.4
	deployment descriptor.  The deployment descriptor must
	be named "META-INF/application-client.xml" in the
	application client's jar file.  All application client
	deployment descriptors must indicate the application
	client schema by using the J2EE namespace:

	http://java.sun.com/xml/ns/j2ee

	and indicate the version of the schema by
	using the version element as shown below:

	    <application-client xmlns="http://java.sun.com/xml/ns/j2ee"
	      xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	      xsi:schemaLocation="http://java.sun.com/xml/ns/j2ee
		http://java.sun.com/xml/ns/j2ee/application-client_1_4.xsd"
	      version="1.4">
	      ...
	    </application-client>

	The instance documents may indicate the published version of
	the schema using the xsi:schemaLocation attribute for J2EE
	namespace with the following location:

	http://java.sun.com/xml/ns/j2ee/application-client_1_4.xsd

	]]>
    </xsd:documentation>
  </xsd:annotation>

  <xsd:annotation>
    <xsd:documentation>

      The following conventions apply to all J2EE
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

  <xsd:include schemaLocation="j2ee_1_4.xsd"/>


<!-- **************************************************** -->


  <xsd:element name="application-client" type="j2ee:application-clientType">
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
      <xsd:selector xpath="j2ee:env-entry"/>
      <xsd:field    xpath="j2ee:env-entry-name"/>
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
      <xsd:selector xpath="j2ee:ejb-ref"/>
      <xsd:field    xpath="j2ee:ejb-ref-name"/>
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
      <xsd:selector xpath="j2ee:resource-ref"/>
      <xsd:field    xpath="j2ee:res-ref-name"/>
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
      <xsd:selector xpath="j2ee:resource-env-ref"/>
      <xsd:field    xpath="j2ee:resource-env-ref-name"/>
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
      <xsd:selector xpath="j2ee:message-destination-ref"/>
      <xsd:field    xpath="j2ee:message-destination-ref-name"/>
    </xsd:unique>
  </xsd:element>

<!-- **************************************************** -->

  <xsd:complexType name="application-clientType">
    <xsd:sequence>
      <xsd:group ref="j2ee:descriptionGroup"/>
      <xsd:element name="env-entry"
		   type="j2ee:env-entryType"
		   minOccurs="0" maxOccurs="unbounded"/>
      <xsd:element name="ejb-ref"
		   type="j2ee:ejb-refType"
		   minOccurs="0" maxOccurs="unbounded"/>
      <xsd:group ref="j2ee:service-refGroup"/>
      <xsd:element name="resource-ref"
		   type="j2ee:resource-refType"
		   minOccurs="0" maxOccurs="unbounded"/>
      <xsd:element name="resource-env-ref"
		   type="j2ee:resource-env-refType"
		   minOccurs="0" maxOccurs="unbounded"/>
      <xsd:element name="message-destination-ref"
		   type="j2ee:message-destination-refType"
		   minOccurs="0"
		   maxOccurs="unbounded"/>
      <xsd:element name="callback-handler"
		   type="j2ee:fully-qualified-classType"
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
		   type="j2ee:message-destinationType"
		   minOccurs="0"
		   maxOccurs="unbounded"/>
    </xsd:sequence>

    <xsd:attribute name="version"
		   type="j2ee:dewey-versionType"
		   fixed="1.4"
		   use="required">
      <xsd:annotation>
	<xsd:documentation>

	  The required value for the version is 1.4.

	</xsd:documentation>
      </xsd:annotation>

    </xsd:attribute>
    <xsd:attribute name="id" type="xsd:ID"/>
  </xsd:complexType>

</xsd:schema>


*/
