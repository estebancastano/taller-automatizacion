package co.edu.udea.calidad.automatizacion.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.questions.Text;

import co.edu.udea.calidad.automatizacion.userinterfaces.CartPage;

public class CartDetails implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        try {
            return Text.of(CartPage.TOTAL)
                    .answeredBy(actor)
                    .trim();
        } catch (Exception e) {
            return "";
        }
    }

    public static CartDetails of() {
        return new CartDetails();
    }

    // ---------------------------------------------------------------------
    // NUEVO → pregunta para validar cantidades correctas en el carrito
    // ---------------------------------------------------------------------
    public static Question<Boolean> quantitiesAreCorrect() {
        return actor -> {

            try {
                // Obtener cantidades del UI
                String q1 = Text.of(CartPage.PRODUCT_1_QTY)
                        .answeredBy(actor)
                        .trim();

                String q2 = Text.of(CartPage.PRODUCT_2_QTY)
                        .answeredBy(actor)
                        .trim();

                int qty1 = Integer.parseInt(q1);
                int qty2 = Integer.parseInt(q2);

                // Cantidades esperadas según AddMultipleProducts
                boolean ok1 = qty1 == 2;
                boolean ok2 = qty2 == 5;

                return ok1 && ok2;

            } catch (Exception e) {
                return false;
            }
        };
    }
}
