package regressionTestCases2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pages.BasePage;
import pages.Login_page;

public class ToVerifyThatTheOrderGetsCancelledafterclickonCancelOrderNumberLink extends BasePage {

	@Test
	public void TC_119() {
		
		Login_page lg=new Login_page();
		
		lg.username("krishnateja19");
		lg.passwordBox("krishna123");
		lg.loginButton();
		
		driver.findElement(By.linkText("Booked Itinerary")).click();
		driver.findElement(By.name("order_id_text")).sendKeys("YHE7A46X6L");
		driver.findElement(By.name("ids[]")).click();
		driver.findElement(By.name("cancelall")).click();
		
		Alert ale= driver.switchTo().alert();
		ale.accept();
	}
}
