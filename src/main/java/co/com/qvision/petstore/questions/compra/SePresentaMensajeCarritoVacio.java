package co.com.qvision.petstore.questions.compra;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.thucydides.core.annotations.Step;

import static co.com.qvision.petstore.userinterfaces.compra.CarritoCompras.MSJ_EMPTY_CAR;

public class SePresentaMensajeCarritoVacio implements Question<Boolean> {

    public static Question<Boolean> sinProductos(){
        return new SePresentaMensajeCarritoVacio();
    }

    @Override
    @Step("{0} verifica que se presente mensaje de carrito vacio")
    public Boolean answeredBy(Actor actor) {
        return MSJ_EMPTY_CAR.resolveFor(actor).isPresent();
    }
}
