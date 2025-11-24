package co.edu.udea.calidad.automatizacion.stepdefinitions;

import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actors.OnStage;
import co.edu.udea.calidad.automatizacion.tasks.Checkout;
import co.edu.udea.calidad.automatizacion.questions.OrderConfirmation;

import static net.serenitybdd.screenplay.GivenWhenThen.*;

public class CheckoutStepDefinitions {

    @Given("that the customer already has products in the cart")
    public void productsInCart() {
        OnStage.theActorCalled("Cliente").attemptsTo(
                Checkout.cartReady()
        );
    }

    @When("he proceeds to checkout")
    public void proceedToCheckout() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Checkout.proceed()
        );
    }

    @When("he selects a valid payment method")
    public void selectPaymentMethod() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Checkout.selectPayment()
        );
    }

    @When("he completes the payment process")
    public void completePayment() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Checkout.finishPayment()
        );
    }

    @Then("he should see a confirmation message indicating that the order was placed successfully")
    public void orderSuccessMessage() {
        OnStage.theActorInTheSpotlight().should(
                seeThat(OrderConfirmation.text(), org.hamcrest.Matchers.equalTo("Order placed successfully"))
        );
    }

    @Then("the payment amount should match the total of the products in the cart")
    public void verifyTotalAmount() {
        OnStage.theActorInTheSpotlight().should(
                seeThat(OrderConfirmation.totalMatchesCart())
        );
    }
}

