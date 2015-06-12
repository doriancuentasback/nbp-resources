/**
 *	This generated bean class EjbRelationshipRole matches the schema element 'ejb-relationship-roleType'.
 *  The root bean class is EjbJar
 *
 *	===============================================================
 *	
 *		
 *	
 *		  The ejb-relationship-roleType describes a role within a
 *		  relationship. There are two roles in each relationship.
 *	
 *		  The ejb-relationship-roleType contains an optional
 *		  description; an optional name for the relationship role; a
 *		  specification of the multiplicity of the role; an optional
 *		  specification of cascade-delete functionality for the role;
 *		  the role source; and a declaration of the cmr-field, if any,
 *		  by means of which the other side of the relationship is
 *		  accessed from the perspective of the role source.
 *	
 *		  The multiplicity and role-source element are mandatory.
 *	
 *		  The relationship-role-source element designates an entity
 *		  bean by means of an ejb-name element. For bidirectional
 *		  relationships, both roles of a relationship must declare a
 *		  relationship-role-source element that specifies a cmr-field
 *		  in terms of which the relationship is accessed. The lack of
 *		  a cmr-field element in an ejb-relationship-role specifies
 *		  that the relationship is unidirectional in navigability and
 *		  the entity bean that participates in the relationship is
 *		  "not aware" of the relationship.
 *	
 *		  Example:
 *	
 *		  <ejb-relation>
 *		      <ejb-relation-name>Product-LineItem</ejb-relation-name>
 *		      <ejb-relationship-role>
 *			  <ejb-relationship-role-name>product-has-lineitems
 *			  </ejb-relationship-role-name>
 *			  <multiplicity>One</multiplicity>
 *			  <relationship-role-source>
 *			  <ejb-name>ProductEJB</ejb-name>
 *			  </relationship-role-source>
 *		       </ejb-relationship-role>
 *		  </ejb-relation>
 *	
 *		  
 *	      
 *	===============================================================
 * @Generated
 */

package org.netbeans.modules.j2ee.dd.impl.ejb.model_2_1;

import org.w3c.dom.*;
import org.netbeans.modules.schema2beans.*;
import java.beans.*;
import java.util.*;

// BEGIN_NOI18N

