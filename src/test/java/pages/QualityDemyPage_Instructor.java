package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class QualityDemyPage_Instructor {
    public QualityDemyPage_Instructor() {
        PageFactory.initElements(Driver.getDriver(), this);
    }







    //---------------------------24==175------GURSEL--------------------------------------------------------//
    //mainPage> loginLinki> emailBox> password> loginButton> instructorLink> salesReportLink
    @FindBy(xpath = "//span[text()='Sales report']")
    public WebElement salesReportLink;
    //mainPage> loginLinki> emailBox> password> loginButton> instructorLink> salesReportLink> salesReportSearchBox
    @FindBy(xpath = "//input[@type='search']")
    public WebElement salesReportSearchBox;
    //mainPage> loginLinki> emailBox> password> loginButton> instructorLink> salesReportLink> filterDropbox
    @FindBy(xpath = "//div[@id='reportrange']")
    public WebElement filterDropBox;
    //mainPage> loginLinki> emailBox> password> loginButton> instructorLink> salesReportLink> filterDropbox> lastMonthButton
    @FindBy(xpath = "//li[text()='Last Month']")
    public WebElement lastMonthButton;
    //mainPage> loginLinki> emailBox> password> loginButton> instructorLink> salesReportLink> noDataAvailableInTableHeading
    @FindBy(xpath = "//*[@class='dataTables_empty']")
    public WebElement noDataAvailableInTheTable;








































































































































 //-------------------------176==325---------------LEVENT-------------------------------------------------------//

    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement loginLink;

    @FindBy(xpath = "//input[@id='login-email']")
    public WebElement emailBox;

    @FindBy(xpath = "//button[text()='Login']")
    public WebElement loginButton;

    @FindBy(xpath = "//*[text()='Accept']")
    public WebElement acceptCookies;

    @FindBy(xpath = "//input[@id='login-password']")
    public WebElement passwordBox;






































































































































 //----------------------------326==475------------MURAT-------------------------------------------------------//





















































































































































//---------------------------476==625-------------EMINE------------------------------------------------------//





















































































































































//-------------------------626==775--------------ZEYNEP------------------------------------------------------//
//Homepage => Categories
@FindBy (xpath="//span[text()='Categories']")
public WebElement categories;
    //Homepage => categories => Web Design Course
    @FindBy (xpath ="//span[text()='Web Design Course']")
    public WebElement categoriesWebDesign;
    //Homepage => categories => Web Design Course => Web Desing Course Page
    @FindBy(xpath="//li[@class='breadcrumb-item active text-light display-6 fw-bold']")
    public WebElement webDesignPage;
    //Homepage => Categories => English Course
    @FindBy (xpath = "//span[text()='English Course']")
    public WebElement categoriesEnglish;
    //Homepage => categories => English Course => English Course Page
    @FindBy(xpath="//li[@class='breadcrumb-item active text-light display-6 fw-bold']")
    public WebElement englishCoursePage;
    //Homepage => Categories => IT & SoftWare
    @FindBy (xpath="//span[text()='IT & Software']")
    public WebElement categoriesIt;
    //Homepage => categories => IT Course => IT Course Page
    @FindBy(xpath="//li[@class='breadcrumb-item active text-light display-6 fw-bold']")
    public WebElement itCoursePage;
    //Homepage => Categories => Music
    @FindBy (xpath= "//span[text()='Music']")
    public WebElement categoriesMusic;
    //Homepage => categories => Music Course => Music Course Page
    @FindBy(xpath="//li[@class='breadcrumb-item active text-light display-6 fw-bold']")
    public WebElement musicCoursePage;
    //Homepage => categories => Personel Developments
    @FindBy (xpath= "//span[text()='Personal Developments']")
    public WebElement categoriesPersonelDevelopments;
    //Homepage => Categories => Personel Development Course => Personel Development Course Page
    @FindBy (xpath = "//li[@class='breadcrumb-item active text-light display-6 fw-bold']")
    public WebElement personelDevelopmentPage;
    //Homepage => Categories => All courses
    @FindBy (xpath= "//span[text()='All courses']")
    public WebElement categoriesAllCourses;
    //Homepage => Categories => All Courses => All Courses Page
    @FindBy(xpath="//li[@class='breadcrumb-item active text-light display-6 fw-bold']")
    public WebElement allCoursesPage;
    //Homepage => User box icon
    @FindBy (xpath= "//div[@class='user-box menu-icon-box']")
    public WebElement userBoxIcon;
    //Homepage => User box icon => My messages
    @FindBy(xpath = "//a[text()='My messages']")
    public WebElement myMessages;
    //Homepage => User box icon => My messages => textarea
    @FindBy (xpath= "//textarea[@name='message']")
    public WebElement messageArea;
    //Homepage => User box icon => My messages => Send
    @FindBy (xpath = "(//button[@type='submit'])[2]")
    public WebElement messageSendButton;
    //Homepage => User box icon => My messages => Send => Toast Message
    @FindBy(xpath = "//div[text()='Message sent']")
    public WebElement toastMessage;
    //Homepage => User box icon => My messages => Cancel
    @FindBy (xpath = "//button[text()='Cancel']")
    public WebElement messageCancelButton;
    //Homepage => User box icon => My messages => Compose
    @FindBy (xpath = "//button[@id='NewMessage']")
    public WebElement messageComposeButton;
    //Homepage => User box icon => My messages => New Message Section
    @FindBy (xpath = "//span[text()='New message']")
    public WebElement newMessageSection;
    //Homepage => User box icon => My messages => correspondence
    @FindBy (xpath = "(//div[@class='message-sender-wrap'])[1]")
    public  WebElement correspondence;
    //Homepage => User box icon => My messages => Corresponded
    @FindBy (xpath="//div[@class='message-content']")
    public WebElement messageContent;
    //===============================US_15=================
    //Homepage => User box icon => User profile
    @FindBy (xpath= "//a[text()='User profile']")
    public WebElement userProfilePage;
    //Homepage => User box icon => User profile => FirstName
    @FindBy (xpath = "//input[@id='FristName']")
    public WebElement userProfileFirstName;
    //Homepage => User box icon => User profile => Last Name
    @FindBy (xpath = "//input[@name='last_name']")
    public WebElement userProfileLastName;
    //Homepage => User box icon => User profile => Title
    @FindBy (xpath = "//textarea[@name='title']")
    public WebElement userProfileTitle;
    //Homepage => User box icon => User profile => Skills
    @FindBy (xpath= "//span[@class='input placeholder']")
    public WebElement userProfileSkills;
    //Homepage => User box icon => User profile => Biography
    @FindBy (xpath = "//body[@id='tinymce']") //bu yanlış
    public WebElement userProfileBiography;
    //Homepage => User box icon => User profile => Twitter
    @FindBy (xpath = "//input[@name='twitter_link']")
    public WebElement userProfileTwitter;
    //Homepage => User box icon => User profile => Facebook
    @FindBy (xpath = "//input[@name='facebook_link']")
    public WebElement userProfileFacebook;
    //Homepage => User box icon => User profile => Linkedin
    @FindBy (xpath = "//input[@name='linkedin_link']")
    public WebElement userProfileLinkedin;
    //Homepage => User box icon => User profile => Save
    @FindBy (xpath = "//button[text()='Save']")
    public WebElement userProfileSave;
    //Homepage => User box icon => User profile => Profile
    @FindBy (xpath = "//i[@class='far fa-user-circle']")
    public WebElement userProfilProfilButton;
    //Homepage => User box icon => User profile => Profile Page Title
    @FindBy (xpath = "//h1[text()='User profile']") //yeni eklendi
    public WebElement userProfilePageTitle;
    //===========================US_18================================
    //Homepage => Instructor section
    @FindBy (xpath="//a[text()='Instructor']")
    public WebElement instructorSection;
    //Homepage => Instructor section => Number of courses
    @FindBy (xpath = "//p[text()='Number of courses']")
    public WebElement numberOfCourses;
    //Homepage => Instructor section => Courses page
    @FindBy (xpath = "//h4[@class='page-title']")
    public WebElement coursesPage;
    //Homepage => Instructor section => Number of Enrolment
    @FindBy (xpath = "//p[text()='Number of enrolment']")
    public WebElement numberOfEnrolment;
    //Homepage=> Instructor section => Sales report Page
    @FindBy (xpath ="//h4[text()='page-title']")
    public WebElement salesReportPage;
    //Homepage => Instructor section => Pending Balance
    @FindBy (xpath = "//p[text()='Pending balance']")
    public WebElement pendingBalance;
    //Homepage => Instructor section => Number of Enrolment => Payout Report
    @FindBy (xpath = "//h4[@class='page-title']")
    public WebElement payOutReport;
    //Homepage => Instructor section => Requested withdrawal amount
    @FindBy (xpath = "//p[text()='Requested withdrawal amount']")
    public WebElement requestedWithdrawalAmount;


















    //---------------------------776==925-------------FATIH------------------------------------------------------//
// Homepage ==> Login Page ==> Instructor Page
@FindBy (linkText = "Instructor")
public WebElement instructorLink;

    // Homepage ==> Login Page ==> Instructor Page ==> Dashboard Page
    @FindBy (linkText = "Course manager")
    public WebElement courseManagerLink;

    // Homepage ==> Login Page ==> Instructor Page ==> Dashboard Page ==> Course manager (Courses) Page
    @FindBy (id = "select2-category_id-container")
    public WebElement categoriesLink;

    @FindBy (xpath = "(//*[text()='Web Design for Web Developers'])[3]")
    public WebElement categoryChoosingTC1;

    @FindBy (xpath = "(//*[text()='Web Design for Web Developers'])[2]")
    public WebElement categoryChoosingTC2;

    @FindBy (id = "select2-status-container")
    public WebElement statusLink;

    @FindBy (xpath = "(//span[@title='All'])[1]")
    public WebElement statusChoosing;

    @FindBy (id = "select2-price-container")
    public WebElement priceLink;

    @FindBy (xpath = "/html/body/div[2]/div/div[2]/div/div[3]/div/div/div/form/div[3]/div/span/span[1]/span/span[1]")
    public WebElement priceChoosing;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement filterButton;

    @FindBy (xpath = "//input[@type='search']")
    public WebElement searchBox;

    @FindBy (xpath = "(//button[@class='btn btn-sm btn-outline-primary btn-rounded btn-icon'])[2]")
    public WebElement threeDots2; // Web Design for Developers

    @FindBy (xpath = "(//button[@class='btn btn-sm btn-outline-primary btn-rounded btn-icon'])[3]")
    public WebElement threeDots3; // Bass Guitar

    @FindBy (xpath = "(//button[@class='btn btn-sm btn-outline-primary btn-rounded btn-icon'])[4]")
    public WebElement threeDots4; // Piano

    @FindBy (xpath = "(//button[@class='btn btn-sm btn-outline-primary btn-rounded btn-icon'])[1]")
    public WebElement threeDots1; // English

    @FindBy (xpath = "//a[@href='https://qualitydemy.com/home/course/web-design-for-developers/53']")
    public WebElement viewCourseOnFrontend;

    @FindBy (xpath = "(//*[text()='Go to course playing page'])[3]")
    public WebElement goCoursePlayingPage; // Bass Guitar

    @FindBy (xpath = "(//*[text()='Edit this course'])[3]")
    public WebElement editThisCourse; // Bass Guitar

    @FindBy (xpath = "(//*[text()='Mark as drafted'])[4]")
    public WebElement markAsDraft; // Piano

    @FindBy (xpath = "(//*[text()='Continue'])[1]")
    public WebElement continueButton;

    @FindBy (xpath = "//span[text()='Draft']")
    public WebElement draft;

    @FindBy (xpath = "(//a[text()='Publish this course'])[1]")
    public WebElement publishThisCourse; // English

    @FindBy (xpath = "(//span[text()='Pending'])[1]")
    public WebElement pending1;

    @FindBy (xpath = "(//a[text()='Delete'])[2]")
    public WebElement delete;

    @FindBy (xpath = "//span[text()='Piano']")
    public WebElement Piano;

    @FindBy (xpath = "//a[@href='https://qualitydemy.com/user/course_form/add_course']")
    public WebElement addNewCourseButton;

    // Homepage ==> Login Page ==> Instructor Page ==> Dashboard Page ==> Course manager (Courses) Page ==> Relevant course Page
    @FindBy (xpath = "//h1[text()='Web Design for Developers']")
    public WebElement pageRelevantCourseTC3; // Web Design for Developers

    @FindBy (xpath = "//h1[text()='Bass Guitar']")
    public WebElement pageRelevantCourseTC4; // Bass Guitar

    // Homepage ==> Login Page ==> Instructor Page ==> Dashboard Page ==> Course manager (Courses) Page ==> Edit course Page
    @FindBy (xpath = "//h4[@class='page-title']")
    public WebElement updateEditCourse; // Bass Guitar & Web Design for Developers

    @FindBy (xpath = "//a[text()='Web Design for Developers']")
    public WebElement webDesignForDevelopersTitle;

    // Homepage ==> Login Page ==> Instructor Page ==> Dashboard Page ==> Course manager (Courses) Page ==> Add New Course
    @FindBy (xpath = "//*[text()='Course adding form']")
    public WebElement courseAddingForm;



















































    //-----------------------926==1075------------------MERYEM------------------------------------------------------//
@FindBy(xpath = "//a[text()='Log in']")
public WebElement loginLinki;
    @FindBy(xpath = "//input[@id='login-email']")
    public WebElement emailKutusu;
    @FindBy(xpath = "//input[@id='login-password']")
    public WebElement passwordKutusu;
    @FindBy(xpath = "//a[@onclick=\"cookieAccept();\"]")
    public WebElement cookies;
    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement loginButonu;
    /* ------------------------ US_16 ---------------------------------*/
    //HomePage => İnstructor
    @FindBy( xpath = "(//div[@class='icon'])[1]")
    public WebElement instructor;
    //HomePage => İnstructor => Manage Profile
    @FindBy ( xpath = "//i[@class='dripicons-user']")
    public  WebElement myManager;
    //HomePage => İnstructor => Manage Profile => Account
    @FindBy( xpath = "(//li[@class=' mb-3'])[1]")
    public WebElement account;
    //HomePage => İnstructor => Manage Profile => Account => Current Password
    @FindBy ( xpath = "(//input[@type='password'])[1]")
    public WebElement currentPossword ;
    //HomePage => İnstructor => Manage Profile => Account => New Password
    @FindBy ( xpath = "(//input[@type='password'])[2]")
    public WebElement newPossword ;
    //HomePage => İnstructor => Manage Profile => Account => Confirm Password
    @FindBy ( id= "confirm_password")
    public WebElement ConfirmPossword ;
    //HomePage => İnstructor => Manage Profile => Account => Save Change
    @FindBy( xpath = "//*[text()='Save changes']")
    public WebElement saveChanges;
    @FindBy(xpath = "//div[@class='toast-message']")
    public  WebElement mesaj;
    /* ------------------------ US_17 ---------------------------------*/
    //HomePage => İnstructor => Manage Profile => Profile
    @FindBy(xpath = "(//*[@class=' mb-3'])[2]")
    public  WebElement photoButon;
    //HomePage => İnstructor => Manage Profile => Profile => Profile Photo
    @FindBy(xpath = "//div[@class='input-group']")
    public  WebElement uploadİmage;
    //HomePage => İnstructor => Manage Profile => Profile => Profile Photo
    @FindBy ( xpath = "//button[@class='btn red px-5 py-2 radius-8']")
    public WebElement uploadButonu;
    /* ------------------------ US_25 ---------------------------------*/
    //HomePage => İnstructor => Course Manage
    @FindBy ( xpath = "//*[text()='Course manager']")
    public WebElement courseManager;
    //HomePage => İnstructor => Course Manage => Add New Course
    @FindBy(xpath = "//*[text()='Add new course']")
    public WebElement addNewCourse;
    //HomePage => İnstructor => Course Manage => Add New Course => Pricing
    @FindBy(xpath = "//*[@class='mdi mdi-currency-cny']")
    public WebElement pricing;
    //HomePage => İnstructor => Course Manage => Add New Course => Pricing => Course Price
    @FindBy(xpath = "(//input[@type='number'])[1]")
    public WebElement courseprice;
    //HomePage => İnstructor => Course Manage => Add New Course => Pricing => Course Price => Check Discount
    @FindBy(xpath = "//label[@for='discount_flag']")
    public WebElement Checkdiscount;
    //HomePage => İnstructor => Course Manage => Add New Course => Pricing => Course Price => Discounted price
    @FindBy(xpath = "(//input[@type='number'])[2]")
    public WebElement discountedprice;
    @FindBy(xpath = "(//small[@class='text-muted'])[3]")
    public WebElement indirimliFıyat;
    /* ------------------------ US_26 ---------------------------------*/

    @FindBy(xpath = "(//span[@class='d-none d-sm-inline'])[5]")
    public WebElement media;

    @FindBy(xpath = "//span[@id='select2-course_overview_provider-container']")
    public WebElement courseOverviewProvider;

    @FindBy(xpath = "//*[text()='Basic']")
    public WebElement basicButonu;

    @FindBy(xpath = "//input[@id='course_title']")
    public WebElement courseTitle;

    @FindBy(xpath = "(//span[@class='select2-selection__rendered'])[1]")
    public WebElement categoryDropDown;

    @FindBy(xpath = "(//*[text()='Web Design for Web Developers'])[3]")
    public WebElement webDesing;

    @FindBy(xpath = "//input[@name='course_overview_url']")
    public WebElement courseOverviewUrl;

    @FindBy(xpath = "//div[@class='js--image-preview']")
    public WebElement uploadCoursePicture;



























































    //-------------------------1076==1225---------------NESE------------------------------------------------------//
        // ++++++++ US20 Baslangic ++++++++++++

     //HomePage->Login->HomePage -->Instructor
    @FindBy(xpath = "//a[text()='Instructor']")
    public WebElement instructorButton;

    // NAVIGATION -> Course Maneger --> demo
    @FindBy(xpath = "//a[text()='demo']")
    public WebElement chooseDemoCourse;
    // NAVIGATION -> Add new course -> ...-> Finish/Submit --> Back to course list
    @FindBy(xpath = "//a[@class='alignToTitle btn btn-outline-secondary btn-rounded btn-sm my-1']")
    public WebElement backtoList;
    //Back to course list --> Course manager
    @FindBy(xpath = "//*[@class='side-nav-link active']")
    public WebElement courseManeger;
    // course manager -> course List -> Choose one course from course list -->View on fronted
    @FindBy(xpath = "//*[@class='alignToTitle btn btn-outline-secondary btn-rounded btn-sm ml-1 my-1']")
    public WebElement  viewonFrontendButton;
    //Close the newly opened tab -> Course manager --> right Arrow
    @FindBy(xpath = "//*[@class='mdi mdi-arrow-right-bold']")
    public WebElement rightArrow;
    //Close the newly opened tab -> Course manager --> left Arrow
    @FindBy(xpath = "//*[@class='mdi mdi-arrow-left-bold']")
    public  WebElement leftArrow;
    // ++++++++++ US20 Sonu +++++++++

    // ++++++++ US22 Baslangic +++++++++
    // NAVIGATION -> course manager -> Basic --> Add new instructor
    @FindBy(xpath = "//*[text()='Basic']")
    public WebElement basicButton;
    // NAVIGATION -> course manager -> Basic --> Add new instructor
    @FindBy(xpath = "//input[@class='select2-search__field']")
    public WebElement addNewInstructorTextBox;
    // NAVIGATION -> course manager -> Basic --> Course title
    @FindBy(xpath = "//input[@id='course_title']")
    public WebElement coursetitleTextBox;
    // NAVIGATION -> course manager -> Basic --> Short description
    @FindBy(xpath = "//textarea[@id='short_description']")
    public WebElement sortDescriptionTextarea;
    // NAVIGATION -> course manager -> Basic --> Description
    @FindBy(xpath = "//div[@class='note-editable card-block']")
    public WebElement descriptionTextarea;
    // NAVIGATION -> course manager -> Basic --> Category
    @FindBy(xpath = "//span[@id='select2-sub_category_id-container']")
    public WebElement categorytextBox;
    @FindBy(xpath = "(//input[@class='select2-search__field'])[2]")
    public WebElement categoryTextEnter;
    // NAVIGATION -> course manager -> Basic --> Level
    @FindBy(xpath = "//span[@id='select2-level-container']")
    public WebElement levelTextbox;
    //NAVIGATION -> course manager -> Basic --> Enable drip content
    @FindBy(xpath = "(//label[@for='enable_drip_content'])[1]")
    public WebElement enableDripContentButton;
    // NAVIGATION -> course manager -> Basic --> Check if this course is top course
    @FindBy(xpath = "//label[@for='is_top_course']")
    public WebElement ifThisCourseisTopCourse;
    // +++++++++++++++++++US22 Sonu +++++++++++++++++++


    // ++++++++++++++++++US32 Baslangic+++++++++++++++++
    // NAVIGATION -> course manager --> Pricing
    @FindBy(linkText = "//a[@class='nav-link rounded-0 pt-2 pb-2 active']")
    public WebElement pricingButton;
    // NAVIGATION -> course manager -> Pricing --> Course Price Box
    @FindBy(xpath = "(//input[@class='form-control'])[6]")
    public WebElement coursePriceBox;
    // NAVIGATION -> course manager -> Pricing --> Discounted Price Box
    @FindBy(xpath = "//input[@id='discounted_price']")
    public WebElement discountedPriceBox;
    // NAVIGATION -> course manager -> Pricing --> Discount Check Box
    @FindBy(xpath = "//label[@for='discount_flag']")
    public WebElement discountCheckBox;













































































//----------------------1226==1375------------------YAKUP------------------------------------------------------//
@FindBy(xpath = "//a[text()=\"Log in\"]") public WebElement lejonLoginLink;
    @FindBy(xpath = "//a[@onclick=\"cookieAccept();\"]") public WebElement lejonCookies;
    @FindBy(xpath = "//div[text()=\"Welcome Test User\"]") public WebElement welcomeMessage;
    @FindBy(linkText = "Instructor") public WebElement instructorButtonLejon;
    @FindBy(xpath = "//*[text()=\"Course manager\"]") public WebElement courseManagerLinkLejon;
    @FindBy(xpath = "(//div[@class=\"dropright dropright\"])[1]") public WebElement threeDotsIcon;
    @FindBy(xpath = "(//div[@class=\"card-body\"])[1]") public WebElement updateJavaWindow;
    @FindBy(xpath = "(//a[text()=\"Edit this course\"])[1]") public WebElement editThisCourseLejon;
    @FindBy(xpath = "(//a[text()=\" Add section\"])[1]") public WebElement addSectionButton;
    @FindBy(xpath = "(//input[@class=\"form-control\"])[9]") public WebElement addNewSectionBox;
    @FindBy(xpath = "(//button[text()=\"Submit\"])[2]") public WebElement addNewSectionsubmitButton;
    @FindBy(xpath = "//*[text()=\"Section has been added successfully\"]") public WebElement sectionHasBeenSuccesMessage;
    @FindBy(xpath = "(//h5[@class=\"card-title\"])[1]") public WebElement newlyAddedSection;
    @FindBy(xpath = "//button[text()=\"Close\"]") public WebElement addNewSectoinCloseButton;
    @FindBy(xpath = "//h5[text()=\"Add new section\"]") public WebElement addNewSectoinWindow;
    @FindBy(xpath = "(//a[@href=\"javascript:void(0)\"])[2]") public WebElement addLessonButton;
    @FindBy(xpath = "//input[@id=\"youtube\"]") public WebElement selectLessonTypeYoutube;
    @FindBy(xpath = "//label[@for=\"vimeo\"]") public WebElement selectLessonTypeVimeo;
    @FindBy(xpath = "//label[@for=\"video_file\"]") public WebElement selectLessonTypeVideofile;
    @FindBy(xpath = "//label[@for=\"html5\"]") public WebElement selectLessonTypeVideourl;
    @FindBy(xpath = "//label[@for=\"google_drive_video\"]") public WebElement selectLessonTypeGoogleVideo;
    @FindBy(xpath = "//label[@for=\"document\"]") public WebElement selectLessonTypeDocument;
    @FindBy(xpath = "//label[@for=\"text\"]") public WebElement selectLessonTypeText;
    @FindBy(xpath = "//label[@for=\"image\"]") public WebElement selectLessonTypeImage;
    @FindBy(xpath = "//label[@for=\"iframe\"]") public WebElement selectLessonTypeIframe;
    @FindBy(xpath = "(//span[@aria-hidden=\"true\"])[6]") public WebElement newLessonCloseButton;
    @FindBy(xpath = "//h5[text()=\"Add new lesson\"]") public WebElement addNewLessonWindow;
    @FindBy(xpath = "//a[@href=\"javascript::void(0)\"]") public WebElement lessonTypeNextButton;
    @FindBy(xpath = "//div[@class=\"alert alert-info\"]") public WebElement lessonTypeSelectedText;
    @FindBy(xpath = "(//input[@class=\"form-control\"])[9]") public WebElement addnewLessonTextBox;
    @FindBy(xpath = "//input[@placeholder=\"This video will be shown on web application\"]") public WebElement addnewLessonVideoURLBox;
    @FindBy(xpath = "//label[@id=\"invalid_url\"]") public WebElement addnewInvalidVideoURLText;
    @FindBy(xpath = "//input[@name=\"duration\"]") public WebElement addnewLessonDurationBox;
    @FindBy(xpath = "(//div[@class=\"note-editable card-block\"])[2]") public WebElement addnewLessonSummaryBox;
    @FindBy(xpath = "//input[@name=\"free_lesson\"]") public WebElement markFreeLessonCheckBox;
    @FindBy(xpath = "(//button[text()=\"Add lesson\"])") public WebElement greenAddLessonButton;
    @FindBy(xpath = "//div[text()=\"Lesson has been added successfully\"]") public WebElement lessonHasAddedSuccesMessage;
    @FindBy(xpath = "(//a[@href=\"javascript:void(0)\"])[3]") public WebElement sortSectionButton;
    @FindBy(xpath = "(//h5[@class=\"mb-1 mt-0\"])[1]") public WebElement sortSectionDrag;
    @FindBy(xpath = "(//div[@class=\"card mb-0 mt-2 draggable-item\"])[3]") public WebElement sortSectionDrop1;
    @FindBy(xpath = "(//button[@aria-hidden=\"true\"])[5]") public WebElement sortSectionCloseButton;
    @FindBy(xpath = "//button[text()=\"Update sorting\"]") public WebElement updateSectionButton;
    @FindBy(xpath = "/html/body/div[11]/div") public WebElement updateSectionSortedMessage; //*[@id="large-modal"]/div/div/div[2]/script[2]/text()
    @FindBy(xpath = "(//div[@class=\"card-body\"])[3]") public WebElement cardBodySectionTable1;
    @FindBy(xpath = "(//button[@class=\"btn btn-outline-secondary btn-rounded btn-sm\"])[1]") public WebElement section1SortLessonButton;
    @FindBy(xpath = "(//button[@class=\"btn btn-outline-secondary btn-rounded btn-sm ml-1\"])[1]") public WebElement editSection1Button;
    @FindBy(xpath = "(//button[@class=\"btn btn-outline-secondary btn-rounded btn-sm ml-1\"])[2]") public WebElement deleteSection1Button;
    @FindBy(xpath = "//h5[@class=\"mt-0\"]") public WebElement sortLessons1Window;
    @FindBy(xpath = "(//div[@class=\"card mb-0 mt-2 draggable-item\"])[1]") public WebElement sortLessons1ArrayBinaryDrag;
    @FindBy(xpath = "(//div[@class=\"card mb-0 mt-2 draggable-item\"])[3]") public WebElement sortLessons1OCASoruListsDrop;
    @FindBy(xpath = "(//button[@class=\"close\"])[5]") public WebElement sortLessonsCloseButton;
    @FindBy(xpath = "//button[@id=\"lesson-sort-btn\"]") public WebElement sortLessonsUpdateButton;
    @FindBy(xpath = "/html/body/div[11]/div") public WebElement lessonUpdateSortedMessage;
    @FindBy(xpath = "(//input[@class=\"form-control\"])[9]") public WebElement updateSectionEditTitleBox;
    @FindBy(xpath = "(//button[text()=\"Submit\"])[2]") public WebElement updateOchEditSectionSubmitButton;
    @FindBy(xpath = "//*[text()=\"Section has been updated successfully\"]") public WebElement sectionHasBeenUpdatedSuccesMessage;
    @FindBy(xpath = "(//h5[@class=\"card-title\"])[1]") public WebElement section1HeadTitle;
    @FindBy(xpath = "//span[text()=\"Section 3\"]") public WebElement cardBodySectionTable3;
    @FindBy(xpath = "(//button[@class=\"btn btn-outline-secondary btn-rounded btn-sm ml-1\"])[1]") public WebElement editSection3Button;
    @FindBy(xpath = "(//button[@class=\"btn btn-secondary\"])[1]") public WebElement editAndUpdateSection3CloseButton;
    @FindBy(xpath = "(//div[@class=\"modal-content\"])[6]") public WebElement editAndUpdateSection3Window;
    @FindBy(xpath = "//span[text()=\"Section 6\"]") public WebElement cardBodySectionTable6;
    @FindBy(xpath = "(//button[@class=\"btn btn-outline-secondary btn-rounded btn-sm ml-1\"])[12]") public WebElement section6TableDeleteButton;
    @FindBy(xpath = "//a[@id=\"update_link\"]") public WebElement sectionDeleteAlertContinueButton;
    @FindBy(xpath = "//*[text()=\"Section has been deleted successfully\"]") public WebElement sectionHasBeenDeletedSuccessMessage;
    @FindBy(xpath = "(//div[@class=\"col-xl-12\"])[5]") public WebElement section2Lesson2ListFrame;
    @FindBy(xpath = "(//div[@class=\"card text-secondary on-hover-action mb-2\"])[6]") public WebElement section2Lesson2CardFrame;
    @FindBy(xpath = "(//i[@class=\"mdi mdi-pencil-outline\"])[8]") public WebElement section2Lesson2EditIcon;
    @FindBy(xpath = "(//i[@class=\"mdi mdi-window-close\"])[8]") public WebElement section2Lesson2DeleteIcon;
    @FindBy(xpath = "//h5[@class=\"modal-title\"]") public WebElement updateLessonWindowTitle;
    @FindBy(xpath = "(//span[@aria-hidden=\"true\"])[6]") public WebElement updateLessonCloseButton;
    @FindBy(xpath = "//span[@id=\"select2-section_id-container\"]") public WebElement section2UpdateLessonSectionSelelect;
    @FindBy(xpath = "(//div[@class=\"col-md-12\"])[13]") public WebElement section7Lesson1ListFrame;
    @FindBy(xpath = "(//a[@data-original-title=\"Delete\"])[13]") public WebElement section7Lesson1DeleteIcon;
    @FindBy(xpath = "(//div[@class=\"text-center\"])[2]") public WebElement lessonDeleteAlertWindow;
    @FindBy(xpath = "//*[text()=\"Lesson has been deleted successfully\"]") public WebElement lessonBeenDeletedSuccessMessage;
    public void loginMethodLejon(){

        lejonCookies.click();
        ReusableMethods.bekle(2);
        lejonLoginLink.click();
        emailBox.sendKeys(ConfigReader.getProperty("lejonEmailIns"));
        passwordBox.sendKeys(ConfigReader.getProperty("lejonPasswordIns"));
        loginButton.click();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(welcomeMessage.isDisplayed(), "The Welcome Message does not appear on the screen");
        instructorButtonLejon.click();
        courseManagerLinkLejon.click();

        JavascriptExecutor javaScript = (JavascriptExecutor) Driver.getDriver();
        javaScript.executeScript("arguments[0].scrollIntoView();", threeDotsIcon);
        threeDotsIcon.click();
        editThisCourseLejon.click();
    }
    public void addLessonMethodLejon(){
        addLessonButton.click();
        selectLessonTypeVimeo.click();

        Actions actions = new Actions(Driver.getDriver());
        actions.click(selectLessonTypeYoutube).perform();

        lessonTypeNextButton.click();
    }













































//---------------------1376==1525-------------------TALHA------------------------------------------------------//
@FindBy (xpath = "//a[text () = 'Instructor']")
public WebElement Instructor;
@FindBy (xpath = "//span[text ()= 'Course manager']")
public WebElement c_manager;
@FindBy (xpath = "//a[@class='btn btn-outline-primary btn-rounded alignToTitle']")
public WebElement add_newcourse;
@FindBy (xpath = "//span[text()='Requirements']")
public WebElement requirements;
@FindBy (xpath = "//Input[@name='requirements[]']")
public WebElement requirementsbox;
@FindBy (xpath = "//button[@onclick='appendRequirement()']")
public WebElement addbutton;
@FindBy (xpath = "//i[@class='mdi mdi-camera-control']")
public WebElement outcomesection;
@FindBy (xpath = "(//input[@name='outcomes[]'])[1]")
public WebElement outcomestextbox;
@FindBy (xpath = "//button[@onclick='appendOutcome()']")
public WebElement addoutcomebutton;
@FindBy (xpath = "//input[@placeholder='Enter course title']")
public WebElement entercoursetitle;
@FindBy (xpath = "//textarea[@id='short_description']")
public WebElement shortdescription;
@FindBy (xpath = "//div[@class='note-editable card-block']")
public WebElement description;
@FindBy (xpath = "(//span[@class='select2-selection__rendered'])[1]")
public WebElement category;
@FindBy (xpath = "//span[@id='select2-level-container']")
public WebElement Level;
@FindBy (xpath = "(//label[@for='enable_drip_content'] )[2]")
public WebElement Enable_Drip;
@FindBy (xpath = "(//label[@class='custom-control-label'] )[1]")
public WebElement checkbox;





















































































































//-------------------------1526==1675---------------BORA------------------------------------------------------//

    //Home Page
    @FindBy (xpath = "//img[@src='https://qualitydemy.com/uploads/system/393645bf994114c23be28028a47a77a0.png']")
    public WebElement homePage;
    //Home Page > Categories > Web Design Course   //i[@class='fas fa-bars text-16px']
    @FindBy (xpath = "(//a[@class='py-2 text-wrap d-flex'])[1]")
    public WebElement categoriWebDesing;
    //Home Page > Categories > Web Design Course > Web Design for Web Developers
    @FindBy (xpath = "//*[text()='Web Design for Web Developers']")
    public WebElement webDevelopers;
    //Home Page > Categories > Web Design Course > Web Design for Web Developers > Wordpress
    @FindBy(xpath = "(//div[@class='course-image'])[3]")
    public WebElement wordpresslink;
    //Home Page > Categories > Web Design Course > Wordpress > Buy now
    @FindBy (xpath = "//*[text()='Buy now']")
    public WebElement wordpressBuyNow;
    //Home Page > Shopping
    @FindBy(xpath = "(//a[@href='https://qualitydemy.com/home/shopping_cart'])[1]")
    public WebElement shoppingButton;
    //Home Page > Shopping > checkout
    @FindBy (xpath = "//button[@class='btn red w-100 radius-10 mb-3']")
    public WebElement checkoutButton;
    //Home Page > Shopping >  'Wordpress' course > checkout > stripe
    @FindBy (xpath = "//img[@class='payment-gateway-icon']")
    public WebElement stripeButoon;
    //Home Page > Shopping >  'Wordpress' course > checkout > stripe > payWithStripe
    @FindBy (xpath = "//button[@class='stripe-button payment-button float-end']")
    public WebElement payWithStripe;
    //Home Page > Shopping >  'Wordpress' course > checkout > close button
    @FindBy (xpath = "//i[@class='fa fa-times']")
    public WebElement closeButton;
    //Home Page > Shopping Card Page
    @FindBy (xpath = "//li[@class='breadcrumb-item active text-light display-6 fw-bold']")
    public WebElement shoppingCardPage;
    //Home Page > Shopping Card Page > Checkout sprite Page
    @FindBy (xpath = "(//input[@class='CheckoutInput Input Input--empty'])[1]")
    public WebElement checkoutEmail;
    //Home Page > Shopping Card Page > Checkout sprite Page
    @FindBy (xpath = "//input[@autocomplete='cc-number']")
    public WebElement cardNummer;
    //Home Page > Shopping Card Page > Checkout sprite Page
    @FindBy (xpath = "//input[@autocomplete='cc-exp']")
    public WebElement expDatum;
    //Home Page > Shopping Card Page > Checkout sprite Page
    @FindBy(xpath = "//input[@autocomplete='cc-csc']")
    public WebElement cardCVC;
    //Home Page > Shopping Card Page > Checkout sprite Page
    @FindBy (xpath = "//input[@autocomplete='ccname']")
    public WebElement nameOnCard;
    //Home Page > Shopping Card Page > Checkout sprite Page
    @FindBy (xpath = "//select[@autocomplete='billing country']")
    public WebElement countryName;
    //Home Page > Shopping Card Page > Checkout sprite Page
    @FindBy(xpath = "//*[text()='Sweden']")
    public WebElement countrySweden;

    // Home Page > MyCourses
    @FindBy(xpath = "(//*[text()='My courses'])[1]")
    public WebElement myCourses;
    // Home Page > MyCourses > Wordpress
    @FindBy (xpath = "//img[@src='https://qualitydemy.com/uploads/thumbnails/course_thumbnails/optimized/course_thumbnail_default_31666766582.jpg']")
    public WebElement myCoursePageWordpres;
    //
    @FindBy(xpath = "//div[@class='SubmitButton-IconContainer']")
    public WebElement payButton;

    //=======================================================================

    //Home Page > Categories > Web Design Course > HTML5 and CSS
    @FindBy (xpath = "(//*[text()='HTML5 and CSS'])[1]")
    public WebElement HTMLandCSS;
    //Home Page > Categories > Web Design Course > Web Design for Web Developers > Build Responsive Real-World Websites with HTML and CSS
    @FindBy(xpath = "//img[@src='https://qualitydemy.com/uploads/thumbnails/course_thumbnails/optimized/course_thumbnail_default_12.jpg']")
    public WebElement buildResponsiRealWorldHTMLandCSSlink;
    //Home Page > Categories > Web Design Course > Build Responsive Real-World Websites with HTML and CSS > Buy now
    @FindBy (xpath = "//*[text()='Buy now']")
    public WebElement courseBuyNow;








































































//---------------------1676==1825----------------NEVZAT------------------------------------------------------//





















































































































































}