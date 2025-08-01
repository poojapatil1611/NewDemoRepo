package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentPage {
	 WebDriver driver;

	    By proceedToCheckout = By.linkText("Proceed to Checkout");
	    By continueBtn = By.name("newOrder");
	    By confirmBtn = By.linkText("Confirm");

	    public PaymentPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void completePayment() {
	        driver.findElement(proceedToCheckout).click();
	        driver.findElement(continueBtn).click();
	        driver.findElement(confirmBtn).click();
	    }
	}

