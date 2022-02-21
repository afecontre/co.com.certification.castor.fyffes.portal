package co.com.castor.fyffes.stepdefinition.session;

import co.com.castor.fyffes.task.session.ChangePasswTks;
import co.com.castor.fyffes.task.session.LoginTks;
import co.com.castor.fyffes.utils.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class ChangePasswStep extends HomePage {
    public HomePage homePage = new HomePage();



    @Given("^That the user requires changed his password$")
    public void that_the_user_requires_changed_his_password() {
        user.can(BrowseTheWeb.with(hisBrowser));
    }

    @When("^Enter his (.*) and (.*) and go to chang password by (.*)$")
    public void enter_his_lgomez_and_A_bc_and_go_to_chang_password_by_bc(String username, String password, String newpassw) {
        user.wasAbleTo(
                LoginTks.loginFyffesPortal(username,password),
                ChangePasswTks.clickChanPassw(password,newpassw)
        );
    }

    @Then("^Can enter his new data$")
    public void can_enter_his_new_data() {

    }

}
