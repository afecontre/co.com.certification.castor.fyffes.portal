package co.com.castor.fyffes.ui.o2c.processing;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DebitsCreditsUI {
    public static final Target BTN_O2C_MENU =Target.the ("O2c menu Options Button").located(By.xpath("//a/span[contains(text(),'O2C')]"));
    public static final Target BTN_O2C_PROCESSING =Target.the ("Processing sub menu Options Button").located(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[4]/div/ul/li[2]/a/i[1]"));
    public static final Target BTN_O2C_PROC_DEBIT_CRED =Target.the ("Debits Credits sub menu Options Button").located(By.xpath("//a/span[contains(text(),'Debits and Credits')]"));
    public static final Target INP_O2C_PROC_FILTER =Target.the ("Debit Credit filter input field").located(By.xpath("//input[@placeholder='Filter']"));
    public static final Target BTN_O2C_PROC_FILTER_CLOSE =Target.the ("filter input field close").located(By.xpath("//mat-icon[contains(text(),'close')]"));
    public static final Target BTN_O2C_PROC_TOTAL_AMOUNT =Target.the ("Type Button").located(By.xpath("//*[@aria-label=\"Change sorting for totalCreditNoteValue\"]"));
    public static final Target CHB_O2C_PROCESSING =Target.the ("Checkbox select Debits Credits").located(By.xpath("//body/kt-base[1]/div[1]/div[1]/div[1]/div[1]/div[1]/kt-o2c[1]/kt-processing[1]/kt-debits-credits[1]/div[1]/div[2]/div[2]/mat-table[1]/mat-row[1]/mat-cell[1]/mat-checkbox[1]/label[1]"));
    public static final Target BTN_O2C_PROC_MARK_PROC =Target.the ("Mark as Processed Button").located(By.xpath("//*[@id=\"kt_content\"]/div/kt-o2c/kt-processing/kt-debits-credits/div/div[2]/div[2]/button"));
    public static final Target BTN_O2C_PROC_MARK_PROC_CLOSE =Target.the ("Confirmation button mark processed").located(By.xpath("//span[contains(text(),'Close')]"));
    public static final Target ICN_O2C_PROC_INV_DOLL =Target.the ("Invoice Dollar Icon").located(By.xpath("//mat-cell/a/em[@class='mat-tab-label-icon fa fa-file-invoice-dollar actionButton']"));
    //public static final Target ICN_O2C_PROC_INV_DOLL =Target.the ("Invoice Dollar Icon").located(By.xpath("//*[@id=\"kt_content\"]/div/kt-o2c/kt-processing/kt-debits-credits/div/div[2]/div[2]/mat-table/mat-row[1]/mat-cell[11]/a"));
    public static final Target ICN_O2C_PROC_INV_DOLL_DOC_TYPE =Target.the ("Invoice Dollar Icon Select Document Type").located(By.xpath("//span[contains(text(),'Select all')]"));
    public static final Target ICN_O2C_PROC_INV_DOLL_PROCESS =Target.the ("Invoice Dollar Icon Process Button").located(By.xpath("//button[@class=\"mat-focus-indicator btn btn-outline-dark mat-raised-button mat-button-base mat-accent\"]"));
    public static final Target ICN_O2C_PROC_INV_DOLL_PROCESS_CLOSE =Target.the ("Invoice Dollar Icon Process Button Close Window").located(By.xpath("//span[contains(text(),'Close')]"));
    public static final Target RBT_O2C_PROC_INV_DOLL_PROCESS_MANUAL =Target.the ("Invoice Dollar Manual Process Radio Button").located(By.xpath("//mat-radio-button[@value='manual']"));
    public static final Target RBT_O2C_PROC_INV_DOLL_PROCESS_EMAIL =Target.the ("Invoice Dollar Email(s) Radio Button").located(By.xpath("//mat-radio-button[@value='email']"));
    public static final Target TXT_O2C_PROC_INV_DOLL_PROCESS_EMAIL =Target.the ("Invoice Dollar Email Addresses Field Input").located(By.xpath("//input[@placeholder='Email addresses separated by commas']"));
    public static final Target BTN_O2C_PROC_INV_DOLL_PROCESS_CLOSE_PRINT =Target.the ("Close Pdf Screen Button").located(By.xpath("//button[@class=\"close\"]"));
    public static final Target BTN_O2C_PROC_INV_DOLL_PROCESS_DELIVERY =Target.the ("Process by delivery method radio button").located(By.xpath("//mat-radio-button[@value='delivery']"));
    public static final Target ICN_O2C_PROC_INV_DOLL_DOC_TYPE_ORIG_INV =Target.the ("Select Document Type Original Invoice").located(By.xpath("//span[contains(text(),' Original invoice ')]"));


}
