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

    @FindBy(xpath = "(//tbody/tr/td)[1]")   //td 1 ve 11 i gorse yeter diycem ama bulmuyor
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

    @FindBy(xpath = "(//span)[37]")
    public WebElement edit;

    @FindBy(xpath = "(//span)[15]")
    public WebElement doctorName;

    @FindBy(xpath = "//a[@href='/logout']")
    public WebElement signOut;


//note: web elements of updating page


}