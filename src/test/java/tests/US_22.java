package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.QualityDemyPage_Instructor;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_22 {
    @Test
    public void us22(){

        //Launch browser
        //Go to url 'https://qualitydemy.com/home'
        Driver.getDriver().get(ConfigReader.getProperty("myURL"));


        QualityDemyPage_Instructor qualityDemyPage_instructor=new QualityDemyPage_Instructor();
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

        // Click "Course manager" button
        // Check if there is a course on the course list.  If not, add new course
        // Click "add new course"
        // Fill all the required fields
        // Click submit button
        // Click course manager button
        qualityDemyPage_instructor.courseManegerButton.click();

        //- Click on any course name on the course list
        qualityDemyPage_instructor.chooseDemoCourse.click();

        //- Click to "Basic" button
        qualityDemyPage_instructor.basicButton.click();

        // Assert.assertTrue(qualityDemyPage_instructor.addNewInstructorTextBox.isEnabled());
        // qualityDemyPage_instructor.addNewInstructorTextBox.getText();


        // Verify "add new instructor section" is displayed.
        // Check the instructor list is displayed
        qualityDemyPage_instructor.addNewInstructorTextBox.sendKeys("Admin User ( admin@academy.com )");
        qualityDemyPage_instructor.addNewInstructorTextBox.sendKeys(Keys.ENTER);

        //- Check "course title" is enabled
        qualityDemyPage_instructor.coursetitleTextBox.sendKeys("ChangedName");
        qualityDemyPage_instructor.coursetitleTextBox.sendKeys(Keys.TAB);

        //- Check "short description" is enabled
        qualityDemyPage_instructor.sortDescriptionTextarea.sendKeys("Short description is changed");
        qualityDemyPage_instructor.sortDescriptionTextarea.sendKeys(Keys.TAB);

        //- Check "description" is enabled
        qualityDemyPage_instructor.descriptionTextarea.sendKeys("Description is changed");
        qualityDemyPage_instructor.descriptionTextarea.sendKeys(Keys.TAB);
        ReusableMethods.bekle(2);

        // Verify "category" section is displayed
        // Check "category" section is enabled.
        qualityDemyPage_instructor.categorytextBox.click();
        qualityDemyPage_instructor.categoryTextEnter.sendKeys("Disney Magic English");
        qualityDemyPage_instructor.categoryTextEnter.sendKeys(Keys.ENTER);

        Actions actions=new Actions(Driver.getDriver());
        actions.click(qualityDemyPage_instructor.categoryTextEnter)
                .sendKeys(Keys.ARROW_DOWN).perform();

        ReusableMethods.bekle(2);

        // Verify "level" section is displayed
        //  Check "level" section is enabled.
        qualityDemyPage_instructor.levelTextbox.click();
        qualityDemyPage_instructor.categoryTextEnter.sendKeys("Advanced");
        qualityDemyPage_instructor.categoryTextEnter.sendKeys(Keys.ENTER);

        //Check "Enable drip content" section is enabled.
        qualityDemyPage_instructor.enableDripContentButton.click();

        //Check "Check if this course is top course" checkbox is enabled.
        qualityDemyPage_instructor.ifThisCourseisTopCourse.isEnabled();
        qualityDemyPage_instructor.ifThisCourseisTopCourse.click();

    }
}


