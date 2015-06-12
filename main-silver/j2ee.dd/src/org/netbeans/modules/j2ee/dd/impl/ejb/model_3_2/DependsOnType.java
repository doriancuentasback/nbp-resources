/**
 *	This generated bean class DependsOnType matches the schema element 'depends-onType'.
 *  The root bean class is EjbJar
 *
 *	===============================================================
 *	
 *	
 *	        The depends-onType is used to express initialization 
 *	        ordering dependencies between Singleton components.
 *	        The depends-onType specifies the names of one or more
 *	        Singleton beans in the same application as the referring
 *	        Singleton, each of which must be initialized before
 *	        the referring bean.  
 *	        
 *	        Each dependent bean is expressed using ejb-link syntax.
 *	        The order in which dependent beans are initialized at 
 *	        runtime is not guaranteed to match the order in which
 *	        they are listed.
 *	        
 *	      
 *	===============================================================
 * @Generated
 */

package org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2;

import org.w3c.dom.*;
import org.netbeans.modules.schema2beans.*;
import java.beans.*;
import java.util.*;

// BEGIN_NOI18N

public class DependsOnType extends org.netbeans.modules.schema2beans.BaseBean
{

	static Vector comparators = new Vector();
	private static final org.netbeans.modules.schema2beans.Version runtimeVersion = new org.netbeans.modules.schema2beans.Version(5, 0, 0);
	;	// NOI18N

	static public final String ID = "Id";	// NOI18N
	static public final String EJB_NAME = "EjbName";	// NOI18N

	public DependsOnType() {
		this(Common.USE_DEFAULT_VALUES);
	}

	public DependsOnType(int options)
	{
		super(comparators, runtimeVersion);
		// Properties (see root bean comments for the bean graph)
		initPropertyTables(1);
		this.createProperty("ejb-name", 	// NOI18N
			EJB_NAME, 
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
	public void setEjbName(int index, java.lang.String value) {
		this.setValue(EJB_NAME, index, value);
	}

	//
	public java.lang.String getEjbName(int index) {
		return (java.lang.String)this.getValue(EJB_NAME, index);
	}

	// Return the number of properties
	public int sizeEjbName() {
		return this.size(EJB_NAME);
	}

	// This attribute is an array containing at least one element
	public void setEjbName(java.lang.String[] value) {
		this.setValue(EJB_NAME, value);
	}

	//
	public java.lang.String[] getEjbName() {
		return (java.lang.String[])this.getValues(EJB_NAME);
	}

	// Add a new element returning its index in the list
	public int addEjbName(java.lang.String value) {
		int positionOfNewItem = this.addValue(EJB_NAME, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeEjbName(java.lang.String value) {
		return this.removeValue(EJB_NAME, value);
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
		// Validating property ejbName
		if (sizeEjbName() == 0) {
			throw new org.netbeans.modules.schema2beans.ValidateException("sizeEjbName() == 0", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "ejbName", this);	// NOI18N
		}
	}

	// Dump the content of this bean returning it as a String
	public void dump(StringBuffer str, String indent){
		String s;
		Object o;
		org.netbeans.modules.schema2beans.BaseBean n;
		str.append(indent);
		str.append("EjbName["+this.sizeEjbName()+"]");	// NOI18N
		for(int i=0; i<this.sizeEjbName(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			str.append(indent+"\t");	// NOI18N
			str.append("<");	// NOI18N
			o = this.getEjbName(i);
			str.append((o==null?"null":o.toString().trim()));	// NOI18N
			str.append(">\n");	// NOI18N
			this.dumpAttributes(EJB_NAME, i, str, indent);
		}

	}
	public String dumpBeanNode(){
		StringBuffer str = new StringBuffer();
		str.append("DependsOnType\n");	// NOI18N
		this.dump(str, "\n  ");	// NOI18N
		return str.toString();
	}}

// END_NOI18N

