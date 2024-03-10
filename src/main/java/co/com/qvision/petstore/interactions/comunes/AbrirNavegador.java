package co.com.qvision.petstore.interactions.comunes;

import co.com.qvision.petstore.userinterfaces.home.PaginaPrincipal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AbrirNavegador implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor)

        {
            actor.attemptsTo(Open.browserOn(new PaginaPrincipal()));
        }

        public static AbrirNavegador en() {
            return instrumented(AbrirNavegador.class);
        }

}
