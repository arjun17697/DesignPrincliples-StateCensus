package com.bridgelabz.designprinciples;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Iterator;
import java.io.File;

import com.bridgelabz.designprinciples.CensusException.ExceptionType;
import com.opencsv.CSVReader;

public class CSVStateCensus {
	private static final String CSV_FILE_DELIMITER = "C:\\Users\\HP LAP\\Desktop\\BridgeLabz\\DesignPrinciples\\designprinciples\\InvalidDelimiter.CSV";
	private static final String CSV_FILE = "C:\\Users\\HP LAP\\Desktop\\BridgeLabz\\DesignPrinciples\\designprinciples\\IndiaStateCensusData.CSV";
	private static final String CSV_FILE_HEADER = "C:\\Users\\HP LAP\\Desktop\\BridgeLabz\\DesignPrinciples\\designprinciples\\InvalidHeader.CSV";;
	public int CSVStateCensusLoader(String csvFile) throws Exception {
		File file1 = new File(CSV_FILE_DELIMITER);
		File file2 = new File(CSV_FILE);
		File file3 = new File(csvFile);
		File file4= new File(CSV_FILE_HEADER);
		if (!(file1.compareTo(file3) == 0) && !(file2.compareTo(file3) == 0) && !(file4.compareTo(file3) == 0)) {
			throw new CensusException("Invalid file path", ExceptionType.INVALID_FILE_PATH);
		}

		// Instantiating the CSVReader class
		CSVReader reader = new CSVReader(new FileReader(csvFile));
		String[] headers = reader.readNext();
		
		//Throw exception for invalid header
		if (!(headers[0].equals("State") && headers[1].equals("Population") && headers[2].equals("AreaInSqKm")
				&& headers[3].equals("DensityPerSqKm")))
			throw new CensusException("Invalid headers", CensusException.ExceptionType.INVALID_HEADER);
		// Reading the contents of the csv file
		StringBuffer buffer = new StringBuffer();
		String line[];
		// Getting the iterator object for this reader
		Iterator it = reader.iterator();
		int count = 0;
		
		//Throw exception for invalid delimiter
		while (it.hasNext()) {
			line = (String[]) it.next();
			for (String s : line) {
				if (s.contains(":"))
					throw new CensusException("Invalid delimiter", ExceptionType.INVALID_DELIMITER);
			}
			System.out.println(Arrays.toString(line));
			System.out.println(" ");
			count++;
		}
		return count;
	}

}
