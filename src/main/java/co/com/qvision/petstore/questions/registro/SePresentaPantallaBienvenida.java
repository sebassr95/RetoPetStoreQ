package co.com.qvision.petstore.questions.registro;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static co.com.qvision.petstore.userinterfaces.home.PaginaPrincipal.LBL_MENU_LATERAL;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

public class SePresentaPantallaBienvenida implements Question<Boolean> {

    public static Question<Boolean> deUsuario() {
        return new SePresentaPantallaBienvenida();
    }

    @Override
    @Step("{0} Verifica que se presente la pantalla inicial")
    public Boolean answeredBy(Actor actor) {
        WaitUntil.the(LBL_MENU_LATERAL, isNotVisible()).forNoMoreThan(10).seconds();
        return LBL_MENU_LATERAL.resolveFor(actor).isVisible();
    }
}
