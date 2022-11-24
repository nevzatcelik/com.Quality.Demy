package tests;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualityDemyPage_Instructor;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import javax.xml.xpath.XPath;

public class US_29 {


    QualityDemyPage_Instructor qdp = new QualityDemyPage_Instructor();
    @Test
    public void category() {
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
        //Click Course Title
        qdp.entercoursetitle.click();
        // Send keys to coursetitle
        qdp.entercoursetitle.sendKeys(ConfigReader.getProperty("coursetitle"));
        Assert.assertTrue(qdp.entercoursetitle.isEnabled());
        //Click Short Description
        qdp.shortdescription.click();
        //Send key to short description text box
        qdp.shortdescription.sendKeys(ConfigReader.getProperty("shorttitle"));
        Assert.assertTrue(qdp.entercoursetitle.isEnabled());
        //click Description
        qdp.description.click();
        // Sen key to description text box
        qdp.description.sendKeys(ConfigReader.getProperty("description"));
        Assert.assertTrue(qdp.description.isEnabled());
        ReusableMethods.bekle(2);
        //Click Category
        qdp.category.click();
        ReusableMethods.bekle(2);
        //Select one of category from list
        WebElement searchbox = Driver.getDriver().findElement(By.xpath("//input[@class='select2-search__field']"));
        searchbox.sendKeys("Web Design for Web Developers"+ Keys.ENTER);
        Assert.assertTrue(qdp.category.isEnabled());

        //Click Level Section
        qdp.Level.click();

        WebElement searchbox2 = Driver.getDriver().findElement(By.xpath("//input[@class='select2-search__field']"));
        searchbox2.sendKeys("Advanced"+Keys.ENTER);
        Assert.assertTrue(qdp.Level.isEnabled());
        ReusableMethods.bekle(2);
        //Enable drip content button
        qdp.Enable_Drip.click();
        ReusableMethods.bekle(2);
        qdp.checkbox.click();
        ReusableMethods.bekle(2);
        Driver.closeDriver();






        }



    }




