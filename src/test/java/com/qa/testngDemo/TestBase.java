package com.qa.testngDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestBase {
	
	@BeforeMethod
	public void checkBalance() {
		System.out.println("Check the balance");
	}
	
	@AfterMethod
	public void Acknowledgement() {
		System.out.println("Print Acknowledgement");
	}

	// Test Fixtures
	@BeforeTest
	public void setUp() {
		System.out.println("Invoke Browser and launch URL");
	}
	
	@AfterTest
	public void tearDown() {
		System.out.println("Close the browser");
	}
	
	@BeforeClass
	public void Login() {
		System.out.println("Login Action");
	}
	
	@AfterClass
	public void Logout() {
		System.out.println("Logout Actions");
	}
	
	
	
	@BeforeSuite
	public void atStart() {
		System.out.println("Starting...");
	}
	
	@AfterSuite
	public void atEnd() {
		System.out.println("Stopping...");
	}
}
