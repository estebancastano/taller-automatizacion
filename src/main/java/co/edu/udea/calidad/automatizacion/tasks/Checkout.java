package co.edu.udea.calidad.automatizacion.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import co.edu.udea.calidad.automatizacion.tasks.Checkout;

public class Checkout {

    /** Deja el carrito listo: entra al carrito */
    public static Performable cartReady() {
        return Task.where("{0} ensures the cart has items and opens the cart",
                Click.on(Checkout.CART_ICON)
        );
    }

    /** Presiona el botón de checkout */
    public static Performable proceed() {
        return Task.where("{0} proceeds to checkout",
                Click.on(Checkout.CHECKOUT_BUTTON),
                Click.on(Checkout.NEXT_BUTTON)
        );
    }

    /** Selecciona método de pago SafePay */
    public static Performable selectPayment() {
        return Task.where("{0} selects a valid payment method",
                Click.on(Checkout.SAFE_PAY),
                Enter.theValue("testSafeUser").into(Checkout.SAFE_USER),
                Enter.theValue("testSafePassword").into(Checkout.SAFE_PASSWORD)
        );
    }

    /** Realiza el pago */
    public static Performable finishPayment() {
        return Task.where("{0} completes the payment process",
                Click.on(Checkout.PAY_NOW)
        );
    }
}


