package tests;

import org.testng.annotations.Test;
import pages.QualityDemyPage_Instructor;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_23 {

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








    }
}
