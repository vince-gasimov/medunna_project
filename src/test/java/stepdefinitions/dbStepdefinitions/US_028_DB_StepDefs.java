package stepdefinitions.dbStepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.ConfigurationReader;
import utilities.DBUtils;

import java.util.List;

import static utilities.US_002_TXTWriter.readFile;

public class US_028_DB_StepDefs {

    String countryApi;
    int countryIdApi;

    @And("user gets country data from api US_028")
    public void userGetsCountryDataFromApiUS_028() {
        String expectedApiData= readFile(ConfigurationReader.getProperty("US_028_country_ui_data"));
        String apiData= expectedApiData.replaceAll("[,{}]","=");
        String [] apiDataArray= apiData.split("=");
        countryApi= apiDataArray[2];
        countryIdApi= Integer.valueOf(apiDataArray[4]);
    }

    @Then("country that is created by api should be validated by database US_028")
    public void country_that_is_created_by_api_should_be_validated_by_database_US_028() {
        List<Object> actualCountryList= DBUtils.getColumnData("Select * from country ", "name");
        Assert.assertTrue(actualCountryList.contains(countryApi));
    }
    @Given("user gets updated country data from api US_028")
    public void user_gets_updated_country_data_from_api_US_028() {
        String expectedApiData= readFile(ConfigurationReader.getProperty("US_028_updated_country_api_data"));
        String apiData= expectedApiData.replaceAll("[,{}]","=");
        String [] apiDataArray= apiData.split("=");
        countryApi= apiDataArray[2];
        countryIdApi= Integer.valueOf(apiDataArray[4]);
    }
    @Then("country that is updated by api should be validated by database US_028")
    public void country_that_is_updated_by_api_should_be_validated_by_database_US_028() {
        List<Object> actualCountryList= DBUtils.getColumnData("Select * from country ", "name");
        Assert.assertTrue(actualCountryList.contains(countryApi));
    }

}
