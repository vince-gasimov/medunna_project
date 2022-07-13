package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EditPatientInformation {

    public EditPatientInformation(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@value='109504']")
    public WebElement id;
    @FindBy(xpath = "(//input[@value='0000001Team83'])[1]")
    public WebElement firstName;
    @FindBy(xpath = "(//input[@value='0000001Team83'])[2]")
    public WebElement lastName;
    @FindBy(xpath = "//input[@value='2022-07-05T00:00']")
    public WebElement birthDate;
    @FindBy(xpath = "//input[@value='0000001Team83@gmail.com']")
    public WebElement email;
    @FindBy(xpath = "//input[@value='223-223-2222']")
    public WebElement phone;
    @FindBy(id = "patient-gender")
    public WebElement gender;
    @FindBy(id = "patient-bloodGroup")
    public WebElement bloodGroup;
    @FindBy(xpath = "//input[@value='123mainst']")
    public WebElement address;
    @FindBy(xpath = "//*[text()='111']")
    public WebElement description;
    @FindBy(xpath = "//select[@id='patient-user']")
    public WebElement user;
    @FindBy(id = "patient-country")
    public WebElement country;
    @FindBy(id = "patient-cstate")
    public WebElement state;
    @FindBy(xpath = "//button[@id='save-entity']")
    public WebElement saveButton;



}
