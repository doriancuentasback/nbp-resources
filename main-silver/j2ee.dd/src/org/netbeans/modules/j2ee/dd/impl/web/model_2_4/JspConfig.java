/**
 *	This generated bean class JspConfig matches the schema element 'jsp-configType'.
 *  The root bean class is WebApp
 *
 *	===============================================================
 *	
 *	
 *		The jsp-configType is used to provide global configuration
 *		information for the JSP files in a web application. It has
 *		two subelements, taglib and jsp-property-group.
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

public class JspConfig extends org.netbeans.modules.j2ee.dd.impl.common.EnclosingBean
	 implements  
                    org.netbeans.modules.j2ee.dd.api.web.JspConfig
                
{

	static Vector comparators = new Vector();
	static{
		JspConfig.addComparator(new org.netbeans.modules.j2ee.dd.impl.common.Comparator());
	}
	private static final org.netbeans.modules.schema2beans.Version runtimeVersion = new org.netbeans.modules.schema2beans.Version(5, 0, 0);
	;	// NOI18N

	static public final String ID = "Id";	// NOI18N
	static public final String TAGLIB = "Taglib";	// NOI18N
	static public final String JSP_PROPERTY_GROUP = "JspPropertyGroup";	// NOI18N

	public JspConfig() {
		this(Common.USE_DEFAULT_VALUES);
	}

	public JspConfig(int options)
	{
		super(comparators, runtimeVersion);
		// Properties (see root bean comments for the bean graph)
		initPropertyTables(2);
		this.createProperty("taglib", 	// NOI18N
			TAGLIB, 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			Taglib.class);
		this.createAttribute(TAGLIB, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("jsp-property-group", 	// NOI18N
			JSP_PROPERTY_GROUP, 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			JspPropertyGroup.class);
		this.createAttribute(JSP_PROPERTY_GROUP, "id", "Id", 
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
	public void setTaglib(int index,  
                org.netbeans.modules.j2ee.dd.api.web.Taglib valueInterface) {
		Taglib value = (Taglib) valueInterface;
		this.setValue(TAGLIB, index, value);
	}

	//
	public  
                org.netbeans.modules.j2ee.dd.api.web.Taglib getTaglib(int index) {
		return (Taglib)this.getValue(TAGLIB, index);
	}

	// Return the number of properties
	public int sizeTaglib() {
		return this.size(TAGLIB);
	}

	// This attribute is an array, possibly empty
	public void setTaglib( 
                org.netbeans.modules.j2ee.dd.api.web.Taglib[] value) {
		this.setValue(TAGLIB, value);
	}

	//
	public  
                org.netbeans.modules.j2ee.dd.api.web.Taglib[] getTaglib() {
		return (Taglib[])this.getValues(TAGLIB);
	}

	// Add a new element returning its index in the list
	public int addTaglib( 
                org.netbeans.modules.j2ee.dd.api.web.Taglib valueInterface) {
		Taglib value = (Taglib) valueInterface;
		int positionOfNewItem = this.addValue(TAGLIB, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeTaglib( 
                org.netbeans.modules.j2ee.dd.api.web.Taglib valueInterface) {
		Taglib value = (Taglib) valueInterface;
		return this.removeValue(TAGLIB, value);
	}

	// This attribute is an array, possibly empty
	public void setJspPropertyGroup(int index,  
                    org.netbeans.modules.j2ee.dd.api.web.JspPropertyGroup
                 valueInterface) {
		JspPropertyGroup value = (JspPropertyGroup) valueInterface;
		this.setValue(JSP_PROPERTY_GROUP, index, value);
	}

	//
	public  
                    org.netbeans.modules.j2ee.dd.api.web.JspPropertyGroup
                 getJspPropertyGroup(int index) {
		return (JspPropertyGroup)this.getValue(JSP_PROPERTY_GROUP, index);
	}

	// Return the number of properties
	public int sizeJspPropertyGroup() {
		return this.size(JSP_PROPERTY_GROUP);
	}

	// This attribute is an array, possibly empty
	public void setJspPropertyGroup( 
                    org.netbeans.modules.j2ee.dd.api.web.JspPropertyGroup
                [] value) {
		this.setValue(JSP_PROPERTY_GROUP, value);
	}

	//
	public  
                    org.netbeans.modules.j2ee.dd.api.web.JspPropertyGroup
                [] getJspPropertyGroup() {
		return (JspPropertyGroup[])this.getValues(JSP_PROPERTY_GROUP);
	}

	// Add a new element returning its index in the list
	public int addJspPropertyGroup( 
                    org.netbeans.modules.j2ee.dd.api.web.JspPropertyGroup
                 valueInterface) {
		JspPropertyGroup value = (JspPropertyGroup) valueInterface;
		int positionOfNewItem = this.addValue(JSP_PROPERTY_GROUP, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeJspPropertyGroup( 
                    org.netbeans.modules.j2ee.dd.api.web.JspPropertyGroup
                 valueInterface) {
		JspPropertyGroup value = (JspPropertyGroup) valueInterface;
		return this.removeValue(JSP_PROPERTY_GROUP, value);
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public org.netbeans.modules.j2ee.dd.api.web.Taglib newTaglib() {
		return new Taglib();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public org.netbeans.modules.j2ee.dd.api.web.JspPropertyGroup newJspPropertyGroup() {
		return new JspPropertyGroup();
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
		// Validating property taglib
		for (int _index = 0; _index < sizeTaglib(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.web.model_2_4.Taglib element = (org.netbeans.modules.j2ee.dd.impl.web.model_2_4.Taglib) getTaglib(_index);
			if (element != null) {
				((Taglib)element).validate();
			}
		}
		// Validating property jspPropertyGroup
		for (int _index = 0; _index < sizeJspPropertyGroup(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.web.model_2_4.JspPropertyGroup element = (org.netbeans.modules.j2ee.dd.impl.web.model_2_4.JspPropertyGroup) getJspPropertyGroup(_index);
			if (element != null) {
				((JspPropertyGroup)element).validate();
			}
		}
	}

	// Dump the content of this bean returning it as a String
	public void dump(StringBuffer str, String indent){
		String s;
		Object o;
		org.netbeans.modules.schema2beans.BaseBean n;
		str.append(indent);
		str.append("Taglib["+this.sizeTaglib()+"]");	// NOI18N
		for(int i=0; i<this.sizeTaglib(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getTaglib(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(TAGLIB, i, str, indent);
		}

		str.append(indent);
		str.append("JspPropertyGroup["+this.sizeJspPropertyGroup()+"]");	// NOI18N
		for(int i=0; i<this.sizeJspPropertyGroup(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getJspPropertyGroup(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(JSP_PROPERTY_GROUP, i, str, indent);
		}

	}
	public String dumpBeanNode(){
		StringBuffer str = new StringBuffer();
		str.append("JspConfig\n");	// NOI18N
		this.dump(str, "\n  ");	// NOI18N
		return str.toString();
	}}

// END_NOI18N

