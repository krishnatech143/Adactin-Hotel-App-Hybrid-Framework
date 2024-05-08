package testScripts;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import utills.UtilKit;

public class Login_with_Excel extends  BaseTest{

	@Test(dataProvider = "data")
	public void start(HashMap<String, String> exceldata) {
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(exceldata.get("username"));
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(exceldata.get("password"));
		driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
		
		Assert.assertEquals(driver.getTitle(), exceldata.get("expected Title"));
		}
	@DataProvider
	
	public Object[][] data(){
		Object[][] getdata=new Object[1][1];
		
		getdata[0][0]=UtilKit.getTestDataFromExcel("TC100");
		
		return getdata;
		
		
	}
}

