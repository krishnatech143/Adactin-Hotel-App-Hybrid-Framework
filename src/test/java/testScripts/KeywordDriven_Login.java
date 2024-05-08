package testScripts;

import org.testng.annotations.Test;

import base.BaseTest;
import keyWordDriven_FrameWork.ApplicationKeyword;


public class KeywordDriven_Login extends BaseTest{
	 
	@Test
	public void start1() throws InterruptedException {
		
		ApplicationKeyword app=new ApplicationKeyword();
		
		app.openbrowser();
		
		app.lunchApplication();
		
		app.type("user_box", "krishnateja19");
		
		app.type("password_box", "krishna123");
		app.click("login_button");
		app.select("selectdrop", "Adelaide");
		Thread.sleep(3000);
		app.select("selectdrop2", "Hotel Sunshine");
		app.select("selectdrop3", "4 - Four");
		app.GetTitle();
		app.type("Check-in-date", "4/04/2024");
		app.type("Check-out-date", "01/04/2024");
		app.type("rooms", "2 - Two");
		app.type("child", "1 - One");
		app.click("click");
		app.close();
		
		
	}
	
	

}
