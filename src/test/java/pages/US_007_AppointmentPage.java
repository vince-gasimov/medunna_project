package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_007_AppointmentPage {

    public US_007_AppointmentPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
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
    @FindBy(xpath = "//*[text()='Appointment registration saved!']")
    public WebElement successMessage;
    @FindBy(id = "appoDate")
    public WebElement calendarButton;
    @FindBy(xpath = "//*[text()='Appointment date can not be past date!']")
    public WebElement pastDueWarning;
    @FindBy(xpath = "//*[text()='Internal server error.']")
    public WebElement errorMessage;
    @FindBy(xpath = "//input[@value='2035-03-12']")
    public WebElement futureDate;
    @FindBy(xpath = "//input[@value='2022-06-30']")
    public WebElement todaysDate;
    @FindBy(xpath = "//input[@id='appoDate']")
    public WebElement displayedDate;
}
