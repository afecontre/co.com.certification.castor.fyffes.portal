package co.com.castor.fyffes.ui.session;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChangePasswUI {
    public static final Target BTN_USER_PREFERENCES =Target.the ("User Preferences Options").located(By.xpath("//span[contains(text(),'Lesly')]"));
    public static final Target BTN_CHANGE_PASSWORD =Target.the ("Click in change Password Button").located(By.xpath("//a[contains(text(),'Change Password')]"));
    public static final Target INP_CURRENT_PASSWORD =Target.the ("Current password Field Input").located(By.xpath("//input[@formcontrolname='currentPassword']"));
    public static final Target INP_NEW_PASSWORD =Target.the ("New password Field Input").located(By.xpath("//input[@formcontrolname='newPassword']"));
    public static final Target INP_RETYPE_PASSWORD =Target.the ("New password Retype Field Input").located(By.xpath("//input[@formcontrolname='retypePassword']"));
    public static final Target BTN_SUBMIT_CHANGE_PASS =Target.the ("Submit Change Password Button").located(By.xpath("//body/kt-base[1]/div[1]/div[1]/div[1]/div[1]/div[1]/kt-user-management[1]/div[1]/kt-change-password[1]/div[1]/div[1]/kt-password-governance[1]/form[1]/div[2]/button[1]"));
    public static final Target BTN_CLOSE =Target.the ("Close Window Message").located(By.xpath("//span[contains(text(),'Close')]"));

}
