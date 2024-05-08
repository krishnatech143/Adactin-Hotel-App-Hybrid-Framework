package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseTest;

public class Login_page extends BasePage {

	public Login_page() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	WebElement usernameTestBox;

	@FindBy(id = "password")
	WebElement passwordTestBox;

	@FindBy(id = "login")
	WebElement loginButton;

	public void username(String text) {
		type(usernameTestBox, text);
	}

	public void passwordBox(String text) {
		type(passwordTestBox, text);
	}

	public void loginButton() {
		click(loginButton);
	}

}
