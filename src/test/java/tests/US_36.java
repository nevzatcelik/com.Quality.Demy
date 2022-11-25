package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualityDemyPage_User;
import utilities.ConfigReader;
import utilities.Driver;

public class US_36 {

    QualityDemyPage_User qualityDemyPage_user=new QualityDemyPage_User();

    @Test
    public void becomeAndInstructorPageTest(){

        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));
        qualityDemyPage_user.acceptCookies.click();

        qualityDemyPage_user.loginLink.click();
        qualityDemyPage_user.emailBox.sendKeys(ConfigReader.getProperty("validEmailNevzatUs"));
        qualityDemyPage_user.passwordBox.sendKeys(ConfigReader.getProperty("validPasswordNevzatUs"));
        qualityDemyPage_user.loginButton.click();
        qualityDemyPage_user.instructorButton.click();
        qualityDemyPage_user.nameBox.sendKeys("nameBoxCheck1");
        qualityDemyPage_user.nameBox.sendKeys("nameBoxCheck2");

        String expectedName="Test User";
        String actualName=qualityDemyPage_user.nameBox.getAttribute("value");

        Assert.assertEquals(actualName,expectedName);

        qualityDemyPage_user.emailAdressBox.sendKeys("exampleEmailNevzat1");
        qualityDemyPage_user.emailBox.sendKeys("exampleEmailNevzat2");

        String expectedEmail="user_1106327@login.com";
        String actualEmail=qualityDemyPage_user.emailAdressBox.getAttribute("value");

        Assert.assertEquals(actualEmail,expectedEmail);

    }

    @Test
    public void adressPhoneandMessageTest(){
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));
        qualityDemyPage_user.acceptCookies.click();

        qualityDemyPage_user.loginLink.click();
        qualityDemyPage_user.emailBox.sendKeys(ConfigReader.getProperty("validEmailNevzatUs"));
        qualityDemyPage_user.passwordBox.sendKeys(ConfigReader.getProperty("validPasswordNevzatUs"));
        qualityDemyPage_user.loginButton.click();
        qualityDemyPage_user.instructorButton.click();
        qualityDemyPage_user.adressBox.sendKeys(ConfigReader.getProperty("adressNevzat"));
        qualityDemyPage_user.phoneNumberBox.sendKeys("phoneNevzat");
        qualityDemyPage_user.anyMessageBox.sendKeys(ConfigReader.getProperty("anyMessageNevzat"));
        qualityDemyPage_user.document.sendKeys(ConfigReader.getProperty("dosyaYoluNevzat"));

    }


    @Test
    public void applyTest(){
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));
        qualityDemyPage_user.acceptCookies.click();

        qualityDemyPage_user.loginLink.click();
        qualityDemyPage_user.emailBox.sendKeys(ConfigReader.getProperty("validEmailNevzatUs"));
        qualityDemyPage_user.passwordBox.sendKeys(ConfigReader.getProperty("validPasswordNevzatUs"));
        qualityDemyPage_user.loginButton.click();
        qualityDemyPage_user.instructorButton.click();
        qualityDemyPage_user.adressBox.sendKeys(ConfigReader.getProperty("adressNevzat"));
        qualityDemyPage_user.phoneNumberBox.sendKeys("phoneNevzat");
        qualityDemyPage_user.anyMessageBox.sendKeys(ConfigReader.getProperty("anyMessageNevzat"));
        qualityDemyPage_user.document.sendKeys(ConfigReader.getProperty("dosyaYoluNevzat"));
        //  qualityDemyPage_user.applyButton.click();
        //  Assert.assertTrue(qualityDemyPage_user.applyCongrastMessage.isDisplayed());

    }

}
