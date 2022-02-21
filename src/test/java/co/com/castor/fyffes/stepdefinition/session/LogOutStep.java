package co.com.castor.fyffes.stepdefinition.session;

import co.com.castor.fyffes.task.session.LogOutTks;
import co.com.castor.fyffes.task.session.LoginTks;
import co.com.castor.fyffes.utils.HomePage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class LogOutStep extends HomePage {
    public HomePage homePage = new HomePage();


    @Given("^That I am in the portal working$")
    public void that_I_am_in_the_portal_working() {
        user.can(BrowseTheWeb.with(hisBrowser));
    }

    @When("^I enter (.*) (.*) and finished my work session$")
    public void i_enter_lgomez_bc_and_finished_my_work_session(String username, String password) {
        user.wasAbleTo(
                LoginTks.loginFyffesPortal(username,password),
                LogOutTks.logOutPortal()
        );
    }

    @Then("^I want to close my work session on the portal$")
    public void i_want_to_close_my_work_session_on_the_portal() {

    }


}
