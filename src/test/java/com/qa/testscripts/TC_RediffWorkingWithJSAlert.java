package com.qa.testscripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class TC_RediffWorkingWithJSAlert extends TestBase{

	@Test
	public void JSAlertExample() throws InterruptedException {
		
		RediffOR.getCreateAccountLink().click();
		RediffOR.getFullNameTextField().sendKeys("234678");
		RediffOR.getFullNameTextField().sendKeys(Keys.TAB); // Alert window trigger
		Alert Js = driver.switchTo().alert();
		System.out.println(Js.getText());
		Js.accept();
		Thread.sleep(2000);
		RediffOR.getFullNameTextField().clear();
		Thread.sleep(2000);
		RediffOR.getFullNameTextField().sendKeys("Smith");
		Thread.sleep(2000);
		RediffOR.getEmailIDTextField().sendKeys("test123");
		Thread.sleep(2000);
		RediffOR.getCheckAvailablityBtn().click();
	}
	
}
