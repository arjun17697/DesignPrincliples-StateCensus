package com.bridgelabz.designprinciples;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.bridgelabz.designprinciples.CensusException.ExceptionType;

import junit.framework.Assert;

public class StateCensusAnalyserTest {
	private static final String CSV_FILE = "C:\\Users\\HP LAP\\Desktop\\BridgeLabz\\DesignPrinciples\\designprinciples\\IndiaStateCensusData.CSV";
	private static final String CSV_FILE_INCOR = "C:\\Users\\HP LAP\\Desktop\\BridgeLabz\\DesignPrinciples\\designprinciples\\IndiaStateCensusData1.CSV";
	private static final String CSV_FILE_DELIMITER = "C:\\Users\\HP LAP\\Desktop\\BridgeLabz\\DesignPrinciples\\designprinciples\\InvalidDelimiter.CSV";
	private static final String CSV_FILE_HEADER = "C:\\Users\\HP LAP\\Desktop\\BridgeLabz\\DesignPrinciples\\designprinciples\\InvalidHeader.CSV";

	/**
	 * Rigorous Test :-)
	 * 
	 */
	@Test
	public void givenCensusFileNumberOfRecordsMatches() throws Exception {
		int num = new CSVStateCensus().CSVStateCensusLoader(CSV_FILE);
		Assert.assertEquals(29, num);
	}

	@Test
	public void testThrowsExceptionWhenInvalidFileUsed() throws CensusException {
		boolean thrown = false;
		try {
			new CSVStateCensus().CSVStateCensusLoader(CSV_FILE);
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
			new CSVStateCensus().CSVStateCensusLoader(CSV_FILE);
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
			new CSVStateCensus().CSVStateCensusLoader(CSV_FILE);
		} catch (Exception e) {
			thrown = true;
			System.out.println("Provided header in file is incorrect.Please retry");
		}
		assertTrue(thrown);
	}


}
