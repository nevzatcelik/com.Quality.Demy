package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.QualityDemyPage_Instructor;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

public class US_21 {


    public US_21() {

        // Launch browser.
        // Go to url https://qualitydemy.com page
        Driver.getDriver().get(ConfigReader.getProperty("qualityUrl"));

        // Login is done by entering a valid Instructor username and password, Go to the page titled 'Update: Java'.
        qualityDemyPageInstructor.loginMethodLejon();

    }

    QualityDemyPage_Instructor qualityDemyPageInstructor = new QualityDemyPage_Instructor();

    @Test(priority = 1)
    public void lejonTC2101_Curriculum() {

        // Login is done by entering a valid Instructor username and password.

        // After pressing the Login button, a message about successful login should appear
        // in a green box in the upper right corner of the screen.

        // Click on the button titled 'Instructor' next to the search box.

        // Click on the 'Course Manager' title.

        // In the COURSE LIST box at the bottom of the Courses screen,
        // click the Three Dots Icon at the top under the Actions heading at the end of the Sections row boxes.

        // Click Edit This course from the options that appear in the mini-window box that opens.


        // On the page titled 'Update: Java' that appears, the Add Section button that appears on the screen is clicked.
        qualityDemyPageInstructor.addSectionButton.click();

        // On the screen that opens, "Java Course Repeat with Java OCA (Oracle EXAM) Questions:
        // First 22 Lesson" is written in the Title Text Box.
        qualityDemyPageInstructor.addNewSectionBox.sendKeys(ConfigReader.getProperty("addNewSectionBoxText"));

        // Click the Submit button.
        qualityDemyPageInstructor.addNewSectionsubmitButton.click();

        // Check that the message indicating that the New Section has been
        // successfully added appears in the upper right corner of the screen.
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(qualityDemyPageInstructor.sectionHasBeenSuccesMessage.
                isDisplayed(), "The Section has been added successfully message does not appear on the screen");

        // Then check that the new section has been added on the screen that opens.
        System.out.println(qualityDemyPageInstructor.newlyAddedSection.isDisplayed());
        softAssert.assertTrue(qualityDemyPageInstructor.newlyAddedSection.isDisplayed(),
                "The newly added section does not appear on the screen that opens.");

        ReusableMethods.bekle(2);
        softAssert.assertAll();

    }

    @Test(priority = 2)
    public void lejonTC2102_Curriculum() {


        SoftAssert softAssert = new SoftAssert();

        // On the page titled 'Update: Java' that appears, the Add Section button that appears on the screen is clicked.
        qualityDemyPageInstructor.addSectionButton.click();
        ReusableMethods.bekle(1);

        // Clicking the Close button and the opened screen is closed.
        qualityDemyPageInstructor.addNewSectoinCloseButton.click();
        ReusableMethods.bekle(1);

        // It is checked that the window titled Add new section is not visible on the screen.
        System.out.println(qualityDemyPageInstructor.addNewSectoinWindow.isDisplayed());

        softAssert.assertFalse(qualityDemyPageInstructor.addNewSectoinWindow.isDisplayed(),
                "The window titled Add new section does not appear on the screen");


        ReusableMethods.bekle(3);
        softAssert.assertAll();


    }


    @Test(priority = 3)
    public void lejonTC2103_Curriculum() {


        // On the page titled 'Update: Java' that appears, the Add Lesson button that appears on the screen is clicked.
        qualityDemyPageInstructor.addLessonButton.click();

        // Click once on all Video Types on the screen that opens.

        qualityDemyPageInstructor.selectLessonTypeVimeo.click();

        qualityDemyPageInstructor.selectLessonTypeVideofile.click();

        qualityDemyPageInstructor.selectLessonTypeVideourl.click();

        qualityDemyPageInstructor.selectLessonTypeGoogleVideo.click();

        qualityDemyPageInstructor.selectLessonTypeDocument.click();

        qualityDemyPageInstructor.selectLessonTypeText.click();

        qualityDemyPageInstructor.selectLessonTypeImage.click();

        qualityDemyPageInstructor.selectLessonTypeIframe.click();

        // Video Type is selected. Then, under the title of Select lesson type
        // it is checked that the 'Youtube Video' type is selected.
        Actions actions = new Actions(Driver.getDriver());
        actions.click(qualityDemyPageInstructor.selectLessonTypeYoutube).perform();

        SoftAssert softAssert = new SoftAssert();
        System.out.println(qualityDemyPageInstructor.selectLessonTypeYoutube.isSelected());
        softAssert.assertTrue(qualityDemyPageInstructor.selectLessonTypeYoutube.isSelected());

        actions.moveToElement(qualityDemyPageInstructor.newLessonCloseButton).perform();
        ReusableMethods.waitForClickablility(qualityDemyPageInstructor.newLessonCloseButton, 2).click();


        ReusableMethods.bekle(1);
        softAssert.assertAll();


    }


    @Test(priority = 4)
    public void lejonTC2104_Curriculum() {

        // Click the Add Lesson button.
        qualityDemyPageInstructor.addLessonButton.click();

        // The screen is Closed with the Close button on the screen that opens.
        Actions actions = new Actions(Driver.getDriver());
        actions.click(qualityDemyPageInstructor.selectLessonTypeYoutube).perform();
        actions.moveToElement(qualityDemyPageInstructor.newLessonCloseButton).click().perform();

        // It is checked that the window titled Add new lesson is not visible on the screen.
        SoftAssert softAssert = new SoftAssert();

        ReusableMethods.waitForVisibility(qualityDemyPageInstructor.updateJavaWindow, 3);
        System.out.println(qualityDemyPageInstructor.addNewLessonWindow.isDisplayed());

        softAssert.assertFalse(qualityDemyPageInstructor.addNewLessonWindow.isDisplayed(),
                "The window titled Add new lesson appears on the screen.");

        softAssert.assertAll();


    }

