package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualityDemyPage_Instructor;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_27 {



    @Test
    public void seoSectionTest(){
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
        qualityDemyPage_instructor.seoButton.click();
        Actions actions=new Actions(Driver.getDriver());
        actions.click(qualityDemyPage_instructor.metaKeywordTextbox).
                sendKeys(ConfigReader.getProperty("seoMetaKeywordsTextbox")+ Keys.ENTER).
                sendKeys(ConfigReader.getProperty("seoMetaKeywordsTextbox2")+Keys.ENTER).
                sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("seoMetaKeywordsdescription")).
                click(qualityDemyPage_instructor.finishSection).click(qualityDemyPage_instructor.submitFinish).perform();

        qualityDemyPage_instructor.seoButton.click();

        String expectedTextBox=ConfigReader.getProperty("seoMetaKeywordsTextbox");
        String actualTextBox=qualityDemyPage_instructor.metaKeywordTextCheck.getText();
        Assert.assertEquals(expectedTextBox,actualTextBox);

        String expectedTextBox2=ConfigReader.getProperty("seoMetaKeywordsTextbox2");
        String actualTextBox2=qualityDemyPage_instructor.metaKeywordTextCheck2.getText();
        Assert.assertEquals(expectedTextBox2,actualTextBox2);

        String expectedMetaDescriptions=ConfigReader.getProperty("seoMetaKeywordsdescription");
        String actualMetaDestriptions=qualityDemyPage_instructor.metaDescriptionsCheck.getText();

        Assert.assertEquals(expectedMetaDescriptions,actualMetaDestriptions);
        ReusableMethods.bekle(5);
        qualityDemyPage_instructor.testUser.click();
        qualityDemyPage_instructor.logoutButton.click();


    }
}
