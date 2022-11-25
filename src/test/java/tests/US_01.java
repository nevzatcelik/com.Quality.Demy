package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualityDemyPage_User;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_01 {

    @Test
    public void homePageTest(){

        //I should be able to access the home page
        //https://qualitydemy.com/
        //The home page must be accessible when the URL is entered

        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));

        //The home page must be accessible when the URL is entered
        //In order to be sure for the home page as accesible, we show that we are able to log in
        // at the home page.
        QualityDemyPage_User qualityDemyPage_user=new QualityDemyPage_User();

        Assert.assertTrue(qualityDemyPage_user.loginLink.isEnabled());

        Driver.closeDriver();


    }

}
