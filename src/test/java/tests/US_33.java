package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualityDemyPage_Instructor;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_33 {

    QualityDemyPage_Instructor qualityDemyPage_instructor=new QualityDemyPage_Instructor();

    @Test
    public void courseOverviewProviderTest(){
        Driver.getDriver().get(ConfigReader.getProperty("myUrl1"));
        qualityDemyPage_instructor.acceptCookies();

        qualityDemyPage_instructor.loginLink.click();
        qualityDemyPage_instructor.emailBox.sendKeys(ConfigReader.getProperty("validEmailNevzatIns"));
        qualityDemyPage_instructor.passwordBox.sendKeys(ConfigReader.getProperty("validPasswordNevzatIns"));
        qualityDemyPage_instructor.loginButton.click();
        qualityDemyPage_instructor.instructorButton.click();
        qualityDemyPage_instructor.courseManagerButton.click();
        qualityDemyPage_instructor.addNewCourseButton.click();

        qualityDemyPage_instructor.mediaButton.click();

        String expectedCourseOverview="Youtube";
        String actualCourseOveriview=qualityDemyPage_instructor.courseOverviewProviderBox.getText();

        Assert.assertEquals(expectedCourseOverview,actualCourseOveriview);
        ReusableMethods.bekle(3);
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(qualityDemyPage_instructor.courseOverviewProviderDropDown).
                click(qualityDemyPage_instructor.courseOverviewProviderDropDown).sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ENTER).perform();
        ReusableMethods.bekle(5);
        String expectedCourseOverview2="Vimeo";
        String actualCourseOverview2=qualityDemyPage_instructor.courseOverviewProviderBox.getText();

        Assert.assertEquals(expectedCourseOverview2,actualCourseOverview2);

        actions.moveToElement(qualityDemyPage_instructor.courseOverviewProviderDropDown).
                click(qualityDemyPage_instructor.courseOverviewProviderDropDown).
                sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
        ReusableMethods.bekle(3);

        String expectedCourseOverview3="Html5";
        String actualCourseOverview=qualityDemyPage_instructor.courseOverviewProviderBox.getText();

        Assert.assertEquals(expectedCourseOverview3,expectedCourseOverview3);

        qualityDemyPage_instructor.testUser.click();
        qualityDemyPage_instructor.logoutButton.click();
    }

    @Test
    public void courseOverviewUrlTest(){
        Actions actions=new Actions(Driver.getDriver());
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));

        qualityDemyPage_instructor.acceptCookies();
        qualityDemyPage_instructor.loginLink.click();
        qualityDemyPage_instructor.emailBox.sendKeys(ConfigReader.getProperty("validEmailNevzatIns"));
        qualityDemyPage_instructor.passwordBox.sendKeys(ConfigReader.getProperty("validPasswordNevzatIns"));
        qualityDemyPage_instructor.loginButton.click();

        qualityDemyPage_instructor.instructorButton.click();
        qualityDemyPage_instructor.courseManagerButton.click();
        qualityDemyPage_instructor.addNewCourseButton.click();

        ReusableMethods.bekle(3);
        qualityDemyPage_instructor.courseTitle.sendKeys("courseTitle");
        qualityDemyPage_instructor.categoryDropDown.click();
        qualityDemyPage_instructor.webDesignLesson.click();
        qualityDemyPage_instructor.mediaButton.click();
        qualityDemyPage_instructor.courseOverviewUrl.sendKeys(ConfigReader.getProperty("courseOverviewUrl"));
        qualityDemyPage_instructor.finishSection.click();
        qualityDemyPage_instructor.submitFinish.click();
        qualityDemyPage_instructor.mediaButton.click();

        String expectedUrl=ConfigReader.getProperty("courseOverviewUrl");
        String actualUrl=qualityDemyPage_instructor.courseOverviewUrlBox.getAttribute("value");
        System.out.println(actualUrl);

        Assert.assertEquals(actualUrl,expectedUrl);

        ReusableMethods.bekle(7);
        qualityDemyPage_instructor.testUser.click();
        qualityDemyPage_instructor.logoutButton.click();

    }

    @Test
    public void uploadCourseThumbnail(){
        Driver.getDriver().get(ConfigReader.getProperty("myUrl1"));
        ReusableMethods.bekle(2);
        qualityDemyPage_instructor.acceptCookies();
        qualityDemyPage_instructor.loginLink.click();
        qualityDemyPage_instructor.emailBox.sendKeys(ConfigReader.getProperty("validEmailNevzatIns"));
        qualityDemyPage_instructor.passwordBox.sendKeys(ConfigReader.getProperty("validPasswordNevzatIns"));
        qualityDemyPage_instructor.loginButton.click();

        qualityDemyPage_instructor.instructorButton.click();
        qualityDemyPage_instructor.courseManagerButton.click();
        qualityDemyPage_instructor.addNewCourseButton.click();

        qualityDemyPage_instructor.mediaButton.click();

        //   qualityDemyPage_instructor.uploadCourseThumbnail.click();

        String dosyaYolu=ConfigReader.getProperty("dosyaYoluNevzat");
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(qualityDemyPage_instructor.uploadCourseThumbnail+dosyaYolu).perform();
        ReusableMethods.bekle(2);
        actions.sendKeys(Keys.PAGE_UP).perform();

        qualityDemyPage_instructor.testUser.click();
        qualityDemyPage_instructor.logoutButton.click();
    }

}
