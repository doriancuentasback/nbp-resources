/**
 *	This generated bean class MessageDestinationRef matches the schema element 'message-destination-refType'.
 *  The root bean class is WebApp
 *
 *	===============================================================
 *	
 *		
 *	
 *		  The message-destination-ref element contains a declaration
 *		  of Deployment Component's reference to a message destination
 *		  associated with a resource in Deployment Component's
 *		  environment. It consists of:
 *	
 *			  - an optional description
 *			  - the message destination reference name
 *			  - the message destination type
 *			  - a specification as to whether the
 *			    destination is used for
 *			    consuming or producing messages, or both
 *			  - a link to the message destination
 *	
 *		  Examples:
 *	
 *		  <message-destination-ref>
 *			  <message-destination-ref-name>jms/StockQueue
 *			  </message-destination-ref-name>
 *			  <message-destination-type>javax.jms.Queue
 *			  </message-destination-type>
 *			  <message-destination-usage>Consumes
 *			  </message-destination-usage>
 *			  <message-destination-link>CorporateStocks
 *			  </message-destination-link>
 *		  </message-destination-ref>
 *	
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

public class MessageDestinationRef extends org.netbeans.modules.j2ee.dd.impl.common.DescriptionBeanMultiple
	 implements  
                org.netbeans.modules.j2ee.dd.api.common.MessageDestinationRef, org.netbeans.modules.j2ee.dd.impl.common.KeyBean
            
{

	static Vector comparators = new Vector();
	private static final org.netbeans.modules.schema2beans.Version runtimeVersion = new org.netbeans.modules.schema2beans.Version(5, 0, 0);
	;	// NOI18N

	static public final String ID = "Id";	// NOI18N
	static public final String DESCRIPTION = "Description";	// NOI18N
	static public final String DESCRIPTIONID = "DescriptionId";	// NOI18N
	static public final String DESCRIPTIONXMLLANG = "DescriptionXmlLang";	// NOI18N
	static public final String MESSAGE_DESTINATION_REF_NAME = "MessageDestinationRefName";	// NOI18N
	static public final String MESSAGE_DESTINATION_TYPE = "MessageDestinationType";	// NOI18N
	static public final String MESSAGE_DESTINATION_USAGE = "MessageDestinationUsage";	// NOI18N
	static public final String MESSAGE_DESTINATION_LINK = "MessageDestinationLink";	// NOI18N

	public MessageDestinationRef() {
		this(Common.USE_DEFAULT_VALUES);
	}

	public MessageDestinationRef(int options)
	{
		super(comparators, runtimeVersion);
		// Properties (see root bean comments for the bean graph)
		initPropertyTables(5);
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
		this.createProperty("message-destination-ref-name", 	// NOI18N
			MESSAGE_DESTINATION_REF_NAME, 
			Common.TYPE_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createProperty("message-destination-type", 	// NOI18N
			MESSAGE_DESTINATION_TYPE, 
			Common.TYPE_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createProperty("message-destination-usage", 	// NOI18N
			MESSAGE_DESTINATION_USAGE, 
			Common.TYPE_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createProperty("message-destination-link", 	// NOI18N
			MESSAGE_DESTINATION_LINK, 
			Common.TYPE_0_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.initialize(options);
	}

	// Setting the default values of the properties
	void initialize(int options) {
		if ((options & Common.USE_DEFAULT_VALUES) == Common.USE_DEFAULT_VALUES) {
			setMessageDestinationUsage("Consumes");
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

	// This attribute is mandatory
	public void setMessageDestinationRefName(java.lang.String value) {
		this.setValue(MESSAGE_DESTINATION_REF_NAME, value);
	}

	//
	public java.lang.String getMessageDestinationRefName() {
		return (java.lang.String)this.getValue(MESSAGE_DESTINATION_REF_NAME);
	}

	// This attribute is mandatory
	public void setMessageDestinationType(java.lang.String value) {
		this.setValue(MESSAGE_DESTINATION_TYPE, value);
	}

	//
	public java.lang.String getMessageDestinationType() {
		return (java.lang.String)this.getValue(MESSAGE_DESTINATION_TYPE);
	}

	// This attribute is mandatory
	public void setMessageDestinationUsage(java.lang.String value) {
		this.setValue(MESSAGE_DESTINATION_USAGE, value);
	}

	//
	public java.lang.String getMessageDestinationUsage() {
		return (java.lang.String)this.getValue(MESSAGE_DESTINATION_USAGE);
	}

	// This attribute is optional
	public void setMessageDestinationLink(java.lang.String value) {
		this.setValue(MESSAGE_DESTINATION_LINK, value);
	}

	//
	public java.lang.String getMessageDestinationLink() {
		return (java.lang.String)this.getValue(MESSAGE_DESTINATION_LINK);
	}

	//
	public static void addComparator(org.netbeans.modules.schema2beans.BeanComparator c) {
		comparators.add(c);
	}

	//
	public static void removeComparator(org.netbeans.modules.schema2beans.BeanComparator c) {
		comparators.remove(c);
	}

	
                public String getKeyProperty() { return "MessageDestinationRefName"; }
                // Java EE 5
                public void setMappedName(String value) throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.web.WebApp.VERSION_2_4);
                }
                public int removeInjectionTarget(org.netbeans.modules.j2ee.dd.api.common.InjectionTarget valueInterface) throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.web.WebApp.VERSION_2_4);
                }
                public int addInjectionTarget(org.netbeans.modules.j2ee.dd.api.common.InjectionTarget valueInterface) throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.web.WebApp.VERSION_2_4);
                }
                public void setInjectionTarget(int index, org.netbeans.modules.j2ee.dd.api.common.InjectionTarget valueInterface) throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.web.WebApp.VERSION_2_4);
                }
                public org.netbeans.modules.j2ee.dd.api.common.InjectionTarget getInjectionTarget(int index) throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.web.WebApp.VERSION_2_4);
                }
                public void setInjectionTarget(org.netbeans.modules.j2ee.dd.api.common.InjectionTarget[] value) throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.web.WebApp.VERSION_2_4);
                }
                public int sizeInjectionTarget() throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.web.WebApp.VERSION_2_4);
                }
                public org.netbeans.modules.j2ee.dd.api.common.InjectionTarget newInjectionTarget() throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.web.WebApp.VERSION_2_4);
                }
                public String getMappedName() throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.web.WebApp.VERSION_2_4);
                }
                public org.netbeans.modules.j2ee.dd.api.common.InjectionTarget[] getInjectionTarget() throws org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException {
                    throw new org.netbeans.modules.j2ee.dd.api.common.VersionNotSupportedException(org.netbeans.modules.j2ee.dd.api.web.WebApp.VERSION_2_4);
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
		// Validating property messageDestinationRefName
		if (getMessageDestinationRefName() == null) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getMessageDestinationRefName() == null", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "messageDestinationRefName", this);	// NOI18N
		}
		// Validating property messageDestinationType
		if (getMessageDestinationType() == null) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getMessageDestinationType() == null", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "messageDestinationType", this);	// NOI18N
		}
		// Validating property messageDestinationUsage
		if (getMessageDestinationUsage() == null) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getMessageDestinationUsage() == null", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "messageDestinationUsage", this);	// NOI18N
		}
		final java.lang.String[] enumRestrictionMessageDestinationUsage = {"Consumes", "Produces", "ConsumesProduces"};
		restrictionFailure = true;
		for (int _index2 = 0; 
			_index2 < enumRestrictionMessageDestinationUsage.length; 
			++_index2) {
			if (enumRestrictionMessageDestinationUsage[_index2].equals(getMessageDestinationUsage())) {
				restrictionFailure = false;
				break;
			}
		}
		if (restrictionFailure) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getMessageDestinationUsage() enumeration test", org.netbeans.modules.schema2beans.ValidateException.FailureType.ENUM_RESTRICTION, "messageDestinationUsage", this);	// NOI18N
		}
		// Validating property messageDestinationLink
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
		str.append("MessageDestinationRefName");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getMessageDestinationRefName();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(MESSAGE_DESTINATION_REF_NAME, 0, str, indent);

		str.append(indent);
		str.append("MessageDestinationType");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getMessageDestinationType();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(MESSAGE_DESTINATION_TYPE, 0, str, indent);

		str.append(indent);
		str.append("MessageDestinationUsage");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getMessageDestinationUsage();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(MESSAGE_DESTINATION_USAGE, 0, str, indent);

		str.append(indent);
		str.append("MessageDestinationLink");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getMessageDestinationLink();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(MESSAGE_DESTINATION_LINK, 0, str, indent);

	}
	public String dumpBeanNode(){
		StringBuffer str = new StringBuffer();
		str.append("MessageDestinationRef\n");	// NOI18N
		this.dump(str, "\n  ");	// NOI18N
		return str.toString();
	}}

// END_NOI18N

