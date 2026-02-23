package testclasses;

import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends BaseTest {
LoginPage loginPage = new LoginPage(driver);

   @Test
    public void testValidLogin() {
        
        
        
        loginPage.navigateTo("https://automationexercise.com/login");
        loginPage.waitForPageLoad();
        
        loginPage.enterEmail("gplaysourav@gmail.com");
        loginPage.enterPassword("Sourav@123");
        loginPage.clickLoginButton();
        
    }
}
    

