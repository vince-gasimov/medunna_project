package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class US_010_AppointmentsListPage {

    public US_010_AppointmentsListPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "username")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton;

    @FindBy(xpath ="//*[@id='entity-menu']/a/span")
    public WebElement mypages;

    @FindBy(xpath = "//*[@id='entity-menu']/div/a[1]/span")
    public WebElement myappointments;

    @FindBy(id="appointment-heading")
    public WebElement Heading;

    @FindBy(id="starDate")
    public WebElement starDate;

    @FindBy(id="endDate")
    public WebElement endDate;

    @FindBy(xpath = "(//*[tr])[1]")
    public WebElement AppointmentsTable;

    @FindBy(xpath = "(//*[tr])[2]")
    public WebElement InfoAppointmentsTable;

    @FindBy(xpath = "//thead//tr//th")
    public List<WebElement> appoinmentList;

}

