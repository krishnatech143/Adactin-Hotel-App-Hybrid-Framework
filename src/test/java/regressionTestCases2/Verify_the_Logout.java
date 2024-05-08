package regressionTestCases2;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pages.BasePage;
import pages.Login_page;

public class Verify_the_Logout extends BasePage{

	@Test
	public void TC_109() {
		
		Login_page li=new Login_page();
		li.username("krishnateja19");
		li.passwordBox("krishna123");
		li.loginButton();
		
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	}
}
