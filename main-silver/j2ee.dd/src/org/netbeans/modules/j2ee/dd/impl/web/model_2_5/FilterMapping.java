/**
 *	This generated bean class FilterMapping matches the schema element 'filter-mappingType'.
 *  The root bean class is WebApp
 *
 *	===============================================================
 *	
 *	
 *		Declaration of the filter mappings in this web
 *		application is done by using filter-mappingType.
 *		The container uses the filter-mapping
 *		declarations to decide which filters to apply to a request,
 *		and in what order. The container matches the request URI to
 *		a Servlet in the normal way. To determine which filters to
 *		apply it matches filter-mapping declarations either on
 *		servlet-name, or on url-pattern for each filter-mapping
 *		element, depending on which style is used. The order in
 *		which filters are invoked is the order in which
 *		filter-mapping declarations that match a request URI for a
 *		servlet appear in the list of filter-mapping elements.The
 *		filter-name value must be the value of the filter-name
 *		sub-elements of one of the filter declarations in the
 *		deployment descriptor.
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

public class FilterMapping extends org.netbeans.modules.schema2beans.BaseBean
	 implements  
                    org.netbeans.modules.j2ee.dd.api.web.FilterMapping
                
{

	static Vector comparators = new Vector();
	private static final org.netbeans.modules.schema2beans.Version runtimeVersion = new org.netbeans.modules.schema2beans.Version(5, 0, 0);
	;	// NOI18N

	static public final String ID = "Id";	// NOI18N
	static public final String FILTER_NAME = "FilterName";	// NOI18N
	static public final String URL_PATTERN = "UrlPattern";	// NOI18N
	static public final String SERVLET_NAME = "ServletName";	// NOI18N
	static public final String DISPATCHER = "Dispatcher";	// NOI18N

	public FilterMapping() {
		this(Common.USE_DEFAULT_VALUES);
	}

	public FilterMapping(int options)
	{
		super(comparators, runtimeVersion);
		// Properties (see root bean comments for the bean graph)
		initPropertyTables(4);
		this.createProperty("filter-name", 	// NOI18N
			FILTER_NAME, 
			Common.TYPE_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createProperty("url-pattern", 	// NOI18N
			URL_PATTERN, Common.SEQUENCE_OR | 
			Common.TYPE_1_N | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createProperty("servlet-name", 	// NOI18N
			SERVLET_NAME, Common.SEQUENCE_OR | 
			Common.TYPE_1_N | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createProperty("dispatcher", 	// NOI18N
			DISPATCHER, 
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
	public void setFilterName(java.lang.String value) {
		this.setValue(FILTER_NAME, value);
	}

	//
	public java.lang.String getFilterName() {
		return (java.lang.String)this.getValue(FILTER_NAME);
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
	public void setUrlPatterns(java.lang.String[] value) {
		this.setValue(URL_PATTERN, value);
	}

	//
	public java.lang.String[] getUrlPatterns() {
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

	// This attribute is an array containing at least one element
	public void setServletName(int index, java.lang.String value) {
		this.setValue(SERVLET_NAME, index, value);
	}

	//
	public java.lang.String getServletName(int index) {
		return (java.lang.String)this.getValue(SERVLET_NAME, index);
	}

	// Return the number of properties
	public int sizeServletName() {
		return this.size(SERVLET_NAME);
	}

	// This attribute is an array containing at least one element
	public void setServletNames(java.lang.String[] value) {
		this.setValue(SERVLET_NAME, value);
	}

	//
	public java.lang.String[] getServletNames() {
		return (java.lang.String[])this.getValues(SERVLET_NAME);
	}

	// Add a new element returning its index in the list
	public int addServletName(java.lang.String value) {
		int positionOfNewItem = this.addValue(SERVLET_NAME, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeServletName(java.lang.String value) {
		return this.removeValue(SERVLET_NAME, value);
	}

	// This attribute is an array, possibly empty
	public void setDispatcher(int index, java.lang.String value) {
		this.setValue(DISPATCHER, index, value);
	}

	//
	public java.lang.String getDispatcher(int index) {
		return (java.lang.String)this.getValue(DISPATCHER, index);
	}

	// Return the number of properties
	public int sizeDispatcher() {
		return this.size(DISPATCHER);
	}

	// This attribute is an array, possibly empty
	public void setDispatcher(java.lang.String[] value) {
		this.setValue(DISPATCHER, value);
	}

	//
	public java.lang.String[] getDispatcher() {
		return (java.lang.String[])this.getValues(DISPATCHER);
	}

	// Add a new element returning its index in the list
	public int addDispatcher(java.lang.String value) {
		int positionOfNewItem = this.addValue(DISPATCHER, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeDispatcher(java.lang.String value) {
		return this.removeValue(DISPATCHER, value);
	}

	//
	public static void addComparator(org.netbeans.modules.schema2beans.BeanComparator c) {
		comparators.add(c);
	}

	//
	public static void removeComparator(org.netbeans.modules.schema2beans.BeanComparator c) {
		comparators.remove(c);
	}

	
public String getServletName() {
    return this.sizeServletName() > 0 ? (String)this.getValue(SERVLET_NAME, 0) : null;
}

public void setServletName(String value) {
    setServletNames(value != null ? new String[]{value} : new String[]{});
}

public String getUrlPattern() {
    return this.sizeUrlPattern() > 0 ? (String)this.getValue(URL_PATTERN, 0) : null;
}

public void setUrlPattern(String value) {
    setUrlPatterns(value != null ? new String[]{value} : new String[]{});
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
		// Validating property filterName
		if (getFilterName() == null) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getFilterName() == null", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "filterName", this);	// NOI18N
		}
		if ((getFilterName()).length() < 1) {
			restrictionFailure = true;
		}
		if (restrictionFailure) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getFilterName() minLength (1)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "filterName", this);	// NOI18N
		}
		// Validating property urlPattern
		if (sizeUrlPattern() > 0) {
		}
		// Validating property servletName
		for (int _index = 0; _index < sizeServletName(); ++_index) {
			java.lang.String element = getServletName(_index);
			if (element != null) {
				if ((element).length() < 1) {
					restrictionFailure = true;
				}
				if (restrictionFailure) {
					throw new org.netbeans.modules.schema2beans.ValidateException("element minLength (1)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "servletName", this);	// NOI18N
				}
			}
		}
		if (sizeServletName() > 0) {
		}
		// Validating property dispatcher
		if (sizeDispatcher() > 4) {
			restrictionFailure = true;
		}
		if (restrictionFailure) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getDispatcher() maxOccurs (4)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "dispatcher", this);	// NOI18N
		}
		for (int _index = 0; _index < sizeDispatcher(); ++_index) {
			java.lang.String element = getDispatcher(_index);
			if (element != null) {
				final java.lang.String[] enumRestrictionDispatcher = {"FORWARD", "INCLUDE", "REQUEST", "ERROR"};
				restrictionFailure = true;
				for (int _index2 = 0; 
					_index2 < enumRestrictionDispatcher.length; ++_index2) {
					if (enumRestrictionDispatcher[_index2].equals(element)) {
						restrictionFailure = false;
						break;
					}
				}
				if (restrictionFailure) {
					throw new org.netbeans.modules.schema2beans.ValidateException("element enumeration test", org.netbeans.modules.schema2beans.ValidateException.FailureType.ENUM_RESTRICTION, "dispatcher", this);	// NOI18N
				}
			}
		}
		if (sizeUrlPattern() == 0) {
			throw new org.netbeans.modules.schema2beans.ValidateException("required properties: sizeUrlPattern() == 0", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "UrlPattern", this);	// NOI18N
		}
		if (sizeServletName() == 0) {
			throw new org.netbeans.modules.schema2beans.ValidateException("required properties: sizeServletName() == 0", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "ServletName", this);	// NOI18N
		}
	}

	// Dump the content of this bean returning it as a String
	public void dump(StringBuffer str, String indent){
		String s;
		Object o;
		org.netbeans.modules.schema2beans.BaseBean n;
		str.append(indent);
		str.append("FilterName");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getFilterName();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(FILTER_NAME, 0, str, indent);

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
		str.append("ServletName["+this.sizeServletName()+"]");	// NOI18N
		for(int i=0; i<this.sizeServletName(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			str.append(indent+"\t");	// NOI18N
			str.append("<");	// NOI18N
			o = this.getServletName(i);
			str.append((o==null?"null":o.toString().trim()));	// NOI18N
			str.append(">\n");	// NOI18N
			this.dumpAttributes(SERVLET_NAME, i, str, indent);
		}

		str.append(indent);
		str.append("Dispatcher["+this.sizeDispatcher()+"]");	// NOI18N
		for(int i=0; i<this.sizeDispatcher(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			str.append(indent+"\t");	// NOI18N
			str.append("<");	// NOI18N
			o = this.getDispatcher(i);
			str.append((o==null?"null":o.toString().trim()));	// NOI18N
			str.append(">\n");	// NOI18N
			this.dumpAttributes(DISPATCHER, i, str, indent);
		}

	}
	public String dumpBeanNode(){
		StringBuffer str = new StringBuffer();
		str.append("FilterMapping\n");	// NOI18N
		this.dump(str, "\n  ");	// NOI18N
		return str.toString();
	}}

// END_NOI18N

