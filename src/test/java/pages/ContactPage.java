package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import javax.xml.xpath.XPath;

public class ContactPage {

    public ContactPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='container']")
    public WebElement contactTitle;
    @FindBy(xpath = "//input[@placeholder='Name']")
    public WebElement name;
    @FindBy(xpath ="//input[@id='email']" )
    public WebElement email;
    @FindBy(xpath = "//input[@id='subject']")
    public WebElement subject;
    @FindBy(xpath ="//input[@id='message']" )
    public WebElement message;
    @FindBy(xpath ="//button[@id='register-submit']" )
    public WebElement sendButton;
    @FindBy(xpath = "//*[text()='Name is required.']")
    public WebElement nameIsRequiredMessage;
    @FindBy(xpath = "//*[text()='Your email is required.']")
    public WebElement yourEmailIsRequiredMessage;
    @FindBy(xpath = "//*[text()='This field is required.']")
    public WebElement subjectThisFieldIsRequiredMessage;
    @FindBy(xpath ="//*[contains (text(),'Your message has been received')]" )
    public WebElement receivedMessage;
    @FindBy(xpath = "//*[text()='This field is invalid']")
    public WebElement thisFieldIsInvalidMessage;




}