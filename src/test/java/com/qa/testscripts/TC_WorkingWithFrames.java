package com.qa.testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC_WorkingWithFrames extends TestBase{
	
	
	@Test(priority=1)
	public void framesByIndex() {
		
		List<WebElement> AllFrames = driver.findElements(By.tagName("frame"));
		int size = AllFrames.size();
		
		for(int i=0;i<=size;i++) {
			WebDriver frame = driver.switchTo().frame(i);
			System.out.println( frame.getTitle());
			List<WebElement> AllLinks = frame.findElements(By.tagName("a"));
			System.out.println("Total no. of links present on the frame are : " + AllLinks.size());
			driver.switchTo().defaultContent();
		}
	}
	
	@Test(priority=2)
	public void frameByName() throws InterruptedException {
		
		WebDriver frame = driver.switchTo().frame("packageFrame");
		System.out.println(frame.getTitle());
		
		List<WebElement> AllLinks = frame.findElements(By.tagName("a"));
		System.out.println("Total no of links present on the frame are : " +  AllLinks.size());
		
		WebElement ele = frame.findElement(By.linkText("Byte"));
		System.out.println(ele.getText());
		
		ele.click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
	}

	@Test(priority=3)
	public void frameByElement() {
		
		WebElement ele = driver.findElement(By.xpath("//frame[@title='All classes and interfaces (except non-static nested types)']"));
		
		WebDriver frame = driver.switchTo().frame(ele);
		System.out.println(frame.getTitle());
		WebElement link = frame.findElement(By.linkText("Byte"));
		System.out.println(link.getText());
		driver.switchTo().defaultContent();
	}
	
}
