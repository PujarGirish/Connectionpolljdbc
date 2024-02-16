package com.ty.junitExaample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class CalulatorAppTest {

	@Test
	@Disabled
	void testadd() {
	CalulatorApp cal=new CalulatorApp();
	int value1=10;
	int value2=20;
	int expectedoutput=30; 
		int	actualoutput=cal.add(value1, value2);
	assertEquals(expectedoutput, actualoutput);
	}
	@Test
	void testsub() {
		CalulatorApp cal=new CalulatorApp();
		int value1=10;
		int value2=20;
		int expectedoutput=-10;
		assertEquals(expectedoutput,cal.sub(value1, value2));
	
	}
	@Test
	void testmul() {
		CalulatorApp cal=new CalulatorApp();
		int value1=10;
		int value2=20;
		int expectedoutput=200;
		assertEquals(expectedoutput,cal.mull(value1, value2));
	}
	@Test
	void testdiv() {
		CalulatorApp cal=new CalulatorApp();
		int value1=1;
		int value2=0;
		int expectedoutput=20;
		assertThrows(ArithmeticException.class, () -> {
			cal.div(value1, value2);
		});
	
	}

}
