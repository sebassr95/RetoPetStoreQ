package co.com.qvision.petstore.userinterfaces.home;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://petstore.octoperf.com/actions/Catalog.action")
public class PaginaPrincipal extends PageObject {

    public static final Target BTN_AUTENTICACION = Target.the("Boton para ingresar a pantalla de autenticacion").locatedBy("//a[text()='Sign In']");
    public static final Target LBL_MENU_LATERAL = Target.the("Menu lateral pagina de inicio").locatedBy("//div[@id='SidebarContent']");
    public static final Target MSJ_ERROR_REGISTRO = Target.the("Mensaje de error al generarse error en registro").locatedBy("//h1[contains(text(),'Internal Server Error')]");
    public static final Target BTN_ANIMAL_TYPE = Target.the("Botón tipo de animal").locatedBy("//div[@id='SidebarContent']//*[contains(@href,'/actions/Catalog.action?viewCategory=&categoryId={0}')]");
    public static final Target TXT_SEARCH = Target.the("Campo para buscar animal mediante cadena de caracteres").locatedBy("//input[@name='keyword']");
    public static final Target BTN_SEARCH = Target.the("Boton para buscar animal mediante los caracteres ingresados").locatedBy("//input[@name='searchProducts']");

}

