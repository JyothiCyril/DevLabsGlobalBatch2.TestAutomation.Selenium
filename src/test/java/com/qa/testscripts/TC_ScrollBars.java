package com.qa.testscripts;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class TC_ScrollBars extends TestBase{

	@Test
	public void scrollBars() throws InterruptedException {		

		JavascriptExecutor Js = (JavascriptExecutor)driver;

		// vertical --: Top to bottom
		for(int i=0 ; i<=5;i++) {
			Js.executeScript("window.scrollBy(0,500)");// x -- Horizontal, y -- vertical 
			Thread.sleep(3000);
		}

		// vertical --: bottom to top
		for(int i=5 ; i>=1;i--) {
			Js.executeScript("window.scrollBy(0,-500)");// x -- Horizontal, y -- vertical 
			Thread.sleep(3000);
		}

		// Horizontal--: Left to right
		for(int i=0 ; i<=5;i++) {
			Js.executeScript("window.scrollBy(500,0)");// x -- Horizontal, y -- vertical 
			Thread.sleep(3000);
		}

		// Horizontal --: Right to left
		for(int i=5 ; i>=1;i--) {
			Js.executeScript("window.scrollBy(-500,0)");// x -- Horizontal, y -- vertical 
			Thread.sleep(3000);
		}
	}

}
