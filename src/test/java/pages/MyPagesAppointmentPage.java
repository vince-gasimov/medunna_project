package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MyPagesAppointmentPage {
    public MyPagesAppointmentPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@class='svg-inline--fa fa-user fa-w-14 ']")
    public WebElement firstSignIn;

    @FindBy(id = "login-item")
    public WebElement signIn;

 @FindBy(xpath = "//*[text()='MY PAGES']")
  public WebElement myPages;

    @FindBy(xpath = "//*[@class='svg-inline--fa fa-calendar-week fa-w-14 fa-fw ']")
    public WebElement myAppointments;

    @FindBy(xpath = "//*[text()='Edit']")
    public WebElement editButton;

    @FindBy(xpath = "//*[@id='hospitalmsappfrontendApp.appointment.home.createOrEditLabel']/span")
    public WebElement createEditAppointmentText;

    @FindBy(name = "id")
    public WebElement id;

    @FindBy(xpath = "//*[@class='table']/tbody/tr[1]/td[1]")
    public WebElement appointmentID;

    @FindBy(name = "startDate")
    public WebElement startDate;

    @FindBy(name = "endDate")
    public WebElement endDate;

    @FindBy(name = "status")
    public WebElement status;

    @FindBy(name = "physician.id")
    public WebElement physician;

    @FindBy(name = "anamnesis")
    public WebElement anamnesis;

    @FindBy(name = "treatment")
    public WebElement treatment;

    @FindBy(name = "diagnosis")
    public WebElement diagnosis;

    @FindBy(name = "prescription")
    public WebElement prescription;

    @FindBy(name = "description")
    public WebElement description;

    @FindBy(xpath = "//*[@id='save-entity']")
    public WebElement saveButton;

    @FindBy(xpath = "//*[@role='alert']")
    public WebElement savedSuccessfullyText;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[1]")
    public WebElement anamnesisError;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[2]")
    public WebElement treatmentError;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[3]")
    public WebElement diagnosisError;

    @FindBy(xpath = "//*[@class='table']/tbody/tr[1]/td[4]/span")
    public WebElement statusCheck;



}
