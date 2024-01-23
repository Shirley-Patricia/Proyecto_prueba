package co.com.choucair.certification.proyectobase.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class EnterData implements Task {
    public static EnterData personalData() {
        return Tasks.instrumented(EnterData.class);
    }
}
