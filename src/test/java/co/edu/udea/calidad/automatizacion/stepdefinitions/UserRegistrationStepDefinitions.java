package co.edu.udea.calidad.automatizacion.stepdefinitions;


import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actors.OnStage;
import co.edu.udea.calidad.automatizacion.tasks.Register;
import co.edu.udea.calidad.automatizacion.questions.RegisterMessage;

import static net.serenitybdd.screenplay.GivenWhenThen.*;

public class UserRegistrationStepDefinitions {

    @Given("that the customer navigates to the Advantage Online Shopping homepage")
    public void navigateToHome() {
        OnStage.theActorCalled("Cliente").attemptsTo(
                Register.openHomePage()
        );
    }

    @When("he registers with valid personal information")
    public void registerValidUser() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Register.withData("nuevoUser", "email@gmail.com", "Password123")
        );
    }

    @Then("he should see a confirmation message indicating that the account was created successfully")
    public void verifyRegistrationSuccess() {
        OnStage.theActorInTheSpotlight().should(
                seeThat(RegisterMessage.success(), org.hamcrest.Matchers.equalTo("Account created successfully"))
        );
    }

    @When("he tries to register using an already registered username")
    public void registerExistingUser() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Register.withData("usuarioExistente", "other@gmail.com", "Password123")
        );
    }

    @Then("he should see a message indicating that the username already exists")
    public void verifyDuplicateUserError() {
        OnStage.theActorInTheSpotlight().should(
                seeThat(RegisterMessage.error(), org.hamcrest.Matchers.equalTo("Username already exists"))
        );
    }
}

