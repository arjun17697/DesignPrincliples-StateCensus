package com.bridgelabz.designprinciples;

import java.util.Scanner;
public class StateCensusAnalyser 
{
	private static final String CSV_FILE = "C:\\Users\\HP LAP\\Desktop\\BridgeLabz\\DesignPrinciples\\designprinciples\\IndiaStateCensusData.CSV";
	private static void loadStateCensus() throws Exception {
		new CSVStateCensus().CSVStateCensusLoader(CSV_FILE);
	}
    public static void main( String[] args ) throws Exception
    {
        System.out.println( "Welcome to State Census Analyser" );
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Press the number to indicate your choice:");
        System.out.println("1.Load Indian State Census Data");
        System.out.println("Press any other key to exit");
        int choice= sc.nextInt();
        switch (choice) {
		case 1:
			loadStateCensus();
			break;
		default:
			System.out.println("You have successfully exited the program");
			break;
		}
    }

	
}
