package com.bridgelabz.designprinciples;

import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Iterator;

import com.bridgelabz.designprinciples.CensusException.ExceptionType;
import com.opencsv.CSVReader;

public class CSVStates {
	private static final String CSV_FILE_DELIMITER_STATES = "C:\\Users\\HP LAP\\Desktop\\BridgeLabz\\DesignPrinciples\\designprinciples\\InvalidDelimiterStates.CSV";
	private static final String CSV_FILE_STATES = "C:\\Users\\HP LAP\\Desktop\\BridgeLabz\\DesignPrinciples\\designprinciples\\IndiaStateCode.CSV";
	private static final String CSV_FILE_HEADER_STATES = "C:\\Users\\HP LAP\\Desktop\\BridgeLabz\\DesignPrinciples\\designprinciples\\InvalidHeaderStates.CSV";;

	public int CSVStateCodeLoader(String csvFile) throws Exception {
		File file1 = new File(CSV_FILE_DELIMITER_STATES);
		File file2 = new File(CSV_FILE_STATES);
		File file3 = new File(csvFile);
		File file4 = new File(CSV_FILE_HEADER_STATES);
		
		//Throws exception for invalid file path
		if (!(file1.compareTo(file3) == 0) && !(file2.compareTo(file3) == 0) && !(file4.compareTo(file3) == 0)) {
			throw new CensusException("Invalid Afile path", ExceptionType.INVALID_FILE_PATH);
		}

		// Instantiating the CSVReader class
		CSVReader reader = new CSVReader(new FileReader(csvFile));
		String[] headers = reader.readNext();

		// Throw exception for invalid header
		if (!(headers[0].equals("SrNo") && headers[1].equals("StateName") && headers[2].equals("TIN")
				&& headers[3].equals("StateCode")))
			throw new CensusException("Invalid headers", CensusException.ExceptionType.INVALID_HEADER);
		// Reading the contents of the csv file
		StringBuffer buffer = new StringBuffer();
		String line[];
		// Getting the iterator object for this reader
		Iterator it = reader.iterator();
		int count = 0;

		// Throw exception for invalid delimiter
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