    @Test(priority = 5)
    public void lejonTC2105_Curriculum() {

        // On the page titled 'Update: Java' that appears, the Add Lesson button that appears on the screen is clicked.
        // Select the video type from the Add new lesson window.
        // Then click the Next button and the explanation screen about the video opens.

        qualityDemyPageInstructor.addLessonMethodLejon();

        // Then, on the screen that opens, it is seen that there is the text "Lesson type : Youtube Video. Change".
        String expectedTitle = "Lesson type : Youtube Video. Change";
        String actualTitle = qualityDemyPageInstructor.lessonTypeSelectedText.getText();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(actualTitle.equals(expectedTitle));
        softAssert.assertTrue(qualityDemyPageInstructor.lessonTypeSelectedText.isDisplayed());

        ReusableMethods.bekle(2);
        softAssert.assertAll();

    }


    @Test(priority = 6, dependsOnMethods = "lejonTC2105_Curriculum")
    public void lejonTC2106_Curriculum() {


        // The title "OCA Question 12 For Loop" is sent to the Title Text box on the description screen.
        qualityDemyPageInstructor.addnewLessonTextBox.sendKeys("OCA Question 12 For Loop");


    }



    @Test(priority = 7, dependsOnMethods = "lejonTC2105_Curriculum")
    public void lejonTC2107_Curriculum() {

        // On the page titled 'Update: Java' that appears, the Add Lesson button that appears on the screen is clicked.
        // Select the video type from the Add new lesson window.
        // Then click the Next button and the explanation screen about the video opens.
        // qualityDemyPage.addLessonMethod();


        // The title "OCA Question 12 For Loop" is sent to the Title Text box on the description screen.
        qualityDemyPageInstructor.addnewLessonTextBox.sendKeys("OCA Question 12 For Loop");

        // The desired "Java Course Repeat with Java OCA (Oracle EXAM) Questions: First 22 Lesson"
        // section is selected from the Section drop-down box on the description screen.

        WebElement addnewLessonSectionBox = Driver.getDriver().
                findElement(By.xpath("//select[@name=\"section_id\"]"));

        Select select = new Select(addnewLessonSectionBox);
        select.selectByVisibleText("Java Course Repeat with Java OCA (Oracle EXAM) Questions: First 22 Lesson");



    }



    @Test(priority = 8, dependsOnMethods = "lejonTC2105_Curriculum")
    public void lejonTC2108_Curriculum() {

        // On the page titled 'Update: Java' that appears, the Add Lesson button that appears on the screen is clicked.
        // Select the video type from the Add new lesson window.
        // Then click the Next button and the explanation screen about the video opens.
        // qualityDemyPage.addLessonMethod();


        // The title "OCA Question 12 For Loop" is sent to the Title Text box on the description screen.
        qualityDemyPageInstructor.addnewLessonTextBox.sendKeys("OCA Question 12 For Loop");

        // The desired "Java Course Repeat with Java OCA (Oracle EXAM) Questions: First 22 Lesson"
        // section is selected from the Section drop-down box on the description screen.

        WebElement addnewLessonSectionBox = Driver.getDriver().
                findElement(By.xpath("//select[@name=\"section_id\"]"));

        Select select = new Select(addnewLessonSectionBox);
        select.selectByVisibleText("Java Course Repeat with Java OCA (Oracle EXAM) Questions: First 22 Lesson");

        // The URL "https://youtu.be/BCYRHsmPA6o" is sent to the Video URL section on the description screen.
        qualityDemyPageInstructor.addnewLessonVideoURLBox.sendKeys(ConfigReader.getProperty("addLessonValidVideoUrl"));



    }



    @Test(priority = 9, dependsOnMethods = "lejonTC2105_Curriculum")
    public void lejonTC2109_Curriculum() {

        // On the page titled 'Update: Java' that appears, the Add Lesson button that appears on the screen is clicked.
        // Select the video type from the Add new lesson window.
        // Then click the Next button and the explanation screen about the video opens.
        // qualityDemyPage.addLessonMethod();


        // The title "OCA Question 12 For Loop" is sent to the Title Text box on the description screen.
        qualityDemyPageInstructor.addnewLessonTextBox.sendKeys("OCA Question 12 For Loop");

        // The desired "Java Course Repeat with Java OCA (Oracle EXAM) Questions: First 22 Lesson"
        // section is selected from the Section drop-down box on the description screen.

        WebElement addnewLessonSectionBox = Driver.getDriver().
                findElement(By.xpath("//select[@name=\"section_id\"]"));
        Select select = new Select(addnewLessonSectionBox);
        select.selectByVisibleText("Java Course Repeat with Java OCA (Oracle EXAM) Questions: First 22 Lesson");


        // The URL "https://youtu.be/BCYRHsmPA6o" is sent to the Video URL section on the description screen.
        qualityDemyPageInstructor.addnewLessonVideoURLBox.sendKeys(ConfigReader.getProperty("addLessonValidVideoUrl"));


        // Click on Duration title box
        List<WebElement> elementsExpected = Driver.getDriver().findElements(By.xpath("//input[@name='duration']"));
        ReusableMethods.webElementScreenShot(elementsExpected.get(0));
        String expectedDurationText = elementsExpected.get(0).getAttribute("value");

        qualityDemyPageInstructor.addnewLessonDurationBox.click();
        ReusableMethods.bekle(1);
        List<WebElement> elementsActual = Driver.getDriver().findElements(By.xpath("//input[@name='duration']"));

        ReusableMethods.webElementScreenShot(elementsActual.get(0));
        String actualDurationText = elementsActual.get(0).getAttribute("value");
        System.out.println(actualDurationText);

        // Video time in the system is captured automatically, In the text box under the duration heading, it is checked
        // that the video duration is automatically displayed on the screen.(Capture screen element target.)
        ReusableMethods.webElementScreenShot(qualityDemyPageInstructor.addnewLessonDurationBox);

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertNotEquals(actualDurationText, expectedDurationText);

        softAssert.assertAll();


    }



