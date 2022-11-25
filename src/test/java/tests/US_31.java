package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualityDemyPage_Instructor;
import utilities.ConfigReader;
import utilities.Driver;

public class US_31 {


    @Test
    public void outComesAddTest(){

        QualityDemyPage_Instructor qualityDemyPage_instructor=new QualityDemyPage_Instructor();

        Driver.getDriver().get(ConfigReader.getProperty("myUrl1"));
        qualityDemyPage_instructor.acceptCookies();

        qualityDemyPage_instructor.loginLink.click();
        qualityDemyPage_instructor.emailBox.sendKeys(ConfigReader.getProperty("validEmailNevzatIns"));
        qualityDemyPage_instructor.passwordBox.sendKeys(ConfigReader.getProperty("validPasswordNevzatIns"));
        qualityDemyPage_instructor.loginButton.click();

        qualityDemyPage_instructor.instructorButton.click();
        qualityDemyPage_instructor.courseManagerButton.click();
        qualityDemyPage_instructor.addNewCourseButton.click();
        qualityDemyPage_instructor.outComesButton.click();
        qualityDemyPage_instructor.outComesGreenPlusButton.click();
        Assert.assertTrue(qualityDemyPage_instructor.outComesRedMinusButton.isDisplayed());
        qualityDemyPage_instructor.testUser.click();
        qualityDemyPage_instructor.logoutButton.click();

    }
}
