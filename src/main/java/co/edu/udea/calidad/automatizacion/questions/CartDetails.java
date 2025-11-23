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
                    .viewedBy(actor)
                    .asString()
                    .trim();
        } catch (Exception e) {
            return "";
        }
    }

    public static CartDetails of() {
        return new CartDetails();
    }
}
