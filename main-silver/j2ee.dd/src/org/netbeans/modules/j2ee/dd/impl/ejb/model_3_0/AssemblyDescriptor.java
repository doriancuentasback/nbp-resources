/**
 *	This generated bean class AssemblyDescriptor matches the schema element 'assembly-descriptorType'.
 *  The root bean class is EjbJar
 *
 *	===============================================================
 *	
 *	
 *		    Providing an assembly-descriptor in the deployment
 *		    descriptor is optional for the ejb-jar file
 *		    producer.
 *	
 *		  
 *	===============================================================
 * @Generated
 */

package org.netbeans.modules.j2ee.dd.impl.ejb.model_3_0;

import org.w3c.dom.*;
import org.netbeans.modules.schema2beans.*;
import java.beans.*;
import java.util.*;

// BEGIN_NOI18N

public class AssemblyDescriptor extends org.netbeans.modules.j2ee.dd.impl.common.EnclosingBean
	 implements org.netbeans.modules.j2ee.dd.api.ejb.AssemblyDescriptor
{

	static Vector comparators = new Vector();
	private static final org.netbeans.modules.schema2beans.Version runtimeVersion = new org.netbeans.modules.schema2beans.Version(5, 0, 0);
	;	// NOI18N

	static public final String ID = "Id";	// NOI18N
	static public final String SECURITY_ROLE = "SecurityRole";	// NOI18N
	static public final String METHOD_PERMISSION = "MethodPermission";	// NOI18N
	static public final String CONTAINER_TRANSACTION = "ContainerTransaction";	// NOI18N
	static public final String INTERCEPTOR_BINDING = "InterceptorBinding";	// NOI18N
	static public final String MESSAGE_DESTINATION = "MessageDestination";	// NOI18N
	static public final String EXCLUDE_LIST = "ExcludeList";	// NOI18N
	static public final String APPLICATION_EXCEPTION = "ApplicationException";	// NOI18N

	public AssemblyDescriptor() {
		this(Common.USE_DEFAULT_VALUES);
	}

	public AssemblyDescriptor(int options)
	{
		super(comparators, runtimeVersion);
		// Properties (see root bean comments for the bean graph)
		initPropertyTables(7);
		this.createProperty("security-role", 	// NOI18N
			SECURITY_ROLE, 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			SecurityRole.class);
		this.createAttribute(SECURITY_ROLE, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("method-permission", 	// NOI18N
			METHOD_PERMISSION, 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			MethodPermission.class);
		this.createAttribute(METHOD_PERMISSION, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("container-transaction", 	// NOI18N
			CONTAINER_TRANSACTION, 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			ContainerTransaction.class);
		this.createAttribute(CONTAINER_TRANSACTION, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("interceptor-binding", 	// NOI18N
			INTERCEPTOR_BINDING, 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			InterceptorBinding.class);
		this.createAttribute(INTERCEPTOR_BINDING, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("message-destination", 	// NOI18N
			MESSAGE_DESTINATION, 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			MessageDestination.class);
		this.createAttribute(MESSAGE_DESTINATION, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("exclude-list", 	// NOI18N
			EXCLUDE_LIST, 
			Common.TYPE_0_1 | Common.TYPE_BEAN | Common.TYPE_KEY, 
			ExcludeList.class);
		this.createAttribute(EXCLUDE_LIST, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("application-exception", 	// NOI18N
			APPLICATION_EXCEPTION, 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			ApplicationException.class);
		this.createAttribute(APPLICATION_EXCEPTION, "id", "Id", 
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
	public void setSecurityRole(int index, org.netbeans.modules.j2ee.dd.api.common.SecurityRole valueInterface) {
		SecurityRole value = (SecurityRole) valueInterface;
		this.setValue(SECURITY_ROLE, index, value);
	}

	//
	public org.netbeans.modules.j2ee.dd.api.common.SecurityRole getSecurityRole(int index) {
		return (SecurityRole)this.getValue(SECURITY_ROLE, index);
	}

	// Return the number of properties
	public int sizeSecurityRole() {
		return this.size(SECURITY_ROLE);
	}

	// This attribute is an array, possibly empty
	public void setSecurityRole(org.netbeans.modules.j2ee.dd.api.common.SecurityRole[] value) {
		this.setValue(SECURITY_ROLE, value);
	}

	//
	public org.netbeans.modules.j2ee.dd.api.common.SecurityRole[] getSecurityRole() {
		return (SecurityRole[])this.getValues(SECURITY_ROLE);
	}

	// Add a new element returning its index in the list
	public int addSecurityRole(org.netbeans.modules.j2ee.dd.api.common.SecurityRole valueInterface) {
		SecurityRole value = (SecurityRole) valueInterface;
		int positionOfNewItem = this.addValue(SECURITY_ROLE, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeSecurityRole(org.netbeans.modules.j2ee.dd.api.common.SecurityRole valueInterface) {
		SecurityRole value = (SecurityRole) valueInterface;
		return this.removeValue(SECURITY_ROLE, value);
	}

	// This attribute is an array, possibly empty
	public void setMethodPermission(int index, org.netbeans.modules.j2ee.dd.api.ejb.MethodPermission valueInterface) {
		MethodPermission value = (MethodPermission) valueInterface;
		this.setValue(METHOD_PERMISSION, index, value);
	}

	//
	public org.netbeans.modules.j2ee.dd.api.ejb.MethodPermission getMethodPermission(int index) {
		return (MethodPermission)this.getValue(METHOD_PERMISSION, index);
	}

	// Return the number of properties
	public int sizeMethodPermission() {
		return this.size(METHOD_PERMISSION);
	}

	// This attribute is an array, possibly empty
	public void setMethodPermission(org.netbeans.modules.j2ee.dd.api.ejb.MethodPermission[] value) {
		this.setValue(METHOD_PERMISSION, value);
	}

	//
	public org.netbeans.modules.j2ee.dd.api.ejb.MethodPermission[] getMethodPermission() {
		return (MethodPermission[])this.getValues(METHOD_PERMISSION);
	}

	// Add a new element returning its index in the list
	public int addMethodPermission(org.netbeans.modules.j2ee.dd.api.ejb.MethodPermission valueInterface) {
		MethodPermission value = (MethodPermission) valueInterface;
		int positionOfNewItem = this.addValue(METHOD_PERMISSION, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeMethodPermission(org.netbeans.modules.j2ee.dd.api.ejb.MethodPermission valueInterface) {
		MethodPermission value = (MethodPermission) valueInterface;
		return this.removeValue(METHOD_PERMISSION, value);
	}

	// This attribute is an array, possibly empty
	public void setContainerTransaction(int index, org.netbeans.modules.j2ee.dd.api.ejb.ContainerTransaction valueInterface) {
		ContainerTransaction value = (ContainerTransaction) valueInterface;
		this.setValue(CONTAINER_TRANSACTION, index, value);
	}

	//
	public org.netbeans.modules.j2ee.dd.api.ejb.ContainerTransaction getContainerTransaction(int index) {
		return (ContainerTransaction)this.getValue(CONTAINER_TRANSACTION, index);
	}

	// Return the number of properties
	public int sizeContainerTransaction() {
		return this.size(CONTAINER_TRANSACTION);
	}

	// This attribute is an array, possibly empty
	public void setContainerTransaction(org.netbeans.modules.j2ee.dd.api.ejb.ContainerTransaction[] value) {
		this.setValue(CONTAINER_TRANSACTION, value);
	}

	//
	public org.netbeans.modules.j2ee.dd.api.ejb.ContainerTransaction[] getContainerTransaction() {
		return (ContainerTransaction[])this.getValues(CONTAINER_TRANSACTION);
	}

	// Add a new element returning its index in the list
	public int addContainerTransaction(org.netbeans.modules.j2ee.dd.api.ejb.ContainerTransaction valueInterface) {
		ContainerTransaction value = (ContainerTransaction) valueInterface;
		int positionOfNewItem = this.addValue(CONTAINER_TRANSACTION, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeContainerTransaction(org.netbeans.modules.j2ee.dd.api.ejb.ContainerTransaction valueInterface) {
		ContainerTransaction value = (ContainerTransaction) valueInterface;
		return this.removeValue(CONTAINER_TRANSACTION, value);
	}

	// This attribute is an array, possibly empty
	public void setInterceptorBinding(int index, org.netbeans.modules.j2ee.dd.api.ejb.InterceptorBinding valueInterface) {
		InterceptorBinding value = (InterceptorBinding) valueInterface;
		this.setValue(INTERCEPTOR_BINDING, index, value);
	}

	//
	public org.netbeans.modules.j2ee.dd.api.ejb.InterceptorBinding getInterceptorBinding(int index) {
		return (InterceptorBinding)this.getValue(INTERCEPTOR_BINDING, index);
	}

	// Return the number of properties
	public int sizeInterceptorBinding() {
		return this.size(INTERCEPTOR_BINDING);
	}

	// This attribute is an array, possibly empty
	public void setInterceptorBinding(org.netbeans.modules.j2ee.dd.api.ejb.InterceptorBinding[] value) {
		this.setValue(INTERCEPTOR_BINDING, value);
	}

	//
	public org.netbeans.modules.j2ee.dd.api.ejb.InterceptorBinding[] getInterceptorBinding() {
		return (InterceptorBinding[])this.getValues(INTERCEPTOR_BINDING);
	}

	// Add a new element returning its index in the list
	public int addInterceptorBinding(org.netbeans.modules.j2ee.dd.api.ejb.InterceptorBinding valueInterface) {
		InterceptorBinding value = (InterceptorBinding) valueInterface;
		int positionOfNewItem = this.addValue(INTERCEPTOR_BINDING, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeInterceptorBinding(org.netbeans.modules.j2ee.dd.api.ejb.InterceptorBinding valueInterface) {
		InterceptorBinding value = (InterceptorBinding) valueInterface;
		return this.removeValue(INTERCEPTOR_BINDING, value);
	}

	// This attribute is an array, possibly empty
	public void setMessageDestination(int index, org.netbeans.modules.j2ee.dd.api.common.MessageDestination valueInterface) {
		MessageDestination value = (MessageDestination) valueInterface;
		this.setValue(MESSAGE_DESTINATION, index, value);
	}

	//
	public org.netbeans.modules.j2ee.dd.api.common.MessageDestination getMessageDestination(int index) {
		return (MessageDestination)this.getValue(MESSAGE_DESTINATION, index);
	}

	// Return the number of properties
	public int sizeMessageDestination() {
		return this.size(MESSAGE_DESTINATION);
	}

	// This attribute is an array, possibly empty
	public void setMessageDestination(org.netbeans.modules.j2ee.dd.api.common.MessageDestination[] value) {
		this.setValue(MESSAGE_DESTINATION, value);
	}

	//
	public org.netbeans.modules.j2ee.dd.api.common.MessageDestination[] getMessageDestination() {
		return (MessageDestination[])this.getValues(MESSAGE_DESTINATION);
	}

	// Add a new element returning its index in the list
	public int addMessageDestination(org.netbeans.modules.j2ee.dd.api.common.MessageDestination valueInterface) {
		MessageDestination value = (MessageDestination) valueInterface;
		int positionOfNewItem = this.addValue(MESSAGE_DESTINATION, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeMessageDestination(org.netbeans.modules.j2ee.dd.api.common.MessageDestination valueInterface) {
		MessageDestination value = (MessageDestination) valueInterface;
		return this.removeValue(MESSAGE_DESTINATION, value);
	}

	// This attribute is optional
	public void setExcludeList(org.netbeans.modules.j2ee.dd.api.ejb.ExcludeList valueInterface) {
		ExcludeList value = (ExcludeList) valueInterface;
		this.setValue(EXCLUDE_LIST, value);
	}

	//
	public org.netbeans.modules.j2ee.dd.api.ejb.ExcludeList getExcludeList() {
		return (ExcludeList)this.getValue(EXCLUDE_LIST);
	}

	// This attribute is an array, possibly empty
	public void setApplicationException(int index, org.netbeans.modules.j2ee.dd.api.ejb.ApplicationException valueInterface) {
		ApplicationException value = (ApplicationException) valueInterface;
		this.setValue(APPLICATION_EXCEPTION, index, value);
	}

	//
	public org.netbeans.modules.j2ee.dd.api.ejb.ApplicationException getApplicationException(int index) {
		return (ApplicationException)this.getValue(APPLICATION_EXCEPTION, index);
	}

	// Return the number of properties
	public int sizeApplicationException() {
		return this.size(APPLICATION_EXCEPTION);
	}

	// This attribute is an array, possibly empty
	public void setApplicationException(org.netbeans.modules.j2ee.dd.api.ejb.ApplicationException[] value) {
		this.setValue(APPLICATION_EXCEPTION, value);
	}

	//
	public org.netbeans.modules.j2ee.dd.api.ejb.ApplicationException[] getApplicationException() {
		return (ApplicationException[])this.getValues(APPLICATION_EXCEPTION);
	}

	// Add a new element returning its index in the list
	public int addApplicationException(org.netbeans.modules.j2ee.dd.api.ejb.ApplicationException valueInterface) {
		ApplicationException value = (ApplicationException) valueInterface;
		int positionOfNewItem = this.addValue(APPLICATION_EXCEPTION, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeApplicationException(org.netbeans.modules.j2ee.dd.api.ejb.ApplicationException valueInterface) {
		ApplicationException value = (ApplicationException) valueInterface;
		return this.removeValue(APPLICATION_EXCEPTION, value);
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public org.netbeans.modules.j2ee.dd.api.common.SecurityRole newSecurityRole() {
		return new SecurityRole();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public org.netbeans.modules.j2ee.dd.api.ejb.MethodPermission newMethodPermission() {
		return new MethodPermission();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public org.netbeans.modules.j2ee.dd.api.ejb.ContainerTransaction newContainerTransaction() {
		return new ContainerTransaction();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public org.netbeans.modules.j2ee.dd.api.ejb.InterceptorBinding newInterceptorBinding() {
		return new InterceptorBinding();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public org.netbeans.modules.j2ee.dd.api.common.MessageDestination newMessageDestination() {
		return new MessageDestination();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public org.netbeans.modules.j2ee.dd.api.ejb.ExcludeList newExcludeList() {
		return new ExcludeList();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public org.netbeans.modules.j2ee.dd.api.ejb.ApplicationException newApplicationException() {
		return new ApplicationException();
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
		// Validating property securityRole
		for (int _index = 0; _index < sizeSecurityRole(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.ejb.model_3_0.SecurityRole element = (org.netbeans.modules.j2ee.dd.impl.ejb.model_3_0.SecurityRole) getSecurityRole(_index);
			if (element != null) {
				((SecurityRole)element).validate();
			}
		}
		// Validating property methodPermission
		for (int _index = 0; _index < sizeMethodPermission(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.ejb.model_3_0.MethodPermission element = (org.netbeans.modules.j2ee.dd.impl.ejb.model_3_0.MethodPermission) getMethodPermission(_index);
			if (element != null) {
				((MethodPermission)element).validate();
			}
		}
		// Validating property containerTransaction
		for (int _index = 0; _index < sizeContainerTransaction(); 
			++_index) {
			org.netbeans.modules.j2ee.dd.impl.ejb.model_3_0.ContainerTransaction element = (org.netbeans.modules.j2ee.dd.impl.ejb.model_3_0.ContainerTransaction) getContainerTransaction(_index);
			if (element != null) {
				((ContainerTransaction)element).validate();
			}
		}
		// Validating property interceptorBinding
		for (int _index = 0; _index < sizeInterceptorBinding(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.ejb.model_3_0.InterceptorBinding element = (org.netbeans.modules.j2ee.dd.impl.ejb.model_3_0.InterceptorBinding) getInterceptorBinding(_index);
			if (element != null) {
				((InterceptorBinding)element).validate();
			}
		}
		// Validating property messageDestination
		for (int _index = 0; _index < sizeMessageDestination(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.ejb.model_3_0.MessageDestination element = (org.netbeans.modules.j2ee.dd.impl.ejb.model_3_0.MessageDestination) getMessageDestination(_index);
			if (element != null) {
				((MessageDestination)element).validate();
			}
		}
		// Validating property excludeList
		if (getExcludeList() != null) {
			((ExcludeList)getExcludeList()).validate();
		}
		// Validating property applicationException
		for (int _index = 0; _index < sizeApplicationException(); 
			++_index) {
			org.netbeans.modules.j2ee.dd.impl.ejb.model_3_0.ApplicationException element = (org.netbeans.modules.j2ee.dd.impl.ejb.model_3_0.ApplicationException) getApplicationException(_index);
			if (element != null) {
				((ApplicationException)element).validate();
			}
		}
	}

	// Dump the content of this bean returning it as a String
	public void dump(StringBuffer str, String indent){
		String s;
		Object o;
		org.netbeans.modules.schema2beans.BaseBean n;
		str.append(indent);
		str.append("SecurityRole["+this.sizeSecurityRole()+"]");	// NOI18N
		for(int i=0; i<this.sizeSecurityRole(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getSecurityRole(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(SECURITY_ROLE, i, str, indent);
		}

		str.append(indent);
		str.append("MethodPermission["+this.sizeMethodPermission()+"]");	// NOI18N
		for(int i=0; i<this.sizeMethodPermission(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getMethodPermission(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(METHOD_PERMISSION, i, str, indent);
		}

		str.append(indent);
		str.append("ContainerTransaction["+this.sizeContainerTransaction()+"]");	// NOI18N
		for(int i=0; i<this.sizeContainerTransaction(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getContainerTransaction(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(CONTAINER_TRANSACTION, i, str, indent);
		}

		str.append(indent);
		str.append("InterceptorBinding["+this.sizeInterceptorBinding()+"]");	// NOI18N
		for(int i=0; i<this.sizeInterceptorBinding(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getInterceptorBinding(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(INTERCEPTOR_BINDING, i, str, indent);
		}

		str.append(indent);
		str.append("MessageDestination["+this.sizeMessageDestination()+"]");	// NOI18N
		for(int i=0; i<this.sizeMessageDestination(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getMessageDestination(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(MESSAGE_DESTINATION, i, str, indent);
		}

		str.append(indent);
		str.append("ExcludeList");	// NOI18N
		n = (org.netbeans.modules.schema2beans.BaseBean) this.getExcludeList();
		if (n != null)
			n.dump(str, indent + "\t");	// NOI18N
		else
			str.append(indent+"\tnull");	// NOI18N
		this.dumpAttributes(EXCLUDE_LIST, 0, str, indent);

		str.append(indent);
		str.append("ApplicationException["+this.sizeApplicationException()+"]");	// NOI18N
		for(int i=0; i<this.sizeApplicationException(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getApplicationException(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(APPLICATION_EXCEPTION, i, str, indent);
		}

	}
	public String dumpBeanNode(){
		StringBuffer str = new StringBuffer();
		str.append("AssemblyDescriptor\n");	// NOI18N
		this.dump(str, "\n  ");	// NOI18N
		return str.toString();
	}}

// END_NOI18N

