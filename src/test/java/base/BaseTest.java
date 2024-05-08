package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import utills.ExtendsManagerDemo2;


public class BaseTest {
	public static FileInputStream fis;
	public static Properties test;
	public static FileInputStream fis2;
	public static Properties locator;
	public static WebDriver driver;
	
	public static ExtentReports reports2;
	public static ExtentTest text2;
	
	@AfterTest
	public void FinalReports() {
		if(reports2!=null) {
			reports2.flush();
		}
	}
	@BeforeTest
	public void start() throws IOException {
		
		fis=new FileInputStream("src\\test\\resources\\properties\\config.properties");
		
		test=new Properties();
		test.load(fis);
		
		fis2=new FileInputStream("src\\test\\resources\\properties\\locaters.properties");
		
		locator=new Properties();
		locator.load(fis2);
		
		reports2=ExtendsManagerDemo2.getProperty2();
	}
	@BeforeMethod
	public void Broswer(ITestContext context ) {
		text2=reports2.createTest(context.getCurrentXmlTest().getClasses().get(0).getName());
		//text2=reports2.createTest("Login Test");
		//text=reports.createTest("login Test");
		String browsername=test.getProperty("browser");
		if(browsername.endsWith("chrome")) {
			driver= new ChromeDriver();
			text2.info("Chrome Browser has lunched");
		}
		else if(browsername.endsWith("firefox")) {
			driver=new FirefoxDriver();
			text2.info("firefox Browser has lunched");
		}
		else if(browsername.endsWith("edge")) {
			driver=new EdgeDriver();
			text2.info("edge Browser has lunched");
		}
		
		driver.get(test.getProperty("url"));
		text2.info("Application has lunched"+test.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	
	@AfterMethod
	public void Finish() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
	

}
