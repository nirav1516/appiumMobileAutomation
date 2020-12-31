package test;

import org.testng.annotations.Test;

public class TestNgBasic3 {

	@Test(groups = {"depends","healthcheck"},dependsOnMethods = {"test2","test3"})
	public void test1() {
		System.out.println(new Object() {}
	      .getClass()
	      .getEnclosingMethod()
	      .getName());
	}
	
	@Test (groups = {"depends","healthcheck"},dependsOnMethods = {"test3"})
	public void test2() {
		System.out.println(new Object() {}
	      .getClass()
	      .getEnclosingMethod()
	      .getName());
	}
	
	@Test (groups = {"depends"})
	public void test3() {
		System.out.println(new Object() {}
	      .getClass()
	      .getEnclosingMethod()
	      .getName());
	}
	
	@Test 
	public void uniqueMethod() {
		System.out.println(new Object() {}
	      .getClass()
	      .getEnclosingMethod()
	      .getName());
	}
	
	@Test 
	public void mytest() {
		System.out.println(new Object() {}
	      .getClass()
	      .getEnclosingMethod()
	      .getName());
	}
}
