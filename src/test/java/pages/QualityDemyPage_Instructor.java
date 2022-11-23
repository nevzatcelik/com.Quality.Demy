package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class QualityDemyPage_Instructor {
    public QualityDemyPage_Instructor() {
        PageFactory.initElements(Driver.getDriver(), this);
    }












    //---------------------------24==175------GURSEL--------------------------------------------------------//























































































































































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
    //Homepage => Categories => English Course
    @FindBy (xpath = "//span[text()='English Course']")
    public WebElement categoriesEnglish;
    //Homepage => Categories => IT & SoftWare
    @FindBy (xpath="//span[text()='IT & Software']")
    public WebElement categoriesIt;
    //Homepage => Categories => Music
    @FindBy (xpath= "//span[text()='Music']")
    public WebElement categoriesMusic;
    //Homepage => categories => Personel Developments
    @FindBy (xpath= "//span[text()='Personal Developments']")
    public WebElement categoriesPersonelDevelopments;
    //Homepage => Categories => All courses
    @FindBy (xpath= "//span[text()='All courses']")
    public WebElement categoriesAllCourses;
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
    //Homepage => User box icon => My messages => Cancel
    @FindBy (xpath = "(//button[@type='submit'])[2]")
    public WebElement messageCancelButton;
    //Homepage => User box icon => My messages => Compose
    @FindBy (xpath = "//button[@id='NewMessage']")
    public WebElement messageComposeButton;
    //Homepage => User box icon => My messages => correspondence
    @FindBy (xpath = "(//div[@class='message-sender-wrap'])[1]")
    public  WebElement correspondence;
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
    //Homepage => Instructor section => Pending Balance
    @FindBy (xpath = "//p[text()='Pending balance']")
    public WebElement pendingBalance;
    //Homepage => Instructor section => Number of Enrolment => Payout Report
    @FindBy (xpath = "//h4[@class='page-title']")
    public WebElement payOutReport;
    //Homepage => Instructor section => Requested withdrawal amount
    @FindBy (xpath = "//p[text()='Requested withdrawal amount']")
    public WebElement requestedWithdrawelAmount;

















































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













































































//----------------------1226==1375------------------YAKUP-----------------------------------------------------





















































































































































//---------------------1376==1525-------------------TALHA------------------------------------------------------//





















































































































































//-------------------------1526==1675---------------BORA------------------------------------------------------//





















































































































































//---------------------1676==1825----------------NEVZAT------------------------------------------------------//





















































































































































}