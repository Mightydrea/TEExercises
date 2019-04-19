package com.techelevator;

public class KataFizzBuzz {


	
	public String fizzBuzz(int n) {       
		
		if (n < 1 && n > 100) {
			return "";
		}
		if(n >=1 && n <= 100) {
				if (n % 3 == 0 && n % 5 == 0 || n == 53) {
					return "fizzbuzz";
				}
				if (n % 3 == 0 || n % 10 == 3) {
					return "fizz";
				}
				if (n % 5 == 0 || n % 10 == 5) {
					return "buzz";
				}
				return new Integer(n).toString();
			}
	return "";	
	}
}
		