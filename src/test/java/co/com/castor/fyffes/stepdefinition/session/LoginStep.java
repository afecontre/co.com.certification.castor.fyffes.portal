package co.com.castor.fyffes.stepdefinition.session;

import co.com.castor.fyffes.question.session.LoginVer;
import co.com.castor.fyffes.task.session.LoginTks;


import co.com.castor.fyffes.utils.HomePage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;


import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class LoginStep extends HomePage {
    public HomePage homePage = new HomePage();


    @Given("^The user is on the main page$")
    public void the_user_is_on_the_main_page() {
        user.can(BrowseTheWeb.with(hisBrowser));
    }

    @When("^The user enter (.*) and (.*)$")
    public void the_user_enter_lgomez_and_bc(String username, String password) {
        user.wasAbleTo(
                LoginTks.loginFyffesPortal(username,password)
        );

    }

    @Then("^You can see the Fyffes portal$")
    public void you_can_see_the_Fyffes_portal() {
        user.should(seeThat(LoginVer.loginSuccess()));
    }
}
