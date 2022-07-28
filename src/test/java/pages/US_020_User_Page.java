package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_020_User_Page {
    //initialize the page
    public US_020_User_Page() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//*[@id='admin-menu']/a/span")
    public WebElement administration;

    @FindBy(xpath = "//*[@id='admin-menu']/div/a/span")
    public WebElement userManagement;

    @FindBy(xpath = "//*[@id='admin-menu']/div/ul/li[1]/a/span")
    public WebElement users;

    @FindBy(xpath = "//*[text()='ID']")
    public WebElement idButton;

    @FindBy(xpath = "(//td/following-sibling::td[10]/div/a[1])[1]")
    public WebElement viewButton;

    @FindBy(xpath = "(//td/following-sibling::td[10]/div/a[2])[1]")
    public WebElement editButton;

    @FindBy(xpath = "(//td/following-sibling::td[10]/div/a[3])[1]")
    public WebElement deleteButton;

    @FindBy(xpath ="//div[@class='modal-footer']/button[2]")
    public WebElement deleteConfirmButton;

    @FindBy(xpath ="//*[contains(text(), 'A user is deleted')]")
    public WebElement userDeletedMessage;

    @FindBy(xpath = "//*[text()='First name']")
    public WebElement firstNameText;

    @FindBy(xpath = "//*[text()='Last name']")
    public WebElement lastNameText;

    @FindBy(xpath = "//*[text()='Email']")
    public WebElement emailText;

    @FindBy(xpath = "//input[@id='activated']")
    public WebElement activatedCheckbox;

    @FindBy(xpath = "//select[@id='authorities']")
    public WebElement profileDropdown;

    @FindBy(xpath = "//span[contains(text(),'Save')]")
    public WebElement saveButton;

    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement successMessage;

    @FindBy(xpath = "//div[@class='info jhi-item-count']")
    public WebElement userCount;

}
