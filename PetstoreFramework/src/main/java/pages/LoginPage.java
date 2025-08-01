package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	  WebDriver driver;

	    By signInLink = By.linkText("Sign In");
	    By Username = By.name("username");
	    By Password = By.name("password");
	    By loginBtn = By.name("signon");

	    public LoginPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void login(String username, String password) {
	        driver.findElement(signInLink).click();
	        driver.findElement(Username).sendKeys(username);
	        driver.findElement(Password).sendKeys(password);
	        driver.findElement(loginBtn).click();
	    }
	}

