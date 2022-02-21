package co.com.castor.fyffes.task.session;


import co.com.castor.fyffes.ui.session.ViewPasswUI;
import co.com.castor.fyffes.utils.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ViewPasswTks implements Task {

    private String username;
    private  String password;

    public ViewPasswTks(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T user) {
        user.attemptsTo(
                Enter.theValue(username).into(ViewPasswUI.INP_USERNAME),
                Enter.theValue(password).into(ViewPasswUI.INP_PASSWORD),
                Click.on(ViewPasswUI.BTN_VIEW_PASSW_OFF),
                Wait.oneTime(2000),
                Click.on(ViewPasswUI.BTN_VIEW_PASSW_ON),
                Wait.oneTime(2000)
        );
    }
    public static ViewPasswTks viewPassw(String username, String password) {
        return instrumented(ViewPasswTks.class, username, password) ;
    }
}
