package co.com.qvision.petstore.tasks.compra;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static co.com.qvision.petstore.userinterfaces.compra.DatosFacturacion.BTN_CONFIRM;

public class ConfirmarDatosFacturacion implements Task {


    @Override
    @Step("{0} confirma los datos de facturacion")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_CONFIRM)
        );
    }

    public static Performable dePago(){
        return Tasks.instrumented(ConfirmarDatosFacturacion.class);
    }

}
