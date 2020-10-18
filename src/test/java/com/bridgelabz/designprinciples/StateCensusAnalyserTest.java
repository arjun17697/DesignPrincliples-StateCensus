package com.bridgelabz.designprinciples;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import junit.framework.Assert;


public class StateCensusAnalyserTest 
{
    /**
     * Rigorous Test :-)
     * 
     */
    @Test
    public void givenCensusFileNumberOfRecordsMatches() throws Exception
    {
    	int num=new CSVStateCensus().CSVStateCensusLoader();
		Assert.assertEquals(30, num);
    }
}
