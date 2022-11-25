package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualityDemyPage_Instructor;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_17 {

    QualityDemyPage_Instructor qualitydemyPage = new QualityDemyPage_Instructor();


    @Test
    public void photo(){

        //- Go to https://qualitydemy.com
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));

        //- Click on login and enter your email and password and click on the login button
        qualitydemyPage.cookies.click();
        qualitydemyPage.loginLinki.click();
        qualitydemyPage.emailKutusu.sendKeys(ConfigReader.getProperty("meryemgecerliEmail"));
        qualitydemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("meryemGecerliPassword"));
        qualitydemyPage.loginButonu.click();

        //- go to instructor and click user_profile
        qualitydemyPage.instructor.click();
        qualitydemyPage.myManager.click();

        //- Click on the photo
        qualitydemyPage.photoButon.click();


    }
    @Test(dependsOnMethods = "photo")
    public void photoUploaded(){

        qualitydemyPage.uploadİmage.click();
        //- Click on choose file
        //- send an image file from the computer
        String yüklenecekfotoraf = System.getProperty("user.home") + "OneDrive\\Masaüstü\\user_photo.png";

        //- Check that the uploaded image is visible
        //- Click the upload button
        qualitydemyPage.uploadButonu.click();
        ReusableMethods.bekle(2);

        //- Check the profile photo that the file was uploaded successfully
        Assert.assertTrue(qualitydemyPage.mesaj.isDisplayed());
    }

    @Test(dependsOnMethods = "photoUploaded")
    public void photonotloaded(){

        // -Choose a file other than the image
        qualitydemyPage.uploadİmage.click();
        String yüklenecekfotoraf = System.getProperty("user.home") + "\\Downloads\\placeholder.png";
        //-Click the upload button
        qualitydemyPage.uploadButonu.click();
        //-Check that the file could not be uploaded
        ReusableMethods.bekle(2);
        Assert.assertTrue(qualitydemyPage.mesaj.isDisplayed());
    }
}
