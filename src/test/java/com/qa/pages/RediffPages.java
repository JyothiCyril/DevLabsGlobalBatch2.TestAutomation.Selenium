package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffPages {
	
	
	WebDriver driver;
	
	@FindBy(linkText="Create Account")
	WebElement CreateAccountLink;
	
	public WebElement getCreateAccountLink() {
		return CreateAccountLink;
	}
	
	@FindBy(xpath="/html/body/center/form/div/table[2]/tbody/tr[3]/td[3]/input")
	WebElement FullNameTextField;
	
	public WebElement getFullNameTextField() {
		return FullNameTextField;
	}
	
	@FindBy(xpath="//tbody/tr[7]/td[3]/input[1]")
	WebElement EmailIDTextField;
	
	public WebElement getEmailIDTextField() {
		return EmailIDTextField;
	}
	
	@FindBy(xpath="//input[@value='Check availability']")
	WebElement CheckAvailablityBtn;
	
	public WebElement getCheckAvailablityBtn() {
		return CheckAvailablityBtn;
	}
	
	public RediffPages(WebDriver rDriver) {
		this.driver = rDriver;
		PageFactory.initElements(rDriver, this);
		
	}
	

}
