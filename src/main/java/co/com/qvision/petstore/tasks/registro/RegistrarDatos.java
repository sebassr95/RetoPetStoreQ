package co.com.qvision.petstore.tasks.registro;

import co.com.qvision.petstore.models.DatosUsuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static co.com.qvision.petstore.userinterfaces.registro.Registro.*;
import static co.com.qvision.petstore.utils.constantes.RegistroDeUsuarioConstante.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class RegistrarDatos implements Task {

    private DatosUsuario datos;

    public RegistrarDatos(DatosUsuario datos) {
        this.datos = datos;
    }

    @Override
    @Step("{0} Registra los datos de usuario")
    public <T extends Actor> void performAs(T actor)

    {
        WaitUntil.the(TXT_USERID_REGISTRO, isVisible()).forNoMoreThan(5).seconds();
        actor.attemptsTo(
                Enter.theValue(datos.getUserId()).into(TXT_USERID_REGISTRO),
                Enter.theValue(datos.getPassword()).into(TXT_PASSWORD_REGISTRO),
                Enter.theValue(datos.getConfirmarPassword()).into(TXT_CONFIRM_PASSWORD_REGISTRO),
                Enter.theValue(datos.getFirstName()).into(TXT_ACCOUNT_INFORMATION.of(FIRST_NAME)),
                Enter.theValue(datos.getLastName()).into(TXT_ACCOUNT_INFORMATION.of(LAST_NAME)),
                Enter.theValue(datos.getEmail()).into(TXT_ACCOUNT_INFORMATION.of(EMAIL)),
                Enter.theValue(datos.getPhone()).into(TXT_ACCOUNT_INFORMATION.of(PHONE)),
                Enter.theValue(datos.getAddresOne()).into(TXT_ACCOUNT_INFORMATION.of(ADDRESS_ONE)),
                Enter.theValue(datos.getAddresTwo()).into(TXT_ACCOUNT_INFORMATION.of(ADDRESS_TWO)),
                Enter.theValue(datos.getCity()).into(TXT_ACCOUNT_INFORMATION.of(CITY)),
                Enter.theValue(datos.getState()).into(TXT_ACCOUNT_INFORMATION.of(STATE)),
                Enter.theValue(datos.getZip()).into(TXT_ACCOUNT_INFORMATION.of(ZIP)),
                Enter.theValue(datos.getCountry()).into(TXT_ACCOUNT_INFORMATION.of(COUNTRY)),
                Click.on(BTN_GUARDAR_REGISTRO)
        );
    }

    public static Performable deUsuario(DatosUsuario datos) {
        return Tasks.instrumented(RegistrarDatos.class, datos);
    }


}
