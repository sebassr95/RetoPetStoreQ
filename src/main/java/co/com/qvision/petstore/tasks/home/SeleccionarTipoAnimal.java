package co.com.qvision.petstore.tasks.home;

import co.com.qvision.petstore.models.DatosUsuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static co.com.qvision.petstore.userinterfaces.home.PaginaPrincipal.BTN_ANIMAL_TYPE;


public class SeleccionarTipoAnimal implements Task {

    private DatosUsuario datos;

    public SeleccionarTipoAnimal(DatosUsuario datos) {
        this.datos = datos;
    }

    @Override
    @Step("{0} Selecciona el tipo de animal que quiere comprar")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_ANIMAL_TYPE.of(datos.getAnimalType())));
    }

    public static Performable desdeDashboard(DatosUsuario datos) {
        return Tasks.instrumented(SeleccionarTipoAnimal.class, datos);
    }


}
