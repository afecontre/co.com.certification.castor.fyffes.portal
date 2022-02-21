package co.com.castor.fyffes.task.session;

import co.com.castor.fyffes.ui.session.LoginUI;
import co.com.castor.fyffes.utils.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginFailedTks implements Task {

    private String username;
    private  String password;

    public LoginFailedTks(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T user) {
        user.attemptsTo(
                Enter.theValue(username).into(LoginUI.INP_USERNAME),
                Enter.theValue(password).into(LoginUI.INP_PASSWORD),
                Click.on(LoginUI.BTN_SIGN_IN),
                Wait.oneTime(10000)
        );
    }

    public static LoginFailedTks loginFiledPortal(String username, String password) {
        return instrumented(LoginFailedTks.class, username, password) ;

    }
}
