package co.edu.udea.calidad.automatizacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaymentPage {
    public static final Target CREDIT_CARD_OPTION = Target.the("credit card option").located(By.id("creditCard"));
    public static final Target CARD_NUMBER = Target.the("card number").located(By.name("card_number"));
    public static final Target CVV = Target.the("cvv").located(By.name("cvv_number"));
    public static final Target HOLDER = Target.the("card holder").located(By.name("cardholder_name"));
    public static final Target PAY_BUTTON = Target.the("pay now").located(By.id("pay_now_btn_ManualPayment"));
    public static final Target CONFIRMATION_MESSAGE = Target.the("order confirmation").located(By.cssSelector(".confirmationText"));
}

