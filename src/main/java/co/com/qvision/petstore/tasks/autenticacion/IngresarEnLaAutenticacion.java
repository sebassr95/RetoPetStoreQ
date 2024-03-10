package co.com.qvision.petstore.tasks.autenticacion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static co.com.qvision.petstore.userinterfaces.home.PaginaPrincipal.BTN_AUTENTICACION;

public class IngresarEnLaAutenticacion implements Task {

    @Override
    @Step("{0} ingresa a la pantalla de autenticación")
    public <T extends Actor> void performAs(T actor)

        {
            actor.attemptsTo(Click.on(BTN_AUTENTICACION));
        }

    public static Performable deUsuario() {
            return Tasks.instrumented(IngresarEnLaAutenticacion.class);
        }



}
