package com.bridgelabz.designprinciples;

import java.io.FileReader;
import java.util.Arrays;
import java.util.Iterator;
import com.opencsv.CSVReader;

public class CSVStateCensus {
	public void CSVStateCensusLoader() throws Exception {
		// Instantiating the CSVReader class
		CSVReader reader = new CSVReader(new FileReader(
				"C:\\Users\\HP LAP\\Desktop\\BridgeLabz\\DesignPrinciples\\designprinciples\\IndiaStateCensusData.CSV"));
		// Reading the contents of the csv file
		StringBuffer buffer = new StringBuffer();
		String line[];
		// Getting the iterator object for this reader
		Iterator it = reader.iterator();
		while (it.hasNext()) {
			line = (String[]) it.next();
			System.out.println(Arrays.toString(line));
			System.out.println(" ");
		}
	}

}
