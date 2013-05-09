/**
 * This class is generated by jOOQ
 */
package org.jooq.test.jdbcoracle.generatedclasses.multi_schema.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TBookSaleRecord extends org.jooq.impl.TableRecordImpl<org.jooq.test.jdbcoracle.generatedclasses.multi_schema.tables.records.TBookSaleRecord> implements org.jooq.Record5<java.math.BigDecimal, java.math.BigDecimal, java.lang.String, java.sql.Date, java.math.BigDecimal>, org.jooq.test.jdbcoracle.generatedclasses.multi_schema.tables.interfaces.ITBookSale {

	private static final long serialVersionUID = 267351972;

	/**
	 * Setter for <code>MULTI_SCHEMA.T_BOOK_SALE.ID</code>. 
	 */
	@Override
	public void setId(java.math.BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>MULTI_SCHEMA.T_BOOK_SALE.ID</code>. 
	 */
	@Override
	public java.math.BigDecimal getId() {
		return (java.math.BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>MULTI_SCHEMA.T_BOOK_SALE.BOOK_ID</code>. 
	 */
	@Override
	public void setBookId(java.math.BigDecimal value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>MULTI_SCHEMA.T_BOOK_SALE.BOOK_ID</code>. 
	 */
	@Override
	public java.math.BigDecimal getBookId() {
		return (java.math.BigDecimal) getValue(1);
	}

	/**
	 * Setter for <code>MULTI_SCHEMA.T_BOOK_SALE.BOOK_STORE_NAME</code>. 
	 */
	@Override
	public void setBookStoreName(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>MULTI_SCHEMA.T_BOOK_SALE.BOOK_STORE_NAME</code>. 
	 */
	@Override
	public java.lang.String getBookStoreName() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>MULTI_SCHEMA.T_BOOK_SALE.SOLD_AT</code>. 
	 */
	@Override
	public void setSoldAt(java.sql.Date value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>MULTI_SCHEMA.T_BOOK_SALE.SOLD_AT</code>. 
	 */
	@Override
	public java.sql.Date getSoldAt() {
		return (java.sql.Date) getValue(3);
	}

	/**
	 * Setter for <code>MULTI_SCHEMA.T_BOOK_SALE.SOLD_FOR</code>. 
	 */
	@Override
	public void setSoldFor(java.math.BigDecimal value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>MULTI_SCHEMA.T_BOOK_SALE.SOLD_FOR</code>. 
	 */
	@Override
	public java.math.BigDecimal getSoldFor() {
		return (java.math.BigDecimal) getValue(4);
	}

	// -------------------------------------------------------------------------
	// Record5 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<java.math.BigDecimal, java.math.BigDecimal, java.lang.String, java.sql.Date, java.math.BigDecimal> fieldsRow() {
		return (org.jooq.Row5) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<java.math.BigDecimal, java.math.BigDecimal, java.lang.String, java.sql.Date, java.math.BigDecimal> valuesRow() {
		return (org.jooq.Row5) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field1() {
		return org.jooq.test.jdbcoracle.generatedclasses.multi_schema.tables.TBookSale.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field2() {
		return org.jooq.test.jdbcoracle.generatedclasses.multi_schema.tables.TBookSale.BOOK_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.jooq.test.jdbcoracle.generatedclasses.multi_schema.tables.TBookSale.BOOK_STORE_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Date> field4() {
		return org.jooq.test.jdbcoracle.generatedclasses.multi_schema.tables.TBookSale.SOLD_AT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field5() {
		return org.jooq.test.jdbcoracle.generatedclasses.multi_schema.tables.TBookSale.SOLD_FOR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value2() {
		return getBookId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getBookStoreName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Date value4() {
		return getSoldAt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value5() {
		return getSoldFor();
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.jdbcoracle.generatedclasses.multi_schema.tables.interfaces.ITBookSale from) {
		setId(from.getId());
		setBookId(from.getBookId());
		setBookStoreName(from.getBookStoreName());
		setSoldAt(from.getSoldAt());
		setSoldFor(from.getSoldFor());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.jdbcoracle.generatedclasses.multi_schema.tables.interfaces.ITBookSale> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TBookSaleRecord
	 */
	public TBookSaleRecord() {
		super(org.jooq.test.jdbcoracle.generatedclasses.multi_schema.tables.TBookSale.T_BOOK_SALE);
	}
}
