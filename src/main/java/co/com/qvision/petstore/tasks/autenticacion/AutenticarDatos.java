package co.com.qvision.petstore.tasks.autenticacion;

import co.com.qvision.petstore.models.DatosUsuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import static co.com.qvision.petstore.userinterfaces.autenticacion.Autenticacion.TXT_DATOS_LOGIN;
import static co.com.qvision.petstore.utils.constantes.AutenticacionDeUsuarioConstante.*;

public class AutenticarDatos implements Task {

    private DatosUsuario datos;

    public AutenticarDatos(DatosUsuario datos) {
        this.datos = datos;
    }

    @Step("{0} ingresa los datos de autenticacion")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(datos.getUserId()).into(TXT_DATOS_LOGIN.of(USERNAME)),
                Enter.theValue(datos.getPassword()).into(TXT_DATOS_LOGIN.of(PASSWORD)),
                Click.on(TXT_DATOS_LOGIN.of(BTN_LOGIN))
        );
    }

    public static Performable deUsuario(DatosUsuario datos){
        return Tasks.instrumented(AutenticarDatos.class, datos);
    }

}
