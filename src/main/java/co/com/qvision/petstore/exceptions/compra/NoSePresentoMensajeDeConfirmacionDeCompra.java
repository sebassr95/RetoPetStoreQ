package co.com.qvision.petstore.exceptions.compra;

public class NoSePresentoMensajeDeConfirmacionDeCompra extends AssertionError{

    public static final String MSJ_COMPRA_EXITOSA_NO_PRESENTADO =
            "Al usuario no se le presento el mensaje de confirmacion de compra exitosa";

    public NoSePresentoMensajeDeConfirmacionDeCompra(String message, Throwable cause) {
        super(message, cause);
    }

}
