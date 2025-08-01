package utility.com;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class ListenerClass implements ITestListener{
	 ExtentReports extent = ExtentReportManager.getReportObject();
	    ExtentTest test;

	    public void onTestStart(ITestResult result) {
	        test = extent.createTest(result.getMethod().getMethodName());
	    }

	    public void onTestSuccess(ITestResult result) {
	        test.pass("Test passed");
	    }

	    public void onTestFailure(ITestResult result) {
	        test.fail(result.getThrowable());
	    }

	    public void onFinish(org.testng.ITestContext context) {
	        extent.flush();
	    }
	}

