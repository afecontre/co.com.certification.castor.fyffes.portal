package co.com.castor.fyffes.ui.dashboard;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DashbO2cUI {

    //*** Question ***
    public static final Target TXT_FOUND_O2C =Target.the ("Text found O2c dashboard").located(By.xpath("//h3/span[contains(text(),'O2C')]"));


}
