package regressionTestCases2;

import org.testng.annotations.Test;

import pages.BasePage;
import pages.Login_page;
import pages.SearchHotel_page;

public class ValidateLoginandSearchpage extends BasePage {
	@Test
	public void validate_Login_TC101 ()throws InterruptedException {
		
		Login_page li=new Login_page();
		li.username("krishnateja19");
		li.passwordBox("krishna123");
		li.loginButton();
		
		SearchHotel_page sp=new SearchHotel_page();
		sp.LoacationBox("Los Angeles");
		sp.hotelDropDown("Hotel Cornice");
		sp.roomTypeDropdown("Super Deluxe");
		sp.noofRoomsDropdown("4 - Four");
		sp.checkInDateDropdown("01/04/2024");
		sp.checkOutDateDropdown("03/04/2024");
		sp.adultRoomDropdown("2 - Two");
		sp.childrensRoomsDropdown("1 - One");
		sp.searchButton();
		getTitle();
	}
	//@Test
	public void NegativeLoginCase() {
		Login_page li=new Login_page();
		li.username("kapaul45");
		li.passwordBox("kapaula123");
		li.loginButton();
		getTitle();
	}

}