    @Test(priority = 10, dependsOnMethods = "lejonTC2105_Curriculum")
    public void lejonTC2110_Curriculum() {

        // On the page titled 'Update: Java' that appears, the Add Lesson button that appears on the screen is clicked.
        // Select the video type from the Add new lesson window.
        // Then click the Next button and the explanation screen about the video opens.


        // Submit "https://youtube/YHnjGFSE" Url as invalid Url in Video Url text box on description screen.
        qualityDemyPageInstructor.addnewLessonVideoURLBox.sendKeys(ConfigReader.getProperty("addLessonInvalidVideoUrl"));

        // Check that a alert text appears under the Video Url text box.
        qualityDemyPageInstructor.addnewLessonDurationBox.click();

        SoftAssert softAssert = new SoftAssert();
        System.out.println(qualityDemyPageInstructor.addnewInvalidVideoURLText.isDisplayed());
        softAssert.assertTrue(qualityDemyPageInstructor.addnewInvalidVideoURLText.isDisplayed(),
                "No alert under Textbox when an invalid Url is entered.");

        // Clear the Video Url box.
        qualityDemyPageInstructor.addnewLessonVideoURLBox.clear();


        softAssert.assertAll();

    }



    @Test(priority = 11, dependsOnMethods = "lejonTC2105_Curriculum")
    public void lejonTC2111_Curriculum() {

        // On the page titled 'Update: Java' that appears, the Add Lesson button that appears on the screen is clicked.
        // Select the video type from the Add new lesson window.
        // Then click the Next button and the explanation screen about the video opens.
        // qualityDemyPage.addLessonMethod();

        // The URL "https://youtu.be/BCYRHsmPA6o" is sent to the Video URL section on the description screen.
        qualityDemyPageInstructor.addnewLessonVideoURLBox.sendKeys(ConfigReader.getProperty("addLessonValidVideoUrl"));

        // A sufficiently long text is written in the Summary text box.
        JavascriptExecutor javaScript = (JavascriptExecutor) Driver.getDriver();
        javaScript.executeScript("arguments[0].scrollIntoView();", qualityDemyPageInstructor.addnewLessonSummaryBox);

        qualityDemyPageInstructor.addnewLessonSummaryBox.sendKeys(ConfigReader.getProperty("summaryBoxText"));


    }



    @Test(priority = 12, dependsOnMethods = "lejonTC2105_Curriculum")
    public void lejonTC2112_Curriculum() {

        // On the page titled 'Update: Java' that appears, the Add Lesson button that appears on the screen is clicked.
        // Select the video type from the Add new lesson window.
        // Then click the Next button and the explanation screen about the video opens.
        // qualityDemyPage.addLessonMethod();


        // Click the Mark as Free Lesson checkbox on the Description screen.
        // Check that the Mark As Free Course checkbox is selected.
        JavascriptExecutor javaScript = (JavascriptExecutor) Driver.getDriver();
        javaScript.executeScript("arguments[0].scrollIntoView();", qualityDemyPageInstructor.markFreeLessonCheckBox);

        SoftAssert softAssert = new SoftAssert();

        if (!qualityDemyPageInstructor.markFreeLessonCheckBox.isSelected()) {

            qualityDemyPageInstructor.markFreeLessonCheckBox.click();
            softAssert.assertTrue(qualityDemyPageInstructor.markFreeLessonCheckBox.isSelected(),
                    "The Mark as Free Course checkbox is not selected");
            System.out.println(qualityDemyPageInstructor.markFreeLessonCheckBox.isSelected());

        } else {

            softAssert.assertFalse(qualityDemyPageInstructor.markFreeLessonCheckBox.isSelected(),
                    "The Mark as Free Course checkbox is selected");
            System.out.println(qualityDemyPageInstructor.markFreeLessonCheckBox.isSelected());
        }

        softAssert.assertAll();

        // The screen is Closed with the Close button on the screen that opens.
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(qualityDemyPageInstructor.newLessonCloseButton);
        ReusableMethods.waitForClickablility(qualityDemyPageInstructor.newLessonCloseButton, 2).click();

        ReusableMethods.bekle(2);


    }



