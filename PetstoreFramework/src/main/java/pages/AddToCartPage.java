package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCartPage {
    WebDriver driver;

    By productLink = By.linkText("FI-SW-01");
    By addToCart = By.xpath("//a[text()='Add to Cart']");

    public AddToCartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addProductToCart() {
        driver.findElement(productLink).click();
        driver.findElement(addToCart).click();
    }
}

