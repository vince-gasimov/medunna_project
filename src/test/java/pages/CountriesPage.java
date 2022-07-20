package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CountriesPage {

    public CountriesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//h2[@id=\"country-heading\"]")
    public WebElement countriesText;

    @FindBy(xpath = "//a[@class=\"btn btn-primary float-right jh-create-entity\"]")
    public WebElement createANewCountryButton;

    @FindBy(xpath = "//div[@class=\"Toastify__toast-body\"]")
    public WebElement newCountryIsCreatedMessage;


    //Web elements of Create or edit a Country page
    @FindBy(xpath = "//input[@id=\"country-name\"]")
    public WebElement nameInput;

    @FindBy(id = "save-entity")
    public WebElement saveButton;

    //Web elements of delete page
    @FindBy(id = "jhi-confirm-delete-country")
    public WebElement popUpDeleteButton;

    @FindBy(id = "hospitalmsappfrontendApp.country.delete.question")
    public WebElement warningMessage;

    @FindBy(xpath = "//div[@class=\"Toastify__toast-body\"]")
    public WebElement countryIsDeletedMessage;



}
