package co.com.qvision.petstore.questions.autenticacion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.thucydides.core.annotations.Step;

import static co.com.qvision.petstore.userinterfaces.autenticacion.Autenticacion.MSJ_ERROR_LOGIN;

public class SePresentaMensajeDeError implements Question<Boolean> {

    public static Question<Boolean> deDatosErrados(){
        return new SePresentaMensajeDeError();
    }

    @Step("{0} Verifica que se presente el mensaje de error")
    @Override
    public Boolean answeredBy(Actor actor) {
        return MSJ_ERROR_LOGIN.resolveFor(actor).isPresent();
    }
}
