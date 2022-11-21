package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.QualityDemyPage_User;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_09 {
    QualityDemyPage_User murat=new QualityDemyPage_User ();
    @BeforeClass
    public void setUp(){
        Driver.getDriver().get( ConfigReader.getProperty("myUrl"  ) );
        murat.loginMethodu();
        //acceptCookies.click();
        //myQualityDemyPage.signUpButonu.click();
        //myQualityDemyPage.emailKutusu.sendKeys( ConfigReader.getProperty("myRichtigEmail"));
        //myQualityDemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("myRichtigPassword"));
        //myQualityDemyPage.loginButonu.click();
    }
    @Test
    public void TestSepet(){
        //WebElement dropdownWebelement= Driver.getDriver().findElement( By.xpath( "//span[@class='fw-500']" ) );
        //Select select= new Select(dropdownWebelement);
        //select.selectByIndex(1);
        //select.selectByVisibleText( "course" );
        //Anasayfanin sag üst kösesindeki alisveris sepetine tiklanir
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(murat.categoriesDropDown).click(murat.catagoriesAll).perform();
        ReusableMethods.bekle( 2 );
        actions.sendKeys( Keys.ARROW_DOWN )
                .sendKeys( Keys.ARROW_DOWN )
                .sendKeys( Keys.ARROW_DOWN )
                .sendKeys( Keys.ARROW_DOWN )
                .sendKeys( Keys.ARROW_DOWN )
                .sendKeys( Keys.ARROW_DOWN )
                .sendKeys( Keys.ARROW_DOWN )
                .sendKeys( Keys.ARROW_DOWN )
                .sendKeys( Keys.ARROW_DOWN )
                .sendKeys( Keys.ARROW_DOWN )
                .sendKeys( Keys.ARROW_DOWN )
                .sendKeys( Keys.ARROW_DOWN )
                .sendKeys( Keys.ARROW_DOWN )
                .sendKeys( Keys.ARROW_DOWN )
                .sendKeys( Keys.ARROW_DOWN ).perform();
        murat.cours150.click();
        ReusableMethods.bekle( 1 );
        murat.addToCar150.click();
        ReusableMethods.bekle( 1 );
        murat.sepet.click();
        murat.couponCode.sendKeys( "PERCENT50" );
        murat.applyButton.click();
        Assert.assertTrue(murat.couponCode50.isDisplayed());
        ReusableMethods.bekle( 1 );
        murat.checkout.click();
        Assert.assertTrue( murat.payment.isDisplayed() );
        ReusableMethods.bekle( 1 );


        //Driver.getDriver().navigate().back();
        //murat.shoppingCart.click();
        //murat.checkout.click();
        //Assert.assertTrue(murat.paymentLinki.isEnabled());
    }
    @Test
    public void TestSepet1() {
        Driver.getDriver().get("https://qualitydemy.com/home/shopping_cart");
        }
    @AfterClass
    public void teardown(){
        ReusableMethods.bekle(5);
        //Driver.closeDriver();
              /*  1.Anasayfaya gidilir
2.Anasayfanin sag üst kösesindeki alisveris sepetine tiklanir
3.""Shopping cart"" sayfasindaki secili olan kurslardan birindeki ""Remove""  butonuna tiklanir
4.""Remove""butonuna basilan kursun sayfadan silindigi test edilir"
"1.Anasayfaya gidilir
2.Anasayfanin sag üst kösesindeki alisveris sepetine tiklanir
3.Apply coupon kutucuguna gecerli indirim miktari yazilir
4.""Apply"" butonuna basilir
5. ""Apply"" butonuna basinca indirimin fiyata yansidigi test edilir"
"1.Anasayfaya gidilir
2.Anasayfanin sag üst kösesindeki alisveris sepetine tiklanir
3.Apply coupon kutucuguna gecersiz indirim miktari yazilir
4.""Apply"" butonuna basilir
5. ""Apply"" butonuna basinca indirimin fiyata yansidigi test edilir"
"1.Anasayfaya gidilir
2.Anasayfanin sag üst kösesindeki alisveris sepetine tiklanir
3.""Shopping cart"" sayfasinda ödeme yapmak icin ""checkout""  butonuna tiklanir
4.""checkout"" tusuna basilinca ödeme sayfasina gidildigi dogrulanir   */

    }

}



