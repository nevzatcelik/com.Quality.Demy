package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualityDemyPage_Instructor;
import utilities.ConfigReader;
import utilities.Driver;

public class US_25 {


    QualityDemyPage_Instructor qualitydemyPage = new QualityDemyPage_Instructor();
    @Test
    public void pricing(){


        // Go to https://qualitydemy.com
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));

        //- Click on login and enter your email and password and click on the login button
        qualitydemyPage.cookies.click();
        qualitydemyPage.loginLinki.click();
        qualitydemyPage.emailKutusu.sendKeys(ConfigReader.getProperty("meryemgecerliEmail"));
        qualitydemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("meryemGecerliPassword"));
        qualitydemyPage.loginButonu.click();

        //- Click on the instructor
        qualitydemyPage.instructor.click();

        //- Click on Course Manager
        qualitydemyPage.courseManager.click();
        //- Click Add New Course
        qualitydemyPage.addNewCourse.click();
        //- Click on pricing
        qualitydemyPage.pricing.click();


    }
    @Test (dependsOnMethods = "pricing")
    public void putPrice (){

        //-write the course price
        //- check that the course price is visible
        qualitydemyPage.courseprice.sendKeys(ConfigReader.getProperty("meryemCoursePrice"));

    }

    @Test(dependsOnMethods = "putPrice")
    public void discountedPrice(){

        //Check if this course has a discount box that must be clickable
        qualitydemyPage.Checkdiscount.click();

        //- type the discounted price
        //-Check if there is a discount
        qualitydemyPage.discountedprice.sendKeys(ConfigReader.getProperty("meryemDiscount"));
        Assert.assertTrue(qualitydemyPage.indirimliFıyat.isDisplayed());
    }


}
