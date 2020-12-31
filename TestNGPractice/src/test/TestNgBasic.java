package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasic {
	@Test(groups = {"smoke","healthcheck"})
	public void demo(){
		System.out.println("nirav");
	}
	
	@Test
	public void demo2(){
		System.out.println("Nita");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println(new Object() {}
	      .getClass()
	      .getName()+" --> "+new Object() {}
	      .getClass()
	      .getEnclosingMethod()
	      .getName());
		
	}
	
	@BeforeTest(groups = {"smoke","healthcheck"})
	public void preReq() {
		System.out.println(new Object() {}
	      .getClass()
	      .getName()+" --> "+new Object() {}
	      .getClass()
	      .getEnclosingMethod()
	      .getName());
		
	}
	
	@BeforeMethod
	public void beforeEachMethod() {
		System.out.println(new Object() {}
	      .getClass()
	      .getName()+" --> "+new Object() {}
	      .getClass()
	      .getEnclosingMethod()
	      .getName());
		
	}
	
	@AfterSuite
	public void afterEntireSuite() {
		System.out.println(new Object() {}
	      .getClass()
	      .getName()+" --> "+new Object() {}
	      .getClass()
	      .getEnclosingMethod()
	      .getName());
		
	}
}
