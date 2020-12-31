package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasic2 {
	@Test
	public void demo3() {
		System.out.println("Rutik");
	}
	
	
	@BeforeTest(groups = {"smoke","healthcheck"})
	public void BeforeTest() {
		System.out.println(new Object() {}
	      .getClass()
	      .getName()+" --> "+new Object() {}
	      .getClass()
	      .getEnclosingMethod()
	      .getName());
		
	}
	
	@BeforeSuite(groups = {"smoke"})
	public void beforeEntireSuite() {
		System.out.println(new Object() {}
	      .getClass()
	      .getName()+" --> "+new Object() {}
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
	
	@AfterMethod(groups = {"smoke"})
	public void aftereachMethod() {
		System.out.println(new Object() {}
	      .getClass()
	      .getName()+" --> "+new Object() {}
	      .getClass()
	      .getEnclosingMethod()
	      .getName());
		
	}
}
