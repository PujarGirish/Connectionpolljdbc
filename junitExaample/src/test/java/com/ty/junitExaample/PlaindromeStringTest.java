package com.ty.junitExaample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PlaindromeStringTest {
 
	@Test
	void testispalindrome() {
		String input="sis";
		PlaindromeString pal=new PlaindromeString();
assertTrue(pal.isPlaindrrome(input));		
		
		
	}

}
