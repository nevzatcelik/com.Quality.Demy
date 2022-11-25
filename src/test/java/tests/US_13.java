package tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualityDemyPage_Instructor;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_13 {

  QualityDemyPage_Instructor qualityDemyPageInstructor = new QualityDemyPage_Instructor();

  @Test
  public void TC1301() throws InterruptedException {
    //Launch browser
    //Go to QualityDemy home page
    Driver.getDriver().get(ConfigReader.getProperty("myUrl"));

    //Enter a valid username and password and login
    qualityDemyPageInstructor.loginLink.click();
    qualityDemyPageInstructor.emailBox.sendKeys(ConfigReader.getProperty("ZeynepValidInsEmail"));
    qualityDemyPageInstructor.passwordBox.sendKeys((ConfigReader.getProperty("ZeynepValidInsPassword")));
    ReusableMethods.bekle(2);
    qualityDemyPageInstructor.acceptCookies.click();
    ReusableMethods.bekle(2);
    qualityDemyPageInstructor.loginButton.click();
    ReusableMethods.bekle(7);

    //Select dropdown titles under categories tab
    Actions actions = new Actions(Driver.getDriver());
    actions.moveToElement(qualityDemyPageInstructor.categories).perform();
    Thread.sleep(3000);

    qualityDemyPageInstructor.categoriesWebDesign.click();
    actions.moveToElement(qualityDemyPageInstructor.categories).perform();
    ReusableMethods.bekle(2);
    Assert.assertTrue(qualityDemyPageInstructor.webDesignPage.isDisplayed());

    qualityDemyPageInstructor.categoriesEnglish.click();
    actions.moveToElement(qualityDemyPageInstructor.categories).perform();
    ReusableMethods.bekle(2);
    Assert.assertTrue(qualityDemyPageInstructor.englishCoursePage.isDisplayed());

    qualityDemyPageInstructor.categoriesIt.click();
    actions.moveToElement(qualityDemyPageInstructor.categories).perform();
    ReusableMethods.bekle(2);
    Assert.assertTrue(qualityDemyPageInstructor.itCoursePage.isDisplayed());

    qualityDemyPageInstructor.categoriesMusic.click();
    actions.moveToElement(qualityDemyPageInstructor.categories).perform();
    ReusableMethods.bekle(2);
    Assert.assertTrue(qualityDemyPageInstructor.musicCoursePage.isDisplayed());

    qualityDemyPageInstructor.categoriesPersonelDevelopments.click();
    actions.moveToElement(qualityDemyPageInstructor.categories).perform();
    ReusableMethods.bekle(2);
    Assert.assertTrue(qualityDemyPageInstructor.personelDevelopmentPage.isDisplayed());

    qualityDemyPageInstructor.categoriesAllCourses.click();
    actions.moveToElement(qualityDemyPageInstructor.categories).perform();
    ReusableMethods.bekle(2);
    Assert.assertTrue(qualityDemyPageInstructor.allCoursesPage.isDisplayed());

    ReusableMethods.bekle(5);
    Driver.closeDriver();
  }

  @Test
  public void TC1302() throws InterruptedException {
    //Launch browser
    //Go to QualityDemy home page
    Driver.getDriver().get(ConfigReader.getProperty("myUrl"));

    //Enter a valid username and password and login
    QualityDemyPage_Instructor qualityDemyPageInstructor = new QualityDemyPage_Instructor();
    qualityDemyPageInstructor.loginLink.click();
    qualityDemyPageInstructor.emailBox.sendKeys(ConfigReader.getProperty("ZeynepValidInsEmail"));
    qualityDemyPageInstructor.passwordBox.sendKeys((ConfigReader.getProperty("ZeynepValidInsPassword")));
    ReusableMethods.bekle(2);
    qualityDemyPageInstructor.acceptCookies.click();
    ReusableMethods.bekle(2);
    qualityDemyPageInstructor.loginButton.click();
    ReusableMethods.bekle(10);

    //Select my messages from the drop-down menu under the user box icon
    Actions actions=new Actions(Driver.getDriver());
    actions.moveToElement(qualityDemyPageInstructor.userBoxIcon).perform();
    Thread.sleep(3000);
    qualityDemyPageInstructor.myMessages.click();

    //Type something in the message box and test its accessibility
    qualityDemyPageInstructor.messageArea.sendKeys("Hi");
    String expectedMessage="Hi";
    String actualMessage=qualityDemyPageInstructor.messageArea.getAttribute("value");
    Assert.assertTrue(actualMessage.equals(expectedMessage));

    ReusableMethods.bekle(5);
    Driver.closeDriver();
  }
  @Test
  public void TC1303() throws InterruptedException {
    //Launch browser
    //Go to QualityDemy home page
    Driver.getDriver().get(ConfigReader.getProperty("myUrl"));

    //Enter a valid username and password and login
    QualityDemyPage_Instructor qualityDemyPageInstructor = new QualityDemyPage_Instructor();
    qualityDemyPageInstructor.loginLink.click();
    qualityDemyPageInstructor.emailBox.sendKeys(ConfigReader.getProperty("ZeynepValidInsEmail"));
    qualityDemyPageInstructor.passwordBox.sendKeys((ConfigReader.getProperty("ZeynepValidInsPassword")));
    ReusableMethods.bekle(2);
    qualityDemyPageInstructor.acceptCookies.click();
    ReusableMethods.bekle(2);
    qualityDemyPageInstructor.loginButton.click();
    ReusableMethods.bekle(7);

    //Select my messages from the drop-down menu under the user box icon
    Actions actions=new Actions(Driver.getDriver());
    actions.moveToElement(qualityDemyPageInstructor.userBoxIcon).perform();
    Thread.sleep(3000);
    qualityDemyPageInstructor.myMessages.click();

    //Write a message in the message box and press send
    qualityDemyPageInstructor.messageArea.sendKeys("Sunny");
    qualityDemyPageInstructor.messageSendButton.click();
    Assert.assertTrue(qualityDemyPageInstructor.toastMessage.isDisplayed());

    ReusableMethods.bekle(5);
    Driver.closeDriver();
  }
  @Test
  public void TC1304() throws InterruptedException {

    //Launch browser
    //Go to QualityDemy home page
    Driver.getDriver().get(ConfigReader.getProperty("myUrl"));

    //Enter a valid username and password and login
    QualityDemyPage_Instructor qualityDemyPageInstructor = new QualityDemyPage_Instructor();

    qualityDemyPageInstructor.loginLink.click();
    qualityDemyPageInstructor.emailBox.sendKeys(ConfigReader.getProperty("ZeynepValidInsEmail"));
    qualityDemyPageInstructor.passwordBox.sendKeys((ConfigReader.getProperty("ZeynepValidInsPassword")));
    ReusableMethods.bekle(2);
    qualityDemyPageInstructor.acceptCookies.click();
    ReusableMethods.bekle(2);
    qualityDemyPageInstructor.loginButton.click();
    ReusableMethods.bekle(10);

    //Select my messages from the drop-down menu under the user box icon
    Actions actions=new Actions(Driver.getDriver());
    actions.moveToElement(qualityDemyPageInstructor.userBoxIcon).perform();
    Thread.sleep(3000);
    qualityDemyPageInstructor.myMessages.click();

    //Click cancel button and test new message tab is cancelled
    qualityDemyPageInstructor.messageCancelButton.click();
    Assert.assertTrue(!qualityDemyPageInstructor.messageArea.isDisplayed());

    ReusableMethods.bekle(5);
    Driver.closeDriver();
  }

  @Test
  public void TC1305() throws InterruptedException {
    //Launch browser
    //Go to QualityDemy home page
    Driver.getDriver().get(ConfigReader.getProperty("myUrl"));

    //Enter a valid username and password and login
    QualityDemyPage_Instructor qualityDemyPageInstructor = new QualityDemyPage_Instructor();

    qualityDemyPageInstructor.loginLink.click();
    qualityDemyPageInstructor.emailBox.sendKeys(ConfigReader.getProperty("ZeynepValidInsEmail"));
    qualityDemyPageInstructor.passwordBox.sendKeys((ConfigReader.getProperty("ZeynepValidInsPassword")));
    ReusableMethods.bekle(2);
    qualityDemyPageInstructor.acceptCookies.click();
    ReusableMethods.bekle(2);
    qualityDemyPageInstructor.loginButton.click();
    ReusableMethods.bekle(10);

    //Select my messages from the drop-down menu under the user box icon
    Actions actions=new Actions(Driver.getDriver());
    actions.moveToElement(qualityDemyPageInstructor.userBoxIcon).perform();
    Thread.sleep(3000);
    qualityDemyPageInstructor.myMessages.click();

    //Click the cancel button on the page that opens.
    qualityDemyPageInstructor.messageCancelButton.click();
    ReusableMethods.bekle(3);

    //Click the compose button and test that the message box appears
    qualityDemyPageInstructor.messageComposeButton.click();
    Assert.assertTrue(qualityDemyPageInstructor.newMessageSection.isDisplayed());

    ReusableMethods.bekle(5);
    Driver.closeDriver();
  }

  @Test
  public void TC1306() throws InterruptedException {
    //Launch browser
    //Go to QualityDemy home page
    Driver.getDriver().get(ConfigReader.getProperty("myUrl"));

    //Enter a valid username and password and login
    QualityDemyPage_Instructor qualityDemyPageInstructor = new QualityDemyPage_Instructor();
    qualityDemyPageInstructor.loginLink.click();
    qualityDemyPageInstructor.emailBox.sendKeys(ConfigReader.getProperty("ZeynepValidInsEmail"));
    qualityDemyPageInstructor.passwordBox.sendKeys((ConfigReader.getProperty("ZeynepValidInsPassword")));
    ReusableMethods.bekle(2);
    qualityDemyPageInstructor.acceptCookies.click();
    ReusableMethods.bekle(2);
    qualityDemyPageInstructor.loginButton.click();
    ReusableMethods.bekle(10);

    //Select my messages from the drop-down menu under the user box icon
    Actions actions=new Actions(Driver.getDriver());
    actions.moveToElement(qualityDemyPageInstructor.userBoxIcon).perform();
    Thread.sleep(3000);
    qualityDemyPageInstructor.myMessages.click();

    //Click on the correspondence and test that the message contents are seen
    qualityDemyPageInstructor.correspondence.click();
    Assert.assertTrue(qualityDemyPageInstructor.messageContent.isDisplayed());

    ReusableMethods.bekle(5);
    Driver.closeDriver();

  }
  }