    @Test(priority = 13)
    public void lejonTC2113_Curriculum() {

        // On the page titled 'Update: Java' that appears, the Add Section button that appears on the screen is clicked.
        ReusableMethods.waitForVisibility(qualityDemyPageInstructor.addSectionButton, 3).click();

        // On the screen that opens, "Java Course Repeat with Java OCA (Oracle EXAM) Questions:
        // First 22 Lesson" is written in the Title Text Box.
        qualityDemyPageInstructor.addNewSectionBox.sendKeys(ConfigReader.getProperty("addNewSectionBoxText"));

        // Click the Submit button.
        qualityDemyPageInstructor.addNewSectionsubmitButton.click();

        // Then check that the new section has been added on the screen that opens.
        SoftAssert softAssert = new SoftAssert();
        System.out.println(qualityDemyPageInstructor.newlyAddedSection.isDisplayed());
        softAssert.assertTrue(qualityDemyPageInstructor.newlyAddedSection.isDisplayed(),
                "The newly added section does not appear on the screen that opens");

        ReusableMethods.bekle(2);

        // On the page titled 'Update: Java' that appears, the Add Lesson button that appears on the screen is clicked.
        // Select the video type from the Add new lesson window.
        // Then click the Next button and the explanation screen about the video opens.
        qualityDemyPageInstructor.addLessonMethodLejon();


        // The title "OCA Question 12 For Loop" is sent to the Title Text box on the description screen.
        qualityDemyPageInstructor.addnewLessonTextBox.sendKeys("OCA Question 12 For Loop");

        // The desired "Java Course Repeat with Java OCA (Oracle EXAM) Questions: First 22 Lesson"
        // section is selected from the Section drop-down box on the description screen.
        WebElement addnewLessonSectionBox = Driver.getDriver().findElement(By.xpath("//select[@name=\"section_id\"]"));
        Select select = new Select(addnewLessonSectionBox);
        select.selectByVisibleText("Java Course Repeat with Java OCA (Oracle EXAM) Questions: First 22 Lesson");

        // The URL "https://youtu.be/BCYRHsmPA6o" is sent to the Video URL section on the description screen.
        qualityDemyPageInstructor.addnewLessonVideoURLBox.sendKeys(ConfigReader.getProperty("addLessonValidVideoUrl"));

        // Click on Duration title box
        qualityDemyPageInstructor.addnewLessonDurationBox.click();

        // Video time in the system is captured automatically, In the text box under the duration heading, it is checked
        // that the video duration is automatically displayed on the screen.(Capture screen element target.)
        ReusableMethods.bekle(3);
        ReusableMethods.webElementScreenShot(qualityDemyPageInstructor.addnewLessonDurationBox);

        // A sufficiently long text is written in the Summary text box.
        JavascriptExecutor javaScript = (JavascriptExecutor) Driver.getDriver();
        javaScript.executeScript("arguments[0].scrollIntoView();", qualityDemyPageInstructor.addnewLessonSummaryBox);

        qualityDemyPageInstructor.addnewLessonSummaryBox.sendKeys(ConfigReader.getProperty("summaryBoxText"));

        // Click the Mark as Free Lesson checkbox on the Description screen.
        // Check that the Mark As Free Course checkbox is selected.

        if (!qualityDemyPageInstructor.markFreeLessonCheckBox.isSelected()) {

            qualityDemyPageInstructor.markFreeLessonCheckBox.click();
            softAssert.assertTrue(qualityDemyPageInstructor.markFreeLessonCheckBox.isSelected(), "The Mark as Free Course checkbox is not selected");
            System.out.println(qualityDemyPageInstructor.markFreeLessonCheckBox.isSelected());

        } else {

            softAssert.assertFalse(qualityDemyPageInstructor.markFreeLessonCheckBox.isSelected(), "The Mark as Free Course checkbox is selected");
            System.out.println(qualityDemyPageInstructor.markFreeLessonCheckBox.isSelected());
        }


        // After filling the relevant sections on the explanation screen, the Add Lesson button is clicked.
        qualityDemyPageInstructor.greenAddLessonButton.click();

        // Then, on the screen that opens, it is checked that the pup up box,where the lesson has been
        // successfully added to the relevant sections, is seen in the upper right corner of the screen.
        String lessonSuccessfulMessage= qualityDemyPageInstructor.lessonHasAddedSuccesMessage.getText();
        System.out.println(lessonSuccessfulMessage);
        softAssert.assertTrue(qualityDemyPageInstructor.lessonHasAddedSuccesMessage.isDisplayed(),"The Lesson has been added successfully message does not appear on the screen.");

        // The explanation window titled Add New Course closes and
        // it is checked that the Update:Java window appears on the screen.
        ReusableMethods.waitForVisibility(qualityDemyPageInstructor.updateJavaWindow, 3);
        System.out.println(qualityDemyPageInstructor.updateJavaWindow.isDisplayed());
        softAssert.assertTrue(qualityDemyPageInstructor.updateJavaWindow.isDisplayed(), "The window titled Add new lesson appears on the screen.");


        softAssert.assertAll();

    }



    @Test(priority = 14, dependsOnMethods = "lejonTC2105_Curriculum")
    public void lejonTC2114_Curriculum() {

        // Click the Add Lesson button.
        // Select the video type from the Add Lesson section.
        // Then click on the Next button and the description screen about the video opens.
        // qualityDemyPage.addLessonMethod();

        // Click the close button on the description screen.
        Actions actions = new Actions(Driver.getDriver());
        actions.click(qualityDemyPageInstructor.selectLessonTypeYoutube);
        actions.moveToElement(qualityDemyPageInstructor.newLessonCloseButton).click();

        // The explanation window titled Add New Course closes and
        // it is checked that the Update:Java window appears on the screen.
        SoftAssert softAssert = new SoftAssert();
        ReusableMethods.waitForVisibility(qualityDemyPageInstructor.updateJavaWindow, 3);
        System.out.println(qualityDemyPageInstructor.updateJavaWindow.isDisplayed());
        softAssert.assertTrue(qualityDemyPageInstructor.updateJavaWindow.isDisplayed(),
                "The window titled Add new lesson appears on the screen.");


        softAssert.assertAll();

    }



    @Test(priority = 15)
    public void lejonTC2115_Curriculum() {

        // Press the Sort Sections button.
        qualityDemyPageInstructor.sortSectionButton.click();

        // The newly added Section is held down with the right mouse button.
        // The section is moved to the top line by drag and drop method and the order between sections is changed.

        List<WebElement> sortSectionListBefore = Driver.getDriver().
                findElements(By.xpath("//div[@id=\"section-list\"]"));

        ArrayList<String> sortElementBeforeArr = new ArrayList<>();

        for (WebElement eachSortBefore : sortSectionListBefore) {

            String sortSectionsBefore = eachSortBefore.getText();
            sortElementBeforeArr.add(sortSectionsBefore);

        }

        ArrayList<String> sortListBefore = new ArrayList<>(sortElementBeforeArr);
        System.out.println(sortListBefore.get(0) + "\n");


        Actions actions= new Actions(Driver.getDriver());
        actions.dragAndDrop(qualityDemyPageInstructor.sortSectionDrag, qualityDemyPageInstructor.sortSectionDrop1).perform();
        ReusableMethods.bekle(1);



        // Check that the Sections sort has changed.
        List<WebElement> sortSectionListAfter = Driver.getDriver().
                findElements(By.xpath("//div[@id=\"section-list\"]"));

        ArrayList<String> sortElementAfterArr = new ArrayList<>();

        for (WebElement eachSortAfter : sortSectionListAfter) {

            String sortSectionsAfter = eachSortAfter.getText();
            sortElementAfterArr.add(sortSectionsAfter);

        }

        ArrayList<String> sortListAfter = new ArrayList<>(sortElementAfterArr);

        System.out.println(sortListAfter.get(0));

        Assert.assertNotEquals(sortListBefore.get(0),sortListAfter.get(0));

        qualityDemyPageInstructor.sortSectionCloseButton.click();



    }


