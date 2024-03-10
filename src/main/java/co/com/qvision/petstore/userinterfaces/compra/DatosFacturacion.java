package co.com.qvision.petstore.userinterfaces.compra;

import net.serenitybdd.screenplay.targets.Target;

public class DatosFacturacion {

    public static final Target DDL_CARD_TYPE = Target.the("Drop down list tipo de tarjeta").locatedBy("//select[@name='order.cardType']");
    public static final Target TXT_OPTION_CARD_TYPE = Target.the("Opcion tipo de tarjeta en la lista").locatedBy("//select[@name='order.cardType']//option[@value='{0}']");
    public static final Target TXT_PAYMENT_DETAIL = Target.the("Campo ingreso informacion facturacion").locatedBy("//input[@name='{0}']");
    public static final Target BTN_SUBMIT = Target.the("Boton para proceder con el pago").locatedBy("//input[@name='newOrder']");
    public static final Target BTN_CONFIRM = Target.the("Boton para confirmar pago").locatedBy("//a[text()='Confirm']");
    public static final Target MSJ_CONFIRM_BUY = Target.the("Mensaje confirmacion de compra").locatedBy("//li[text()='Thank you, your order has been submitted.']");

    private DatosFacturacion(){}
}
