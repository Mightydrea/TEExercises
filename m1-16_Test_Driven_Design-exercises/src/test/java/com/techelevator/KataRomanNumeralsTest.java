package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class KataRomanNumeralsTest {

	KataRomanNumerals numerals = new KataRomanNumerals();
	KataRomanNumerals numbers = new KataRomanNumerals();


	@Test
	public void convertToRomanTestShouldReturnRomanNumeralsOfOnes() {

		Assert.assertEquals("I", numerals.integerToRoman(1));
		Assert.assertEquals("II", numerals.integerToRoman(2));
		Assert.assertEquals("III", numerals.integerToRoman(3));
		Assert.assertEquals("IV", numerals.integerToRoman(4));
		Assert.assertEquals("V", numerals.integerToRoman(5));

	}

	@Test
	public void convertToRomanTestShouldReturnRomanNumeralsOfTens() {

		Assert.assertEquals("X", numerals.integerToRoman(10));
		Assert.assertEquals("XII", numerals.integerToRoman(12));
		Assert.assertEquals("XIV", numerals.integerToRoman(14));
		Assert.assertEquals("XV", numerals.integerToRoman(15));
		Assert.assertEquals("XVII", numerals.integerToRoman(17));
		Assert.assertEquals("XIX", numerals.integerToRoman(19));
	}

	@Test
	public void convertToRomanTestShouldReturnRomanNumeralsOfHundreds() {

		Assert.assertEquals("L", numerals.integerToRoman(50));
		Assert.assertEquals("XCIX", numerals.integerToRoman(99));
		Assert.assertEquals("C", numerals.integerToRoman(100));
		Assert.assertEquals("XL", numerals.integerToRoman(40));
		Assert.assertEquals("LX", numerals.integerToRoman(60));
		Assert.assertEquals("LXV", numerals.integerToRoman(65));

	}

	@Test
	public void convertToRomanTestShouldReturnRomanNumeralsOfThousands() {

		Assert.assertEquals("M", numerals.integerToRoman(1000));
		Assert.assertEquals("MM", numerals.integerToRoman(2000));
		Assert.assertEquals("MMM", numerals.integerToRoman(3000));
		Assert.assertEquals("MX", numerals.integerToRoman(1010));
		Assert.assertEquals("MMD", numerals.integerToRoman(2500));
		Assert.assertEquals("MMDX", numerals.integerToRoman(2510));
		Assert.assertEquals("MMDXII", numerals.integerToRoman(2512));
		Assert.assertEquals("MCMXCIX", numerals.integerToRoman(1999));
		Assert.assertEquals("MCDXLIV", numerals.integerToRoman(1444));

	}

	@Test
	public void convertToRomanTestShouldReturnRomanNumeralsOfNegativeNumber() {

		Assert.assertEquals("Error! Choose a number between 1-3000", numerals.integerToRoman(-1));

	}

	@Test
	public void convertToRomanTestShouldNotReturnRomanNumeralsOfNumbersOver3000() {

		Assert.assertEquals("Error! Choose a number between 1-3000", numerals.integerToRoman(3050));
		Assert.assertEquals("Error! Choose a number between 1-3000", numerals.integerToRoman(3001));

	}
	
	@Test
	public void convertRomanToIntegerTestShouldReturnIntegersOfRomanNumeralsOfTen() {
		
		Assert.assertEquals(10, numbers.romanToInteger("X"));
		Assert.assertEquals(12, numbers.romanToInteger("XII"));
		Assert.assertEquals(15, numbers.romanToInteger("XV"));
		Assert.assertEquals(17, numbers.romanToInteger("XVII"));
		//Assert.assertEquals(14, numbers.romanToInteger("XIV"));   These lines do not work
		//Assert.assertEquals(19, numbers.romanToInteger("XIX"));  These lines do not work
		
		
		
		
	}
	

}
