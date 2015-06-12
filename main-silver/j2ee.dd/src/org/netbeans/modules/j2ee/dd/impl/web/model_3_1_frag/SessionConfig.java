/**
 *	This generated bean class SessionConfig matches the schema element 'session-configType'.
 *  The root bean class is WebFragment
 *
 *	===============================================================
 *	
 *	
 *	        The session-configType defines the session parameters
 *	        for this web application.
 *	        
 *	        Used in: web-app
 *	        
 *	      
 *	===============================================================
 * @Generated
 */

package org.netbeans.modules.j2ee.dd.impl.web.model_3_1_frag;

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
	static public final String COOKIE_CONFIG = "CookieConfig";	// NOI18N
	static public final String TRACKING_MODE = "TrackingMode";	// NOI18N

	public SessionConfig() {
		this(Common.USE_DEFAULT_VALUES);
	}

	public SessionConfig(int options)
	{
		super(comparators, runtimeVersion);
		// Properties (see root bean comments for the bean graph)
		initPropertyTables(3);
		this.createProperty("session-timeout", 	// NOI18N
			SESSION_TIMEOUT, 
			Common.TYPE_0_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.math.BigInteger.class);
		this.createAttribute(SESSION_TIMEOUT, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("cookie-config", 	// NOI18N
			COOKIE_CONFIG, 
			Common.TYPE_0_1 | Common.TYPE_BEAN | Common.TYPE_KEY, 
			CookieConfigType.class);
		this.createAttribute(COOKIE_CONFIG, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("tracking-mode", 	// NOI18N
			TRACKING_MODE, 
			Common.TYPE_0_N | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
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

	// This attribute is optional
	public void setCookieConfig(CookieConfigType value) {
		this.setValue(COOKIE_CONFIG, value);
	}

	//
	public CookieConfigType getCookieConfig() {
		return (CookieConfigType)this.getValue(COOKIE_CONFIG);
	}

	// This attribute is an array, possibly empty
	public void setTrackingMode(int index, java.lang.String value) {
		this.setValue(TRACKING_MODE, index, value);
	}

	//
	public java.lang.String getTrackingMode(int index) {
		return (java.lang.String)this.getValue(TRACKING_MODE, index);
	}

	// Return the number of properties
	public int sizeTrackingMode() {
		return this.size(TRACKING_MODE);
	}

	// This attribute is an array, possibly empty
	public void setTrackingMode(java.lang.String[] value) {
		this.setValue(TRACKING_MODE, value);
	}

	//
	public java.lang.String[] getTrackingMode() {
		return (java.lang.String[])this.getValues(TRACKING_MODE);
	}

	// Add a new element returning its index in the list
	public int addTrackingMode(java.lang.String value) {
		int positionOfNewItem = this.addValue(TRACKING_MODE, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeTrackingMode(java.lang.String value) {
		return this.removeValue(TRACKING_MODE, value);
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public CookieConfigType newCookieConfigType() {
		return new CookieConfigType();
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
		// Validating property cookieConfig
		if (getCookieConfig() != null) {
			getCookieConfig().validate();
		}
		// Validating property trackingMode
		if (sizeTrackingMode() > 3) {
			restrictionFailure = true;
		}
		if (restrictionFailure) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getTrackingMode() maxOccurs (3)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "trackingMode", this);	// NOI18N
		}
		for (int _index = 0; _index < sizeTrackingMode(); ++_index) {
			java.lang.String element = getTrackingMode(_index);
			if (element != null) {
				final java.lang.String[] enumRestrictionTrackingMode = {"COOKIE", "URL", "SSL"};
				restrictionFailure = true;
				for (int _index2 = 0; 
					_index2 < enumRestrictionTrackingMode.length; ++_index2) {
					if (enumRestrictionTrackingMode[_index2].equals(element)) {
						restrictionFailure = false;
						break;
					}
				}
				if (restrictionFailure) {
					throw new org.netbeans.modules.schema2beans.ValidateException("element enumeration test", org.netbeans.modules.schema2beans.ValidateException.FailureType.ENUM_RESTRICTION, "trackingMode", this);	// NOI18N
				}
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

		str.append(indent);
		str.append("CookieConfig");	// NOI18N
		n = (org.netbeans.modules.schema2beans.BaseBean) this.getCookieConfig();
		if (n != null)
			n.dump(str, indent + "\t");	// NOI18N
		else
			str.append(indent+"\tnull");	// NOI18N
		this.dumpAttributes(COOKIE_CONFIG, 0, str, indent);

		str.append(indent);
		str.append("TrackingMode["+this.sizeTrackingMode()+"]");	// NOI18N
		for(int i=0; i<this.sizeTrackingMode(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			str.append(indent+"\t");	// NOI18N
			str.append("<");	// NOI18N
			o = this.getTrackingMode(i);
			str.append((o==null?"null":o.toString().trim()));	// NOI18N
			str.append(">\n");	// NOI18N
			this.dumpAttributes(TRACKING_MODE, i, str, indent);
		}

	}
	public String dumpBeanNode(){
		StringBuffer str = new StringBuffer();
		str.append("SessionConfig\n");	// NOI18N
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
            version="3.1">
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
      This is the XML Schema for the Servlet 3.1 deployment descriptor.
      The deployment descriptor must be named "META-INF/web-fragment.xml"
      in the web fragment's jar file.  All Servlet deployment descriptors
      must indicate the web application schema by using the Java EE
      namespace:
      
      http://xmlns.jcp.org/xml/ns/javaee 
      
      and by indicating the version of the schema by 
      using the version element as shown below: 
      
      <web-fragment xmlns="http://xmlns.jcp.org/xml/ns/javaee"
      xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
      xsi:schemaLocation="..."
      version="3.1"> 
      ...
      </web-fragment>
      
      The instance documents may indicate the published version of
      the schema using the xsi:schemaLocation attribute for Java EE
      namespace with the following location:
      
      http://xmlns.jcp.org/xml/ns/javaee/web-fragment_3_1.xsd
      
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

  <xsd:include schemaLocation="web-common_3_1.xsd"/>


<!-- **************************************************** -->

  <xsd:element name="web-fragment"
               type="javaee:web-fragmentType">
    <xsd:annotation>
      <xsd:documentation>

        The web-fragment element is the root of the deployment
        descriptor for a web fragment.  Note that the sub-elements
        of this element can be in the arbitrary order. Because of
        that, the multiplicity of the elements of distributable,
        session-config, welcome-file-list, jsp-config, login-config,
        and locale-encoding-mapping-list was changed from "?" to "*"
        in this schema.  However, the deployment descriptor instance
        file must not contain multiple elements of session-config,
        jsp-config, and login-config. When there are multiple elements of
        welcome-file-list or locale-encoding-mapping-list, the container
        must concatenate the element contents.  The multiple occurence
        of the element distributable is redundant and the container
        treats that case exactly in the same way when there is only
        one distributable. 
        
      </xsd:documentation>
    </xsd:annotation>
    <xsd:unique name="web-common-servlet-name-uniqueness">
      <xsd:annotation>
        <xsd:documentation>

          The servlet element contains the name of a servlet.
          The name must be unique within the web application.
          
        </xsd:documentation>
      </xsd:annotation>
      <xsd:selector xpath="javaee:servlet"/>
      <xsd:field xpath="javaee:servlet-name"/>
    </xsd:unique>
    <xsd:unique name="web-common-filter-name-uniqueness">
      <xsd:annotation>
        <xsd:documentation>

          The filter element contains the name of a filter.
          The name must be unique within the web application.
          
        </xsd:documentation>
      </xsd:annotation>
      <xsd:selector xpath="javaee:filter"/>
      <xsd:field xpath="javaee:filter-name"/>
    </xsd:unique>
    <xsd:unique name="web-common-ejb-local-ref-name-uniqueness">
      <xsd:annotation>
        <xsd:documentation>

          The ejb-local-ref-name element contains the name of an EJB
          reference. The EJB reference is an entry in the web
          application's environment and is relative to the
          java:comp/env context.  The name must be unique within
          the web application.
          
          It is recommended that name is prefixed with "ejb/".
          
        </xsd:documentation>
      </xsd:annotation>
      <xsd:selector xpath="javaee:ejb-local-ref"/>
      <xsd:field xpath="javaee:ejb-ref-name"/>
    </xsd:unique>
    <xsd:unique name="web-common-ejb-ref-name-uniqueness">
      <xsd:annotation>
        <xsd:documentation>

          The ejb-ref-name element contains the name of an EJB
          reference. The EJB reference is an entry in the web
          application's environment and is relative to the
          java:comp/env context.  The name must be unique within
          the web application.
          
          It is recommended that name is prefixed with "ejb/".
          
        </xsd:documentation>
      </xsd:annotation>
      <xsd:selector xpath="javaee:ejb-ref"/>
      <xsd:field xpath="javaee:ejb-ref-name"/>
    </xsd:unique>
    <xsd:unique name="web-common-resource-env-ref-uniqueness">
      <xsd:annotation>
        <xsd:documentation>

          The resource-env-ref-name element specifies the name of
          a resource environment reference; its value is the
          environment entry name used in the web application code.
          The name is a JNDI name relative to the java:comp/env
          context and must be unique within a web application.
          
        </xsd:documentation>
      </xsd:annotation>
      <xsd:selector xpath="javaee:resource-env-ref"/>
      <xsd:field xpath="javaee:resource-env-ref-name"/>
    </xsd:unique>
    <xsd:unique name="web-common-message-destination-ref-uniqueness">
      <xsd:annotation>
        <xsd:documentation>

          The message-destination-ref-name element specifies the name of
          a message destination reference; its value is the
          environment entry name used in the web application code.
          The name is a JNDI name relative to the java:comp/env
          context and must be unique within a web application.
          
        </xsd:documentation>
      </xsd:annotation>
      <xsd:selector xpath="javaee:message-destination-ref"/>
      <xsd:field xpath="javaee:message-destination-ref-name"/>
    </xsd:unique>
    <xsd:unique name="web-common-res-ref-name-uniqueness">
      <xsd:annotation>
        <xsd:documentation>

          The res-ref-name element specifies the name of a
          resource manager connection factory reference.  The name
          is a JNDI name relative to the java:comp/env context.
          The name must be unique within a web application.
          
        </xsd:documentation>
      </xsd:annotation>
      <xsd:selector xpath="javaee:resource-ref"/>
      <xsd:field xpath="javaee:res-ref-name"/>
    </xsd:unique>
    <xsd:unique name="web-common-env-entry-name-uniqueness">
      <xsd:annotation>
        <xsd:documentation>

          The env-entry-name element contains the name of a web
          application's environment entry.  The name is a JNDI
          name relative to the java:comp/env context.  The name
          must be unique within a web application.
          
        </xsd:documentation>
      </xsd:annotation>
      <xsd:selector xpath="javaee:env-entry"/>
      <xsd:field xpath="javaee:env-entry-name"/>
    </xsd:unique>
    <xsd:key name="web-common-role-name-key">
      <xsd:annotation>
        <xsd:documentation>

          A role-name-key is specified to allow the references
          from the security-role-refs.
          
        </xsd:documentation>
      </xsd:annotation>
      <xsd:selector xpath="javaee:security-role"/>
      <xsd:field xpath="javaee:role-name"/>
    </xsd:key>
    <xsd:keyref name="web-common-role-name-references"
                refer="javaee:web-common-role-name-key">
      <xsd:annotation>
        <xsd:documentation>

          The keyref indicates the references from
          security-role-ref to a specified role-name.
          
        </xsd:documentation>
      </xsd:annotation>
      <xsd:selector xpath="javaee:servlet/javaee:security-role-ref"/>
      <xsd:field xpath="javaee:role-link"/>
    </xsd:keyref>
  </xsd:element>


<!-- **************************************************** -->

  <xsd:complexType name="web-fragmentType">
    <xsd:choice minOccurs="0"
                maxOccurs="unbounded">
      <xsd:element name="name"
                   type="javaee:java-identifierType"/>
      <xsd:group ref="javaee:web-commonType"/>
      <xsd:element name="ordering"
                   type="javaee:orderingType"/>
    </xsd:choice>
    <xsd:attributeGroup ref="javaee:web-common-attributes"/>
  </xsd:complexType>


<!-- **************************************************** -->

  <xsd:complexType name="orderingType">
    <xsd:annotation>
      <xsd:documentation>

        Please see section 8.2.2 of the specification for details.
        
      </xsd:documentation>
    </xsd:annotation>
    <xsd:sequence>
      <xsd:element name="after"
                   type="javaee:ordering-orderingType"
                   minOccurs="0"
                   maxOccurs="1"/>
      <xsd:element name="before"
                   type="javaee:ordering-orderingType"
                   minOccurs="0"
                   maxOccurs="1"/>
    </xsd:sequence>
  </xsd:complexType>


<!-- **************************************************** -->

  <xsd:complexType name="ordering-orderingType">
    <xsd:annotation>
      <xsd:documentation>

        This element contains a sequence of "name" elements, each of
        which
        refers to an application configuration resource by the "name"
        declared on its web.xml fragment.  This element can also contain
        a single "others" element which specifies that this document
        comes
        before or after other documents within the application.
        See section 8.2.2 of the specification for details.
        
      </xsd:documentation>
    </xsd:annotation>
    <xsd:sequence>
      <xsd:element name="name"
                   type="javaee:java-identifierType"
                   minOccurs="0"
                   maxOccurs="unbounded"/>
      <xsd:element name="others"
                   type="javaee:ordering-othersType"
                   minOccurs="0"
                   maxOccurs="1"/>
    </xsd:sequence>
  </xsd:complexType>

</xsd:schema>

*/
