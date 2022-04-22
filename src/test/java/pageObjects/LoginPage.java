package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends PageObjectBase{

    public LoginPage(WebDriver driver){
        super(driver);
    }

    private By emailField = By.id("email");
    private By passField = By.id("password");
    private By loginBtn = By.id("logIn");

    public LoginPage typeEmail(String email){
        waitForElement(emailField).clear();
        waitForElement(emailField).sendKeys(email);
        return this;
    }

    public LoginPage typePassword(String pass){
        waitForElement(passField).clear();
        waitForElement(passField).sendKeys(pass);
        return this;
    }


}
