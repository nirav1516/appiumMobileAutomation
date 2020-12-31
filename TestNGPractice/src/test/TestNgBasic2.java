package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgBasic2 {
	@Parameters({"URL","num1"})
	@Test
	public void demo3(@Optional String url1,int url2) {
		System.out.println("Rutik with param");
		System.out.println(url1);
		System.out.println(url2);
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
