package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class StatesCitiesPage {

    public StatesCitiesPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@href=\"/c-state/new\"]//span")
    public WebElement createNewStateCityButton;

    @FindBy(xpath = "//h2//span")
    public WebElement createNewStateCityText;

    @FindBy(id = "c-state-name")
    public  WebElement nameInput;

    @FindBy(id = "save-entity")
    public WebElement saveButton;

    @FindBy(id = "c-state-state")
    public WebElement stateCityDropdown;

    @FindBy(xpath = "//*[contains(text(),'New State/City is created')]")
    public WebElement newStateCityIsCreatedMessage;

}
