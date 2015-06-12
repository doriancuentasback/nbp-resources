/**
 *	This generated bean class TimerType matches the schema element 'timerType'.
 *  The root bean class is EjbJar
 *
 *	===============================================================
 *	
 *	
 *	        The timerType specifies an enterprise bean timer.  Each
 *	        timer is automatically created by the container upon
 *	        deployment.  Timer callbacks occur based on the 
 *	        schedule attributes.  All callbacks are made to the
 *	        timeout-method associated with the timer.  
 *	        
 *	        A timer can have an optional start and/or end date. If
 *	        a start date is specified, it takes precedence over the
 *	        associated timer schedule such that any matching
 *	        expirations prior to the start time will not occur.
 *	        Likewise, no matching expirations will occur after any
 *	        end date.   Start/End dates are specified using the
 *	        XML Schema dateTime type, which follows the ISO-8601
 *	        standard for date(and optional time-within-the-day) 
 *	        representation.
 *	        
 *	        An optional flag can be used to control whether
 *	        this timer has persistent(true) delivery semantics or
 *	        non-persistent(false) delivery semantics.  If not specified,
 *	        the value defaults to persistent(true).
 *	        
 *	        A time zone can optionally be associated with a timer.
 *	        If specified, the timer's schedule is evaluated in the context
 *	        of that time zone, regardless of the default time zone in which
 *	        the container is executing.   Time zones are specified as an
 *	        ID string.  The set of required time zone IDs is defined by
 *	        the Zone Name(TZ) column of the public domain zoneinfo database.
 *	        
 *	        An optional info string can be assigned to the timer and 
 *	        retrieved at runtime through the Timer.getInfo() method.
 *	        
 *	        The timerType can only be specified on stateless session
 *	        beans, singleton session beans, and message-driven beans.
 *	        
 *	      
 *	===============================================================
 * @Generated
 */

package org.netbeans.modules.j2ee.dd.impl.ejb.model_3_1;

import org.w3c.dom.*;
import org.netbeans.modules.schema2beans.*;
import java.beans.*;
import java.util.*;

// BEGIN_NOI18N

public class TimerType extends org.netbeans.modules.schema2beans.BaseBean
{

	static Vector comparators = new Vector();
	private static final org.netbeans.modules.schema2beans.Version runtimeVersion = new org.netbeans.modules.schema2beans.Version(5, 0, 0);
	;	// NOI18N

	static public final String ID = "Id";	// NOI18N
	static public final String DESCRIPTION = "Description";	// NOI18N
	static public final String DESCRIPTIONID = "DescriptionId";	// NOI18N
	static public final String DESCRIPTIONXMLLANG = "DescriptionXmlLang";	// NOI18N
	static public final String SCHEDULE = "Schedule";	// NOI18N
	static public final String START = "Start";	// NOI18N
	static public final String END = "End";	// NOI18N
	static public final String TIMEOUT_METHOD = "TimeoutMethod";	// NOI18N
	static public final String PERSISTENT = "Persistent";	// NOI18N
	static public final String TIMEZONE = "Timezone";	// NOI18N
	static public final String TIMEZONEID = "TimezoneId";	// NOI18N
	static public final String INFO = "Info";	// NOI18N
	static public final String INFOID = "InfoId";	// NOI18N

	public TimerType() {
		this(Common.USE_DEFAULT_VALUES);
	}

