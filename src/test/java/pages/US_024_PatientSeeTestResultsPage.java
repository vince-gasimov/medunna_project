package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_024_PatientSeeTestResultsPage {

    public US_024_PatientSeeTestResultsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[text()='MY PAGES(PATIENT)']")
    public WebElement myPagesPatientButton;

    @FindBy(xpath = "//span[text()='My Appointments']")
    public WebElement  myAppointmentsButton;

    @FindBy(xpath = "//*[text()='Show Tests']")
    public WebElement showTestsButton;

    @FindBy(xpath = "//*[text()='View Results']")
    public WebElement viewResultsButton;

    @FindBy(xpath = "//*[text()='ID']")
    public WebElement idButton;

    @FindBy(xpath = "//*[text()='Name']")
    public WebElement nameButton;

    @FindBy(xpath = "//*[text()='Default Min. Value']")
    public WebElement defaultMinValueButton;

    @FindBy(xpath = "///*[text()='Default Max. Value']")
    public WebElement defaultMaxValueButton;

    @FindBy(xpath = "//*[text()='Description']")
    public WebElement descriptionButton;

    @FindBy(xpath = "//*[text()='Date']")
    public WebElement dateButton;

    @FindBy(xpath = "//*[text()='No Appointments found']")
    public WebElement noAppointmentsFoundMessage;

    @FindBy(xpath = "//*[text()='No Tests found']")
    public WebElement noTestFoundMessage;

    @FindBy(xpath = "//*[text()='Show Invoice']")
    public WebElement showInvoiceButton;

    @FindBy(xpath = "//*[text()='INVOICE']")
    public WebElement invoice;

}
