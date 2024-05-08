package regressionTestCases2;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pages.BasePage;
import pages.BookingConformation_page;
import pages.Login_page;
import pages.SearchHotel_page;

public class ToCheckwhetherTheBookedItineraryReflectsInItineraryPage extends BasePage {
	
	@Test
	public void TC_116() throws InterruptedException {
		Login_page li=new Login_page();
		li.username("krishnateja19");
		li.passwordBox("krishna123");
		li.loginButton();
		
		SearchHotel_page sh=new SearchHotel_page();
		sh.LoacationBox("Sydney");
		sh.hotelDropDown("Hotel Creek");
		sh.roomTypeDropdown("Standard");
		sh.noofRoomsDropdown("2 - Two");
		sh.checkInDateDropdown("10/04/2024");
		sh.checkOutDateDropdown("11/04/2024");
		sh.adultRoomDropdown("2 - Two");
		sh.searchButton();
		driver.findElement(By.xpath("//input[@id='radiobutton_0']")).click();
		sh.continuebutton();
		
		BookingConformation_page bc= new  BookingConformation_page();
		bc.FirstName("krishna");
		bc.LastName("ram");
		bc.Add_adders("India andhrapradesh");
		bc.CreditCardNo("4597845632154895");
		bc.selectCardType("American Express");
		bc.Selectmonth("May");
		bc.SelectYear("2025");
		bc.CVVnumber("213");
		bc.BookButton();
		driver.findElement(By.xpath("//input[@id='my_itinerary']")).click();
		verifyText("hotel_name_1233445", "Hotel Creek");
		verifyText("location_1233445", "Sydney");
		verifyText("arr_date_1233445", "10/04/2024");
		verifyText("dep_date_1233445", "11/04/2024");
	}

}
