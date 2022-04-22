package pageObjects;

import org.openqa.selenium.WebDriver;

public class HomePage extends PageObjectBase{

    public HomePage(WebDriver driver){
        super(driver);
    }

    public String getCurrentUrl() throws InterruptedException {
        Thread.sleep(5000); // Wait for homepage to load
        return driver.getCurrentUrl();
    }


}
