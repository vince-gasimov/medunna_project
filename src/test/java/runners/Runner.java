package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:target/failedRerun.txt"
        },
        features = "./src/test/resources/features",
        glue = {"stepdefinitions", "hooks"},
<<<<<<< HEAD

        tags = "@US13",



=======
        tags = "@database_medunna_patient_info",
>>>>>>> b3a89d7c9c104a27f8d1d142b35ec0bfb5e46765
        dryRun = false
)


public class Runner {
}
