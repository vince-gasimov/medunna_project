package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_23_Invoice_Patient {

    public US_23_Invoice_Patient(){PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "//*[text()='Sign in']")
    public WebElement signInButton;


    //@FindBy(xpath = "//a[@aria-haspopup='true']")
    //public WebElement userIcon;

    //@FindBy(xpath = "//*[text()='MY PAGES']")
   // public WebElement myPagesButton;

    //@FindBy(xpath = "(//*[text()='Search Patient'])[1]")
    //public WebElement searchPatientButton;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "a//body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/button[2]/span[1]")
    public WebElement signIn;

    @FindBy(xpath = "//*[text()='MY PAGES(PATIENT)']")
    public WebElement myPages;

    @FindBy(xpath = "//span[contains(text(),'Make an Appointment')]")
    public WebElement makeAnAppointment;

    @FindBy(xpath = "//input[@id='phone']")
    public WebElement Phone;

    @FindBy(xpath = "//span[contains(text(),'Send an Appointment Request')]")
    public WebElement AppointmentRequest;





    @FindBy(xpath = "//a[@aria-haspopup='true']")
    public WebElement userIconRightCorner;

    @FindBy(xpath = "//*[text()='Sign in']")
    public WebElement sign;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement username;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;

  // @FindBy(xpath = "//*[text()='MY PAGES']")
 //   public WebElement myPagesButton;

  //  @FindBy(xpath = "(//*[text()='Search Patient'])[1]")
  //  public WebElement searchPatientButton;

    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement patientSsnButton;

    @FindBy(xpath = "//*[text()='Show Appointments']")
    public WebElement showAppButton;

    @FindBy(xpath = " //tbody/tr[2]/td[4]/span[1]")
    public WebElement status;

    @FindBy(xpath = "//tbody/tr[3]/td[13]/div[1]/a[3]/span[1]/span[1]")
    public WebElement invoice;

    @FindBy(xpath = "//a[contains(text(),'Create Invoice')]")
    public WebElement createInvoice;

    @FindBy(xpath = "//input[@id='bill-appointment']")
    public WebElement bill;

    @FindBy(xpath = "//span[contains(text(),'Save')]")
    public WebElement saveButton;
}
