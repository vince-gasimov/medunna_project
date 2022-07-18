package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

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

    @FindBy(xpath = "//select[@name='physician.id']")
    public WebElement physician;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement save;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement popup;

    @FindBy(xpath = "(//*[text()='Show Tests'])[2]")
    public WebElement ShowTests;


}
