/**
 * This class is generated by jOOQ
 */
package org.jooq.test.jdbcoracle.generatedclasses.test.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Dr$iBookTitleContext$k extends org.jooq.impl.TableImpl<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.Dr$iBookTitleContext$kRecord> {

	private static final long serialVersionUID = -168103789;

	/**
	 * The singleton instance of <code>TEST.DR$I_BOOK_TITLE_CONTEXT$K</code>
	 */
	public static final org.jooq.test.jdbcoracle.generatedclasses.test.tables.Dr$iBookTitleContext$k DR$I_BOOK_TITLE_CONTEXT$K = new org.jooq.test.jdbcoracle.generatedclasses.test.tables.Dr$iBookTitleContext$k();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.Dr$iBookTitleContext$kRecord> getRecordType() {
		return org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.Dr$iBookTitleContext$kRecord.class;
	}

	/**
	 * The column <code>TEST.DR$I_BOOK_TITLE_CONTEXT$K.DOCID</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.Dr$iBookTitleContext$kRecord, java.math.BigDecimal> DOCID = createField("DOCID", org.jooq.impl.SQLDataType.NUMERIC, DR$I_BOOK_TITLE_CONTEXT$K);

	/**
	 * The column <code>TEST.DR$I_BOOK_TITLE_CONTEXT$K.TEXTKEY</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.Dr$iBookTitleContext$kRecord, java.lang.Object> TEXTKEY = createField("TEXTKEY", org.jooq.impl.SQLDataType.OTHER, DR$I_BOOK_TITLE_CONTEXT$K);

	/**
	 * No further instances allowed
	 */
	private Dr$iBookTitleContext$k() {
		super("DR$I_BOOK_TITLE_CONTEXT$K", org.jooq.test.jdbcoracle.generatedclasses.test.Test.TEST);
	}
}
