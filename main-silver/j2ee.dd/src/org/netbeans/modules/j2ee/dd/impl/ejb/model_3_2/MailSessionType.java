/**
 *	This generated bean class MailSessionType matches the schema element 'mail-sessionType'.
 *  The root bean class is EjbJar
 *
 *	===============================================================
 *	
 *	
 *	        Configuration of a Mail Session resource.
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

public class MailSessionType extends org.netbeans.modules.schema2beans.BaseBean
{

	static Vector comparators = new Vector();
	private static final org.netbeans.modules.schema2beans.Version runtimeVersion = new org.netbeans.modules.schema2beans.Version(5, 0, 0);
	;	// NOI18N

	static public final String ID = "Id";	// NOI18N
	static public final String DESCRIPTION = "Description";	// NOI18N
	static public final String DESCRIPTIONID = "DescriptionId";	// NOI18N
	static public final String DESCRIPTIONXMLLANG = "DescriptionXmlLang";	// NOI18N
	static public final String NAME = "Name";	// NOI18N
	static public final String STORE_PROTOCOL = "StoreProtocol";	// NOI18N
	static public final String STOREPROTOCOLID = "StoreProtocolId";	// NOI18N
	static public final String STORE_PROTOCOL_CLASS = "StoreProtocolClass";	// NOI18N
	static public final String TRANSPORT_PROTOCOL = "TransportProtocol";	// NOI18N
	static public final String TRANSPORTPROTOCOLID = "TransportProtocolId";	// NOI18N
	static public final String TRANSPORT_PROTOCOL_CLASS = "TransportProtocolClass";	// NOI18N
	static public final String HOST = "Host";	// NOI18N
	static public final String HOSTID = "HostId";	// NOI18N
	static public final String USER = "User";	// NOI18N
	static public final String USERID = "UserId";	// NOI18N
	static public final String PASSWORD = "Password";	// NOI18N
	static public final String PASSWORDID = "PasswordId";	// NOI18N
	static public final String FROM = "From";	// NOI18N
	static public final String FROMID = "FromId";	// NOI18N
	static public final String PROPERTY2 = "Property2";	// NOI18N

	public MailSessionType() {
		this(Common.USE_DEFAULT_VALUES);
	}

	public MailSessionType(int options)
	{
		super(comparators, runtimeVersion);
		// Properties (see root bean comments for the bean graph)
		initPropertyTables(11);
		this.createProperty("description", 	// NOI18N
			DESCRIPTION, 
			Common.TYPE_0_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createAttribute(DESCRIPTION, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createAttribute(DESCRIPTION, "xml:lang", "XmlLang", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("name", 	// NOI18N
			NAME, 
			Common.TYPE_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createProperty("store-protocol", 	// NOI18N
			STORE_PROTOCOL, 
			Common.TYPE_0_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createAttribute(STORE_PROTOCOL, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("store-protocol-class", 	// NOI18N
			STORE_PROTOCOL_CLASS, 
			Common.TYPE_0_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createProperty("transport-protocol", 	// NOI18N
			TRANSPORT_PROTOCOL, 
			Common.TYPE_0_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createAttribute(TRANSPORT_PROTOCOL, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("transport-protocol-class", 	// NOI18N
			TRANSPORT_PROTOCOL_CLASS, 
			Common.TYPE_0_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createProperty("host", 	// NOI18N
			HOST, 
			Common.TYPE_0_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createAttribute(HOST, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("user", 	// NOI18N
			USER, 
			Common.TYPE_0_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createAttribute(USER, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("password", 	// NOI18N
			PASSWORD, 
			Common.TYPE_0_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createAttribute(PASSWORD, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("from", 	// NOI18N
			FROM, 
			Common.TYPE_0_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createAttribute(FROM, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("property", 	// NOI18N
			PROPERTY2, 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			Property.class);
		this.createAttribute(PROPERTY2, "id", "Id", 
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

	// This attribute is optional
	public void setDescription(java.lang.String value) {
		this.setValue(DESCRIPTION, value);
	}

	//
	public java.lang.String getDescription() {
		return (java.lang.String)this.getValue(DESCRIPTION);
	}

	// This attribute is optional
	public void setDescriptionId(java.lang.String value) {
		// Make sure we've got a place to put this attribute.
		if (size(DESCRIPTION) == 0) {
			setValue(DESCRIPTION, "");
		}
		setAttributeValue(DESCRIPTION, "Id", value);
	}

	//
	public java.lang.String getDescriptionId() {
		// If our element does not exist, then the attribute does not exist.
		if (size(DESCRIPTION) == 0) {
			return null;
		} else {
			return getAttributeValue(DESCRIPTION, "Id");
		}
	}

	// This attribute is optional
	public void setDescriptionXmlLang(java.lang.String value) {
		// Make sure we've got a place to put this attribute.
		if (size(DESCRIPTION) == 0) {
			setValue(DESCRIPTION, "");
		}
		setAttributeValue(DESCRIPTION, "XmlLang", value);
	}

	//
	public java.lang.String getDescriptionXmlLang() {
		// If our element does not exist, then the attribute does not exist.
		if (size(DESCRIPTION) == 0) {
			return null;
		} else {
			return getAttributeValue(DESCRIPTION, "XmlLang");
		}
	}

	// This attribute is mandatory
	public void setName(java.lang.String value) {
		this.setValue(NAME, value);
	}

	//
	public java.lang.String getName() {
		return (java.lang.String)this.getValue(NAME);
	}

	// This attribute is optional
	public void setStoreProtocol(java.lang.String value) {
		this.setValue(STORE_PROTOCOL, value);
	}

	//
	public java.lang.String getStoreProtocol() {
		return (java.lang.String)this.getValue(STORE_PROTOCOL);
	}

	// This attribute is optional
	public void setStoreProtocolId(java.lang.String value) {
		// Make sure we've got a place to put this attribute.
		if (size(STORE_PROTOCOL) == 0) {
			setValue(STORE_PROTOCOL, "");
		}
		setAttributeValue(STORE_PROTOCOL, "Id", value);
	}

	//
	public java.lang.String getStoreProtocolId() {
		// If our element does not exist, then the attribute does not exist.
		if (size(STORE_PROTOCOL) == 0) {
			return null;
		} else {
			return getAttributeValue(STORE_PROTOCOL, "Id");
		}
	}

	// This attribute is optional
	public void setStoreProtocolClass(java.lang.String value) {
		this.setValue(STORE_PROTOCOL_CLASS, value);
	}

	//
	public java.lang.String getStoreProtocolClass() {
		return (java.lang.String)this.getValue(STORE_PROTOCOL_CLASS);
	}

	// This attribute is optional
	public void setTransportProtocol(java.lang.String value) {
		this.setValue(TRANSPORT_PROTOCOL, value);
	}

	//
	public java.lang.String getTransportProtocol() {
		return (java.lang.String)this.getValue(TRANSPORT_PROTOCOL);
	}

	// This attribute is optional
	public void setTransportProtocolId(java.lang.String value) {
		// Make sure we've got a place to put this attribute.
		if (size(STORE_PROTOCOL) == 0) {
			setValue(STORE_PROTOCOL, "");
		}
		setAttributeValue(STORE_PROTOCOL, "Id", value);
	}

	//
	public java.lang.String getTransportProtocolId() {
		// If our element does not exist, then the attribute does not exist.
		if (size(STORE_PROTOCOL) == 0) {
			return null;
		} else {
			return getAttributeValue(STORE_PROTOCOL, "Id");
		}
	}

	// This attribute is optional
	public void setTransportProtocolClass(java.lang.String value) {
		this.setValue(TRANSPORT_PROTOCOL_CLASS, value);
	}

	//
	public java.lang.String getTransportProtocolClass() {
		return (java.lang.String)this.getValue(TRANSPORT_PROTOCOL_CLASS);
	}

	// This attribute is optional
	public void setHost(java.lang.String value) {
		this.setValue(HOST, value);
	}

	//
	public java.lang.String getHost() {
		return (java.lang.String)this.getValue(HOST);
	}

	// This attribute is optional
	public void setHostId(java.lang.String value) {
		// Make sure we've got a place to put this attribute.
		if (size(STORE_PROTOCOL) == 0) {
			setValue(STORE_PROTOCOL, "");
		}
		setAttributeValue(STORE_PROTOCOL, "Id", value);
	}

	//
	public java.lang.String getHostId() {
		// If our element does not exist, then the attribute does not exist.
		if (size(STORE_PROTOCOL) == 0) {
			return null;
		} else {
			return getAttributeValue(STORE_PROTOCOL, "Id");
		}
	}

	// This attribute is optional
	public void setUser(java.lang.String value) {
		this.setValue(USER, value);
	}

	//
	public java.lang.String getUser() {
		return (java.lang.String)this.getValue(USER);
	}

	// This attribute is optional
	public void setUserId(java.lang.String value) {
		// Make sure we've got a place to put this attribute.
		if (size(STORE_PROTOCOL) == 0) {
			setValue(STORE_PROTOCOL, "");
		}
		setAttributeValue(STORE_PROTOCOL, "Id", value);
	}

	//
	public java.lang.String getUserId() {
		// If our element does not exist, then the attribute does not exist.
		if (size(STORE_PROTOCOL) == 0) {
			return null;
		} else {
			return getAttributeValue(STORE_PROTOCOL, "Id");
		}
	}

	// This attribute is optional
	public void setPassword(java.lang.String value) {
		this.setValue(PASSWORD, value);
	}

	//
	public java.lang.String getPassword() {
		return (java.lang.String)this.getValue(PASSWORD);
	}

	// This attribute is optional
	public void setPasswordId(java.lang.String value) {
		// Make sure we've got a place to put this attribute.
		if (size(STORE_PROTOCOL) == 0) {
			setValue(STORE_PROTOCOL, "");
		}
		setAttributeValue(STORE_PROTOCOL, "Id", value);
	}

	//
	public java.lang.String getPasswordId() {
		// If our element does not exist, then the attribute does not exist.
		if (size(STORE_PROTOCOL) == 0) {
			return null;
		} else {
			return getAttributeValue(STORE_PROTOCOL, "Id");
		}
	}

	// This attribute is optional
	public void setFrom(java.lang.String value) {
		this.setValue(FROM, value);
	}

	//
	public java.lang.String getFrom() {
		return (java.lang.String)this.getValue(FROM);
	}

	// This attribute is optional
	public void setFromId(java.lang.String value) {
		// Make sure we've got a place to put this attribute.
		if (size(STORE_PROTOCOL) == 0) {
			setValue(STORE_PROTOCOL, "");
		}
		setAttributeValue(STORE_PROTOCOL, "Id", value);
	}

	//
	public java.lang.String getFromId() {
		// If our element does not exist, then the attribute does not exist.
		if (size(STORE_PROTOCOL) == 0) {
			return null;
		} else {
			return getAttributeValue(STORE_PROTOCOL, "Id");
		}
	}

	// This attribute is an array, possibly empty
	public void setProperty2(int index, org.netbeans.modules.j2ee.dd.api.ejb.Property valueInterface) {
		Property value = (Property) valueInterface;
		this.setValue(PROPERTY2, index, value);
	}

	//
	public org.netbeans.modules.j2ee.dd.api.ejb.Property getProperty2(int index) {
		return (Property)this.getValue(PROPERTY2, index);
	}

	// Return the number of properties
	public int sizeProperty2() {
		return this.size(PROPERTY2);
	}

	// This attribute is an array, possibly empty
	public void setProperty2(org.netbeans.modules.j2ee.dd.api.ejb.Property[] value) {
		this.setValue(PROPERTY2, value);
	}

	//
	public org.netbeans.modules.j2ee.dd.api.ejb.Property[] getProperty2() {
		return (Property[])this.getValues(PROPERTY2);
	}

	// Add a new element returning its index in the list
	public int addProperty2(org.netbeans.modules.j2ee.dd.api.ejb.Property valueInterface) {
		Property value = (Property) valueInterface;
		int positionOfNewItem = this.addValue(PROPERTY2, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeProperty2(org.netbeans.modules.j2ee.dd.api.ejb.Property valueInterface) {
		Property value = (Property) valueInterface;
		return this.removeValue(PROPERTY2, value);
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public org.netbeans.modules.j2ee.dd.api.ejb.Property newProperty() {
		return new Property();
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
		if (getDescriptionId() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getDescriptionId() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "descriptionId", this);	// NOI18N
			}
		}
		// Validating property descriptionXmlLang
		// Validating property name
		if (getName() == null) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getName() == null", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "name", this);	// NOI18N
		}
		// Validating property storeProtocol
		if (getStoreProtocol() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getStoreProtocol() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "storeProtocol", this);	// NOI18N
			}
		}
		// Validating property storeProtocolId
		if (getStoreProtocolId() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getStoreProtocolId() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "storeProtocolId", this);	// NOI18N
			}
		}
		// Validating property storeProtocolClass
		// Validating property transportProtocol
		if (getTransportProtocol() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getTransportProtocol() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "transportProtocol", this);	// NOI18N
			}
		}
		// Validating property transportProtocolId
		if (getTransportProtocolId() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getTransportProtocolId() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "transportProtocolId", this);	// NOI18N
			}
		}
		// Validating property transportProtocolClass
		// Validating property host
		if (getHost() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getHost() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "host", this);	// NOI18N
			}
		}
		// Validating property hostId
		if (getHostId() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getHostId() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "hostId", this);	// NOI18N
			}
		}
		// Validating property user
		if (getUser() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getUser() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "user", this);	// NOI18N
			}
		}
		// Validating property userId
		if (getUserId() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getUserId() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "userId", this);	// NOI18N
			}
		}
		// Validating property password
		if (getPassword() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getPassword() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "password", this);	// NOI18N
			}
		}
		// Validating property passwordId
		if (getPasswordId() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getPasswordId() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "passwordId", this);	// NOI18N
			}
		}
		// Validating property from
		if (getFrom() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getFrom() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "from", this);	// NOI18N
			}
		}
		// Validating property fromId
		if (getFromId() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getFromId() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "fromId", this);	// NOI18N
			}
		}
		// Validating property property2
		for (int _index = 0; _index < sizeProperty2(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2.Property element = (org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2.Property) getProperty2(_index);
			if (element != null) {
				((Property)element).validate();
			}
		}
	}

	// Dump the content of this bean returning it as a String
	public void dump(StringBuffer str, String indent){
		String s;
		Object o;
		org.netbeans.modules.schema2beans.BaseBean n;
		str.append(indent);
		str.append("Description");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getDescription();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(DESCRIPTION, 0, str, indent);

		str.append(indent);
		str.append("Name");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getName();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(NAME, 0, str, indent);

		str.append(indent);
		str.append("StoreProtocol");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getStoreProtocol();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(STORE_PROTOCOL, 0, str, indent);

		str.append(indent);
		str.append("StoreProtocolClass");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getStoreProtocolClass();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(STORE_PROTOCOL_CLASS, 0, str, indent);

		str.append(indent);
		str.append("TransportProtocol");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getTransportProtocol();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(TRANSPORT_PROTOCOL, 0, str, indent);

		str.append(indent);
		str.append("TransportProtocolClass");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getTransportProtocolClass();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(TRANSPORT_PROTOCOL_CLASS, 0, str, indent);

		str.append(indent);
		str.append("Host");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getHost();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(HOST, 0, str, indent);

		str.append(indent);
		str.append("User");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getUser();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(USER, 0, str, indent);

		str.append(indent);
		str.append("Password");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getPassword();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(PASSWORD, 0, str, indent);

		str.append(indent);
		str.append("From");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getFrom();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(FROM, 0, str, indent);

		str.append(indent);
		str.append("Property2["+this.sizeProperty2()+"]");	// NOI18N
		for(int i=0; i<this.sizeProperty2(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getProperty2(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(PROPERTY2, i, str, indent);
		}

	}
	public String dumpBeanNode(){
		StringBuffer str = new StringBuffer();
		str.append("MailSessionType\n");	// NOI18N
		this.dump(str, "\n  ");	// NOI18N
		return str.toString();
	}}

// END_NOI18N

