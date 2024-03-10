package co.com.qvision.petstore.tasks.compra;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static co.com.qvision.petstore.userinterfaces.compra.CarritoCompras.BTN_CHECKOUT;

public class ConfirmarProductosDelCarrito implements Task {

    @Override
    @Step("{0} Confirma los productos con la cantidad agregada y procede con la compra")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_CHECKOUT));
    }

    public static Performable agregados(){
        return Tasks.instrumented(ConfirmarProductosDelCarrito.class);
    }
}
