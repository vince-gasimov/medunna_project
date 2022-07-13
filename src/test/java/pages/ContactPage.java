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
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[1]")
    public WebElement nameIsRequiredMessage;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[2]")
    public WebElement yourEmailIsRequiredMessage;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[3]")
    public WebElement subjectThisFieldIsRequiredMessage;
    @FindBy(xpath ="//*[contains (text(),'Your message has been received')]" )
    public WebElement receivedMessage;



}