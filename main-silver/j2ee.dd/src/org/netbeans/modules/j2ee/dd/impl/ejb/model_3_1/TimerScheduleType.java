/**
 *	This generated bean class TimerScheduleType matches the schema element 'timer-scheduleType'.
 *  The root bean class is EjbJar
 *
 * @Generated
 */

package org.netbeans.modules.j2ee.dd.impl.ejb.model_3_1;

import org.w3c.dom.*;
import org.netbeans.modules.schema2beans.*;
import java.beans.*;
import java.util.*;

// BEGIN_NOI18N

public class TimerScheduleType extends org.netbeans.modules.schema2beans.BaseBean
{

	static Vector comparators = new Vector();
	private static final org.netbeans.modules.schema2beans.Version runtimeVersion = new org.netbeans.modules.schema2beans.Version(5, 0, 0);
	;	// NOI18N

	static public final String ID = "Id";	// NOI18N
	static public final String SECOND = "Second";	// NOI18N
	static public final String SECONDID = "SecondId";	// NOI18N
	static public final String MINUTE = "Minute";	// NOI18N
	static public final String MINUTEID = "MinuteId";	// NOI18N
	static public final String HOUR = "Hour";	// NOI18N
	static public final String HOURID = "HourId";	// NOI18N
	static public final String DAY_OF_MONTH = "DayOfMonth";	// NOI18N
	static public final String DAYOFMONTHID = "DayOfMonthId";	// NOI18N
	static public final String MONTH = "Month";	// NOI18N
	static public final String MONTHID = "MonthId";	// NOI18N
	static public final String DAY_OF_WEEK = "DayOfWeek";	// NOI18N
	static public final String DAYOFWEEKID = "DayOfWeekId";	// NOI18N
	static public final String YEAR = "Year";	// NOI18N
	static public final String YEARID = "YearId";	// NOI18N

	public TimerScheduleType() {
		this(Common.USE_DEFAULT_VALUES);
	}

