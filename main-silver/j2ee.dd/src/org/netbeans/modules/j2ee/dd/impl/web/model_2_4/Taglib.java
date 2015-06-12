/**
 *	This generated bean class Taglib matches the schema element 'taglibType'.
 *  The root bean class is WebApp
 *
 *	===============================================================
 *	
 *	
 *		The taglibType defines the syntax for declaring in
 *		the deployment descriptor that a tag library is
 *		available to the application.  This can be done
 *		to override implicit map entries from TLD files and
 *		from the container.
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

public class Taglib extends org.netbeans.modules.schema2beans.BaseBean
	 implements  
                org.netbeans.modules.j2ee.dd.api.web.Taglib, org.netbeans.modules.j2ee.dd.impl.common.KeyBean
            
{

	static Vector comparators = new Vector();
	private static final org.netbeans.modules.schema2beans.Version runtimeVersion = new org.netbeans.modules.schema2beans.Version(5, 0, 0);
	;	// NOI18N

	static public final String ID = "Id";	// NOI18N
	static public final String TAGLIB_URI = "TaglibUri";	// NOI18N
	static public final String TAGLIBURIID = "TaglibUriId";	// NOI18N
	static public final String TAGLIB_LOCATION = "TaglibLocation";	// NOI18N

	public Taglib() {
		this(Common.USE_DEFAULT_VALUES);
	}

	public Taglib(int options)
	{
		super(comparators, runtimeVersion);
		// Properties (see root bean comments for the bean graph)
		initPropertyTables(2);
		this.createProperty("taglib-uri", 	// NOI18N
			TAGLIB_URI, 
			Common.TYPE_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createAttribute(TAGLIB_URI, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("taglib-location", 	// NOI18N
			TAGLIB_LOCATION, 
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
	public void setTaglibUri(java.lang.String value) {
		this.setValue(TAGLIB_URI, value);
	}

	//
	public java.lang.String getTaglibUri() {
		return (java.lang.String)this.getValue(TAGLIB_URI);
	}

	// This attribute is optional
	public void setTaglibUriId(java.lang.String value) {
		// Make sure we've got a place to put this attribute.
		if (size(TAGLIB_URI) == 0) {
			setValue(TAGLIB_URI, "");
		}
		setAttributeValue(TAGLIB_URI, "Id", value);
	}

	//
	public java.lang.String getTaglibUriId() {
		// If our element does not exist, then the attribute does not exist.
		if (size(TAGLIB_URI) == 0) {
			return null;
		} else {
			return getAttributeValue(TAGLIB_URI, "Id");
		}
	}

	// This attribute is mandatory
	public void setTaglibLocation(java.lang.String value) {
		this.setValue(TAGLIB_LOCATION, value);
	}

	//
	public java.lang.String getTaglibLocation() {
		return (java.lang.String)this.getValue(TAGLIB_LOCATION);
	}

	//
	public static void addComparator(org.netbeans.modules.schema2beans.BeanComparator c) {
		comparators.add(c);
	}

	//
	public static void removeComparator(org.netbeans.modules.schema2beans.BeanComparator c) {
		comparators.remove(c);
	}

	
                public String getKeyProperty() { return "TaglibUri"; }
            
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
		// Validating property taglibUri
		if (getTaglibUri() == null) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getTaglibUri() == null", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "taglibUri", this);	// NOI18N
		}
		// has whitespace restriction
		if (restrictionFailure) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getTaglibUri() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "taglibUri", this);	// NOI18N
		}
		// Validating property taglibUriId
		if (getTaglibUriId() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getTaglibUriId() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "taglibUriId", this);	// NOI18N
			}
		}
		// Validating property taglibLocation
		if (getTaglibLocation() == null) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getTaglibLocation() == null", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "taglibLocation", this);	// NOI18N
		}
	}

	// Dump the content of this bean returning it as a String
	public void dump(StringBuffer str, String indent){
		String s;
		Object o;
		org.netbeans.modules.schema2beans.BaseBean n;
		str.append(indent);
		str.append("TaglibUri");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getTaglibUri();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(TAGLIB_URI, 0, str, indent);

		str.append(indent);
		str.append("TaglibLocation");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getTaglibLocation();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(TAGLIB_LOCATION, 0, str, indent);

	}
	public String dumpBeanNode(){
		StringBuffer str = new StringBuffer();
		str.append("Taglib\n");	// NOI18N
		this.dump(str, "\n  ");	// NOI18N
		return str.toString();
	}}

// END_NOI18N

