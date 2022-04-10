package com.qa.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TC_DragandDrop extends TestBase{
	
	@Test
	public void dragdropExample() throws InterruptedException {
		
		driver.switchTo().frame(0);		
		WebElement source = driver.findElement(By.xpath("//p[contains(text(),'Drag me to my target')]"));		
		WebElement target = driver.findElement(By.xpath("//p[contains(text(),'Drop here')]"));
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.dragAndDrop(source, target).build().perform();
		Thread.sleep(3000);
	}

}
