package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.RegisterPersonalDarta;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Click;

public class EnterData implements Task {

    private String strName;
    private String strLastName;
    private String strEmail;
    private String strLanguage;

    public EnterData(String strName, String strLastName, String strEmail, String strLanguage) {
        this.strName = strName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strLanguage = strLanguage;
    }

    public static EnterData personalData(String strName, String strLastName, String strEmail, String strLanguage) {
        return Tasks.instrumented(EnterData.class, strName, strLastName, strEmail, strLanguage);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(strName).into(RegisterPersonalDarta.INPUT_NAME));
                Enter.theValue(strLastName).into(RegisterPersonalDarta.INPUT_LAST_NAME);
                Enter.theValue(strEmail).into(RegisterPersonalDarta.INPUT_EMAIL);
                Click.on(RegisterPersonalDarta.INPUT_MONTH);

    }
}
