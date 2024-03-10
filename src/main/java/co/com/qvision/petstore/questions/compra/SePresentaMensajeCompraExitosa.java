package co.com.qvision.petstore.questions.compra;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.thucydides.core.annotations.Step;

import static co.com.qvision.petstore.userinterfaces.compra.DatosFacturacion.MSJ_CONFIRM_BUY;

public class SePresentaMensajeCompraExitosa implements Question<Boolean> {

    public static Question<Boolean> delProducto(){
        return new SePresentaMensajeCompraExitosa();
    }

    @Override
    @Step("{0} verifica que se presente mensaje de compra exitosa")
    public Boolean answeredBy(Actor actor) {
        return MSJ_CONFIRM_BUY.resolveFor(actor).isPresent();
    }
}
