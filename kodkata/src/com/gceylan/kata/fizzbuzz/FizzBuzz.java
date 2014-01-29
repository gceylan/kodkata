package com.gceylan.kata.fizzbuzz;

public class FizzBuzz {

	protected static final String FIZZ = "fizz";
	protected static final String BUZZ = "buzz";

	public Object classify(int numeral) {
		String result = "";
		
		if (0 == numeral % 3) result += FIZZ;
		if (0 == numeral % 5) result += BUZZ;
		
		return result.isEmpty() ? "" + numeral : result;
	}

}
