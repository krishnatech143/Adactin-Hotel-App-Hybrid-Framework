package regressionTestCases2;

import org.testng.annotations.Test;

import pages.BasePage;
import pages.Login_page;
import pages.SearchHotel_page;

public class ValidatingTheCheck_In_out_LaterDates extends BasePage {

	@Test
	public void verify_the_TC102() throws InterruptedException {

		Login_page lg = new Login_page();
		lg.username("krishnateja19");
		lg.passwordBox("krishna123");
		lg.loginButton();

		SearchHotel_page sh = new SearchHotel_page();
		sh.LoacationBox("Sydney");
		sh.hotelDropDown("Hotel Creek");
		sh.roomTypeDropdown("Standard");
		sh.noofRoomsDropdown("1 - One");
		sh.checkInDateDropdown("07/04/2024");
		sh.checkOutDateDropdown("05/04/2024");
		sh.searchButton();
		
		verifyText(null, null);
	}

	//@Test
	public void verify_theCheckinandoutDates1() throws InterruptedException {

		Login_page lg = new Login_page();
		lg.username("krishnateja19");
		lg.passwordBox("krishna123");
		lg.loginButton();

		SearchHotel_page sh = new SearchHotel_page();
		sh.LoacationBox("Sydney");
		sh.hotelDropDown("Hotel Creek");
		sh.roomTypeDropdown("Standard");
		sh.noofRoomsDropdown("1 - One");
		sh.checkInDateDropdown("26/03/2024");
		sh.checkOutDateDropdown("29/03/2024");
		sh.searchButton();

		// sh.verifyError("Check-In Date shall be before than Check-Out Date");

		verifyTitile("Adactin.com - Select Hotel");

	}

}
