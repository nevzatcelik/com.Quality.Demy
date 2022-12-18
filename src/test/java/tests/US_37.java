package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.Test;
import pages.QualityDemyPage_User;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.security.Key;

public class US_37 {
    QualityDemyPage_User qdp = new QualityDemyPage_User();
    @Test
    public void mycourses () {
        //go to qualitydemy web page
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));
        //click login link
        qdp.acceptCookies();
        qdp.loginLink.click();
        //Accept Cookies
       // qdp.acceptCookies.click();
        ReusableMethods.bekle(2);
        //fill login email address and password
        qdp.emailBox.sendKeys(ConfigReader.getProperty("u_Email"));
        qdp.passwordBox.sendKeys(ConfigReader.getProperty("u_Password"));
        //click login button
        qdp.loginButton.click();
        ReusableMethods.bekle(5);
        //Click My Courses
        qdp.myCoursesButton2.click();
        ReusableMethods.bekle(2);
        //Click Course detail
        qdp.coursedetaill.click();
        ReusableMethods.bekle(2);
        //Scroll Down
        Actions at = new Actions(Driver.getDriver());
        at.sendKeys(Keys.PAGE_DOWN).build().perform();
        ReusableMethods.bekle(2);
        //Context menu should open and close when clicking on section headers
        qdp.contextmenuopen.click();
        ReusableMethods.bekle(2);
        qdp.contextmenuclose.click();
        ReusableMethods.bekle(2);
        //Scroll Upp
        at.sendKeys(Keys.PAGE_UP).build().perform();
        ReusableMethods.bekle(2);
        //The topics in the sections should be selectable as checked or unchecked
        qdp.my_courses.click();
        at.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).build().perform();
        qdp.javastartbutton.click();
        ReusableMethods.bekle(2);
        //Open section 1
        qdp.clickplusbutton.click();
        qdp.checkbox.click();
        ReusableMethods.bekle(2);
        qdp.checkbox.click();
        ReusableMethods.bekle(2);
        Driver.getDriver().navigate().back();
        at.sendKeys(Keys.PAGE_UP).sendKeys(Keys.UP).sendKeys(Keys.UP).build().perform();


        //Driver.closeDriver();

    }
}
