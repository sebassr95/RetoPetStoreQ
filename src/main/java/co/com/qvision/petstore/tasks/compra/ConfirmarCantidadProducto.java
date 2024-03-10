package co.com.qvision.petstore.tasks.compra;

import co.com.qvision.petstore.models.DatosUsuario;
import co.com.qvision.petstore.utils.esperaexplicita.EsperarSegundos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import static co.com.qvision.petstore.userinterfaces.compra.CarritoCompras.*;

public class ConfirmarCantidadProducto implements Task {

    private DatosUsuario datos;
    private EsperarSegundos esperar = new EsperarSegundos();

    public ConfirmarCantidadProducto(DatosUsuario datos) {
        this.datos = datos;
    }

    @Override
    @Step("{0} confirma la cantidad del producto a comprar y procede con la compra")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(datos.getQuantity()).into(TXT_QUANTITY.of(datos.getItemId())),
                Click.on(BTN_UPDATE_CAR)
        );
       esperar.estosSegundos(1);
    }

    public static Performable delProductoAgregado(DatosUsuario datos) {
        return Tasks.instrumented(ConfirmarCantidadProducto.class, datos);
    }

}
