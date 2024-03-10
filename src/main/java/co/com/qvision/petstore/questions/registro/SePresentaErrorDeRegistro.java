package co.com.qvision.petstore.questions.registro;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.qvision.petstore.userinterfaces.home.PaginaPrincipal.MSJ_ERROR_REGISTRO;

public class SePresentaErrorDeRegistro implements Question<Boolean> {

    public static Question<Boolean> deUsuario() {
        return new SePresentaErrorDeRegistro();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return MSJ_ERROR_REGISTRO.resolveFor(actor).isPresent();
    }
}
