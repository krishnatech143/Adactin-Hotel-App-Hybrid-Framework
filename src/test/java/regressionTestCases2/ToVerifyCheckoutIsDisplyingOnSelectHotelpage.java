package regressionTestCases2;

import org.testng.annotations.Test;

import pages.BasePage;
import pages.Login_page;
import pages.SearchHotel_page;

public class ToVerifyCheckoutIsDisplyingOnSelectHotelpage extends BasePage {
	
	@Test
	public void Verify_TC105() throws InterruptedException {
		Login_page lg=new Login_page();
		lg.username("krishnateja19");
		lg.passwordBox("krishna123");
		lg.loginButton();
		
		SearchHotel_page sc=new SearchHotel_page();
		sc.LoacationBox("Sydney");
		sc.hotelDropDown("Hotel Creek");
		sc.roomTypeDropdown("Deluxe");
		sc.noofRoomsDropdown("1 - One");
		sc.checkInDateDropdown("09/04/2024");
		sc.checkOutDateDropdown("10/04/2024");
		sc.adultRoomDropdown("1 - One");
		sc.searchButton();
		
		verifyText("dep_date_0", "10/04/2024");
		
	}

}
