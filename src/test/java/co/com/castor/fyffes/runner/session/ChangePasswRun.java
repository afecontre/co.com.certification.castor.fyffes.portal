package co.com.castor.fyffes.runner.session;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/feature/session/changepassw.feature",
                glue ="co.com.castor.fyffes.stepdefinition",
                snippets= SnippetType.CAMELCASE)
public class ChangePasswRun {
}
