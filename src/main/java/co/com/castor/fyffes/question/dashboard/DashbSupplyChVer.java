package co.com.castor.fyffes.question.dashboard;

import co.com.castor.fyffes.ui.dashboard.DashbO2cUI;
import co.com.castor.fyffes.ui.dashboard.DashbSupplyChUI;
import co.com.castor.fyffes.utils.Constants;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class DashbSupplyChVer implements Question <Boolean> {
    @Override
    public Boolean answeredBy(Actor user){
        return Text.of(DashbSupplyChUI.TXT_FOUND_SUPPLY_CHAIN).viewedBy(user).asString().contains(Constants.TXT_DASHB_SUPPLY_CHAIN);
    }

    public static Question <Boolean> dashsbSuppplyChSucc(){
        return new DashbSupplyChVer();
    }
}
