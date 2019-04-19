package com.techelevator;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class FizzWriter {

	public static void main(String[] args) {
		
		
		File newFile = new File("FizzBuzz.txt");	
		try {
			newFile.createNewFile();
			
			PrintWriter writer = new PrintWriter(newFile);

					
			for( Integer i = 1; i <= 300; i++) {
				
				if(i % 3 == 0 && i % 5 == 0 || i == 53) {
			        
					writer.println("FizzBuzz");    
			    }
				else if(i % 3 == 0 || i % 10 == 3 || i.toString().contains("3")) {
			        
					writer.println("Fizz");
			    }
				else if(i % 5 == 0 || i % 10 == 5 || i.toString().contains("5")) {
			        
					writer.println("Buzz");
			    }
				else 
			        writer.println(i);
			    }
			
			writer.flush();
			writer.close();
			System.out.println("Printed to file.");
	
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}	























//		Scanner userInput = new Scanner(System.in);
//		
//		System.out.print("Enter a name for the new file >>> ");
//		String fileName = userInput.nextLine();
//		File newFile = new File(fileName);	
//
//		newFile.createNewFile();
//		System.out.println();
//		System.out.println("name: "+newFile.getName());
//		System.out.println("absolutePath: "+newFile.getAbsolutePath());
//		System.out.println("size : "+newFile.length());
//	
//		try()
//		
//		PrintWriter print = new PrintWriter(fizzBuzz);

			
		
		
//		catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			System.out.println("Error Invaild Destination File!");
//		
		
