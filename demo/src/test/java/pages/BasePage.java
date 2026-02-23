package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
     public WebDriver driver;

     public BasePage(WebDriver driver) {
        this.driver = driver;
         PageFactory.initElements(driver, this);
    }
      public void navigateTo(String url) {
        driver.navigate().to(url);
    }
    
      public String getPageTitle() {
        return driver.getTitle();
      }
      public void waitForPageLoad() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
      }
    }
