package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Register implements Task{

    public static Register enterPage() {
        return Tasks.instrumented(Register.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(RegisterPage.JOIN_BUTTON)
        );
    }
}
