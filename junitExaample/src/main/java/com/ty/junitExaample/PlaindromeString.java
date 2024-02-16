package com.ty.junitExaample;


public class PlaindromeString {
public boolean isPlaindrrome(String input) {
	reverseString rs=new reverseString();
	String rev=rs.ReverseString(input);;
	if (rev.equals(input)) {
		return true;
	}
	else {
		return false;
	}
}
}
