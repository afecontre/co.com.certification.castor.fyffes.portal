package co.com.castor.fyffes.runner.o2c.processing;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/feature/o2c/processing/debitscredits.feature",
        glue ="co.com.castor.fyffes.stepdefinition",
        snippets= CucumberOptions.SnippetType.CAMELCASE)
public class DebitsCreditsRun {
}
