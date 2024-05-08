package testScripts;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Adatin_Webtable {
	WebDriver driver;

	@BeforeMethod
	public void starrt() {
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
	}

	@Test
	public void setUp() throws InterruptedException {				
	}

	@AfterMethod
	public void finish() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}

}
