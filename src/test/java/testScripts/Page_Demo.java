package testScripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pages.BasePage;


public class Page_Demo extends BasePage {
	
	public Page_Demo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id=\"username\"]")
	WebElement user_Box;
	
	@FindBy(xpath="//input[@id=\"password\"]")
	WebElement password_Box;
	
	@FindBy(xpath="//input[@id=\"login\"]")
	WebElement login_click;
	
	
	
	
	public void userId(String text) {
		user_Box.sendKeys(text);
	}
	public void password_text(String text) {
		password_Box.sendKeys(text);
	}
	public void click() {
		login_click.click();
	}
	

}
