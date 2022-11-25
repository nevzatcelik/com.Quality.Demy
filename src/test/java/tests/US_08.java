package tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import pages.QualityDemyPage_User;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_08 extends ReusableMethods {

    QualityDemyPage_User pageUser= new QualityDemyPage_User();
    @Test
    public void testTC0801(){
        //"- Launch browser
        //- Go to Quality Demy home page
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));

        //- Click “cookies” pop-up message
        try {
            pageUser.acceptCookiesLev.click();
        } catch (Exception e) {
            bekle(1);
        }

        //- Click ""Log in"" button
        //- Reach login page
        pageUser.loginButtonLev.click();

        //- Click ""Forgot password?"" link
        //- Reach forgot password page
        pageUser.forgotPasswordLink.click();

        //- Locate ""Your e-mail"" box
        //- Enter a user's e-mail address
        pageUser.forgotPasswordEmailBox.sendKeys(ConfigReader.getProperty("myValidEmailUS05"));

        //- Click ""Send request"" button
        pageUser.sendRequestButton.click();

        //- Test if "Check your inbox for the request" message appears
        Assert.assertTrue(pageUser.forgotPasswordCheckYourInboxForTheRequestPopup.isEnabled());
    }

    @Test
    public void testTC0802(){
        //"- Launch browser
        //- Go to Quality Demy home page
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));

        //- Click “cookies” pop-up message
        try {
            pageUser.acceptCookiesLev.click();
        } catch (Exception e) {
            bekle(1);
        }

        //- Click ""Log in"" button
        //- Reach login page
        pageUser.loginButtonLev.click();

        //- Click ""Forgot password?"" link
        //- Reach forgot password page
        pageUser.forgotPasswordLink.click();

        //- Locate ""Your e-mail"" box
        //- Enter an unregistered e-mail address
        pageUser.forgotPasswordEmailBox.sendKeys("f4kfakemail@yandex.com");

        //- Click ""Send request"" button
        pageUser.sendRequestButton.click();

        //- Test if "User not found" message appears
        Assert.assertTrue(pageUser.forgotPasswordUserNotFoundPopup.isEnabled());
    }

    @Test
    public void testTC0803(){
        //"- Launch browser
        //- Go to Quality Demy home page
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));

        //- Click “cookies” pop-up message
        try {
            pageUser.acceptCookiesLev.click();
        } catch (Exception e) {
            bekle(1);
        }

        //- Click ""Log in"" button
        //- Reach login page
        pageUser.loginButtonLev.click();

        //- Click ""Forgot password?"" link
        //- Reach forgot password page
        pageUser.forgotPasswordLink.click();

        //- Click ""login"" link under ""send request"" button
        pageUser.forgotPasswordLoginLink.click();

        //- Test if page redirects to login page"
        String expectedLoginPageUrl="https://qualitydemy.com/login";
        String actualLoginPageUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualLoginPageUrl.contains(expectedLoginPageUrl));
    }

    @AfterClass
    public void teardown(){
        Driver.closeDriver();
    }
}
