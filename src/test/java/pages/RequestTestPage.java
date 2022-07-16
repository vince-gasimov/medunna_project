package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RequestTestPage {

        public RequestTestPage(){
            PageFactory.initElements(Driver.getDriver(),this);
        }
        @FindBy(xpath = "//*[text()='Request A Test']")
        public WebElement requestTestButton;

        @FindBy(xpath = "//h2[@id='c-test-item-heading']")
        public WebElement testItemsPage;

        @FindBy(xpath = "//button[@id='save-entity']")
        public WebElement requestTestSaveButton;

        @FindBy(xpath = "//*[text()='No Test Items found']")
        public WebElement noTestItemsFound;

        @FindBy(xpath = "/div[@class='Toastify__toast-container Toastify__toast-container--top-left toastify-container']")
        public WebElement aNewTestCreatedMessage;

        @FindBy(xpath = "//input[@id='1404']")
        public WebElement sodiumCheckBox;

        @FindBy(xpath = "//input[@id='1402']")
        public WebElement ureaCheckBox;

        @FindBy(xpath = "//input[@id='1408']")
        public WebElement hemoglobinCheckBox;

        @FindBy(xpath = "//input[@id='1407']")
        public WebElement albuminCheckBox;

        @FindBy(xpath = "//input[@id='1403']")
        public WebElement creatinineCheckBox;

        @FindBy(xpath = "//input[@id='1406']")
        public WebElement totalProteinCheckBox;

        @FindBy(xpath = "//input[@id='1405']")
        public WebElement potassiumCheckBox;

        @FindBy(xpath = "//table[@class='table']")
        public WebElement table;



}
