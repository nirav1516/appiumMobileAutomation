package test;

import org.testng.annotations.Test;

public class TestNgBasic3 {

	@Test
	public void test1() {
		System.out.println(new Object() {}
	      .getClass()
	      .getEnclosingMethod()
	      .getName());
	}
	
	@Test 
	public void test2() {
		System.out.println(new Object() {}
	      .getClass()
	      .getEnclosingMethod()
	      .getName());
	}
	
	@Test 
	public void test3() {
		System.out.println(new Object() {}
	      .getClass()
	      .getEnclosingMethod()
	      .getName());
	}
}
