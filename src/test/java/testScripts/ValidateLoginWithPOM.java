package testScripts;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ValidateLoginWithPOM extends pages.BasePage{
	
	@Test
	public void ValidateLogin() {
		
		Page_Demo log=PageFactory.initElements(driver, Page_Demo.class);
		
		log.userId("krishnateja19");
		log.password_text("krishna123");
		log.click();
		log.verifyTitile("Adactin.com - Search Hotel");
		log.getTitle();
		
		
		
	}
	
	
	

}
