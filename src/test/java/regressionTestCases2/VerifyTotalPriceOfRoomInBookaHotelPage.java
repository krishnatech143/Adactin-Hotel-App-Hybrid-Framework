package regressionTestCases2;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pages.BasePage;
import pages.Login_page;
import pages.SearchHotel_page;

public class VerifyTotalPriceOfRoomInBookaHotelPage extends BasePage {
	@Test
	public void TC_110() throws InterruptedException {
		Login_page lg=new Login_page();
		lg.username("krishnateja19");
		lg.passwordBox("krishna123");
		lg.loginButton();
		
		SearchHotel_page sc=new SearchHotel_page();
		
		sc.LoacationBox("Melbourne");
		sc.hotelDropDown("Hotel Creek");
		sc.roomTypeDropdown("Standard");
		sc.noofRoomsDropdown("1 - One");
		sc.checkInDateDropdown("09/04/2024");
		sc.checkOutDateDropdown("11/04/2024");
		sc.adultRoomDropdown("1 - One");
		sc.searchButton();
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
