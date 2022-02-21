package co.com.castor.fyffes.question.dashboard;

import co.com.castor.fyffes.ui.dashboard.DashbO2cUI;
import co.com.castor.fyffes.ui.session.LoginUI;
import co.com.castor.fyffes.utils.Constants;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class DashbO2cVer implements Question <Boolean> {
    @Override
    public Boolean answeredBy(Actor user){
        return Text.of(DashbO2cUI.TXT_FOUND_O2C).viewedBy(user).asString().contains(Constants.TXT_DASHB_O2C);
    }

    public static Question <Boolean> dashsbO2cSuccess(){
        return new DashbO2cVer();
    }
}
