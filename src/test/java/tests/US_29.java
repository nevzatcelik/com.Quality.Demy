package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualityDemyPage_Instructor;
import pages.QualityDemyPage_User;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;
import java.util.Random;

public class US_29 {
    QualityDemyPage_Instructor qdp = new QualityDemyPage_Instructor();

    @Test
    public void testus29() {
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

        qdp.category.click();
    }









    }

