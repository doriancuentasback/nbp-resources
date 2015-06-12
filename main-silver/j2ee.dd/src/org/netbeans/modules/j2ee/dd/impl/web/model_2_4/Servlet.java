/**
 *	This generated bean class Servlet matches the schema element 'servletType'.
 *  The root bean class is WebApp
 *
 *	===============================================================
 *	
 *	
 *		This group keeps the usage of the contained description related
 *		elements consistent across J2EE deployment descriptors.
 *	
 *		All elements may occur multiple times with different languages,
 *		to support localization of the content.
 *	
 *	      
 *	===============================================================
 * @Generated
 */

package org.netbeans.modules.j2ee.dd.impl.web.model_2_4;

import org.w3c.dom.*;
import org.netbeans.modules.schema2beans.*;
import java.beans.*;
import java.util.*;

// BEGIN_NOI18N

public class Servlet extends org.netbeans.modules.j2ee.dd.impl.common.ComponentBeanMultiple
	 implements  
                org.netbeans.modules.j2ee.dd.api.web.Servlet, org.netbeans.modules.j2ee.dd.impl.common.KeyBean
            
{

	static Vector comparators = new Vector();
	static{
		Servlet.addComparator(new org.netbeans.modules.j2ee.dd.impl.common.Comparator());
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
	static public final String SERVLET_NAME = "ServletName";	// NOI18N
	static public final String SERVLET_CLASS = "ServletClass";	// NOI18N
	static public final String JSP_FILE = "JspFile";	// NOI18N
	static public final String INIT_PARAM = "InitParam";	// NOI18N
	static public final String LOAD_ON_STARTUP = "LoadOnStartup";	// NOI18N
	static public final String LOADONSTARTUPID = "LoadOnStartupId";	// NOI18N
	static public final String RUN_AS = "RunAs";	// NOI18N
	static public final String SECURITY_ROLE_REF = "SecurityRoleRef";	// NOI18N

	public Servlet() {
		this(Common.USE_DEFAULT_VALUES);
	}

	public Servlet(int options)
	{
		super(comparators, runtimeVersion);
		// Properties (see root bean comments for the bean graph)
		initPropertyTables(10);
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
		this.createProperty("servlet-name", 	// NOI18N
			SERVLET_NAME, 
			Common.TYPE_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createProperty("servlet-class", 	// NOI18N
			SERVLET_CLASS, Common.SEQUENCE_OR | 
			Common.TYPE_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createProperty("jsp-file", 	// NOI18N
			JSP_FILE, Common.SEQUENCE_OR | 
			Common.TYPE_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createProperty("init-param", 	// NOI18N
			INIT_PARAM, 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			InitParam.class);
		this.createAttribute(INIT_PARAM, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("load-on-startup", 	// NOI18N
			LOAD_ON_STARTUP, 
			Common.TYPE_0_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.math.BigInteger.class);
		this.createAttribute(LOAD_ON_STARTUP, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("run-as", 	// NOI18N
			RUN_AS, 
			Common.TYPE_0_1 | Common.TYPE_BEAN | Common.TYPE_KEY, 
			RunAs.class);
		this.createAttribute(RUN_AS, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("security-role-ref", 	// NOI18N
			SECURITY_ROLE_REF, 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			SecurityRoleRef.class);
		this.createAttribute(SECURITY_ROLE_REF, "id", "Id", 
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
	public void setServletName(java.lang.String value) {
		this.setValue(SERVLET_NAME, value);
	}

	//
	public java.lang.String getServletName() {
		return (java.lang.String)this.getValue(SERVLET_NAME);
	}

	// This attribute is mandatory
	public void setServletClass(java.lang.String value) {
		this.setValue(SERVLET_CLASS, value);
		if (value != null) {
			// It's a mutually exclusive property.
			setJspFile(null);
		}
	}

	//
	public java.lang.String getServletClass() {
		return (java.lang.String)this.getValue(SERVLET_CLASS);
	}

	// This attribute is mandatory
	public void setJspFile(java.lang.String value) {
		this.setValue(JSP_FILE, value);
		if (value != null) {
			// It's a mutually exclusive property.
			setServletClass(null);
		}
	}

	//
	public java.lang.String getJspFile() {
		return (java.lang.String)this.getValue(JSP_FILE);
	}

	// This attribute is an array, possibly empty
	public void setInitParam(int index,  
                org.netbeans.modules.j2ee.dd.api.common.InitParam valueInterface) {
		InitParam value = (InitParam) valueInterface;
		this.setValue(INIT_PARAM, index, value);
	}

	//
	public  
                org.netbeans.modules.j2ee.dd.api.common.InitParam getInitParam(int index) {
		return (InitParam)this.getValue(INIT_PARAM, index);
	}

	// Return the number of properties
	public int sizeInitParam() {
		return this.size(INIT_PARAM);
	}

	// This attribute is an array, possibly empty
	public void setInitParam( 
                org.netbeans.modules.j2ee.dd.api.common.InitParam[] value) {
		this.setValue(INIT_PARAM, value);
	}

	//
	public  
                org.netbeans.modules.j2ee.dd.api.common.InitParam[] getInitParam() {
		return (InitParam[])this.getValues(INIT_PARAM);
	}

	// Add a new element returning its index in the list
	public int addInitParam( 
                org.netbeans.modules.j2ee.dd.api.common.InitParam valueInterface) {
		InitParam value = (InitParam) valueInterface;
		int positionOfNewItem = this.addValue(INIT_PARAM, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeInitParam( 
                org.netbeans.modules.j2ee.dd.api.common.InitParam valueInterface) {
		InitParam value = (InitParam) valueInterface;
		return this.removeValue(INIT_PARAM, value);
	}

	// This attribute is optional
	public void setLoadOnStartup(java.math.BigInteger value) {
		this.setValue(LOAD_ON_STARTUP, value);
	}

	//
	public java.math.BigInteger getLoadOnStartup() {
		return (java.math.BigInteger)this.getValue(LOAD_ON_STARTUP);
	}

	// This attribute is optional
	public void setLoadOnStartupId(java.lang.String value) {
		// Make sure we've got a place to put this attribute.
		if (size(LOAD_ON_STARTUP) == 0) {
			setValue(LOAD_ON_STARTUP, "");
		}
		setAttributeValue(LOAD_ON_STARTUP, "Id", value);
	}

	//
	public java.lang.String getLoadOnStartupId() {
		// If our element does not exist, then the attribute does not exist.
		if (size(LOAD_ON_STARTUP) == 0) {
			return null;
		} else {
			return getAttributeValue(LOAD_ON_STARTUP, "Id");
		}
	}

	// This attribute is optional
	public void setRunAs( 
                    org.netbeans.modules.j2ee.dd.api.common.RunAs
                 valueInterface) {
		RunAs value = (RunAs) valueInterface;
		this.setValue(RUN_AS, value);
	}

	//
	public  
                    org.netbeans.modules.j2ee.dd.api.common.RunAs
                 getRunAs() {
		return (RunAs)this.getValue(RUN_AS);
	}

	// This attribute is an array, possibly empty
	public void setSecurityRoleRef(int index,  
                org.netbeans.modules.j2ee.dd.api.common.SecurityRoleRef valueInterface) {
		SecurityRoleRef value = (SecurityRoleRef) valueInterface;
		this.setValue(SECURITY_ROLE_REF, index, value);
	}

	//
	public  
                org.netbeans.modules.j2ee.dd.api.common.SecurityRoleRef getSecurityRoleRef(int index) {
		return (SecurityRoleRef)this.getValue(SECURITY_ROLE_REF, index);
	}

	// Return the number of properties
	public int sizeSecurityRoleRef() {
		return this.size(SECURITY_ROLE_REF);
	}

	// This attribute is an array, possibly empty
	public void setSecurityRoleRef( 
                org.netbeans.modules.j2ee.dd.api.common.SecurityRoleRef[] value) {
		this.setValue(SECURITY_ROLE_REF, value);
	}

	//
	public  
                org.netbeans.modules.j2ee.dd.api.common.SecurityRoleRef[] getSecurityRoleRef() {
		return (SecurityRoleRef[])this.getValues(SECURITY_ROLE_REF);
	}

	// Add a new element returning its index in the list
	public int addSecurityRoleRef( 
                org.netbeans.modules.j2ee.dd.api.common.SecurityRoleRef valueInterface) {
		SecurityRoleRef value = (SecurityRoleRef) valueInterface;
		int positionOfNewItem = this.addValue(SECURITY_ROLE_REF, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeSecurityRoleRef( 
                org.netbeans.modules.j2ee.dd.api.common.SecurityRoleRef valueInterface) {
		SecurityRoleRef value = (SecurityRoleRef) valueInterface;
		return this.removeValue(SECURITY_ROLE_REF, value);
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
	public org.netbeans.modules.j2ee.dd.api.common.InitParam newInitParam() {
		return new InitParam();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public org.netbeans.modules.j2ee.dd.api.common.RunAs newRunAs() {
		return new RunAs();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public org.netbeans.modules.j2ee.dd.api.common.SecurityRoleRef newSecurityRoleRef() {
		return new SecurityRoleRef();
	}

	//
	public static void addComparator(org.netbeans.modules.schema2beans.BeanComparator c) {
		comparators.add(c);
	}

	//
	public static void removeComparator(org.netbeans.modules.schema2beans.BeanComparator c) {
		comparators.remove(c);
	}

	
                public String getKeyProperty() { return "ServletName"; }
            
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
			org.netbeans.modules.j2ee.dd.impl.web.model_2_4.Icon element = (org.netbeans.modules.j2ee.dd.impl.web.model_2_4.Icon) getIcon(_index);
			if (element != null) {
				((Icon)element).validate();
			}
		}
		// Validating property servletName
		if (getServletName() == null) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getServletName() == null", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "servletName", this);	// NOI18N
		}
		if ((getServletName()).length() < 1) {
			restrictionFailure = true;
		}
		if (restrictionFailure) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getServletName() minLength (1)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "servletName", this);	// NOI18N
		}
		// Validating property servletClass
		if (getServletClass() != null) {
			if (getJspFile() != null) {
				throw new org.netbeans.modules.schema2beans.ValidateException("mutually exclusive properties: ServletClass and JspFile", org.netbeans.modules.schema2beans.ValidateException.FailureType.MUTUALLY_EXCLUSIVE, "JspFile", this);	// NOI18N
			}
		}
		// Validating property jspFile
		if (getJspFile() != null) {
			if (getServletClass() != null) {
				throw new org.netbeans.modules.schema2beans.ValidateException("mutually exclusive properties: JspFile and ServletClass", org.netbeans.modules.schema2beans.ValidateException.FailureType.MUTUALLY_EXCLUSIVE, "ServletClass", this);	// NOI18N
			}
		}
		// Validating property initParam
		for (int _index = 0; _index < sizeInitParam(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.web.model_2_4.InitParam element = (org.netbeans.modules.j2ee.dd.impl.web.model_2_4.InitParam) getInitParam(_index);
			if (element != null) {
				((InitParam)element).validate();
			}
		}
		// Validating property loadOnStartup
		// Validating property loadOnStartupId
		if (getLoadOnStartupId() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getLoadOnStartupId() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "loadOnStartupId", this);	// NOI18N
			}
		}
		// Validating property runAs
		if (getRunAs() != null) {
			((RunAs)getRunAs()).validate();
		}
		// Validating property securityRoleRef
		for (int _index = 0; _index < sizeSecurityRoleRef(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.web.model_2_4.SecurityRoleRef element = (org.netbeans.modules.j2ee.dd.impl.web.model_2_4.SecurityRoleRef) getSecurityRoleRef(_index);
			if (element != null) {
				((SecurityRoleRef)element).validate();
			}
		}
		if (getJspFile() == null && getServletClass() == null) {
			throw new org.netbeans.modules.schema2beans.ValidateException("required properties: getJspFile() == null && getServletClass() == null", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "JspFile", this);	// NOI18N
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
		str.append("ServletName");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getServletName();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(SERVLET_NAME, 0, str, indent);

		str.append(indent);
		str.append("ServletClass");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getServletClass();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(SERVLET_CLASS, 0, str, indent);

		str.append(indent);
		str.append("JspFile");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getJspFile();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(JSP_FILE, 0, str, indent);

		str.append(indent);
		str.append("InitParam["+this.sizeInitParam()+"]");	// NOI18N
		for(int i=0; i<this.sizeInitParam(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getInitParam(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(INIT_PARAM, i, str, indent);
		}

		str.append(indent);
		str.append("LoadOnStartup");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getLoadOnStartup();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(LOAD_ON_STARTUP, 0, str, indent);

		str.append(indent);
		str.append("RunAs");	// NOI18N
		n = (org.netbeans.modules.schema2beans.BaseBean) this.getRunAs();
		if (n != null)
			n.dump(str, indent + "\t");	// NOI18N
		else
			str.append(indent+"\tnull");	// NOI18N
		this.dumpAttributes(RUN_AS, 0, str, indent);

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

	}
	public String dumpBeanNode(){
		StringBuffer str = new StringBuffer();
		str.append("Servlet\n");	// NOI18N
		this.dump(str, "\n  ");	// NOI18N
		return str.toString();
	}}

// END_NOI18N

