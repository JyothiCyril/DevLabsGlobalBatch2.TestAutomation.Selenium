package com.qa.testscripts;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.utility.ExcelUtility;

public class TC_Amazon_002 extends TestBase{

	@Test(dataProvider="getData")
	public void searchItem(String Category, String ItemName) throws IOException {		
		boolean contains = driver.getTitle().contains("Amazon");

		if(contains) {
			Reporter.log("The user is on home page",true);
			sAssert.assertTrue(contains);
		}else {
			Reporter.log("The user is not on home page",true);
			captureScreenshot(driver,"searchItem");
			sAssert.assertTrue(contains);
		}

		AmazonOR.getCategory().selectByVisibleText(Category); // 1st field
		AmazonOR.getSearchTxtField().clear();
		AmazonOR.getSearchTxtField().sendKeys(ItemName); // 2nd field
		AmazonOR.getMagnifierBtn().click();

		WebDriverWait expWait = new WebDriverWait(driver,40);
		expWait.until(ExpectedConditions.titleContains(ItemName));
		
		boolean Titlecontains = driver.getTitle().contains(ItemName);
		if(Titlecontains) {
			Reporter.log("The item is searched",true);
			sAssert.assertEquals(Titlecontains, true);
		}else {
			Reporter.log("The item is not searched",true);
			captureScreenshot(driver,"searchItem");
			sAssert.assertEquals(Titlecontains, true);
		}

		List<WebElement> getallItems = AmazonOR.getallItems();
		for(WebElement item:getallItems) {
			Reporter.log(item.getText(),true);
		}
		sAssert.assertAll();
	}
	

	@DataProvider
	public String[][] getData() throws IOException{
		String xFile = "D:\\DevLabs\\Global- Batch 2\\DevLabsGlobalBatch2.TestAutomation.Selenium\\src\\test\\java\\com\\qa\\testdata\\TestData.xlsx";
		String xSheetName = "Sheet1";
		
		int rowCount = ExcelUtility.getRowCount(xFile, xSheetName);
		int cellCount = ExcelUtility.getCellCount(xFile, xSheetName, rowCount);
		
		String[][] data = new String[rowCount][cellCount];
		
		for(int i=1 ; i<=rowCount ; i++) {
			for(int j=0; j<cellCount;j++) {
				data[i-1][j] = ExcelUtility.getCellData(xFile, xSheetName, i, j);
			}
		}
		
		/*
		Object[][] data = new Object[3][2];
		data[0][0] = "Books";
		data[1][0] = "Electronics";
		data[2][0] = "Furniture";
		
		data[0][1] = "Da Vinci Code";
		data[1][1] = "Mobile Phones";
		data[2][1] = "Wooden Tables";
		*/
		return data;
	}
}
