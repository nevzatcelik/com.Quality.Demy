package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualityDemyPage_Instructor;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_18 {
    QualityDemyPage_Instructor qualityDemyPageInstructor = new QualityDemyPage_Instructor();

    @Test
    public void TC1801() throws InterruptedException {
        //Launch browser
        //Go to QualityDemy home page
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));

        //Enter a valid username and password and login
        qualityDemyPageInstructor.loginLink.click();
        qualityDemyPageInstructor.emailBox.sendKeys(ConfigReader.getProperty("ZeynepValidInsEmail"));
        qualityDemyPageInstructor.passwordBox.sendKeys((ConfigReader.getProperty("ZeynepValidInsPassword")));
        ReusableMethods.bekle(2);
        qualityDemyPageInstructor.acceptCookies.click();
        ReusableMethods.bekle(2);
        qualityDemyPageInstructor.loginButton.click();
        ReusableMethods.bekle(7);

        //Click the instructor title
        qualityDemyPageInstructor.instructorSection.click();

        //Click the number of courses section and test that it redirects to the courses page
        qualityDemyPageInstructor.numberOfCourses.click();
        Assert.assertTrue(qualityDemyPageInstructor.coursesPage.isDisplayed());

        ReusableMethods.bekle(5);
        Driver.closeDriver();

    }
    @Test
    public void TC1802() throws InterruptedException {
        //Launch browser
        //Go to QualityDemy home page
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));

        //Enter a valid username and password and login
        qualityDemyPageInstructor.loginLink.click();
        qualityDemyPageInstructor.emailBox.sendKeys(ConfigReader.getProperty("ZeynepValidInsEmail"));
        qualityDemyPageInstructor.passwordBox.sendKeys((ConfigReader.getProperty("ZeynepValidInsPassword")));
        ReusableMethods.bekle(2);
        qualityDemyPageInstructor.acceptCookies.click();
        ReusableMethods.bekle(2);
        qualityDemyPageInstructor.loginButton.click();
        ReusableMethods.bekle(7);

        //Click the instructor title
        qualityDemyPageInstructor.instructorSection.click();

        //Click the number of enrolment section and test that it redirects to the sales_report page
        qualityDemyPageInstructor.numberOfEnrolment.click();
        Assert.assertTrue(qualityDemyPageInstructor.salesReportPage.isDisplayed());

        ReusableMethods.bekle(5);
        Driver.closeDriver();

    }

    @Test
    public void TC1803() throws InterruptedException {
        //Launch browser
        //Go to QualityDemy home page
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));

        //Enter a valid username and password and login
        qualityDemyPageInstructor.loginLink.click();
        qualityDemyPageInstructor.emailBox.sendKeys(ConfigReader.getProperty("ZeynepValidInsEmail"));
        qualityDemyPageInstructor.passwordBox.sendKeys((ConfigReader.getProperty("ZeynepValidInsPassword")));
        ReusableMethods.bekle(2);
        qualityDemyPageInstructor.acceptCookies.click();
        ReusableMethods.bekle(2);
        qualityDemyPageInstructor.loginButton.click();
        ReusableMethods.bekle(7);

        //Click the instructor title
        qualityDemyPageInstructor.instructorSection.click();

        //Click the pending balance section and test that it redirects to the payout_report page
        qualityDemyPageInstructor.pendingBalance.click();
        Assert.assertTrue(qualityDemyPageInstructor.payOutReport.isDisplayed());

        ReusableMethods.bekle(5);
        Driver.closeDriver();
    }
    @Test
    public void TC1804(){
        //Launch browser
        //Go to QualityDemy home page
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));

        //Enter a valid username and password and login
        qualityDemyPageInstructor.loginLink.click();
        qualityDemyPageInstructor.emailBox.sendKeys(ConfigReader.getProperty("ZeynepValidInsEmail"));
        qualityDemyPageInstructor.passwordBox.sendKeys((ConfigReader.getProperty("ZeynepValidInsPassword")));
        ReusableMethods.bekle(2);
        qualityDemyPageInstructor.acceptCookies.click();
        ReusableMethods.bekle(2);
        qualityDemyPageInstructor.loginButton.click();
        ReusableMethods.bekle(7);

        //Click the instructor section
        qualityDemyPageInstructor.instructorSection.click();

        //Click the requested withdrawal amount section and test that it redirects to the payout_report page
        qualityDemyPageInstructor.requestedWithdrawalAmount.click();
        Assert.assertTrue(qualityDemyPageInstructor.payOutReport.isDisplayed());

        ReusableMethods.bekle(5);
        Driver.closeDriver();
    }

}
