package stepdefinitions.uiStepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.*;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static utilities.US_002_TXTWriter.readFile;
import static utilities.US_002_TXTWriter.saveMapToFile;

public class US_028_CountryStepDefs {

    HomePage homePage= new HomePage();
    LoginPage loginPage = new LoginPage();
    US_028_AdminHomePage adminHomePage= new US_028_AdminHomePage();
    CountriesPage countriesPage= new CountriesPage();
    Map<String, String> data= new HashMap<>();
    StatesCitiesPage statesCitiesPage= new StatesCitiesPage();

    @When("user clicks to Sign in button US028")
    public void user_clicks_to_sign_in_button_US028() {
        homePage.signInButton.click();
    }
    @Then("user verifies sign in pop up US028")
    public void user_verifies_sign_in_pop_up_US028() {
        ReusableMethods.waitForVisibility(loginPage.signInText,3);
        Assert.assertTrue(loginPage.signInText.isDisplayed());
    }
    @When("admin enters admin credentials and signs in US028")
    public void admin_enters_admin_credentials_and_signs_in_US028() {
        loginPage.usernameBox.sendKeys(ConfigurationReader.getProperty("US_028_admin_username"));
        loginPage.passwordBox.sendKeys(ConfigurationReader.getProperty("US_028_admin_password"));
        loginPage.signInButton.click();
    }
    @When("admin clicks on Items&Titles button US028")
    public void admin_clicks_on_items_titles_button_US028() throws InterruptedException {
        Thread.sleep(3000);
        adminHomePage.itemsTitles.click();
    }
    @When("admin clicks on Country US028")
    public void admin_clicks_on_country_US028() {
        adminHomePage.countryLink.click();
    }
    @Then("admin verifies landed on Countries page US028")
    public void admin_verifies_landed_on_countries_page_US028() {
        Assert.assertTrue(countriesPage.countriesText.isDisplayed());
    }
    @When("admin clicks on Create a new Country button US028")
    public void admin_clicks_on_create_a_new_country_button_US028() {
        countriesPage.createANewCountryButton.click();
    }
    @When("admin enters Country name US028")
    public void admin_enters_country_name_US028() {
        String country= Faker.instance().country().name();
        data.put("name",country);
        countriesPage.nameInput.sendKeys(country);
    }
    @When("admin clicks on Save button on country page US028")
    public void admin_clicks_on_save_button_on_country_page_US028 () {
        countriesPage.saveButton.click();
    }
    @Then("admin verifies A new Country is created with new id number message US028")
    public void admin_verifies_a_new_country_is_created_with_new_id_number_message_US028() {
        ReusableMethods.waitForVisibility(countriesPage.newCountryIsCreatedMessage,3);
        Assert.assertTrue(countriesPage.newCountryIsCreatedMessage.isDisplayed());
        String message= countriesPage.newCountryIsCreatedMessage.getText();
        String id= message.replaceAll("[^0-9]","");
        data.put("id",id);

    }
    @Then("admin verifies new created country is showing up in the country list US028")
    public void admin_verifies_new_created_country_is_showing_up_in_the_country_list_US028() {
        List<WebElement> listOfElements= Driver.getDriver().findElements(By.xpath("//tbody//td//a"));
        boolean flag=false;
        for (WebElement w:  listOfElements) {
            if(w.getText().equals(data.get("id"))){
                flag=true;
                break;
            }
        }
        Assert.assertTrue(flag);
    }

    @And("admin saves new created country and id US028")
    public void adminSavesNewCreatedCountryAndIdUS028() {
        saveMapToFile(data);
    }
    @When("admin clicks on StateCity US028")
    public void admin_clicks_on_statecity_US028() {
        adminHomePage.stateCityLink.click();
    }
    @When("admin clicks on Create a new StateCity button US028")
    public void admin_clicks_on_create_a_new_statecity_button_US028() {
        statesCitiesPage.createNewStateCityButton.click();
    }
    @Then("admin verifies landed on Create or edit a StateCity page US028")
    public void admin_verifies_landed_on_create_or_edit_a_statecity_page_US028() {
        Assert.assertTrue(statesCitiesPage.createNewStateCityText.isDisplayed());
    }
    @When("admin selects new created country from dropdown US028")
    public void adminSelectsNewCreatedCountryFromDropdownUS028() {
        String countryData= readFile(ConfigurationReader.getProperty("US_028_country_ui_data"));
        String[] countryArray= countryData.split("=");
        String str =countryArray[1];
        int idx= str.indexOf(",");
        String country= str.substring(0,idx);
        System.out.println(country);
        Select select= new Select(statesCitiesPage.stateCityDropdown);
//        select.selectByValue(id); does not work
        select.selectByVisibleText(country);
    }
    @When("admin enters related state based on country US028")
    public void admin_enters_related_state_based_on_country_US028() {
        statesCitiesPage.nameInput.sendKeys(Faker.instance().address().state());
    }
    @When("admin clicks on Save button on state page US028")
    public void admin_clicks_on_save_button_on_state_page_US028() {
        statesCitiesPage.saveButton.click();
    }
    @Then("admin verifies A new StateCity is created message US028")
    public void admin_verifies_a_new_statecity_is_created_message_US028() {
        Assert.assertTrue(statesCitiesPage.newStateCityIsCreatedMessage.isDisplayed());
    }

    @When("admin finds the new created country and clicks on Delete button US028")
    public void admin_finds_the_new_created_country_and_clicks_on_delete_button_US028() {
        List<WebElement> countryIds= Driver.getDriver().findElements(By.xpath("//tr//td[1]"));
        for(int i= countryIds.size(); i>0; i--){
            String xpath= "//tr["+i+"]//td[1]";
            if(Driver.getDriver().findElement(By.xpath(xpath)).getText().equals(data.get("id"))){
                WebElement deleteButton=Driver.getDriver().findElement(By.xpath("//tr["+i+"]//a[@class=\"btn btn-danger btn-sm\"]"));
                JSUtils.scrollIntoViewJS(deleteButton);
                ReusableMethods.waitForClickablility(deleteButton,5);
                JSUtils.clickElementByJS(deleteButton);
                break;
            }
        }
    }
    @Then("admin verifies the warning message US028")
    public void adminVerifiesTheWarningMessageUS028() {
        ReusableMethods.waitForVisibility(countriesPage.warningMessage,3);
        Assert.assertTrue(countriesPage.warningMessage.isDisplayed());
        Assert.assertTrue(countriesPage.warningMessage.getText().contains(data.get("id")));
    }
    @When("admin clicks on pop up on Delete button US028")
    public void admin_clicks_on_pop_up_on_delete_button_US028() {
        countriesPage.popUpDeleteButton.click();
    }
    @Then("admin verifies Country is deleted successfully message US028")
    public void admin_verifies_country_is_deleted_successfully_message_US028() {
        ReusableMethods.waitForVisibility(countriesPage.countryIsDeletedMessage,3);
        Assert.assertTrue(countriesPage.countryIsDeletedMessage.isDisplayed());
    }
    @And("admin verifies deleted country is not showing up on the country list US028")
    public void adminVerifiesDeletedCountryIsNotShowingUpOnTheCountryListUS028() {
        List<WebElement> listId= Driver.getDriver().findElements(By.xpath("//tr//td[1]"));
        boolean flag= false;
        for (WebElement w:   listId) {
            if(w.getText().equals(data.get("id"))){
                flag= true;
                break;
            }
        }
        Assert.assertFalse(flag);
    }
}
