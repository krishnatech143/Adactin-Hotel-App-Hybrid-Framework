package regressionTestCases2;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pages.BasePage;
import pages.BookingConformation_page;
import pages.Login_page;
import pages.SearchHotel_page;

public class Generate_OrderId extends BasePage{
	@Test (priority=1)
	public void Tc_114() throws InterruptedException {
		
		Login_page lg=new Login_page();
		lg.username("krishnateja19");
		lg.passwordBox("krishna123");
		lg.loginButton();
		
		SearchHotel_page sp=new SearchHotel_page();
		sp.LoacationBox("Sydney");
		sp.hotelDropDown("Hotel Creek");
		sp.roomTypeDropdown("Standard");
		sp.noofRoomsDropdown("2 - Two");
		sp.checkInDateDropdown("09/04/2024");
		sp.checkOutDateDropdown("11/04/2024");
		sp.adultRoomDropdown("1 - One");
		sp.searchButton();
		
		driver.findElement(By.id("radiobutton_0")).click();
		sp.continuebutton();
		
		BookingConformation_page bc=new BookingConformation_page();
		
		bc.FirstName("subutheleo");
		bc.LastName("das");
		bc.Add_adders("India 3rd line near Bharthmatha");
		bc.CreditCardNo("1254896758896325");
		bc.selectCardType("Master Card");
		bc.Selectmonth("February");
		bc.SelectYear("2025");
		bc.CVVnumber("126");
		bc.BookButton();
		bc.getId("order_no");
		System.out.println("Booking id :"+driver.findElement(By.id("order_no")).getAttribute("value"));
			
	}
	@Test
	public void TC_117() {
		Login_page lg=new Login_page();
		lg.username("krishnateja19");
		lg.passwordBox("krishna123");
		lg.loginButton();
		
		driver.findElement(By.linkText("Booked Itinerary")).click();
	    driver.findElement(By.name("order_id_text")).sendKeys("Q30T0GJ95O");
		driver.findElement(By.id("search_hotel_id")).click();
		
		String part1 ="//tbody/tr[2]/td[";
		String part2 = "]/input";
		
		for(int i=2;i<=14;i++) {
		System.out.print(driver.findElement(By.xpath(part1+i+part2)).getAttribute("value")+"--");
		}
		
	}

}
