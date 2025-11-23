package co.edu.udea.calidad.automatizacion.questions;

import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.Question;
import co.edu.udea.calidad.automatizacion.userinterfaces.CheckoutPage;

public class OrderConfirmation {

    /** Retorna el mensaje de orden completada */
    public static Question<String> text() {
        return actor -> Text.of(CheckoutPage.ORDER_MESSAGE)
                .viewedBy(actor)
                .asString()
                .trim();
    }

    /** Verifica que el total del carrito coincide con el total pagado */
    public static Question<Boolean> totalMatchesCart() {
        return actor -> {
            try {
                double totalCart = Double.parseDouble(
                        Text.of(CheckoutPage.TOTAL_PRICE_CART)
                                .viewedBy(actor)
                                .asString()
                                .replace("$", "")
                                .trim()
                );

                double totalPaid = Double.parseDouble(
                        Text.of(CheckoutPage.TOTAL_PRICE_SUMMARY)
                                .viewedBy(actor)
                                .asString()
                                .replace("$", "")
                                .trim()
                );

                return totalCart == totalPaid;

            } catch (Exception e) {
                return false;
            }
        };
    }
}
