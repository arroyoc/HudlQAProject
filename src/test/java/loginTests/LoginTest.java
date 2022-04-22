package loginTests;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import pageObjects.LoginPage;
import testBase.TestBase;

public class LoginTest extends TestBase {

    @BeforeClass //Before the tests start > perform setUp..
    public static void setUp() throws Exception {
        webSetup(); //defined in testBase.TestBase
    }

    @AfterClass
    public static void tearDown(){
        webClose(); //defined in testBase.TestBase
    }

    @Test
    public void loginTest(){
        LoginPage lp = new LoginPage(wdriver);
        String hudlHomeUrl = "https://www.hudl.com/home"; // string that will be used to verify test

        //Test case steps
        lp.typeEmail(loginEmail) //type the given email
                .typePassword(loginPassword) //type the given password
                .clickLoginButton(); // click login button

        String currentUrl = wdriver.getCurrentUrl(); // Get the current URL and store as a string
        Assert.assertEquals(currentUrl, hudlHomeUrl); // verify test is on the homepage by checking and comparing URL
    }

}
