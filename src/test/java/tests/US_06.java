package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.QualityDemyPage_User;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.concurrent.locks.ReentrantLock;

public class US_06 {
        QualityDemyPage_User mert =new QualityDemyPage_User ();
    @BeforeClass
    public void Login(){
        Driver.getDriver().get( ConfigReader.getProperty("myUrl"  ) );}

        @Test
        public void testUS0601(){
        mert.loginMethodu();
        Assert.assertTrue( mert.welcomeTestUser.isDisplayed() );
    }

        @Test
        public void testUS0602(){
        mert.acceptCookies.click();
        ReusableMethods.bekle( 2 );
        mert.loginLinki.click();
        Assert.assertTrue( mert.loginLinki.isDisplayed() );
    }
    @Test
    public void testUS0603AD(){
        mert.acceptCookies.click();
        mert.signUpButonu.click();
        mert.firstName.sendKeys( "m" );
        mert.lastName.sendKeys( "ay" );
        ReusableMethods.bekle( 2 );
        mert.emailKutusu.sendKeys( "user_1106167@login.com" );
        ReusableMethods.bekle( 1 );
        mert.passwordKutusu.sendKeys( "262081294" );
        mert.signUpButonu.click();
    }
    @Test
    public void testUS0603SOYAD(){
        mert.acceptCookies.click();
        mert.signUpButonu.click();
        mert.firstName.sendKeys( "murat" );
        mert.lastName.sendKeys( "y" );
        //soyad tek harf olunca test failed olacak
        ReusableMethods.bekle( 2 );
        mert.emailKutusu.sendKeys( "user_1106167@login.com" );
        ReusableMethods.bekle( 1 );
        mert.passwordKutusu.sendKeys( "262081294" );
        mert.signUpButonu.click();
    }

    @Test
    public void testUS0604(){
        mert.acceptCookies.click();
        mert.signUpButonu.click();
        mert.firstName.sendKeys( "murat" );
        mert.lastName.sendKeys( "ay" );
        ReusableMethods.bekle( 2 );
        mert.emailKutusu.sendKeys( "user_1106167@login.com" );
        ReusableMethods.bekle( 1 );
        mert.passwordKutusu.sendKeys( "262081294" );
        //sifre harf icermedigi halde test passed olacak
        mert.signUpButonu.click();
    }

    @Test
    public void testUS0605Pozitif(){
        mert.acceptCookies.click();
        mert.signUpButonu.click();
        mert.firstName.sendKeys( "murat" );
        mert.lastName.sendKeys( "ay" );
        ReusableMethods.bekle( 2 );
        mert.emailKutusu.sendKeys( "user_1106167@login.com" );
        //mail @ icerdigi icin passed olacak
        ReusableMethods.bekle( 1 );
        mert.passwordKutusu.sendKeys( "262081294" );
        mert.signUpButonu.click();
    }
    @Test
    public void testUS0605Negatif(){
        mert.acceptCookies.click();
        mert.signUpButonu.click();
        mert.firstName.sendKeys( "murat" );
        mert.lastName.sendKeys( "ay" );
        ReusableMethods.bekle( 2 );
        mert.emailKutusu.sendKeys( "user_1106167login.com" );
        //mail @ icermedigi icin failed olacak
        ReusableMethods.bekle( 1 );
        mert.passwordKutusu.sendKeys( "262081294" );
        mert.signUpButonu.click();
    }
    @Test
    public void testUS0606(){
        mert.acceptCookies.click();
        mert.signUpButonu.click();
    }
        @AfterClass
        public void teardown(){
            ReusableMethods.bekle(3);
            Driver.closeDriver();
        }
    }
