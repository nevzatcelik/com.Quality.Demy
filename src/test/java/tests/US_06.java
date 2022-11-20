package tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.QualityDemyPage_User;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_06 {

        QualityDemyPage_User myQualityDemyPage=new QualityDemyPage_User ();

        @BeforeClass
        public void setup(){
            // anasayfasina gidin
            Driver.getDriver().get( ConfigReader.getProperty("myUrl"));
            myQualityDemyPage.acceptCookies.click();
        }

        // yanlis bilgilerle giris yapilamadigini test edin
        @Test
        public void yanlisKullaniciTesti(){
            // 1- yanlis kullanici adi, gecerli password
            myQualityDemyPage.emailKutusu.sendKeys(ConfigReader.getProperty("myFalschEmail"));
            myQualityDemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("myRichtigPassword"));
            // Login butonuna basarak login olmaya calisin
            myQualityDemyPage.loginButonu.click();
            // Basarili olarak giris yapilamadigini test edin
            // bunun icin hala login linklinin gorunur oldugunu test edelim
            Assert.assertTrue(myQualityDemyPage.loginLinki.isEnabled());
        }
        @Test
        public void yanlisPasswordTesti(){
            // 2- gecerli kullanici adi, yanlis password
            myQualityDemyPage.emailKutusu.sendKeys(ConfigReader.getProperty("myRichtigEmail"));
            myQualityDemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("myFalschPassword"));
            // Login butonuna basarak login olmaya calisin
            myQualityDemyPage.loginButonu.click();
            // Basarili olarak giris yapilamadigini test edin
            Assert.assertTrue(myQualityDemyPage.loginLinki.isEnabled());
        }

        @Test
        public void yanlisEmailPasswordTesti(){
            // 3- yanlis kullanici adi, yanlis password
            myQualityDemyPage.emailKutusu.sendKeys(ConfigReader.getProperty("myFalschEmail"));
            myQualityDemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("myFalschPassword"));
            // Login butonuna basarak login olmaya calisin
            myQualityDemyPage.loginButonu.click();
            // Basarili olarak giris yapilamadigini test edin
            Assert.assertTrue(myQualityDemyPage.loginLinki.isEnabled());
        }
        @AfterClass
        public void teardown(){
            ReusableMethods.bekle(5);
            Driver.closeDriver();
        }
    }
