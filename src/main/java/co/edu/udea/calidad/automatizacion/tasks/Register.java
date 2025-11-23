package co.edu.udea.calidad.automatizacion.tasks;

import co.edu.udea.calidad.automatizacion.interactions.ClickElement;
import co.edu.udea.calidad.automatizacion.interactions.EnterText;
import co.edu.udea.calidad.automatizacion.models.User;
import co.edu.udea.calidad.automatizacion.userinterfaces.HomePage;
import co.edu.udea.calidad.automatizacion.userinterfaces.RegistrationPage;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class Register implements Task {

    private final User user;

    public Register(User user){
        this.user = user;
    }

    /** ========= MÉTODOS LLAMADOS DESDE STEP DEFINITIONS ========= */

    /** Abre la página principal */
    public static Task openHomePage() {
        return Task.where(
                "{0} abre la página principal",
                Open.url("https://advantageonlineshopping.com/")
        );
    }

    /** Construye un usuario y ejecuta el registro */
    public static Task withData(String username, String email, String password) {

        User newUser = new User(
                username,
                email,
                password,
                "NombreDefault",
                "ApellidoDefault"
        );

        return Instrumented.instanceOf(Register.class).withProperties(newUser);
    }

    /** ========= LÓGICA PRINCIPAL DEL REGISTRO ========= */
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                // 1. Abrir modal de Login
                ClickElement.element(HomePage.USER_ICON),

                // 2. Clic en "CREATE NEW ACCOUNT"
                ClickElement.element(HomePage.CREATE_ACCOUNT),

                // 3. Llenar datos
                EnterText.into(RegistrationPage.USERNAME, user.username()),
                EnterText.into(RegistrationPage.EMAIL, user.email()),
                EnterText.into(RegistrationPage.PASSWORD, user.password()),
                EnterText.into(RegistrationPage.REPEAT_PASSWORD, user.password()),

                // Campos opcionales
                EnterText.into(RegistrationPage.FIRST_NAME, user.firstName()),
                EnterText.into(RegistrationPage.LAST_NAME, user.lastName()),

                // 4. Enviar formulario
                ClickElement.element(RegistrationPage.REGISTER_BUTTON)
        );
    }

    /** Fábrica oficial de Screenplay */
    public static Register with(User user){
        return Instrumented.instanceOf(Register.class).withProperties(user);
    }
}
