package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import pages.QualityDemyPage_Instructor;
import pages.QualityDemyPage_User;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_03 extends ReusableMethods {

    QualityDemyPage_User pageUser= new QualityDemyPage_User();
    @Test
    public void testTC0301(){

        //- Launch browser
        //- Go to Quality Demy home page
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));

        //- Click “cookies” pop-up message
       try {
            pageUser.acceptCookiesLev.click();
        } catch (Exception e) {
            bekle(1);
        }


        //- Test if Facebook, Twitter, LinkedIn icons are visable
        Assert.assertTrue(pageUser.facebookIcon.isDisplayed());
        Assert.assertTrue(pageUser.twitterIcon.isDisplayed());
        Assert.assertTrue(pageUser.linkedinIcon.isDisplayed());
    }

    @Test
    public void testTC0302(){

        //- Launch browser
        //- Go to Quality Demy home page
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));
        bekle(2);
        //- Click “cookies” pop-up message
        try {
            pageUser.acceptCookiesLev.click();
        } catch (Exception e) {
            bekle(1);
        }

        //- Test if Facebook, Twitter, LinkedIn icons are clickable"
        Assert.assertTrue(pageUser.facebookIcon.isEnabled(),"Facebook icon can not be clicked");
        Assert.assertTrue(pageUser.twitterIcon.isEnabled(),"Twitter icon can not be clicked");
        Assert.assertTrue(pageUser.linkedinIcon.isEnabled(),"LinkedIn icon can not be clicked");
    }

    @Test
    public void testTC0303() throws InterruptedException {

        //"- Launch browser
        //- Go to Quality Demy home page
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));
        bekle(5);

        //- Click “cookies” pop-up message
        try {
            pageUser.acceptCookiesLev.click();
        } catch (Exception e) {
            bekle(1);
        }

        //- Click Facebook icon
        Actions actions= new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        bekle(3);
        pageUser.facebookIcon.click();

        bekle(5);

        //- Test if Quality Demy's Facebook page is visible
        String expectedTitleFacebook="Facebook";
        String actualTitleFacebook=Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitleFacebook.contains(expectedTitleFacebook));

        Driver.getDriver().navigate().back();

        //- Click Twitter icon
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        bekle(3);
        pageUser.twitterIcon.click();
        ReusableMethods.bekle(5);

        //- Test if Quality Demy's Twitter page is visible
        String expectedTitleTwitter="Twitter";
        String actualTitleTwitter=Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitleTwitter.contains(expectedTitleTwitter));

        Driver.getDriver().navigate().back();

        //- Click LinkedIn icon
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        bekle(3);
        pageUser.linkedinIcon.click();
        ReusableMethods.bekle(5);

        //- Test if Quality Demy's LinkedIn page is visible"
        String expectedTitleLinkedIn="LinkedIn";
        String actualTitleLinkedIn=Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitleLinkedIn.contains(expectedTitleLinkedIn));
    }
/*
    @AfterClass
    public void teardown(){
        Driver.closeDriver();
    }


 */

}
