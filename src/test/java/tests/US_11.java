package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.QualityDemyPage_User;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_11 {
 /*
     US_011 my_wishlist page functions should work correctly

    -When the compare link is clicked, it should redirect to the Course compare page
    -Course should be able to get selected from the search box
    -When the course name is clicked, it should redirect to the page of the relevant course.
    -When the instructor icon is clicked, it should redirect to the relevant instructor page.
    -The course should be able to verify the number
    and duration of the course on the relevant page when the course name is clicked.
    */

    QualityDemyPage_User qualityDemyPage_User=new QualityDemyPage_User();
    Actions actions=new Actions(Driver.getDriver());

    @BeforeClass
    public void setUp(){
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));
        qualityDemyPage_User.acceptCookies.click();
        qualityDemyPage_User.loginLink.click();
        qualityDemyPage_User.emailBox.sendKeys(ConfigReader.getProperty("myStudentEmailEmine"));
        qualityDemyPage_User.passwordBox.sendKeys(ConfigReader.getProperty("myStudentPasswordEmine"));
        qualityDemyPage_User.loginButton.click();
    }

    @Test
    public void US11_TC01(){

        //-When the compare link is clicked, it should redirect to the Course compare page
        ReusableMethods.bekle(5);
        actions.moveToElement(qualityDemyPage_User.heartButton).perform();
        qualityDemyPage_User.goToWistListButton.click();
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).perform();
        ReusableMethods.bekle(3);
        qualityDemyPage_User.myWishListCompare1.click();

        String expectedCourseCompare="                Course compare            ";
        String actualCourseCompare=qualityDemyPage_User.courseComparePage.getText();
        Assert.assertTrue(expectedCourseCompare.contains(actualCourseCompare));

    }
    @Test
    public void US11_TC02(){

        //  -Course should be able to get selected from the search box

        ReusableMethods.bekle(5);
        actions.moveToElement(qualityDemyPage_User.heartButton).perform();
        qualityDemyPage_User.goToWistListButton.click();

        qualityDemyPage_User.searchMyWishlist.sendKeys("React and Typescript" + Keys.ENTER);
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).perform();
        String expectedCourseName= "React and Typescript";
        ReusableMethods.bekle(2);
        String actualCourseName=qualityDemyPage_User.reactAndTypescriptText.getText();
        ReusableMethods.bekle(2);
        Assert.assertTrue(actualCourseName.contains(expectedCourseName));
        ReusableMethods.bekle(3);

    }
    @Test
    public void US11_TC03(){

        //  -When the course name is clicked, it should redirect to the page of the relevant course.

        ReusableMethods.bekle(5);
        actions.moveToElement(qualityDemyPage_User.heartButton).perform();
        qualityDemyPage_User.goToWistListButton.click();
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).perform();
        qualityDemyPage_User.reactAndTypescriptText.click();
        String expectedCourseName= "React and Typescript";
        String actualCourseName=qualityDemyPage_User.reactAndTypescriptText.getText();
        Assert.assertTrue(actualCourseName.contains(expectedCourseName));

    }
    @Test
    public void US11_TC04(){

        // -When the instructor icon is clicked, it should redirect to the relevant instructor page.

        ReusableMethods.bekle(5);
        qualityDemyPage_User.homePage.click();
        actions.moveToElement(qualityDemyPage_User.heartButton).perform();
        qualityDemyPage_User.goToWistListButton.click();
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).perform();
        qualityDemyPage_User.reactAndTypescriptText.click();
        qualityDemyPage_User.ReactandTypescriptinstrocturIcon.click();

        String expectedUrl="https://qualitydemy.com/home/instructor_page/1";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl);
    }
    @Test
    public void US11_TC05(){

        // -The course should be able to verify the number
        // and duration of the course on the relevant page when the course name is clicked.

        ReusableMethods.bekle(5);
        qualityDemyPage_User.homePage.click();
        actions.moveToElement(qualityDemyPage_User.heartButton).perform();
        qualityDemyPage_User.goToWistListButton.click();

        ReusableMethods.bekle(2);

        qualityDemyPage_User.reactAndTypescriptText.click();

        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();

        ReusableMethods.bekle(2);

        String expectedNumberVerify="12 Lessons";
        String actualNumberVerify=qualityDemyPage_User.numberCourse.getText();
        Assert.assertTrue(actualNumberVerify.contains(expectedNumberVerify));

        ReusableMethods.bekle(2);

        String expectedLessonDuration="38:45:16 Hours";
        String actualLessonDuration=qualityDemyPage_User.durationCourse.getText();
        Assert.assertTrue(actualLessonDuration.contains(expectedLessonDuration));


    }
    @AfterClass
    public void tearDown(){

        Driver.closeDriver();
    }
}