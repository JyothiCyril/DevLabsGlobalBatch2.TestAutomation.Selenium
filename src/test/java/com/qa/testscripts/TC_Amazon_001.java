package com.qa.testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_Amazon_001 {
	
	public static void main(String[] args) throws InterruptedException {
//		1. Invoke the browser.
//		2. Launch the URL (http://www.amazon.in)
//		3. Select the category as "Books"
//		4. Enter the "Da vinci code into Search text field
//		5. Click the magnifier button
//		6. Get all the items loaded based on the search term
//		7. Close the browser.
		
		
		//System.setProperty("webdriver.chrome.driver", "D:\\Tools\\SeleniumDrivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();		// Browser gets invokes
		driver.get("http://www.amazon.in/"); // Load the URL on the Driver
		driver.manage().window().maximize();
		
		boolean contains = driver.getTitle().contains("Amazon");
		
		if(contains) {
			System.out.println("The user is on home page");
		}else {
			System.out.println("The user is not on home page");
		}
	   	    
		WebElement ele = driver.findElement(By.name("url"));
		// type the WebElement as Select class.
		Select Category = new Select(ele);
		Category.selectByVisibleText("Books");
		Thread.sleep(2000);
		
	    WebElement searchTxtField = driver.findElement(By.id("twotabsearchtextbox"));	    
	    searchTxtField.sendKeys("Da Vinci Code");
	    Thread.sleep(2000);
	    
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2000);
		
		boolean Titlecontains = driver.getTitle().contains("Da Vinci Code");
		if(Titlecontains) {
			System.out.println("The item is searched");
		}else {
			System.out.println("The item is not searched");
		}
		
		List<WebElement> allItems = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		
		int count = allItems.size();
		System.out.println("Total no. of items loaded are : " + count);
		
		for(WebElement item: allItems) {
			String text = item.getText();
			System.out.println(text);
		}
		
		
		
		//driver.close();  // close the browser instance.
		driver.quit(); // closes all the browser instance / tabs / windows
		
		//System.setProperty("webdriver.edge.driver", "D:\Tools\SeleniumDrivers\msedgedriver.exe");
//		WebDriverManager.edgedriver().setup();
//		EdgeDriver eDriver = new EdgeDriver();
//		
//		WebDriverManager.firefoxdriver().setup();
//		FirefoxDriver ffDriver = new FirefoxDriver();
//		
//		WebDriverManager.iedriver().setup();
//		InternetExplorerDriver ieDriver = new InternetExplorerDriver();
//		
		
	}

}
