package co.edu.udea.calidad.automatizacion.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import co.edu.udea.calidad.automatizacion.userinterfaces.ProductPage;
import co.edu.udea.calidad.automatizacion.userinterfaces.LoginPage;
import co.edu.udea.calidad.automatizacion.interactions.EnterText;
import co.edu.udea.calidad.automatizacion.interactions.ClickElement;

public class AddToCart implements Task {

    private final int quantity;

    public AddToCart(int quantity) {
        this.quantity = quantity;
    }

    public static AddToCart quantity(int q) {
        return Tasks.instrumented(AddToCart.class, q);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                EnterText.into(ProductPage.QUANTITY, String.valueOf(quantity)),
                ClickElement.element(ProductPage.ADD_TO_CART)
        );
    }

    // ---------------------------------------------------------
    // 1) LOGIN BEFORE SHOPPING (sin Task.where)
    // ---------------------------------------------------------
    public static Task loginBeforeShopping() {
        return Tasks.instrumented(LoginBeforeShopping.class);
    }

    public static class LoginBeforeShopping implements Task {
        @Override
        public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    EnterText.into(LoginPage.USERNAME, "clienteDemo"),
                    EnterText.into(LoginPage.PASSWORD, "123456"),
                    ClickElement.element(LoginPage.LOGIN_BUTTON)
            );
        }
    }

    // ---------------------------------------------------------
    // 2) SELECT PRODUCTS
    // ---------------------------------------------------------
    public static Task selectProducts() {
        return Tasks.instrumented(SelectProducts.class);
    }

    public static class SelectProducts implements Task {
        @Override
        public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    ClickElement.element(ProductPage.PRODUCT_1),
                    ClickElement.element(ProductPage.PRODUCT_2)
            );
        }
    }

    // ---------------------------------------------------------
    // 3) ADD MULTIPLE PRODUCTS WITH DIFFERENT QUANTITIES
    // ---------------------------------------------------------
    public static Task addMultipleProducts() {
        return Tasks.instrumented(AddMultipleProducts.class);
    }

    public static class AddMultipleProducts implements Task {
        @Override
        public <T extends Actor> void performAs(T actor) {

            // PRODUCTO 1
            actor.attemptsTo(
                    ClickElement.element(ProductPage.PRODUCT_1),
                    EnterText.into(ProductPage.QUANTITY, "2"),
                    ClickElement.element(ProductPage.ADD_TO_CART)
            );

            actor.attemptsTo(
                    ClickElement.element(ProductPage.BACK_TO_PRODUCTS)
            );

            // PRODUCTO 2
            actor.attemptsTo(
                    ClickElement.element(ProductPage.PRODUCT_2),
                    EnterText.into(ProductPage.QUANTITY, "5"),
                    ClickElement.element(ProductPage.ADD_TO_CART)
            );
        }
    }
}
