package testScripts;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Invaild_login {
	WebDriver driver;
	@BeforeMethod
	public void start() {
		driver=new ChromeDriver();
		driver.get("http://adactinhotelapp.com/index.php");
		
	}
	@Test
	public void setUp() {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("4571");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("2688");
		driver.findElement(By.xpath("//input[@id='login']")).click();
		
		Assert.assertEquals(driver.getTitle(), "Adactin.com - Hotel Reservation System");
	}
	@Test
	public void setUP2() {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("krishnateja19");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("krishna123");
		driver.findElement(By.xpath("//input[@id='login']")).click();
		Assert.assertEquals(driver.getTitle(), "Adactin.com - Search Hotel");
	}
	@AfterMethod
	public void finsh() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
}

