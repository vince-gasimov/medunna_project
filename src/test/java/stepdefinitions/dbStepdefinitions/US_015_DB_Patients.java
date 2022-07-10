package stepdefinitions.dbStepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.DBUtils;

import java.util.List;

public class US_015_DB_Patients {

    @Then("verify {string} table {string} column contains {string} and {string} data")
    public void verify_table_column_contains_and_data(String table, String column, String data1, String data2) {
        List<Object> allColumnData = DBUtils.getColumnData("select * from "+table+"",column);
        System.out.println(allColumnData);
        Assert.assertTrue(allColumnData.contains(data1));
        Assert.assertTrue(allColumnData.contains(data2));
    }
    @Given("user gets the {string} column from {string} table")
    public void user_gets_the_column_from_table(String column, String table) {
        String query = "Select "+column+" from "+table+"";
        DBUtils.executeQuery(query);
    }
    @Given("user verifies that {string} column contains {string} data")
    public void user_verifies_that_column_contains_data(String column, String data) {
        List<Object> allColumnData = DBUtils.getColumnData("select * from "+"",column);
        System.out.println(allColumnData);
        Assert.assertTrue(allColumnData.contains(data));

    }
}
