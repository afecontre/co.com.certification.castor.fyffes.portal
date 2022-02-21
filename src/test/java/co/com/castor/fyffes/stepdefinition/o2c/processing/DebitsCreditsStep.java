package co.com.castor.fyffes.stepdefinition.o2c.processing;

import co.com.castor.fyffes.task.o2c.processing.DebitsCreditsTks;
import co.com.castor.fyffes.task.session.LoginTks;
import co.com.castor.fyffes.utils.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class DebitsCreditsStep extends HomePage {
    HomePage homePage = new HomePage();

    @Given("^I need to process debits and credits$")
    public void i_need_to_process_debits_and_credits() {
        user.can(BrowseTheWeb.with(hisBrowser));
    }

    @When("^I entered the portal with my (.*) and (.*)$")
    public void i_entered_the_portal_with_my_lgomez_and_bc(String username, String password) {
        user.wasAbleTo(
                LoginTks.loginFyffesPortal(username,password),
                DebitsCreditsTks.debitCreditOption()
        );
    }

    @Then("^I will be able to process the data of debits and credits$")
    public void i_will_be_able_to_process_the_data_of_debits_and_credits() {

    }

}
