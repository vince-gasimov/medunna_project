package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PatientView {

    public PatientView (){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "username")
    public WebElement usernameInput;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement SignInButton;

    @FindBy(xpath = "//h1[text()='Welcome to MEDUNNA']")
    public WebElement WelcomeMessage;

    @FindBy(xpath ="//span[text()='Items&Titles']")
    public WebElement  ItemsTitles;

    @FindBy(xpath ="//a[@class='dropdown-item']")
    public WebElement  Patient;

    @FindBy(xpath ="//td[text()='Elizbeth']")
    public WebElement  PatientName;

    @FindBy(xpath ="//a[contains(text(),'4859')]")
    public WebElement  PatientID;

    @FindBy(xpath ="//span[contains(text(),'Edit')]")
    public WebElement EditButton;

    @FindBy(xpath ="//input[@id='patient-firstName']")
    public WebElement  PatienFirsttNameInputBox;

    @FindBy(xpath ="//input[@id='patient-lastName']")
    public WebElement  PatienLasttNameInputBox;

    @FindBy(xpath ="//span[contains(text(),'Save')]")
    public WebElement  saveButton;

    @FindBy(xpath ="//input[@id='email']")
    public WebElement  patientEmail;

    @FindBy(xpath ="//input[@id='patient-adress']")
    public WebElement  patientAddress;

    @FindBy(xpath ="//select[@id='patient-gender']")
    public WebElement  patientGender;

    @FindBy(id ="patient-bloodGroup")
    public WebElement  patientBloodGroup;


    @FindBy(xpath ="//select[@id='patient-country']")
    public WebElement  patientCountry;



    @FindBy(xpath ="//select[@id='patient-cstate']")
    public WebElement  patientStateCity;

    @FindBy(xpath ="//input[@id='patient-phone']")
    public WebElement  patientPhone;

    @FindBy(xpath ="//textarea[@id='patient-description']")
    public WebElement  patientDescription;

    @FindBy(xpath ="  //input[@id='patient-birthDate']")
    public WebElement  patientBirthDate;


















}
