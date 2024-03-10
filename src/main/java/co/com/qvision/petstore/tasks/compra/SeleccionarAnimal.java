package co.com.qvision.petstore.tasks.compra;

import co.com.qvision.petstore.models.DatosUsuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static co.com.qvision.petstore.userinterfaces.compra.SeleccionAnimal.BTN_PRODUCT_ID_ANIMAL;

public class SeleccionarAnimal implements Task {

    private DatosUsuario datos;

    public SeleccionarAnimal(DatosUsuario datos) {
        this.datos = datos;
    }

    @Override
    @Step("{0} selecciona el animal que quiere comprar")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_PRODUCT_ID_ANIMAL.of(datos.getProductId()))
        );
    }


    public static Performable paraComprar(DatosUsuario datos) {
        return Tasks.instrumented(SeleccionarAnimal.class, datos);
    }

}
