package co.com.castor.fyffes.ui.session;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ForgotPasswUI {
    public static final Target BTN_FORGOT =Target.the ("Forgot Buttom").located(By.xpath("//a[contains(text(),'Forgot Password?')]"));
    public static final Target INP_USERNAME =Target.the("User Name Input Field").located(By.xpath("//input[@type='username']"));
    public static final Target INP_EMAIL = Target.the("Email Input Field").located(By.xpath("//input[@type='email']"));
    public static final Target BTN_SUBMIT = Target.the("Submit Buttom").located(By.xpath("/html[1]/body[1]/kt-auth[1]/div[1]/div[1]/div[1]/kt-forgot-password[1]/div[1]/div[1]/form[1]/div[2]/button[1]"));
    public static final Target BTN_CLOSE_MESSAGE = Target.the("Close Message Forgot Passw").located(By.xpath("//span[contains(text(),'Close')]"));
}
