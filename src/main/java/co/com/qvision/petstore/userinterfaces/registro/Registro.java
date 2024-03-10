package co.com.qvision.petstore.userinterfaces.registro;

import net.serenitybdd.screenplay.targets.Target;

public class Registro {

    public static final Target BTN_INGRESO_REGISTRO = Target.the("Boton para ingresar al formulario de registro").locatedBy("//a[text()='Register Now!']");
    public static final Target TXT_USERID_REGISTRO = Target.the("UserID").locatedBy("//input[@name='username']");
    public static final Target TXT_PASSWORD_REGISTRO = Target.the("Clave").locatedBy("//input[@name='password']");
    public static final Target TXT_CONFIRM_PASSWORD_REGISTRO = Target.the("Confirmar clave").locatedBy("//input[@name='repeatedPassword']");
    public static final Target TXT_ACCOUNT_INFORMATION = Target.the("Informacion de la cuenta").locatedBy("//input[@name='{0}']");
    public static final Target BTN_GUARDAR_REGISTRO = Target.the("Boton para guardar el registro").locatedBy("//input[@name='newAccount']");

    private Registro(){}
}
