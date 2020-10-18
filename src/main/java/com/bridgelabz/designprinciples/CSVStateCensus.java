package com.bridgelabz.designprinciples;

import java.io.FileReader;
import java.util.Arrays;
import java.util.Iterator;
import com.opencsv.CSVReader;

public class CSVStateCensus {

	public int CSVStateCensusLoader(String csvFile) throws Exception {
		// Instantiating the CSVReader class
		CSVReader reader = new CSVReader(new FileReader(
				csvFile));
		// Reading the contents of the csv file
		StringBuffer buffer = new StringBuffer();
		String line[];
		// Getting the iterator object for this reader
		Iterator it = reader.iterator();
		int count = 0;
		while (it.hasNext()) {
			line = (String[]) it.next();
			System.out.println(Arrays.toString(line));
			System.out.println(" ");
			count++;
		}
		return count;
	}

}
