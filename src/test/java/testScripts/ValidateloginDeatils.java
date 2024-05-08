package testScripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class ValidateloginDeatils extends BaseTest {
	
	@Test
	public void ValidLoginDeatils() {
		driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("krishnateja19");
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("krishna123");
		driver.findElement(By.xpath("//input[@id=\"login\"]")).click();
		
		Assert.assertEquals(driver.getTitle(), "Adactin.com - Search Hotel");
	}
	@Test
	public void InvalidUsernameandPassword() {
		driver.findElement(By.name("username")).sendKeys("reyaz568");
		driver.findElement(By.name("password")).sendKeys("reyaz123");
		driver.findElement(By.id("login")).click();
		
		Assert.assertEquals(driver.getTitle(), "Adactin.com - Hotel Reservation System");
		}
	@Test
	public void ValidUsernameInvalidPassWord() {
		driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("krishnateja19");
		driver.findElement(By.name("password")).sendKeys("teja456");
		driver.findElement(By.name("login")).click();
		Assert.assertEquals(driver.getTitle(), "Adactin.com - Hotel Reservation System");
	}
	@Test
	public void invalidUsernameValidPassword() {
		driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("user@123");
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("krishna123");
		driver.findElement(By.name("login")).click();
		Assert.assertEquals(driver.getTitle(), "Adactin.com - Hotel Reservation System");
		
	}
	
	

}
