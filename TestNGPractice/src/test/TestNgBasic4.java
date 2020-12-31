package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestNgBasic4 {

	@Test
	public void test4() {
		System.out.println(new Object() {}
	      .getClass()
	      .getEnclosingMethod()
	      .getName());
	}
	
	@Test
	public void test5() {
		System.out.println(new Object() {}
	      .getClass()
	      .getEnclosingMethod()
	      .getName());
	}
	
	@Test (groups = {"smoke"})
	public void test6() {
		System.out.println(new Object() {}
	      .getClass()
	      .getEnclosingMethod()
	      .getName());
	}
	
	@AfterTest
	public void afterALLtest() {
		System.out.println(new Object() {}
	      .getClass()
	      .getName()+" --> "+new Object() {}
	      .getClass()
	      .getEnclosingMethod()
	      .getName());
		
	}
}
