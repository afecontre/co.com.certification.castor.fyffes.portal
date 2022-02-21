package co.com.castor.fyffes.task.session;

import co.com.castor.fyffes.ui.session.ForgotPasswUI;
import co.com.castor.fyffes.utils.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ForgotPasswTks implements Task {

    public String username;
    public String email;

    public ForgotPasswTks(String username, String email) {
        this.username = username;
        this.email = email;
    }

    @Override
    public <T extends Actor> void performAs(T user) {
        user.attemptsTo(
                Click.on(ForgotPasswUI.BTN_FORGOT),
                Enter.theValue(username).into(ForgotPasswUI.INP_USERNAME),
                Enter.theValue(email).into(ForgotPasswUI.INP_EMAIL),
                Click.on(ForgotPasswUI.BTN_SUBMIT),
                Wait.oneTime(4000),
                Click.on(ForgotPasswUI.BTN_CLOSE_MESSAGE)
        );
    }
    public static ForgotPasswTks forgotPassword(String username, String email) {
        return instrumented(ForgotPasswTks.class,username,email) ;
    }
}
