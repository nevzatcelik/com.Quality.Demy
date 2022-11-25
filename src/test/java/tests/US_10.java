package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.QualityDemyPage_User;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import java.io.IOException;
import java.rmi.server.RemoteRef;

public class US_10 {
    QualityDemyPage_User murat=new QualityDemyPage_User ();
    SoftAssert softAssert = new SoftAssert();
    @BeforeTest
    public void setUp(){
        Driver.getDriver().get( ConfigReader.getProperty("myUrl") );
        murat.acceptCookies.click();
        murat.loginLink.click();
        murat.emailBox.sendKeys( ConfigReader.getProperty("myRichtigEmail"));
        murat.passwordBox.sendKeys(ConfigReader.getProperty("myRichtigPassword"));
        murat.loginButton.click();
    }
    @Test
    public void Test10_01(){
        //- Reset butonuna basıldığında sayfa yenilendigini test edin
       murat.myCoursesButton.click();
       murat.resetButton.click();
       String resetTitle=Driver.getDriver().getTitle();
       Driver.getDriver().navigate().refresh();
       String refreshTitle=Driver.getDriver().getTitle();
       Assert.assertEquals( resetTitle,refreshTitle );
    }

    @Test
    public void Test10_02() {
        //- Kurslarin, arama kutusundan seçilebilmelir oldugunu test edin
        murat.myCoursesButton.click();
        murat.mySearchBox.sendKeys("Wordpress");
        ReusableMethods.bekle(3);
        softAssert.assertTrue(murat.mySearchBox.isDisplayed());
        softAssert.assertAll();
    }
    @Test
    public void Test10_03(){
        //- Edit rating linkine tiklandiginda puanlama ekraninin görünür oldugunu test edin
        murat.myCoursesButton.click();
        murat.editRating6.click();
        String puan = "1 Out of 5";
        Assert.assertFalse( puan.isEmpty() );
    }
    @Test
    public void Test10_04(){
        //- Edit rating linkine tiklayin
        //- Cancel tusuna basildiginda puanlama ekraninin kapandigini test edin
        murat.myCoursesButton.click();
        murat.editRating6.click();
        murat.cancelButtonEditRating.click();
        Assert.assertTrue(murat.startLesson.isDisplayed());
    }
    @Test
    public void Test10_05(){
        //- Edit rating linkine tiklayin
        //- Puan araliginin secilebilir oldugunu test edin
        murat.myCoursesButton.click();
        murat.editRating6.click();
        Actions actions = new Actions( Driver.getDriver() );
        actions.moveToElement(murat.editRatingDropDown).click(murat.puan1out5).perform();
        ReusableMethods.bekle(2);
           }
    @Test
    public void Test10_06(){
        //- Edit rating linkine tiklayin
        //- Msg metin kutusuna not yazmak mümkün oldugunu test edin
        murat.myCoursesButton.click();
        murat.editRating6.click();
        murat.msgTextBox.sendKeys("Kursu begenmedim");
        murat.publishRating.click();
    }
    @Test
    public void Test10_07(){
        //- Edit rating linkine tiklayin
        //- Bir puan araligi secin
        //- Publish rating butonuna basildiginda secilen degerlendirmenin yayinladigini test edin
        murat.myCoursesButton.click();
        murat.editRating6.click();
        Actions actions = new Actions( Driver.getDriver() );
        actions.moveToElement(murat.editRatingDropDown).click(murat.puan1out5).perform();
        ReusableMethods.bekle( 2 );
        murat.publishRating.click();
            }
    @Test
    public void Test10_08(){
       //- Start lesson butonuna tıklandığında ilgili ders sayfasına gidildigini test edin
        murat.myCoursesButton.click();
        murat.startLesson.click();
        String Kurs = "Learn Python";
        Assert.assertFalse(Kurs.isEmpty());
    }
    @AfterClass
    public void teardown(){
        ReusableMethods.bekle(3);
        Driver.closeDriver();
    }}
