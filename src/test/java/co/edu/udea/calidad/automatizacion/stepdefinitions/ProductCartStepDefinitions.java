package co.edu.udea.calidad.automatizacion.stepdefinitions;

import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actors.OnStage;
import tasks.AddToCart;
import questions.CartDetails;

import static net.serenitybdd.screenplay.GivenWhenThen.*;

public class ProductCartStepDefinitions {

    @Given("that the customer is logged in")
    public void customerIsLoggedIn() {
        OnStage.theActorCalled("Cliente").attemptsTo(
                AddToCart.loginBeforeShopping()
        );
    }

    @When("he selects one or more products")
    public void selectProducts() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                AddToCart.selectProducts()
        );
    }

    @When("he adds each product to the cart with different quantities")
    public void addProductsWithQuantities() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                AddToCart.addMultipleProducts()
        );
    }

    @Then("the cart should reflect the selected products with the correct quantities")
    public void verifyCartQuantities() {
        OnStage.theActorInTheSpotlight().should(
                seeThat(CartDetails.quantitiesAreCorrect())
        );
    }
}

