package stepdefinitions.dbStepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.ConfigurationReader;
import utilities.DBUtils;

import java.util.ArrayList;
import java.util.List;

import static utilities.US_002_TXTWriter.readFile;

public class US_002_DB_StepDefs {

    @Given("user connects to the database US_002")
    public void user_connects_to_the_database_US_002() {
        DBUtils.createConnection();

    }
    @Then("user verifies that {string} table {string} column contains {string} US_002")
    public void user_verifies_that_table_column_contains_US_002(String table, String column, String string) {
        List<Object> allColumnData= DBUtils.getColumnData("Select * From "+table+ " ",column);

        string= readFile(ConfigurationReader.getProperty("US_002_applicant_data"));
        String [] registrantData= string.split("'");
        String email= registrantData[13];
        List<Object> expectedData=new ArrayList<>();
        expectedData.add(email.toLowerCase());
//        expectedData.add(email);
        Assert.assertTrue(allColumnData.containsAll(expectedData));
    }
    @Then("user close the database connection US_002")
    public void user_close_the_database_connection_US_002() {
        DBUtils.closeConnection();
    }
}
