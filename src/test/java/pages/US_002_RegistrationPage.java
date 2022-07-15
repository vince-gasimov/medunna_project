package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_002_RegistrationPage {

    public US_002_RegistrationPage(){
        PageFactory.initElements(Driver.getDriver(),this );
    }

        @FindBy(id = "register-title")
        public WebElement RegistrationTitle;

        @FindBy(xpath = "//input[@name=\"ssn\"]")
        public WebElement SSN;

        @FindBy(xpath = "//input[@name=\"firstName\"]")
        public WebElement firstName;

        @FindBy(xpath = "//input[@name=\"lastName\"]")
        public WebElement lastName;

        @FindBy(xpath = "//input[@name=\"username\"]")
        public WebElement username;

        @FindBy(xpath = "//div[@class=\"invalid-feedback\"]")
        public WebElement usernameIsInvalidMessage;

        @FindBy(xpath = "//input[@name=\"email\"]")
        public WebElement email;

        @FindBy(xpath = "//input[@name=\"firstPassword\"]")
        public WebElement newPassword;

        @FindBy(xpath = "//input[@name=\"secondPassword\"]")
        public WebElement newPasswordConfirmation;

        @FindBy(xpath = "//button[@type='submit']")
        public WebElement registerButton;

        @FindBy(xpath = "//*[contains(text(),'Registration Saved')]")
        public WebElement registrationSavedMessage;

        @FindBy(linkText = "HOME")
        public WebElement homeButton;

        @FindBy(xpath = "//div[@class=\"invalid-feedback\"]")
        public WebElement yourUsernameIsRequiredMessage;

        @FindBy(xpath = "//div[@class=\"invalid-feedback\"]")
        public WebElement yourUsernameIsInvalidMessage;

        @FindBy(xpath = "//div[@class=\"invalid-feedback\"]")
        public WebElement thisFieldIsInvalidMessage;

        @FindBy(xpath = "//div[@class=\"invalid-feedback\"]")
        public WebElement yourEmailIsRequiredMessage;


}
