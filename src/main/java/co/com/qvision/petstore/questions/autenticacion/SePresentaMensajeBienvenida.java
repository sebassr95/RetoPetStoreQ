package co.com.qvision.petstore.questions.autenticacion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.thucydides.core.annotations.Step;

import static co.com.qvision.petstore.userinterfaces.autenticacion.Autenticacion.MSJ_BIENVENIDA;

public class SePresentaMensajeBienvenida implements Question<Boolean> {

    public static Question<Boolean> deUsuario(){
        return new SePresentaMensajeBienvenida();
    }

    @Override
    @Step("{0} verifica que se presente mensaje de bienvenida")
    public Boolean answeredBy(Actor actor) {
    return MSJ_BIENVENIDA.resolveFor(actor).isPresent();
    }
}