public class EjbRelationshipRole extends org.netbeans.modules.j2ee.dd.impl.common.DescriptionBeanMultiple
	 implements org.netbeans.modules.j2ee.dd.api.ejb.EjbRelationshipRole
{

	static Vector comparators = new Vector();
	private static final org.netbeans.modules.schema2beans.Version runtimeVersion = new org.netbeans.modules.schema2beans.Version(5, 0, 0);
	;	// NOI18N

	static public final String ID = "Id";	// NOI18N
	static public final String DESCRIPTION = "Description";	// NOI18N
	static public final String DESCRIPTIONID = "DescriptionId";	// NOI18N
	static public final String DESCRIPTIONXMLLANG = "DescriptionXmlLang";	// NOI18N
	static public final String EJB_RELATIONSHIP_ROLE_NAME = "EjbRelationshipRoleName";	// NOI18N
	static public final String EJBRELATIONSHIPROLENAMEID = "EjbRelationshipRoleNameId";	// NOI18N
	static public final String MULTIPLICITY = "Multiplicity";	// NOI18N
	static public final String CASCADE_DELETE = "CascadeDelete";	// NOI18N
	static public final String CASCADEDELETEID = "CascadeDeleteId";	// NOI18N
	static public final String RELATIONSHIP_ROLE_SOURCE = "RelationshipRoleSource";	// NOI18N
	static public final String CMR_FIELD = "CmrField";	// NOI18N

	public EjbRelationshipRole() {
		this(Common.USE_DEFAULT_VALUES);
	}

	public EjbRelationshipRole(int options)
	{
		super(comparators, runtimeVersion);
		// Properties (see root bean comments for the bean graph)
		initPropertyTables(6);
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
		this.createProperty("ejb-relationship-role-name", 	// NOI18N
			EJB_RELATIONSHIP_ROLE_NAME, 
			Common.TYPE_0_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createAttribute(EJB_RELATIONSHIP_ROLE_NAME, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("multiplicity", 	// NOI18N
			MULTIPLICITY, 
			Common.TYPE_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createProperty("cascade-delete", 	// NOI18N
			CASCADE_DELETE, 
			Common.TYPE_0_1 | Common.TYPE_BOOLEAN | Common.TYPE_KEY, 
			Boolean.class);
		this.createAttribute(CASCADE_DELETE, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("relationship-role-source", 	// NOI18N
			RELATIONSHIP_ROLE_SOURCE, 
			Common.TYPE_1 | Common.TYPE_BEAN | Common.TYPE_KEY, 
			RelationshipRoleSource.class);
		this.createAttribute(RELATIONSHIP_ROLE_SOURCE, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("cmr-field", 	// NOI18N
			CMR_FIELD, 
			Common.TYPE_0_1 | Common.TYPE_BEAN | Common.TYPE_KEY, 
			CmrField.class);
		this.createAttribute(CMR_FIELD, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.initialize(options);
	}

	// Setting the default values of the properties
	void initialize(int options) {
		if ((options & Common.USE_DEFAULT_VALUES) == Common.USE_DEFAULT_VALUES) {
			setMultiplicity("One");
		}

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
	public void setEjbRelationshipRoleName(java.lang.String value) {
		this.setValue(EJB_RELATIONSHIP_ROLE_NAME, value);
	}

	//
	public java.lang.String getEjbRelationshipRoleName() {
		return (java.lang.String)this.getValue(EJB_RELATIONSHIP_ROLE_NAME);
	}

	// This attribute is optional
	public void setEjbRelationshipRoleNameId(java.lang.String value) {
		// Make sure we've got a place to put this attribute.
		if (size(EJB_RELATIONSHIP_ROLE_NAME) == 0) {
			setValue(EJB_RELATIONSHIP_ROLE_NAME, "");
		}
		setAttributeValue(EJB_RELATIONSHIP_ROLE_NAME, "Id", value);
	}

	//
	public java.lang.String getEjbRelationshipRoleNameId() {
		// If our element does not exist, then the attribute does not exist.
		if (size(EJB_RELATIONSHIP_ROLE_NAME) == 0) {
			return null;
		} else {
			return getAttributeValue(EJB_RELATIONSHIP_ROLE_NAME, "Id");
		}
	}

	// This attribute is mandatory
	public void setMultiplicity(java.lang.String value) {
		this.setValue(MULTIPLICITY, value);
	}

	//
	public java.lang.String getMultiplicity() {
		return (java.lang.String)this.getValue(MULTIPLICITY);
	}

	// This attribute is optional
	public void setCascadeDelete(boolean value) {
		this.setValue(CASCADE_DELETE, (value ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE));
	}

	//
	public boolean isCascadeDelete() {
		Boolean ret = (Boolean)this.getValue(CASCADE_DELETE);
		if (ret == null)
			ret = (Boolean)Common.defaultScalarValue(Common.TYPE_BOOLEAN);
		return ((java.lang.Boolean)ret).booleanValue();
	}

	// This attribute is optional
	public void setCascadeDeleteId(java.lang.String value) {
		// Make sure we've got a place to put this attribute.
		if (size(CASCADE_DELETE) == 0) {
			setValue(CASCADE_DELETE, java.lang.Boolean.TRUE);
		}
		setAttributeValue(CASCADE_DELETE, "Id", value);
	}

	//
	public java.lang.String getCascadeDeleteId() {
		// If our element does not exist, then the attribute does not exist.
		if (size(CASCADE_DELETE) == 0) {
			return null;
		} else {
			return getAttributeValue(CASCADE_DELETE, "Id");
		}
	}

	// This attribute is mandatory
	public void setRelationshipRoleSource(org.netbeans.modules.j2ee.dd.api.ejb.RelationshipRoleSource valueInterface) {
		RelationshipRoleSource value = (RelationshipRoleSource) valueInterface;
		this.setValue(RELATIONSHIP_ROLE_SOURCE, value);
	}

	//
	public org.netbeans.modules.j2ee.dd.api.ejb.RelationshipRoleSource getRelationshipRoleSource() {
		return (RelationshipRoleSource)this.getValue(RELATIONSHIP_ROLE_SOURCE);
	}

	// This attribute is optional
	public void setCmrField(org.netbeans.modules.j2ee.dd.api.ejb.CmrField valueInterface) {
		CmrField value = (CmrField) valueInterface;
		this.setValue(CMR_FIELD, value);
	}

	//
	public org.netbeans.modules.j2ee.dd.api.ejb.CmrField getCmrField() {
		return (CmrField)this.getValue(CMR_FIELD);
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public org.netbeans.modules.j2ee.dd.api.ejb.RelationshipRoleSource newRelationshipRoleSource() {
		return new RelationshipRoleSource();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public org.netbeans.modules.j2ee.dd.api.ejb.CmrField newCmrField() {
		return new CmrField();
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
		// Validating property ejbRelationshipRoleName
		if (getEjbRelationshipRoleName() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getEjbRelationshipRoleName() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "ejbRelationshipRoleName", this);	// NOI18N
			}
		}
		// Validating property ejbRelationshipRoleNameId
		if (getEjbRelationshipRoleNameId() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getEjbRelationshipRoleNameId() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "ejbRelationshipRoleNameId", this);	// NOI18N
			}
		}
		// Validating property multiplicity
		if (getMultiplicity() == null) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getMultiplicity() == null", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "multiplicity", this);	// NOI18N
		}
		final java.lang.String[] enumRestrictionMultiplicity = {"One", "Many"};
		restrictionFailure = true;
		for (int _index2 = 0; 
			_index2 < enumRestrictionMultiplicity.length; ++_index2) {
			if (enumRestrictionMultiplicity[_index2].equals(getMultiplicity())) {
				restrictionFailure = false;
				break;
			}
		}
		if (restrictionFailure) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getMultiplicity() enumeration test", org.netbeans.modules.schema2beans.ValidateException.FailureType.ENUM_RESTRICTION, "multiplicity", this);	// NOI18N
		}
		// Validating property cascadeDelete
		// Validating property cascadeDeleteId
		if (getCascadeDeleteId() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getCascadeDeleteId() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "cascadeDeleteId", this);	// NOI18N
			}
		}
		// Validating property relationshipRoleSource
		if (getRelationshipRoleSource() == null) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getRelationshipRoleSource() == null", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "relationshipRoleSource", this);	// NOI18N
		}
		((RelationshipRoleSource)getRelationshipRoleSource()).validate();
		// Validating property cmrField
		if (getCmrField() != null) {
			((CmrField)getCmrField()).validate();
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
		str.append("EjbRelationshipRoleName");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getEjbRelationshipRoleName();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(EJB_RELATIONSHIP_ROLE_NAME, 0, str, indent);

		str.append(indent);
		str.append("Multiplicity");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getMultiplicity();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(MULTIPLICITY, 0, str, indent);

		str.append(indent);
		str.append("CascadeDelete");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append((this.isCascadeDelete()?"true":"false"));
		this.dumpAttributes(CASCADE_DELETE, 0, str, indent);

		str.append(indent);
		str.append("RelationshipRoleSource");	// NOI18N
		n = (org.netbeans.modules.schema2beans.BaseBean) this.getRelationshipRoleSource();
		if (n != null)
			n.dump(str, indent + "\t");	// NOI18N
		else
			str.append(indent+"\tnull");	// NOI18N
		this.dumpAttributes(RELATIONSHIP_ROLE_SOURCE, 0, str, indent);

		str.append(indent);
		str.append("CmrField");	// NOI18N
		n = (org.netbeans.modules.schema2beans.BaseBean) this.getCmrField();
		if (n != null)
			n.dump(str, indent + "\t");	// NOI18N
		else
			str.append(indent+"\tnull");	// NOI18N
		this.dumpAttributes(CMR_FIELD, 0, str, indent);

	}
	public String dumpBeanNode(){
		StringBuffer str = new StringBuffer();
		str.append("EjbRelationshipRole\n");	// NOI18N
		this.dump(str, "\n  ");	// NOI18N
		return str.toString();
	}}

// END_NOI18N

