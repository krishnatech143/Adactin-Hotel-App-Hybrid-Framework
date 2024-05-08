package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel_page extends BasePage{

	public SearchHotel_page() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="location")
	WebElement LoacationBox;
	
	@FindBy(id="hotels")
	WebElement HotelBox;
	
	@FindBy(id="room_type")
	WebElement roomTypeBox;
	
	@FindBy(id="room_nos")
	WebElement noofRooms;
	
	@FindBy(id="datepick_in")
	WebElement checkInDate;
	
	@FindBy(id="datepick_out")
	WebElement checkOutDate;
	
	@FindBy(id="adult_room")
	WebElement adultRoom;
	
	@FindBy(id="child_room")
	WebElement childrensRooms;
	
	@FindBy(id="Submit")
	WebElement searchButton;
	
	@FindBy(id="continue")
	WebElement continueButton;
	
	public void LoacationBox(String text) {
		selectDropDown(LoacationBox, text);
	}
	public void hotelDropDown(String text) {
		selectDropDown(HotelBox, text);
	}
	
	public void roomTypeDropdown(String text) {
		selectDropDown(roomTypeBox, text);
	}
	
	public void noofRoomsDropdown(String text) {
		selectDropDown(noofRooms, text);
	}
	public void checkInDateDropdown(String text) throws InterruptedException {
		Thread.sleep(3000);
		clear(checkInDate);
		type(checkInDate, text);
	}
	public void checkOutDateDropdown(String text) {
	   clear(checkOutDate);
		type(checkOutDate, text);
	}
	public void adultRoomDropdown(String text) {
		selectDropDown(adultRoom, text);
	}
	public void childrensRoomsDropdown(String text) {
		selectDropDown(childrensRooms, text);
	}
	
	public void searchButton() {
		
		searchButton.click();
	}
	public void continuebutton() {
		continueButton.click();
	}

}
