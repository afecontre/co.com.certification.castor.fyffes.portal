package co.com.castor.fyffes.ui.session;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginUI {
    public static final Target INP_USERNAME =Target.the ("User name input field").located(By.xpath("//input[@type='username']"));
    public static final Target INP_PASSWORD =Target.the ("Password input field").located(By.xpath("//input[@type='password']"));
    public static final Target BTN_SIGN_IN =Target.the ("Sign In Button").located(By.id("kt_login_signin_submit"));
    public static final Target BTN_MENU_OPEN =Target.the ("Open menu Button").located(By.id("Stockholm-icons-/-Navigation-/-Angle-double-right"));

    //*** Question ***
    public static final Target TXT_FOUND_LOGIN =Target.the ("Text found at login").located(By.xpath("//h3[contains(text(),'Dashboard')]"));
    public static final Target TXT_FOUND_LOGIN_FAILED =Target.the ("Text found at login failed").located(By.xpath("//div[contains(text(),'Invalid username or password. Please try again.')]"));


}