    @Test(priority = 16)
    public void lejonTC2116_Curriculum() {

        // Press the Sort Sections button.
        qualityDemyPageInstructor.sortSectionButton.click();

        // The newly added Section is held down with the right mouse button.
        // The section is moved to the top line by drag and drop method and the order between sections is changed.

        List<WebElement> sortSectionListBefore = Driver.getDriver().
                findElements(By.xpath("(//div[@class=\"card mb-0 mt-2 draggable-item\"])"));

        ArrayList<String> sortElementBeforeArr = new ArrayList<>();

        for (WebElement eachSortBefore : sortSectionListBefore) {

            String sortSectionsBefore = eachSortBefore.getText();
            sortElementBeforeArr.add(sortSectionsBefore);

        }

        ArrayList<String> sortListActual = new ArrayList<>(sortElementBeforeArr);
        System.out.println(sortListActual.get(0));


        Actions actions= new Actions(Driver.getDriver());
        actions.dragAndDrop(qualityDemyPageInstructor.sortSectionDrag, qualityDemyPageInstructor.sortSectionDrop1).perform();
        ReusableMethods.bekle(1);


        // Check that the Sections sort has changed.
        List<WebElement> sortSectionListAfter = Driver.getDriver().
                findElements(By.xpath("(//div[@class=\"card mb-0 mt-2 draggable-item\"])"));

        ArrayList<String> sortElementAfterArr = new ArrayList<>();

        for (WebElement eachSortAfter : sortSectionListAfter) {

            String sortSectionsAfter = eachSortAfter.getText();
            sortElementAfterArr.add(sortSectionsAfter);

        }

        ArrayList<String> sortListExpected = new ArrayList<>(sortElementAfterArr);
        System.out.println(sortListExpected.get(0));

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertNotEquals(sortListActual.get(0),sortListExpected.get(0));
        // softAssert.assertNotEquals(sortListLessonActual.get(0), sortListLessonExpected.get(0));

        // The change made is saved by clicking the Update sort button.
        qualityDemyPageInstructor.updateSectionButton.click();


        // The successful completion of the update process is checked by the green pop-up message box
        // appearing in the upper right corner of the screen.
        ReusableMethods.waitForVisibility(qualityDemyPageInstructor.updateSectionSortedMessage, 1);

        softAssert.assertTrue(qualityDemyPageInstructor.updateSectionSortedMessage.isDisplayed());

        ReusableMethods.webElementScreenShot(qualityDemyPageInstructor.updateSectionSortedMessage);
        System.out.print(qualityDemyPageInstructor.updateSectionSortedMessage.getText());

        softAssert.assertAll();

    }


    @Test(priority = 17)
    public void lejonTC2117_Curriculum() {

        //  Move the mouse over the Section boxes that appear on the screen.
        //  Mouse waits over the corresponding Section boxes.
        JavascriptExecutor javaScript = (JavascriptExecutor) Driver.getDriver();
        javaScript.executeScript("arguments[0].scrollIntoView();", qualityDemyPageInstructor.cardBodySectionTable1);
        Actions actions= new Actions(Driver.getDriver());
        actions.moveToElement(qualityDemyPageInstructor.cardBodySectionTable1).perform();

        // Then, it is checked that the Sort Lesson, Edit Section and Delete Section buttons
        // appear over the relevant Section boxes.
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(qualityDemyPageInstructor.section1SortLessonButton.
                isDisplayed(),"The Sort Lesson button do not appear on the screen");
        softAssert.assertTrue(qualityDemyPageInstructor.editSection1Button.
                isDisplayed(),"The Edit Section buttons do not appear on the screen.");
        softAssert.assertTrue(qualityDemyPageInstructor.deleteSection1Button.
                isDisplayed(), "The Delete Section button do not appear on the screen.");


        softAssert.assertAll();

    }


    @Test(priority = 18)
    public void lejonTC2118_Curriculum() {

        // Mouse hovers over Section box, then it is checked that
        // the Sort Lesson button appear over the relevant Section boxes.
        JavascriptExecutor javaScript = (JavascriptExecutor) Driver.getDriver();
        javaScript.executeScript("arguments[0].scrollIntoView();", qualityDemyPageInstructor.cardBodySectionTable1);
        Actions actions= new Actions(Driver.getDriver());
        actions.moveToElement(qualityDemyPageInstructor.cardBodySectionTable1).perform();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(qualityDemyPageInstructor.section1SortLessonButton.
                isDisplayed(),"The Sort Lesson button do not appear on the screen");

        // Click the Sort Lesson button.
        actions.moveToElement(qualityDemyPageInstructor.section1SortLessonButton).perform();
        actions.click(qualityDemyPageInstructor.section1SortLessonButton).perform();

        // Check that the Sort Lesson window is on the screen.
        softAssert.assertTrue(qualityDemyPageInstructor.sortLessons1Window.
                isDisplayed(),"The Sort Lessons window do not appear on the screen");


        // The selected lesson is kept pressed with the right mouse button on the screen that appears.
        // The sort between the courses is changed by moving the course related to the drag and drop method to the top or bottom.
        List<WebElement> sortLessonListBefore = Driver.getDriver().
                findElements(By.xpath("//div[@class=\"card mb-0 mt-2 draggable-item\"]"));

        ArrayList<String> sortLessonElementBeforeArr = new ArrayList<>();

        for (WebElement eachSortBefore : sortLessonListBefore) {

            String sortLessonssBefore = eachSortBefore.getText();
            sortLessonElementBeforeArr.add(sortLessonssBefore);

        }

        ArrayList<String> sortListLessonActual = new ArrayList<>(sortLessonElementBeforeArr);
        System.out.println(sortListLessonActual.get(0));


        actions.dragAndDrop(qualityDemyPageInstructor.sortLessons1ArrayBinaryDrag, qualityDemyPageInstructor.sortLessons1OCASoruListsDrop).perform();
        ReusableMethods.bekle(1);



        // Check that the Lessons sort has changed.
        List<WebElement> sortLessonListAfter = Driver.getDriver().findElements(By.xpath("//div[@class=\"card mb-0 mt-2 draggable-item\"]"));

        ArrayList<String> sortLessonElementAfterArr = new ArrayList<>();

        for (WebElement eachSortAfter : sortLessonListAfter) {

            String sortLessonAfter = eachSortAfter.getText();
            sortLessonElementAfterArr.add(sortLessonAfter);

        }

        ArrayList<String> sortListLessonExpected = new ArrayList<>(sortLessonElementAfterArr);
        System.out.println(sortListLessonExpected.get(0));


        // Check that the Lesson sort has changed.
        softAssert.assertNotEquals(sortListLessonActual.get(0), sortListLessonExpected.get(0));

        softAssert.assertAll();

        actions.click(qualityDemyPageInstructor.sortLessonsCloseButton).perform();

    }


