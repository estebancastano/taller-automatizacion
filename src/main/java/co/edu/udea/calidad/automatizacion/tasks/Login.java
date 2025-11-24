package co.edu.udea.calidad.automatizacion.tasks;

import co.edu.udea.calidad.automatizacion.models.User;
import co.edu.udea.calidad.automatizacion.userinterfaces.HomePage;
import co.edu.udea.calidad.automatizacion.userinterfaces.LoginPage;
import co.edu.udea.calidad.automatizacion.interactions.EnterText;
import co.edu.udea.calidad.automatizacion.interactions.ClickElement;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class Login implements Task {

    private final User user;

    public Login(User user) {
        this.user = user;
    }

    public static Login with(User user) {
        return new Login(user);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ClickElement.element(HomePage.USER_ICON),
                EnterText.into(LoginPage.USERNAME, user.username()),
                EnterText.into(LoginPage.PASSWORD, user.password()),
                ClickElement.element(LoginPage.LOGIN_BUTTON)
        );
    }

    // ======================================================================
    // ✔ 1) ABRIR LA PAGINA DE LOGIN
    // ======================================================================
    public static Task openLoginPage() {
        return (Task) Task.where("{0} opens the login page",
                actor -> actor.attemptsTo(
                        ClickElement.element(HomePage.USER_ICON) // Accede al formulario
                )
        );
    }

    // ======================================================================
    // ✔ 2) LOGIN CON CREDENCIALES MANUALES (String, String)
    // ======================================================================
    public static Task withCredentials(String username, String password) {
        return (Task) Task.where("{0} logs in using credentials",
                actor -> actor.attemptsTo(
                        ClickElement.element(HomePage.USER_ICON),
                        EnterText.into(LoginPage.USERNAME, username),
                        EnterText.into(LoginPage.PASSWORD, password),
                        ClickElement.element(LoginPage.LOGIN_BUTTON)
                )
        );
    }
}
