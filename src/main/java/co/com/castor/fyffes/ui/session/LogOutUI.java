package co.com.castor.fyffes.ui.session;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LogOutUI {
    public static final Target BTN_USER_PREFERENCES =Target.the ("User Preferences Options").located(By.xpath("//span[contains(text(),'Lesly')]"));
    public static final Target BTN_SIGN_OUT =Target.the ("Sign Out Button").located(By.xpath("//a[contains(text(),'Sign Out')]"));

}