    @Test(priority = 19)
    public void lejonTC2119_Curriculum() {

        // Mouse hovers over Section box, then it is checked that the
        // Sort Lesson button appear over the relevant Section boxes.
        JavascriptExecutor javaScript = (JavascriptExecutor) Driver.getDriver();
        javaScript.executeScript("arguments[0].scrollIntoView();", qualityDemyPageInstructor.cardBodySectionTable1);
        Actions actions= new Actions(Driver.getDriver());
        actions.moveToElement(qualityDemyPageInstructor.cardBodySectionTable1).perform();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(qualityDemyPageInstructor.section1SortLessonButton.
                isDisplayed(),"The Sort Lesson button do not appear on the screen");

        // Click the Sort Lesson button.
        actions.moveToElement(qualityDemyPageInstructor.section1SortLessonButton).perform();
        actions.click(qualityDemyPageInstructor.section1SortLessonButton).perform();

        // Check that the Sort Lesson window is on the screen.
        softAssert.assertTrue(qualityDemyPageInstructor.sortLessons1Window.
                isDisplayed(),"The Sort Lessons window do not appear on the screen");


        // The selected lesson is kept pressed with the right mouse button on the screen that appears.
        // The sort between the courses is changed by moving the course related to the drag and drop method to the top or bottom.
        List<WebElement> sortLessonListBefore = Driver.getDriver().
                findElements(By.xpath("//div[@class=\"card mb-0 mt-2 draggable-item\"]"));

        ArrayList<String> sortLessonElementBeforeArr = new ArrayList<>();

        for (WebElement eachSortBefore : sortLessonListBefore) {

            String sortLessonssBefore = eachSortBefore.getText();
            sortLessonElementBeforeArr.add(sortLessonssBefore);

        }

        ArrayList<String> sortListLessonActual = new ArrayList<>(sortLessonElementBeforeArr);
        System.out.println(sortListLessonActual.get(0));


        actions.dragAndDrop(qualityDemyPageInstructor.sortLessons1ArrayBinaryDrag, qualityDemyPageInstructor.sortLessons1OCASoruListsDrop).perform();
        ReusableMethods.bekle(1);



        // Check that the Lessons sort has changed.
        List<WebElement> sortLessonListAfter = Driver.getDriver().findElements(By.xpath("//div[@class=\"card mb-0 mt-2 draggable-item\"]"));

        ArrayList<String> sortLessonElementAfterArr = new ArrayList<>();

        for (WebElement eachSortAfter : sortLessonListAfter) {

            String sortLessonAfter = eachSortAfter.getText();
            sortLessonElementAfterArr.add(sortLessonAfter);

        }

        ArrayList<String> sortListLessonExpected = new ArrayList<>(sortLessonElementAfterArr);
        System.out.println(sortListLessonExpected.get(0));

        // Check that the Lesson sort has changed.
        softAssert.assertNotEquals(sortListLessonActual.get(0), sortListLessonExpected.get(0));

        // The change is saved by clicking the Update sorting button.
        actions.click(qualityDemyPageInstructor.sortLessonsUpdateButton).perform();

        // Successful change is checked by a green pop-up message box appearing in the upper right corner of the screen.
        ReusableMethods.waitForVisibility(qualityDemyPageInstructor.lessonUpdateSortedMessage, 1);

        softAssert.assertTrue(qualityDemyPageInstructor.lessonUpdateSortedMessage.isDisplayed());
        ReusableMethods.webElementScreenShot(qualityDemyPageInstructor.lessonUpdateSortedMessage);


        softAssert.assertAll();

    }


    @Test(priority = 20)
    public void lejonTC2120_Curriculum() {

        // Mouse hovers over Section box, Then it is checked that the
        // Edit Section button appear over the relevant Section boxes.
        JavascriptExecutor javaScript = (JavascriptExecutor) Driver.getDriver();
        javaScript.executeScript("arguments[0].scrollIntoView();", qualityDemyPageInstructor.cardBodySectionTable1);

        Actions actions= new Actions(Driver.getDriver());
        actions.moveToElement(qualityDemyPageInstructor.cardBodySectionTable1).perform();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(qualityDemyPageInstructor.editSection1Button.
                isDisplayed(),"The Edit Section buttons do not appear on the screen.");

        String section1TitleActual = qualityDemyPageInstructor.section1HeadTitle.getText();
        System.out.println(section1TitleActual + "\n");

        // Click on the Edit Section button.
        actions.moveToElement(qualityDemyPageInstructor.editSection1Button).perform();
        actions.click(qualityDemyPageInstructor.editSection1Button).perform();

        // The Title box in the opened window is cleared.
        qualityDemyPageInstructor.updateSectionEditTitleBox.clear();

        // In the title box "Short Tips For Learning Java" text is written.
        qualityDemyPageInstructor.updateSectionEditTitleBox.sendKeys(ConfigReader.getProperty("updateAndEditSectionTitleBox"));

        // Click the Submit button and save the change.
        qualityDemyPageInstructor.updateOchEditSectionSubmitButton.click();

        // Successful change is checked by a green pop-up message box
        // that appears in the upper right corner of the screen.
        System.out.println(qualityDemyPageInstructor.sectionHasBeenUpdatedSuccesMessage.getText() + "\n");
        softAssert.assertTrue(qualityDemyPageInstructor.sectionHasBeenUpdatedSuccesMessage.
                isDisplayed(),"The Section has been updated successfully message does not appear on the screen.");

        // After the change, it is checked whether the Title text on the screen is "Short Tips for Learning Java".
        ReusableMethods.waitForVisibility(qualityDemyPageInstructor.section1HeadTitle, 4);
        String section1TitleExpected = qualityDemyPageInstructor.section1HeadTitle.getText();
        System.out.println(section1TitleExpected);

        Assert.assertNotEquals(section1TitleActual, section1TitleExpected);
        softAssert.assertNotEquals(section1TitleActual, section1TitleExpected);


        softAssert.assertAll();
    }


