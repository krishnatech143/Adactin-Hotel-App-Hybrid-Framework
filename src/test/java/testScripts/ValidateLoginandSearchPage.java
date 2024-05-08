package testScripts;

import org.testng.annotations.Test;

import base.BaseTest;

public class ValidateLoginandSearchPage extends BaseTest {

	@Test
	public void validateLogin() throws InterruptedException {

		Page_Demo login = new Page_Demo();

		login.userId("krishnateja19");
		login.password_text("krishna123");
		login.click();

		Search_HotelPage search = new Search_HotelPage();

		search.verifyTitile("Adactin.com - Search Hotel");
		search.getTitle();
		search.LocationDropDown("Brisbane");
		search.hotelsDropdown("Hotel Sunshine");
		search.roomType("Deluxe");
		search.noofRooms("2 - One");
		search.checkdate("31/03/2024");
		search.chechoutDate("01/04/2024");
		search.adultRoom("1 - One");
		search.childrensRoom("1 - One");
		search.click();
		Thread.sleep(10000);
	}

}
