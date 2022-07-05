package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_015_Patients {

    public US_015_Patients(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[.='Items&Titles']")
    public WebElement itemsTitles;
    @FindBy(xpath = "//span[.='Patient']")
    public WebElement patient;
    @FindBy(xpath = "//a[@id='jh-create-entity']")
    public WebElement createNewPatient;
    @FindBy(xpath = "(//a[@class='btn btn-primary btn-sm'])[1]")
    public WebElement edit;
    @FindBy(xpath = "(//a[@class='page-link'])[9]")
    public WebElement lastPage;
    @FindBy(xpath = "//span[.='ID']")
    public WebDriver id;
    @FindBy(xpath = "//span[.='SSN']")
    public WebDriver ssn;
    @FindBy(xpath = "//span[.='First Name']")
    public WebDriver firstName;
    @FindBy(xpath = "//span[.='Last Name']")
    public WebDriver lastName;
    @FindBy(xpath = "//span[.='Birth Date']")
    public WebDriver birthDate;
    @FindBy(xpath = "//span[.='Phone']")
    public WebDriver phone;
    @FindBy(xpath = "///span[.='Gender']")
    public WebDriver gender;
    @FindBy(xpath = "//span[.='Blood Group']")
    public WebDriver bloodGroup;
    @FindBy(xpath = "//span[.='Address']")
    public WebDriver address;
    @FindBy(xpath = "//span[.='Description']")
    public WebDriver description;
    @FindBy(xpath = "//span[.='Created Date']")
    public WebDriver createdDate;
    @FindBy(xpath = "//span[.='User']")
    public WebDriver user;
    @FindBy(xpath = "(//span[.='Country'])[2]")
    public WebDriver country;
    @FindBy(xpath = "//span[.=' State/City']")
    public WebDriver stateCity;


}
