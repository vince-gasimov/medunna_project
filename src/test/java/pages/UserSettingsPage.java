package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class UserSettingsPage {

    public UserSettingsPage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }


    @FindBy(xpath = "//a[@aria-haspopup='true']")
    public WebElement userIconButton;

    @FindBy(id = "User settings for")
    public WebElement userSettingsFor;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//a[@class='dropdown-item']")
    public WebElement signInButton;

    @FindBy(xpath = "//a[@aria-haspopup='true']")  // userIconButton'la ayni ???
    public WebElement registratedUserButton;

    @FindBy(xpath = "(//span['Settings'])[24]")  // ??? x path or ???
    public WebElement settingsButton;

    @FindBy(className = "User settings for")
    public WebElement userSettingsForButton;


    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton2;


    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement firstName;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[1]")
    public WebElement firstNameError;

    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement lastName;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[2]")
    public WebElement lastNameError;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement eMail;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[3]")
    public WebElement eMailError;

    @FindBy(xpath = "// button[@type='submit']")
    public WebElement saveButton;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement popup;


}