/**
 * This class is generated by jOOQ
 */
package org.jooq.test.jdbcoracle.generatedclasses.test.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TBookToBookStoreRecord extends org.jooq.impl.TableRecordImpl<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.TBookToBookStoreRecord> implements org.jooq.Record3<java.lang.String, java.math.BigDecimal, java.math.BigDecimal>, org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces.ITBookToBookStore {

	private static final long serialVersionUID = 1761970849;

	/**
	 * Setter for <code>TEST.T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME</code>. 
	 */
	@Override
	public void setBookStoreName(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>TEST.T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME</code>. 
	 */
	@Override
	public java.lang.String getBookStoreName() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>TEST.T_BOOK_TO_BOOK_STORE.BOOK_ID</code>. 
	 */
	@Override
	public void setBookId(java.math.BigDecimal value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>TEST.T_BOOK_TO_BOOK_STORE.BOOK_ID</code>. 
	 */
	@Override
	public java.math.BigDecimal getBookId() {
		return (java.math.BigDecimal) getValue(1);
	}

	/**
	 * Setter for <code>TEST.T_BOOK_TO_BOOK_STORE.STOCK</code>. 
	 */
	@Override
	public void setStock(java.math.BigDecimal value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>TEST.T_BOOK_TO_BOOK_STORE.STOCK</code>. 
	 */
	@Override
	public java.math.BigDecimal getStock() {
		return (java.math.BigDecimal) getValue(2);
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.String, java.math.BigDecimal, java.math.BigDecimal> fieldsRow() {
		return (org.jooq.Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.String, java.math.BigDecimal, java.math.BigDecimal> valuesRow() {
		return (org.jooq.Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return org.jooq.test.jdbcoracle.generatedclasses.test.tables.TBookToBookStore.BOOK_STORE_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field2() {
		return org.jooq.test.jdbcoracle.generatedclasses.test.tables.TBookToBookStore.BOOK_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field3() {
		return org.jooq.test.jdbcoracle.generatedclasses.test.tables.TBookToBookStore.STOCK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getBookStoreName();
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
	public java.math.BigDecimal value3() {
		return getStock();
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces.ITBookToBookStore from) {
		setBookStoreName(from.getBookStoreName());
		setBookId(from.getBookId());
		setStock(from.getStock());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces.ITBookToBookStore> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TBookToBookStoreRecord
	 */
	public TBookToBookStoreRecord() {
		super(org.jooq.test.jdbcoracle.generatedclasses.test.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE);
	}
}
