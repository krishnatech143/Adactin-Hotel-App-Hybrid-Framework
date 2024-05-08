package testScripts;

import org.testng.annotations.Test;

public class AdatinHotel {
	
	@Test
	public void login() {
		pages.Login_page lg=new pages.Login_page();
		lg.username("krishnateja19");
		lg.passwordBox("krishna123");
		lg.loginButton();
		
		Search_HotelPage search=new Search_HotelPage();
		search.LocationDropDown("Brisbane");
		search.hotelsDropdown("Hotel Sunshine");
		search.roomType("Deluxe");
		search.noofRooms("2 - One");
		search.checkdate("31/03/2024");
		search.chechoutDate("01/04/2024");
		search.adultRoom("1 - One");
		search.click();
		
	}

}
