package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DoctorPage {

    public DoctorPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    //note:web elements of  doctor home page

    @FindBy(xpath = "//a[@href='#']")
    public WebElement myPages;

    @FindBy(xpath = "(//a[@href='/ps-in-patient'])[1]")
    public WebElement myInpatients;

    //note:web elements of my inpatients page

    @FindBy(xpath = "(//tbody/tr/td)[1]")
    public WebElement id;

    @FindBy(xpath = "(//tbody/tr/td)[2]")
    public WebElement startDate;

    @FindBy(xpath = "(//tbody/tr/td)[3]")
    public WebElement endDate;

    @FindBy(xpath = "(//tbody/tr/td)[4]")
    public WebElement status;

    @FindBy(xpath = "(//tbody/tr/td)[5]")
    public WebElement description;

    @FindBy(xpath = "(//tbody/tr/td)[6]")
    public WebElement createdDate;

    @FindBy(xpath = "(//tbody/tr/td)[7]")
    public WebElement room;

    @FindBy(xpath = "(//tbody/tr/td)[8]")
    public WebElement appointment;

    @FindBy(xpath = "(//tbody/tr/td)[9]")
    public WebElement patient;

    @FindBy(xpath = "//table[@class='table']" )
    public WebElement entireTable;

    @FindBy(xpath = "(//span)[37]")
    public WebElement edit;

    @FindBy(xpath = "(//span)[15]")
    public WebElement doctorName;

    @FindBy(xpath = "//a[@href='/logout']")
    public WebElement signOut;


//note: web elements of updating page

    @FindBy(xpath="//input[@name='description']")
    public WebElement descriptionBox;

    @FindBy(xpath="//input[@id='in-patient-createdDate']")
    public WebElement createdDateEdit;

    @FindBy(xpath = "//select[@id='in-patient-status']")
    public WebElement statusEdit;

    @FindBy(xpath ="//select[@id='in-patient-room']")
    public WebElement roomEdit;

    @FindBy(xpath = "//button[@id='save-entity']")
    public WebElement save;

    @FindBy(xpath ="//*[contains (text(),'The In Patient is updated with identifier')]")
    public WebElement updatedMessage;

    @FindBy(xpath ="//*[contains (text(),'InPatient status can not be changed ')]")
    public WebElement canNotBeUpdatedMessage;

    @FindBy(xpath ="//*[contains (text(),'Such a room not found')]")
    public WebElement suchARoomNotFoundMessage;

    @FindBy(xpath ="//*[contains (text(),'The room already reserved')]")
    public WebElement theRoomAlreadyReservedMessage;






}