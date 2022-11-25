package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualityDemyPage_Instructor;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_15 {

    QualityDemyPage_Instructor qualityDemyPageInstructor = new QualityDemyPage_Instructor();

    @Test
    public void TC1501() throws InterruptedException {
        //Launch browser
        //Go to QualityDemy home page
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));
        //Enter a valid username and password and login
        qualityDemyPageInstructor.loginLink.click();
        qualityDemyPageInstructor.emailBox.sendKeys(ConfigReader.getProperty("ZeynepValidInsEmail"));
        qualityDemyPageInstructor.passwordBox.sendKeys((ConfigReader.getProperty("ZeynepValidInsPassword")));
        ReusableMethods.bekle(2);
        qualityDemyPageInstructor.acceptCookies.click();
        ReusableMethods.bekle(2);
        qualityDemyPageInstructor.loginButton.click();
        ReusableMethods.bekle(7);

        //Select the user profile opened under the user box icon
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(qualityDemyPageInstructor.userBoxIcon).perform();
        Thread.sleep(3000);
        qualityDemyPageInstructor.userProfilePage.click();

        //Enter profile information (eg name, surname...)
        Actions actions1=new Actions(Driver.getDriver());
        actions1.click(qualityDemyPageInstructor.userProfileFirstName)
                .sendKeys("Zey")
                .sendKeys(Keys.TAB)
                .sendKeys("Tok")
                .sendKeys(Keys.TAB)
                .sendKeys("tester")
                .sendKeys(Keys.TAB)
                .sendKeys("Java")
                .sendKeys(Keys.TAB)
                .sendKeys("1990")
                .sendKeys(Keys.TAB)
                .sendKeys("twitter.com")
                .sendKeys(Keys.TAB)
                .sendKeys("facebook.com")
                .sendKeys(Keys.TAB)
                .sendKeys("linkedin.com")
                .perform();

        ReusableMethods.bekle(5);
        Driver.closeDriver();
    }
    @Test
    public void TC1502() throws InterruptedException {

        //Launch browser
        //Go to QualityDemy home page
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));

        //Enter a valid username and password and login
        qualityDemyPageInstructor.loginLink.click();
        qualityDemyPageInstructor.emailBox.sendKeys(ConfigReader.getProperty("ZeynepValidInsEmail"));
        qualityDemyPageInstructor.passwordBox.sendKeys((ConfigReader.getProperty("ZeynepValidInsPassword")));
        ReusableMethods.bekle(2);
        qualityDemyPageInstructor.acceptCookies.click();
        ReusableMethods.bekle(2);
        qualityDemyPageInstructor.loginButton.click();
        ReusableMethods.bekle(7);

        //Select the user profile opened under the user box icon
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(qualityDemyPageInstructor.userBoxIcon).perform();
        //Thread.sleep(3000);
        qualityDemyPageInstructor.userProfilePage.click();

        //Change any profile information and click save button
        qualityDemyPageInstructor.userProfileLinkedin.clear();
        qualityDemyPageInstructor.userProfileLinkedin.sendKeys("linkedin.com.trr");
        ReusableMethods.bekle(5);

        qualityDemyPageInstructor.userProfileSave.sendKeys(Keys.ENTER);

        String expectedText="linkedin.com.trr";
        String actualText=qualityDemyPageInstructor.userProfileLinkedin.getAttribute("value");
        Assert.assertTrue(actualText.equals(expectedText));

        ReusableMethods.bekle(5);
        Driver.closeDriver();
    }

    @Test
    public void TC1503() throws InterruptedException {
        //Launch browser
        //Go to QualityDemy home page
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));
        //Enter a valid username and password and login
        qualityDemyPageInstructor.loginLink.click();
        qualityDemyPageInstructor.emailBox.sendKeys(ConfigReader.getProperty("ZeynepValidInsEmail"));
        qualityDemyPageInstructor.passwordBox.sendKeys((ConfigReader.getProperty("ZeynepValidInsPassword")));
        ReusableMethods.bekle(2);
        qualityDemyPageInstructor.acceptCookies.click();
        ReusableMethods.bekle(2);
        qualityDemyPageInstructor.loginButton.click();
        ReusableMethods.bekle(7);
        //Select the user profile opened under the user box icon
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(qualityDemyPageInstructor.userBoxIcon).perform();
        Thread.sleep(3000);
        qualityDemyPageInstructor.userProfilePage.click();

        //Click the profile tab and test it redirects to the profile page
        qualityDemyPageInstructor.userProfilProfilButton.click();
        ReusableMethods.bekle(2);
        Assert.assertTrue(qualityDemyPageInstructor.userProfilePageTitle.isDisplayed());

        ReusableMethods.bekle(5);
        Driver.closeDriver();
    }
}
