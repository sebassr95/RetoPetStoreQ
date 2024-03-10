package co.com.qvision.petstore.tasks.home;

import co.com.qvision.petstore.models.DatosUsuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import static co.com.qvision.petstore.userinterfaces.home.PaginaPrincipal.BTN_SEARCH;
import static co.com.qvision.petstore.userinterfaces.home.PaginaPrincipal.TXT_SEARCH;

public class BuscarAnimalMedianteCadena implements Task {

    private DatosUsuario datos;

    public BuscarAnimalMedianteCadena(DatosUsuario datos) {
        this.datos = datos;
    }

    @Override
    @Step("{0} Busca el animal que desea comprar ingresando el nombre del animal")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(datos.getNameAnimal()).into(TXT_SEARCH),
                Click.on(BTN_SEARCH)
        );
    }

    public static Performable deCaracteres(DatosUsuario datos) {
        return Tasks.instrumented(BuscarAnimalMedianteCadena.class, datos);
    }
}
