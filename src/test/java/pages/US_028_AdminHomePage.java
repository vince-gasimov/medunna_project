package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_028_AdminHomePage {

    public US_028_AdminHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //Web elements of admin home page
    @FindBy(xpath = "//*[text()='Items&Titles']")
    public WebElement itemsTitles;

    @FindBy(xpath = "//a[@href=\"/country\"]")
    public WebElement countryLink;

    @FindBy(xpath = "//a[@href=\"/c-state\"]//span")
    public WebElement stateCityLink;

    @FindBy(xpath = "//span[.='Admin Adminlast']")
    public WebElement adminAdminLast;

    @FindBy(xpath = "//a[@href=\"/logout\"]")
    public WebElement signOut;
}
