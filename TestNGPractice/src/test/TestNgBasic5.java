package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestNgBasic5 {

	@Test(enabled = false)
	public void test8() {
		System.out.println(new Object() {}
	      .getClass()
	      .getEnclosingMethod()
	      .getName());
	}
	
	@Test(timeOut = 4000)
	public void test9() {
		System.out.println(new Object() {}
	      .getClass()
	      .getEnclosingMethod()
	      .getName());
	}
	

}
