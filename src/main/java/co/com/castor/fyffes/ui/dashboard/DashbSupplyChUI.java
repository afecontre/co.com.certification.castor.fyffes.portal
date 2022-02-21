package co.com.castor.fyffes.ui.dashboard;

import co.com.castor.fyffes.utils.CalculateDate;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DashbSupplyChUI {

    public static final Target LIST_PRODUCT_CLASS = Target.the("Click to List Product Class").located(By.xpath("//span[contains(text(),'BANANA')]"));
    public static final Target OPT_PRODUCT_CHIP =Target.the ("Select product Class Chip Option").located(By.xpath("//span[contains(text(),'CHIP')]"));
    public static final Target LIST_PRODUCT_CLASS_2 = Target.the("Click to List Product Class").located(By.xpath("//span[contains(text(),'CHIP')]"));
    public static final Target OPT_PRODUCT_PLANTN =Target.the ("Select product Class Plantn Option").located(By.xpath("//span[contains(text(),'PLANTN')]"));
    public static final Target BTN_CURRENT_YEAR =Target.the ("Current year button").located(By.xpath(new CalculateDate().CurrentYearCal()));
    public static final Target BTN_LAST_YEAR =Target.the ("Last year button").located(By.xpath(new CalculateDate().LastYearCal()));
    public static final Target BTN_ZOOM_OUT =Target.the ("Zoom Out Button").located(By.xpath("//div[@title='Zoom Out']"));
    public static final Target BTN_ZOOM_IN =Target.the ("Zoom In Button").located(By.xpath("//div[@title='Zoom In']"));
    public static final Target TXT_SUPPLYCHAIN =Target.the ("Clic into Supply Chain text go to detail dashboard").located(By.xpath("//h3/span[contains(text(),'Supply Chain')]"));


    //*** Question ***
    public static final Target TXT_FOUND_SUPPLY_CHAIN =Target.the ("Text found Supply Chain dashboard").located(By.xpath("//h3/span[contains(text(),'Supply Chain')]"));


}
