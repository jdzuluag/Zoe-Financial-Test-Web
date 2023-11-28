package co.com.zoefinancial.certification.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Reschedule {
    public static final Target DATE = Target.the("Select the date").
            locatedBy("//div/div/span[contains(text(), '{0}')]");

    public static final Target TIME = Target.the("Select the time").
            locatedBy("(//div[@class = 'styles-module_timesContainer__times_time__mwoSe'])[{0}]");

    public static final Target TYPE = Target.the("Select the type").
            locatedBy("//div/p[contains(text(), '{0}')]");

    public static final Target BTN = Target.the("Reschedule").
            located(By.xpath("//button[contains(text(), 'reschedule')]"));

    public static final Target CONFIRMATION_BTN = Target.the("Confirmation button").
            located(By.xpath("//button[contains(text(), 'Confirm')]"));

    public static final Target MESSAGE = Target.the("Confirmation message").
            located(By.xpath("//p[contains(text(), 'You can now close this window')]"));
}
