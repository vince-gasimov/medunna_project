package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class US_25_PatientAppointmentPage {
    public US_25_PatientAppointmentPage (){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//input[@id='firstName']")
    public WebElement firstNameBox;
    @FindBy(xpath = "//div[@class='invalid-feedback']")
    public WebElement invalidError;
    @FindBy(xpath = "//input[@id='lastName']")
    public WebElement lastNameBox;
    @FindBy(xpath = "//input[@id='ssn']")
    public WebElement ssnBox;
    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailBox;
    @FindBy(xpath = "//input[@id='phone']")
    public WebElement phoneBox;
    @FindBy(xpath = "//input[@id='appoDate']")
    public WebElement appointmentDate;
    @FindBy(xpath = "//span[.='MY PAGES(PATIENT)']")
    public WebElement myPages;
    @FindBy(xpath = "//span[.='Make an Appointment']")
    public WebElement makeAppointment;
    @FindBy(xpath = "//div[.='Your FirstName is required.']")
    public WebElement firstNameErrorMessage;
    @FindBy(xpath = "//div[.='Your LastName is required.']")
    public WebElement lastNameErrorMessage;
    @FindBy(xpath = "//div[.='Your SSN is required.']")
    public WebElement SSNErrorMessage;
    @FindBy(xpath = "//div[.='Your email is required.']")
    public WebElement emailErrorMessage;
    @FindBy(xpath = "//div[.='Phone number is required.']")
    public WebElement phoneNumberErrorMessage;
    @FindBy(xpath = "//span[.='Appointment date can not be past date!']")
    public WebElement pastAppDateErrorMessage;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement sendRequest;
    @FindBy(xpath = "//*[contains (text(),'Appointment registration saved!')]")
    public WebElement appSavedMessage;



}
