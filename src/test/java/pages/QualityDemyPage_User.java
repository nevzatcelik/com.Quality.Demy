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





















































































































































//---------------------------776==925-------------FATIH------------------------------------------------------//





















































































































































//-----------------------926==1075------------------MERYEM------------------------------------------------------//





















































































































































//-------------------------1076==1225---------------NESE------------------------------------------------------//





















































































































































//----------------------1226==1375------------------YAKUP------------------------------------------------------//





















































































































































//---------------------1376==1525-------------------TALHA------------------------------------------------------//





















































































































































//-------------------------1526==1675---------------BORA------------------------------------------------------//





















































































































































//---------------------1676==1825----------------NEVZAT------------------------------------------------------//





















































































































































}