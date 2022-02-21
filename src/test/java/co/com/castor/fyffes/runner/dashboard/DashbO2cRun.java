package co.com.castor.fyffes.runner.dashboard;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/feature/dashboard/dashbo2c.feature",
        glue ="co.com.castor.fyffes.stepdefinition",
        snippets= CucumberOptions.SnippetType.CAMELCASE)
public class DashbO2cRun {
}
