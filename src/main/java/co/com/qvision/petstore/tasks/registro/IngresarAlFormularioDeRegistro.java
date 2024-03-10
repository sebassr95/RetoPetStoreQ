package co.com.qvision.petstore.tasks.registro;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static co.com.qvision.petstore.userinterfaces.registro.Registro.BTN_INGRESO_REGISTRO;

public class IngresarAlFormularioDeRegistro implements Task {

    @Override
    @Step("{0} Ingresa al formulario de registro de usuario")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_INGRESO_REGISTRO));
    }

    public static Performable deUsuario(){
        return Tasks.instrumented(IngresarAlFormularioDeRegistro.class);
    }


}
