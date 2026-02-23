package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
         PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@data-qa='login-email']")
    WebElement emailInput;

    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement passwordInput;

    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement loginButton;

 public void enterEmail(String email) {
    emailInput.sendKeys(email);  // Use parameter, not hardcoded value
}

public void enterPassword(String password) {
    passwordInput.sendKeys(password);  // Use parameter, not hardcoded value
}     
        public void clickLoginButton() {
            loginButton.click();
        }   
}
