package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //The purpose of this class is:
//        RERUN ONLY TXT FILE THAT HAS FAILED SCENARIOS
        plugin = {
                "pretty",
                "html:target/default_cucumber_report.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:target/failedRerun.txt",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
        },
        features = "@target/failedRerun.txt",//path od features folder
        glue = {"stepdefinitions","hooks"},//path of the step definitions folder
        dryRun = false
)
public class FailedScenarioRunner {
}