/**
 *	This generated bean class ServletMapping matches the schema element 'servlet-mappingType'.
 *  The root bean class is WebApp
 *
 *	===============================================================
 *	
 *	
 *		The servlet-mappingType defines a mapping between a
 *		servlet and a url pattern.
 *	
 *		Used in: web-app
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

public class ServletMapping extends org.netbeans.modules.schema2beans.BaseBean
	 implements  
                org.netbeans.modules.j2ee.dd.api.web.ServletMapping25, org.netbeans.modules.j2ee.dd.impl.common.KeyBean
            
{

	static Vector comparators = new Vector();
	private static final org.netbeans.modules.schema2beans.Version runtimeVersion = new org.netbeans.modules.schema2beans.Version(5, 0, 0);
	;	// NOI18N

	static public final String ID = "Id";	// NOI18N
	static public final String SERVLET_NAME = "ServletName";	// NOI18N
	static public final String URL_PATTERN = "UrlPattern";	// NOI18N

	public ServletMapping() {
		this(Common.USE_DEFAULT_VALUES);
	}

	public ServletMapping(int options)
	{
		super(comparators, runtimeVersion);
		// Properties (see root bean comments for the bean graph)
		initPropertyTables(2);
		this.createProperty("servlet-name", 	// NOI18N
			SERVLET_NAME, 
			Common.TYPE_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createProperty("url-pattern", 	// NOI18N
			URL_PATTERN, 
			Common.TYPE_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
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
	public void setServletName(java.lang.String value) {
		this.setValue(SERVLET_NAME, value);
	}

	//
	public java.lang.String getServletName() {
		return (java.lang.String)this.getValue(SERVLET_NAME);
	}

	// This attribute is mandatory
	public void setUrlPattern(java.lang.String value) {
		this.setValue(URL_PATTERN, value);
	}

	//
	public java.lang.String getUrlPattern() {
		return (java.lang.String)this.getValue(URL_PATTERN);
	}

	//
	public static void addComparator(org.netbeans.modules.schema2beans.BeanComparator c) {
		comparators.add(c);
	}

	//
	public static void removeComparator(org.netbeans.modules.schema2beans.BeanComparator c) {
		comparators.remove(c);
	}

	
                public String getKeyProperty() { return "UrlPattern"; }

                public void setUrlPattern(int index, String value) {
                    setUrlPattern(value);
                }

                public String getUrlPattern(int index) {
                    return getUrlPattern();
                }

                public void setUrlPatterns(String[] value) {
                    setUrlPattern(value[0]);
                }

                public String[] getUrlPatterns() {
                    return new String[]{getUrlPattern()};
                }

                public int sizeUrlPattern() {
                    return 1;
                }

                public int addUrlPattern(String value) {
                    setUrlPattern(value);
                    return 0;
                }

                public int removeUrlPattern(String value) {
                  return -1;
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
		// Validating property urlPattern
		if (getUrlPattern() == null) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getUrlPattern() == null", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "urlPattern", this);	// NOI18N
		}
	}

	// Dump the content of this bean returning it as a String
	public void dump(StringBuffer str, String indent){
		String s;
		Object o;
		org.netbeans.modules.schema2beans.BaseBean n;
		str.append(indent);
		str.append("ServletName");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getServletName();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(SERVLET_NAME, 0, str, indent);

		str.append(indent);
		str.append("UrlPattern");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getUrlPattern();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(URL_PATTERN, 0, str, indent);

	}
	public String dumpBeanNode(){
		StringBuffer str = new StringBuffer();
		str.append("ServletMapping\n");	// NOI18N
		this.dump(str, "\n  ");	// NOI18N
		return str.toString();
	}}

// END_NOI18N

