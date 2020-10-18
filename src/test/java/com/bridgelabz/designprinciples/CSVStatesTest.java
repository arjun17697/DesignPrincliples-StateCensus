package com.bridgelabz.designprinciples;



	import static org.junit.Assert.assertTrue;
	import org.junit.Test;
	import com.bridgelabz.designprinciples.CensusException.ExceptionType;
	import junit.framework.Assert;

	public class CSVStatesTest {
		private static final String CSV_FILE_STATES = "C:\\Users\\HP LAP\\Desktop\\BridgeLabz\\DesignPrinciples\\designprinciples\\IndiaStateCode.CSV";
		private static final String CSV_FILE_INCOR_STATES = "C:\\Users\\HP LAP\\Desktop\\BridgeLabz\\DesignPrinciples\\designprinciples\\IndiaStateCode1.CSV";
		private static final String CSV_FILE_DELIMITER_STATES = "C:\\Users\\HP LAP\\Desktop\\BridgeLabz\\DesignPrinciples\\designprinciples\\InvalidDelimiterStates.CSV";
		private static final String CSV_FILE_HEADER_STATES= "C:\\Users\\HP LAP\\Desktop\\BridgeLabz\\DesignPrinciples\\designprinciples\\InvalidHeaderStates.CSV";

		/**
		 * Rigorous Test :-)
		 * 
		 */
		@Test
		public void givenCensusFileNumberOfRecordsMatches() throws Exception {
			int num = new CSVStates().CSVStateCodeLoader(CSV_FILE_STATES);
			Assert.assertEquals(37, num);
		}

		@Test
		public void testThrowsExceptionWhenInvalidFileUsed() throws CensusException {
			boolean thrown = false;
			try {
				new CSVStates().CSVStateCodeLoader(CSV_FILE_INCOR_STATES);
			} catch (Exception e) {
				thrown = true;
				System.out.println("Provided file is incorrect.Please retry");
			}
			assertTrue(thrown);
		}

		@Test
		public void testThrowsExceptionWhenInvalidDelimiterUsed() {
			boolean thrown = false;
			try {
				new CSVStates().CSVStateCodeLoader(CSV_FILE_DELIMITER_STATES);
			} catch (Exception e) {
				thrown = true;
				System.out.println("Provided delimiter in file is incorrect.Please retry");
			}
			assertTrue(thrown);
		}
		
		@Test
		public void testThrowsExceptionWhenInvalidHeaderUsed() {
			boolean thrown = false;
			try {
				new CSVStates().CSVStateCodeLoader(CSV_FILE_HEADER_STATES);
			} catch (Exception e) {
				thrown = true;
				System.out.println("Provided header in file is incorrect.Please retry");
			}
			assertTrue(thrown);
		}
	}