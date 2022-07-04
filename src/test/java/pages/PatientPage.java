package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PatientPage {
    public PatientPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id='jh-create-entity']")
    public WebElement createNewPatientButton;

    @FindBy(xpath = "//*[@id='patient-firstName']")
    public WebElement firstNameBox;

    @FindBy(xpath = "//*[@id='patient-lastName']")
    public WebElement lastNameBox;

    @FindBy(xpath = "//*[@id='patient-birthDate']")
    public WebElement birthDateBox;

    @FindBy(xpath = "//*[@id='email']")
    public WebElement emailBox;

    @FindBy(xpath = "//*[@id='patient-phone']")
    public WebElement phoneBox;

    @FindBy(xpath = "//*[@id='patient-gender']")
    public WebElement genderBox;

    @FindBy(xpath = "//*[@id='patient-bloodGroup']")
    public WebElement bloodGroupBox;

    @FindBy(xpath = "//*[@id='patient-adress']")
    public WebElement addressBox;

    @FindBy(xpath = "//*[@id='patient-description']")
    public WebElement descriptionBox;

    @FindBy(xpath = "//*[@id='patient-user']")
    public WebElement userBox;

    @FindBy(xpath = "//*[@id='patient-country']")
    public WebElement countryBox;

    @FindBy(xpath = "//*[@id='patient-cstate']")
    public WebElement stateBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveButton;

    @FindBy(xpath = "//div[contains(text(),'A new Patient is created')]")
    public WebElement successMessage;


}
