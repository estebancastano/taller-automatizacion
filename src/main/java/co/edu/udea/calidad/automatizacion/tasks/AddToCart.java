package co.edu.udea.calidad.automatizacion.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Actor;
import co.edu.udea.calidad.automatizacion.userinterfaces.ProductPage;
import co.edu.udea.calidad.automatizacion.interactions.EnterText;
import co.edu.udea.calidad.automatizacion.interactions.ClickElement;

public class AddToCart implements Task {
    private final int quantity;

    public AddToCart(int quantity){ this.quantity = quantity; }

    public static AddToCart quantity(int q){ return new AddToCart(q); }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                EnterText.into(ProductPage.QUANTITY, String.valueOf(quantity)),
                ClickElement.element(ProductPage.ADD_TO_CART)
        );
    }
}
