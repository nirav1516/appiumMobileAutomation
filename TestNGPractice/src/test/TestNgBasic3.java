package test;

import org.testng.annotations.Parameters;
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
	
	@Parameters({"URL","num1","advanceUrl"})
	@Test 
	public void uniqueMethod(String url,String num1,String advUrl) {
		System.out.println(new Object() {}
	      .getClass()
	      .getEnclosingMethod()
	      .getName());
		System.out.println(url);
		System.out.println(advUrl);
	}
	
	@Test 
	public void mytest() {
		System.out.println(new Object() {}
	      .getClass()
	      .getEnclosingMethod()
	      .getName());
	}
}
