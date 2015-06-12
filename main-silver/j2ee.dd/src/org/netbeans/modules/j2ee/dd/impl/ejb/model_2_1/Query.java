/**
 *	This generated bean class Query matches the schema element 'queryType'.
 *  The root bean class is EjbJar
 *
 *	===============================================================
 *	
 *	
 *		The queryType defines a finder or select
 *		query. It contains
 *		    - an optional description of the query
 *		    - the specification of the finder or select
 *		      method it is used by
 *			- an optional specification of the result type
 *			  mapping, if the query is for a select method
 *			  and entity objects are returned.
 *			- the EJB QL query string that defines the query.
 *	
 *		Queries that are expressible in EJB QL must use the ejb-ql
 *		element to specify the query. If a query is not expressible
 *		in EJB QL, the description element should be used to
 *		describe the semantics of the query and the ejb-ql element
 *		should be empty.
 *	
 *		The result-type-mapping is an optional element. It can only
 *		be present if the query-method specifies a select method
 *		that returns entity objects.  The default value for the
 *		result-type-mapping element is "Local".
 *	
 *	      
 *	===============================================================
 * @Generated
 */

package org.netbeans.modules.j2ee.dd.impl.ejb.model_2_1;

import org.w3c.dom.*;
import org.netbeans.modules.schema2beans.*;
import java.beans.*;
import java.util.*;

// BEGIN_NOI18N

