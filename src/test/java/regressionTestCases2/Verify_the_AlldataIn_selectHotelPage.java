package regressionTestCases2;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pages.BasePage;
import pages.Login_page;
import pages.SearchHotel_page;

public class Verify_the_AlldataIn_selectHotelPage extends BasePage {
	@Test
	public void verify_TC111() throws InterruptedException {
		
		Login_page lg=new Login_page();
		
		lg.username("krishnateja19");
		lg.passwordBox("krishna123");
		lg.loginButton();
		
		SearchHotel_page sh=new SearchHotel_page();
		sh.LoacationBox("Sydney");
		sh.hotelDropDown("Hotel Creek");
		sh.roomTypeDropdown("Standard");
		sh.noofRoomsDropdown("2 - Two");
		sh.checkInDateDropdown("04/04/2024");
		sh.checkOutDateDropdown("06/04/2024");
		sh.adultRoomDropdown("1 - One");
		sh.searchButton();
		
		verifyText("location_0", "Sydney");
		verifyText("hotel_name_0", "Hotel Creek");
		verifyText("room_type_0", "Standard");
		verifyText("rooms_0", "2 Rooms");
		
		driver.findElement(By.xpath("//input[@id='radiobutton_0']")).click();
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		
		int NoofRooms=2;
		int NoofDays=1;
		int PricePerNight=125;
		int price=PricePerNight*NoofDays*NoofRooms;
		
		System.out.println("Total Price of Room :"+price);
		
		String block=driver.findElement(By.id("total_price_dis")).getAttribute("value");
		System.out.println(block);
		System.out.println(block+ "Added Extra 4% in select hotel Page");
		
		
	
	}

}
