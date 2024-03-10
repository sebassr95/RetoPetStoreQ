package co.com.qvision.petstore.tasks.compra;

import co.com.qvision.petstore.models.DatosUsuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import static co.com.qvision.petstore.userinterfaces.compra.DatosFacturacion.*;
import static co.com.qvision.petstore.utils.constantes.DetalleDePagoConstante.*;

public class DiligenciarInformacionFacturacion implements Task {

    private DatosUsuario datos;

    public DiligenciarInformacionFacturacion(DatosUsuario datos) {
        this.datos = datos;
    }

    @Override
    @Step("{0} diligencia la informacion de pago para finalizar la compra")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DDL_CARD_TYPE),
                Click.on(TXT_OPTION_CARD_TYPE.of(datos.getCardType())),
                Enter.theValue(datos.getCardNumber()).into(TXT_PAYMENT_DETAIL.of(CARD_NUMBER)),
                Enter.theValue(datos.getExpiryDate()).into(TXT_PAYMENT_DETAIL.of(EXPIRY_DATE)),
                Enter.theValue(datos.getFirstNameBillingAddress()).into(TXT_PAYMENT_DETAIL.of(FIRSTNAME_BILLING)),
                Enter.theValue(datos.getLastNameBillingAddress()).into(TXT_PAYMENT_DETAIL.of(LASTNAME_BILLING)),
                Enter.theValue(datos.getAddresOneBillingAddress()).into(TXT_PAYMENT_DETAIL.of(ADDRESSONE_BILLING)),
                Enter.theValue(datos.getAddresTwoBillingAddress()).into(TXT_PAYMENT_DETAIL.of(ADDRESSTWO_BILLING)),
                Enter.theValue(datos.getCityBillingAddress()).into(TXT_PAYMENT_DETAIL.of(CITY_BILLING)),
                Enter.theValue(datos.getStateBillingAddress()).into(TXT_PAYMENT_DETAIL.of(STATE_BILLING)),
                Enter.theValue(datos.getZipBillingAddress()).into(TXT_PAYMENT_DETAIL.of(ZIP_BILLING)),
                Enter.theValue(datos.getCountryBillingAddress()).into(TXT_PAYMENT_DETAIL.of(COUNTRY_BILLING)),
                Click.on(BTN_SUBMIT)
        );
    }

    public static Performable dePago(DatosUsuario datos) {
        return Tasks.instrumented(DiligenciarInformacionFacturacion.class, datos);
    }

}
