package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_022_StaffEditPage {

    public US_022_StaffEditPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//li[@id='entity-menu']")
    public WebElement myPages;

    @FindBy(xpath = "//*[@id='entity-menu']/div/a[1]/span")
    public WebElement SearchPatient;

    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement PatientSSNSearchBox;

    @FindBy(xpath = "//div[@class='container-fluid view-container']")
    public  WebElement PatientDetailPage;

 //   @FindBy(xpath = "//*[@id='app-view-container']/div/div/div/div[2]/div/table/tbody/tr[1]/td[16]/div/a[3]/span/span")
   @FindBy(xpath = "(//span[.='Show Appointments'])[1]")
    public WebElement ShowAppoinments;

    @FindBy(xpath = "//a[@class='btn btn-primary btn-sm'][1]")
    public WebElement ShowTest;

    @FindBy(xpath = "//span[@class='d-none d-md-inline'][1]")
    public  WebElement ViewResult;

    @FindBy(xpath = "(//th[@class='hand'])[3]")
    public WebElement ViewResultWithNumber;

    @FindBy(xpath = "(//a[@class='btn btn-primary btn-sm'])[1]")
    public WebElement EditOnView;

    @FindBy(xpath = "//*[@id='hospitalmsappfrontendApp.cTestResult.home.createOrEditLabel']/span")
    public WebElement CreateOrEditTestResult;

    @FindBy(xpath = "//*[@id='c-test-result-result']")
    public  WebElement ResultOnEdit;


    @FindBy(xpath = "//*[@id='save-entity']")
    public WebElement SaveOnEdit;


    @FindBy(xpath = "//div[@class='Toastify__toast-container Toastify__toast-container--top-left toastify-container']")
    public WebElement ResultUpdatedmessage;

    @FindBy(xpath = "//input[@name='id']")
    public  WebElement ID;

    @FindBy(xpath = "//input[@name='description']")
    public WebElement Description;










}
