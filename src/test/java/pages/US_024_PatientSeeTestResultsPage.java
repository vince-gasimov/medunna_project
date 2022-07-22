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
    public WebElement myAppointmentsButton;

    @FindBy(xpath = "//*[@class='svg-inline--fa fa-th-list fa-w-16 ']")
    public WebElement showTestsButton;

    @FindBy(xpath = "//span[@class='d-none d-md-inline']")
    public WebElement viewResultsButton;

    @FindBy(xpath = "//*[text()='ID']")
    public WebElement idButton;

    @FindBy(xpath = "//*[text()='Name']")
    public WebElement nameButton;

    @FindBy(xpath = "//tbody/tr/td[4]")
    public WebElement defaultMinValueButton;

    @FindBy(xpath = "//tbody/tr/td[5]")
    public WebElement defaultMaxValueButton;

    @FindBy(xpath = "//*[text()='Description']")
    public WebElement descriptionButton;

    @FindBy(xpath = "//*[text()='Date']")
    public WebElement dateButton;

    @FindBy(xpath = "//span[text()='No Appointments found']")
    public WebElement noAppointmentsFoundMessage;

    @FindBy(xpath = "//div[@class='table-responsive']")
    public WebElement noTestFoundMessage;

    @FindBy(xpath = "//*[text()='Show Invoice']")
    public WebElement showInvoiceButton;

    @FindBy(xpath = "//th[normalize-space()='INVOICE']")
    public WebElement invoice;

}
