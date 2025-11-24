package co.edu.udea.calidad.automatizacion.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import co.edu.udea.calidad.automatizacion.userinterfaces.CheckoutPage;

public class Checkout {

    /** Deja el carrito listo: entra al carrito */
    public static Performable cartReady() {
        return Task.where("{0} ensures the cart has items and opens the cart",
                Click.on(CheckoutPage.CART_ICON)
        );
    }

    /** Presiona el botón de checkout */
    public static Performable proceed() {
        return Task.where("{0} proceeds to checkout",
                Click.on(CheckoutPage.CHECKOUT_BUTTON),
                Click.on(CheckoutPage.NEXT_BUTTON)
        );
    }

    /** Selecciona método de pago SafePay */
    public static Performable selectPayment() {
        return Task.where("{0} selects a valid payment method",
                Click.on(CheckoutPage.SAFE_PAY),
                Enter.theValue("testSafeUser").into(CheckoutPage.SAFE_USER),
                Enter.theValue("testSafePassword").into(CheckoutPage.SAFE_PASSWORD)
        );
    }

    /** Realiza el pago */
    public static Performable finishPayment() {
        return Task.where("{0} completes the payment process",
                Click.on(CheckoutPage.PAY_NOW)
        );
    }
}


