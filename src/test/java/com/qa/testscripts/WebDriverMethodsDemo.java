package com.qa.testscripts;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverMethodsDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();		// Browser gets invokes
		driver.get("http://www.amazon.in/");    // Load the URL on the Driver

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		Thread.sleep(3000);

		String title = driver.getTitle(); // Title of the page on the browser instance. Returns String
		System.out.println(title);

		driver.navigate().to("https://www.google.com/");
		
		
		String url = driver.getCurrentUrl(); // the current url, return String
		System.out.println(url);

		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		String WindID = driver.getWindowHandle(); // get the window ID of the current window, String 
		System.out.println(WindID);

		Thread.sleep(3000);

		//  Set<String> WindIDs = driver.getWindowHandles(); // Window id of all the tabs / window at the run session.


		//System.out.println( driver.getPageSource()); // Page Source / HTML code of the webpage, String

		// driver.switchTo().frame(0); // switchTo a frame.
		
		// driver.switchTo().window(WindID);  // switch between the tab on the browse instance
		
		// driver.switchTo().alert(); // switch to alert window.
		
		
		driver.close(); // close the current browser instance.
		// driver.quit(); // close all the browser instance along with different tabs / windows


	}

}
