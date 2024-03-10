package co.com.qvision.petstore.exceptions.compra;

public class NoSePresentoMensajeCarritoVacio extends AssertionError{

    public static final String MSJ_CARRITO_VACIO_NO_PRESENTADO =
            "Al usuario no se le presento mensaje de carrito vacio";

    public NoSePresentoMensajeCarritoVacio(String message, Throwable cause) {
        super(message, cause);
    }

}
