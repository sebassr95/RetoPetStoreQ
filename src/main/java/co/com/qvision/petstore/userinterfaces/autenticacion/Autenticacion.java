package co.com.qvision.petstore.userinterfaces.autenticacion;

import net.serenitybdd.screenplay.targets.Target;

public class Autenticacion {

   public static final Target TXT_DATOS_LOGIN = Target.the("Campo ingreso autenticacion").locatedBy("//input[@name='{0}']");
   public static final Target MSJ_BIENVENIDA = Target.the("Mensaje de bienvenida").locatedBy("//div[@id='WelcomeContent']");
   public static final Target MSJ_ERROR_LOGIN = Target.the("Mensaje de error autenticacion").locatedBy("//div[@id='Content']//li[contains(text(),'Invalid username or password')]");

    private Autenticacion(){}
}
