package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_18_Page {
    public US_18_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='appointment-btn scrollto']")
    public WebElement makeAnAppointment;

    @FindBy(id = "firstName")
    public WebElement firstName;

    @FindBy(id = "lastName")
    public WebElement lastName;

    @FindBy(id = "ssn")
    public WebElement ssn;

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "phone")
    public WebElement phone;

    @FindBy(id = "appoDate")
    public WebElement date;

    @FindBy(id = "register-submit")
    public WebElement submitButton;

    @FindBy(id = "account-menu")
    public WebElement signInButton;

    @FindBy(xpath = "//a[@class='dropdown-item'][2]")
    public WebElement registerButton;

    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement ssnButton;

    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement firstNameButton;

    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement lastNameButton;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement userNameButton;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailButton;

    @FindBy(xpath = "//input[@name='firstPassword']")
    public WebElement firstPasswordButton;

    @FindBy(xpath = "//input[@name='secondPassword']")
    public WebElement secondPasswordButton;

    @FindBy(xpath = "//*[@id='register-submit']")
    public WebElement registerSubmitButton;

    @FindBy(id = "login-item")
    public WebElement lastsignInButton;

    @FindBy(id = "username")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submit;

    @FindBy(xpath = "//*[@id='account-menu']")
    public WebElement profil;

    @FindBy(xpath = "//div[@class='invalid-feedback']")
    public WebElement invalidmessage;

    @FindBy(id = "entity-menu")
    public WebElement itemsTitles;

    @FindBy(xpath = "//a[@class='dropdown-item'][3]")
    public WebElement physicianbutton;

    @FindBy(xpath = "//a[@id='jh-create-entity']")
    public WebElement createNewPhysicianBox;


    @FindBy(id = "searchSSN")
    public WebElement ssnBox;

    @FindBy(id = "physician-firstName")
    public WebElement nameBox;

    @FindBy(id = "physician-lastName")
    public WebElement lastNameBox;

    @FindBy(id = "physician1-birthDate")
    public WebElement dateBox;

    @FindBy(id = "physician-phone")
    public WebElement phoneBox;

    @FindBy(id = "physician-speciality")
    public WebElement specialityBox;

    @FindBy(id = "file_image")
    public WebElement chooseFileBox;

    @FindBy(xpath = "//input[@name='examFee']")
    public WebElement examFeeBox;
    //input[@name='examFee']

    @FindBy(id = "save-entity")
    public WebElement saveBox;

    @FindBy(id = "useSSNSearch")
    public WebElement searchBox;

    @FindBy(xpath = "//button[@class='btn btn-secondary']")
    public WebElement searchButton;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement ssnMessage;


    @FindBy(xpath = "(//a[@class='page-link'])[3]")
    public WebElement firstPageButton;

    @FindBy(xpath = "(//a[@class='btn btn-primary btn-sm'])[1]")
    public WebElement editBox;

    @FindBy(id = "physician-phone")
    public WebElement editPhoneBox;


    @FindBy(id = "//div[@role='alert']")
    public WebElement editSuccessfulMsj;

    @FindBy(xpath = "(//a[@class='btn btn-danger btn-sm'])[19]")
    public WebElement deleteBox;

    @FindBy(xpath = "(//a[@class='page-link'])[6]")
    public WebElement PageButton;

    @FindBy(id = "jhi-confirm-delete-physician")
    public WebElement confirmDeleteBox;

    @FindBy(id = "register-submit")
    public WebElement registerSubmit;
}


