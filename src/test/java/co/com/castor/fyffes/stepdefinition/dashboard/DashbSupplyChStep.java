package co.com.castor.fyffes.stepdefinition.dashboard;

import co.com.castor.fyffes.task.dashboard.DashbSupplyChTks;
import co.com.castor.fyffes.task.session.LoginTks;
import co.com.castor.fyffes.utils.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class DashbSupplyChStep extends HomePage {
    public HomePage homePage = new HomePage();

    @Given("^The user is in the fyffes portal$")
    public void the_user_is_in_the_fyffes_portal() {
        user.can(BrowseTheWeb.with(hisBrowser));
    }

    @When("^Enter my (.*) and (.*)$")
    public void enter_my_lgomez_and_bc(String username, String password) {
        user.wasAbleTo(
                LoginTks.loginFyffesPortal(username,password),
                DashbSupplyChTks.dashbSupplyOpt()
        );
    }

    @Then("^I can see the dashboar Supply Chain$")
    public void i_can_see_the_dashboar_Supply_Chain() {

    }

}
