/**
 *	This generated bean class EnterpriseBeans matches the schema element 'enterprise-beansType'.
 *  The root bean class is EjbJar
 *
 *	===============================================================
 *	
 *	
 *	        The enterprise-beansType declares one or more enterprise
 *	        beans. Each bean can be a session, entity or message-driven
 *	        bean.
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

public class EnterpriseBeans extends org.netbeans.modules.j2ee.dd.impl.common.GetAllEjbs
	 implements org.netbeans.modules.j2ee.dd.api.ejb.EnterpriseBeans
{

	static Vector comparators = new Vector();
	static{
		EnterpriseBeans.addComparator(new org.netbeans.modules.j2ee.dd.impl.common.Comparator());
	}
	private static final org.netbeans.modules.schema2beans.Version runtimeVersion = new org.netbeans.modules.schema2beans.Version(5, 0, 0);
	;	// NOI18N

	static public final String ID = "Id";	// NOI18N
	static public final String SESSION = "Session";	// NOI18N
	static public final String ENTITY = "Entity";	// NOI18N
	static public final String MESSAGE_DRIVEN = "MessageDriven";	// NOI18N

	public EnterpriseBeans() {
		this(Common.USE_DEFAULT_VALUES);
	}

	public EnterpriseBeans(int options)
	{
		super(comparators, runtimeVersion);
		// Properties (see root bean comments for the bean graph)
		initPropertyTables(3);
		this.createProperty("session", 	// NOI18N
			SESSION, Common.SEQUENCE_OR | 
			Common.TYPE_1_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			SessionBean.class);
		this.createAttribute(SESSION, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("entity", 	// NOI18N
			ENTITY, Common.SEQUENCE_OR | 
			Common.TYPE_1_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			EntityBean.class);
		this.createAttribute(ENTITY, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("message-driven", 	// NOI18N
			MESSAGE_DRIVEN, Common.SEQUENCE_OR | 
			Common.TYPE_1_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			MessageDrivenBean.class);
		this.createAttribute(MESSAGE_DRIVEN, "id", "Id", 
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
	public void setSession(int index, org.netbeans.modules.j2ee.dd.api.ejb.Session valueInterface) {
		SessionBean value = (SessionBean) valueInterface;
		this.setValue(SESSION, index, value);
	}

	//
	public org.netbeans.modules.j2ee.dd.api.ejb.Session getSession(int index) {
		return (SessionBean)this.getValue(SESSION, index);
	}

	// Return the number of properties
	public int sizeSession() {
		return this.size(SESSION);
	}

	// This attribute is an array containing at least one element
	public void setSession(org.netbeans.modules.j2ee.dd.api.ejb.Session[] value) {
		this.setValue(SESSION, value);
	}

	//
	public org.netbeans.modules.j2ee.dd.api.ejb.Session[] getSession() {
		return (SessionBean[])this.getValues(SESSION);
	}

	// Add a new element returning its index in the list
	public int addSession(org.netbeans.modules.j2ee.dd.api.ejb.Session valueInterface) {
		SessionBean value = (SessionBean) valueInterface;
		int positionOfNewItem = this.addValue(SESSION, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeSession(org.netbeans.modules.j2ee.dd.api.ejb.Session valueInterface) {
		SessionBean value = (SessionBean) valueInterface;
		return this.removeValue(SESSION, value);
	}

	// This attribute is an array containing at least one element
	public void setEntity(int index, org.netbeans.modules.j2ee.dd.api.ejb.Entity valueInterface) {
		EntityBean value = (EntityBean) valueInterface;
		this.setValue(ENTITY, index, value);
	}

	//
	public org.netbeans.modules.j2ee.dd.api.ejb.Entity getEntity(int index) {
		return (EntityBean)this.getValue(ENTITY, index);
	}

	// Return the number of properties
	public int sizeEntity() {
		return this.size(ENTITY);
	}

	// This attribute is an array containing at least one element
	public void setEntity(org.netbeans.modules.j2ee.dd.api.ejb.Entity[] value) {
		this.setValue(ENTITY, value);
	}

	//
	public org.netbeans.modules.j2ee.dd.api.ejb.Entity[] getEntity() {
		return (EntityBean[])this.getValues(ENTITY);
	}

	// Add a new element returning its index in the list
	public int addEntity(org.netbeans.modules.j2ee.dd.api.ejb.Entity valueInterface) {
		EntityBean value = (EntityBean) valueInterface;
		int positionOfNewItem = this.addValue(ENTITY, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeEntity(org.netbeans.modules.j2ee.dd.api.ejb.Entity valueInterface) {
		EntityBean value = (EntityBean) valueInterface;
		return this.removeValue(ENTITY, value);
	}

	// This attribute is an array containing at least one element
	public void setMessageDriven(int index, org.netbeans.modules.j2ee.dd.api.ejb.MessageDriven valueInterface) {
		MessageDrivenBean value = (MessageDrivenBean) valueInterface;
		this.setValue(MESSAGE_DRIVEN, index, value);
	}

	//
	public org.netbeans.modules.j2ee.dd.api.ejb.MessageDriven getMessageDriven(int index) {
		return (MessageDrivenBean)this.getValue(MESSAGE_DRIVEN, index);
	}

	// Return the number of properties
	public int sizeMessageDriven() {
		return this.size(MESSAGE_DRIVEN);
	}

	// This attribute is an array containing at least one element
	public void setMessageDriven(org.netbeans.modules.j2ee.dd.api.ejb.MessageDriven[] value) {
		this.setValue(MESSAGE_DRIVEN, value);
	}

	//
	public org.netbeans.modules.j2ee.dd.api.ejb.MessageDriven[] getMessageDriven() {
		return (MessageDrivenBean[])this.getValues(MESSAGE_DRIVEN);
	}

	// Add a new element returning its index in the list
	public int addMessageDriven(org.netbeans.modules.j2ee.dd.api.ejb.MessageDriven valueInterface) {
		MessageDrivenBean value = (MessageDrivenBean) valueInterface;
		int positionOfNewItem = this.addValue(MESSAGE_DRIVEN, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeMessageDriven(org.netbeans.modules.j2ee.dd.api.ejb.MessageDriven valueInterface) {
		MessageDrivenBean value = (MessageDrivenBean) valueInterface;
		return this.removeValue(MESSAGE_DRIVEN, value);
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public org.netbeans.modules.j2ee.dd.api.ejb.Session newSession() {
		return new SessionBean();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public org.netbeans.modules.j2ee.dd.api.ejb.Entity newEntity() {
		return new EntityBean();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public org.netbeans.modules.j2ee.dd.api.ejb.MessageDriven newMessageDriven() {
		return new MessageDrivenBean();
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
		// Validating property session
		for (int _index = 0; _index < sizeSession(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2.SessionBean element = (org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2.SessionBean) getSession(_index);
			if (element != null) {
				((SessionBean)element).validate();
			}
		}
		if (sizeSession() > 0) {
		}
		// Validating property entity
		for (int _index = 0; _index < sizeEntity(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2.EntityBean element = (org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2.EntityBean) getEntity(_index);
			if (element != null) {
				((EntityBean)element).validate();
			}
		}
		if (sizeEntity() > 0) {
		}
		// Validating property messageDriven
		for (int _index = 0; _index < sizeMessageDriven(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2.MessageDrivenBean element = (org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2.MessageDrivenBean) getMessageDriven(_index);
			if (element != null) {
				((MessageDrivenBean)element).validate();
			}
		}
		if (sizeMessageDriven() > 0) {
		}
		if (sizeSession() == 0) {
			throw new org.netbeans.modules.schema2beans.ValidateException("required properties: sizeSession() == 0", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "Session", this);	// NOI18N
		}
		if (sizeEntity() == 0) {
			throw new org.netbeans.modules.schema2beans.ValidateException("required properties: sizeEntity() == 0", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "Entity", this);	// NOI18N
		}
		if (sizeMessageDriven() == 0) {
			throw new org.netbeans.modules.schema2beans.ValidateException("required properties: sizeMessageDriven() == 0", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "MessageDriven", this);	// NOI18N
		}
	}

	// Dump the content of this bean returning it as a String
	public void dump(StringBuffer str, String indent){
		String s;
		Object o;
		org.netbeans.modules.schema2beans.BaseBean n;
		str.append(indent);
		str.append("Session["+this.sizeSession()+"]");	// NOI18N
		for(int i=0; i<this.sizeSession(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getSession(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(SESSION, i, str, indent);
		}

		str.append(indent);
		str.append("Entity["+this.sizeEntity()+"]");	// NOI18N
		for(int i=0; i<this.sizeEntity(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getEntity(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(ENTITY, i, str, indent);
		}

		str.append(indent);
		str.append("MessageDriven["+this.sizeMessageDriven()+"]");	// NOI18N
		for(int i=0; i<this.sizeMessageDriven(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getMessageDriven(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(MESSAGE_DRIVEN, i, str, indent);
		}

	}
	public String dumpBeanNode(){
		StringBuffer str = new StringBuffer();
		str.append("EnterpriseBeans\n");	// NOI18N
		this.dump(str, "\n  ");	// NOI18N
		return str.toString();
	}}

// END_NOI18N