	public TimerType(int options)
	{
		super(comparators, runtimeVersion);
		// Properties (see root bean comments for the bean graph)
		initPropertyTables(8);
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
		this.createProperty("schedule", 	// NOI18N
			SCHEDULE, 
			Common.TYPE_1 | Common.TYPE_BEAN | Common.TYPE_KEY, 
			TimerScheduleType.class);
		this.createAttribute(SCHEDULE, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("start", 	// NOI18N
			START, 
			Common.TYPE_0_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.util.Calendar.class);
		this.createProperty("end", 	// NOI18N
			END, 
			Common.TYPE_0_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.util.Calendar.class);
		this.createProperty("timeout-method", 	// NOI18N
			TIMEOUT_METHOD, 
			Common.TYPE_1 | Common.TYPE_BEAN | Common.TYPE_KEY, 
			NamedMethod.class);
		this.createAttribute(TIMEOUT_METHOD, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("persistent", 	// NOI18N
			PERSISTENT, 
			Common.TYPE_0_1 | Common.TYPE_BOOLEAN | Common.TYPE_SHOULD_NOT_BE_EMPTY | Common.TYPE_KEY, 
			Boolean.class);
		this.createProperty("timezone", 	// NOI18N
			TIMEZONE, 
			Common.TYPE_0_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createAttribute(TIMEZONE, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("info", 	// NOI18N
			INFO, 
			Common.TYPE_0_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createAttribute(INFO, "id", "Id", 
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

	// This attribute is mandatory
	public void setSchedule(TimerScheduleType value) {
		this.setValue(SCHEDULE, value);
	}

	//
	public TimerScheduleType getSchedule() {
		return (TimerScheduleType)this.getValue(SCHEDULE);
	}

	// This attribute is optional
	public void setStart(java.util.Calendar value) {
		this.setValue(START, value);
	}

	//
	public java.util.Calendar getStart() {
		return (java.util.Calendar)this.getValue(START);
	}

	// This attribute is optional
	public void setEnd(java.util.Calendar value) {
		this.setValue(END, value);
	}

	//
	public java.util.Calendar getEnd() {
		return (java.util.Calendar)this.getValue(END);
	}

	// This attribute is mandatory
	public void setTimeoutMethod(org.netbeans.modules.j2ee.dd.api.ejb.NamedMethod valueInterface) {
		NamedMethod value = (NamedMethod) valueInterface;
		this.setValue(TIMEOUT_METHOD, value);
	}

	//
	public org.netbeans.modules.j2ee.dd.api.ejb.NamedMethod getTimeoutMethod() {
		return (NamedMethod)this.getValue(TIMEOUT_METHOD);
	}

	// This attribute is optional
	public void setPersistent(boolean value) {
		this.setValue(PERSISTENT, (value ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE));
	}

	//
	public boolean isPersistent() {
		Boolean ret = (Boolean)this.getValue(PERSISTENT);
		if (ret == null)
			ret = (Boolean)Common.defaultScalarValue(Common.TYPE_BOOLEAN);
		return ((java.lang.Boolean)ret).booleanValue();
	}

	// This attribute is optional
	public void setTimezone(java.lang.String value) {
		this.setValue(TIMEZONE, value);
	}

	//
	public java.lang.String getTimezone() {
		return (java.lang.String)this.getValue(TIMEZONE);
	}

	// This attribute is optional
	public void setTimezoneId(java.lang.String value) {
		// Make sure we've got a place to put this attribute.
		if (size(TIMEZONE) == 0) {
			setValue(TIMEZONE, "");
		}
		setAttributeValue(TIMEZONE, "Id", value);
	}

	//
	public java.lang.String getTimezoneId() {
		// If our element does not exist, then the attribute does not exist.
		if (size(TIMEZONE) == 0) {
			return null;
		} else {
			return getAttributeValue(TIMEZONE, "Id");
		}
	}

	// This attribute is optional
	public void setInfo(java.lang.String value) {
		this.setValue(INFO, value);
	}

	//
	public java.lang.String getInfo() {
		return (java.lang.String)this.getValue(INFO);
	}

	// This attribute is optional
	public void setInfoId(java.lang.String value) {
		// Make sure we've got a place to put this attribute.
		if (size(TIMEZONE) == 0) {
			setValue(TIMEZONE, "");
		}
		setAttributeValue(TIMEZONE, "Id", value);
	}

	//
	public java.lang.String getInfoId() {
		// If our element does not exist, then the attribute does not exist.
		if (size(TIMEZONE) == 0) {
			return null;
		} else {
			return getAttributeValue(TIMEZONE, "Id");
		}
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public TimerScheduleType newTimerScheduleType() {
		return new TimerScheduleType();
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public org.netbeans.modules.j2ee.dd.api.ejb.NamedMethod newNamedMethod() {
		return new NamedMethod();
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
		// Validating property schedule
		if (getSchedule() == null) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getSchedule() == null", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "schedule", this);	// NOI18N
		}
		getSchedule().validate();
		// Validating property start
		// Validating property end
		// Validating property timeoutMethod
		if (getTimeoutMethod() == null) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getTimeoutMethod() == null", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "timeoutMethod", this);	// NOI18N
		}
		((NamedMethod)getTimeoutMethod()).validate();
		// Validating property persistent
		{
			boolean patternPassed = false;
			if ((isPersistent() ? "true" : "false").matches("(true|false)")) {
				patternPassed = true;
			}
			restrictionFailure = !patternPassed;
		}
		if (restrictionFailure) {
			throw new org.netbeans.modules.schema2beans.ValidateException("isPersistent()", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "persistent", this);	// NOI18N
		}
		// Validating property timezone
		if (getTimezone() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getTimezone() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "timezone", this);	// NOI18N
			}
		}
		// Validating property timezoneId
		if (getTimezoneId() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getTimezoneId() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "timezoneId", this);	// NOI18N
			}
		}
		// Validating property info
		if (getInfo() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getInfo() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "info", this);	// NOI18N
			}
		}
		// Validating property infoId
		if (getInfoId() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getInfoId() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "infoId", this);	// NOI18N
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
		str.append("Schedule");	// NOI18N
		n = (org.netbeans.modules.schema2beans.BaseBean) this.getSchedule();
		if (n != null)
			n.dump(str, indent + "\t");	// NOI18N
		else
			str.append(indent+"\tnull");	// NOI18N
		this.dumpAttributes(SCHEDULE, 0, str, indent);

		str.append(indent);
		str.append("Start");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getStart();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(START, 0, str, indent);

		str.append(indent);
		str.append("End");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getEnd();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(END, 0, str, indent);

		str.append(indent);
		str.append("TimeoutMethod");	// NOI18N
		n = (org.netbeans.modules.schema2beans.BaseBean) this.getTimeoutMethod();
		if (n != null)
			n.dump(str, indent + "\t");	// NOI18N
		else
			str.append(indent+"\tnull");	// NOI18N
		this.dumpAttributes(TIMEOUT_METHOD, 0, str, indent);

		str.append(indent);
		str.append("Persistent");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append((this.isPersistent()?"true":"false"));
		this.dumpAttributes(PERSISTENT, 0, str, indent);

		str.append(indent);
		str.append("Timezone");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getTimezone();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(TIMEZONE, 0, str, indent);

		str.append(indent);
		str.append("Info");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getInfo();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(INFO, 0, str, indent);

	}
	public String dumpBeanNode(){
		StringBuffer str = new StringBuffer();
		str.append("TimerType\n");	// NOI18N
		this.dump(str, "\n  ");	// NOI18N
		return str.toString();
	}}

// END_NOI18N

