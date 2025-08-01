package utility.com;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportManager {

	 public static ExtentReports extent;

	    public static ExtentReports getReportObject() {
	        String path = System.getProperty("user.dir") + "/test-output/ExtentReport.html";
	        ExtentSparkReporter reporter = new ExtentSparkReporter(path);
	        reporter.config().setReportName("Pet Store Test Report");
	        reporter.config().setDocumentTitle("Automation Report");

	        extent = new ExtentReports();
	        extent.attachReporter(reporter);
	        extent.setSystemInfo("Tester", "Pooja");
	        return extent;
	    }
	}

