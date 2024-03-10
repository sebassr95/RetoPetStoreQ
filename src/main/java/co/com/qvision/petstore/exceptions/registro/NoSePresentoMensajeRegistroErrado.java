package co.com.qvision.petstore.exceptions.registro;

public class NoSePresentoMensajeRegistroErrado extends AssertionError{

    public static final String MSJ_REGISTRO_ERRADO_NO_PRESENTADO =
            "Al usuario no se le presento mensaje de error por registro fallido";

    public NoSePresentoMensajeRegistroErrado(String message, Throwable cause) {
        super(message, cause);
    }

}
