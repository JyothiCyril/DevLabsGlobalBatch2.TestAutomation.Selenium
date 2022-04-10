package com.qa.testscripts;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC_WorkingwithMultipleWindows extends TestBase{
	
	@Test
	public void multipleWindows() throws InterruptedException {
		
		WebElement popupele = driver.findElement(By.className("appClose"));
		if(popupele.isDisplayed()) {
			popupele.click();
		}else {
			System.out.println("No Such element present");
		}
		
		driver.findElement(By.linkText("CITIGROUP.COM")).click(); // 2nd window
		Thread.sleep(2000);
		driver.findElement(By.linkText("TERMS AND CONDITIONS")).click(); // 3rd window
		Thread.sleep(2000);
		Set<String> windowHandles = driver.getWindowHandles();
		
		Iterator<String> iter = windowHandles.iterator();
		
		while(iter.hasNext()) {
			String windID = iter.next();
			WebDriver window = driver.switchTo().window(windID);
			Thread.sleep(2000);
			System.out.println( window.getTitle());
			
			List<WebElement> ele = window.findElements(By.tagName("a"));
			System.out.println( ele.size());
		}
		
	}

}
