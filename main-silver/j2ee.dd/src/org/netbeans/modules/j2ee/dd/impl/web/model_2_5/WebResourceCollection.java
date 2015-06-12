/**
 *	This generated bean class WebResourceCollection matches the schema element 'web-resource-collectionType'.
 *  The root bean class is WebApp
 *
 *	===============================================================
 *	
 *	
 *		The web-resource-collectionType is used to identify a subset
 *		of the resources and HTTP methods on those resources within
 *		a web application to which a security constraint applies. If
 *		no HTTP methods are specified, then the security constraint
 *		applies to all HTTP methods.
 *	
 *		Used in: security-constraint
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

public class WebResourceCollection extends org.netbeans.modules.j2ee.dd.impl.common.DescriptionBeanMultiple
	 implements  
                org.netbeans.modules.j2ee.dd.api.web.WebResourceCollection, org.netbeans.modules.j2ee.dd.impl.common.KeyBean
            
{

	static Vector comparators = new Vector();
	private static final org.netbeans.modules.schema2beans.Version runtimeVersion = new org.netbeans.modules.schema2beans.Version(5, 0, 0);
	;	// NOI18N

	static public final String ID = "Id";	// NOI18N
	static public final String WEB_RESOURCE_NAME = "WebResourceName";	// NOI18N
	static public final String WEBRESOURCENAMEID = "WebResourceNameId";	// NOI18N
	static public final String DESCRIPTION = "Description";	// NOI18N
	static public final String DESCRIPTIONID = "DescriptionId";	// NOI18N
	static public final String DESCRIPTIONXMLLANG = "DescriptionXmlLang";	// NOI18N
	static public final String URL_PATTERN = "UrlPattern";	// NOI18N
	static public final String HTTP_METHOD = "HttpMethod";	// NOI18N

	public WebResourceCollection() {
		this(Common.USE_DEFAULT_VALUES);
	}

	public WebResourceCollection(int options)
	{
		super(comparators, runtimeVersion);
		// Properties (see root bean comments for the bean graph)
		initPropertyTables(4);
		this.createProperty("web-resource-name", 	// NOI18N
			WEB_RESOURCE_NAME, 
			Common.TYPE_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createAttribute(WEB_RESOURCE_NAME, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
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
		this.createProperty("url-pattern", 	// NOI18N
			URL_PATTERN, 
			Common.TYPE_1_N | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createProperty("http-method", 	// NOI18N
			HTTP_METHOD, 
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

	// This attribute is mandatory
	public void setWebResourceName(java.lang.String value) {
		this.setValue(WEB_RESOURCE_NAME, value);
	}

	//
	public java.lang.String getWebResourceName() {
		return (java.lang.String)this.getValue(WEB_RESOURCE_NAME);
	}

	// This attribute is optional
	public void setWebResourceNameId(java.lang.String value) {
		// Make sure we've got a place to put this attribute.
		if (size(WEB_RESOURCE_NAME) == 0) {
			setValue(WEB_RESOURCE_NAME, "");
		}
		setAttributeValue(WEB_RESOURCE_NAME, "Id", value);
	}

	//
	public java.lang.String getWebResourceNameId() {
		// If our element does not exist, then the attribute does not exist.
		if (size(WEB_RESOURCE_NAME) == 0) {
			return null;
		} else {
			return getAttributeValue(WEB_RESOURCE_NAME, "Id");
		}
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

	// This attribute is an array containing at least one element
	public void setUrlPattern(int index, java.lang.String value) {
		this.setValue(URL_PATTERN, index, value);
	}

	//
	public java.lang.String getUrlPattern(int index) {
		return (java.lang.String)this.getValue(URL_PATTERN, index);
	}

	// Return the number of properties
	public int sizeUrlPattern() {
		return this.size(URL_PATTERN);
	}

	// This attribute is an array containing at least one element
	public void setUrlPattern(java.lang.String[] value) {
		this.setValue(URL_PATTERN, value);
	}

	//
	public java.lang.String[] getUrlPattern() {
		return (java.lang.String[])this.getValues(URL_PATTERN);
	}

	// Add a new element returning its index in the list
	public int addUrlPattern(java.lang.String value) {
		int positionOfNewItem = this.addValue(URL_PATTERN, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeUrlPattern(java.lang.String value) {
		return this.removeValue(URL_PATTERN, value);
	}

	// This attribute is an array, possibly empty
	public void setHttpMethod(int index, java.lang.String value) {
		this.setValue(HTTP_METHOD, index, value);
	}

	//
	public java.lang.String getHttpMethod(int index) {
		return (java.lang.String)this.getValue(HTTP_METHOD, index);
	}

	// Return the number of properties
	public int sizeHttpMethod() {
		return this.size(HTTP_METHOD);
	}

	// This attribute is an array, possibly empty
	public void setHttpMethod(java.lang.String[] value) {
		this.setValue(HTTP_METHOD, value);
	}

	//
	public java.lang.String[] getHttpMethod() {
		return (java.lang.String[])this.getValues(HTTP_METHOD);
	}

	// Add a new element returning its index in the list
	public int addHttpMethod(java.lang.String value) {
		int positionOfNewItem = this.addValue(HTTP_METHOD, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeHttpMethod(java.lang.String value) {
		return this.removeValue(HTTP_METHOD, value);
	}

	//
	public static void addComparator(org.netbeans.modules.schema2beans.BeanComparator c) {
		comparators.add(c);
	}

	//
	public static void removeComparator(org.netbeans.modules.schema2beans.BeanComparator c) {
		comparators.remove(c);
	}

	
                public String getKeyProperty() { return "WebResourceName"; }
            
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
		// Validating property webResourceName
		if (getWebResourceName() == null) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getWebResourceName() == null", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "webResourceName", this);	// NOI18N
		}
		// has whitespace restriction
		if (restrictionFailure) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getWebResourceName() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "webResourceName", this);	// NOI18N
		}
		// Validating property webResourceNameId
		if (getWebResourceNameId() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getWebResourceNameId() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "webResourceNameId", this);	// NOI18N
			}
		}
		// Validating property description
		// Validating property descriptionId
		// Validating property descriptionXmlLang
		// Validating property urlPattern
		if (sizeUrlPattern() == 0) {
			throw new org.netbeans.modules.schema2beans.ValidateException("sizeUrlPattern() == 0", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "urlPattern", this);	// NOI18N
		}
		// Validating property httpMethod
		for (int _index = 0; _index < sizeHttpMethod(); ++_index) {
			java.lang.String element = getHttpMethod(_index);
			if (element != null) {
				{
					boolean patternPassed = false;
					if ((element).matches("[!-~-[\\(\\)<>@,;:\"/\\[\\]?=\\{\\}\\\\\\p{Z}]]+")) {
						patternPassed = true;
					}
					restrictionFailure = !patternPassed;
				}
				if (restrictionFailure) {
					throw new org.netbeans.modules.schema2beans.ValidateException("element", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "httpMethod", this);	// NOI18N
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
		str.append("WebResourceName");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getWebResourceName();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(WEB_RESOURCE_NAME, 0, str, indent);

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
		str.append("UrlPattern["+this.sizeUrlPattern()+"]");	// NOI18N
		for(int i=0; i<this.sizeUrlPattern(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			str.append(indent+"\t");	// NOI18N
			str.append("<");	// NOI18N
			o = this.getUrlPattern(i);
			str.append((o==null?"null":o.toString().trim()));	// NOI18N
			str.append(">\n");	// NOI18N
			this.dumpAttributes(URL_PATTERN, i, str, indent);
		}

		str.append(indent);
		str.append("HttpMethod["+this.sizeHttpMethod()+"]");	// NOI18N
		for(int i=0; i<this.sizeHttpMethod(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			str.append(indent+"\t");	// NOI18N
			str.append("<");	// NOI18N
			o = this.getHttpMethod(i);
			str.append((o==null?"null":o.toString().trim()));	// NOI18N
			str.append(">\n");	// NOI18N
			this.dumpAttributes(HTTP_METHOD, i, str, indent);
		}

	}
	public String dumpBeanNode(){
		StringBuffer str = new StringBuffer();
		str.append("WebResourceCollection\n");	// NOI18N
		this.dump(str, "\n  ");	// NOI18N
		return str.toString();
	}}

// END_NOI18N

