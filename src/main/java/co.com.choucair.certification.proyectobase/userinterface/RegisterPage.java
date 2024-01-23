package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;


public class RegisterPage extends PageObject {
    public static final Target JOIN_BUTTON = Target.the("Button that shows us the form to register")
            .located(By.className("unauthenticated-nav-bar__sign-up"));

}
