package test;

import java.util.Set;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.internal.TestResult;

public class TestNgBasic6_Listener implements ITestListener{

	
	
	public void onTestSuccess(ITestResult result) {
	    // not implemented
		System.out.println("Success");
	}
	
	public void onTestFailure(ITestResult result) {
	    // not implemented
		System.out.println("Failure..................."+result.getName());
		
		
	}
	

}
