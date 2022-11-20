package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class QualityDemyPage_User {
    public QualityDemyPage_User() {
        PageFactory.initElements(Driver.getDriver(), this);
    }












    //---------------------------24==175------GURSEL--------------------------------------------------------//
    //mainPage> Quality Demy logo *
    @FindBy(xpath = "//*[@class='navbar-brand pt-2 mt-1']")
    public WebElement logo;
    //mainPage> Categories heading *
    @FindBy(xpath = "//*[@class='fw-500']")
    public WebElement categories;
    //mainPage> Sign Up link at top right>***
    @FindBy(xpath = "//*[@class='btn btn-sign-up']")
    public  WebElement signUpLink;
    //mainPage> Shopping cart icon at top right***
    @FindBy(xpath = "//*[@class='fas fa-shopping-cart']")
    public WebElement shoppingCartIcon;
    //mainPage> Search button named as "Search" *
    @FindBy(xpath = "(//button[@class='btn'])[5]")
    public WebElement searchButton;
    //mainPage> Search Icon next to Categories *
    @FindBy(xpath = "(//button[@class='btn'])[1]")
    public WebElement searchIcon;
    //mainPage> 57 Online Courses Text inside the box *
    @FindBy(xpath = "(//div[@class='home-fact-box mr-md-auto mr-auto'])[1]")
    public WebElement onlineCoursesText;
    //mainPage> Expert instruction text *
    @FindBy(xpath = "//*[text()='Expert instruction']")
    public WebElement expertInstructionText;
    //mainPage> Lifetime access text *
    @FindBy(xpath = "//*[text()='Lifetime access']")
    public WebElement lifetimeAccessText;
    //mainPage> Top categories text under Lifetime access text *
    @FindBy(xpath = "(//span[@class='header-underline-2'])[1]")
    public WebElement topCategoriesText;
    //mainPage> Top courses text *
    @FindBy(xpath = "(//span[@class='header-underline-2'])[2]")
    public WebElement topCoursesText;
    //mainPage> Top 10 Latest Courses text *
    @FindBy(xpath = "(//span[@class='header-underline-2'])[3]")
    public WebElement top10LatestCoursesText;
    //mainPage> Featured instructor text *
    @FindBy(xpath = "(//span[@class='header-underline-2'])[4]")
    public WebElement featuredInstructorText;
    //mainPage> Get started button *
    @FindBy(xpath = "//*[@class='btn btn-primary px-4 py-2']")
    public WebElement getStartedButton;
    //mainPage> Join now button *
    @FindBy(xpath = "//*[@class='btn btn-danger px-4 py-2']")
    public WebElement joinNowButton;
    //mainPage> About Us heading under "Help"*
    @FindBy(xpath = "(//a[@class='link-secondary footer-hover-link'])[10]")
    public WebElement aboutUs;
    //mainPage> aboutUs> Course List Area *
    @FindBy(xpath = "//*[@class='category-course-list-area']")
    public WebElement courseListArea;
    //mainPage> aboutUs> Quality Demy photo *
    @FindBy(xpath = "//div[@class='col']")
    public WebElement qualityDemy;
    //mainPage> Web Design for Web Developers heading under Top Categories*
    @FindBy(xpath = "(//a[@class='link-secondary footer-hover-link'])[1]")
    public WebElement webDesignForWebDevelopers;
    //mainPage> webDesignForWebDevelopers> Web Design for PHP Heading *
    @FindBy(xpath = "(//a[@class='course-title'])[1]")
    public WebElement webDesignForPHP;
    //mainPage> English Speaking Course heading under Top Categories**
    @FindBy(xpath = "(//a[@class='link-secondary footer-hover-link'])[2]")
    public WebElement englishSpeakingCourse;
    //mainPage> englishSpeakingCourse> Eng. Spe. Cou. heading*
    @FindBy(xpath = "(//a[@class='course-title'])[1]")
    public WebElement englishCourseLearnToSpeakTitle;
    //mainPage> hTML5AndCSS heading under Top Categories*
    @FindBy(xpath = "(//a[@class='link-secondary footer-hover-link'])[3]")
    public WebElement hTML5AndCSS;
    //mainPage> hTML5AndCSS> HTML5 and CSS heading *
    @FindBy(xpath = "//*[@class='breadcrumb-item active text-light display-6 fw-bold']")
    public WebElement hTML5AndCSSHeading;
    //mainPage> piano heading under Top Categories *
    @FindBy(xpath = "(//a[@class='link-secondary footer-hover-link'])[4]")
    public WebElement piano;
    //mainPage> piano> "Learn Piano in WEEKS not years" subtitle *
    @FindBy(xpath = "(//div[@class='course-subtitle d-none d-md-block'])[1]")
    public WebElement learnPianoInWeeksNotYearsHeading;
    //mainPage> englishGrammar heading under Top Categories *
    @FindBy(xpath = "(//a[@class='link-secondary footer-hover-link'])[5]")
    public WebElement englishGrammar;
    //mainPage> englishGrammar> "Learn English Grammar" subtitle *
    @FindBy(xpath = "(//div[@class='course-subtitle d-none d-md-block'])[2]")
    public WebElement learnEnglishGrammar;
    //mainPage> aWSCertification heading under Top Categories *
    @FindBy(xpath = "(//a[@class='link-secondary footer-hover-link'])[6]")
    public WebElement aWSCertification;
    //mainPage>aWSCertification> "AWS Certification" subtitle *
    @FindBy(xpath = "//*[@class='breadcrumb-item active text-light display-6 fw-bold']")
    public WebElement aWSCertificationHeading;
    //mainPage> blog heading under Useful links*
    @FindBy(xpath = "(//a[@class='link-secondary footer-hover-link'])[7]")
    public WebElement blog;
    //mainPage> blog> "Latest Blogs" heading *
    @FindBy(xpath = " (//div[@class='col-12'])[1]")
    public WebElement latestBlogHeading;
    //mainPage> allCourses heading under Useful links *
    @FindBy(xpath = "(//a[@class='link-secondary footer-hover-link'])[8]")
    public WebElement allCourses;
    //mainPage> signUp heading under Useful links *
    @FindBy(xpath = "(//a[@class='link-secondary footer-hover-link'])[9]")
    public WebElement signUpHeading;
    //mainPage> signUp> "Sign Up" button *
    @FindBy(xpath = "//*[@class='btn red radius-5 mt-4 w-100']")
    public WebElement signUpButton;
    //mainPage> privacyPolicy heading under Help *
    @FindBy(xpath = "(//a[@class='link-secondary footer-hover-link'])[11]")
    public WebElement privacyPolicy;
    //mainPage> privacyPolicy> "Privacy Policy" top title *
    @FindBy(xpath = "//*[@class='breadcrumb-item active text-light display-6 fw-bold']")
    public WebElement privacyPolicyTopTitle;
    //mainPage> termsandCondition heading under Help *
    @FindBy(xpath = "(//a[@class='link-secondary footer-hover-link'])[12]")
    public WebElement termsAndCondition;
    //mainPage> termsandCondition> "Privacy Policy" top title *
    @FindBy(xpath = "//*[@class='breadcrumb-item active text-light display-6 fw-bold']")
    public WebElement termsAndConditionTopTitle;
    //mainPage> refundPolicy heading under Help *
    @FindBy(xpath = "(//a[@class='link-secondary footer-hover-link'])[13]")
    public WebElement refundPolicy;
    //mainPage> refundPolicy> "Refund Policy" top title *
    @FindBy(xpath = "//*[@class='breadcrumb-item active text-light display-6 fw-bold']")
    public WebElement refundPolicyTopTitle;




























    //-------------------------176==325---------------LEVENT-------------------------------------------------------//
    // Home Page > Login Link
    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement loginLink;
    // Home Page > Login Link > Email Box
    @FindBy(xpath = "//input[@id='login-email']")
    public WebElement emailBox;
    // Home Page > Login Link > Login Button
    @FindBy(xpath = "//button[text()='Login']")
    public WebElement loginButton;
    // Home Page > Cookies Pop-Up
    @FindBy(xpath = "//a[@onclick='cookieAccept();']")
    public WebElement acceptCookies;
    // Home Page > Login Link > Password Box
    @FindBy(xpath = "//input[@id='login-password']")
    public WebElement passwordBox;
    // Home Page > Facebook Icon
    @FindBy(xpath = "//i[@class='fab fa-facebook-f']")
    public WebElement facebookIcon;
    // Home Page > Twitter Icon
    @FindBy(xpath = "//i[@class='fab fa-twitter']")
    public WebElement twitterIcon;
    // Home Page > LinkedIn Icon
    @FindBy(xpath = "//i[@class='fab fa-linkedin']")
    public WebElement linkedinIcon;
    // Home Page > Login Link > Forgot Password Link
    @FindBy(xpath = "//a[@class='text-muted text-12px fw-500 float-end']")
    public WebElement forgotPasswordLink;
    // Home Page > Login Link > Login Page > Login Button > Welcome Message
    @FindBy(xpath = "(//script[@type='text/javascript'])[3]")
    public WebElement wellcomeMessage;
    // Home Page > Sign Up Button > First Name Box
    @FindBy(xpath = "//input[@name='first_name']")
    public WebElement firstNameBox;
    // Home Page > Sign Up Button > Last Name Box
    @FindBy(xpath = "//input[@name='last_name']")
    public WebElement lastNameBox;
    // Home Page > Sign Up Button > E-mail Box (at Sign Up Page)
    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailBoxSignUpPage;
    // Home Page > Sign Up Button > Password Box (at Sign Up Page)
    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordBoxSignUpPage;
    // Home Page > Sign Up Button > Login Button > Verification Code Page
    @FindBy(xpath = "//input[@id='verification_code']")
    public WebElement verificationCodeBox;
    // Home Page > Sign Up Button > Login Button > Verification Code Page
    @FindBy(xpath = "(//script[@type='text/javascript'])[3]")
    public WebElement verificationCodeWrongMessage;
    // Home Page > Sign Up Button > Login Button > Verification Code Page > Continue Button
    @FindBy(xpath = "(//button[@type='button'])[1]")
    public WebElement continueButton;
    // Home Page > Login Button > Forgot Password Page > Forgot Password Email Box
    @FindBy(xpath = "//input[@id='forgot-password-email']")
    public WebElement forgotPasswordEmailBox;
    // Home Page > Login Button > Forgot Password Page > Send Request Button
    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement sendRequestButton;
    // Home Page > Login Button > Forgot Password Page > Login Link (Under Send Request Button)
    @FindBy(xpath = "(//a[@href='https://qualitydemy.com/login'])[2]")
    public WebElement forgotPasswordLoginLink;

























































































    //----------------------------326==475------------MURAT-------------------------------------------------------//





















































































































































//---------------------------476==625-------------EMINE------------------------------------------------------//





















































































































































//-------------------------626==775--------------ZEYNEP------------------------------------------------------//





















































































































































//---------------------------776==925-------------FATIH------------------------------------------------------//





















































































































































//-----------------------926==1075------------------MERYEM------------------------------------------------------//





















































































































































//-------------------------1076==1225---------------NESE------------------------------------------------------//





















































































































































//----------------------1226==1375------------------YAKUP------------------------------------------------------//





















































































































































//---------------------1376==1525-------------------TALHA------------------------------------------------------//





















































































































































//-------------------------1526==1675---------------BORA------------------------------------------------------//





















































































































































//---------------------1676==1825----------------NEVZAT------------------------------------------------------//





















































































































































}