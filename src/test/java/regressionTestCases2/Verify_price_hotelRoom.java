package regressionTestCases2;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pages.BasePage;
import pages.Login_page;
import pages.SearchHotel_page;

public class Verify_price_hotelRoom extends BasePage{
	@Test
	public void TC_108() throws InterruptedException {
		Login_page li=new Login_page();
		li.username("krishnateja19");
		li.passwordBox("krishna123");
		li.loginButton();
		
		SearchHotel_page sp=new SearchHotel_page();
		sp.LoacationBox("Sydney");
		sp.hotelDropDown(" Hotel Creek");
		sp.roomTypeDropdown("Deluxe");
		sp.noofRoomsDropdown("2 - Two");
		sp.checkInDateDropdown("01/04/2024");
		sp.checkOutDateDropdown("03/04/2024");
		sp.adultRoomDropdown("1 - One");
		sp.searchButton();
		
		int per_night=325;
		int noof_room=2;
		int noof_days=1;
		
		int total=per_night*noof_room*noof_days;
		System.out.println("cal room price "+total);
		String obj=driver.findElement(By.name("total_price_0")).getAttribute("value");
		System.out.println("Total Rooms Price (excl GST)"+total);
		System.out.println("include GST"+obj);
		
	}
}
