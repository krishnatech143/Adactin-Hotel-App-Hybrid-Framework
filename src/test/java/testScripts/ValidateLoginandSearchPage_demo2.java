package testScripts;

import java.util.HashMap;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import utills.UtiilsKit2;

public class ValidateLoginandSearchPage_demo2 extends BaseTest {

	@Test(dataProvider="setdata")
	public void validateLogin(HashMap<String, String> datamap) throws InterruptedException {

		Page_Demo login = new Page_Demo();

		login.userId(datamap.get("username"));
		login.password_text(datamap.get("password"));
		login.click();

		Search_HotelPage search = new Search_HotelPage();

		search.verifyTitile(datamap.get("Expected Title1"));
		search.getTitle();
		search.LocationDropDown(datamap.get("Location"));
		search.hotelsDropdown(datamap.get("Hotels"));
		search.roomType(datamap.get("Room Type"));
		search.noofRooms(datamap.get("Number of Rooms"));
		search.checkdate(datamap.get("Check In Date"));
		search.chechoutDate(datamap.get("Check Out Date"));
		search.adultRoom(datamap.get("Adults per Room"));
		search.childrensRoom(datamap.get("Children per Room"));
		search.click();
		Thread.sleep(10000);
		search.verifyTitile(datamap.get("Expected Title2"));	
		}

	@DataProvider
	public Object[][] setdata() 
	{
		Object[][] data = new Object[1][1];
		data[0][0]=UtiilsKit2.getTestDataFromExcel("TC-102");
		return data;

	}

}
