/**
 *	This generated bean class InterceptorBinding matches the schema element 'interceptor-bindingType'.
 *  The root bean class is EjbJar
 *
 *	===============================================================
 *	
 *	
 *	        The interceptor-bindingType element describes the binding of
 *	        interceptor classes to beans within the ejb-jar.
 *	        It consists of :
 *	
 *	          - An optional description.
 *	          - The name of an ejb within the ejb-jar or the wildcard value "*",
 *	            which is used to define interceptors that are bound to all
 *	            beans in the ejb-jar.
 *	          - A list of interceptor classes that are bound to the contents of
 *	            the ejb-name element or a specification of the total ordering
 *	            over the interceptors defined for the given level and above.
 *	          - An optional exclude-default-interceptors element.  If set to true,
 *	            specifies that default interceptors are not to be applied to
 *	            a bean-class and/or business method.
 *	          - An optional exclude-class-interceptors element.  If set to true,
 *	            specifies that class interceptors are not to be applied to
 *	            a business method.
 *	          - An optional set of method elements for describing the name/params
 *	            of a method-level interceptor.
 *	
 *	         Interceptors bound to all classes using the wildcard syntax
 *	         "*" are default interceptors for the components in the ejb-jar.
 *	         In addition, interceptors may be bound at the level of the bean
 *	         class (class-level interceptors) or business methods (method-level
 *	         interceptors ).
 *	
 *	         The binding of interceptors to classes is additive.  If interceptors
 *	         are bound at the class-level and/or default-level as well as the
 *	         method-level, both class-level and/or default-level as well as
 *	         method-level will apply.
 *	
 *	         There are four possible styles of the interceptor element syntax :
 *	
 *	         1.
 *	         <xsd:interceptor-binding>
 *	           <xsd:ejb-name>*</xsd:ejb-name>
 *		
 *	           <xsd:interceptor-class>INTERCEPTOR</xsd:interceptor-class>
 *		
 *	         </xsd:interceptor-binding>
 *	
 *	
 *	         Specifying the ejb-name as the wildcard value "*" designates
 *	         default interceptors (interceptors that apply to all session and
 *	         message-driven beans contained in the ejb-jar).
 *	
 *	         2.
 *	         <xsd:interceptor-binding>
 *	           <xsd:ejb-name>EJBNAME</xsd:ejb-name>
 *		
 *	           <xsd:interceptor-class>INTERCEPTOR</xsd:interceptor-class>
 *		
 *	         </xsd:interceptor-binding>
 *	
 *	
 *	         This style is used to refer to interceptors associated with the
 *	         specified enterprise bean(class-level interceptors).
 *	
 *	         3.
 *	         <xsd:interceptor-binding>
 *	           <xsd:ejb-name>EJBNAME</xsd:ejb-name>
 *		
 *	           <xsd:interceptor-class>INTERCEPTOR</xsd:interceptor-class>
 *		
 *	           <xsd:method>
 *	             <xsd:method-name>METHOD</xsd:method-name>
 *			
 *	           </xsd:method>
 *		
 *	         </xsd:interceptor-binding>
 *	
 *	
 *	         This style is used to associate a method-level interceptor with
 *	         the specified enterprise bean.  If there are multiple methods
 *	         with the same overloaded name, the element of this style refers
 *	         to all the methods with the overloaded name.  Method-level
 *	         interceptors can only be associated with business methods of the
 *	         bean class.   Note that the wildcard value "*" cannot be used
 *	         to specify method-level interceptors.
 *	
 *	         4.
 *	         <xsd:interceptor-binding>
 *	           <xsd:ejb-name>EJBNAME</xsd:ejb-name>
 *		
 *	           <xsd:interceptor-class>INTERCEPTOR</xsd:interceptor-class>
 *		
 *	           <xsd:method>
 *	             <xsd:method-name>METHOD</xsd:method-name>
 *			
 *	             <xsd:method-params>
 *	               <xsd:method-param>PARAM-1</xsd:method-param>
 *				
 *	               <xsd:method-param>PARAM-2</xsd:method-param>
 *				
 *	               ...
 *	               <xsd:method-param>PARAM-N</xsd:method-param>
 *				
 *	             </xsd:method-params>
 *			
 *	           </xsd:method>
 *		
 *	         </xsd:interceptor-binding>
 *	
 *	
 *	         This style is used to associate a method-level interceptor with
 *	         the specified method of the specified enterprise bean.  This
 *	         style is used to refer to a single method within a set of methods
 *	         with an overloaded name.  The values PARAM-1 through PARAM-N
 *	         are the fully-qualified Java types of the method's input parameters
 *	         (if the method has no input arguments, the method-params element
 *	         contains no method-param elements). Arrays are specified by the
 *	         array element's type, followed by one or more pair of square
 *	         brackets (e.g. int[][]).
 *	
 *	      
 *	===============================================================
 * @Generated
 */

