/**
 *	This generated bean class LocaleEncodingMappingList matches the schema element 'locale-encoding-mapping-listType'.
 *  The root bean class is WebApp
 *
 *	===============================================================
 *	
 *	
 *		The locale-encoding-mapping-list contains one or more
 *		locale-encoding-mapping(s).
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

public class LocaleEncodingMappingList extends org.netbeans.modules.j2ee.dd.impl.common.EnclosingBean
	 implements  
                    org.netbeans.modules.j2ee.dd.api.web.LocaleEncodingMappingList
                
{

	static Vector comparators = new Vector();
	static{
		LocaleEncodingMappingList.addComparator(new org.netbeans.modules.j2ee.dd.impl.common.Comparator());
	}
	private static final org.netbeans.modules.schema2beans.Version runtimeVersion = new org.netbeans.modules.schema2beans.Version(5, 0, 0);
	;	// NOI18N

	static public final String ID = "Id";	// NOI18N
	static public final String LOCALE_ENCODING_MAPPING = "LocaleEncodingMapping";	// NOI18N

	public LocaleEncodingMappingList() {
		this(Common.USE_DEFAULT_VALUES);
	}

	public LocaleEncodingMappingList(int options)
	{
		super(comparators, runtimeVersion);
		// Properties (see root bean comments for the bean graph)
		initPropertyTables(1);
		this.createProperty("locale-encoding-mapping", 	// NOI18N
			LOCALE_ENCODING_MAPPING, 
			Common.TYPE_1_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			LocaleEncodingMapping.class);
		this.createAttribute(LOCALE_ENCODING_MAPPING, "id", "Id", 
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

	// This attribute is an array containing at least one element
	public void setLocaleEncodingMapping(int index,  
                org.netbeans.modules.j2ee.dd.api.web.LocaleEncodingMapping valueInterface) {
		LocaleEncodingMapping value = (LocaleEncodingMapping) valueInterface;
		this.setValue(LOCALE_ENCODING_MAPPING, index, value);
	}

	//
	public  
                org.netbeans.modules.j2ee.dd.api.web.LocaleEncodingMapping getLocaleEncodingMapping(int index) {
		return (LocaleEncodingMapping)this.getValue(LOCALE_ENCODING_MAPPING, index);
	}

	// Return the number of properties
	public int sizeLocaleEncodingMapping() {
		return this.size(LOCALE_ENCODING_MAPPING);
	}

	// This attribute is an array containing at least one element
	public void setLocaleEncodingMapping( 
                org.netbeans.modules.j2ee.dd.api.web.LocaleEncodingMapping[] value) {
		this.setValue(LOCALE_ENCODING_MAPPING, value);
	}

	//
	public  
                org.netbeans.modules.j2ee.dd.api.web.LocaleEncodingMapping[] getLocaleEncodingMapping() {
		return (LocaleEncodingMapping[])this.getValues(LOCALE_ENCODING_MAPPING);
	}

	// Add a new element returning its index in the list
	public int addLocaleEncodingMapping( 
                org.netbeans.modules.j2ee.dd.api.web.LocaleEncodingMapping valueInterface) {
		LocaleEncodingMapping value = (LocaleEncodingMapping) valueInterface;
		int positionOfNewItem = this.addValue(LOCALE_ENCODING_MAPPING, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeLocaleEncodingMapping( 
                org.netbeans.modules.j2ee.dd.api.web.LocaleEncodingMapping valueInterface) {
		LocaleEncodingMapping value = (LocaleEncodingMapping) valueInterface;
		return this.removeValue(LOCALE_ENCODING_MAPPING, value);
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public org.netbeans.modules.j2ee.dd.api.web.LocaleEncodingMapping newLocaleEncodingMapping() {
		return new LocaleEncodingMapping();
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
		// Validating property localeEncodingMapping
		if (sizeLocaleEncodingMapping() == 0) {
			throw new org.netbeans.modules.schema2beans.ValidateException("sizeLocaleEncodingMapping() == 0", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "localeEncodingMapping", this);	// NOI18N
		}
		for (int _index = 0; _index < sizeLocaleEncodingMapping(); 
			++_index) {
			org.netbeans.modules.j2ee.dd.impl.web.model_2_4.LocaleEncodingMapping element = (org.netbeans.modules.j2ee.dd.impl.web.model_2_4.LocaleEncodingMapping) getLocaleEncodingMapping(_index);
			if (element != null) {
				((LocaleEncodingMapping)element).validate();
			}
		}
	}

	// Dump the content of this bean returning it as a String
	public void dump(StringBuffer str, String indent){
		String s;
		Object o;
		org.netbeans.modules.schema2beans.BaseBean n;
		str.append(indent);
		str.append("LocaleEncodingMapping["+this.sizeLocaleEncodingMapping()+"]");	// NOI18N
		for(int i=0; i<this.sizeLocaleEncodingMapping(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getLocaleEncodingMapping(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(LOCALE_ENCODING_MAPPING, i, str, indent);
		}

	}
	public String dumpBeanNode(){
		StringBuffer str = new StringBuffer();
		str.append("LocaleEncodingMappingList\n");	// NOI18N
		this.dump(str, "\n  ");	// NOI18N
		return str.toString();
	}}

// END_NOI18N

