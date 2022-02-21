package co.com.castor.fyffes.task.dashboard;

import co.com.castor.fyffes.ui.dashboard.DashbSupplyChUI;
import co.com.castor.fyffes.utils.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DashbSupplyChTks implements Task {


    @Override
    public <T extends Actor> void performAs(T user) {
        user.attemptsTo(
                Click.on(DashbSupplyChUI.LIST_PRODUCT_CLASS),
                Click.on(DashbSupplyChUI.OPT_PRODUCT_CHIP),
                Wait.oneTime(9000),
                Click.on(DashbSupplyChUI.LIST_PRODUCT_CLASS_2),
                Click.on(DashbSupplyChUI.OPT_PRODUCT_PLANTN),
                Wait.oneTime(9000),
                Click.on(DashbSupplyChUI.BTN_CURRENT_YEAR),
                Wait.oneTime(2000),
                Click.on(DashbSupplyChUI.BTN_LAST_YEAR),
                Wait.oneTime(3000),
                Click.on(DashbSupplyChUI.BTN_CURRENT_YEAR),
                Wait.oneTime(2000),
                Click.on(DashbSupplyChUI.BTN_LAST_YEAR),
                Wait.oneTime(2000),
                Click.on(DashbSupplyChUI.BTN_ZOOM_OUT),
                Click.on(DashbSupplyChUI.BTN_ZOOM_OUT),
                Wait.oneTime(1000),
                Click.on(DashbSupplyChUI.BTN_ZOOM_IN),
                Click.on(DashbSupplyChUI.BTN_ZOOM_IN),
                Wait.oneTime(3000),
                Click.on(DashbSupplyChUI.TXT_SUPPLYCHAIN),
                Wait.oneTime(9000)
        );
    }

    public static DashbSupplyChTks dashbSupplyOpt() {
        return instrumented(DashbSupplyChTks.class) ;

    }
}
