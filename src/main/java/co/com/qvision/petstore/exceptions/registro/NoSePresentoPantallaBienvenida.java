package co.com.qvision.petstore.exceptions.registro;

public class NoSePresentoPantallaBienvenida extends AssertionError{

    public static final String PANTALLA_BIENVENIDA_NO_PRESENTADA =
            "Al usuario no se le presento la pantalla de bienvenida";

    public NoSePresentoPantallaBienvenida(String message, Throwable cause) {super(message, cause);
    }


}
