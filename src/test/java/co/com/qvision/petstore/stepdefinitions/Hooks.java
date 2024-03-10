package co.com.qvision.petstore.stepdefinitions;

import co.com.qvision.petstore.interactions.comunes.AbrirNavegador;
import cucumber.api.java.Before;
import cucumber.api.java.es.Dado;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class Hooks {

    @Managed(driver = "chrome")
    private WebDriver hisBrowser;

    @Before
    public void iniciaElencoDeActores() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Dado("^que el usuario se encuentra en el home del aplicativo$")
    public void queElUsuarioSeEncuentraEnElHomeDelAplicativo() {
        theActorCalled("Pepito").wasAbleTo(AbrirNavegador.en());

    }
}
