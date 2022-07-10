package stepdefinitions.dbStepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.DBUtils;

import java.sql.SQLException;
import java.util.List;

public class US_001_DBStepDefs {

    @Given("user connects to the database")
    public void user_connects_to_the_database() {
        DBUtils.createConnection();// Using create connection from the util class
    }

    @Given("user gets the {string} from {string} table")
    public void user_gets_the_from_table(String column, String table) {
//                   Select     *       from tp_customer
        String query = "Select " + column + " from " + table;
//      executing the query. we are on customer table based on scenario on
        DBUtils.executeQuery(query);
    }

    @Given("user reads all of the {string} column data")
    public void user_reads_all_of_the_column_data(String column) throws SQLException {
//        Go to the next row cause 1st row do not have data
        DBUtils.getResultset().next();
//        We are currently in the 1st row. This will return only first row data
        Object columnData1 = DBUtils.getResultset().getObject(column);
        System.out.println(columnData1);
//        Go to the row. We are on row 2
        DBUtils.getResultset().next();
        Object columnData2 = DBUtils.getResultset().getObject(column);
        System.out.println(columnData2);

//      Iterate the ssn rows
        while (DBUtils.getResultset().next()) {//keep going to the next line if there is a data in the next line
            Object nextColumnData = DBUtils.getResultset().getObject(column);
            System.out.println(nextColumnData);

        }
    }

    @Then("verify {string} table {string} column contains {string} data")
    public void verify_table_column_contains_data(String table, String column, String data) {


//        1. get the database column data in a list
//        getColumnData(String query, String column)-> returns a List of Column data
//        RETURNS login COLUMN DATA OF jhi_user TABLE

        table = "jhi_user";
        column = "ssn";
        data = "234-23-2345";
//        select * from "+table
//        DBUtils.getColumnData("select * from jhi_user","login");
        List<Object> allColumnData = DBUtils.getColumnData("select * from " + table + "", column);
        System.out.println(allColumnData);

////       2. Get the expected data in a list
//        List<Object> expectedData=new ArrayList<>();
//        expectedData.add(data);//adding the FF data in the list
//
////        3. compare if expected data is in the all column data list
//        Assert.assertTrue(allColumnData.containsAll(expectedData));

//        or simply
        Assert.assertTrue(allColumnData.contains(data));
//
////        list a = ['apple','orange','banana']     string b = orange
////        how do you check if list contains a sting?  a.contains(b)
//

    }

    @Then("close the database connection")
    public void close_the_database_connection() {
        DBUtils.closeConnection();
    }


}