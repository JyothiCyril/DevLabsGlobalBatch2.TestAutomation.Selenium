package com.qa.testscripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC_JSEScrollByEle extends TestBase{

	@Test
	public void scrollByElement() throws InterruptedException {
		
		WebElement careersLink = AmazonOR.getCareersLink();
		
		JavascriptExecutor Js = (JavascriptExecutor)driver;
		Js.executeScript("arguments[0].scrollIntoView", careersLink);
		Thread.sleep(3000);
		
		careersLink.click();
		Thread.sleep(3000);
		boolean contains = driver.getTitle().contains("jobs");
		if(contains) {
			System.out.println("User is landed on jobs page");
		}
		
	}

}
