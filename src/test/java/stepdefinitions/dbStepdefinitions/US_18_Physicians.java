package stepdefinitions.dbStepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import utilities.DBUtils;

import java.sql.SQLException;

public class US_18_Physicians {



    @Given("user connects to database US018")
    public void userConnectsToDatabaseUS() {
        DBUtils.createConnection();
    }

    @And("close the database connection")
    public void closeTheDatabaseConnection() {
        DBUtils.closeConnection();
    }
}






