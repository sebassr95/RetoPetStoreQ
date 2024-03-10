package co.com.qvision.petstore.stepdefinitions.registrarusuario;

import co.com.qvision.petstore.exceptions.registro.NoSePresentoMensajeRegistroErrado;
import co.com.qvision.petstore.exceptions.registro.NoSePresentoPantallaBienvenida;
import co.com.qvision.petstore.models.DatosUsuario;
import co.com.qvision.petstore.questions.registro.SePresentaErrorDeRegistro;
import co.com.qvision.petstore.questions.registro.SePresentaPantallaBienvenida;
import co.com.qvision.petstore.tasks.autenticacion.IngresarEnLaAutenticacion;
import co.com.qvision.petstore.tasks.registro.IngresarAlFormularioDeRegistro;
import co.com.qvision.petstore.tasks.registro.RegistrarDatos;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegistrarUsuarioStep {


    @Cuando("^el decide registrar sus datos$")
    public void elDecideRegistrarSusDatos(List<DatosUsuario> datos) {
    theActorInTheSpotlight().attemptsTo(IngresarEnLaAutenticacion.deUsuario(),
            IngresarAlFormularioDeRegistro.deUsuario(),
            RegistrarDatos.deUsuario(datos.get(0)));
    }

    @Cuando("^el decide registrar los datos de un usuario ya registrado$")
    public void elDecideRegistrarLosDatosDeUnUsuarioYaRegistrado(List<DatosUsuario> datos) {
        theActorInTheSpotlight().attemptsTo(IngresarEnLaAutenticacion.deUsuario(),
                IngresarAlFormularioDeRegistro.deUsuario(),
                RegistrarDatos.deUsuario(datos.get(0)));
    }

    @Cuando("^decide registrar su usuario con datos incompletos$")
    public void decideRegistrarSuUsuarioConDatosIncompletos(List<DatosUsuario> datos) {
        theActorInTheSpotlight().attemptsTo(IngresarEnLaAutenticacion.deUsuario(),
                IngresarAlFormularioDeRegistro.deUsuario(),
                RegistrarDatos.deUsuario(datos.get(0)));
    }

    @Entonces("^deberia generarse error sin permitir el registro$")
    public void deberiaGenerarseErrorSinPermitirElRegistro() {
        theActorInTheSpotlight()
                .should(
                        seeThat(SePresentaErrorDeRegistro.deUsuario())
                                .orComplainWith(
                                        NoSePresentoMensajeRegistroErrado.class,
                                        NoSePresentoMensajeRegistroErrado.MSJ_REGISTRO_ERRADO_NO_PRESENTADO
                        )
        );
    }

    @Entonces("^deberia quedar registrado en el aplicativo$")
    public void deberiaQuedarRegistradoEnElAplicativo() {
    theActorInTheSpotlight()
            .should(
                    seeThat(SePresentaPantallaBienvenida.deUsuario())
                            .orComplainWith(
                                    NoSePresentoPantallaBienvenida.class,
                                    NoSePresentoPantallaBienvenida.PANTALLA_BIENVENIDA_NO_PRESENTADA
                            )
            );
    }


}
