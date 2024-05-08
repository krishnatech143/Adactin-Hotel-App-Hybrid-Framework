package regressionTestCases2;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.BasePage;
import pages.Login_page;
import pages.SearchHotel_page;

public class VerifyTheRoomTypeInSelect_HotelPage extends BasePage {
	
	@Test
	public void TC_107() throws InterruptedException {
		
		Login_page lg=new Login_page();
		lg.username("krishnateja19");
		lg.passwordBox("krishna123");
		lg.loginButton();
		
		SearchHotel_page sc=new SearchHotel_page();
		sc.LoacationBox("Sydney");
		sc.hotelDropDown("Hotel Creek");
		sc.roomTypeDropdown("Deluxe");
		sc.noofRoomsDropdown("1 - One");
		sc.checkInDateDropdown("04/04/2024");
		sc.checkOutDateDropdown("06/04/2024");
		sc.adultRoomDropdown("1 - One");
		sc.childrensRoomsDropdown("0 - None");
		sc.searchButton();
		verifyTitile("Adactin.com - Select Hotel");
		String obj=driver.findElement(By.name("room_type_0")).getAttribute("value");
		Assert.assertEquals(obj, "Deluxe");
		
	}

}
