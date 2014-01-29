package com.gceylan.kata.fizzbuzz;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {
	
	private FizzBuzz fizzbuzz = new FizzBuzz();

	@Test
	public void test_divisible_3_as_fizz() {
		assertEquals(FizzBuzz.FIZZ, fizzbuzz.classify(3));
		assertEquals(FizzBuzz.FIZZ, fizzbuzz.classify(6));
	}
	
	@Test
	public void test_divisible_5_as_buzz() {
		assertEquals(FizzBuzz.BUZZ, fizzbuzz.classify(5));
		assertEquals(FizzBuzz.BUZZ, fizzbuzz.classify(10));
	}
	
	@Test
	public void test_divisible_both_3_and_5_as_fizzbuzz() {
		assertEquals(FizzBuzz.FIZZ + FizzBuzz.BUZZ, fizzbuzz.classify(0));
		assertEquals(FizzBuzz.FIZZ + FizzBuzz.BUZZ, fizzbuzz.classify(15));
		assertEquals(FizzBuzz.FIZZ + FizzBuzz.BUZZ, fizzbuzz.classify(30));
	}
	
	@Test
	public void test_divisible_neither_3_nor_5_as_is() {
		assertEquals("1", fizzbuzz.classify(1));
		assertEquals("97", fizzbuzz.classify(97));
	}

}
