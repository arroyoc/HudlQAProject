package testBase;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;

public class TestBase {

    protected static WebDriver wdriver;
    public String loginEmail = ""; // Add email here to test login test
    public String loginPassword = ""; // Add password here to test login test

    protected static void webSetup() throws IOException {

        // Check if web driver has already been instantiated
        // Driver options are 'PhantomJSDriver', 'ChromeDriver', 'FireFoxDriver'
        if (wdriver == null) {
            System.setProperty("webdriver.chrome.driver", "./../HudlQAProject//src//test//java//webDrivers//ChromeDriver//chromedriver.exe");
            wdriver = new ChromeDriver();
        }
        loadHudlSite();
    }

    // method to use after test classes
    protected static void webClose(){
        wdriver.quit();
        wdriver = null;
    }

    //Method that loads hudl site
    private static void loadHudlSite(){
        String hudlUrl = "https://www.hudl.com/login";
        wdriver.get(hudlUrl);
        wdriver.manage().window().maximize();
    }

}
