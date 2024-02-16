package com.ty.junitExaample;

public class reverseString {
	public String ReverseString(String str) {
		StringBuffer builder = new StringBuffer(str);
		builder = builder.reverse();
		str = builder.toString();
		return str;
		
		
	}
	
}