public class Query extends org.netbeans.modules.j2ee.dd.impl.common.DescriptionBeanSingle
	 implements org.netbeans.modules.j2ee.dd.api.ejb.Query
{

	static Vector comparators = new Vector();
	private static final org.netbeans.modules.schema2beans.Version runtimeVersion = new org.netbeans.modules.schema2beans.Version(5, 0, 0);
	;	// NOI18N

	static public final String ID = "Id";	// NOI18N
	static public final String DESCRIPTION = "Description";	// NOI18N
	static public final String DESCRIPTIONID = "DescriptionId";	// NOI18N
	static public final String DESCRIPTIONXMLLANG = "DescriptionXmlLang";	// NOI18N
	static public final String QUERY_METHOD = "QueryMethod";	// NOI18N
	static public final String RESULT_TYPE_MAPPING = "ResultTypeMapping";	// NOI18N
	static public final String EJB_QL = "EjbQl";	// NOI18N
	static public final String EJBQLID = "EjbQlId";	// NOI18N

	public Query() {
		this(Common.USE_DEFAULT_VALUES);
	}

	public Query(int options)
	{
		super(comparators, runtimeVersion);
		// Properties (see root bean comments for the bean graph)
		initPropertyTables(4);
		this.createProperty("description", 	// NOI18N
			DESCRIPTION, 
			Common.TYPE_0_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createAttribute(DESCRIPTION, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createAttribute(DESCRIPTION, "xml:lang", "XmlLang", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("query-method", 	// NOI18N
			QUERY_METHOD, 
			Common.TYPE_1 | Common.TYPE_BEAN | Common.TYPE_KEY, 
			QueryMethod.class);
		this.createAttribute(QUERY_METHOD, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("result-type-mapping", 	// NOI18N
			RESULT_TYPE_MAPPING, 
			Common.TYPE_0_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createProperty("ejb-ql", 	// NOI18N
			EJB_QL, 
			Common.TYPE_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createAttribute(EJB_QL, "id", "Id", 
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

	// This attribute is optional
	public void setDescription(java.lang.String value) {
		this.setValue(DESCRIPTION, value);
	}

	//
	public java.lang.String getDescription() {
		return (java.lang.String)this.getValue(DESCRIPTION);
	}

	// This attribute is optional
	public void setDescriptionId(java.lang.String value) {
		// Make sure we've got a place to put this attribute.
		if (size(DESCRIPTION) == 0) {
			setValue(DESCRIPTION, "");
		}
		setAttributeValue(DESCRIPTION, "Id", value);
	}

	//
	public java.lang.String getDescriptionId() {
		// If our element does not exist, then the attribute does not exist.
		if (size(DESCRIPTION) == 0) {
			return null;
		} else {
			return getAttributeValue(DESCRIPTION, "Id");
		}
	}

	// This attribute is optional
	public void setDescriptionXmlLang(java.lang.String value) {
		// Make sure we've got a place to put this attribute.
		if (size(DESCRIPTION) == 0) {
			setValue(DESCRIPTION, "");
		}
		setAttributeValue(DESCRIPTION, "XmlLang", value);
	}

	//
	public java.lang.String getDescriptionXmlLang() {
		// If our element does not exist, then the attribute does not exist.
		if (size(DESCRIPTION) == 0) {
			return null;
		} else {
			return getAttributeValue(DESCRIPTION, "XmlLang");
		}
	}

	// This attribute is mandatory
	public void setQueryMethod(org.netbeans.modules.j2ee.dd.api.ejb.QueryMethod valueInterface) {
		QueryMethod value = (QueryMethod) valueInterface;
		this.setValue(QUERY_METHOD, value);
	}

	//
	public org.netbeans.modules.j2ee.dd.api.ejb.QueryMethod getQueryMethod() {
		return (QueryMethod)this.getValue(QUERY_METHOD);
	}

	// This attribute is optional
	public void setResultTypeMapping(java.lang.String value) {
		this.setValue(RESULT_TYPE_MAPPING, value);
	}

	//
	public java.lang.String getResultTypeMapping() {
		return (java.lang.String)this.getValue(RESULT_TYPE_MAPPING);
	}

	// This attribute is mandatory
	public void setEjbQl(java.lang.String value) {
		this.setValue(EJB_QL, value);
	}

	//
	public java.lang.String getEjbQl() {
		return (java.lang.String)this.getValue(EJB_QL);
	}

	// This attribute is optional
	public void setEjbQlId(java.lang.String value) {
		// Make sure we've got a place to put this attribute.
		if (size(EJB_QL) == 0) {
			setValue(EJB_QL, "");
		}
		setAttributeValue(EJB_QL, "Id", value);
	}

	//
	public java.lang.String getEjbQlId() {
		// If our element does not exist, then the attribute does not exist.
		if (size(EJB_QL) == 0) {
			return null;
		} else {
			return getAttributeValue(EJB_QL, "Id");
		}
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public org.netbeans.modules.j2ee.dd.api.ejb.QueryMethod newQueryMethod() {
		return new QueryMethod();
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
		// Validating property description
		// Validating property descriptionId
		if (getDescriptionId() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getDescriptionId() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "descriptionId", this);	// NOI18N
			}
		}
		// Validating property descriptionXmlLang
		// Validating property queryMethod
		if (getQueryMethod() == null) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getQueryMethod() == null", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "queryMethod", this);	// NOI18N
		}
		((QueryMethod)getQueryMethod()).validate();
		// Validating property resultTypeMapping
		if (getResultTypeMapping() != null) {
			final java.lang.String[] enumRestrictionResultTypeMapping = {"Local", "Remote"};
			restrictionFailure = true;
			for (int _index2 = 0; 
				_index2 < enumRestrictionResultTypeMapping.length; ++_index2) {
				if (enumRestrictionResultTypeMapping[_index2].equals(getResultTypeMapping())) {
					restrictionFailure = false;
					break;
				}
			}
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getResultTypeMapping() enumeration test", org.netbeans.modules.schema2beans.ValidateException.FailureType.ENUM_RESTRICTION, "resultTypeMapping", this);	// NOI18N
			}
		}
		// Validating property ejbQl
		if (getEjbQl() == null) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getEjbQl() == null", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "ejbQl", this);	// NOI18N
		}
		// Validating property ejbQlId
		if (getEjbQlId() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getEjbQlId() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "ejbQlId", this);	// NOI18N
			}
		}
	}

	// Dump the content of this bean returning it as a String
	public void dump(StringBuffer str, String indent){
		String s;
		Object o;
		org.netbeans.modules.schema2beans.BaseBean n;
		str.append(indent);
		str.append("Description");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getDescription();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(DESCRIPTION, 0, str, indent);

		str.append(indent);
		str.append("QueryMethod");	// NOI18N
		n = (org.netbeans.modules.schema2beans.BaseBean) this.getQueryMethod();
		if (n != null)
			n.dump(str, indent + "\t");	// NOI18N
		else
			str.append(indent+"\tnull");	// NOI18N
		this.dumpAttributes(QUERY_METHOD, 0, str, indent);

		str.append(indent);
		str.append("ResultTypeMapping");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getResultTypeMapping();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(RESULT_TYPE_MAPPING, 0, str, indent);

		str.append(indent);
		str.append("EjbQl");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getEjbQl();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(EJB_QL, 0, str, indent);

	}
	public String dumpBeanNode(){
		StringBuffer str = new StringBuffer();
		str.append("Query\n");	// NOI18N
		this.dump(str, "\n  ");	// NOI18N
		return str.toString();
	}}

// END_NOI18N