    @Test(priority = 21)
    public void lejonTC2121_Curriculum() {

        // Mouse over any Section box, Then it is checked that the
        // Edit Section button appear over the relevant Section boxes.
        JavascriptExecutor javaScript = (JavascriptExecutor) Driver.getDriver();
        javaScript.executeScript("arguments[0].scrollIntoView();", qualityDemyPageInstructor.cardBodySectionTable3);
        Actions actions= new Actions(Driver.getDriver());
        actions.moveToElement(qualityDemyPageInstructor.cardBodySectionTable3).perform();

        // Click on the Edit Section button.
        actions.moveToElement(qualityDemyPageInstructor.editSection3Button).perform();
        actions.click(qualityDemyPageInstructor.editSection3Button).perform();

        // Click the Close button in the window that opens.
        ReusableMethods.waitForVisibility(qualityDemyPageInstructor.editAndUpdateSection3CloseButton,2);
        actions.moveToElement(qualityDemyPageInstructor.editAndUpdateSection3CloseButton).perform();
        actions.click(qualityDemyPageInstructor.editAndUpdateSection3CloseButton).perform();

        // Check that the Update Section mini window does not appear on the screen.
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(qualityDemyPageInstructor.editAndUpdateSection3Window.
                isDisplayed(),"The Update Section3 window do not appear on the screen");


        softAssert.assertAll();

    }


    @Test(priority = 22)
    public void lejonTC2122_Curriculum() {

        // Hover mouse over any Section box.
        JavascriptExecutor javaScript = (JavascriptExecutor) Driver.getDriver();
        javaScript.executeScript("arguments[0].scrollIntoView();", qualityDemyPageInstructor.cardBodySectionTable6);
        Actions actions= new Actions(Driver.getDriver());
        actions.moveToElement(qualityDemyPageInstructor.cardBodySectionTable6).perform();

        // Click the Delete section button.
        qualityDemyPageInstructor.section6TableDeleteButton.click();

        // Click the Continue button in the Alert Window that opens.
        ReusableMethods.waitForVisibility(qualityDemyPageInstructor.sectionDeleteAlertContinueButton,2);
        actions.moveToElement(qualityDemyPageInstructor.sectionDeleteAlertContinueButton).perform();
        qualityDemyPageInstructor.sectionDeleteAlertContinueButton.click();

        // A green pop-up message box appears in the upper right corner of the screen
        // to check that the partition deletion has been completed successfully.
        ReusableMethods.webElementScreenShot(qualityDemyPageInstructor.sectionHasBeenDeletedSuccessMessage);

        SoftAssert softAssert = new SoftAssert();
        System.out.println(qualityDemyPageInstructor.sectionHasBeenDeletedSuccessMessage.getText());

        Assert.assertTrue(qualityDemyPageInstructor.sectionHasBeenDeletedSuccessMessage.isDisplayed());
        softAssert.assertTrue(qualityDemyPageInstructor.sectionHasBeenDeletedSuccessMessage.isDisplayed());

        softAssert.assertAll();

    }

    @Test(priority = 23)
    public void lejonTC2123_Curriculum() {

        // Hover the mouse over a Lesson that appears inside any Section box.
        // It is checked whether the Edit and Delete icons appear at the end of the Lesson Lines Box on the screen.
        JavascriptExecutor javaScript = (JavascriptExecutor) Driver.getDriver();
        javaScript.executeScript("arguments[0].scrollIntoView();", qualityDemyPageInstructor.section2Lesson2CardFrame);

        Actions actions= new Actions(Driver.getDriver());
        actions.moveToElement(qualityDemyPageInstructor.section2Lesson2CardFrame).perform();
        ReusableMethods.waitForVisibility(qualityDemyPageInstructor.section2Lesson2CardFrame, 2);
        // ReusableMethods.webElementScreenShot(qualityDemyPage.section2Lesson2TitleText);

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(qualityDemyPageInstructor.section2Lesson2EditIcon.isDisplayed());
        softAssert.assertTrue(qualityDemyPageInstructor.section2Lesson2DeleteIcon.isDisplayed());

        softAssert.assertAll();

    }

    @Test(priority = 24)
    public void lejonTC2124_Curriculum() {

        // Hover the mouse over a Lesson frame that appears inside any Section box.
        // Click on the Edit icon that appears at the end of the Lesson Lines Box on the screen.
        JavascriptExecutor javaScript = (JavascriptExecutor) Driver.getDriver();
        javaScript.executeScript("arguments[0].scrollIntoView();", qualityDemyPageInstructor.section2Lesson2CardFrame);

        Actions actions= new Actions(Driver.getDriver());
        actions.moveToElement(qualityDemyPageInstructor.section2Lesson2CardFrame).perform();
        actions.moveToElement(qualityDemyPageInstructor.section2Lesson2EditIcon).perform();
        actions.click(qualityDemyPageInstructor.section2Lesson2EditIcon).perform();

        // In the window that opens, it is checked that the Update lesson window appears.
        ReusableMethods.waitForVisibility(qualityDemyPageInstructor.updateLessonWindowTitle,2);

        SoftAssert softAssert = new SoftAssert();
        Assert.assertTrue(qualityDemyPageInstructor.updateLessonWindowTitle.isDisplayed());
        softAssert.assertTrue(qualityDemyPageInstructor.updateLessonWindowTitle.isDisplayed(),
                "The Update Lesson window do not appear on the screen");

        softAssert.assertAll();

        qualityDemyPageInstructor.updateLessonCloseButton.click();

    }

