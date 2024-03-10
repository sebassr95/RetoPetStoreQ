package co.com.qvision.petstore.stepdefinitions.autenticacion;

import co.com.qvision.petstore.exceptions.autenticacion.NoSePresentoMensajeDeBienvenida;
import co.com.qvision.petstore.exceptions.autenticacion.NoSePresentoMensajeDeErrorPorDatosErrados;
import co.com.qvision.petstore.models.DatosUsuario;
import co.com.qvision.petstore.questions.autenticacion.SePresentaMensajeBienvenida;
import co.com.qvision.petstore.questions.autenticacion.SePresentaMensajeDeError;
import co.com.qvision.petstore.tasks.autenticacion.AutenticarDatos;
import co.com.qvision.petstore.tasks.autenticacion.IngresarEnLaAutenticacion;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AutenticacionUsuarioStep {

    @Cuando("^el realiza la autenticacion en el aplicativo con datos validos$")
    public void elRealizaLaAutenticacionEnElAplicativoConDatosValidos(List<DatosUsuario> datos) {
        theActorInTheSpotlight().attemptsTo(
                IngresarEnLaAutenticacion.deUsuario(),
                AutenticarDatos.deUsuario(datos.get(0))
        );
    }

    @Cuando("^el realiza la autenticacion en el aplicativo con datos invalidos$")
    public void elRealizaLaAutenticacionEnElAplicativoConDatosInvalidos(List<DatosUsuario> datos) {
        theActorInTheSpotlight().attemptsTo(
                IngresarEnLaAutenticacion.deUsuario(),
                AutenticarDatos.deUsuario(datos.get(0))
        );
    }

    @Entonces("^deberia quedar autenticado en el aplicativo$")
    public void deberiaQuedarAutenticadoEnElAplicativo() {
        theActorInTheSpotlight()
                .should(
                        seeThat(SePresentaMensajeBienvenida.deUsuario())
                                .orComplainWith(
                                        NoSePresentoMensajeDeBienvenida.class,
                                        NoSePresentoMensajeDeBienvenida.MSJ_BIENVENIDA_NO_PRESENTADO
                                )
                );
    }

    @Entonces("^deberia visualizar el mensaje de error$")
    public void deberiaVisualizarElMensajeDeError() {
        theActorInTheSpotlight()
                .should(
                        seeThat(SePresentaMensajeDeError.deDatosErrados())
                                .orComplainWith(
                                        NoSePresentoMensajeDeErrorPorDatosErrados.class,
                                        NoSePresentoMensajeDeErrorPorDatosErrados.MSJ_ERROR_DATOS_ERRADOS_NO_PRESENTADO
                                )
                );
    }
}
