/**
 *	This generated bean class MimeMapping matches the schema element 'mime-mappingType'.
 *  The root bean class is WebApp
 *
 *	===============================================================
 *	
 *	
 *		The mime-mappingType defines a mapping between an extension
 *		and a mime type.
 *	
 *		Used in: web-app
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

public class MimeMapping extends org.netbeans.modules.schema2beans.BaseBean
	 implements  
                org.netbeans.modules.j2ee.dd.api.web.MimeMapping, org.netbeans.modules.j2ee.dd.impl.common.KeyBean
            
{

	static Vector comparators = new Vector();
	private static final org.netbeans.modules.schema2beans.Version runtimeVersion = new org.netbeans.modules.schema2beans.Version(5, 0, 0);
	;	// NOI18N

	static public final String ID = "Id";	// NOI18N
	static public final String EXTENSION = "Extension";	// NOI18N
	static public final String EXTENSIONID = "ExtensionId";	// NOI18N
	static public final String MIME_TYPE = "MimeType";	// NOI18N

	public MimeMapping() {
		this(Common.USE_DEFAULT_VALUES);
	}

	public MimeMapping(int options)
	{
		super(comparators, runtimeVersion);
		// Properties (see root bean comments for the bean graph)
		initPropertyTables(2);
		this.createProperty("extension", 	// NOI18N
			EXTENSION, 
			Common.TYPE_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createAttribute(EXTENSION, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("mime-type", 	// NOI18N
			MIME_TYPE, 
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
	public void setExtension(java.lang.String value) {
		this.setValue(EXTENSION, value);
	}

	//
	public java.lang.String getExtension() {
		return (java.lang.String)this.getValue(EXTENSION);
	}

	// This attribute is optional
	public void setExtensionId(java.lang.String value) {
		// Make sure we've got a place to put this attribute.
		if (size(EXTENSION) == 0) {
			setValue(EXTENSION, "");
		}
		setAttributeValue(EXTENSION, "Id", value);
	}

	//
	public java.lang.String getExtensionId() {
		// If our element does not exist, then the attribute does not exist.
		if (size(EXTENSION) == 0) {
			return null;
		} else {
			return getAttributeValue(EXTENSION, "Id");
		}
	}

	// This attribute is mandatory
	public void setMimeType(java.lang.String value) {
		this.setValue(MIME_TYPE, value);
	}

	//
	public java.lang.String getMimeType() {
		return (java.lang.String)this.getValue(MIME_TYPE);
	}

	//
	public static void addComparator(org.netbeans.modules.schema2beans.BeanComparator c) {
		comparators.add(c);
	}

	//
	public static void removeComparator(org.netbeans.modules.schema2beans.BeanComparator c) {
		comparators.remove(c);
	}

	
                public String getKeyProperty() { return "Extension"; }
            
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
		// Validating property extension
		if (getExtension() == null) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getExtension() == null", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "extension", this);	// NOI18N
		}
		// has whitespace restriction
		if (restrictionFailure) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getExtension() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "extension", this);	// NOI18N
		}
		// Validating property extensionId
		if (getExtensionId() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getExtensionId() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "extensionId", this);	// NOI18N
			}
		}
		// Validating property mimeType
		if (getMimeType() == null) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getMimeType() == null", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "mimeType", this);	// NOI18N
		}
		{
			boolean patternPassed = false;
			if ((getMimeType()).matches("[^\\p{Cc}^\\s]+/[^\\p{Cc}^\\s]+")) {
				patternPassed = true;
			}
			restrictionFailure = !patternPassed;
		}
		if (restrictionFailure) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getMimeType()", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "mimeType", this);	// NOI18N
		}
	}

	// Dump the content of this bean returning it as a String
	public void dump(StringBuffer str, String indent){
		String s;
		Object o;
		org.netbeans.modules.schema2beans.BaseBean n;
		str.append(indent);
		str.append("Extension");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getExtension();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(EXTENSION, 0, str, indent);

		str.append(indent);
		str.append("MimeType");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getMimeType();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(MIME_TYPE, 0, str, indent);

	}
	public String dumpBeanNode(){
		StringBuffer str = new StringBuffer();
		str.append("MimeMapping\n");	// NOI18N
		this.dump(str, "\n  ");	// NOI18N
		return str.toString();
	}}

// END_NOI18N

