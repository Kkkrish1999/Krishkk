package org.kkk;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JUnits {

	@BeforeClass
	public static void  test() {
		System.out.println("@BeforeClass");

	}
	@AfterClass
	public static void test1() {
		System.out.println("@AfterClass");

	}
	@Before
	public void test2() {
		System.out.println("@Before");

	}
	@After
	public void test3() {
		System.out.println("@After");

	}
	@Test
	public void test4() {
		System.out.println("@Test");

	}
	
	
	
	
	
	
}
