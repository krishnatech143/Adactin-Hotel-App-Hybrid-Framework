package regressionTestCases2;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pages.BasePage;
import pages.Login_page;

public class ToCheckSearchOrderIdQueryIsWorkingandDisplayingTheRelevantdetails extends BasePage {
	@Test
	public void TC_117() {
		Login_page lg=new Login_page();
		lg.username("krishnateja19");
		lg.passwordBox("krishna123");
		lg.loginButton();
		
		driver.findElement(By.linkText("Booked Itinerary")).click();
	    driver.findElement(By.name("order_id_text")).sendKeys("S2XHLAKBS8");
		driver.findElement(By.id("search_hotel_id")).click();
		
		String part1 ="//tbody/tr[2]/td[";
		String part2 = "]/input";
		
		for(int i=2;i<=14;i++) {
		System.out.print(driver.findElement(By.xpath(part1+i+part2)).getAttribute("value")+"--");
		}
		
	}

}
