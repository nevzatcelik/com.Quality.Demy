package tests;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualityDemyPage_Instructor;
import pages.QualityDemyPage_User;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.File;

public class US_40 {

    //Course should be able to get selected from the search box
    // When the course name is clicked, it should redirect to the page of the relevant course.
    // The course should be listed when the desired date is selected
    // from the filter dropbox and the filter button is pressed.


    @Test
    public void US_40() {

        //Go to qualitydemy home page
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));
        QualityDemyPage_Instructor qualityDemyPage_instructor = new QualityDemyPage_Instructor();

        qualityDemyPage_instructor.acceptCookies.click();

        ReusableMethods.bekle(5);

        //Click to Login Link
        qualityDemyPage_instructor.loginLink.click();
        //qualityDemyPage_instructor.loginLink.click();

        //Click to email box and enter your instructor email adress and password
        qualityDemyPage_instructor.emailBox.sendKeys(ConfigReader.getProperty("gurselValidEmail"));
        qualityDemyPage_instructor.passwordBox.sendKeys(ConfigReader.getProperty("gurselValidPassword"));

        ReusableMethods.bekle(2);

        // Click to Login button
        qualityDemyPage_instructor.loginButton.click();
        ReusableMethods.bekle(2);

        //Click to Instructor link
        qualityDemyPage_instructor.instructorLink.click();
        ReusableMethods.bekle(2);

        //Click to Sales Report Link
        qualityDemyPage_instructor.salesReportLink.click();
        ReusableMethods.bekle(2);

        //Click to Sales Report Search box
        qualityDemyPage_instructor.salesReportSearchBox.click();
        ReusableMethods.bekle(2);

        //1.Course should be able to get selected from the search box

        qualityDemyPage_instructor.salesReportSearchBox.sendKeys(ConfigReader.getProperty("gurselCourseTitle"));
        Assert.assertTrue(qualityDemyPage_instructor.noDataAvailableInTheTable.isDisplayed());
        ReusableMethods.bekle(3);
        TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
        File source = ts.getScreenshotAs(OutputType.FILE);
        ReusableMethods.bekle(3);

        Driver.getDriver().navigate().back();

        //2.When the course name is clicked, it should redirect to the page of the relevant course.
        qualityDemyPage_instructor.salesReportLink.click();
        Assert.assertTrue(qualityDemyPage_instructor.noDataAvailableInTheTable.isDisplayed());
        ReusableMethods.bekle(3);
        TakesScreenshot ts1 = (TakesScreenshot) Driver.getDriver();
        File source1 = ts.getScreenshotAs(OutputType.FILE);
        ReusableMethods.bekle(3);

        //The course should be listed when the desired date is selected
        //from the filter dropbox and the filter button is pressed.

        //Press the filter dropbox, we select last month for a wide time interval.
        qualityDemyPage_instructor.filterDropBox.click();
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(qualityDemyPage_instructor.lastMonthButton).click().perform();
        //Press filter button.
        qualityDemyPage_instructor.filterButton.click();
        ReusableMethods.bekle(3);
        Assert.assertTrue(qualityDemyPage_instructor.noDataAvailableInTheTable.isDisplayed());
        ReusableMethods.bekle(2);
        TakesScreenshot ts2 = (TakesScreenshot) Driver.getDriver();
        File source2 = ts.getScreenshotAs(OutputType.FILE);
        ReusableMethods.bekle(3);
        Driver.closeDriver();
    }

}
