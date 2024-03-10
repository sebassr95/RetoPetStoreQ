package co.com.qvision.petstore.userinterfaces.compra;

import net.serenitybdd.screenplay.targets.Target;

public class SeleccionAnimal {

    public static final Target BTN_PRODUCT_ID_ANIMAL = Target.the("Product ID del animal").locatedBy("(//*[contains(@href,'/actions/Catalog.action?viewProduct=&productId={0}')])[1]");
    public static final Target BTN_ADD_CART = Target.the("Boton agregar al carrito").locatedBy("//a[contains(@href,'/actions/Cart.action?addItemToCart=&workingItemId={0}')]");

    private SeleccionAnimal(){}
}
