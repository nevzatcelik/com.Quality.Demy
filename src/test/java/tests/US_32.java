package tests;

import org.testng.annotations.Test;
import pages.QualityDemyPage_Instructor;
import utilities.ConfigReader;
import utilities.Driver;

public class US_32 {
    @Test
    public void  us32(){

        //  Launch browser
        //  Go to url 'https://qualitydemy.com/home'
        Driver.getDriver().get(ConfigReader.getProperty("myURL"));

        QualityDemyPage_Instructor qualityDemyPage_instructor=new QualityDemyPage_Instructor();
        // Click "accept cookies" button.
        qualityDemyPage_instructor.acceptCookies.click();
        // Click on 'Login' link
        qualityDemyPage_instructor.loginLink.click();
        // Enter correct instructor email address
        qualityDemyPage_instructor.emailBox.sendKeys("user_1106154@login.com");
        // Enter correct instructor password
        qualityDemyPage_instructor.passwordBox.sendKeys("222509220");
        // Click 'login' button
        qualityDemyPage_instructor.loginButton.click();
        // Click 'Instructor' button
        qualityDemyPage_instructor.instructorButton.click();
        // Click "Course manager"
        qualityDemyPage_instructor.courseManeger.click();
        // Check if there is a course on the course list.  If not, add new course
        // Click "add new course"
        // Fill all the required fields
        // Click submit button
        // Click on any course name on the course list
        qualityDemyPage_instructor.chooseDemoCourse.click();
        // Click to "Basic" button
        qualityDemyPage_instructor.basicButton.click();
        // Check "Check if this course is top course" checkbox is enabled.
        qualityDemyPage_instructor.ifThisCourseisTopCourse.isEnabled();
        qualityDemyPage_instructor.ifThisCourseisTopCourse.click();

        //  Go to "pricing" button with arrows
        // qualityDemyPage_instructor.pricingButton.click();
        qualityDemyPage_instructor.rightArrow.click();
        qualityDemyPage_instructor.rightArrow.click();
        qualityDemyPage_instructor.rightArrow.click();

        qualityDemyPage_instructor.coursePriceBox.clear();
        qualityDemyPage_instructor.coursePriceBox.sendKeys("50");
        qualityDemyPage_instructor.discountCheckBox.click();
        qualityDemyPage_instructor.discountedPriceBox.clear();
        qualityDemyPage_instructor.discountedPriceBox.sendKeys("20");








    }
}
