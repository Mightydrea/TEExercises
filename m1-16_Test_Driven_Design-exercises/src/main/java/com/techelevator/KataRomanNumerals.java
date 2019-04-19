package com.techelevator;

import java.util.HashMap;
import java.util.Map;

public class KataRomanNumerals {
	
			
		private static final String[] numerals = new String[] {"M",  "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV","I"};
		
		private static final int[] numbers = new int[] {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
				
		public String integerToRoman(int value) {
		
			if (value > 3000 || value < 1) {
				return "Error! Choose a number between 1-3000";
			}
		
			StringBuilder romanNumeral = new StringBuilder();
			
			int i = 0;
			
			while (value > 0) {
				
				if (value - numbers[i] >= 0) {
					romanNumeral.append(numerals[i]);			//numbers are appended to the character sequence via the StringBuilder
					value -= numbers[i];
				}
				else {
					i++;
				}
			}
			return romanNumeral.toString();     //displays a String exactly as the sequence of characters
					
		}
		
		public int romanToInteger(String value) {
			
			Map<String, Integer> RomanNumeral = new HashMap<String, Integer>();
			
			RomanNumeral.put("I", 1);
			RomanNumeral.put("IV", 4);
			RomanNumeral.put("V", 5);
			RomanNumeral.put("IX", 9);
			RomanNumeral.put("X", 10);
			RomanNumeral.put("XL", 40);
			RomanNumeral.put("L", 50);
			RomanNumeral.put("XC", 90);
			RomanNumeral.put("C", 100);
			RomanNumeral.put("CD", 400);
			RomanNumeral.put("D", 500);
			RomanNumeral.put("M", 1000);
			
			int firstValue = 0;
		    int priorValue = 0;

		    for (int i = value.length() - 1; i >= 0; i--) {
		        int number = RomanNumeral.get(value.substring(i, i + 1));
		        if (number < priorValue) {
		            firstValue = number;
		        } else {
		            firstValue += number;
		            priorValue += number;
		        }
		    }
		    return firstValue;
		}
		    
}

		
	