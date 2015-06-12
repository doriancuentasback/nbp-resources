/**
 *	This generated bean class Module matches the schema element 'moduleType'.
 *  The root bean class is Application
 *
 *	===============================================================
 *	
 *	
 *		The moduleType defines a single J2EE module and contains a
 *		connector, ejb, java, or web element, which indicates the
 *		module type and contains a path to the module file, and an
 *		optional alt-dd element, which specifies an optional URI to
 *		the post-assembly version of the deployment descriptor.
 *	
 *	      
 *	===============================================================
 * @Generated
 */

package org.netbeans.modules.j2ee.dd.impl.application.model_1_4;

import org.w3c.dom.*;
import org.netbeans.modules.schema2beans.*;
import java.beans.*;
import java.util.*;

// BEGIN_NOI18N

public class Module extends org.netbeans.modules.schema2beans.BaseBean
	 implements org.netbeans.modules.j2ee.dd.api.application.Module
{

	static Vector comparators = new Vector();
	private static final org.netbeans.modules.schema2beans.Version runtimeVersion = new org.netbeans.modules.schema2beans.Version(5, 0, 0);
	;	// NOI18N

	static public final String ID = "Id";	// NOI18N
	static public final String CONNECTOR = "Connector";	// NOI18N
	static public final String EJB = "Ejb";	// NOI18N
	static public final String JAVA = "Java";	// NOI18N
	static public final String WEB = "Web";	// NOI18N
	static public final String ALT_DD = "AltDd";	// NOI18N

	public Module() {
		this(Common.USE_DEFAULT_VALUES);
	}

	public Module(int options)
	{
		super(comparators, runtimeVersion);
		// Properties (see root bean comments for the bean graph)
		initPropertyTables(5);
		this.createProperty("connector", 	// NOI18N
			CONNECTOR, Common.SEQUENCE_OR | 
			Common.TYPE_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createProperty("ejb", 	// NOI18N
			EJB, Common.SEQUENCE_OR | 
			Common.TYPE_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createProperty("java", 	// NOI18N
			JAVA, Common.SEQUENCE_OR | 
			Common.TYPE_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createProperty("web", 	// NOI18N
			WEB, Common.SEQUENCE_OR | 
			Common.TYPE_1 | Common.TYPE_BEAN | Common.TYPE_KEY, 
			Web.class);
		this.createAttribute(WEB, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("alt-dd", 	// NOI18N
			ALT_DD, 
			Common.TYPE_0_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
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

	// This attribute is mandatory
	public void setConnector(java.lang.String value) {
		this.setValue(CONNECTOR, value);
		if (value != null) {
			// It's a mutually exclusive property.
			setEjb(null);
			setJava(null);
			setWeb(null);
		}
	}

	//
	public java.lang.String getConnector() {
		return (java.lang.String)this.getValue(CONNECTOR);
	}

	// This attribute is mandatory
	public void setEjb(java.lang.String value) {
		this.setValue(EJB, value);
		if (value != null) {
			// It's a mutually exclusive property.
			setConnector(null);
			setJava(null);
			setWeb(null);
		}
	}

	//
	public java.lang.String getEjb() {
		return (java.lang.String)this.getValue(EJB);
	}

	// This attribute is mandatory
	public void setJava(java.lang.String value) {
		this.setValue(JAVA, value);
		if (value != null) {
			// It's a mutually exclusive property.
			setConnector(null);
			setEjb(null);
			setWeb(null);
		}
	}

	//
	public java.lang.String getJava() {
		return (java.lang.String)this.getValue(JAVA);
	}

	// This attribute is mandatory
	public void setWeb(org.netbeans.modules.j2ee.dd.api.application.Web valueInterface) {
		Web value = (Web) valueInterface;
		this.setValue(WEB, value);
		if (value != null) {
			// It's a mutually exclusive property.
			setConnector(null);
			setEjb(null);
			setJava(null);
		}
	}

	//
	public org.netbeans.modules.j2ee.dd.api.application.Web getWeb() {
		return (Web)this.getValue(WEB);
	}

	// This attribute is optional
	public void setAltDd(java.lang.String value) {
		this.setValue(ALT_DD, value);
	}

	//
	public java.lang.String getAltDd() {
		return (java.lang.String)this.getValue(ALT_DD);
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public org.netbeans.modules.j2ee.dd.api.application.Web newWeb() {
		return new Web();
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
		// Validating property connector
		if (getConnector() != null) {
			if (getEjb() != null) {
				throw new org.netbeans.modules.schema2beans.ValidateException("mutually exclusive properties: Connector and Ejb", org.netbeans.modules.schema2beans.ValidateException.FailureType.MUTUALLY_EXCLUSIVE, "Ejb", this);	// NOI18N
			}
			if (getJava() != null) {
				throw new org.netbeans.modules.schema2beans.ValidateException("mutually exclusive properties: Connector and Java", org.netbeans.modules.schema2beans.ValidateException.FailureType.MUTUALLY_EXCLUSIVE, "Java", this);	// NOI18N
			}
			if (getWeb() != null) {
				throw new org.netbeans.modules.schema2beans.ValidateException("mutually exclusive properties: Connector and Web", org.netbeans.modules.schema2beans.ValidateException.FailureType.MUTUALLY_EXCLUSIVE, "Web", this);	// NOI18N
			}
		}
		// Validating property ejb
		if (getEjb() != null) {
			if (getConnector() != null) {
				throw new org.netbeans.modules.schema2beans.ValidateException("mutually exclusive properties: Ejb and Connector", org.netbeans.modules.schema2beans.ValidateException.FailureType.MUTUALLY_EXCLUSIVE, "Connector", this);	// NOI18N
			}
			if (getJava() != null) {
				throw new org.netbeans.modules.schema2beans.ValidateException("mutually exclusive properties: Ejb and Java", org.netbeans.modules.schema2beans.ValidateException.FailureType.MUTUALLY_EXCLUSIVE, "Java", this);	// NOI18N
			}
			if (getWeb() != null) {
				throw new org.netbeans.modules.schema2beans.ValidateException("mutually exclusive properties: Ejb and Web", org.netbeans.modules.schema2beans.ValidateException.FailureType.MUTUALLY_EXCLUSIVE, "Web", this);	// NOI18N
			}
		}
		// Validating property java
		if (getJava() != null) {
			if (getConnector() != null) {
				throw new org.netbeans.modules.schema2beans.ValidateException("mutually exclusive properties: Java and Connector", org.netbeans.modules.schema2beans.ValidateException.FailureType.MUTUALLY_EXCLUSIVE, "Connector", this);	// NOI18N
			}
			if (getEjb() != null) {
				throw new org.netbeans.modules.schema2beans.ValidateException("mutually exclusive properties: Java and Ejb", org.netbeans.modules.schema2beans.ValidateException.FailureType.MUTUALLY_EXCLUSIVE, "Ejb", this);	// NOI18N
			}
			if (getWeb() != null) {
				throw new org.netbeans.modules.schema2beans.ValidateException("mutually exclusive properties: Java and Web", org.netbeans.modules.schema2beans.ValidateException.FailureType.MUTUALLY_EXCLUSIVE, "Web", this);	// NOI18N
			}
		}
		// Validating property web
		if (getWeb() != null) {
			((Web)getWeb()).validate();
		}
		if (getWeb() != null) {
			if (getConnector() != null) {
				throw new org.netbeans.modules.schema2beans.ValidateException("mutually exclusive properties: Web and Connector", org.netbeans.modules.schema2beans.ValidateException.FailureType.MUTUALLY_EXCLUSIVE, "Connector", this);	// NOI18N
			}
			if (getEjb() != null) {
				throw new org.netbeans.modules.schema2beans.ValidateException("mutually exclusive properties: Web and Ejb", org.netbeans.modules.schema2beans.ValidateException.FailureType.MUTUALLY_EXCLUSIVE, "Ejb", this);	// NOI18N
			}
			if (getJava() != null) {
				throw new org.netbeans.modules.schema2beans.ValidateException("mutually exclusive properties: Web and Java", org.netbeans.modules.schema2beans.ValidateException.FailureType.MUTUALLY_EXCLUSIVE, "Java", this);	// NOI18N
			}
		}
		// Validating property altDd
		if (getConnector() == null && getEjb() == null && getJava() == null && getWeb() == null) {
			throw new org.netbeans.modules.schema2beans.ValidateException("required properties: getConnector() == null && getEjb() == null && getJava() == null && getWeb() == null", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "Web", this);	// NOI18N
		}
	}

	// Dump the content of this bean returning it as a String
	public void dump(StringBuffer str, String indent){
		String s;
		Object o;
		org.netbeans.modules.schema2beans.BaseBean n;
		str.append(indent);
		str.append("Connector");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getConnector();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(CONNECTOR, 0, str, indent);

		str.append(indent);
		str.append("Ejb");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getEjb();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(EJB, 0, str, indent);

		str.append(indent);
		str.append("Java");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getJava();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(JAVA, 0, str, indent);

		str.append(indent);
		str.append("Web");	// NOI18N
		n = (org.netbeans.modules.schema2beans.BaseBean) this.getWeb();
		if (n != null)
			n.dump(str, indent + "\t");	// NOI18N
		else
			str.append(indent+"\tnull");	// NOI18N
		this.dumpAttributes(WEB, 0, str, indent);

		str.append(indent);
		str.append("AltDd");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getAltDd();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(ALT_DD, 0, str, indent);

	}
	public String dumpBeanNode(){
		StringBuffer str = new StringBuffer();
		str.append("Module\n");	// NOI18N
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
      @(#)application_1_4.xsds	1.13 02/11/03
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

	This is the XML Schema for the application 1.4 deployment
	descriptor.  The deployment descriptor must be named
	"META-INF/application.xml" in the application's ear file.
	All application deployment descriptors must indicate
	the application schema by using the J2EE namespace:

	http://java.sun.com/xml/ns/j2ee

	and indicate the version of the schema by
	using the version element as shown below:

	    <application xmlns="http://java.sun.com/xml/ns/j2ee"
	      xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	      xsi:schemaLocation="http://java.sun.com/xml/ns/j2ee
		http://java.sun.com/xml/ns/j2ee/application_1_4.xsd"
	      version="1.4">
	      ...
	    </application>

	The instance documents may indicate the published version of
	the schema using the xsi:schemaLocation attribute for J2EE
	namespace with the following location:

	http://java.sun.com/xml/ns/j2ee/application_1_4.xsd

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


  <xsd:element name="application" type="j2ee:applicationType">
    <xsd:annotation>
      <xsd:documentation>

	The application element is the root element of a J2EE
	application deployment descriptor.

      </xsd:documentation>
    </xsd:annotation>

    <xsd:unique name="context-root-uniqueness">
      <xsd:annotation>
	<xsd:documentation>

	  The context-root element content must be unique
	  in the ear.

	</xsd:documentation>
      </xsd:annotation>
      <xsd:selector xpath="j2ee:module/j2ee:web"/>
      <xsd:field    xpath="j2ee:context-root"/>
    </xsd:unique>

    <xsd:unique name="security-role-uniqueness">
      <xsd:annotation>
	<xsd:documentation>

	  The security-role-name element content
	  must be unique in the ear.

	</xsd:documentation>
      </xsd:annotation>
      <xsd:selector xpath="j2ee:security-role"/>
      <xsd:field    xpath="j2ee:role-name"/>
    </xsd:unique>

  </xsd:element>

<!-- **************************************************** -->

  <xsd:complexType name="applicationType">
    <xsd:annotation>
      <xsd:documentation>

	The applicationType defines the structure of the
	application.

      </xsd:documentation>
    </xsd:annotation>

    <xsd:sequence>
      <xsd:group ref="j2ee:descriptionGroup"/>
      <xsd:element name="module"
		   type="j2ee:moduleType"
		   maxOccurs="unbounded">
	<xsd:annotation>
	  <xsd:documentation>

	    The application deployment descriptor must have one
	    module element for each J2EE module in the
	    application package. A module element is defined
	    by moduleType definition.

	  </xsd:documentation>
	</xsd:annotation>
      </xsd:element>
      <xsd:element name="security-role"
		   type="j2ee:security-roleType"
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

<!-- **************************************************** -->

  <xsd:complexType name="moduleType">
    <xsd:annotation>
      <xsd:documentation>

	The moduleType defines a single J2EE module and contains a
	connector, ejb, java, or web element, which indicates the
	module type and contains a path to the module file, and an
	optional alt-dd element, which specifies an optional URI to
	the post-assembly version of the deployment descriptor.

      </xsd:documentation>
    </xsd:annotation>

    <xsd:sequence>
      <xsd:choice>
	<xsd:element name="connector"
		     type="j2ee:pathType">
	  <xsd:annotation>
	    <xsd:documentation>

	      The connector element specifies the URI of a
	      resource adapter archive file, relative to the
	      top level of the application package.

	    </xsd:documentation>
	  </xsd:annotation>
	</xsd:element>
	<xsd:element name="ejb"
		     type="j2ee:pathType">
	  <xsd:annotation>
	    <xsd:documentation>

	      The ejb element specifies the URI of an ejb-jar,
	      relative to the top level of the application
	      package.

	    </xsd:documentation>
	  </xsd:annotation>
	</xsd:element>
	<xsd:element name="java"
		     type="j2ee:pathType">
	  <xsd:annotation>
	    <xsd:documentation>

	      The java element specifies the URI of a java
	      application client module, relative to the top
	      level of the application package.

	    </xsd:documentation>
	  </xsd:annotation>
	</xsd:element>
	<xsd:element name="web"
		     type="j2ee:webType"/>
      </xsd:choice>
      <xsd:element name="alt-dd"
		   type="j2ee:pathType"
		   minOccurs="0">
	<xsd:annotation>
	  <xsd:documentation>

	    The alt-dd element specifies an optional URI to the
	    post-assembly version of the deployment descriptor
	    file for a particular J2EE module.  The URI must
	    specify the full pathname of the deployment
	    descriptor file relative to the application's root
	    directory. If alt-dd is not specified, the deployer
	    must read the deployment descriptor from the default
	    location and file name required by the respective
	    component specification.

	  </xsd:documentation>
	</xsd:annotation>
      </xsd:element>
    </xsd:sequence>
    <xsd:attribute name="id" type="xsd:ID"/>
  </xsd:complexType>

<!-- **************************************************** -->

  <xsd:complexType name="webType">
    <xsd:annotation>
      <xsd:documentation>

	The webType defines the web-uri and context-root of
	a web application module.

      </xsd:documentation>
    </xsd:annotation>
    <xsd:sequence>
      <xsd:element name="web-uri"
		   type="j2ee:pathType">
	<xsd:annotation>
	  <xsd:documentation>

	    The web-uri element specifies the URI of a web
	    application file, relative to the top level of the
	    application package.

	  </xsd:documentation>
	</xsd:annotation>
      </xsd:element>
      <xsd:element name="context-root"
		   type="j2ee:string">

	<xsd:annotation>
	  <xsd:documentation>

	    The context-root element specifies the context root
	    of a web application.

	  </xsd:documentation>
	</xsd:annotation>
      </xsd:element>
    </xsd:sequence>
    <xsd:attribute name="id" type="xsd:ID"/>
  </xsd:complexType>

</xsd:schema>


*/
