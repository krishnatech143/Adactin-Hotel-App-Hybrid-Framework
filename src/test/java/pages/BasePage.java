package pages;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import base.BaseTest;

public class BasePage extends BaseTest {

		public void verifyTitile(String ExpectedTitle) {
			Assert.assertEquals(driver.getTitle(), ExpectedTitle);
		//	text.info("Assertion is passed "+ExpectedTitle);
			text2.info("Assertion Passed :"+ExpectedTitle);
		}
		public void verifyChechInDates(String ExpectedTitle) {
			Assert.assertEquals(driver.getTitle(), ExpectedTitle);
		//	text.info("CheckIndates expected :"+ExpectedTitle);
			text2.info("CheckIndates expected :"+ExpectedTitle);
		}
		
		public void getTitle() {
			System.out.println(driver.findElement(By.xpath(test.getProperty("gettitle"))).getText());
			}
		
		public void clear(WebElement element) {
			element.clear();
			//text.info("element is cleared"+element);
			text2.info("element is cleared"+element);
		}
		public void type(WebElement element,String data) {
			element.sendKeys(data);
			//text.info("Enter text "+data+"into the "+element);
			text2.info("Enter text "+data+"into the "+element);
		}
		
		public void selectDropDown(WebElement element,String visibletext) {
			new Select(element).selectByVisibleText(visibletext);
			//text.info("Select option "+element+"From the Dropdown"+visibletext);
			text2.info("Select option "+element+"From the Dropdown"+visibletext);
		}

		public void click(WebElement element ) {
			element.click();
		}
		public void verifyText( String element , String text2) {
			String value=driver.findElement(By.id(element)).getAttribute("value");
			Assert.assertEquals(value, text2);
			
		}
		public static String  screenShot() {
			
			String scnshotFolderPath=System.getProperty("user.dir")+"\\Screenshots";
			File srnFloder=new File(scnshotFolderPath);
			srnFloder.mkdir();
			
			Date date = new Date();

			String pattern = "yyyy-MM-dd HH-mm-ss";
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

			String date1 = simpleDateFormat.format(new Date());
			System.out.println(date1);
			
		    String scrnShotPath=scnshotFolderPath+"\\"+date1+".png";
			File scnshotFile=new File(scrnShotPath);
			
			File Photo=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			try {
				FileUtils.copyFile(Photo, new File(scrnShotPath));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			return scrnShotPath;
			
		}
		
		
} 
