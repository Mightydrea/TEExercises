package com.techelevator;

import java.io.File;
import java.util.Scanner;

public class FileSplitter {

	public static void main(String[] args) {
		
		
		try (Scanner input = new Scanner(System.in)) {
			
			System.out.print("Enter the path of a file or directory >>> ");
			String path = input.nextLine();
			File f = new File(path);

			System.out.println("What is the name of the text file to be split? (Case Sensitive) \n");
			String fileName = input.nextLine();
			File splitFile1 = new File("aliceInput_1.txt");
			File splitFile2 = new File("aliceInput_2.txt");
			File splitFile3 = new File("aliceInput_3.txt");

			System.out.println(" ");
			
			System.out.print("What is the maximum number of lines that should appear on each text file?  ");
			String lines = input.nextLine();
			int numberOfLines = Integer.parseInt(lines);
			System.out.println(" ");

		
		try(Scanner fileScanner = new Scanner(fileName)) {
			String firstFile = fileScanner.nextLine();
			System.out.println("Printing the first file: " + firstFile.split(fileName, numberOfLines));
			String[] mySplitFile1 = firstFile.split(" ");
			System.out.println("Now let's parse it...");
			for (int i = 0; i< mySplitFile1.length/numberOfLines; i++) {
				System.out.println(mySplitFile1[i]);
			}
				
		}
				
//			String secondFile = fileScanner.nextLine();			
//			System.out.println("Printing the second file: " + secondFile);		
//		
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
}
		
