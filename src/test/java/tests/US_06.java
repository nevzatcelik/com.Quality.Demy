package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.QualityDemyPage_User;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import java.io.IOException;


public class US_06 {
    String expectedText;
    String actualText;
    String expectedUrl = ConfigReader.getProperty("signUpVerificationUrl");
    String actualUrl = Driver.getDriver().getCurrentUrl();
    public void SignUpPage() {
        PageFactory.initElements(Driver.getDriver(), this);}

        @Test
        public void TC_0001_TestNewRegister() throws InterruptedException, IOException {
        QualityDemyPage_User mert = new QualityDemyPage_User();
        Faker faker = new Faker();
        SoftAssert softassert = new SoftAssert();
        mert.buttonSignUp.click();
        //new CookiesComp().acceptCookies();
        mert.buttonSignUp.click();
        mert.fieldFirstName.sendKeys(faker.name().firstName());
        mert.fieldLastName.sendKeys(faker.name().lastName());
        mert.fieldPassword.sendKeys(ConfigReader.getProperty("password"));
        mert.fieldEmail.sendKeys(faker.internet().emailAddress());
        mert.fieldEmail.sendKeys(Keys.PAGE_DOWN);
        ReusableMethods.waitForClickablility(mert.buttonNewSignUp, 30);
        mert.buttonNewSignUp.click();
        softassert.assertTrue(mert.verificationPage.isDisplayed(), "Although the user has entered the correct values," +
                "verification page does not appear");
        ReusableMethods.bekle(3);
        String alertText = "";
        alertText = mert.toastMessage.getText();
        String expectedNewUserText = ConfigReader.getProperty("signUpNewUserText");
        actualText = alertText;
        softassert.assertEquals(actualText, expectedNewUserText, "a green verification" +
                " message appears not in the corner");
        softassert.assertAll();
    }
    @Test
    public void TC_0002_LoginPage() {
        QualityDemyPage_User mert = new QualityDemyPage_User();
        SoftAssert softassert = new SoftAssert();
        //new CookiesComp().acceptCookies();
        mert.buttonLogin.click();
        ReusableMethods.bekle(2);
        expectedText = Driver.getDriver().findElement(By.xpath("//*[text()='Provide your valid login credentials']")).getText();
        actualText = ConfigReader.getProperty("isLoginPage");
        softassert.assertEquals(actualText, expectedText, "the user cannot reach Login Page");
        softassert.assertAll();
    }
    @Test
    public void Tc_0003_NegativesForFieldFirstAndLastName() {
        QualityDemyPage_User mert = new QualityDemyPage_User();
        Faker faker = new Faker();
        SoftAssert softassert = new SoftAssert();
        mert.buttonSignUp.click();
        mert.fieldFirstName.sendKeys("a");
        mert.fieldLastName.sendKeys(faker.name().lastName());
        mert.fieldEmail.sendKeys(faker.internet().emailAddress());
        mert.fieldPassword.sendKeys(faker.internet().password());
        mert.fieldPassword.sendKeys(Keys.PAGE_DOWN);
        ReusableMethods.waitForClickablility(mert.buttonNewSignUp, 30);
        mert.buttonNewSignUp.click();
        softassert.assertNotEquals(actualUrl, expectedUrl, "when First Name field is filled" +
                " with less than 2 letters, user can reach verification page.");
        Driver.getDriver().navigate().refresh();
        mert.fieldFirstName.sendKeys(faker.name().firstName());
        mert.fieldLastName.sendKeys("a");
        mert.fieldEmail.sendKeys(faker.internet().emailAddress());
        mert.fieldPassword.sendKeys(faker.internet().password());
        mert.fieldPassword.sendKeys(Keys.PAGE_DOWN);
        ReusableMethods.waitForClickablility(mert.buttonNewSignUp, 30);
        mert.buttonNewSignUp.click();
        softassert.assertNotEquals(actualUrl, expectedUrl, "when Last Name field is filled" +
                "with less than 2 letters, user can reach verification page.");
        softassert.assertAll();
    }
    @Test
    public void Tc_0004_NegativesForPassword1() {
        QualityDemyPage_User mert = new QualityDemyPage_User();
        Faker faker = new Faker();
        SoftAssert softassert = new SoftAssert();
        mert.buttonSignUp.click();
        ReusableMethods.waitForClickablility(mert.buttonNewSignUp, 30);
        mert.fieldFirstName.sendKeys(faker.name().firstName());
        mert.fieldLastName.sendKeys(faker.name().lastName());
        mert.fieldEmail.sendKeys(faker.internet().emailAddress());
        mert.fieldPassword.sendKeys("1*23");
        //new CookiesComp().acceptCookies();
        mert.fieldEmail.sendKeys(Keys.PAGE_DOWN);
        ReusableMethods.waitForClickablility(mert.buttonNewSignUp, 30);
        mert.buttonNewSignUp.click();
        softassert.assertNotEquals(actualUrl, expectedUrl, "when password field is filled" +
                " without Uppercase, user can reach verification page.");
        Driver.getDriver().navigate().back();
        mert.fieldFirstName.sendKeys(faker.name().firstName());
        mert.fieldLastName.sendKeys(faker.name().lastName());
        mert.fieldEmail.sendKeys(faker.internet().emailAddress());
        mert.fieldPassword.sendKeys("1*23");
        mert.fieldFirstName.sendKeys(Keys.PAGE_DOWN);
        JavascriptExecutor jsexecutor = (JavascriptExecutor) Driver.getDriver();
        jsexecutor.executeScript("arguments[0].click();", mert.buttonNewSignUp);

        softassert.assertNotEquals(actualUrl, expectedUrl, "when password field is filled" +
                " without Lowercase, user can reach verification page.");
        Driver.getDriver().navigate().refresh();
        mert.fieldFirstName.sendKeys(faker.name().firstName());
        mert.fieldLastName.sendKeys(faker.name().lastName());
        mert.fieldEmail.sendKeys(faker.internet().emailAddress());
        mert.fieldPassword.sendKeys("withoutNumbers,");
        ReusableMethods.waitForClickablility(mert.buttonNewSignUp, 30);
        jsexecutor.executeScript("arguments[0].click();", mert.buttonNewSignUp);
        softassert.assertNotEquals(actualUrl, expectedUrl, "when password field is filled" +
                " without Numbers, user can reach verification page.");
        Driver.getDriver().navigate().back();
        mert.fieldFirstName.sendKeys(faker.name().firstName());
        mert.fieldLastName.sendKeys(faker.name().lastName());
        mert.fieldEmail.sendKeys(faker.internet().emailAddress());
        mert.fieldPassword.sendKeys("withoutCharacters");
        ReusableMethods.waitForClickablility(mert.buttonNewSignUp, 10);
        jsexecutor.executeScript("arguments[0].click();", mert.buttonNewSignUp);
        softassert.assertNotEquals(actualUrl, expectedUrl, "when password field is filled" +
                " without characters, user can reach verification page.");
        softassert.assertAll();
    }
    @Test
    public void Tc_0005_NegativeForFieldEmail() {
        QualityDemyPage_User mert = new QualityDemyPage_User();
        Faker faker = new Faker();
        SoftAssert softassert = new SoftAssert();
        mert.buttonSignUp.click();
        mert.fieldFirstName.sendKeys(faker.name().firstName());
        mert.fieldLastName.sendKeys(faker.name().lastName());
        mert.fieldEmail.sendKeys("withoutatgmail.com");
        mert.fieldPassword.sendKeys(faker.internet().password());
        mert.fieldPassword.sendKeys(Keys.PAGE_DOWN);
        ReusableMethods.waitForClickablility(mert.buttonNewSignUp, 30);
        mert.buttonNewSignUp.click();
        softassert.assertNotEquals(actualUrl, expectedUrl, "when Email field is not filled with " +
                "@ sign, the User is not succesfully registered");
        softassert.assertAll();
    }
    @Test
    public void Tc_0006_RegisteredMail() throws IOException {
        QualityDemyPage_User mert = new QualityDemyPage_User();
        Faker faker = new Faker();
        SoftAssert softassert = new SoftAssert();
        mert.buttonSignUp.click();
        mert.fieldFirstName.sendKeys(faker.name().firstName());
        mert.fieldLastName.sendKeys(faker.name().lastName());
        mert.fieldPassword.sendKeys("registeredMail1,");
        mert.fieldEmail.sendKeys("registeredMail@gmail.com");
        mert.fieldEmail.sendKeys(Keys.PAGE_DOWN);
        ReusableMethods.waitForClickablility(mert.buttonNewSignUp, 30);
        mert.buttonNewSignUp.click();
        String expectedAlreadyUserText = ConfigReader.getProperty("signUpAlreadyRegistered");
        String actualAlreadyText = mert.alreadyRegistered.getText();
        softassert.assertEquals(actualAlreadyText, expectedAlreadyUserText, "When already registered User"
                + "is sign up, a red warning message appears not in the corner");
        softassert.assertAll();
    }
    @AfterMethod
    public void afterMethod() {
        Driver.closeDriver();
    }
    @BeforeMethod
    public void beforeMethod() {
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));
    }

}
