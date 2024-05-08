package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.BaseTest;

public class BookingConformation_page extends BaseTest {

	public BookingConformation_page() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='first_name']")
	WebElement Firstname;

	@FindBy(id = "last_name")
	WebElement LastName;

	@FindBy(id = "address")
	WebElement BillingAdders;

	@FindBy(id = "cc_num")
	WebElement CreditCardNo;

	@FindBy(id = "cc_type")
	WebElement CardType;

	@FindBy(id = "cc_exp_month")
	WebElement cardmonth;

	@FindBy(id = "cc_exp_year")
	WebElement CardYear;

	@FindBy(id = "cc_cvv")
	WebElement CVVnumber;

	@FindBy(id = "book_now")
	WebElement BookButton;

	public void FirstName(String text) {
		Firstname.sendKeys(text);
	}

	public void LastName(String text) {
		LastName.sendKeys(text);
	}

	public void Add_adders(String text) {
		BillingAdders.sendKeys(text);
	}

	public void CreditCardNo(String text) {
		CreditCardNo.sendKeys(text);
	}

	public void selectCardType(String text) {
		new Select(CardType).selectByVisibleText(text);
	}

	public void Selectmonth(String text) {
		new Select(cardmonth).selectByVisibleText(text);
	}

	public void SelectYear(String text) {
		new Select(CardYear).selectByVisibleText(text);
	}

	public void CVVnumber(String text) {
		CVVnumber.sendKeys(text);
	}

	public void BookButton() {
		BookButton.click();
	}

	public void getId(String text) {
		driver.findElement(By.id(text)).getAttribute("value");
	}

}
