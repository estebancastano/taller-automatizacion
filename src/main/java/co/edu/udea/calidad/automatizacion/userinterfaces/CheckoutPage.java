package co.edu.udea.calidad.automatizacion.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class CheckoutPage {

    public static final Target CART_ICON = Target.the("Cart icon")
            .located(By.id("menuCart"));

    public static final Target CHECKOUT_BUTTON = Target.the("Checkout button")
            .located(By.id("checkOutPopUp"));

    public static final Target NEXT_BUTTON = Target.the("Next button")
            .located(By.id("next_btn"));

    public static final Target SAFE_PAY = Target.the("SafePay option")
            .located(By.name("safepay"));

    public static final Target SAFE_USER = Target.the("SafePay username field")
            .located(By.name("safepay_username"));

    public static final Target SAFE_PASSWORD = Target.the("SafePay password field")
            .located(By.name("safepay_password"));

    public static final Target PAY_NOW = Target.the("Pay Now button")
            .located(By.id("pay_now_btn_SAFEPAY"));

    public static final Target ORDER_MESSAGE = Target.the("Order confirmation message")
            .located(By.cssSelector("span.roboto-bold > span"));

    public static final Target TOTAL_PRICE_SUMMARY = Target.the("Total price summary")
            .located(By.cssSelector("#orderPaymentSummary > div:nth-child(3) span:nth-child(2)"));

    public static final Target TOTAL_PRICE_CART = Target.the("Total cart price")
            .located(By.cssSelector("#shoppingCart > table tfoot td:nth-child(2) span"));
}

