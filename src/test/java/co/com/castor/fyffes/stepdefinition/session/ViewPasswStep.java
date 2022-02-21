package co.com.castor.fyffes.stepdefinition.session;

import co.com.castor.fyffes.task.session.ViewPasswTks;
import co.com.castor.fyffes.utils.HomePage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class ViewPasswStep extends HomePage {
    public HomePage homePage = new HomePage();


    @Given("^That the user enter their username and password$")
    public void that_the_user_enter_their_username_and_password() {
            user.can(BrowseTheWeb.with(hisBrowser));
    }

    @When("^Digit your (.*) and your (.*)$")
    public void digit_your_lgomez_and_your_bc(String username, String password) {
        user.wasAbleTo(
                ViewPasswTks.viewPassw(username,password)
        );
    }

    @Then("^You can see if your password is correct$")
    public void you_can_see_if_your_password_is_correct() {

    }


}
