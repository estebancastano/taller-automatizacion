package co.edu.udea.calidad.automatizacion.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static net.serenitybdd.screenplay.GivenWhenThen.*;

import co.edu.udea.calidad.automatizacion.tasks.Login;
import co.edu.udea.calidad.automatizacion.questions.LoginMessage;

public class LoginStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("that the customer navigates to the login page")
    public void navigateToLoginPage() {
        OnStage.theActorCalled("Cliente").attemptsTo(
                Login.openLoginPage()
        );
    }

    @When("he enters valid login credentials")
    public void enterValidCredentials() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Login.withCredentials("validUser", "validPassword")
        );
    }

    @Then("he should be logged into his account successfully")
    public void verifyLoginSuccess() {
        OnStage.theActorInTheSpotlight().should(
                seeThat(LoginMessage.success(), org.hamcrest.Matchers.equalTo("Logged in successfully"))
        );
    }

    @When("he enters invalid login credentials")
    public void enterInvalidCredentials() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Login.withCredentials("invalidUser", "wrongPassword")
        );
    }

    @Then("he should see an error message indicating invalid username or password")
    public void verifyLoginError() {
        OnStage.theActorInTheSpotlight().should(
                seeThat(LoginMessage.error(), org.hamcrest.Matchers.equalTo("Invalid username or password"))
        );
    }
}
