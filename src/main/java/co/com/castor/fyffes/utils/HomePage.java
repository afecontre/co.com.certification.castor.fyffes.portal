package co.com.castor.fyffes.utils;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class HomePage extends PageObject {

    public Actor user = Actor.named("User");

    @Managed(driver = "chrome")
    public WebDriver hisBrowser;

    @SuppressWarnings("unchecked")
    public void setUp(){
        setTheStage(new Cast());
        theActorCalled("user");

        theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));

        theActorInTheSpotlight().wasAbleTo(Open.url("https://tur-ap1.turbana.com:8443/fyffesna/auth/login"));
    }
}
