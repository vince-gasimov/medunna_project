package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ResetPasswordPage {

    public ResetPasswordPage() {PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath="//input[@name='email']")
    public WebElement emailField;

    @FindBy(xpath ="//button[@type='submit']")
    public WebElement resetPassword;


    @FindBy(xpath = "//*[@class='Toastify__toast-container Toastify__toast-container--top-left toastify-container']")
    // @FindBy(xpath = "(//div[@role='alert'])[1]")
    public WebElement checkYourEmailMessage;

    @FindBy(xpath ="//div[@class='invalid-feedback']")
    public WebElement invalidCharacterMessage;

    @FindBy(xpath = "//*[text()='Registration']")
    public WebElement registrationText;



}
