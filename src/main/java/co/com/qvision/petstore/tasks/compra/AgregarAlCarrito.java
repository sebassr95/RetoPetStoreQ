package co.com.qvision.petstore.tasks.compra;

import co.com.qvision.petstore.models.DatosUsuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static co.com.qvision.petstore.userinterfaces.compra.SeleccionAnimal.BTN_ADD_CART;

public class AgregarAlCarrito implements Task {

    private DatosUsuario datos;

    public AgregarAlCarrito(DatosUsuario datos) {
        this.datos = datos;
    }


    @Override
    @Step("{0} agrega al carrito el animal")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_ADD_CART.of(datos.getItemId()))
        );
    }

    public static Performable elAnimal(DatosUsuario datos) {
        return Tasks.instrumented(AgregarAlCarrito.class, datos);
    }


}
