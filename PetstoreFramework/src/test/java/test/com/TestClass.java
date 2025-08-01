package test.com;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.com.BaseClass;
import pages.AddToCartPage;
import pages.HomePage;
import pages.LoginPage;
import pages.PaymentPage;
@Listeners(utility.com.ListenerClass.class)
	public class TestClass extends BaseClass {
	    LoginPage loginPage;
	    HomePage homePage;
	    AddToCartPage cartPage;
	    PaymentPage paymentPage;

	    @BeforeMethod
	    public void setup() {
	        initializeBrowser();
	        loginPage = new LoginPage(driver);
	        homePage = new HomePage(driver);
	        cartPage = new AddToCartPage(driver);
	        paymentPage = new PaymentPage(driver);
	    }

	    @Test
	    public void testLoginAndBuy() {
	        loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	        
	        homePage.clickDogCategory();
	        cartPage.addProductToCart();
	        paymentPage.completePayment();
	    }

	   // @AfterMethod
	   // public void tearDown() {
	    //    quitBrowser();
	    }
	//}

