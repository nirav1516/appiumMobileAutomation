package mypractice.Mavenjava;

import org.testng.annotations.Test;

public class AppiumTest {
	@Test
	public void testAppium() {
		System.out.println(new Object() {}
	      .getClass()
	      .getName()+" --> "+new Object() {}
	      .getClass()
	      .getEnclosingMethod()
	      .getName());
	}

}
