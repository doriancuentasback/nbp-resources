/**
 *	This generated bean class WelcomeFileList matches the schema element 'welcome-file-listType'.
 *  The root bean class is WebApp
 *
 *	===============================================================
 *	
 *	
 *		The welcome-file-list contains an ordered list of welcome
 *		files elements.
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

public class WelcomeFileList extends org.netbeans.modules.schema2beans.BaseBean
	 implements  
                    org.netbeans.modules.j2ee.dd.api.web.WelcomeFileList
                
{

	static Vector comparators = new Vector();
	private static final org.netbeans.modules.schema2beans.Version runtimeVersion = new org.netbeans.modules.schema2beans.Version(5, 0, 0);
	;	// NOI18N

	static public final String ID = "Id";	// NOI18N
	static public final String WELCOME_FILE = "WelcomeFile";	// NOI18N

	public WelcomeFileList() {
		this(Common.USE_DEFAULT_VALUES);
	}

	public WelcomeFileList(int options)
	{
		super(comparators, runtimeVersion);
		// Properties (see root bean comments for the bean graph)
		initPropertyTables(1);
		this.createProperty("welcome-file", 	// NOI18N
			WELCOME_FILE, 
			Common.TYPE_1_N | Common.TYPE_STRING | Common.TYPE_KEY, 
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

	// This attribute is an array containing at least one element
	public void setWelcomeFile(int index, java.lang.String value) {
		this.setValue(WELCOME_FILE, index, value);
	}

	//
	public java.lang.String getWelcomeFile(int index) {
		return (java.lang.String)this.getValue(WELCOME_FILE, index);
	}

	// Return the number of properties
	public int sizeWelcomeFile() {
		return this.size(WELCOME_FILE);
	}

	// This attribute is an array containing at least one element
	public void setWelcomeFile(java.lang.String[] value) {
		this.setValue(WELCOME_FILE, value);
	}

	//
	public java.lang.String[] getWelcomeFile() {
		return (java.lang.String[])this.getValues(WELCOME_FILE);
	}

	// Add a new element returning its index in the list
	public int addWelcomeFile(java.lang.String value) {
		int positionOfNewItem = this.addValue(WELCOME_FILE, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeWelcomeFile(java.lang.String value) {
		return this.removeValue(WELCOME_FILE, value);
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
		// Validating property welcomeFile
		if (sizeWelcomeFile() == 0) {
			throw new org.netbeans.modules.schema2beans.ValidateException("sizeWelcomeFile() == 0", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "welcomeFile", this);	// NOI18N
		}
	}

	// Dump the content of this bean returning it as a String
	public void dump(StringBuffer str, String indent){
		String s;
		Object o;
		org.netbeans.modules.schema2beans.BaseBean n;
		str.append(indent);
		str.append("WelcomeFile["+this.sizeWelcomeFile()+"]");	// NOI18N
		for(int i=0; i<this.sizeWelcomeFile(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			str.append(indent+"\t");	// NOI18N
			str.append("<");	// NOI18N
			o = this.getWelcomeFile(i);
			str.append((o==null?"null":o.toString().trim()));	// NOI18N
			str.append(">\n");	// NOI18N
			this.dumpAttributes(WELCOME_FILE, i, str, indent);
		}

	}
	public String dumpBeanNode(){
		StringBuffer str = new StringBuffer();
		str.append("WelcomeFileList\n");	// NOI18N
		this.dump(str, "\n  ");	// NOI18N
		return str.toString();
	}}

// END_NOI18N

