package org.kkk;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Testng {
	
	@Test
	private void test1() {
		System.out.println("@Test1");
	}

	@Test(priority=1)
	private void test4() {
		System.out.println("@Test4");
	}
	
	@Test(priority=-11)
	private void test3() {
		System.out.println("@Test3");
	}
	@Test
	private void test5() {
		System.out.println("@Test5");
	}
	@Test
	private void test2() {
		System.out.println("@Test2");
	}
	
	
}
