package co.com.castor.fyffes.stepdefinition.session;

import co.com.castor.fyffes.task.session.ForgotPasswTks;
import co.com.castor.fyffes.utils.HomePage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class ForgotPasswStep extends HomePage {
    public HomePage homePage = new HomePage();

    @Before
    public void config(){
        setUp();
    }
    @Given("^The user is on the login page$")
    public void the_user_is_on_the_login_page() {
        user.can(BrowseTheWeb.with(hisBrowser));
    }

    @When("^The user send his (.*) and (.*)$")
    public void the_user_send_his_lgomez_and_lesly_gomez_castor_com_co(String username, String email) {
        user.wasAbleTo(
                ForgotPasswTks.forgotPassword(username,email)
        );
    }

    @Then("^You can recover your password and enter the portal$")
    public void you_can_recover_your_password_and_enter_the_portal() {

    }
}
