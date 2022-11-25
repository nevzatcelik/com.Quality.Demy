package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class QualityDemyPage_User {
    public QualityDemyPage_User() {
        PageFactory.initElements( Driver.getDriver(), this );
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
    public WebElement signUpLink;
    //mainPage> Shopping cart icon at top right***
    @FindBy(xpath = "//*[@class='fas fa-shopping-cart']")
    public WebElement shoppingCartIcon;
    //mainPage> Search button named as "Search" *
    @FindBy(xpath = "(//button[@class='btn'])[2]")
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
    @FindBy(xpath = "//*[text()='Accept']")
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
    public WebElement welcomeMessage;
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
    // Home Page > Login Link > Login Page > Login Button (Login Page)
    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement loginButtonLoginPage;
    // Home Page > Login Link > Login Page > Login Button (Login Page)
    @FindBy(xpath = "(//script[@type='text/javascript'])[2]")
    public WebElement invalidLoginCridentialsPopup;
    // Home Page > Login Link > Login Page > Login Button (Login Page) > Test User Drop Down Menu
    @FindBy(xpath = "//img[@class='img-fluid']")
    public WebElement testUserDropDownMenu;
    // Home Page > Login Link > Login Page > Login Button (Login Page) > Test User Drop Down Menu > Log Out Button
    @FindBy(xpath = "//i[@class='fas fa-sign-out-alt']")
    public WebElement logOutButton;
    // Home Page > Sign Up Button > Login Button > Verification Code Page > Login Link
    @FindBy(xpath = "//a[@class='text-15px fw-700']")
    public WebElement verificationPageLoginLink;
    // Home Page > Login Button > Forgot Password Page > Forgot Password > Send Request Button (user e-mail)
    @FindBy(xpath = "(//script[@type='text/javascript'])[2]")
    public WebElement forgotPasswordCheckYourInboxForTheRequestPopup;
    // Home Page > Login Button > Forgot Password Page > Forgot Password > Send Request Button (unregistered e-mail)
    @FindBy(xpath = "(//script[@type='text/javascript'])[2]")
    public WebElement forgotPasswordUserNotFoundPopup;
    // https://tempmail.dev/tr > Mail Address
    @FindBy(xpath = "//div[@id='current-mail']")
    public WebElement tempMailEmailAddress;
    // https://tempmail.dev/tr > Message Preview
    @FindBy(xpath = "//div[@class='mail-details']")
    public WebElement tempMailMessageFirstClick;
    // https://tempmail.dev/tr > Verification Code in Mail
    @FindBy(xpath = "//u")
    public WebElement tempMailVerificationCode;
    // https://tempmail.dev/tr > Verification Text in Mail
    @FindBy(xpath = "//a[@title='QualityDemy']")
    public WebElement tempMailVerificationText;
    // Home Page > Login Link > Login Button
    @FindBy(xpath = "//a[@href='https://qualitydemy.com/login']")
    public WebElement loginButtonLev;
    // Home Page > Cookies Pop-Up
    @FindBy(xpath = "//a[@onclick='cookieAccept();']")
    public WebElement acceptCookiesLev;


















































    //----------------------------326==475------------MURAT-------------------------------------------------------//
    @FindBy(xpath = "//input[@id='last_name']")
    public WebElement lastName;
    @FindBy(xpath = "//input[@name='first_name']")
    public WebElement firstName;
    @FindBy(xpath = "//div[text()=\"Welcome Test User\"]")
    public WebElement welcomeMessage1;
    @FindBy(linkText = "//div[@id='course_info_view_6']")
    public WebElement wordPressTitle;
    @FindBy(linkText = "(//div[text()='Wordpress'])[2]")
    public WebElement wordPress;
    @FindBy(xpath = "//*[@id=\"4\"]")
    public WebElement addToCart250;
    @FindBy(xpath = "/html/body/section[3]/div/div/div[2]/div/div/div[3]/button[1]")
    public WebElement addToCart450;
    @FindBy(xpath = "//button[@class='btn btn-buy-now']")
    public WebElement addToCart150;
    @FindBy(xpath = "//a[text()='English Course Learn To Speak']")
    public WebElement cours250;
    @FindBy(xpath = "(//a[text()='Disney Magic English'])[2]")
    public WebElement cours450;
    @FindBy(xpath = "//a[text()='Wordpress']")
    public WebElement cours150;
    @FindBy(xpath = "//*[@id='4']")
    public WebElement removeButton250;
    @FindBy(xpath = "//a[text()='Reset']")
    public WebElement resetButton;
    @FindBy(xpath = "//button[@onclick='applyCoupon()']")
    public WebElement applyButton;
    @FindBy(xpath = "//b[text()='Make payment']")
    public WebElement payment;
    @FindBy(xpath = "//*[@id=\"sign_up\"]/div[5]/button")
    public WebElement passwordRBox;
    @FindBy(xpath = "//*[@id=\"registration-email\"]")
    public WebElement emailRBox;
    @FindBy(xpath = "//span[text()='50% Coupon code applied']")
    public WebElement couponCode50;
    @FindBy(xpath = "//input[@id='coupon-code']")
    public WebElement couponCode;
    @FindBy(xpath = "(//i[@class='fas fa-shopping-cart'])[1]")
    public WebElement shoppingCart;
    @FindBy(xpath = "//i[@class='fas fa-bars text-16px']")
    public WebElement categoriesDropDown;
    @FindBy(xpath = "(//*[text()='All courses'])[1]")
    public WebElement catagoriesAll;
    @FindBy(xpath = "//*[@class='mdi mdi-arrow-right-bold']")
    public WebElement NextButton;
    @FindBy(xpath = "//*[@placeholder='Enter course course price']")
    public WebElement coursePrice;
    @FindBy(linkText = "payment")
    public WebElement paymentLink;
    @FindBy(xpath = "//button[text()='Checkout']")
    public WebElement checkOut;
    @FindBy(xpath = "//span[@class='fw-500']")
    public WebElement dropDown;
    @FindBy(xpath = "//*[text()=' Back to course list']")
    public WebElement backToCourseListButton;
    @FindBy(xpath = "//div[text()=\"Welcome Test User\"]")
    public WebElement welcomeTestUser;
    @FindBy(xpath = "/html/body/section[3]/div/div[1]/div/div[2]/form/div/input")
    public WebElement mySearchBox;
    @FindBy(xpath = "/html/body/section[1]/div/nav/div[3]/div/a")
    public WebElement myCoursesButton;
    @FindBy(xpath = "//*[text()=' Purchase history']")
    public WebElement buttonPurchaseHistory;
    @FindBy(xpath = "//a[text()='Invoice']")
    public WebElement buttonInvoice;
    @FindBy(xpath = "//a[contains(text(), 'Res')]") //
    public WebElement buttonReset;
    @FindBy(xpath = "//a[@id='edit_rating_btn_6']")
    public WebElement editRating6;
    @FindBy(xpath = "//*[@id=\"star_rating_of_course_6\"]")
    public WebElement puan1out5;
    @FindBy(xpath = "//*[@id=\"star_rating_of_course_6\"]")
    public WebElement editRatingDropDown;
    @FindBy(xpath = "//*[@id=\"edit_rating_btn_3\"]")
    public WebElement editRating;
    @FindBy(xpath = "//*[@id=\"star_rating_of_course_3\"]")
    public WebElement scoringScreen;
    @FindBy(xpath = "//*[@id=\"course_rating_view_6\"]/form/a")
    public WebElement cancelButtonEditRating;
    @FindBy(xpath = "//*[@id=\"course_info_view_6\"]/div[2]/div/a")
    public WebElement startLesson;
    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/h5")
    public WebElement wordpressKurs;
    @FindBy(xpath = "//*[@id=\"course_rating_view_6\"]/form/button")
    public WebElement publishRating;
    @FindBy(xpath = "//*[@id=\"review_of_a_course_6\"]")
    public WebElement msgTextBox;
    @FindBy(xpath = "//input[@placeholder='First Name']")
    public WebElement fieldFirstName;
    @FindBy(xpath = "//input[@placeholder='Last name']")
    public WebElement fieldLastName;
    @FindBy(xpath = "//input[@placeholder='Email']")
    public WebElement fieldEmail;
    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement fieldPassword;
    @FindBy(xpath = "//button[text()='Sign Up']")
    public WebElement buttonNewSignUp;
    @FindBy(xpath = "//p[text()='Sign up and start learning']")
    public WebElement textSignUpAndStartLearning;
    @FindBy(xpath = "//label[text()='Verification code']")
    public WebElement verificationPage;
    @FindBy(className = "toast-message")
    public WebElement toastMessage;
    @FindBy(xpath = "//div[text()='You have already registered. Please verify your email address']")
    public WebElement alreadyRegistered;
    @FindBy(xpath = " //div[text()='Your registration has been successfully done. Please check your mail inbox to verify your email address.']")
    public WebElement firstRegisteredMessage;
    @FindBy(xpath = "//p[text()='The First Name field must be at least 2 characters in length.']")
    public WebElement warningFirstNameWrong;
    @FindBy(xpath = " //p[text()='The Last name field must be at least 2 characters in length.']")
    public WebElement warningLastNameWrong;
    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement buttonLogin;
    @FindBy(xpath = "//img[@height='35']")
    public WebElement logo99;
    @FindBy(xpath = "//span[text()='Categories']")
    public WebElement dropDownCategories;
    @FindBy(name = "query")
    public WebElement fieldSearchBox;
    @FindBy(xpath = "//i[@class='fas fa-shopping-cart']")
    public WebElement buttonCart;
    @FindBy(xpath = "(//a[text()='Sign Up'])[1]")
    public WebElement buttonSignUp;
    @FindBy(xpath = "//a[text()='Instructor']")
    public WebElement buttonInstructor;
    @FindBy(xpath = "//div/a[text()='My courses']")
    public WebElement buttonMyCourses;
    @FindBy(xpath = "//div[@id='wishlist_items']/div[@class='icon']/a")
    public WebElement buttonWishList;
    @FindBy(xpath = "//a[text()='Purchase history']")
    public WebElement optionPurchaseHistory;
    @FindBy(xpath = "//div[@class='user-box menu-icon-box']/div/a")
    public WebElement dropDownUserIcon;
    @FindBy(xpath = "//a[text()='User profile']")
    public WebElement optionUserProfile;
    @FindBy(xpath = "//a[text()=' Log out']")
    public WebElement optionLogout;
    @FindBy(xpath = "//div[@class='wishlist-box menu-icon-box']")
    public WebElement iconWishList;
    @FindBy(xpath = "//a[text()='Go to wishlist']")
    public WebElement dropDownGoToWishList;
    @FindBy(xpath = "(//button[@class='btn'])[1]")
    public WebElement buttonSearchBox;





   //---------------------------476==625-------------EMINE------------------------------------------------------//
@FindBy (xpath = "//img[@src='https://qualitydemy.com/uploads/system/393645bf994114c23be28028a47a77a0.png']")
public WebElement homePage;
    //Home Page >> Heart
    @FindBy (xpath = "(//i[@class='far fa-heart'])[1]")
    public WebElement heartButton;
    //Home Page >> Heart >> Go to WishList
    @FindBy (xpath = "//*[text()='Go to wishlist']")
    public WebElement goToWistListButton;
    //Home Page >> Heart >> Go to WishList >> Course 'React and Typescript' compare link
    @FindBy (xpath = "(//button[@class='btn-compare-sm float-end'])")
    public WebElement myWishListCompare1;
    //Home Page >> Heart >> Go to WishList >> Course compare page
    @FindBy (xpath = "//li[@class='breadcrumb-item active text-light display-6 fw-bold']")
    public WebElement courseComparePage;
    //Home Page > Heart > Go to MywishList > SearchBox
    @FindBy (xpath = "//input[@placeholder='Search my wishlist']")
    public WebElement searchMyWishlist;
    //Home Page > Heart > Go to MywishList > React and Typescript
    @FindBy (xpath = "(//*[text()='React and Typescript'])[2]")
    public WebElement reactAndTypescriptText;
    //Home Page > User Test
    @FindBy (xpath = "(//img[@src='https://qualitydemy.com/uploads/user_image/placeholder.png'])[1]")
    public WebElement userTestButton;
    //Home Page > Heart > Go to MywishList > React and Typescript > Admin User
    @FindBy (xpath = "//a[@class='text-14px fw-600 text-decoration-none']")
    public WebElement ReactandTypescriptinstrocturIcon;
    //Home Page > Heart > Go to MywishList > React and Typescriptins >  38:45:16 Hours On demand videos
    @FindBy (xpath = "(//span[@class='total-time'])[1]")
    public WebElement durationCourse;
    //Home Page > Heart > Go to MywishList > React and Typescriptins > 12 Lessons
    @FindBy (xpath = "//*[text()='12 Lessons']")
    public WebElement numberCourse;
    //Home Page > User Test >> Logg out
    @FindBy (xpath = "//*[text()=' Log out']")
    public WebElement loggOutButton;
    // ---------------------------------------- US_12 --------------------------------------
    //Home Page > Categories
    @FindBy (xpath = "//i[@class='fas fa-bars text-16px']")
    public WebElement categoriesE;
    //Home Page > Categories > Web Design Course
    @FindBy (xpath = "(//a[@class='py-2 text-wrap d-flex'])[1]")
    public WebElement categoriWebDesing;
    //Home Page > Categories > Web Design Course > Web Design for Web Developers
    @FindBy (xpath = "//*[text()='Web Design for Web Developers']")
    public WebElement webDevelopers;
    //Home Page > Categories > Web Design Course > Web Design for Web Developers > React and Typescriptins compare link
    @FindBy (xpath = "(//button[@class='btn-compare-sm'])[2]")
    public WebElement courseCompareReactandTypescriptinsButton;
    //Home Page > Categories > Web Design Course > Web Design for Web Developers
    // > React and Typescriptins compare link > Choose a course to compare 1
    @FindBy(xpath = "(//select[@class='form-select compare-select-box'])[2]")
    public WebElement courseComparePageChooseButton1;
    //Home Page > Categories > Web Design Course > Web Design for Web Developers
    // > React and Typescriptins compare link > Choose a course to compare 1 > Web design for PHP
    @FindBy(xpath = "(//option[@value='web-design-for-php_1'])[2]")
    public WebElement courseComparePageChooseButtonWebDesignforWebPHP;
    //Home Page > Categories > Web Design Course > Web Design for Web Developers
    // > React and Typescriptins compare link > Choose a course to compare 2
    @FindBy (xpath = "(//select[@class='form-select compare-select-box'])[3]")
    public WebElement courseComparePageChooseButton2;
    //Home Page > Categories > Web Design Course > Web Design for Web Developers
    // > React and Typescriptins compare link > Choose a course to compare 2 > Ultimate AWS Certified Solutions Architect Associate SAA-C03
    @FindBy (xpath = "(//option[@value='ultimate-aws-certified-solutions-architect-associate-saa-c03_7'])[3]")
    public WebElement courseComparePageChooseButton2SAA;
    //Home Page > Categories > Web Design Course > Web Design for Web Developers
    // > React and Typescriptins compare link > learn more link
    @FindBy (xpath = "//*[text()='Learn more ']")
    public WebElement reactandTypescriptinsLearnMoreLink;
    //------------------------US_14--------------------------------------------------------------
    //Home Page > Categories > Web Design Course > Wordpress
    @FindBy (xpath = "    //img[@src='https://qualitydemy.com/uploads/thumbnails/course_thumbnails/optimized/course_thumbnail_default_31666766582.jpg']\n")
    public WebElement wordpressButton;
    //Home Page > Categories > Web Design Course > Wordpress > Buy now
    @FindBy (xpath = "//*[text()='Buy now']")
    public WebElement wordpressBuyNow;
    //Home Page > Categories > Web Design Course > Wordpress > Buy now > Shopping Buy text
    @FindBy(xpath = "//li[@class='breadcrumb-item active text-light display-6 fw-bold']")
    public WebElement shoppingBuyPage;
    // Home Page > Test User > Purchase history
    @FindBy (xpath = "//*[text()='Purchase history']")
    public WebElement purchaseHistoryButton;
    //Home Page > Test User > Purchase history > Invoice Button
    @FindBy (xpath = "//*[text()='Invoice']")
    public  WebElement invoiceButton;
    //Home Page > Test User > Purchase history > Invoice Button > 'INVOICE' text
    @FindBy (xpath = "//h1[@class='page-title py-5 text-white print-hidden']")
    public WebElement invoiceText;
    //Home Page > Test User > Purchase history >  Disney Magic English
    @FindBy (xpath = "//a[@class='purchase-history-course-title']")
    public WebElement   disneyMagicEnglish;
    //Home Page > Test User > Purchase history >  Disney Magic English > Disney Magic English page
    @FindBy (xpath = "//div[@class='course-header-wrap']")
    public WebElement disneyMagicEnglishPage;
























































//-------------------------626==775--------------ZEYNEP------------------------------------------------------//





















































































































































//---------------------------776==925-------------FATIH------------------------------------------------------//





















































































































































//-----------------------926==1075------------------MERYEM------------------------------------------------------//





















































































































































//-------------------------1076==1225---------------NESE------------------------------------------------------//





















































































































































//----------------------1226==1375------------------YAKUP------------------------------------------------------//





















































































































































//---------------------1376==1525-------------------TALHA------------------------------------------------------//
    @FindBy (xpath = "(//a[@href='https://qualitydemy.com/home/my_courses'])[1]")
    public WebElement my_courses;
    @FindBy (xpath = "//a[@href='https://qualitydemy.com/home/course/java/180']")
    public WebElement coursedetaill;
    @FindBy (xpath = "(//div[@class='lecture-group-title clearfix'])[1]")
    public WebElement contextmenuopen;
    @FindBy (xpath = "(//div[@class='lecture-group-title clearfix collapsed'])[1]")
    public WebElement contextmenuclose;
    @FindBy (xpath = "(//a[@class='btn red radius-5 w-100'])[3]")
    public WebElement javastartbutton;
    @FindBy (xpath = "(//i[@class='fa fa-plus'])[1]")
    public WebElement clickplusbutton;
    @FindBy (xpath = "//label[@for='94']")
    public WebElement checkbox;







































































































































//-------------------------1526==1675---------------BORA------------------------------------------------------//





















































































































































//---------------------1676==1825----------------NEVZAT------------------------------------------------------//
    //Login>>HomePage==Instructor
    @FindBy(xpath = "//a[text()='Instructor']")
    public WebElement instructorButton;

    @FindBy (xpath = "(//input[@type='text'])[1]")
    public WebElement nameBox;

    @FindBy (xpath = "//input[@type='email']")
    public WebElement emailAdressBox;

    @FindBy (xpath = "//textarea[@name='address']")
    public WebElement adressBox;

    @FindBy(xpath = "//input[@name='phone']")
    public WebElement phoneNumberBox;

    @FindBy(xpath = "//textarea[@name='message']")
    public WebElement anyMessageBox;

    @FindBy(xpath = "//input[@onchange='changeTitleOfImageUploader(this)']")
    public WebElement document;

    @FindBy(xpath ="//button[text()='Apply']")
    public WebElement applyButton1;


    @FindBy(xpath = "//div[@class='jq-toast-single jq-has-icon jq-icon-success']")
    public WebElement applyCongrastMessage;










































































































}