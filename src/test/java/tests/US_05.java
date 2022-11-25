package tests;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import pages.QualityDemyPage_User;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_05 extends ReusableMethods {

    QualityDemyPage_User pageUser= new QualityDemyPage_User();

    @Test
    public void testTC0501(){
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
        pageUser.forgotPasswordLink.click();

        //- Test if it can reach to ""forgot_password"" page"
        String expectedForgotPasswordUrl="https://qualitydemy.com/home/forgot_password";
        String actualForgotPasswordUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualForgotPasswordUrl.contains(expectedForgotPasswordUrl));


    }
    @Test
    public void testTC0502(){
        //- Launch browser
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

        //- Click ""Sign up"" link
        pageUser.signUpLink.click();

        //- Test if it can reach to sign up page
        String expectedSignUpUrl="https://qualitydemy.com/sign_up";
        String actualSignUpUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualSignUpUrl.contains(expectedSignUpUrl));

    }
    @Test
    public void testTC0503(){
        //- Launch browser
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

        //- Locate e-mail box
        //- Enter user's (valid) e-mail address
        pageUser.emailBox.sendKeys(ConfigReader.getProperty("myValidEmailUS05"));

        //- Locate password box
        //- Enter user's (valid) password
        pageUser.passwordBox.sendKeys(ConfigReader.getProperty("myValidPasswordUS05"));

        //- Press login button
        pageUser.loginButtonLoginPage.click();

        //- Test if it can reach to home page
        String expectedSignUpUrl="https://qualitydemy.com/home";
        String actualSignUpUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualSignUpUrl.contains(expectedSignUpUrl));

        //- Test if a welcoming message is visible
        Assert.assertTrue(pageUser.welcomeMessage1.isEnabled());
        bekle(5);

        //- Log out for a new test
        Actions actions= new Actions(Driver.getDriver());
        actions.moveToElement(pageUser.testUserDropDownMenu).perform();
        bekle(2);
        pageUser.logOutButton.click();
    }

    @Test
    public void testTC0504(){
        //- Launch browser
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

        //***Test 1: incorrect email/incorrect passord***
        //- Locate e-mail box
        //- Enter an incorrect e-mail address
        pageUser.emailBox.sendKeys(ConfigReader.getProperty("incorrectEmailUS05"));

        //- Locate password box
        //- Enter an incorrect password
        pageUser.passwordBox.sendKeys(ConfigReader.getProperty("incorrectPasswordUS05"));

        //- Press login button
        pageUser.loginButtonLoginPage.click();
        bekle(3);

        //- Test if "invalid login cridentials" message appears
        Assert.assertTrue(pageUser.invalidLoginCridentialsPopup.isEnabled());

        //***Test 2: incorrect email/correct password***
        Driver.getDriver().navigate().back();
        pageUser.emailBox.clear();
        pageUser.passwordBox.clear();

        //- Locate e-mail box
        //- Enter an incorrect e-mail address
        pageUser.emailBox.sendKeys(ConfigReader.getProperty("incorrectEmailUS05"));

        //- Locate password box
        //- Enter user's (valid) password
        pageUser.passwordBox.sendKeys(ConfigReader.getProperty("myValidPasswordUS05"));

        //- Press login button
        pageUser.loginButtonLoginPage.click();
        bekle(3);

        //- Test if "invalid login cridentials" message appears
        Assert.assertTrue(pageUser.invalidLoginCridentialsPopup.isEnabled());

        //***Test 3: correct email/incorrect passord***
        Driver.getDriver().navigate().back();
        pageUser.emailBox.clear();
        pageUser.passwordBox.clear();

        //- Locate e-mail box
        //- Enter user's (valid) e-mail address
        pageUser.emailBox.sendKeys(ConfigReader.getProperty("myValidEmailUS05"));

        //- Locate password box
        //- Enter an incorrect password
        pageUser.passwordBox.sendKeys(ConfigReader.getProperty("incorrectPasswordUS05"));

        //- Press login button
        pageUser.loginButtonLoginPage.click();
        bekle(3);

        //- Test if "invalid login cridentials" message appears
        Assert.assertTrue(pageUser.invalidLoginCridentialsPopup.isEnabled());
    }

    @Test
    public void testTC0505() {
        //- Launch browser
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

        //***Test 1: Login without an e-mail address***

        //- Locate password box
        //- Enter a password
        pageUser.passwordBox.sendKeys(ConfigReader.getProperty("myValidPasswordUS05"));

        //- Press login button
        pageUser.loginButtonLoginPage.click();
        bekle(3);

        //- Test if page does not change
        String expectedLoginPageUrl="https://qualitydemy.com/login";
        String actualLoginPageUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualLoginPageUrl.contains(expectedLoginPageUrl));


        //***Test 2: invalid email test - @ sign does not exist***

        //- Locate e-mail box
        //- Enter an e-mail address without @ sign
        pageUser.emailBox.sendKeys(ConfigReader.getProperty("InvalidEmail1"));

        //- Locate password box
        //- Enter a password
        pageUser.passwordBox.sendKeys(ConfigReader.getProperty("myValidPasswordUS05"));

        //- Press login button
        pageUser.loginButtonLoginPage.click();
        bekle(3);

        //- Test if page does not change
        String actualLoginPageUrl2=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualLoginPageUrl2.contains(expectedLoginPageUrl));

        //***Test 3:  invalid email test - e-mail has two @ signs***
        pageUser.emailBox.clear();
        pageUser.passwordBox.clear();

        //- Locate e-mail box
        //- Enter an e-mail address without @ sign
        pageUser.emailBox.sendKeys(ConfigReader.getProperty("InvalidEmail2"));

        //- Locate password box
        //- Enter a password
        pageUser.passwordBox.sendKeys(ConfigReader.getProperty("myValidPasswordUS05"));

        //- Press login button
        pageUser.loginButtonLoginPage.click();
        bekle(3);

        //- Test if page does not change
        String actualLoginPageUrl3=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualLoginPageUrl3.contains(expectedLoginPageUrl));
    }

    @AfterClass
    public void teardown(){
        Driver.closeDriver();
    }

}
