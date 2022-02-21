package co.com.castor.fyffes.stepdefinition.dashboard;

import co.com.castor.fyffes.question.dashboard.DashbO2cVer;
import co.com.castor.fyffes.task.session.LoginTks;
import co.com.castor.fyffes.utils.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class DashbO2cStep extends HomePage {
    public HomePage homePage = new HomePage();

    @Given("^The user is in the portal$")
    public void the_user_is_in_the_portal() {
        user.can(BrowseTheWeb.with(hisBrowser));
    }

    @When("^Register with your (.*) and (.*)$")
    public void register_with_your_lgomez_and_bc(String username, String password) {
        user.wasAbleTo(
                LoginTks.loginFyffesPortal(username,password)
        );
    }

    @Then("^You can see the dashboar of o(\\d+)c$")
    public void you_can_see_the_dashboar_of_o_c(int arg1) {
        user.should(seeThat(DashbO2cVer.dashsbO2cSuccess()));
    }
}
