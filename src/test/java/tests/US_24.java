package tests;

import org.testng.annotations.Test;
import pages.QualityDemyPage_Instructor;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_24 {

    QualityDemyPage_Instructor qdp = new QualityDemyPage_Instructor();

    @Test
    public void testus23() {
        //go to qualitydemy web page
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));
        //click login link
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
        //Click Outcomes Section
        qdp.outcomesection.click();
        //Click textbox from outcomes section
        qdp.outcomestextbox.click();
        //Fill textbox to Outcomes section
        qdp.outcomestextbox.sendKeys("Improve you knowledge");
        ReusableMethods.bekle(2);
        //Click add button
        qdp.addoutcomebutton.click();

        ReusableMethods.bekle(2);
        Driver.closeDriver();





    }
    @Test
    public void testus233 () {

        Driver.closeDriver();

    }


}
