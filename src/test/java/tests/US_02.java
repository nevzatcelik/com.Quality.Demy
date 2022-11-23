package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualityDemyPage_User;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_02 {

    /*
    -As a user I should be able to see the various titles when I enter the homepage.

    1) Logo,Categories,Log in, Sign Up,shopping cart icon,Search icon,Search button,
    10 Online courses text, Expert instruction text, Lifetime access text,
    Top categories text,Top courses text, Top 10 Latest courses text,
    Featured instructor text ,Get started button,Join now button,
    facebook icon, Twitter icon, should be visible.

     */

    @Test
    public void locationTest1(){
        // Enter the web page
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));

        //Logo is visible
        QualityDemyPage_User qualityDemyPage_user= new QualityDemyPage_User();
        Assert.assertTrue(qualityDemyPage_user.logo.isDisplayed());

        // login is visible
        Assert.assertTrue(qualityDemyPage_user.loginLink.isDisplayed());

        //Categories is visible
        Assert.assertTrue(qualityDemyPage_user.categories.isDisplayed());

        //Sign up is visible
        Assert.assertTrue(qualityDemyPage_user.signUpLink.isDisplayed());

        //shopping cart icon is visible
        Assert.assertTrue(qualityDemyPage_user.shoppingCartIcon.isDisplayed());

        //Search icon is visible
        Assert.assertTrue(qualityDemyPage_user.searchIcon.isDisplayed());

        //Search button is visible
        Assert.assertTrue(qualityDemyPage_user.searchButton.isDisplayed());

        //57 Online courses text is visible
        Assert.assertTrue(qualityDemyPage_user.onlineCoursesText.isDisplayed());

        //Expert instruction text is visible
        Assert.assertTrue(qualityDemyPage_user.expertInstructionText.isDisplayed());

        //Lifetime access text is visible
        Assert.assertTrue(qualityDemyPage_user.lifetimeAccessText.isDisplayed());

        //Top categories text is visible
        Assert.assertTrue(qualityDemyPage_user.topCategoriesText.isDisplayed());

        //Top courses text is visible
        Assert.assertTrue(qualityDemyPage_user.topCoursesText.isDisplayed());

        //Top 10 Latest courses text is visible
        Assert.assertTrue(qualityDemyPage_user.top10LatestCoursesText.isDisplayed());

        //Featured instructor text is visible
        Assert.assertTrue(qualityDemyPage_user.featuredInstructorText.isDisplayed());

        //Get started button is visible
        Assert.assertTrue(qualityDemyPage_user.getStartedButton.isDisplayed());

        //Join now button is visible
        Assert.assertTrue(qualityDemyPage_user.joinNowButton.isDisplayed());

        //facebook icon is visible
        Assert.assertTrue(qualityDemyPage_user.facebookIcon.isDisplayed());

        //twitter icon os visible
        Assert.assertTrue(qualityDemyPage_user.twitterIcon.isDisplayed());

        ReusableMethods.bekle(5);
        Driver.closeDriver();
    }

    @Test
    public void locationTest2(){
        // Enter the web page
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));

        QualityDemyPage_User qualityDemyPage_user=new QualityDemyPage_User();
        qualityDemyPage_user.acceptCookies.click();

        //About Us, Login, HTML5AndCSS, Piano, AWS Certification  headings should be clickable

        //Login is clickable
        qualityDemyPage_user.loginLink.click();
        //To be sure for clickable, we can search if login redirects to emailKutusu in the next page.
        Assert.assertTrue(qualityDemyPage_user.emailBox.isDisplayed());


        //About Us is clickable.
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();

        ReusableMethods.bekle(5);
        qualityDemyPage_user.aboutUs.click();
        //To be sure clickable, we can search if login redirects the next page.
        Assert.assertTrue(qualityDemyPage_user.courseListArea.isDisplayed());
        Driver.getDriver().navigate().back();

        qualityDemyPage_user.hTML5AndCSS.click();
        //After clicking, in the second page "HTML5 And CSS"
        // heading can be seen to be sure redirect the new page.
        Assert.assertTrue(qualityDemyPage_user.hTML5AndCSSHeading.isDisplayed());
        Driver.getDriver().navigate().back();

        qualityDemyPage_user.piano.click();
        //After clicking, in the second page "Learn Piano Iin Weeks not years"
        //subtitle can be seen to be sure redirect the new page.
        Assert.assertTrue(qualityDemyPage_user.learnPianoInWeeksNotYearsHeading.isDisplayed());
        Driver.getDriver().navigate().back();

        qualityDemyPage_user.aWSCertification.click();
        //After clicking, in the second page "AWS Certification"
        // heading can be seen to be sure redirect the new page.
        Assert.assertTrue(qualityDemyPage_user.aWSCertificationHeading.isDisplayed());


        Driver.closeDriver();


    }

}
