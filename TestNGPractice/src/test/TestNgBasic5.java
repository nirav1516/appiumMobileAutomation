package test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNgBasic5 {

	@Test(dataProvider = "getData")
	public void test8(String userName,String passWord) {
		System.out.println(new Object() {}
	      .getClass()
	      .getEnclosingMethod()
	      .getName());
		System.out.println("userName: "+userName);
		System.out.println("passWord: "+passWord);
	}
	
	@Test(timeOut = 4000)
	public void test9() {
		System.out.println(new Object() {}
	      .getClass()
	      .getEnclosingMethod()
	      .getName());
	}
	
	@Test(timeOut = 4000)
	public void test10() {
		System.out.println(new Object() {}
	      .getClass()
	      .getEnclosingMethod()
	      .getName());
		Assert.assertTrue(false);
	}
	
	@DataProvider
	public Object getData() {
		Object[][] data = new Object[3][2];
		
		for (int i=0;i<data.length;i++) {
			for(int j=0;j<data[0].length;j++) {
				data[i][j] = (j%2==0)? "username"+i:"password"+i;
			}
		}
		return data;
		
	}
	

}
