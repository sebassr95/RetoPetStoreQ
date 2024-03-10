package co.com.qvision.petstore.stepdefinitions.compraranimal;

import co.com.qvision.petstore.exceptions.compra.NoSePresentoMensajeCarritoVacio;
import co.com.qvision.petstore.exceptions.compra.NoSePresentoMensajeDeConfirmacionDeCompra;
import co.com.qvision.petstore.models.DatosUsuario;
import co.com.qvision.petstore.questions.compra.SePresentaMensajeCarritoVacio;
import co.com.qvision.petstore.questions.compra.SePresentaMensajeCompraExitosa;
import co.com.qvision.petstore.tasks.autenticacion.AutenticarDatos;
import co.com.qvision.petstore.tasks.autenticacion.IngresarEnLaAutenticacion;
import co.com.qvision.petstore.tasks.compra.*;
import co.com.qvision.petstore.tasks.home.BuscarAnimalMedianteCadena;
import co.com.qvision.petstore.tasks.home.SeleccionarTipoAnimal;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ComprarAnimalStep {

    @Cuando("^el decide comprar un animal$")
    public void elDecideComprarUnAnimal(List<DatosUsuario> datos) {
       theActorInTheSpotlight().attemptsTo(
               IngresarEnLaAutenticacion.deUsuario(),
               AutenticarDatos.deUsuario(datos.get(0)),
               SeleccionarTipoAnimal.desdeDashboard(datos.get(0)),
               SeleccionarAnimal.paraComprar(datos.get(0)),
               AgregarAlCarrito.elAnimal(datos.get(0)),
               ConfirmarCantidadProducto.delProductoAgregado(datos.get(0)),
               ConfirmarProductosDelCarrito.agregados(),
               DiligenciarInformacionFacturacion.dePago(datos.get(0)),
               ConfirmarDatosFacturacion.dePago()
       );
    }

    @Cuando("^el decide comprar un animal buscandolo mediante su nombre$")
    public void elDecideComprarUnAnimalBuscandoloMedianteSuNombre(List<DatosUsuario> datos) {
        theActorInTheSpotlight().attemptsTo(
                IngresarEnLaAutenticacion.deUsuario(),
                AutenticarDatos.deUsuario(datos.get(0)),
                BuscarAnimalMedianteCadena.deCaracteres(datos.get(0)),
                SeleccionarAnimal.paraComprar(datos.get(0)),
                AgregarAlCarrito.elAnimal(datos.get(0)),
                ConfirmarCantidadProducto.delProductoAgregado(datos.get(0)),
                ConfirmarProductosDelCarrito.agregados(),
                DiligenciarInformacionFacturacion.dePago(datos.get(0)),
                ConfirmarDatosFacturacion.dePago()
        );
    }


    @Cuando("^el decide agregar una cantidad de cero para el producto seleccionado$")
    public void elDecideAgregarUnaCantidadDeCeroParaElProductoSeleccionado(List<DatosUsuario> datos) {
       theActorInTheSpotlight().attemptsTo(
               IngresarEnLaAutenticacion.deUsuario(),
               AutenticarDatos.deUsuario(datos.get(0)),
               SeleccionarTipoAnimal.desdeDashboard(datos.get(0)),
               SeleccionarAnimal.paraComprar(datos.get(0)),
               AgregarAlCarrito.elAnimal(datos.get(0)),
               ConfirmarCantidadProducto.delProductoAgregado(datos.get(0))
       );
    }

    @Cuando("^el decide remover el producto agregado en el carrito de compras$")
    public void elDecideRemoverElProductoAgregadoEnElCarritoDeCompras(List<DatosUsuario> datos) {
        theActorInTheSpotlight().attemptsTo(
                IngresarEnLaAutenticacion.deUsuario(),
                AutenticarDatos.deUsuario(datos.get(0)),
                SeleccionarTipoAnimal.desdeDashboard(datos.get(0)),
                SeleccionarAnimal.paraComprar(datos.get(0)),
                AgregarAlCarrito.elAnimal(datos.get(0)),
                RemoverProductosDelCarrito.agregado()
        );
    }

    @Entonces("^deberia visualizar el carrito vacio$")
    public void deberiaVisualizarElCarritoVacio() {
        theActorInTheSpotlight()
                .should(
                        seeThat(SePresentaMensajeCarritoVacio.sinProductos())
                                .orComplainWith(
                                        NoSePresentoMensajeCarritoVacio.class,
                                        NoSePresentoMensajeCarritoVacio.MSJ_CARRITO_VACIO_NO_PRESENTADO
                                )

                );
    }

    @Entonces("^deberia visualizar el mensaje de compra exitosa$")
    public void deberiaVisualizarElMensajeDeCompraExitosa() {
        theActorInTheSpotlight()
                .should(
                        seeThat(SePresentaMensajeCompraExitosa.delProducto())
                                .orComplainWith(
                                        NoSePresentoMensajeDeConfirmacionDeCompra.class,
                                        NoSePresentoMensajeDeConfirmacionDeCompra.MSJ_COMPRA_EXITOSA_NO_PRESENTADO
                )
        );
    }




}
