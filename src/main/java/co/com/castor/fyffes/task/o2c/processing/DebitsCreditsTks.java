package co.com.castor.fyffes.task.o2c.processing;

import co.com.castor.fyffes.ui.o2c.processing.DebitsCreditsUI;
import co.com.castor.fyffes.ui.session.ForgotPasswUI;
import co.com.castor.fyffes.ui.session.LogOutUI;
import co.com.castor.fyffes.utils.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DebitsCreditsTks implements Task {

    @Override
    public <T extends Actor> void performAs(T user) {
        user.attemptsTo(
                /* Here enter the Debits and Credits menu */
                Click.on(DebitsCreditsUI.BTN_O2C_MENU),
                Click.on(DebitsCreditsUI.BTN_O2C_PROCESSING),
                Click.on(DebitsCreditsUI.BTN_O2C_PROC_DEBIT_CRED),
                Wait.oneTime(8000),

                /*Here you enter the data to test the filter*/
                Enter.theValue("WALMAR").into(DebitsCreditsUI.INP_O2C_PROC_FILTER),
                Wait.oneTime(2000),
                Enter.theValue("LOBLAW").into(DebitsCreditsUI.INP_O2C_PROC_FILTER),
                Wait.oneTime(2000),
                Click.on(DebitsCreditsUI.BTN_O2C_PROC_FILTER_CLOSE),

                /*Here a checkbox record is selected and marked as processed*/
                SendKeys.of(Keys.TAB).into(DebitsCreditsUI.INP_O2C_PROC_FILTER),
                Click.on(DebitsCreditsUI.BTN_O2C_PROC_TOTAL_AMOUNT),
                SendKeys.of(Keys.TAB).into(DebitsCreditsUI.BTN_O2C_PROC_TOTAL_AMOUNT),
                Click.on(DebitsCreditsUI.CHB_O2C_PROCESSING),
                Click.on(DebitsCreditsUI.BTN_O2C_PROC_MARK_PROC),
                Wait.oneTime(4000),
                Click.on(DebitsCreditsUI.BTN_O2C_PROC_MARK_PROC_CLOSE),
                Wait.oneTime(3000),

                /*Process by delivery method, mark a record by selecting all document types*/
                Click.on(DebitsCreditsUI.ICN_O2C_PROC_INV_DOLL),
                Click.on(DebitsCreditsUI.BTN_O2C_PROC_INV_DOLL_PROCESS_DELIVERY),
                Click.on(DebitsCreditsUI.ICN_O2C_PROC_INV_DOLL_DOC_TYPE),
                Click.on(DebitsCreditsUI.ICN_O2C_PROC_INV_DOLL_PROCESS),
                Wait.oneTime(2000),
                Click.on(DebitsCreditsUI.ICN_O2C_PROC_INV_DOLL_PROCESS_CLOSE),


                /*Manual process, mark a record as process and send email*/
                Click.on(DebitsCreditsUI.ICN_O2C_PROC_INV_DOLL),
                Click.on(DebitsCreditsUI.RBT_O2C_PROC_INV_DOLL_PROCESS_MANUAL),
                Click.on(DebitsCreditsUI.RBT_O2C_PROC_INV_DOLL_PROCESS_EMAIL),
                Enter.theValue("diego.alvarez@castor.com.co").into(DebitsCreditsUI.TXT_O2C_PROC_INV_DOLL_PROCESS_EMAIL),
                Click.on(DebitsCreditsUI.ICN_O2C_PROC_INV_DOLL_DOC_TYPE),
                Click.on(DebitsCreditsUI.ICN_O2C_PROC_INV_DOLL_PROCESS),
                Wait.oneTime(8000),
                Click.on(DebitsCreditsUI.BTN_O2C_PROC_MARK_PROC_CLOSE),

                /*Manual process, mark a record as process and Print Pdf*/
                Click.on(DebitsCreditsUI.ICN_O2C_PROC_INV_DOLL),
                Click.on(DebitsCreditsUI.RBT_O2C_PROC_INV_DOLL_PROCESS_MANUAL),
                Click.on(DebitsCreditsUI.ICN_O2C_PROC_INV_DOLL_DOC_TYPE),
                Click.on(DebitsCreditsUI.ICN_O2C_PROC_INV_DOLL_PROCESS),
                Wait.oneTime(20000),
                Click.on(DebitsCreditsUI.BTN_O2C_PROC_INV_DOLL_PROCESS_CLOSE_PRINT),

                /*Negative test Manual process, mark a record as process and do not send email*/
                Click.on(DebitsCreditsUI.ICN_O2C_PROC_INV_DOLL),
                Click.on(DebitsCreditsUI.RBT_O2C_PROC_INV_DOLL_PROCESS_MANUAL),
                Click.on(DebitsCreditsUI.RBT_O2C_PROC_INV_DOLL_PROCESS_EMAIL),
                Click.on(DebitsCreditsUI.ICN_O2C_PROC_INV_DOLL_DOC_TYPE_ORIG_INV),
                Click.on(DebitsCreditsUI.ICN_O2C_PROC_INV_DOLL_PROCESS),
                Wait.oneTime(3000),
                Click.on(DebitsCreditsUI.BTN_O2C_PROC_INV_DOLL_PROCESS_CLOSE_PRINT),

                /*Negative test Manual process, mark a record as process and do not select document type*/
                Click.on(DebitsCreditsUI.ICN_O2C_PROC_INV_DOLL),
                Click.on(DebitsCreditsUI.RBT_O2C_PROC_INV_DOLL_PROCESS_MANUAL),
                Click.on(DebitsCreditsUI.RBT_O2C_PROC_INV_DOLL_PROCESS_EMAIL),
                Enter.theValue("diego.alvarez@castor.com.co").into(DebitsCreditsUI.TXT_O2C_PROC_INV_DOLL_PROCESS_EMAIL),
                Click.on(DebitsCreditsUI.ICN_O2C_PROC_INV_DOLL_PROCESS),
                Wait.oneTime(3000),
                Click.on(DebitsCreditsUI.BTN_O2C_PROC_INV_DOLL_PROCESS_CLOSE_PRINT),


                Wait.oneTime(3000)


        );
    }

    public static DebitsCreditsTks debitCreditOption() {
        return instrumented(DebitsCreditsTks.class) ;

    }
}
