/**
 *	This generated bean class ServiceRefHandlerChains matches the schema element 'service-ref_handler-chainsType'.
 *  The root bean class is WebApp
 *
 *	===============================================================
 *	
 *	
 *	      The handler-chains element defines the handlerchains associated with this
 *	      service or service endpoint.
 *	
 *	      
 *	===============================================================
 * @Generated
 */

package org.netbeans.modules.j2ee.dd.impl.web.model_2_5;

import org.w3c.dom.*;
import org.netbeans.modules.schema2beans.*;
import java.beans.*;
import java.util.*;

// BEGIN_NOI18N

public class ServiceRefHandlerChains extends org.netbeans.modules.schema2beans.BaseBean
	 implements org.netbeans.modules.j2ee.dd.api.common.ServiceRefHandlerChains
{

	static Vector comparators = new Vector();
	private static final org.netbeans.modules.schema2beans.Version runtimeVersion = new org.netbeans.modules.schema2beans.Version(5, 0, 0);
	;	// NOI18N

	static public final String ID = "Id";	// NOI18N
	static public final String HANDLER_CHAIN = "HandlerChain";	// NOI18N

	public ServiceRefHandlerChains() {
		this(Common.USE_DEFAULT_VALUES);
	}

	public ServiceRefHandlerChains(int options)
	{
		super(comparators, runtimeVersion);
		// Properties (see root bean comments for the bean graph)
		initPropertyTables(1);
		this.createProperty("handler-chain", 	// NOI18N
			HANDLER_CHAIN, 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			ServiceRefHandlerChain.class);
		this.createAttribute(HANDLER_CHAIN, "id", "Id", 
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
	public void setHandlerChain(int index, org.netbeans.modules.j2ee.dd.api.common.ServiceRefHandlerChain valueInterface) {
		ServiceRefHandlerChain value = (ServiceRefHandlerChain) valueInterface;
		this.setValue(HANDLER_CHAIN, index, value);
	}

	//
	public org.netbeans.modules.j2ee.dd.api.common.ServiceRefHandlerChain getHandlerChain(int index) {
		return (ServiceRefHandlerChain)this.getValue(HANDLER_CHAIN, index);
	}

	// Return the number of properties
	public int sizeHandlerChain() {
		return this.size(HANDLER_CHAIN);
	}

	// This attribute is an array, possibly empty
	public void setHandlerChain(org.netbeans.modules.j2ee.dd.api.common.ServiceRefHandlerChain[] value) {
		this.setValue(HANDLER_CHAIN, value);
	}

	//
	public org.netbeans.modules.j2ee.dd.api.common.ServiceRefHandlerChain[] getHandlerChain() {
		return (ServiceRefHandlerChain[])this.getValues(HANDLER_CHAIN);
	}

	// Add a new element returning its index in the list
	public int addHandlerChain(org.netbeans.modules.j2ee.dd.api.common.ServiceRefHandlerChain valueInterface) {
		ServiceRefHandlerChain value = (ServiceRefHandlerChain) valueInterface;
		int positionOfNewItem = this.addValue(HANDLER_CHAIN, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeHandlerChain(org.netbeans.modules.j2ee.dd.api.common.ServiceRefHandlerChain valueInterface) {
		ServiceRefHandlerChain value = (ServiceRefHandlerChain) valueInterface;
		return this.removeValue(HANDLER_CHAIN, value);
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public org.netbeans.modules.j2ee.dd.api.common.ServiceRefHandlerChain newServiceRefHandlerChain() {
		return new ServiceRefHandlerChain();
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
		// Validating property handlerChain
		for (int _index = 0; _index < sizeHandlerChain(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.web.model_2_5.ServiceRefHandlerChain element = (org.netbeans.modules.j2ee.dd.impl.web.model_2_5.ServiceRefHandlerChain) getHandlerChain(_index);
			if (element != null) {
				((ServiceRefHandlerChain)element).validate();
			}
		}
	}

	// Dump the content of this bean returning it as a String
	public void dump(StringBuffer str, String indent){
		String s;
		Object o;
		org.netbeans.modules.schema2beans.BaseBean n;
		str.append(indent);
		str.append("HandlerChain["+this.sizeHandlerChain()+"]");	// NOI18N
		for(int i=0; i<this.sizeHandlerChain(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getHandlerChain(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(HANDLER_CHAIN, i, str, indent);
		}

	}
	public String dumpBeanNode(){
		StringBuffer str = new StringBuffer();
		str.append("ServiceRefHandlerChains\n");	// NOI18N
		this.dump(str, "\n  ");	// NOI18N
		return str.toString();
	}}

// END_NOI18N

