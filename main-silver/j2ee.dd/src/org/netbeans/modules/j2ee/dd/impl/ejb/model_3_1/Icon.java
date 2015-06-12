/**
 *	This generated bean class Icon matches the schema element 'iconType'.
 *  The root bean class is EjbJar
 *
 *	===============================================================
 *	
 *	
 *	        The icon type contains small-icon and large-icon elements
 *	        that specify the file names for small and large GIF, JPEG,
 *	        or PNG icon images used to represent the parent element in a
 *	        GUI tool. 
 *	        
 *	        The xml:lang attribute defines the language that the
 *	        icon file names are provided in. Its value is "en" (English)
 *	        by default. 
 *	        
 *	      
 *	===============================================================
 * @Generated
 */

package org.netbeans.modules.j2ee.dd.impl.ejb.model_3_1;

import org.w3c.dom.*;
import org.netbeans.modules.schema2beans.*;
import java.beans.*;
import java.util.*;

// BEGIN_NOI18N

public class Icon extends org.netbeans.modules.j2ee.dd.impl.common.EnclosingBean
	 implements org.netbeans.modules.j2ee.dd.api.common.Icon
{

	static Vector comparators = new Vector();
	private static final org.netbeans.modules.schema2beans.Version runtimeVersion = new org.netbeans.modules.schema2beans.Version(5, 0, 0);
	;	// NOI18N

	static public final String XMLLANG = "XmlLang";	// NOI18N
	static public final String ID = "Id";	// NOI18N
	static public final String SMALL_ICON = "SmallIcon";	// NOI18N
	static public final String LARGE_ICON = "LargeIcon";	// NOI18N

	public Icon() {
		this(Common.USE_DEFAULT_VALUES);
	}

	public Icon(int options)
	{
		super(comparators, runtimeVersion);
		// Properties (see root bean comments for the bean graph)
		initPropertyTables(2);
		this.createProperty("small-icon", 	// NOI18N
			SMALL_ICON, 
			Common.TYPE_0_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createProperty("large-icon", 	// NOI18N
			LARGE_ICON, 
			Common.TYPE_0_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.initialize(options);
	}

	// Setting the default values of the properties
	void initialize(int options) {

	}

	// This attribute is optional
	public void setXmlLang(java.lang.String value) {
		setAttributeValue(XMLLANG, value);
	}

	//
	public java.lang.String getXmlLang() {
		return getAttributeValue(XMLLANG);
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
	public void setSmallIcon(java.lang.String value) {
		this.setValue(SMALL_ICON, value);
	}

	//
	public java.lang.String getSmallIcon() {
		return (java.lang.String)this.getValue(SMALL_ICON);
	}

	// This attribute is optional
	public void setLargeIcon(java.lang.String value) {
		this.setValue(LARGE_ICON, value);
	}

	//
	public java.lang.String getLargeIcon() {
		return (java.lang.String)this.getValue(LARGE_ICON);
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
		// Validating property xmlLang
		// Validating property id
		if (getId() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getId() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "id", this);	// NOI18N
			}
		}
		// Validating property smallIcon
		// Validating property largeIcon
	}

	// Dump the content of this bean returning it as a String
	public void dump(StringBuffer str, String indent){
		String s;
		Object o;
		org.netbeans.modules.schema2beans.BaseBean n;
		str.append(indent);
		str.append("SmallIcon");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getSmallIcon();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(SMALL_ICON, 0, str, indent);

		str.append(indent);
		str.append("LargeIcon");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getLargeIcon();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(LARGE_ICON, 0, str, indent);

	}
	public String dumpBeanNode(){
		StringBuffer str = new StringBuffer();
		str.append("Icon\n");	// NOI18N
		this.dump(str, "\n  ");	// NOI18N
		return str.toString();
	}}

// END_NOI18N

