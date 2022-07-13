package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegisterPage {

    public RegisterPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[text()='Registration']")
    public WebElement registrationText;

    @FindBy(xpath = "//input[@id='ssn']")
    public WebElement ssnBox;

    @FindBy(xpath = "//*[text()='Your SSN is required.']")
    public WebElement ssnErrorMessage;

    @FindBy(xpath="//*[text()='Your SSN is invalid']")
    public WebElement ssnInvalidErrorMessage;

    @FindBy(xpath = "//input[@id='firstName']")
    public WebElement firstNameBox;

    @FindBy(xpath = "//*[text()='Your FirstName is required.']")
    public WebElement firstNameErrorMessage;

    @FindBy(xpath = "//input[@id='lastName']")
    public WebElement lastNameBox;

    @FindBy(xpath = "//*[text()='Your LastName is required.']")
    public WebElement lastNameErrorMessage;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailBox;

    @FindBy(xpath = "//input[@id='firstPassword']")
    public WebElement newPasswordBox;

    @FindBy(xpath = "//input[@id='secondPassword']")
    public WebElement confirmPasswordBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement registerButton;

    @FindBy(xpath = "//div[contains(text(),'Registration Saved')]")
    public WebElement registrationSuccessMessage;


}