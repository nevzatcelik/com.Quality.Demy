package tests;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualityDemyPage_Instructor;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Set;

public class US_19 {

    @Test
    public void US19_TestCase1901() { // Course Manager - Filter Button Test
        // go to the QualityDemy web page
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));

        // With a valid username and password, login to the system
        QualityDemyPage_Instructor qualityDemyPage_instructor = new QualityDemyPage_Instructor();
        qualityDemyPage_instructor.loginLink.click();

        qualityDemyPage_instructor.emailBox.sendKeys(ConfigReader.getProperty("validEmailFatihIns2"));
        qualityDemyPage_instructor.passwordBox.sendKeys(ConfigReader.getProperty("validPasswordFatihIns2"));

        ReusableMethods.bekle(2);
        qualityDemyPage_instructor.acceptCookies.click();
        ReusableMethods.bekle(2);
        qualityDemyPage_instructor.loginButton.click();

        // Click to the Instructor link
        qualityDemyPage_instructor.instructorLink.click();

        // Click to the Course Manager link
        qualityDemyPage_instructor.courseManagerLink.click();

        // TC1901: The functions of the Course manager page should work correctly ...................... ////
        // When the appropriate values are selected from the filter and the filter button is pressed,
        // the relevant course should appear in the list.
        qualityDemyPage_instructor.categoriesLink.click();
        qualityDemyPage_instructor.categoryChoosingTC1.click();
        qualityDemyPage_instructor.statusLink.click();
        qualityDemyPage_instructor.statusChoosing.click();
        qualityDemyPage_instructor.priceLink.click();
        qualityDemyPage_instructor.priceChoosing.click();
        qualityDemyPage_instructor.filterButton.click();

        Assert.assertTrue(qualityDemyPage_instructor.categoryChoosingTC1.isDisplayed());

        qualityDemyPage_instructor.account.click();
        qualityDemyPage_instructor.logout.click();

        // Driver.getDriver().close();

    }

    @Test
    public void US19_TestCase1902() { // Course Manager - Search Box Test
        // go to the QualityDemy web page
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));

        // With a valid username and password, login to the system
        QualityDemyPage_Instructor qualityDemyPage_instructor = new QualityDemyPage_Instructor();
        qualityDemyPage_instructor.loginLink.click();

        qualityDemyPage_instructor.emailBox.sendKeys(ConfigReader.getProperty("validEmailFatihIns2"));
        qualityDemyPage_instructor.passwordBox.sendKeys(ConfigReader.getProperty("validPasswordFatihIns2"));

        ReusableMethods.bekle(2);
        try {
            qualityDemyPage_instructor.acceptCookies.click();
        } catch (Exception e) {
            ReusableMethods.bekle(1);
        }
        qualityDemyPage_instructor.loginButton.click();

        // Click to the Instructor link
        qualityDemyPage_instructor.instructorLink.click();

        // Click to the Course Manager link
        qualityDemyPage_instructor.courseManagerLink.click();

        System.out.println(qualityDemyPage_instructor.categoryChoosingTC2.getText());

        // TC1902: Course should be able to get selected from the search box
        qualityDemyPage_instructor.searchBox.sendKeys(qualityDemyPage_instructor.categoryChoosingTC2.getText()+ Keys.ENTER);

        /*
        System.out.println(myCourseDemyPage_instructor.categoryChoosing.getText());
        // Web Design for Web Developers
         */

        Assert.assertTrue(qualityDemyPage_instructor.categoryChoosingTC2.isDisplayed());

        qualityDemyPage_instructor.account.click();
        qualityDemyPage_instructor.logout.click();

        // Driver.getDriver().close();

    }

    @Test
    public void US19_TestCase1903() { // Course Manager - View course on frontend link Test
        // go to the QualityDemy web page
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));

        // With a valid username and password, login to the system
        QualityDemyPage_Instructor qualityDemyPage_instructor = new QualityDemyPage_Instructor();
        qualityDemyPage_instructor.loginLink.click();

        qualityDemyPage_instructor.emailBox.sendKeys(ConfigReader.getProperty("validEmailFatihIns2"));
        qualityDemyPage_instructor.passwordBox.sendKeys(ConfigReader.getProperty("validPasswordFatihIns2"));

        ReusableMethods.bekle(2);
        try {
            qualityDemyPage_instructor.acceptCookies.click();
        } catch (Exception e) {
            ReusableMethods.bekle(1);
        }
        qualityDemyPage_instructor.loginButton.click();

        // Click to the Instructor link
        qualityDemyPage_instructor.instructorLink.click();

        // Click to the Course Manager link
        qualityDemyPage_instructor.courseManagerLink.click();

        // TC1903: Clicking on the three dots under the action section and
        // clicking the View course on frontend link should redirect to the page of the relevant course
        String firstPageWindowHandleValue= Driver.getDriver().getWindowHandle();

        qualityDemyPage_instructor.threeDots2.click();
        qualityDemyPage_instructor.viewCourseOnFrontend.click();

        Set<String> windowHandlesSet= Driver.getDriver().getWindowHandles();

        String secondPageWindowHandleValue= "";

        for (String eachHandleValue:windowHandlesSet
        ) {
            if (!eachHandleValue.equals(firstPageWindowHandleValue)){
                secondPageWindowHandleValue= eachHandleValue;
            }
        }

        Driver.getDriver().switchTo().window(secondPageWindowHandleValue);

        Assert.assertTrue(qualityDemyPage_instructor.pageRelevantCourseTC3.isDisplayed());

        Driver.getDriver().switchTo().window(firstPageWindowHandleValue);

        qualityDemyPage_instructor.account.click();
        qualityDemyPage_instructor.logout.click();

        // Driver.getDriver().quit();

    }

    @Test
    public void US19_TestCase1904() { // Course Manager - Go to course playing page link Test
        // go to the QualityDemy web page
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));

        // With a valid username and password, login to the system
        QualityDemyPage_Instructor qualityDemyPage_instructor = new QualityDemyPage_Instructor();
        qualityDemyPage_instructor.loginLink.click();

        qualityDemyPage_instructor.emailBox.sendKeys(ConfigReader.getProperty("validEmailFatihIns2"));
        qualityDemyPage_instructor.passwordBox.sendKeys(ConfigReader.getProperty("validPasswordFatihIns2"));

        ReusableMethods.bekle(2);
        try {
            qualityDemyPage_instructor.acceptCookies.click();
        } catch (Exception e) {
            ReusableMethods.bekle(1);
        }
        qualityDemyPage_instructor.loginButton.click();

        // Click to the Instructor link
        qualityDemyPage_instructor.instructorLink.click();

        // Click to the Course Manager link
        qualityDemyPage_instructor.courseManagerLink.click();

        // TC04: Clicking on the three dots under the action section and
        // clicking the Go to course playing page link should lead to the page of the relevant course content
        String firstPageWindowHandleValue= Driver.getDriver().getWindowHandle();

        qualityDemyPage_instructor.threeDots3.click();
        qualityDemyPage_instructor.goCoursePlayingPage.click();

        Set<String> windowHandlesSet= Driver.getDriver().getWindowHandles();

        String secondPageWindowHandleValue= "";

        for (String eachHandleValue:windowHandlesSet
        ) {
            if (!eachHandleValue.equals(firstPageWindowHandleValue)){
                secondPageWindowHandleValue= eachHandleValue;
            }
        }

        Driver.getDriver().switchTo().window(secondPageWindowHandleValue);

        Assert.assertTrue(qualityDemyPage_instructor.pageRelevantCourseTC4.isDisplayed());

        Driver.getDriver().switchTo().window(firstPageWindowHandleValue);

        qualityDemyPage_instructor.account.click();
        qualityDemyPage_instructor.logout.click();

        // Driver.getDriver().quit();

    }

    @Test
    public void US19_TestCase1905() { // Course Manager - Edit this course link Test
        // go to the QualityDemy web page
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));

        // With a valid username and password, login to the system
        QualityDemyPage_Instructor qualityDemyPage_instructor = new QualityDemyPage_Instructor();
        qualityDemyPage_instructor.loginLink.click();

        qualityDemyPage_instructor.emailBox.sendKeys(ConfigReader.getProperty("validEmailFatihIns2"));
        qualityDemyPage_instructor.passwordBox.sendKeys(ConfigReader.getProperty("validPasswordFatihIns2"));

        ReusableMethods.bekle(2);
        try {
            qualityDemyPage_instructor.acceptCookies.click();
        } catch (Exception e) {
            ReusableMethods.bekle(1);
        }
        qualityDemyPage_instructor.loginButton.click();

        // Click to the Instructor link
        qualityDemyPage_instructor.instructorLink.click();

        // Click to the Course Manager link
        qualityDemyPage_instructor.courseManagerLink.click();

        // TC5: When you click on the three dots under the action section
        // and click on the Edit this course link, it should redirect to the edit page of the relevant course
        qualityDemyPage_instructor.threeDots3.click();
        qualityDemyPage_instructor.editThisCourse.click();

        Assert.assertTrue(qualityDemyPage_instructor.updateEditCourse.isDisplayed());

        qualityDemyPage_instructor.account.click();
        qualityDemyPage_instructor.logout.click();

        // Driver.getDriver().close();

    }

    @Test
    public void US19_TestCase1906() { // Course Manager - Mark as drafted link Test
        // go to the QualityDemy web page
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));

        // With a valid username and password, login to the system
        QualityDemyPage_Instructor qualityDemyPage_instructor = new QualityDemyPage_Instructor();
        qualityDemyPage_instructor.loginLink.click();

        qualityDemyPage_instructor.emailBox.sendKeys(ConfigReader.getProperty("validEmailFatihIns2"));
        qualityDemyPage_instructor.passwordBox.sendKeys(ConfigReader.getProperty("validPasswordFatihIns2"));

        ReusableMethods.bekle(2);
        try {
            qualityDemyPage_instructor.acceptCookies.click();
        } catch (Exception e) {
            ReusableMethods.bekle(1);
        }
        qualityDemyPage_instructor.loginButton.click();

        // Click to the Instructor link
        qualityDemyPage_instructor.instructorLink.click();

        // Click to the Course Manager link
        qualityDemyPage_instructor.courseManagerLink.click();

        // TC06: When you click on the three dots under the action section
        // and click on the Mark as drafted link,
        // a confirmation message should come
        // and after approval, the status section of the course should change to draft
        qualityDemyPage_instructor.threeDots4.click();
        qualityDemyPage_instructor.markAsDraft.click();

        Assert.assertTrue(qualityDemyPage_instructor.continueButton.isEnabled());

        qualityDemyPage_instructor.continueButton.click();

        Assert.assertTrue(qualityDemyPage_instructor.draft.isDisplayed());

        qualityDemyPage_instructor.account.click();
        qualityDemyPage_instructor.logout.click();

        // Driver.getDriver().close();

    }

    @Test
    public void US19_TestCase1907() { // Course Manager - Publish this course link Test
        // go to the QualityDemy web page
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));

        // With a valid username and password, login to the system
        QualityDemyPage_Instructor qualityDemyPage_instructor = new QualityDemyPage_Instructor();
        qualityDemyPage_instructor.loginLink.click();

        qualityDemyPage_instructor.emailBox.sendKeys(ConfigReader.getProperty("validEmailFatihIns2"));
        qualityDemyPage_instructor.passwordBox.sendKeys(ConfigReader.getProperty("validPasswordFatihIns2"));

        ReusableMethods.bekle(2);
        try {
            qualityDemyPage_instructor.acceptCookies.click();
        } catch (Exception e) {
            ReusableMethods.bekle(1);
        }
        qualityDemyPage_instructor.loginButton.click();

        // Click to the Instructor link
        qualityDemyPage_instructor.instructorLink.click();

        // Click to the Course Manager link
        qualityDemyPage_instructor.courseManagerLink.click();

        // TC07: When you click on the three dots under the action section
        // and click on the Publish this course link,
        // a confirmation message should come and after approval,
        // the status section of the course should change to pending
        qualityDemyPage_instructor.threeDots1.click();
        qualityDemyPage_instructor.publishThisCourse.click();

        Assert.assertTrue(qualityDemyPage_instructor.continueButton.isEnabled());

        qualityDemyPage_instructor.continueButton.click();

        Assert.assertTrue(qualityDemyPage_instructor.pending1.isDisplayed());

        qualityDemyPage_instructor.account.click();
        qualityDemyPage_instructor.logout.click();

        // Driver.getDriver().close();

    }

    @Test
    public void US19_testCase1908() { // Course Manager - Delete course link Test
        // go to the QualityDemy web page
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));

        // With a valid username and password, login to the system
        QualityDemyPage_Instructor qualityDemyPage_instructor = new QualityDemyPage_Instructor();
        qualityDemyPage_instructor.loginLink.click();

        qualityDemyPage_instructor.emailBox.sendKeys(ConfigReader.getProperty("validEmailFatihIns2"));
        qualityDemyPage_instructor.passwordBox.sendKeys(ConfigReader.getProperty("validPasswordFatihIns2"));

        ReusableMethods.bekle(2);
        try {
            qualityDemyPage_instructor.acceptCookies.click();
        } catch (Exception e) {
            ReusableMethods.bekle(1);
        }
        qualityDemyPage_instructor.loginButton.click();

        // Click to the Instructor link
        qualityDemyPage_instructor.instructorLink.click();

        // Click to the Course Manager link
        qualityDemyPage_instructor.courseManagerLink.click();

        // TC08: When you click on the three dots under the action section
        // and click on the delete link from here,
        // a confirmation message should come
        // and the course should be deleted from the list after approval
        qualityDemyPage_instructor.threeDots4.click();
        qualityDemyPage_instructor.delete.click();

        Assert.assertTrue(qualityDemyPage_instructor.continueButton.isEnabled());

        qualityDemyPage_instructor.continueButton.click();

        boolean flag= false;
        try {
            Assert.assertFalse(qualityDemyPage_instructor.Piano.isDisplayed());
        } catch (Exception e) {
            flag= true;
        }

        Assert.assertTrue(flag);

        qualityDemyPage_instructor.account.click();
        qualityDemyPage_instructor.logout.click();

        // Driver.getDriver().close();
    }

    @Test
    public void US19_testCase1909() { // Course Manager - Add New Course Button Test
        // go to the QualityDemy web page
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));

        // With a valid username and password, login to the system
        QualityDemyPage_Instructor qualityDemyPage_instructor = new QualityDemyPage_Instructor();
        qualityDemyPage_instructor.loginLink.click();

        qualityDemyPage_instructor.emailBox.sendKeys(ConfigReader.getProperty("validEmailFatihIns2"));
        qualityDemyPage_instructor.passwordBox.sendKeys(ConfigReader.getProperty("validPasswordFatihIns2"));

        ReusableMethods.bekle(2);
        try {
            qualityDemyPage_instructor.acceptCookies.click();
        } catch (Exception e) {
            ReusableMethods.bekle(1);
        }
        qualityDemyPage_instructor.loginButton.click();

        // Click to the Instructor link
        qualityDemyPage_instructor.instructorLink.click();

        // Click to the Course Manager link
        qualityDemyPage_instructor.courseManagerLink.click();

        // TC09: Clicking the add new course button should redirect to the add_course page
        qualityDemyPage_instructor.addNewCourseButton.click();

        Assert.assertTrue(qualityDemyPage_instructor.courseAddingForm.isDisplayed());

        qualityDemyPage_instructor.account.click();
        qualityDemyPage_instructor.logout.click();

        // Driver.getDriver().close();

    }

    @Test
    public void US19_testCase1910() { // Course Manager - Course Name link Test
        // go to the QualityDemy web page
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));

        // With a valid username and password, login to the system
        QualityDemyPage_Instructor qualityDemyPage_instructor = new QualityDemyPage_Instructor();
        qualityDemyPage_instructor.loginLink.click();

        qualityDemyPage_instructor.emailBox.sendKeys(ConfigReader.getProperty("validEmailFatihIns2"));
        qualityDemyPage_instructor.passwordBox.sendKeys(ConfigReader.getProperty("validPasswordFatihIns2"));

        ReusableMethods.bekle(2);
        try {
            qualityDemyPage_instructor.acceptCookies.click();
        } catch (Exception e) {
            ReusableMethods.bekle(1);
        }
        qualityDemyPage_instructor.loginButton.click();

        // Click to the Instructor link
        qualityDemyPage_instructor.instructorLink.click();

        // Click to the Course Manager link
        qualityDemyPage_instructor.courseManagerLink.click();

        // TC10: When the course name in the list is clicked,
        // it should redirect to the edit page of the relevant course
        qualityDemyPage_instructor.webDesignForDevelopersTitle.click();

        Assert.assertTrue(qualityDemyPage_instructor.updateEditCourse.getText().contains("Web Design for Developers"));

        qualityDemyPage_instructor.account.click();
        qualityDemyPage_instructor.logout.click();

        Driver.getDriver().quit();

    }

}