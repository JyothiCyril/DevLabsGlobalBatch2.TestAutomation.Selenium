package com.qa.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.pages.RediffPages;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_RediffCreateAccount_001 extends TestBase{
	
	
	@Test
	public void createAccount() throws InterruptedException {		
		
		
		RediffOR.getCreateAccountLink().click();
		
		boolean contains = driver.getCurrentUrl().contains("register");
		Assert.assertEquals(contains, true);
		//if(contains) {
			System.out.println("The user is landed on registration page");
			Thread.sleep(2000);
			RediffOR.getFullNameTextField().sendKeys(prop.getProperty("FullName"));
			Thread.sleep(2000);
			RediffOR.getEmailIDTextField().sendKeys(prop.getProperty("EmailID"));
			Thread.sleep(2000);
			RediffOR.getCheckAvailablityBtn().click();
			Thread.sleep(2000);
			
		//}else {
		//	System.out.println("The user is not landed on registration page");
		//}

		
	}

}
