package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualityDemyPage_Instructor;
import utilities.ConfigReader;
import utilities.Driver;

public class US_30 {
    //Nevzat



    @Test
    public void requirementsAddTest(){
        QualityDemyPage_Instructor qualityDemyPage_instructor=new QualityDemyPage_Instructor();
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));
        qualityDemyPage_instructor.acceptCookies.click();

        qualityDemyPage_instructor.loginLink.click();
        qualityDemyPage_instructor.emailBox.sendKeys(ConfigReader.getProperty("validEmailNevzatIns"));
        qualityDemyPage_instructor.passwordBox.sendKeys(ConfigReader.getProperty("validPasswordNevzatIns"));
        qualityDemyPage_instructor.loginButton.click();

        qualityDemyPage_instructor.instructorButton.click();
        qualityDemyPage_instructor.courseManagerButton.click();
        qualityDemyPage_instructor.addNewCourseButton.click();
        qualityDemyPage_instructor.requirementsButton.click();
        qualityDemyPage_instructor.requirementsGreenPlusButton.click();

        Assert.assertTrue(qualityDemyPage_instructor.requirementsRedMinusButton.isDisplayed());

        qualityDemyPage_instructor.testUser.click();
        qualityDemyPage_instructor.logoutButton.click();



    }
}
