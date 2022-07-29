package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='appointment-btn scrollto']")
    public WebElement makeAnAppointment;
    @FindBy(xpath = "//*[@data-icon='user']")
    public WebElement userIcon;
    @FindBy(xpath = "//*[text()='Register']")
    public WebElement registerButton;
    @FindBy(xpath = "//*[text()='Sign in']")
    public WebElement signInButton;
    @FindBy(xpath = "//*[@id='entity-menu']")
    public WebElement itemsAndTitlesButton;
    @FindBy(xpath = "//a[@href='/patient']")
    public WebElement patientButton;

    @FindBy(xpath = "//*[@id='account-menu']")
    public WebElement profil;

    @FindBy(xpath = "//div[@class='invalid-feedback']")
    public WebElement invalidmessage;

    @FindBy(linkText = "SIGN IN AGAIN")
    public WebElement signInAgain;
    @FindBy(xpath = "//*[@id='hero']/div/h1")
    public WebElement homePage;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInBox;
    @FindBy(xpath = "(//span)[10]")
    public WebElement contact;



    @FindBy(xpath = "//a[@aria-haspopup=\"true\"]")
    public WebElement icon;
    @FindBy(xpath = "//div[@class=\"container\"]//h1")
    public WebElement welcomeToMedunnaText;




}
