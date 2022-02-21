package co.com.castor.fyffes.task.session;

import co.com.castor.fyffes.ui.session.LogOutUI;
import co.com.castor.fyffes.utils.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LogOutTks implements Task {

    @Override
    public <T extends Actor> void performAs(T user) {
        user.attemptsTo(
                Click.on(LogOutUI.BTN_USER_PREFERENCES),
                Click.on(LogOutUI.BTN_SIGN_OUT),
                Wait.oneTime(2000)
        );
    }

    public static LogOutTks logOutPortal() {
        return instrumented(LogOutTks.class) ;

    }
}
