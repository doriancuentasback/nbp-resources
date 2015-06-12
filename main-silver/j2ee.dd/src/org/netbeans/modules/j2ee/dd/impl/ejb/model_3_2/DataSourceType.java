/**
 *	This generated bean class DataSourceType matches the schema element 'data-sourceType'.
 *  The root bean class is EjbJar
 *
 *	===============================================================
 *	
 *	
 *	        Configuration of a DataSource.
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

public class DataSourceType extends org.netbeans.modules.schema2beans.BaseBean
{

	static Vector comparators = new Vector();
	private static final org.netbeans.modules.schema2beans.Version runtimeVersion = new org.netbeans.modules.schema2beans.Version(5, 0, 0);
	;	// NOI18N

	static public final String ID = "Id";	// NOI18N
	static public final String DESCRIPTION = "Description";	// NOI18N
	static public final String DESCRIPTIONID = "DescriptionId";	// NOI18N
	static public final String DESCRIPTIONXMLLANG = "DescriptionXmlLang";	// NOI18N
	static public final String NAME = "Name";	// NOI18N
	static public final String CLASS_NAME = "ClassName";	// NOI18N
	static public final String SERVER_NAME = "ServerName";	// NOI18N
	static public final String SERVERNAMEID = "ServerNameId";	// NOI18N
	static public final String PORT_NUMBER = "PortNumber";	// NOI18N
	static public final String PORTNUMBERID = "PortNumberId";	// NOI18N
	static public final String DATABASE_NAME = "DatabaseName";	// NOI18N
	static public final String DATABASENAMEID = "DatabaseNameId";	// NOI18N
	static public final String URL = "Url";	// NOI18N
	static public final String USER = "User";	// NOI18N
	static public final String USERID = "UserId";	// NOI18N
	static public final String PASSWORD = "Password";	// NOI18N
	static public final String PASSWORDID = "PasswordId";	// NOI18N
	static public final String PROPERTY2 = "Property2";	// NOI18N
	static public final String LOGIN_TIMEOUT = "LoginTimeout";	// NOI18N
	static public final String LOGINTIMEOUTID = "LoginTimeoutId";	// NOI18N
	static public final String TRANSACTIONAL = "Transactional";	// NOI18N
	static public final String TRANSACTIONALID = "TransactionalId";	// NOI18N
	static public final String ISOLATION_LEVEL = "IsolationLevel";	// NOI18N
	static public final String INITIAL_POOL_SIZE = "InitialPoolSize";	// NOI18N
	static public final String INITIALPOOLSIZEID = "InitialPoolSizeId";	// NOI18N
	static public final String MAX_POOL_SIZE = "MaxPoolSize";	// NOI18N
	static public final String MAXPOOLSIZEID = "MaxPoolSizeId";	// NOI18N
	static public final String MIN_POOL_SIZE = "MinPoolSize";	// NOI18N
	static public final String MINPOOLSIZEID = "MinPoolSizeId";	// NOI18N
	static public final String MAX_IDLE_TIME = "MaxIdleTime";	// NOI18N
	static public final String MAXIDLETIMEID = "MaxIdleTimeId";	// NOI18N
	static public final String MAX_STATEMENTS = "MaxStatements";	// NOI18N
	static public final String MAXSTATEMENTSID = "MaxStatementsId";	// NOI18N

	public DataSourceType() {
		this(Common.USE_DEFAULT_VALUES);
	}

	public DataSourceType(int options)
	{
		super(comparators, runtimeVersion);
		// Properties (see root bean comments for the bean graph)
		initPropertyTables(18);
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
		this.createProperty("class-name", 	// NOI18N
			CLASS_NAME, 
			Common.TYPE_0_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createProperty("server-name", 	// NOI18N
			SERVER_NAME, 
			Common.TYPE_0_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createAttribute(SERVER_NAME, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("port-number", 	// NOI18N
			PORT_NUMBER, 
			Common.TYPE_0_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.math.BigInteger.class);
		this.createAttribute(PORT_NUMBER, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("database-name", 	// NOI18N
			DATABASE_NAME, 
			Common.TYPE_0_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createAttribute(DATABASE_NAME, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("url", 	// NOI18N
			URL, 
			Common.TYPE_0_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
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
		this.createProperty("property", 	// NOI18N
			PROPERTY2, 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			Property.class);
		this.createAttribute(PROPERTY2, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("login-timeout", 	// NOI18N
			LOGIN_TIMEOUT, 
			Common.TYPE_0_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.math.BigInteger.class);
		this.createAttribute(LOGIN_TIMEOUT, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("transactional", 	// NOI18N
			TRANSACTIONAL, 
			Common.TYPE_0_1 | Common.TYPE_BOOLEAN | Common.TYPE_SHOULD_NOT_BE_EMPTY | Common.TYPE_KEY, 
			Boolean.class);
		this.createAttribute(TRANSACTIONAL, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("isolation-level", 	// NOI18N
			ISOLATION_LEVEL, 
			Common.TYPE_0_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createProperty("initial-pool-size", 	// NOI18N
			INITIAL_POOL_SIZE, 
			Common.TYPE_0_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.math.BigInteger.class);
		this.createAttribute(INITIAL_POOL_SIZE, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("max-pool-size", 	// NOI18N
			MAX_POOL_SIZE, 
			Common.TYPE_0_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.math.BigInteger.class);
		this.createAttribute(MAX_POOL_SIZE, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("min-pool-size", 	// NOI18N
			MIN_POOL_SIZE, 
			Common.TYPE_0_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.math.BigInteger.class);
		this.createAttribute(MIN_POOL_SIZE, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("max-idle-time", 	// NOI18N
			MAX_IDLE_TIME, 
			Common.TYPE_0_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.math.BigInteger.class);
		this.createAttribute(MAX_IDLE_TIME, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("max-statements", 	// NOI18N
			MAX_STATEMENTS, 
			Common.TYPE_0_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.math.BigInteger.class);
		this.createAttribute(MAX_STATEMENTS, "id", "Id", 
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
	public void setClassName(java.lang.String value) {
		this.setValue(CLASS_NAME, value);
	}

	//
	public java.lang.String getClassName() {
		return (java.lang.String)this.getValue(CLASS_NAME);
	}

	// This attribute is optional
	public void setServerName(java.lang.String value) {
		this.setValue(SERVER_NAME, value);
	}

	//
	public java.lang.String getServerName() {
		return (java.lang.String)this.getValue(SERVER_NAME);
	}

	// This attribute is optional
	public void setServerNameId(java.lang.String value) {
		// Make sure we've got a place to put this attribute.
		if (size(SERVER_NAME) == 0) {
			setValue(SERVER_NAME, "");
		}
		setAttributeValue(SERVER_NAME, "Id", value);
	}

	//
	public java.lang.String getServerNameId() {
		// If our element does not exist, then the attribute does not exist.
		if (size(SERVER_NAME) == 0) {
			return null;
		} else {
			return getAttributeValue(SERVER_NAME, "Id");
		}
	}

	// This attribute is optional
	public void setPortNumber(java.math.BigInteger value) {
		this.setValue(PORT_NUMBER, value);
	}

	//
	public java.math.BigInteger getPortNumber() {
		return (java.math.BigInteger)this.getValue(PORT_NUMBER);
	}

	// This attribute is optional
	public void setPortNumberId(java.lang.String value) {
		// Make sure we've got a place to put this attribute.
		if (size(PORT_NUMBER) == 0) {
			setValue(PORT_NUMBER, "");
		}
		setAttributeValue(PORT_NUMBER, "Id", value);
	}

	//
	public java.lang.String getPortNumberId() {
		// If our element does not exist, then the attribute does not exist.
		if (size(PORT_NUMBER) == 0) {
			return null;
		} else {
			return getAttributeValue(PORT_NUMBER, "Id");
		}
	}

	// This attribute is optional
	public void setDatabaseName(java.lang.String value) {
		this.setValue(DATABASE_NAME, value);
	}

	//
	public java.lang.String getDatabaseName() {
		return (java.lang.String)this.getValue(DATABASE_NAME);
	}

	// This attribute is optional
	public void setDatabaseNameId(java.lang.String value) {
		// Make sure we've got a place to put this attribute.
		if (size(SERVER_NAME) == 0) {
			setValue(SERVER_NAME, "");
		}
		setAttributeValue(SERVER_NAME, "Id", value);
	}

	//
	public java.lang.String getDatabaseNameId() {
		// If our element does not exist, then the attribute does not exist.
		if (size(SERVER_NAME) == 0) {
			return null;
		} else {
			return getAttributeValue(SERVER_NAME, "Id");
		}
	}

	// This attribute is optional
	public void setUrl(java.lang.String value) {
		this.setValue(URL, value);
	}

	//
	public java.lang.String getUrl() {
		return (java.lang.String)this.getValue(URL);
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
		if (size(SERVER_NAME) == 0) {
			setValue(SERVER_NAME, "");
		}
		setAttributeValue(SERVER_NAME, "Id", value);
	}

	//
	public java.lang.String getUserId() {
		// If our element does not exist, then the attribute does not exist.
		if (size(SERVER_NAME) == 0) {
			return null;
		} else {
			return getAttributeValue(SERVER_NAME, "Id");
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
		if (size(SERVER_NAME) == 0) {
			setValue(SERVER_NAME, "");
		}
		setAttributeValue(SERVER_NAME, "Id", value);
	}

	//
	public java.lang.String getPasswordId() {
		// If our element does not exist, then the attribute does not exist.
		if (size(SERVER_NAME) == 0) {
			return null;
		} else {
			return getAttributeValue(SERVER_NAME, "Id");
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

	// This attribute is optional
	public void setLoginTimeout(java.math.BigInteger value) {
		this.setValue(LOGIN_TIMEOUT, value);
	}

	//
	public java.math.BigInteger getLoginTimeout() {
		return (java.math.BigInteger)this.getValue(LOGIN_TIMEOUT);
	}

	// This attribute is optional
	public void setLoginTimeoutId(java.lang.String value) {
		// Make sure we've got a place to put this attribute.
		if (size(PORT_NUMBER) == 0) {
			setValue(PORT_NUMBER, "");
		}
		setAttributeValue(PORT_NUMBER, "Id", value);
	}

	//
	public java.lang.String getLoginTimeoutId() {
		// If our element does not exist, then the attribute does not exist.
		if (size(PORT_NUMBER) == 0) {
			return null;
		} else {
			return getAttributeValue(PORT_NUMBER, "Id");
		}
	}

	// This attribute is optional
	public void setTransactional(boolean value) {
		this.setValue(TRANSACTIONAL, (value ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE));
	}

	//
	public boolean isTransactional() {
		Boolean ret = (Boolean)this.getValue(TRANSACTIONAL);
		if (ret == null)
			ret = (Boolean)Common.defaultScalarValue(Common.TYPE_BOOLEAN);
		return ((java.lang.Boolean)ret).booleanValue();
	}

	// This attribute is optional
	public void setTransactionalId(java.lang.String value) {
		// Make sure we've got a place to put this attribute.
		if (size(TRANSACTIONAL) == 0) {
			setValue(TRANSACTIONAL, "");
		}
		setAttributeValue(TRANSACTIONAL, "Id", value);
	}

	//
	public java.lang.String getTransactionalId() {
		// If our element does not exist, then the attribute does not exist.
		if (size(TRANSACTIONAL) == 0) {
			return null;
		} else {
			return getAttributeValue(TRANSACTIONAL, "Id");
		}
	}

	// This attribute is optional
	public void setIsolationLevel(java.lang.String value) {
		this.setValue(ISOLATION_LEVEL, value);
	}

	//
	public java.lang.String getIsolationLevel() {
		return (java.lang.String)this.getValue(ISOLATION_LEVEL);
	}

	// This attribute is optional
	public void setInitialPoolSize(java.math.BigInteger value) {
		this.setValue(INITIAL_POOL_SIZE, value);
	}

	//
	public java.math.BigInteger getInitialPoolSize() {
		return (java.math.BigInteger)this.getValue(INITIAL_POOL_SIZE);
	}

	// This attribute is optional
	public void setInitialPoolSizeId(java.lang.String value) {
		// Make sure we've got a place to put this attribute.
		if (size(PORT_NUMBER) == 0) {
			setValue(PORT_NUMBER, "");
		}
		setAttributeValue(PORT_NUMBER, "Id", value);
	}

	//
	public java.lang.String getInitialPoolSizeId() {
		// If our element does not exist, then the attribute does not exist.
		if (size(PORT_NUMBER) == 0) {
			return null;
		} else {
			return getAttributeValue(PORT_NUMBER, "Id");
		}
	}

	// This attribute is optional
	public void setMaxPoolSize(java.math.BigInteger value) {
		this.setValue(MAX_POOL_SIZE, value);
	}

	//
	public java.math.BigInteger getMaxPoolSize() {
		return (java.math.BigInteger)this.getValue(MAX_POOL_SIZE);
	}

	// This attribute is optional
	public void setMaxPoolSizeId(java.lang.String value) {
		// Make sure we've got a place to put this attribute.
		if (size(PORT_NUMBER) == 0) {
			setValue(PORT_NUMBER, "");
		}
		setAttributeValue(PORT_NUMBER, "Id", value);
	}

	//
	public java.lang.String getMaxPoolSizeId() {
		// If our element does not exist, then the attribute does not exist.
		if (size(PORT_NUMBER) == 0) {
			return null;
		} else {
			return getAttributeValue(PORT_NUMBER, "Id");
		}
	}

	// This attribute is optional
	public void setMinPoolSize(java.math.BigInteger value) {
		this.setValue(MIN_POOL_SIZE, value);
	}

	//
	public java.math.BigInteger getMinPoolSize() {
		return (java.math.BigInteger)this.getValue(MIN_POOL_SIZE);
	}

	// This attribute is optional
	public void setMinPoolSizeId(java.lang.String value) {
		// Make sure we've got a place to put this attribute.
		if (size(PORT_NUMBER) == 0) {
			setValue(PORT_NUMBER, "");
		}
		setAttributeValue(PORT_NUMBER, "Id", value);
	}

	//
	public java.lang.String getMinPoolSizeId() {
		// If our element does not exist, then the attribute does not exist.
		if (size(PORT_NUMBER) == 0) {
			return null;
		} else {
			return getAttributeValue(PORT_NUMBER, "Id");
		}
	}

	// This attribute is optional
	public void setMaxIdleTime(java.math.BigInteger value) {
		this.setValue(MAX_IDLE_TIME, value);
	}

	//
	public java.math.BigInteger getMaxIdleTime() {
		return (java.math.BigInteger)this.getValue(MAX_IDLE_TIME);
	}

	// This attribute is optional
	public void setMaxIdleTimeId(java.lang.String value) {
		// Make sure we've got a place to put this attribute.
		if (size(PORT_NUMBER) == 0) {
			setValue(PORT_NUMBER, "");
		}
		setAttributeValue(PORT_NUMBER, "Id", value);
	}

	//
	public java.lang.String getMaxIdleTimeId() {
		// If our element does not exist, then the attribute does not exist.
		if (size(PORT_NUMBER) == 0) {
			return null;
		} else {
			return getAttributeValue(PORT_NUMBER, "Id");
		}
	}

	// This attribute is optional
	public void setMaxStatements(java.math.BigInteger value) {
		this.setValue(MAX_STATEMENTS, value);
	}

	//
	public java.math.BigInteger getMaxStatements() {
		return (java.math.BigInteger)this.getValue(MAX_STATEMENTS);
	}

	// This attribute is optional
	public void setMaxStatementsId(java.lang.String value) {
		// Make sure we've got a place to put this attribute.
		if (size(PORT_NUMBER) == 0) {
			setValue(PORT_NUMBER, "");
		}
		setAttributeValue(PORT_NUMBER, "Id", value);
	}

	//
	public java.lang.String getMaxStatementsId() {
		// If our element does not exist, then the attribute does not exist.
		if (size(PORT_NUMBER) == 0) {
			return null;
		} else {
			return getAttributeValue(PORT_NUMBER, "Id");
		}
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
		// Validating property className
		// Validating property serverName
		if (getServerName() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getServerName() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "serverName", this);	// NOI18N
			}
		}
		// Validating property serverNameId
		if (getServerNameId() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getServerNameId() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "serverNameId", this);	// NOI18N
			}
		}
		// Validating property portNumber
		// Validating property portNumberId
		if (getPortNumberId() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getPortNumberId() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "portNumberId", this);	// NOI18N
			}
		}
		// Validating property databaseName
		if (getDatabaseName() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getDatabaseName() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "databaseName", this);	// NOI18N
			}
		}
		// Validating property databaseNameId
		if (getDatabaseNameId() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getDatabaseNameId() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "databaseNameId", this);	// NOI18N
			}
		}
		// Validating property url
		if (getUrl() != null) {
			{
				boolean patternPassed = false;
				if ((getUrl()).matches("jdbc:(.*):(.*)")) {
					patternPassed = true;
				}
				restrictionFailure = !patternPassed;
			}
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getUrl()", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "url", this);	// NOI18N
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
		// Validating property property2
		for (int _index = 0; _index < sizeProperty2(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2.Property element = (org.netbeans.modules.j2ee.dd.impl.ejb.model_3_2.Property) getProperty2(_index);
			if (element != null) {
				((Property)element).validate();
			}
		}
		// Validating property loginTimeout
		// Validating property loginTimeoutId
		if (getLoginTimeoutId() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getLoginTimeoutId() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "loginTimeoutId", this);	// NOI18N
			}
		}
		// Validating property transactional
		// Validating property transactionalId
		if (getTransactionalId() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getTransactionalId() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "transactionalId", this);	// NOI18N
			}
		}
		// Validating property isolationLevel
		if (getIsolationLevel() != null) {
			final java.lang.String[] enumRestrictionIsolationLevel = {"TRANSACTION_READ_UNCOMMITTED", "TRANSACTION_READ_COMMITTED", "TRANSACTION_REPEATABLE_READ", "TRANSACTION_SERIALIZABLE"};
			restrictionFailure = true;
			for (int _index2 = 0; 
				_index2 < enumRestrictionIsolationLevel.length; ++_index2) {
				if (enumRestrictionIsolationLevel[_index2].equals(getIsolationLevel())) {
					restrictionFailure = false;
					break;
				}
			}
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getIsolationLevel() enumeration test", org.netbeans.modules.schema2beans.ValidateException.FailureType.ENUM_RESTRICTION, "isolationLevel", this);	// NOI18N
			}
		}
		// Validating property initialPoolSize
		// Validating property initialPoolSizeId
		if (getInitialPoolSizeId() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getInitialPoolSizeId() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "initialPoolSizeId", this);	// NOI18N
			}
		}
		// Validating property maxPoolSize
		// Validating property maxPoolSizeId
		if (getMaxPoolSizeId() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getMaxPoolSizeId() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "maxPoolSizeId", this);	// NOI18N
			}
		}
		// Validating property minPoolSize
		// Validating property minPoolSizeId
		if (getMinPoolSizeId() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getMinPoolSizeId() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "minPoolSizeId", this);	// NOI18N
			}
		}
		// Validating property maxIdleTime
		// Validating property maxIdleTimeId
		if (getMaxIdleTimeId() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getMaxIdleTimeId() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "maxIdleTimeId", this);	// NOI18N
			}
		}
		// Validating property maxStatements
		// Validating property maxStatementsId
		if (getMaxStatementsId() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getMaxStatementsId() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "maxStatementsId", this);	// NOI18N
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
		str.append("ClassName");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getClassName();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(CLASS_NAME, 0, str, indent);

		str.append(indent);
		str.append("ServerName");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getServerName();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(SERVER_NAME, 0, str, indent);

		str.append(indent);
		str.append("PortNumber");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getPortNumber();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(PORT_NUMBER, 0, str, indent);

		str.append(indent);
		str.append("DatabaseName");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getDatabaseName();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(DATABASE_NAME, 0, str, indent);

		str.append(indent);
		str.append("Url");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getUrl();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(URL, 0, str, indent);

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

		str.append(indent);
		str.append("LoginTimeout");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getLoginTimeout();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(LOGIN_TIMEOUT, 0, str, indent);

		str.append(indent);
		str.append("Transactional");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append((this.isTransactional()?"true":"false"));
		this.dumpAttributes(TRANSACTIONAL, 0, str, indent);

		str.append(indent);
		str.append("IsolationLevel");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getIsolationLevel();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(ISOLATION_LEVEL, 0, str, indent);

		str.append(indent);
		str.append("InitialPoolSize");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getInitialPoolSize();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(INITIAL_POOL_SIZE, 0, str, indent);

		str.append(indent);
		str.append("MaxPoolSize");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getMaxPoolSize();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(MAX_POOL_SIZE, 0, str, indent);

		str.append(indent);
		str.append("MinPoolSize");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getMinPoolSize();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(MIN_POOL_SIZE, 0, str, indent);

		str.append(indent);
		str.append("MaxIdleTime");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getMaxIdleTime();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(MAX_IDLE_TIME, 0, str, indent);

		str.append(indent);
		str.append("MaxStatements");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getMaxStatements();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(MAX_STATEMENTS, 0, str, indent);

	}
	public String dumpBeanNode(){
		StringBuffer str = new StringBuffer();
		str.append("DataSourceType\n");	// NOI18N
		this.dump(str, "\n  ");	// NOI18N
		return str.toString();
	}}

// END_NOI18N

