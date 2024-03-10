package co.com.qvision.petstore.exceptions.autenticacion;

public class NoSePresentoMensajeDeBienvenida extends AssertionError{

    public static final String MSJ_BIENVENIDA_NO_PRESENTADO =
            "Al usuario no se le presento mensaje de bienvenida";

    public NoSePresentoMensajeDeBienvenida(String message, Throwable cause) {
        super(message, cause);
    }


}
