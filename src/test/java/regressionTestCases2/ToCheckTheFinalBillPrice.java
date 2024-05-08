package regressionTestCases2;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pages.BasePage;
import pages.Login_page;
import pages.SearchHotel_page;

public class ToCheckTheFinalBillPrice extends BasePage{
	@Test
	public void Check_TC112() throws InterruptedException {
		
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
		sh.checkOutDateDropdown("05/04/2024");
		sh.adultRoomDropdown("1 - One");
		sh.searchButton();
		
		driver.findElement(By.xpath("//input[@id='radiobutton_0']")).click();
		sh.continuebutton();
		
		int totalRoomPrice=135;
		double finalPrice=totalRoomPrice+totalRoomPrice*0.100;
		System.out.println("final price of Room "+finalPrice);
		
		String block=driver.findElement(By.id("final_price_dis")).getAttribute("value");
		System.out.println(block);
		
		//Assert.assertEquals(block, finalPrice);
		
		
		
		
	}

}
