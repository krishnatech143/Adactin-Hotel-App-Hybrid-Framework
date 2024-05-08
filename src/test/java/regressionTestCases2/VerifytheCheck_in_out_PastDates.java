package regressionTestCases2;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.BasePage;
import pages.Login_page;
import pages.SearchHotel_page;

public class VerifytheCheck_in_out_PastDates extends BasePage {
	@Test
	public void verify_TC103() throws InterruptedException {
		
		Login_page lg=new Login_page();
		lg.username("krishnateja19");
		lg.passwordBox("krishna123");
		lg.loginButton();
		
		SearchHotel_page sh=new SearchHotel_page();
		sh.LoacationBox("Sydney");
		sh.hotelDropDown("Hotel Creek");
		sh.roomTypeDropdown("Standard");
		sh.noofRoomsDropdown("1 - One");
		sh.checkInDateDropdown("04/04/2024");
		sh.checkOutDateDropdown("06/04/2024");
		sh.searchButton();
		verifyTitile("Adactin.com - Select Hotel");
		String obj=driver.findElement(By.id("dep_date_0")).getAttribute("value");
		Assert.assertEquals(obj, "06/04/2024");
		
	
}
}
