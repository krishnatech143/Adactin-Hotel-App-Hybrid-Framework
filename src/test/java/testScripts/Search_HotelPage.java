package testScripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pages.BasePage;

public class Search_HotelPage extends BasePage {
	
	public Search_HotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//select[@id='location']")
	WebElement Location_DropDown;
	
	@FindBy(xpath="//select[@name='hotels']")
	WebElement Hotels_DropDown;
	
	@FindBy(xpath="//select[@id='room_type']")
	WebElement room_TypeDropDown;
	
	@FindBy(xpath="//select[@id='room_nos']")
	WebElement noofRooms;
	
	@FindBy(xpath="//input[@name='datepick_in']")
	WebElement check_in_Date;
	
	@FindBy(xpath="//input[@name='datepick_out']")
	WebElement check_out_Date;
	
	@FindBy(xpath="//select[@name='adult_room']")
	WebElement adult_Room;

	@FindBy(xpath="//select[@name='child_room']")
	WebElement children_Room;
	@FindBy(xpath="//input[@id='Submit']")
	WebElement SearchButton;
	
	
	public void LocationDropDown(String text) {
		Location_DropDown.sendKeys(text);
	}
	public void hotelsDropdown(String text) {
		Hotels_DropDown.sendKeys(text);
	}
	public void roomType(String text) {
		room_TypeDropDown.sendKeys(text);
	}
	public void noofRooms(String text) {
		noofRooms.sendKeys(text);
	}
	public void checkdate(String date) {
		clear(check_in_Date);
		type(check_in_Date, date);
	}
	public void chechoutDate(String date) {
		clear(check_out_Date);
		type(check_out_Date, date);
	}
	public void adultRoom(String text) {
		adult_Room.sendKeys(text);
	}
	public void childrensRoom(String text) {
		children_Room.sendKeys(text);
	}
	public void click() {
		SearchButton.click();
	}
}











