package co.com.qvision.petstore.exceptions.autenticacion;

public class NoSePresentoMensajeDeErrorPorDatosErrados extends AssertionError{

    public static final String MSJ_ERROR_DATOS_ERRADOS_NO_PRESENTADO =
            "Al usuario no se le presento mensaje de error por datos errados";

    public NoSePresentoMensajeDeErrorPorDatosErrados(String message, Throwable cause) {
        super(message, cause);
    }


}
