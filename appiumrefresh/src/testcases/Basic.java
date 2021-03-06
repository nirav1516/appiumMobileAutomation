package testcases;

import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import init.Setup;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageobjects.HomePage;
import pageobjects.PreferenceDependenciesPage;
import pageobjects.PreferencePage;

public class Basic extends Setup{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		HomePage hP = new HomePage(driver);
		PreferencePage pP = new PreferencePage(driver);
		PreferenceDependenciesPage pDP = new PreferenceDependenciesPage(driver);
		
		AndroidElement e;
		hP.clickPreferenceMenu();
		
		
		
		e=  pP.DependeciesMenu;
		e.click();
		
		e = pDP.wifiCheckBox;
		e.click();
		
		e=  pDP.wifiSettingsMenu;//driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]"));//driver.findElementByXPath("(//android.widget.RelativeLayout)[2]");
		e.click();
		
		e = pDP.wifiTextBox;//driver.findElement(By.className("android.widget.EditText"));
		e.setValue("Nirav");
		 
		//e= driver.findElement(By.id("android:id/button1"));
		
		List<AndroidElement> eL = pDP.settingButtons;//driver.findElementsByClassName("android.widget.Button");
		e = eL.get(1);
		e.click();
	}

}
