package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AdminRoomPage {

    public AdminRoomPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@href='/room']/*")
    public WebElement dropdownRoom;

    @FindBy(xpath = "//span[text()='Create a new Room']")
    public WebElement createANewRoom;

    @FindBy(xpath = "//*[@name='roomNumber']")
    public WebElement roomNumber;

    @FindBy(id = "room-roomType")
    public WebElement roomType;

    @FindBy(id = "room-status")
    public WebElement roomStatusCheckbox;

    @FindBy(id = "room-price")
    public WebElement roomPrice;

    @FindBy(id = "room-description")
    public WebElement roomDescription;

    @FindBy(id = "room-createdDate")
    public WebElement roomCreatedDate;

    @FindBy(xpath = "//span[text()='Save']")
    public WebElement saveButton;

    @FindBy(xpath= "//div[@class='Toastify__toast-body']")
    public List<WebElement> toastifyList;

    @FindBy(xpath = "//*[@role='alert']")
    public WebElement savedSuccessfullyText;


    public static void clickElementByJS(WebElement element) {
        JavascriptExecutor jsexecutor = ((JavascriptExecutor) Driver.getDriver());
        jsexecutor.executeScript("arguments[0].click();", element);
    }

    public static void selectDropdownItem(String item)
    {
        WebElement dropdownItem = Driver.getDriver().findElement(By.xpath("//span[text()='"+ item +"']"));
        clickElementByJS(dropdownItem);
    }



}
