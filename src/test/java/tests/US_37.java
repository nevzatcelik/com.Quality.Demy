package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualityDemyPage_Instructor;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.security.Key;

public class US_37 {
    QualityDemyPage_Instructor qdp = new QualityDemyPage_Instructor();
    @Test
    public void mycourses () {
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
        //Click My Courses
        qdp.my_courses.click();
        ReusableMethods.bekle(2);
        //Click Course detail
        qdp.coursedetail.click();
        ReusableMethods.bekle(2);
        //Context menu should open and close when clicking on section headers
        Actions at = new Actions(Driver.getDriver());
        at.sendKeys(Keys.PAGE_DOWN).build().perform();
        ReusableMethods.bekle(2);
        qdp.contextmenuopen.click();
        ReusableMethods.bekle(2);
        qdp.contextmenuclose.click();
        ReusableMethods.bekle(2);
        at.sendKeys(Keys.PAGE_UP).build().perform();








    }

}