	public TimerScheduleType(int options)
	{
		super(comparators, runtimeVersion);
		// Properties (see root bean comments for the bean graph)
		initPropertyTables(7);
		this.createProperty("second", 	// NOI18N
			SECOND, 
			Common.TYPE_0_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createAttribute(SECOND, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("minute", 	// NOI18N
			MINUTE, 
			Common.TYPE_0_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createAttribute(MINUTE, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("hour", 	// NOI18N
			HOUR, 
			Common.TYPE_0_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createAttribute(HOUR, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("day-of-month", 	// NOI18N
			DAY_OF_MONTH, 
			Common.TYPE_0_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createAttribute(DAY_OF_MONTH, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("month", 	// NOI18N
			MONTH, 
			Common.TYPE_0_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createAttribute(MONTH, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("day-of-week", 	// NOI18N
			DAY_OF_WEEK, 
			Common.TYPE_0_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createAttribute(DAY_OF_WEEK, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("year", 	// NOI18N
			YEAR, 
			Common.TYPE_0_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createAttribute(YEAR, "id", "Id", 
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
	public void setSecond(java.lang.String value) {
		this.setValue(SECOND, value);
	}

	//
	public java.lang.String getSecond() {
		return (java.lang.String)this.getValue(SECOND);
	}

	// This attribute is optional
	public void setSecondId(java.lang.String value) {
		// Make sure we've got a place to put this attribute.
		if (size(SECOND) == 0) {
			setValue(SECOND, "");
		}
		setAttributeValue(SECOND, "Id", value);
	}

	//
	public java.lang.String getSecondId() {
		// If our element does not exist, then the attribute does not exist.
		if (size(SECOND) == 0) {
			return null;
		} else {
			return getAttributeValue(SECOND, "Id");
		}
	}

	// This attribute is optional
	public void setMinute(java.lang.String value) {
		this.setValue(MINUTE, value);
	}

	//
	public java.lang.String getMinute() {
		return (java.lang.String)this.getValue(MINUTE);
	}

	// This attribute is optional
	public void setMinuteId(java.lang.String value) {
		// Make sure we've got a place to put this attribute.
		if (size(SECOND) == 0) {
			setValue(SECOND, "");
		}
		setAttributeValue(SECOND, "Id", value);
	}

	//
	public java.lang.String getMinuteId() {
		// If our element does not exist, then the attribute does not exist.
		if (size(SECOND) == 0) {
			return null;
		} else {
			return getAttributeValue(SECOND, "Id");
		}
	}

	// This attribute is optional
	public void setHour(java.lang.String value) {
		this.setValue(HOUR, value);
	}

	//
	public java.lang.String getHour() {
		return (java.lang.String)this.getValue(HOUR);
	}

	// This attribute is optional
	public void setHourId(java.lang.String value) {
		// Make sure we've got a place to put this attribute.
		if (size(SECOND) == 0) {
			setValue(SECOND, "");
		}
		setAttributeValue(SECOND, "Id", value);
	}

	//
	public java.lang.String getHourId() {
		// If our element does not exist, then the attribute does not exist.
		if (size(SECOND) == 0) {
			return null;
		} else {
			return getAttributeValue(SECOND, "Id");
		}
	}

	// This attribute is optional
	public void setDayOfMonth(java.lang.String value) {
		this.setValue(DAY_OF_MONTH, value);
	}

	//
	public java.lang.String getDayOfMonth() {
		return (java.lang.String)this.getValue(DAY_OF_MONTH);
	}

	// This attribute is optional
	public void setDayOfMonthId(java.lang.String value) {
		// Make sure we've got a place to put this attribute.
		if (size(SECOND) == 0) {
			setValue(SECOND, "");
		}
		setAttributeValue(SECOND, "Id", value);
	}

	//
	public java.lang.String getDayOfMonthId() {
		// If our element does not exist, then the attribute does not exist.
		if (size(SECOND) == 0) {
			return null;
		} else {
			return getAttributeValue(SECOND, "Id");
		}
	}

	// This attribute is optional
	public void setMonth(java.lang.String value) {
		this.setValue(MONTH, value);
	}

	//
	public java.lang.String getMonth() {
		return (java.lang.String)this.getValue(MONTH);
	}

	// This attribute is optional
	public void setMonthId(java.lang.String value) {
		// Make sure we've got a place to put this attribute.
		if (size(SECOND) == 0) {
			setValue(SECOND, "");
		}
		setAttributeValue(SECOND, "Id", value);
	}

	//
	public java.lang.String getMonthId() {
		// If our element does not exist, then the attribute does not exist.
		if (size(SECOND) == 0) {
			return null;
		} else {
			return getAttributeValue(SECOND, "Id");
		}
	}

	// This attribute is optional
	public void setDayOfWeek(java.lang.String value) {
		this.setValue(DAY_OF_WEEK, value);
	}

	//
	public java.lang.String getDayOfWeek() {
		return (java.lang.String)this.getValue(DAY_OF_WEEK);
	}

	// This attribute is optional
	public void setDayOfWeekId(java.lang.String value) {
		// Make sure we've got a place to put this attribute.
		if (size(SECOND) == 0) {
			setValue(SECOND, "");
		}
		setAttributeValue(SECOND, "Id", value);
	}

	//
	public java.lang.String getDayOfWeekId() {
		// If our element does not exist, then the attribute does not exist.
		if (size(SECOND) == 0) {
			return null;
		} else {
			return getAttributeValue(SECOND, "Id");
		}
	}

	// This attribute is optional
	public void setYear(java.lang.String value) {
		this.setValue(YEAR, value);
	}

	//
	public java.lang.String getYear() {
		return (java.lang.String)this.getValue(YEAR);
	}

	// This attribute is optional
	public void setYearId(java.lang.String value) {
		// Make sure we've got a place to put this attribute.
		if (size(SECOND) == 0) {
			setValue(SECOND, "");
		}
		setAttributeValue(SECOND, "Id", value);
	}

	//
	public java.lang.String getYearId() {
		// If our element does not exist, then the attribute does not exist.
		if (size(SECOND) == 0) {
			return null;
		} else {
			return getAttributeValue(SECOND, "Id");
		}
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
		// Validating property second
		if (getSecond() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getSecond() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "second", this);	// NOI18N
			}
		}
		// Validating property secondId
		if (getSecondId() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getSecondId() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "secondId", this);	// NOI18N
			}
		}
		// Validating property minute
		if (getMinute() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getMinute() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "minute", this);	// NOI18N
			}
		}
		// Validating property minuteId
		if (getMinuteId() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getMinuteId() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "minuteId", this);	// NOI18N
			}
		}
		// Validating property hour
		if (getHour() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getHour() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "hour", this);	// NOI18N
			}
		}
		// Validating property hourId
		if (getHourId() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getHourId() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "hourId", this);	// NOI18N
			}
		}
		// Validating property dayOfMonth
		if (getDayOfMonth() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getDayOfMonth() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "dayOfMonth", this);	// NOI18N
			}
		}
		// Validating property dayOfMonthId
		if (getDayOfMonthId() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getDayOfMonthId() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "dayOfMonthId", this);	// NOI18N
			}
		}
		// Validating property month
		if (getMonth() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getMonth() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "month", this);	// NOI18N
			}
		}
		// Validating property monthId
		if (getMonthId() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getMonthId() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "monthId", this);	// NOI18N
			}
		}
		// Validating property dayOfWeek
		if (getDayOfWeek() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getDayOfWeek() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "dayOfWeek", this);	// NOI18N
			}
		}
		// Validating property dayOfWeekId
		if (getDayOfWeekId() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getDayOfWeekId() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "dayOfWeekId", this);	// NOI18N
			}
		}
		// Validating property year
		if (getYear() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getYear() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "year", this);	// NOI18N
			}
		}
		// Validating property yearId
		if (getYearId() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getYearId() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "yearId", this);	// NOI18N
			}
		}
	}

	// Dump the content of this bean returning it as a String
	public void dump(StringBuffer str, String indent){
		String s;
		Object o;
		org.netbeans.modules.schema2beans.BaseBean n;
		str.append(indent);
		str.append("Second");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getSecond();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(SECOND, 0, str, indent);

		str.append(indent);
		str.append("Minute");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getMinute();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(MINUTE, 0, str, indent);

		str.append(indent);
		str.append("Hour");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getHour();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(HOUR, 0, str, indent);

		str.append(indent);
		str.append("DayOfMonth");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getDayOfMonth();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(DAY_OF_MONTH, 0, str, indent);

		str.append(indent);
		str.append("Month");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getMonth();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(MONTH, 0, str, indent);

		str.append(indent);
		str.append("DayOfWeek");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getDayOfWeek();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(DAY_OF_WEEK, 0, str, indent);

		str.append(indent);
		str.append("Year");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getYear();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(YEAR, 0, str, indent);

	}
	public String dumpBeanNode(){
		StringBuffer str = new StringBuffer();
		str.append("TimerScheduleType\n");	// NOI18N
		this.dump(str, "\n  ");	// NOI18N
		return str.toString();
	}}

// END_NOI18N