    @Test(priority = 25)
    public void lejonTC2125_Curriculum() {

        // Hover the mouse over a Lesson frame that appears inside any Section box.
        // Click on the Edit icon that appears at the end of the Lesson Lines Box on the screen.
        JavascriptExecutor javaScript = (JavascriptExecutor) Driver.getDriver();
        javaScript.executeScript("arguments[0].scrollIntoView();", qualityDemyPageInstructor.section2Lesson2CardFrame);
        Actions actions= new Actions(Driver.getDriver());
        actions.moveToElement(qualityDemyPageInstructor.section2Lesson2CardFrame).perform();
        actions.moveToElement(qualityDemyPageInstructor.section2Lesson2EditIcon).perform();
        actions.click(qualityDemyPageInstructor.section2Lesson2EditIcon).perform();

        // Select a Section Name other than the one that appears selected in the
        // box under Section Title that appears in the Update Lesson window.
        String actualSection2SelectTitle= qualityDemyPageInstructor.section2UpdateLessonSectionSelelect.getText();
        System.out.println(actualSection2SelectTitle);

        WebElement addnewLessonSectionBox = Driver.getDriver().findElement(By.xpath("//select[@name=\"section_id\"]"));
        Select select = new Select(addnewLessonSectionBox);
        select.selectByVisibleText("Java in 15 Minutes");

        // Check that the new section is selected after the change.
        String expectedSection2SelectTitle= qualityDemyPageInstructor.section2UpdateLessonSectionSelelect.getText();
        System.out.println(expectedSection2SelectTitle);

        SoftAssert softAssert = new SoftAssert();
        Assert.assertNotEquals(actualSection2SelectTitle, expectedSection2SelectTitle);
        softAssert.assertNotEquals(actualSection2SelectTitle, expectedSection2SelectTitle);

        softAssert.assertAll();

        qualityDemyPageInstructor.updateLessonCloseButton.click();

    }

    @Test(priority = 26)
    public void lejonTC2126_Curriculum() {

        // Hover the mouse over a Lesson that appears inside any Section box.
        // Click on the Edit icon that appears at the end of the Lesson Lines Box on the screen.
        JavascriptExecutor javaScript = (JavascriptExecutor) Driver.getDriver();
        javaScript.executeScript("arguments[0].scrollIntoView();", qualityDemyPageInstructor.section2Lesson2CardFrame);

        Actions actions= new Actions(Driver.getDriver());
        actions.moveToElement(qualityDemyPageInstructor.section2Lesson2CardFrame).perform();
        actions.moveToElement(qualityDemyPageInstructor.section2Lesson2EditIcon).perform();
        actions.click(qualityDemyPageInstructor.section2Lesson2EditIcon).perform();

        // Click the Close button.
        ReusableMethods.waitForVisibility(qualityDemyPageInstructor.updateLessonCloseButton,2);
        actions.moveToElement(qualityDemyPageInstructor.updateLessonCloseButton).perform();
        actions.click(qualityDemyPageInstructor.updateLessonCloseButton).perform();

        // It is checked that the Update Lesson window is not visible on the screen.
        ReusableMethods.waitForVisibility(qualityDemyPageInstructor.section2Lesson2ListFrame, 2);
        SoftAssert softAssert = new SoftAssert();
        Assert.assertFalse(qualityDemyPageInstructor.updateLessonWindowTitle.isDisplayed());
        softAssert.assertFalse(qualityDemyPageInstructor.updateLessonWindowTitle.isDisplayed(),
                "The Update Lesson window appears on the screen.");

        softAssert.assertAll();


    }


    @Test(priority = 27)
    public void lejonTC2127_Curriculum() {

        // Hover the mouse over a Lesson that appears inside Section box.
        // Click on the Delete icon that appears at the end of the Lesson Lines Box on the screen.
        JavascriptExecutor javaScript = (JavascriptExecutor) Driver.getDriver();
        javaScript.executeScript("arguments[0].scrollIntoView();", qualityDemyPageInstructor.section7Lesson1ListFrame);

        Actions actions= new Actions(Driver.getDriver());
        actions.moveToElement(qualityDemyPageInstructor.section7Lesson1ListFrame).perform();
        actions.moveToElement(qualityDemyPageInstructor.section7Lesson1DeleteIcon).perform();
        actions.click(qualityDemyPageInstructor.section7Lesson1DeleteIcon).perform();

        // Check that a mini Alert window is visible on the screen.
        ReusableMethods.waitForVisibility(qualityDemyPageInstructor.lessonDeleteAlertWindow, 2);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(qualityDemyPageInstructor.lessonDeleteAlertWindow.isDisplayed(),
                "The mini Alert window does not visible on the screen.");


        // Click the Continue button in the Alert Window that opens.
        actions.moveToElement(qualityDemyPageInstructor.sectionDeleteAlertContinueButton).perform();
        actions.click(qualityDemyPageInstructor.sectionDeleteAlertContinueButton).perform();

        // Check that a mini Alert window does not visible on the screen.
        softAssert.assertFalse(qualityDemyPageInstructor.lessonDeleteAlertWindow.isDisplayed(),
                "The mini Alert window is visible on the screen");

        // A green pop-up message box appears in the upper right corner of the
        // screen to check that the partition deletion has been completed successfully.
        ReusableMethods.webElementScreenShot(qualityDemyPageInstructor.lessonBeenDeletedSuccessMessage);
        System.out.println(qualityDemyPageInstructor.lessonBeenDeletedSuccessMessage.getText());

        Assert.assertTrue(qualityDemyPageInstructor.lessonBeenDeletedSuccessMessage.isDisplayed());
        softAssert.assertTrue(qualityDemyPageInstructor.lessonBeenDeletedSuccessMessage.isDisplayed());

        softAssert.assertAll();

    }


}
