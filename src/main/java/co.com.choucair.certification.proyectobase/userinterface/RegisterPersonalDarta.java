package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterPersonalDarta extends PageObject {
    public static final Target INPUT_NAME = Target.the("where do we write the first name")
            .located(By.id("firstName"));
    public static final Target INPUT_LAST_NAME = Target.the("where do we write the last name")
            .located(By.ByXPath.xpath("//input[@id='lastName']"));
    public static final Target INPUT_EMAIL = Target.the("where do we write the email")
            .located(By.id("email"));
    public static final Target CLICK_MONTH = Target.the("where do we select the month")
            .located(By.ByXPath.xpath("//select[contains(@id,'birthMonth')]"));

    public static final Target SELECT_MONTH = Target.the("where do we select the month")
            .located(By.ByXPath.xpath("//select[contains(@id,'birthMonth')]"));
}
