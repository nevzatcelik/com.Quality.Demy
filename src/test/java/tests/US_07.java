package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import pages.QualityDemyPage_User;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_07 extends ReusableMethods {

    QualityDemyPage_User pageUser= new QualityDemyPage_User();
    @Test
    public void testTC0701(){
        //-Launch temp mail
        Driver.getDriver().get(ConfigReader.getProperty("TempMailUrl"));
        bekle(2);

        // Copy e-mail address
        String tempEmailAddressString= pageUser.tempMailEmailAddress.getText();
        bekle(2);

        //- Launch browser
        //- Go to Quality Demy home page
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));

        //- Click “cookies” pop-up message
        try {
            pageUser.acceptCookiesLev.click();
        } catch (Exception e) {
            bekle(1);
        }

        //- Click ""Sign Up"" button
        //- Reach sign up page
        pageUser.signUpLink.click();
        bekle(3);

        //- Enter a name (at least 2 characters)
        pageUser.firstNameBox.sendKeys(Faker.instance().name().firstName());
        bekle(2);

        //- Enter a surname (at least 2 characters)
        pageUser.lastNameBox.sendKeys(Faker.instance().name().lastName());
        bekle(2);

        //- Enter a valid e-mail
        pageUser.emailBoxSignUpPage.sendKeys(tempEmailAddressString);
        bekle(2);
        Actions actions= new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        bekle(1);
        actions.moveToElement(pageUser.passwordBoxSignUpPage).perform();
        bekle(2);

        //- Enter a password (containing upper case, lower case, number and special character)
        pageUser.passwordBoxSignUpPage.sendKeys("Password12345.");

        //- Click to ""Sign Up"" button
        //- Reach to verification code page
        bekle(5);
        pageUser.signUpButton.click();
        bekle(5);

        // Reach to temp mail
        Driver.getDriver().get(ConfigReader.getProperty("TempMailUrl"));

        // Click to mail containing verification code
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        bekle(3);
        pageUser.tempMailMessageFirstClick.click();
        bekle(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        bekle(2);

        //-Test if any verification code reaches to the mail which is entered
        String expectedVerificationMailText="QualityDemy";
        String actualVerificationMailText=pageUser.tempMailVerificationText.getText();
        Assert.assertTrue(actualVerificationMailText.contains(expectedVerificationMailText));
    }

    @Test
    public void testTC0702(){
        //-Launch temp mail
        Driver.getDriver().get(ConfigReader.getProperty("TempMailUrl"));
        bekle(2);
        String tempEmailAddressString= pageUser.tempMailEmailAddress.getText();
        bekle(2);

        //- Launch browser
        //- Go to Quality Demy home page
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));

        //- Click “cookies” pop-up message
        try {
            pageUser.acceptCookiesLev.click();
        } catch (Exception e) {
            bekle(1);
        }

        //- Click ""Sign Up"" button
        //- Reach sign up page
        pageUser.signUpLink.click();
        bekle(3);

        //- Enter a name (at least 2 characters)
        pageUser.firstNameBox.sendKeys(Faker.instance().name().firstName());
        bekle(2);

        //- Enter a surname (at least 2 characters)
        pageUser.lastNameBox.sendKeys(Faker.instance().name().lastName());
        bekle(2);

        //- Enter a valid e-mail
        pageUser.emailBoxSignUpPage.sendKeys(tempEmailAddressString);
        bekle(2);
        Actions actions= new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        bekle(1);
        actions.moveToElement(pageUser.passwordBoxSignUpPage).perform();
        bekle(2);

        //- Enter a password (containing upper case, lower case, number and special character)
        pageUser.passwordBoxSignUpPage.sendKeys("Password12345.");

        //- click to ""Sign Up"" button
        //- Reach to verification code page
        bekle(5);
        pageUser.signUpButton.click();
        bekle(5);

        // Reach to temp mail
        Driver.getDriver().get(ConfigReader.getProperty("TempMailUrl"));

        // Click to verification code mail
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        bekle(3);
        pageUser.tempMailMessageFirstClick.click();
        bekle(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        bekle(2);

        // Copy varification code
        String verificationCode= pageUser.tempMailVerificationCode.getText();
        bekle(2);

        // Reach verfication code page
        Driver.getDriver().navigate().back();
        bekle(2);

        //- Enter the verification code
        pageUser.verificationCodeBox.sendKeys(verificationCode);
        bekle(5);

        //- Click to ""continue"" button
        actions.moveToElement(pageUser.continueButton).perform();
        pageUser.continueButton.click();
        bekle(5);

        //-Test if it can reach to login page
        String expectedLoginPageUrl="https://qualitydemy.com/login";
        String actualLoginPageUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualLoginPageUrl.contains(expectedLoginPageUrl));
    }

    @Test
    public void testTC0703(){
        //- Launch browser
        //- Go to Quality Demy home page
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));

        //- Click “cookies” pop-up message
        try {
            pageUser.acceptCookiesLev.click();
        } catch (Exception e) {
            bekle(1);
        }

        //- Click ""Sign Up"" button
        //- Reach sign up page
        pageUser.signUpLink.click();
        bekle(3);

        //- Enter a name (at least 2 characters)
        pageUser.firstNameBox.sendKeys(Faker.instance().name().firstName());
        bekle(2);

        //- Enter a surname (at least 2 characters)
        pageUser.lastNameBox.sendKeys(Faker.instance().name().lastName());
        bekle(2);

        //- Enter a valid e-mail
        pageUser.emailBoxSignUpPage.sendKeys("f4kfakemail@yandex.com");
        bekle(2);
        Actions actions= new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        bekle(1);
        actions.moveToElement(pageUser.passwordBoxSignUpPage).perform();
        bekle(2);

        //- Enter a password (containing upper case, lower case, number and special character)
        pageUser.passwordBoxSignUpPage.sendKeys("Password12345.");

        //- click to ""Sign Up"" button
        //- Reach to verification code page
        bekle(5);
        pageUser.signUpButton.click();
        bekle(5);

        //- Enter the verification code
        pageUser.verificationCodeBox.sendKeys("incorrectVarificationCode");
        bekle(5);

        //- Click to ""continue"" button
        actions.moveToElement(pageUser.continueButton).perform();
        pageUser.continueButton.click();
        bekle(5);

        //-Test if a message, which is ""The verification code is wrong"", appears at the corner"
        Assert.assertTrue(pageUser.verificationCodeWrongMessage.isEnabled());
        bekle(5);
    }

    @Test
    public void testTC0704(){
        //- Launch browser
        //- Go to Quality Demy home page
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));

        //- Click “cookies” pop-up message
        try {
            pageUser.acceptCookiesLev.click();
        } catch (Exception e) {
            bekle(1);
        }

        //- Click ""Sign Up"" button
        //- Reach sign up page
        pageUser.signUpLink.click();
        bekle(3);

        //- Enter a name (at least 2 characters)
        pageUser.firstNameBox.sendKeys(Faker.instance().name().firstName());
        bekle(2);

        //- Enter a surname (at least 2 characters)
        pageUser.lastNameBox.sendKeys(Faker.instance().name().lastName());
        bekle(2);

        //- Enter a valid e-mail
        //pageUser.emailBoxSignUpPage.sendKeys(tempEmailAddressString);
        pageUser.emailBoxSignUpPage.sendKeys("f4kfakemail@yandex.com");
        bekle(2);
        Actions actions= new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        bekle(1);
        actions.moveToElement(pageUser.passwordBoxSignUpPage).perform();
        bekle(2);

        //- Enter a password (containing upper case, lower case, number and special character)
        pageUser.passwordBoxSignUpPage.sendKeys("Password12345.");

        //- click to ""Sign Up"" button
        //- Reach to verification code page
        bekle(5);
        pageUser.signUpButton.click();
        bekle(5);

        //- Click to ""login"" link
        pageUser.verificationPageLoginLink.click();

        //-Test if it can reach to login page
        String expectedLoginPageUrl="https://qualitydemy.com/login";
        String actualLoginPageUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualLoginPageUrl.contains(expectedLoginPageUrl));
    }
    @AfterClass
    public void teardown(){
        Driver.closeDriver();
    }


}
