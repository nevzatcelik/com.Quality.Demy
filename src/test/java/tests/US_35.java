package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualityDemyPage_Instructor;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_35 {


    @Test
    public void finishSectionTest(){
        QualityDemyPage_Instructor qualityDemyPage_instructor=new QualityDemyPage_Instructor();

        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));
        qualityDemyPage_instructor.acceptCookies();

        qualityDemyPage_instructor.loginLink.click();
        qualityDemyPage_instructor.emailBox.sendKeys(ConfigReader.getProperty("validEmailNevzatIns"));
        qualityDemyPage_instructor.passwordBox.sendKeys(ConfigReader.getProperty("validPasswordNevzatIns"));
        qualityDemyPage_instructor.loginButton.click();

        qualityDemyPage_instructor.instructorButton.click();
        qualityDemyPage_instructor.courseManagerButton.click();
        qualityDemyPage_instructor.addNewCourseButton.click();
        qualityDemyPage_instructor.courseTitle.sendKeys("courseTitle");
        qualityDemyPage_instructor.categoryDropDown.click();
        qualityDemyPage_instructor.webDesignLesson.click();
        qualityDemyPage_instructor.mediaButton.click();
        qualityDemyPage_instructor.courseOverviewUrl.sendKeys(ConfigReader.getProperty("courseOverviewUrl"));
        qualityDemyPage_instructor.finishSection.click();
        qualityDemyPage_instructor.submitFinish.click();

        Assert.assertTrue(qualityDemyPage_instructor.congratulationsMessage.isDisplayed());
        ReusableMethods.bekle(5);
        qualityDemyPage_instructor.testUser.click();
        qualityDemyPage_instructor.logoutButton.click();

    }
}
