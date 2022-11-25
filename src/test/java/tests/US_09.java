package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.QualityDemyPage_User;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.rmi.server.RemoteRef;

public class US_09 {
    QualityDemyPage_User murat=new QualityDemyPage_User ();
    @BeforeClass
    public void setUp(){
        Driver.getDriver().get( ConfigReader.getProperty("myUrl") );
        murat.acceptCookies.click();
        murat.loginLink.click();
        murat.emailBox.sendKeys( ConfigReader.getProperty("myRichtigEmail"));
        murat.passwordBox.sendKeys(ConfigReader.getProperty("myRichtigPassword"));
        murat.loginButton.click();
    }
    @Test
    public void Test09_01(){
        /* TC_09_01
        1.Anasayfaya gidilir
        2.Anasayfanin sag üst kösesindeki alisveris sepetine tiklanir
        3.""Shopping cart"" sayfasindaki secili olan kurslardan birindeki ""Remove""  butonuna tiklanir
        4.""Remove""butonuna basilan kursun sayfadan silindigi test edilir" */
        SoftAssert softAssert=new SoftAssert();
        Actions actions = new Actions( Driver.getDriver() );
        actions.moveToElement( murat.categoriesDropDown ).click( murat.catagoriesAll ).perform();
        ReusableMethods.bekle( 2 );
        actions.sendKeys( Keys.PAGE_DOWN ).perform();

        ReusableMethods.bekle( 2 );
        murat.cours250.click();
        ReusableMethods.bekle( 1);
        actions.moveToElement( murat.addToCart250 ).click(murat.addToCart250).perform();
        ReusableMethods.bekle( 2 );
        //actions.click(murat.addToCart150).click(murat.addToCart150);
        ReusableMethods.bekle( 1 );
        Driver.getDriver().navigate().back();
        ReusableMethods.bekle( 3 );

        actions.sendKeys( Keys.PAGE_DOWN )
        .sendKeys( Keys.PAGE_DOWN )
        .sendKeys( Keys.PAGE_DOWN ).perform();
        murat.cours450.click();
        ReusableMethods.bekle( 2 );
        murat.addToCart450.click();
        murat.shoppingCart.click();
        ReusableMethods.bekle( 2 );
        murat.removeButton250.click();
        ReusableMethods.bekle( 1 );
        softAssert.assertFalse(murat.cours450.isDisplayed());
        softAssert.assertAll();
    }

    @Test
    public void Test_09_02_03_04() {
        /* TC_09_02
        1.Anasayfaya gidilir
        2.Anasayfanin sag üst kösesindeki alisveris sepetine tiklanir
        3.Apply coupon kutucuguna gecerli indirim miktari yazilir
        4.""Apply"" butonuna basilir
        5. ""Apply"" butonuna basinca indirimin fiyata yansidigi test edilir"
        TC_09_03
        1.Anasayfaya gidilir
        2.Anasayfanin sag üst kösesindeki alisveris sepetine tiklanir
        3.Apply coupon kutucuguna gecersiz indirim miktari yazilir
        4.""Apply"" butonuna basilir
        5. ""Apply"" butonuna basinca indirimin fiyata yansidigi test edilir"
        TC_09_04
        1.Anasayfaya gidilir
        2.Anasayfanin sag üst kösesindeki alisveris sepetine tiklanir
        3.""Shopping cart"" sayfasinda ödeme yapmak icin ""checkout""  butonuna tiklanir
        4.""checkout"" tusuna basilinca ödeme sayfasina gidildigi dogrulanir   */

        Actions actions = new Actions( Driver.getDriver() );
        actions.moveToElement( murat.categoriesDropDown ).click( murat.catagoriesAll ).perform();
        ReusableMethods.bekle( 2 );
        actions.sendKeys( Keys.PAGE_DOWN )
        .sendKeys( Keys.PAGE_DOWN )
        .sendKeys( Keys.PAGE_DOWN )
        .sendKeys( Keys.PAGE_DOWN ).perform();
        murat.cours250.click();
        ReusableMethods.bekle( 2 );
        murat.addToCart250.click();
        ReusableMethods.bekle( 1 );
        murat.shoppingCart.click();
        murat.couponCode.sendKeys( "PERCENT50" );
        murat.applyButton.click();
        Assert.assertTrue( murat.couponCode50.isDisplayed() );
        ReusableMethods.bekle( 1 );
        murat.checkOut.click();
        Assert.assertTrue( murat.payment.isDisplayed() );
        ReusableMethods.bekle( 2 );
    }
        @AfterClass
    public void teardown(){
        ReusableMethods.bekle(3);
        Driver.closeDriver();

    }

}



