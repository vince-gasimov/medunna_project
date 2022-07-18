package stepdefinitions.dbStepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.DBUtils;

import java.util.List;

public class US_010_DB_StepDefs {

    List< Object > dbAppointment;

    @Given("Doctor connects to database {string} and {string}, {string}")
    public void doctorConnectsToDatabase(String url, String username, String password) {
    }

    @Given("Doctor connects to database")
    public void userConnectsToDatabase() {DBUtils.getConnection();
    }

    @Then("Doctor gets appointment {string}")
    public void userGetsAppointment(String status) {
        String query = "SELECT * FROM  appointment";
        dbAppointment=DBUtils.getColumnData(query,status);

    }

    @And("Doctor verifies the {string} by DB")
    public void doctorVerifiesTheByDB(String status){
        Assert.assertTrue(dbAppointment.contains(status));
        System.out.println(dbAppointment);
    }

    @Then("close the database connection 010")
    public void close_the_database_connection() {
        DBUtils.closeConnection();
    }
}
