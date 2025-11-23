package co.edu.udea.calidad.automatizacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ConfirmationPage {

    /** Mensaje principal de confirmación */
    public static final Target ORDER_CONFIRMATION_MESSAGE = Target.the("mensaje de confirmación")
            .located(By.xpath("//span[contains(text(),'Thank you for buying with Advantage')]"));

    /** Número de la orden */
    public static final Target ORDER_NUMBER = Target.the("número de la orden")
            .located(By.xpath("//label[contains(text(),'Order Number')]/following-sibling::label"));

    /** Total pagado */
    public static final Target ORDER_TOTAL = Target.the("precio total de la orden")
            .located(By.xpath("//label[contains(text(),'Total')]/following-sibling::label"));

    /** Botón Continue Shopping */
    public static final Target CONTINUE_SHOPPING = Target.the("botón continuar comprando")
            .located(By.id("continue_shopping_btnundefined"));
}
