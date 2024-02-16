package com.ty.stesnory.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class junitAnnotationexamples {

	@BeforeAll
	public static void annotation1() {
		System.out.println("executed before all the test case");
	}

	@AfterAll
	public static void annoatation2() {
		System.out.println("executed after all the test case ");
	}

	@BeforeEach
	public void annotation3() {
		System.out.println("execute before each test case");
	}

	@AfterEach
	public void annotation4() {
		System.out.println("execute after each test case");
	}

	@Test
	void test1() {
		System.out.println("hi from test1");
	}

	@Test
	void test2() {
		System.out.println("hi from test2");
	}
}
