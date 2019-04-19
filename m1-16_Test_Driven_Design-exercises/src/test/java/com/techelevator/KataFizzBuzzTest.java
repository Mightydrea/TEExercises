package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class KataFizzBuzzTest {
	
	KataFizzBuzz buzz = new KataFizzBuzz();

	@Test
	public void fizzBuzzTestShouldReturnFizzWhenModThree () {
				
		Assert.assertEquals("fizz", buzz.fizzBuzz(3));
		Assert.assertEquals("fizz", buzz.fizzBuzz(6));
		Assert.assertEquals("fizz", buzz.fizzBuzz(9));
	}
		
	@Test
	public void fizzBuzzTestShouldReturnFizzWhenContainsNumberThree () {
		
		Assert.assertEquals("fizz", buzz.fizzBuzz(23));
		Assert.assertEquals("fizz", buzz.fizzBuzz(43));
		Assert.assertEquals("fizz", buzz.fizzBuzz(73));
		Assert.assertEquals("fizz", buzz.fizzBuzz(93));
		
	}
	
	@Test
	public void fizzBuzzTestShouldReturnFizzBuzzWhenContainsNumberFiftyThree () {  //switched to this statement when previous failed 
																			//due to neither number divisible by 3 or 5 and contains both digits
		Assert.assertEquals("fizzbuzz", buzz.fizzBuzz(53));
		
	}
			
	@Test
	public void fizzBuzzTestShouldReturnBuzz () {
		Assert.assertEquals("buzz", buzz.fizzBuzz(5));
		Assert.assertEquals("buzz", buzz.fizzBuzz(10));
		Assert.assertEquals("buzz", buzz.fizzBuzz(50));
	}
			
	@Test
	public void fizzBuzzTestShouldReturnFizzBuzz () {
		
		Assert.assertEquals("fizzbuzz", buzz.fizzBuzz(15));
		Assert.assertEquals("fizzbuzz", buzz.fizzBuzz(30));
		Assert.assertEquals("fizzbuzz", buzz.fizzBuzz(60));

	}
	
	@Test
	public void fizzBuzzTestShouldReturnANumber () {
		
		Assert.assertEquals("1", buzz.fizzBuzz(1));
		Assert.assertEquals("7", buzz.fizzBuzz(7));
		Assert.assertEquals("14", buzz.fizzBuzz(14));
		Assert.assertEquals("98", buzz.fizzBuzz(98));
		Assert.assertEquals("17", buzz.fizzBuzz(17));
	}
	
	@Test
	public void fizzBuzzTestShouldReturnAnOpenString () {
		
		Assert.assertEquals("", buzz.fizzBuzz(0));
		Assert.assertEquals("", buzz.fizzBuzz(101));
		Assert.assertEquals("", buzz.fizzBuzz(-1));
		Assert.assertEquals("", buzz.fizzBuzz(103));
		Assert.assertEquals("", buzz.fizzBuzz(105));
		Assert.assertEquals("", buzz.fizzBuzz(-3));
		Assert.assertEquals("", buzz.fizzBuzz(-5));


		
		
	}
}
