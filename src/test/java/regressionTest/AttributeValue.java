package regressionTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;

public class AttributeValue extends BasePage {
	
	@Test
	public void loginwithvalid() throws InterruptedException
	{
		pages.Login_page li=new pages.Login_page();
		li.username("krishnateja19");
		li.passwordBox("krishna123");
		li.loginButton();
		
		pages.SearchHotel_page sp=new pages.SearchHotel_page();
		sp.LoacationBox("Los Angeles");
		sp.hotelDropDown("Hotel Cornice");
		sp.roomTypeDropdown("Super Deluxe");
		sp.noofRoomsDropdown("4 - Four");
		sp.checkInDateDropdown("01/04/2024");
		sp.checkOutDateDropdown("03/04/2024");
		sp.adultRoomDropdown("2 - Two");
		sp.childrensRoomsDropdown("1 - One");
		sp.searchButton();
		
		String obj=driver.findElement(By.id("location_0")).getAttribute("value");
		
		Assert.assertEquals(obj, "Los Angeles");
		System.out.println(obj);
		
		
	}
	

}
