package com.ty.junitExaample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class reverseStringTest {

	@Test
	void test() {
		reverseString reverseString=new reverseString();
		String input = "hello";
		String expectedoutput = "olleh";
	String	actualoutput=reverseString.ReverseString(input);
	
	assertEquals(actualoutput, expectedoutput);
		System.out.println(" test passsed");
	}



}
