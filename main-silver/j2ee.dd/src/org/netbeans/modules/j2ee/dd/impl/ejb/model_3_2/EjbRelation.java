/**
 *	This generated bean class EjbRelation matches the schema element 'ejb-relationType'.
 *  The root bean class is EjbJar
 *
 *	===============================================================
 *	
 *	
 *	        The ejb-relationType describes a relationship between two
 *	        entity beans with container-managed persistence.  It is used
 *	        by ejb-relation elements. It contains a description; an
 *	        optional ejb-relation-name element; and exactly two
 *	        relationship role declarations, defined by the
 *	        ejb-relationship-role elements. The name of the
 *	        relationship, if specified, is unique within the ejb-jar
 *	        file.
 *	        
 *	        Support for entity beans is optional as of EJB 3.2.
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

public class EjbRelation extends org.netbeans.modules.j2ee.dd.impl.common.DescriptionBeanMultiple
	 implements org.netbeans.modules.j2ee.dd.api.ejb.EjbRelation
{

	static Vector comparators = new Vector();
	private static final org.netbeans.modules.schema2beans.Version runtimeVersion = new org.netbeans.modules.schema2beans.Version(5, 0, 0);
	;	// NOI18N

	static public final String ID = "Id";	// NOI18N
	static public final String DESCRIPTION = "Description";	// NOI18N
	static public final String DESCRIPTIONID = "DescriptionId";	// NOI18N
	static public final String DESCRIPTIONXMLLANG = "DescriptionXmlLang";	// NOI18N
	static public final String EJB_RELATION_NAME = "EjbRelationName";	// NOI18N
	static public final String EJBRELATIONNAMEID = "EjbRelationNameId";	// NOI18N
	static public final String EJB_RELATIONSHIP_ROLE = "EjbRelationshipRole";	// NOI18N

	public EjbRelation() {
		this(Common.USE_DEFAULT_VALUES);
	}

	public EjbRelation(int options)
	{
		super(comparators, runtimeVersion);
		// Properties (see root bean comments for the bean graph)
		initPropertyTables(3);
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
		this.createProperty("ejb-relation-name", 	// NOI18N
			EJB_RELATION_NAME, 
			Common.TYPE_0_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createAttribute(EJB_RELATION_NAME, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("ejb-relationship-role", 	// NOI18N
			EJB_RELATIONSHIP_ROLE, 
			Common.TYPE_1_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			EjbRelationshipRole.class);
		this.createAttribute(EJB_RELATIONSHIP_ROLE, "id", "Id", 
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

	// This attribute is optional
	public void setEjbRelationName(java.lang.String value) {
		this.setValue(EJB_RELATION_NAME, value);
	}

	//
	public java.lang.String getEjbRelationName() {
		return (java.lang.String)this.getValue(EJB_RELATION_NAME);
	}

	// This attribute is optional
	public void setEjbRelationNameId(java.lang.String value) {
		// Make sure we've got a place to put this attribute.
		if (size(EJB_RELATION_NAME) == 0) {
			setValue(EJB_RELATION_NAME, "");
		}
		setAttributeValue(EJB_RELATION_NAME, "Id", value);
	}

	//
	public java.lang.String getEjbRelationNameId() {
		// If our element does not exist, then the attribute does not exist.
		if (size(EJB_RELATION_NAME) == 0) {
			return null;
		} else {
			return getAttributeValue(EJB_RELATION_NAME, "Id");
		}
	}

	// This attribute is an array containing at least one element
	public void setEjbRelationshipRole(int index, org.netbeans.modules.j2ee.dd.api.ejb.EjbRelationshipRole valueInterface) {
		EjbRelationshipRole value = (EjbRelationshipRole) valueInterface;
		this.setValue(EJB_RELATIONSHIP_ROLE, index, value);
	}

	//
	public org.netbeans.modules.j2ee.dd.api.ejb.EjbRelationshipRole getEjbRelationshipRole(int index) {
		return (EjbRelationshipRole)this.getValue(EJB_RELATIONSHIP_ROLE, index);
	}

	// Return the number of properties
	public int sizeEjbRelationshipRole() {
		return this.size(EJB_RELATIONSHIP_ROLE);
	}

	// This attribute is an array containing at least one element
	public void setEjbRelationshipRole(org.netbeans.modules.j2ee.dd.api.ejb.EjbRelationshipRole value) {
		this.setValue(EJB_RELATIONSHIP_ROLE, 0, value);
	}

	//
	public org.netbeans.modules.j2ee.dd.api.ejb.EjbRelationshipRole getEjbRelationshipRole() {
		return (EjbRelationshipRole)this.getValue(EJB_RELATIONSHIP_ROLE, 0);
	}

	// Add a new element returning its index in the list
	public int addEjbRelationshipRole(org.netbeans.modules.j2ee.dd.api.ejb.EjbRelationshipRole valueInterface) {
		EjbRelationshipRole value = (EjbRelationshipRole) valueInterface;
		int positionOfNewItem = this.addValue(EJB_RELATIONSHIP_ROLE, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeEjbRelationshipRole(org.netbeans.modules.j2ee.dd.api.ejb.EjbRelationshipRole valueInterface) {
		EjbRelationshipRole value = (EjbRelationshipRole) valueInterface;
		return this.removeValue(EJB_RELATIONSHIP_ROLE, value);
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public org.netbeans.modules.j2ee.dd.api.ejb.EjbRelationshipRole newEjbRelationshipRole() {
		return new EjbRelationshipRole();
	}

	//
	public static void addComparator(org.netbeans.modules.schema2beans.BeanComparator c) {
		comparators.add(c);
	}

	//
	public static void removeComparator(org.netbeans.modules.schema2beans.BeanComparator c) {
		comparators.remove(c);
	}

	
                    @Override
                    public void setEjbRelationshipRole2(org.netbeans.modules.j2ee.dd.api.ejb.EjbRelationshipRole value) {
                        this.setValue(EJB_RELATIONSHIP_ROLE, 1, value);
                    }

                    @Override
                    public org.netbeans.modules.j2ee.dd.api.ejb.EjbRelationshipRole getEjbRelationshipRole2() {
                        return (EjbRelationshipRole)this.getValue(EJB_RELATIONSHIP_ROLE, 1);
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
		// Validating property ejbRelationName
		if (getEjbRelationName() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getEjbRelationName() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "ejbRelationName", this);	// NOI18N
			}
		}
		// Validating property ejbRelationNameId
		if (getEjbRelationNameId() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getEjbRelationNameId() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "ejbRelationNameId", this);	// NOI18N
			}
		}
		// Validating property ejbRelationshipRole
		if (sizeEjbRelationshipRole() == 0) {
			throw new org.netbeans.modules.schema2beans.ValidateException("sizeEjbRelationshipRole() == 0", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "ejbRelationshipRole", this);	// NOI18N
		}
		if (sizeEjbRelationshipRole() > 2) {
			restrictionFailure = true;
		}
		if (restrictionFailure) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getEjbRelationshipRole() maxOccurs (2)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "ejbRelationshipRole", this);	// NOI18N
		}
		if (sizeEjbRelationshipRole() < 2) {
			restrictionFailure = true;
		}
		if (restrictionFailure) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getEjbRelationshipRole() minOccurs (2)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "ejbRelationshipRole", this);	// NOI18N
		}
		for (int _index = 0; _index < sizeEjbRelationshipRole(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2.EjbRelationshipRole element = (org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2.EjbRelationshipRole) getEjbRelationshipRole(_index);
			if (element != null) {
				((EjbRelationshipRole)element).validate();
			}
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
		str.append("EjbRelationName");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getEjbRelationName();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(EJB_RELATION_NAME, 0, str, indent);

		str.append(indent);
		str.append("EjbRelationshipRole["+this.sizeEjbRelationshipRole()+"]");	// NOI18N
		for(int i=0; i<this.sizeEjbRelationshipRole(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getEjbRelationshipRole(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(EJB_RELATIONSHIP_ROLE, i, str, indent);
		}

	}
	public String dumpBeanNode(){
		StringBuffer str = new StringBuffer();
		str.append("EjbRelation\n");	// NOI18N
		this.dump(str, "\n  ");	// NOI18N
		return str.toString();
	}}

// END_NOI18N

