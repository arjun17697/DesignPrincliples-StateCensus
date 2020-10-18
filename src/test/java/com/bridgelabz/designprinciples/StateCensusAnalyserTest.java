package com.bridgelabz.designprinciples;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import junit.framework.Assert;

public class StateCensusAnalyserTest {
	private static final String CSV_FILE = "C:\\Users\\HP LAP\\Desktop\\BridgeLabz\\DesignPrinciples\\designprinciples\\IndiaStateCensusData.CSV";
	private static final String CSV_FILE_INCOR = null;

	/**
	 * Rigorous Test :-)
	 * 
	 */
	@Test
	public void givenCensusFileNumberOfRecordsMatches() throws Exception {
		int num = new CSVStateCensus().CSVStateCensusLoader(CSV_FILE);
		Assert.assertEquals(30, num);
	}

	@Test
	public void testThrowsException() {
	  boolean thrown = false;
	  try {
		 new CSVStateCensus().CSVStateCensusLoader(CSV_FILE_INCOR);
	  } catch (Exception e) {
	    thrown = true;
	    System.out.println("Provided File is inorrect.Please retry");
	  }
	  assertTrue(thrown);
	}
	
}
