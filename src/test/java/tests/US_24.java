package tests;

import org.testng.annotations.Test;
import pages.QualityDemyPage_Instructor;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_24 {

    @Test
    public void testus23() {
        //go to qualitydemy web page
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));
        //click login link
        QualityDemyPage_Instructor qdp = new QualityDemyPage_Instructor();
        qdp.loginLink.click();
        //Acept Cookies
        qdp.acceptCookies.click();
        ReusableMethods.bekle(2);
        //fill login email adress and password
        qdp.emailBox.sendKeys(ConfigReader.getProperty("i_Email"));
        qdp.passwordBox.sendKeys(ConfigReader.getProperty("i_password"));
        //click login button
        qdp.loginButton.click();
        ReusableMethods.bekle(2);
        //click Instructor from Homepage
        qdp.Instructor.click();
        ReusableMethods.bekle(2);
        //Click Course Manager
        qdp.c_manager.click();
        ReusableMethods.bekle(2);
        //Click Add new course
        qdp.add_newcourse.click();
        ReusableMethods.bekle(2);
        //Click Requirements Section



    }
    @Test
    public void testus233 () {

        Driver.closeDriver();

    }


}
