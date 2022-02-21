package co.com.castor.fyffes.runner.session;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"src/test/resources/feature/session/loginfailed.feature",
        "src/test/resources/feature/session/forgotpassw.feature",
        "src/test/resources/feature/session/changepassw.feature",
        "src/test/resources/feature/session/viewpassw.feature",
        "src/test/resources/feature/session/login.feature",
        "src/test/resources/feature/session/logout.feature"},
        glue ="co.com.castor.fyffes.stepdefinition",
        snippets= SnippetType.CAMELCASE)
public class SessionRunner {
}
