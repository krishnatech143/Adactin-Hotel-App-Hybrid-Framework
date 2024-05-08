package regressionTestCases2;

import org.testng.annotations.Test;

import pages.BasePage;
import pages.Login_page;
import pages.SearchHotel_page;

public class Verify_noofRoomsInSelectHotelPage extends BasePage {
	
	@Test
	public void TC_106() throws InterruptedException {
		Login_page lg=new Login_page();
		lg.username("krishnateja19");
		lg.passwordBox("krishna123");
		lg.loginButton();
		
		SearchHotel_page sc=new SearchHotel_page();
		sc.LoacationBox("Sydney");
		sc.hotelDropDown("Hotel Creek");
		sc.roomTypeDropdown("Standard");
		sc.noofRoomsDropdown("3 - Three");
		sc.checkInDateDropdown("04/04/2024");
		sc.checkOutDateDropdown("06/04/2024");
		sc.adultRoomDropdown("1 - One");
		sc.childrensRoomsDropdown("0 - None");
		sc.searchButton();
		
		verifyText("rooms_0", "3 Rooms");
		
		
	}

}
