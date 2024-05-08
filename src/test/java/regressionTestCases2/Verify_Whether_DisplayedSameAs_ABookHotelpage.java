package regressionTestCases2;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pages.BasePage;
import pages.Login_page;
import pages.SearchHotel_page;

public class Verify_Whether_DisplayedSameAs_ABookHotelpage extends BasePage {
	
	@Test
	public void TC_113() throws InterruptedException {
		Login_page lg=new Login_page();
		lg.username("krishnateja19");
		lg.passwordBox("krishna123");
		lg.loginButton();
		
		SearchHotel_page sp=new SearchHotel_page();
		sp.LoacationBox("Sydney");
		sp.hotelDropDown(" Hotel Creek");
		sp.roomTypeDropdown("Standard");
		sp.noofRoomsDropdown("2 - Two");
		sp.checkInDateDropdown("09/04/2024");
		sp.checkOutDateDropdown("11/04/2024");
		sp.adultRoomDropdown("1 - One");
		sp.searchButton();
		
		driver.findElement(By.id("radiobutton_0")).click();
		sp.continuebutton();
		int totalRoomPrice=135;
		double finalPrice=totalRoomPrice+totalRoomPrice*0.100;
		System.out.println("final price of Room "+finalPrice);
		
		String block=driver.findElement(By.id("final_price_dis")).getAttribute("value");
		System.out.println(block);
		
	}

}
