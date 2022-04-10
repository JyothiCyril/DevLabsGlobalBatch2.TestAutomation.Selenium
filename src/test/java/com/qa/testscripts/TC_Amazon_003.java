package com.qa.testscripts;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_Amazon_003 extends TestBase{

	@Test
	public void validateFooterLinks() {
		// validate Amazon page for footer links.
		
		
		List<WebElement> footerLinks = AmazonOR.getFooterLinks();
		System.out.println("Count of footer links present on the page are : " +  footerLinks.size());
		
		/*if(footerLinks.size()>=50) {
			System.out.println("All the footer links are present");
		}*/
		
		Assert.assertEquals(footerLinks.size(), 50);		
		System.out.println("All the footer links are present");
		for(WebElement item:footerLinks) {
			Reporter.log(item.getText());
		}
		
		

	}

}
