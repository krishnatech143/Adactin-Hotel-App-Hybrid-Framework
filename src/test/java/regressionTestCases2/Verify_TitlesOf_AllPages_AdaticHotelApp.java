package regressionTestCases2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pages.BasePage;
import pages.BookingConformation_page;
import pages.Login_page;
import pages.SearchHotel_page;

public class Verify_TitlesOf_AllPages_AdaticHotelApp extends BasePage {

	@Test
	public void TC_119() throws InterruptedException {

		Login_page lg = new Login_page();
		lg.username("krishnateja19");
		lg.passwordBox("krishna123");
		lg.loginButton();

		verifyTitile("Adactin.com - Search Hotel");

		SearchHotel_page sp = new SearchHotel_page();
		sp.LoacationBox("Sydney");
		sp.hotelDropDown("Hotel Creek");
		sp.roomTypeDropdown("Deluxe");
		sp.noofRoomsDropdown("2 - Two");
		sp.checkInDateDropdown("01/04/2024");
		sp.checkOutDateDropdown("03/04/2024");
		sp.adultRoomDropdown("1 - One");
		sp.searchButton();

		System.out.println(driver.getTitle());
		verifyTitile("Adactin.com - Select Hotel");
		
		driver.findElement(By.id("radiobutton_0")).click();
		sp.continuebutton();
		
		System.out.println(driver.getTitle());
		verifyTitile("Adactin.com - Book A Hotel");

		BookingConformation_page bc = new BookingConformation_page();

		bc.FirstName("subutheleo");
		bc.LastName("das");
		bc.Add_adders("India 3rd line near Bharthmatha");
		bc.CreditCardNo("1254896758896325");
		bc.selectCardType("Master Card");
		bc.Selectmonth("February");
		bc.SelectYear("2025");
		bc.CVVnumber("126");
		bc.BookButton();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.titleIs("Adactin.com - Hotel Booking Confirmation"));
		
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("search_hotel")).click();
		
		System.out.println(driver.getTitle());
		
		verifyTitile("Adactin.com - Search Hotel");
		
	
	
	}

}
