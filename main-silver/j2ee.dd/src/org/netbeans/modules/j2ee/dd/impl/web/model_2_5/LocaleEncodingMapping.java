/**
 *	This generated bean class LocaleEncodingMapping matches the schema element 'locale-encoding-mappingType'.
 *  The root bean class is WebApp
 *
 *	===============================================================
 *	
 *	
 *		The locale-encoding-mapping contains locale name and
 *		encoding name. The locale name must be either "Language-code",
 *		such as "ja", defined by ISO-639 or "Language-code_Country-code",
 *		such as "ja_JP".  "Country code" is defined by ISO-3166.
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

public class LocaleEncodingMapping extends org.netbeans.modules.schema2beans.BaseBean
	 implements  
                org.netbeans.modules.j2ee.dd.api.web.LocaleEncodingMapping, org.netbeans.modules.j2ee.dd.impl.common.KeyBean
            
{

	static Vector comparators = new Vector();
	private static final org.netbeans.modules.schema2beans.Version runtimeVersion = new org.netbeans.modules.schema2beans.Version(5, 0, 0);
	;	// NOI18N

	static public final String ID = "Id";	// NOI18N
	static public final String LOCALE = "Locale";	// NOI18N
	static public final String ENCODING = "Encoding";	// NOI18N

	public LocaleEncodingMapping() {
		this(Common.USE_DEFAULT_VALUES);
	}

	public LocaleEncodingMapping(int options)
	{
		super(comparators, runtimeVersion);
		// Properties (see root bean comments for the bean graph)
		initPropertyTables(2);
		this.createProperty("locale", 	// NOI18N
			LOCALE, 
			Common.TYPE_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createProperty("encoding", 	// NOI18N
			ENCODING, 
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
	public void setLocale(java.lang.String value) {
		this.setValue(LOCALE, value);
	}

	//
	public java.lang.String getLocale() {
		return (java.lang.String)this.getValue(LOCALE);
	}

	// This attribute is mandatory
	public void setEncoding(java.lang.String value) {
		this.setValue(ENCODING, value);
	}

	//
	public java.lang.String getEncoding() {
		return (java.lang.String)this.getValue(ENCODING);
	}

	//
	public static void addComparator(org.netbeans.modules.schema2beans.BeanComparator c) {
		comparators.add(c);
	}

	//
	public static void removeComparator(org.netbeans.modules.schema2beans.BeanComparator c) {
		comparators.remove(c);
	}

	
                public String getKeyProperty() { return "Locale"; }
            
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
		// Validating property locale
		if (getLocale() == null) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getLocale() == null", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "locale", this);	// NOI18N
		}
		{
			boolean patternPassed = false;
			if ((getLocale()).matches("[a-z]{2}(_|-)?([\\p{L}\\-\\p{Nd}]{2})?")) {
				patternPassed = true;
			}
			restrictionFailure = !patternPassed;
		}
		if (restrictionFailure) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getLocale()", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "locale", this);	// NOI18N
		}
		// Validating property encoding
		if (getEncoding() == null) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getEncoding() == null", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "encoding", this);	// NOI18N
		}
		{
			boolean patternPassed = false;
			if ((getEncoding()).matches("[^\\s]+")) {
				patternPassed = true;
			}
			restrictionFailure = !patternPassed;
		}
		if (restrictionFailure) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getEncoding()", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "encoding", this);	// NOI18N
		}
	}

	// Dump the content of this bean returning it as a String
	public void dump(StringBuffer str, String indent){
		String s;
		Object o;
		org.netbeans.modules.schema2beans.BaseBean n;
		str.append(indent);
		str.append("Locale");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getLocale();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(LOCALE, 0, str, indent);

		str.append(indent);
		str.append("Encoding");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getEncoding();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(ENCODING, 0, str, indent);

	}
	public String dumpBeanNode(){
		StringBuffer str = new StringBuffer();
		str.append("LocaleEncodingMapping\n");	// NOI18N
		this.dump(str, "\n  ");	// NOI18N
		return str.toString();
	}}

// END_NOI18N

