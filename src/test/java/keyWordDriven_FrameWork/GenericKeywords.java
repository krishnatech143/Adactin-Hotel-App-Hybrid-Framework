package keyWordDriven_FrameWork;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import base.BaseTest;

public class GenericKeywords extends BaseTest{
	
	public void openbrowser() {
		String browser=test.getProperty("browser");
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			driver= new EdgeDriver();
		}
	}
	public void lunchApplication() {
		driver.get(test.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Long.parseLong(test.getProperty("wait"))));
	}
	public void close() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
	
	public void type(String locatorKey,String text) {
		setElement(locatorKey).sendKeys(text);
		
	}
	public void GetTitle() {
		System.out.println(driver.getTitle());
	}
	public WebElement setElement(String locatorKey) {
		
		WebElement value= null;
		value=driver.findElement(setLocator(locatorKey));
		return value;
	}
	public void click(String locatorKey) {
		setElement(locatorKey).click();
	}
	public void select(String locatorKey,String options) {
		new Select(setElement(locatorKey)).selectByVisibleText(options);
	}
	public By setLocator(String locatorKey) {
		
		By by=null;
		if(locatorKey.endsWith("id")) {
			by=By.id(locator.getProperty(locatorKey));
		}
		else if(locatorKey.endsWith("name")) {
			by=By.name(locator.getProperty(locatorKey));
		}
		else if (locatorKey.endsWith("Tagname")) {
			by=By.tagName(locator.getProperty(locatorKey));
		}
		else
		{
			by=By.xpath(locator.getProperty(locatorKey));
		}
		
		
		return by;
		
	}
	public void Screenshot() {
		
	}
	
	
	
	

}
