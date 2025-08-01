package base.com;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.com.ConfigReader;

public class BaseClass {
	  public static WebDriver driver;
	    public static Properties prop;

	    public void initializeBrowser() {
	        prop = ConfigReader.initProperties();
	        driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.manage().window().maximize();
	        driver.get(prop.getProperty("url"));
	    }

	    //public void quitBrowser() {
	    //    if (driver != null) {
	   //         driver.quit();
	    //    }
	    }
	//}

