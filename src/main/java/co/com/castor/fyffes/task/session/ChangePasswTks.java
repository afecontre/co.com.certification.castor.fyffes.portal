package co.com.castor.fyffes.task.session;


import co.com.castor.fyffes.ui.session.ChangePasswUI;
import co.com.castor.fyffes.utils.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ChangePasswTks implements Task {

    private String password;
    private  String newpassw;

    public ChangePasswTks(String password, String newpassw) {
        this.password = password;
        this.newpassw = newpassw;
    }

    @Override
    public <T extends Actor> void performAs(T user) {
        user.attemptsTo(
                Click.on(ChangePasswUI.BTN_USER_PREFERENCES),
                Click.on(ChangePasswUI.BTN_CHANGE_PASSWORD),
                Enter.theValue(password).into(ChangePasswUI.INP_CURRENT_PASSWORD),
                Enter.theValue(newpassw).into(ChangePasswUI.INP_NEW_PASSWORD),
                Enter.theValue(newpassw).into(ChangePasswUI.INP_RETYPE_PASSWORD),
                Click.on(ChangePasswUI.BTN_SUBMIT_CHANGE_PASS),
                Wait.oneTime(130000),
                Click.on(ChangePasswUI.BTN_CLOSE)

        );
    }
    public static ChangePasswTks clickChanPassw(String password, String newpassw) {
        return instrumented(ChangePasswTks.class,password,newpassw) ;
    }
}
