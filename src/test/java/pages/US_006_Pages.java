package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_006_Pages {

    public US_006_Pages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[text()='Sign in']")
    public WebElement signInButton;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//li[@id='account-menu']")
    public WebElement registratedUserButton;

    @FindBy(xpath = "//*[text()='Settings']")
    public WebElement settingsButton;

    @FindBy(xpath = "//*[contains(text(),'User settings for')]")
    public WebElement userSettingsForText;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton2;

    @FindBy(xpath = "//*[@id='firstName']")
    public WebElement firstName;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[1]")
    public WebElement firstNameError;

    @FindBy(xpath = "//input[@id='lastName']")
    public WebElement lastName;

    @FindBy(xpath = "(//*[@class='text-danger form-group'])[2]")
    public WebElement lastNameError;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement eMail;

    @FindBy(xpath = "(//*[@class='text-danger form-group'])[3]")
    public WebElement eMailError;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveButton;

    @FindBy(xpath = "//*[text()='Settings saved!']")
    public WebElement popup;
}


