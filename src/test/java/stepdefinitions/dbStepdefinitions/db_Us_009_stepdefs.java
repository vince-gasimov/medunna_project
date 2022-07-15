package stepdefinitions.dbStepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utilities.DBUtils;

import java.sql.SQLException;

public class db_Us_009_stepdefs {


    @Given("user gets the {string} from {string} table with the {string} of {string}")
    public void user_gets_the_from_table(String column, String table, String idColumn, String actualId) {
        String query = "select " + column + " from " + table + " where " + idColumn + "=" + actualId;
        DBUtils.executeQuery(query);
    }


    @Then("the {string} of the person should be {string}")
    public void the_of_the_person_with_the_id_of_should_be(String firstNameColumn, String actualFirstName) throws SQLException {

        DBUtils.getResultset().next();

        Assert.assertEquals(DBUtils.getResultset().getObject(firstNameColumn), actualFirstName);
    }

    @When("Admin gets the {string} from {string} table with the {string} of {string}")
    public void admin_gets_the_from_table_with_the_of(String column, String table, String idColumn, String actualId) {
        String query = "select " + column + " from " + table + " where " + idColumn + "=" + actualId;
        DBUtils.executeQuery(query);
    }

    @Then("Admin delete  the {string} of the patient with {string} of {string}")
    public void admin_delete_the_of_the_patient_with_of(String string, String string2, String string3) {
    }

    @Given("User Staff connects to the database")
    public void user_staff_connects_to_the_database() {
        DBUtils.createStaffConnection();

    }

    @Given("User deletes the patient with the {string} of {string} from the {string} table")
    public void user_deletes_the_patient_with_the_of_from_the_table(String idColumn, String actualId, String table) {
        //String query ="delete from appointment where ID=115277";

        String query = "delete from " + table + " where " + idColumn + "=" + actualId;
        DBUtils.executeUpdate(query);
    }

    @Then("user should not be able to get the {string} from {string} table with the {string} of {string}")
    public void user_should_not_be_able_to_get_the_from_table_with_the_of(String column, String table, String idColumn, String actualId) throws SQLException {

        String query = "select " + column + " from " + table + " where " + idColumn + "='" + actualId + "'";

        //Assert.assertThrows(SQLException.class, ()-> DBUtils.executeQuery(query));
        DBUtils.executeQuery(query);
        Assert.assertFalse(DBUtils.getResultset().next());

    }

    @Then("User should see empty result")
    public void user_should_see_empty_result() throws SQLException {
        Assert.assertFalse(DBUtils.getResultset().next());
    }

    @Then("User should not see empty result")
    public void user_should_not_see_empty_result() throws SQLException {
        Assert.assertTrue(DBUtils.getResultset().next());

    }

}
