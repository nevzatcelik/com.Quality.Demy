package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.QualityDemyPage_Instructor;
import utilities.ConfigReader;
import utilities.Driver;

public class US_16 {

    QualityDemyPage_Instructor qualitydemyPage = new QualityDemyPage_Instructor();

    SoftAssert softAssert = new SoftAssert();

    @Test
    public void account(){

        //  Go to https://qualitydemy.com
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));
        qualitydemyPage.cookies.click();
        // - click on login and enter your email and password and click on login button
        qualitydemyPage.loginLinki.click();
        qualitydemyPage.emailKutusu.sendKeys(ConfigReader.getProperty("meryemgecerliEmail"));
        qualitydemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("meryemGecerliPassword"));
        qualitydemyPage.loginButonu.click();
        // - Click Instructor
        qualitydemyPage.instructor.click();
        //  - Click on Manage profile
        qualitydemyPage.myManager.click();
        //  - Click on account
        qualitydemyPage.account.click();

    }



    @Test(dependsOnMethods = "yanlisSifre")
    public void doğruPassword(){

        // - Current password, New password, and Confirm password must be clickable.
        // - Enter your current password
        qualitydemyPage.currentPossword.click();
        qualitydemyPage.currentPossword.sendKeys(ConfigReader.getProperty("meryemGecerliPassword"));
        //- enter the new password
        qualitydemyPage.newPossword.click();
        qualitydemyPage.newPossword.sendKeys(ConfigReader.getProperty("meryemNewPassword"));
        //- Enter the confirmation password
        Actions act = new Actions(Driver.getDriver());
        act.sendKeys(Keys.PAGE_UP)
                .sendKeys(Keys.TAB).build().perform();
        qualitydemyPage.ConfirmPossword.sendKeys(ConfigReader.getProperty("meryemConfirmPassword"));
        act.sendKeys(Keys.PAGE_UP).sendKeys(Keys.TAB).build().perform();
        //- Click the save change button
        qualitydemyPage.saveChanges.sendKeys(Keys.ENTER);
        //- a test that the password has been successfully changed
        Assert.assertTrue(qualitydemyPage.mesaj.isDisplayed());

        Driver.closeDriver();
    }

    @Test (dependsOnMethods = "account")
    public void yanlisSifre(){

        // - Current password, New password, and Confirm password must be clickable
        //- Enter your current password
        qualitydemyPage.currentPossword.click();
        qualitydemyPage.currentPossword.sendKeys(ConfigReader.getProperty("meryemGecerliPassword"));
        //- enter new password
        qualitydemyPage.newPossword.click();
        qualitydemyPage.newPossword.sendKeys(ConfigReader.getProperty("meryemNewPassword"));
        //- enter wrong confirmation password
        Actions act = new Actions(Driver.getDriver());
        act.sendKeys(Keys.PAGE_UP)
                .sendKeys(Keys.TAB).build().perform();
        qualitydemyPage.ConfirmPossword.sendKeys(ConfigReader.getProperty("meryemYanlisConfirmPassword"));
        act.sendKeys(Keys.PAGE_UP).sendKeys(Keys.TAB).build().perform();
        //- Click the save change button
        qualitydemyPage.saveChanges.sendKeys(Keys.ENTER);
        //- test that the password cannot be changed
        Assert.assertTrue(qualitydemyPage.mesaj.isDisplayed());


    }
}
