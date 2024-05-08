package utills;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import base.BaseTest;

public class ExtendsManagerDemo2 extends BaseTest {

	public static ExtentReports getProperty2() {

		String FolderPath = System.getProperty("user.dir")+"//reports2";
		if (reports2 == null)
		{
			reports2 = new ExtentReports();

			File CreateFolder = new File(FolderPath);
			CreateFolder.mkdir();

			Date date = new Date();
			System.out.println(date);

			String pattern = "yyyy-MM-dd HH-mm-ss";
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

			String date1 = simpleDateFormat.format(new Date());
			System.out.println(date1);

			File createFile = new File(FolderPath+"\\"+date1+".html");

			ExtentSparkReporter sparkReport = new ExtentSparkReporter(createFile);

			sparkReport.config().setDocumentTitle("Adactin QA Testing Reports ");
			sparkReport.config().setReportName("Adactin Regreesion TestCases");
			sparkReport.config().setTheme(Theme.DARK);
			reports2.attachReporter(sparkReport);

		}

		return reports2;

	}

}
