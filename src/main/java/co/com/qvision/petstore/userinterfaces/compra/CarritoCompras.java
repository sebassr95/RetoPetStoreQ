package co.com.qvision.petstore.userinterfaces.compra;

import net.serenitybdd.screenplay.targets.Target;

public class CarritoCompras {

    public static final Target TXT_QUANTITY = Target.the("Campo cantidad del producto seleccionado").locatedBy("//input[@name='{0}']");
    public static final Target BTN_UPDATE_CAR = Target.the("Boton para actualizar carrito").locatedBy("//input[@name='updateCartQuantities']");
    public static final Target BTN_CHECKOUT = Target.the("Boton para proceder con la compra").locatedBy("//a[text()='Proceed to Checkout']");
    public static final Target BTN_REMOVE = Target.the("Boton para remover producto").locatedBy("//a[text()='Remove']");
    public static final Target MSJ_EMPTY_CAR = Target.the("Mensaje carrito de compras vacio").locatedBy("//div[@id='Cart']//b[text()='Your cart is empty.']");

    private CarritoCompras(){}
}
