package regressionTestCases2;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.BasePage;
import pages.Login_page;
import pages.SearchHotel_page;

public class Verify_theHotelsAsPer_SeletedLocation extends BasePage {
	@Test
	public void Verify_TC104() throws InterruptedException {
		Login_page li=new Login_page();
		li.username("krishnateja19");
		li.passwordBox("krishna123");
		li.loginButton();
		
		SearchHotel_page sp=new SearchHotel_page();
		sp.LoacationBox("Sydney");
		sp.hotelDropDown(" Hotel Creek");
		sp.roomTypeDropdown("Standard");
		sp.noofRoomsDropdown("1 - One");
		sp.checkInDateDropdown("01/04/2024");
		sp.checkOutDateDropdown("03/04/2024");
		sp.adultRoomDropdown("1 - One");
		sp.searchButton();
		 String obj=driver.findElement(By.id("location_0")).getAttribute("value");
		 Assert.assertEquals(obj, "Sydney");
		 System.out.println(obj);
		
		
		
		getTitle();
		
		
	}

}
