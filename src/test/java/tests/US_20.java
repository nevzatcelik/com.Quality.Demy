package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualityDemyPage_Instructor;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_20 {
    @Test
    public void us20() {

        // Launch browser
        // Go to url 'https://qualitydemy.com/home'
        QualityDemyPage_Instructor qualityDemyPage_instructor=new QualityDemyPage_Instructor();
        Driver.getDriver().get(ConfigReader.getProperty("myURL"));

        // Click "accept cookies" button.
        qualityDemyPage_instructor.acceptCookies.click();

        // Click on 'Login' button
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

        // Click on "Back to course list"
        qualityDemyPage_instructor.backtoList.click();

        // Verify that course manager page is visible successfully;
        Assert.assertTrue(qualityDemyPage_instructor.courseManeger.isDisplayed());

        // Click on any course name on the course list
        qualityDemyPage_instructor.chooseDemoCourse.click();

        // Click "view on frontend" button
        String ilkSayfaWinHandDegeri= Driver.getDriver().getWindowHandle();
        qualityDemyPage_instructor.viewonFrontendButton.click();
        ReusableMethods.bekle(2);

        /*
        Set<String> windowHandlesSeti= Driver.getDriver().getWindowHandles();
        String ikinciSayfaWinHandleDegeri="";
        for (String eachHandleDegeri: windowHandlesSeti
        ) {

            if (!eachHandleDegeri.equals(ilkSayfaWinHandDegeri)){
                ikinciSayfaWinHandleDegeri=eachHandleDegeri;
            }
        }
       Driver.getDriver().switchTo().window(ikinciSayfaWinHandleDegeri);
         */
        //  Driver.closeDriver();

        ReusableMethods.bekle(2);

        Driver.getDriver().switchTo().window(ilkSayfaWinHandDegeri);

        qualityDemyPage_instructor.rightArrow.click();
        ReusableMethods.bekle(2);

        qualityDemyPage_instructor.rightArrow.click();
        ReusableMethods.bekle(2);

        qualityDemyPage_instructor.rightArrow.click();
        ReusableMethods.bekle(2);

        qualityDemyPage_instructor.leftArrow.click();
        ReusableMethods.bekle(2);

        Assert.assertTrue(qualityDemyPage_instructor.leftArrow.isEnabled());
        Assert.assertTrue(qualityDemyPage_instructor.rightArrow.isEnabled());

        Driver.closeDriver();

    }
}


