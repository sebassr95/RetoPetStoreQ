package co.com.qvision.petstore.tasks.compra;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static co.com.qvision.petstore.userinterfaces.compra.CarritoCompras.BTN_REMOVE;

public class RemoverProductosDelCarrito implements Task {

    @Override
    @Step("{0} remueve el producto agregado en el carrito de compras")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_REMOVE)
        );
    }

    public static Performable agregado(){
        return Tasks.instrumented(RemoverProductosDelCarrito.class);
    }

}
