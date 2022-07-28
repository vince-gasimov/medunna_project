package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.security.cert.X509Certificate;

public class US_021_App_Page {

    public US_021_App_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@name='id']")
    public WebElement id;

    @FindBy(xpath = "//input[@name='startDate']")
    public WebElement startDate;

    @FindBy(xpath = "//input[@name='endDate']")
    public WebElement endDate;

    @FindBy(xpath = "//select[@name='status']")
    public WebElement status;

    @FindBy(xpath = "//textarea[@name='anamnesis']")
    public WebElement anamnesis;

    @FindBy(xpath = "//textarea[@name='treatment']")
    public WebElement treatment;

    @FindBy(xpath = "//textarea[@name='diagnosis']")
    public WebElement diagnosis;

    @FindBy(xpath = "//*[@id='appointment-physician']")
    public WebElement physician;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement save;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement popup;

    @FindBy(xpath = "//*[text()='Show Tests']")
    public WebElement ShowTests;

    @FindBy(xpath = "(//span[@class='d-none d-md-inline'])[1]")
    public WebElement viewResults;

    @FindBy(xpath = "//h2[@id='c-test-result-heading']")
    public  WebElement TestResultsText;

    @FindBy(xpath = "//select[@id='appointment-status']/option[2]")
    public WebElement pending;

    @FindBy(xpath = "//select[@id='appointment-status']/option[3]")
    public WebElement completed;

    @FindBy(xpath = "//*[text()='UNAPPROVED']")
    public WebElement actualStatus;

}
