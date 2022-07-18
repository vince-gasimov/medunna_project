package stepdefinitions.dbStepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.DBUtils;

import java.sql.SQLException;
import java.util.List;

public class US_007_DBStepDefs_Patients {

    @Given("user connects to database 007")
    public void user_connects_to_database() {
        DBUtils.createConnection();
    }

    @Given("user gets the {string} data from {string} table")
    public void user_gets_the_from_table(String column, String table) {
        String query = "Select " + column + " from " + table + "";
        DBUtils.executeQuery(query);

    }

    @Then("verify {string} table {string} column contains {string} data")
    public void verifyTableColumnContainsData(String table, String column, String data) {
        List<Object> allColumnData = DBUtils.getColumnData("select * from " + table + "", column);
        System.out.println(allColumnData);
        Assert.assertTrue(allColumnData.contains(data));
        System.out.println(data);

    }
    @Then("close the database connection 007")

    public void close_the_database_connection() {
        // Write code here that turns the phrase above into concrete actions
        DBUtils.closeConnection();
    }

    @Given("user reads all of the {string} column data")
    public void user_reads_all_of_the_column_data(String lastname) throws SQLException {
        DBUtils.getResultset().next();
        Object columnsData1 = DBUtils.getResultset().getObject(lastname);
        System.out.println(columnsData1);
        // got to the row2
        DBUtils.getResultset().next();
        Object columnsData2 = DBUtils.getResultset().getObject(lastname);
        System.out.println(columnsData2);

//        Iterate the ssn rows
        while (DBUtils.getResultset().next()) { // keep going to the next line if there is a data in next line
            Object nextColumnData = DBUtils.getResultset().getObject(lastname);
            System.out.println(nextColumnData);
        }
    }


    @Then("verify {string} table {string} column does not contain {string} data")
    public void verifyTableColumnDoesNotContainData(String table, String column, String data) {

    }
}