package org.netbeans.modules.j2ee.dd.impl.ejb.model_3_0;

import org.w3c.dom.*;
import org.netbeans.modules.schema2beans.*;
import java.beans.*;
import java.util.*;

// BEGIN_NOI18N

public class InterceptorBinding extends org.netbeans.modules.j2ee.dd.impl.common.DescriptionBeanMultiple
	 implements org.netbeans.modules.j2ee.dd.api.ejb.InterceptorBinding
{

	static Vector comparators = new Vector();
	private static final org.netbeans.modules.schema2beans.Version runtimeVersion = new org.netbeans.modules.schema2beans.Version(5, 0, 0);
	;	// NOI18N

	static public final String ID = "Id";	// NOI18N
	static public final String DESCRIPTION = "Description";	// NOI18N
	static public final String DESCRIPTIONID = "DescriptionId";	// NOI18N
	static public final String DESCRIPTIONXMLLANG = "DescriptionXmlLang";	// NOI18N
	static public final String EJB_NAME = "EjbName";	// NOI18N
	static public final String EJBNAMEID = "EjbNameId";	// NOI18N
	static public final String INTERCEPTOR_CLASS = "InterceptorClass";	// NOI18N
	static public final String INTERCEPTOR_ORDER = "InterceptorOrder";	// NOI18N
	static public final String EXCLUDE_DEFAULT_INTERCEPTORS = "ExcludeDefaultInterceptors";	// NOI18N
	static public final String EXCLUDE_CLASS_INTERCEPTORS = "ExcludeClassInterceptors";	// NOI18N
	static public final String METHOD = "Method";	// NOI18N

	public InterceptorBinding() {
		this(Common.USE_DEFAULT_VALUES);
	}

	public InterceptorBinding(int options)
	{
		super(comparators, runtimeVersion);
		// Properties (see root bean comments for the bean graph)
		initPropertyTables(7);
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
		this.createProperty("ejb-name", 	// NOI18N
			EJB_NAME, 
			Common.TYPE_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createAttribute(EJB_NAME, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("interceptor-class", 	// NOI18N
			INTERCEPTOR_CLASS, Common.SEQUENCE_OR | 
			Common.TYPE_0_N | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createProperty("interceptor-order", 	// NOI18N
			INTERCEPTOR_ORDER, Common.SEQUENCE_OR | 
			Common.TYPE_1 | Common.TYPE_BEAN | Common.TYPE_KEY, 
			InterceptorOrder.class);
		this.createAttribute(INTERCEPTOR_ORDER, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("exclude-default-interceptors", 	// NOI18N
			EXCLUDE_DEFAULT_INTERCEPTORS, 
			Common.TYPE_0_1 | Common.TYPE_BOOLEAN | Common.TYPE_SHOULD_NOT_BE_EMPTY | Common.TYPE_KEY, 
			Boolean.class);
		this.createProperty("exclude-class-interceptors", 	// NOI18N
			EXCLUDE_CLASS_INTERCEPTORS, 
			Common.TYPE_0_1 | Common.TYPE_BOOLEAN | Common.TYPE_SHOULD_NOT_BE_EMPTY | Common.TYPE_KEY, 
			Boolean.class);
		this.createProperty("method", 	// NOI18N
			METHOD, 
			Common.TYPE_0_1 | Common.TYPE_BEAN | Common.TYPE_KEY, 
			NamedMethod.class);
		this.createAttribute(METHOD, "id", "Id", 
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

	// This attribute is mandatory
	public void setEjbName(java.lang.String value) {
		this.setValue(EJB_NAME, value);
	}

	//
	public java.lang.String getEjbName() {
		return (java.lang.String)this.getValue(EJB_NAME);
	}

	// This attribute is optional
	public void setEjbNameId(java.lang.String value) {
		// Make sure we've got a place to put this attribute.
		if (size(EJB_NAME) == 0) {
			setValue(EJB_NAME, "");
		}
		setAttributeValue(EJB_NAME, "Id", value);
	}

	//
	public java.lang.String getEjbNameId() {
		// If our element does not exist, then the attribute does not exist.
		if (size(EJB_NAME) == 0) {
			return null;
		} else {
			return getAttributeValue(EJB_NAME, "Id");
		}
	}

	// This attribute is an array, possibly empty
	public void setInterceptorClass(int index, java.lang.String value) {
		this.setValue(INTERCEPTOR_CLASS, index, value);
	}

	//
	public java.lang.String getInterceptorClass(int index) {
		return (java.lang.String)this.getValue(INTERCEPTOR_CLASS, index);
	}

	// Return the number of properties
	public int sizeInterceptorClass() {
		return this.size(INTERCEPTOR_CLASS);
	}

	// This attribute is an array, possibly empty
	public void setInterceptorClass(java.lang.String[] value) {
		this.setValue(INTERCEPTOR_CLASS, value);
		if (value != null && value.length > 0) {
			// It's a mutually exclusive property.
			setInterceptorOrder(null);
		}
	}

	//
	public java.lang.String[] getInterceptorClass() {
		return (java.lang.String[])this.getValues(INTERCEPTOR_CLASS);
	}

	// Add a new element returning its index in the list
	public int addInterceptorClass(java.lang.String value) {
		int positionOfNewItem = this.addValue(INTERCEPTOR_CLASS, value);
		if (positionOfNewItem == 0) {
			// It's a mutually exclusive property.
			setInterceptorOrder(null);
		}
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeInterceptorClass(java.lang.String value) {
		return this.removeValue(INTERCEPTOR_CLASS, value);
	}

	// This attribute is mandatory
	public void setInterceptorOrder(org.netbeans.modules.j2ee.dd.api.ejb.InterceptorOrder valueInterface) {
		InterceptorOrder value = (InterceptorOrder) valueInterface;
		this.setValue(INTERCEPTOR_ORDER, value);
		if (value != null) {
			// It's a mutually exclusive property.
			setInterceptorClass(null);
		}
	}

	//
	public org.netbeans.modules.j2ee.dd.api.ejb.InterceptorOrder getInterceptorOrder() {
		return (InterceptorOrder)this.getValue(INTERCEPTOR_ORDER);
	}

	// This attribute is optional
	public void setExcludeDefaultInterceptors(boolean value) {
		this.setValue(EXCLUDE_DEFAULT_INTERCEPTORS, (value ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE));
	}

	//
	public boolean isExcludeDefaultInterceptors() {
		Boolean ret = (Boolean)this.getValue(EXCLUDE_DEFAULT_INTERCEPTORS);
		if (ret == null)
			ret = (Boolean)Common.defaultScalarValue(Common.TYPE_BOOLEAN);
		return ((java.lang.Boolean)ret).booleanValue();
	}

	// This attribute is optional
	public void setExcludeClassInterceptors(boolean value) {
		this.setValue(EXCLUDE_CLASS_INTERCEPTORS, (value ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE));
	}

	//
	public boolean isExcludeClassInterceptors() {
		Boolean ret = (Boolean)this.getValue(EXCLUDE_CLASS_INTERCEPTORS);
		if (ret == null)
			ret = (Boolean)Common.defaultScalarValue(Common.TYPE_BOOLEAN);
		return ((java.lang.Boolean)ret).booleanValue();
	}

	// This attribute is optional
	public void setMethod(org.netbeans.modules.j2ee.dd.api.ejb.NamedMethod valueInterface) {
		NamedMethod value = (NamedMethod) valueInterface;
		this.setValue(METHOD, value);
	}

	//
	public org.netbeans.modules.j2ee.dd.api.ejb.NamedMethod getMethod() {
		return (NamedMethod)this.getValue(METHOD);
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public org.netbeans.modules.j2ee.dd.api.ejb.InterceptorOrder newInterceptorOrder() {
		return new InterceptorOrder();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public org.netbeans.modules.j2ee.dd.api.ejb.NamedMethod newNamedMethod() {
		return new NamedMethod();
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
		// Validating property descriptionXmlLang
		// Validating property ejbName
		if (getEjbName() == null) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getEjbName() == null", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "ejbName", this);	// NOI18N
		}
		// has whitespace restriction
		if (restrictionFailure) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getEjbName() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "ejbName", this);	// NOI18N
		}
		// Validating property ejbNameId
		if (getEjbNameId() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getEjbNameId() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "ejbNameId", this);	// NOI18N
			}
		}
		// Validating property interceptorClass
		if (sizeInterceptorClass() > 0) {
			if (getInterceptorOrder() != null) {
				throw new org.netbeans.modules.schema2beans.ValidateException("mutually exclusive properties: InterceptorClass and InterceptorOrder", org.netbeans.modules.schema2beans.ValidateException.FailureType.MUTUALLY_EXCLUSIVE, "InterceptorOrder", this);	// NOI18N
			}
		}
		// Validating property interceptorOrder
		if (getInterceptorOrder() != null) {
			((InterceptorOrder)getInterceptorOrder()).validate();
		}
		if (getInterceptorOrder() != null) {
			if (sizeInterceptorClass() > 0) {
				throw new org.netbeans.modules.schema2beans.ValidateException("mutually exclusive properties: InterceptorOrder and InterceptorClass", org.netbeans.modules.schema2beans.ValidateException.FailureType.MUTUALLY_EXCLUSIVE, "InterceptorClass", this);	// NOI18N
			}
		}
		// Validating property excludeDefaultInterceptors
		{
			boolean patternPassed = false;
			if ((isExcludeDefaultInterceptors() ? "true" : "false").matches("(true|false)")) {
				patternPassed = true;
			}
			restrictionFailure = !patternPassed;
		}
		if (restrictionFailure) {
			throw new org.netbeans.modules.schema2beans.ValidateException("isExcludeDefaultInterceptors()", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "excludeDefaultInterceptors", this);	// NOI18N
		}
		// Validating property excludeClassInterceptors
		{
			boolean patternPassed = false;
			if ((isExcludeClassInterceptors() ? "true" : "false").matches("(true|false)")) {
				patternPassed = true;
			}
			restrictionFailure = !patternPassed;
		}
		if (restrictionFailure) {
			throw new org.netbeans.modules.schema2beans.ValidateException("isExcludeClassInterceptors()", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "excludeClassInterceptors", this);	// NOI18N
		}
		// Validating property method
		if (getMethod() != null) {
			((NamedMethod)getMethod()).validate();
		}
		if (getInterceptorOrder() == null && sizeInterceptorClass() == 0) {
			throw new org.netbeans.modules.schema2beans.ValidateException("required properties: getInterceptorOrder() == null && sizeInterceptorClass() == 0", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "InterceptorOrder", this);	// NOI18N
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
		str.append("EjbName");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getEjbName();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(EJB_NAME, 0, str, indent);

		str.append(indent);
		str.append("InterceptorClass["+this.sizeInterceptorClass()+"]");	// NOI18N
		for(int i=0; i<this.sizeInterceptorClass(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			str.append(indent+"\t");	// NOI18N
			str.append("<");	// NOI18N
			o = this.getInterceptorClass(i);
			str.append((o==null?"null":o.toString().trim()));	// NOI18N
			str.append(">\n");	// NOI18N
			this.dumpAttributes(INTERCEPTOR_CLASS, i, str, indent);
		}

		str.append(indent);
		str.append("InterceptorOrder");	// NOI18N
		n = (org.netbeans.modules.schema2beans.BaseBean) this.getInterceptorOrder();
		if (n != null)
			n.dump(str, indent + "\t");	// NOI18N
		else
			str.append(indent+"\tnull");	// NOI18N
		this.dumpAttributes(INTERCEPTOR_ORDER, 0, str, indent);

		str.append(indent);
		str.append("ExcludeDefaultInterceptors");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append((this.isExcludeDefaultInterceptors()?"true":"false"));
		this.dumpAttributes(EXCLUDE_DEFAULT_INTERCEPTORS, 0, str, indent);

		str.append(indent);
		str.append("ExcludeClassInterceptors");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append((this.isExcludeClassInterceptors()?"true":"false"));
		this.dumpAttributes(EXCLUDE_CLASS_INTERCEPTORS, 0, str, indent);

		str.append(indent);
		str.append("Method");	// NOI18N
		n = (org.netbeans.modules.schema2beans.BaseBean) this.getMethod();
		if (n != null)
			n.dump(str, indent + "\t");	// NOI18N
		else
			str.append(indent+"\tnull");	// NOI18N
		this.dumpAttributes(METHOD, 0, str, indent);

	}
	public String dumpBeanNode(){
		StringBuffer str = new StringBuffer();
		str.append("InterceptorBinding\n");	// NOI18N
		this.dump(str, "\n  ");	// NOI18N
		return str.toString();
	}}

// END_NOI18N

