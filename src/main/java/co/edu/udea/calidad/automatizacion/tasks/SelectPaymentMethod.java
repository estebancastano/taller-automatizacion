package co.edu.udea.calidad.automatizacion.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Actor;
import co.edu.udea.calidad.automatizacion.userinterfaces.PaymentPage;
import co.edu.udea.calidad.automatizacion.interactions.EnterText;
import co.edu.udea.calidad.automatizacion.interactions.ClickElement;

public class SelectPaymentMethod implements Task {

    private final String cardNumber;
    private final String cvv;
    private final String holder;

    public SelectPaymentMethod(String cardNumber, String cvv, String holder){
        this.cardNumber = cardNumber; this.cvv = cvv; this.holder = holder;
    }

    public static SelectPaymentMethod with(String cardNumber, String cvv, String holder){
        return new SelectPaymentMethod(cardNumber, cvv, holder);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ClickElement.element(PaymentPage.CREDIT_CARD_OPTION),
                EnterText.into(PaymentPage.CARD_NUMBER, cardNumber),
                EnterText.into(PaymentPage.CVV, cvv),
                EnterText.into(PaymentPage.HOLDER, holder),
                ClickElement.element(PaymentPage.PAY_BUTTON)
        );
    }
}

