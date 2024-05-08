package listners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

import base.BaseTest;
import pages.BasePage;

public class ListnersFile extends BaseTest implements ITestListener {

	public void onTestStart(ITestResult result) {
		
	}

	public void onTestSuccess(ITestResult result) {
	
		String	testCaseName=result.getMethod().getMethodName();
		
		text2.log(Status.PASS, testCaseName+"testcase passed");
		
		String ScnFile=BasePage.screenShot();
		
		text2.addScreenCaptureFromPath(ScnFile);
		
	
		
	}

	public void onTestFailure(ITestResult result) {
		
	}

	public void onTestSkipped(ITestResult result) {

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		
	}

	public void onFinish(ITestContext context) {
		
	}
	

}
