package com.ty.junitExaample.view;

import com.ty.junitExaample.reverseString;

public class TestA {

		public static void main(String[] args) {
			reverseString resString = new reverseString();

			String input = "hello";
			String expectedoutput = "lleh";
			String actualoutput = resString.ReverseString(input);
			if (actualoutput.equals(expectedoutput)) {
				System.out.println("test passed");
			} else {

				System.out.println("test failed");
			}
		}
	}


