package testScripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;

public class ValidateLogin_Demo2  extends BaseTest {
		
		@Test(dataProvider="validData")
		public void ValidLoginDeatils(String id,String key,String actualLink) {
			driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys(id);
			driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys(key);
			driver.findElement(By.xpath("//input[@id=\"login\"]")).click();
			
			Assert.assertEquals(driver.getTitle(), actualLink);
		}
		
		@DataProvider
		public Object[][] validData(){
			
			Object[][] data=new Object[4][3] ;
			
			data[0][0]="krishnateja19";
			data[0][1]="krishna123";
			data[0][2]="Adactin.com - Search Hotel";
			

			data[1][0]="krishna19";
			data[1][1]="krishna123";
			data[1][2]="Adactin.com - Hotel Reservation System";
			
			data[2][0]="krishnateja19";
			data[2][1]="k4552";
			data[2][2]="Adactin.com - Hotel Reservation System";
		
			data[3][0]="krishna19";
			data[3][1]="krishn23";
			data[3][2]="Adactin.com - Hotel Reservation System";
			
			return data;
			
		}

	}



