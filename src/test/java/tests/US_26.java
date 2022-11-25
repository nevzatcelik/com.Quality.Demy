package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualityDemyPage_Instructor;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_26 {

    QualityDemyPage_Instructor qualityDemyPage_instructor = new QualityDemyPage_Instructor();
    Actions actions = new Actions(Driver.getDriver());

    @Test
    public void courseOverviewProvider(){

        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));
        qualityDemyPage_instructor.cookies.click();
        qualityDemyPage_instructor.loginLinki.click();
        qualityDemyPage_instructor.emailKutusu.sendKeys(ConfigReader.getProperty("meryemgecerliEmail"));
        qualityDemyPage_instructor.passwordKutusu.sendKeys(ConfigReader.getProperty("meryemGecerliPassword"));
        qualityDemyPage_instructor.loginButonu.click();
        qualityDemyPage_instructor.instructor.click();
        qualityDemyPage_instructor.courseManager.click();
        qualityDemyPage_instructor.addNewCourse.click();

        qualityDemyPage_instructor.media.click();

        ReusableMethods.bekle(3);
        String expectedCourse= "Youtube";
        String actualCourse = qualityDemyPage_instructor.courseOverviewProvider.getText();

        Assert.assertEquals(expectedCourse,actualCourse);


        actions.moveToElement(qualityDemyPage_instructor.courseOverviewProvider)
                .click(qualityDemyPage_instructor.courseOverviewProvider)
                .sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER)
                .perform();

        ReusableMethods.bekle(3);

        String expectedCourse2= "Vimeo";
        String actualCourse2 = qualityDemyPage_instructor.courseOverviewProvider.getText();

        Assert.assertEquals(expectedCourse2,actualCourse2);

        actions.moveToElement(qualityDemyPage_instructor.courseOverviewProvider)
                .click(qualityDemyPage_instructor.courseOverviewProvider)
                .sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER)
                .perform();

        String expectedCourse3= "Html5";
        String actualCourse3 = qualityDemyPage_instructor.courseOverviewProvider.getText();

        Assert.assertEquals(expectedCourse3,actualCourse3);

    }

    @Test (dependsOnMethods = "courseOverviewProvider")
    public void courseOverviewUrl(){


        qualityDemyPage_instructor.basicButonu.click();
        qualityDemyPage_instructor.courseTitle.sendKeys("Course Title");
        qualityDemyPage_instructor.categoryDropDown.click();
        qualityDemyPage_instructor.media.click();
        qualityDemyPage_instructor.courseOverviewUrl.sendKeys(ConfigReader.getProperty("meryemcourseUrl"));

        String expectedUrl= ConfigReader.getProperty("meryemcourseUrl");
        String actualUrl = qualityDemyPage_instructor.courseOverviewUrl.getAttribute("value");

        Assert.assertEquals(actualUrl,expectedUrl);
    }

    @Test (dependsOnMethods = "courseOverviewUrl" )
    public void uploadCourseThumbnail(){

        String yüklenecekfotoraf = System.getProperty("user.home") + "\\Downloads\\placeholder.png";
        actions.sendKeys(qualityDemyPage_instructor.uploadCoursePicture+yüklenecekfotoraf).click();
    }
}
