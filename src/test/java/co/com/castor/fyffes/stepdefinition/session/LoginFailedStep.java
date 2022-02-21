package co.com.castor.fyffes.stepdefinition.session;

import co.com.castor.fyffes.question.session.LoginFailedVer;
import co.com.castor.fyffes.task.session.LoginFailedTks;
import co.com.castor.fyffes.task.session.LoginTks;
import co.com.castor.fyffes.utils.HomePage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class LoginFailedStep extends HomePage {
    public HomePage homePage = new HomePage();


    @Given("^The user does not remember their login details$")
    public void the_user_does_not_remember_their_login_details() {
        user.can(BrowseTheWeb.with(hisBrowser));
    }

    @When("^The user entered the wrong (.*) and (.*)$")
    public void the_user_entered_the_wrong_lgomez_and_bc(String username, String password) {
        user.wasAbleTo(
                LoginFailedTks.loginFiledPortal(username,password)
        );
    }

    @Then("^The system should prevent your entry and display an error message$")
    public void the_system_should_prevent_your_entry_and_display_an_error_message() {
        user.should(seeThat(LoginFailedVer.loginFailed()));
    }

}
