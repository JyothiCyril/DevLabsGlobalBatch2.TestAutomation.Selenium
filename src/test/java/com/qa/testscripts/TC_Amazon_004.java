package com.qa.testscripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_Amazon_004 extends TestBase{
	
	@Test
	public void newUserReg() throws InterruptedException {
		
		WebElement accountandLists = AmazonOR.getAccountandLists();
		Actions act = new Actions(driver);
		act.moveToElement(accountandLists).build().perform();
		Thread.sleep(2000);
		AmazonOR.getstartHereLink().click();
		
		boolean contains = driver.getTitle().contains("Registration");
		if(contains) {
			Reporter.log("User is landed on registration page");
			AmazonOR.getCustomerNameTxtField().sendKeys("Kim Smith");
			Thread.sleep(2000);
					
		}
		
	}

}
