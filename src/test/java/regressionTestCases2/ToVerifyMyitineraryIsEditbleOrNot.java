package regressionTestCases2;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pages.BasePage;
import pages.BookingConformation_page;
import pages.Login_page;
import pages.SearchHotel_page;

public class ToVerifyMyitineraryIsEditbleOrNot extends BasePage {
	
	@Test
	public void TC_115() throws InterruptedException {
		
		Login_page lg=new Login_page();
		lg.username("krishnateja19");
		lg.passwordBox("krishna123");
		lg.loginButton();
		
		SearchHotel_page sc=new SearchHotel_page();
		sc.LoacationBox("Adelaide");
		sc.hotelDropDown("Hotel Cornice");
		sc.roomTypeDropdown("Standard");
		sc.noofRoomsDropdown("2 - Two");
		sc.checkInDateDropdown("10/04/2024");
		sc.checkOutDateDropdown("11/04/2024");
		sc.adultRoomDropdown("1 - One");
		sc.searchButton();
		driver.findElement(By.xpath("//input[@id='radiobutton_0']")).click();
		sc.continuebutton();
		
		BookingConformation_page bc=new BookingConformation_page();
		bc.FirstName("fkv");
		bc.LastName("jdk");
		bc.Add_adders("india guntur ");
		bc.CreditCardNo("4589632154785632");
		bc.selectCardType("American Express");
		bc.Selectmonth("May");
		bc.SelectYear("2027");
		bc.CVVnumber("256");
		bc.BookButton();
		
		driver.findElement(By.xpath("//input[@id='my_itinerary']")).click();
		System.out.println("Did not Editble in my_itinerary page ");
		
		
	}

}
