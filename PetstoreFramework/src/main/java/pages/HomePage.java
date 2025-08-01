package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    
    By DogCategory = By.xpath("//*[@id=\"QuickLinks\"]/a[2]/img");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickDogCategory() {
    	 Alert alert = driver.switchTo().alert();
    	 System.out.println("Alert Text: " + alert.getText());
    	    alert.accept(); // click OK
    
        driver.findElement(DogCategory).click();
        
    }   
    }


