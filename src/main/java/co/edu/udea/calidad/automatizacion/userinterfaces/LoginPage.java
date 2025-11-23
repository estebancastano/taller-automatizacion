package co.edu.udea.calidad.automatizacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {

    /** Botón que abre el modal de Login */
    public static final Target LOGIN_ICON = Target.the("ícono de login")
            .located(By.id("menuUser"));

    /** Campo usuario */
    public static final Target USERNAME_FIELD = Target.the("campo de usuario")
            .located(By.name("username"));

    /** Campo contraseña */
    public static final Target PASSWORD_FIELD = Target.the("campo de contraseña")
            .located(By.name("password"));

    /** Botón Login dentro del modal */
    public static final Target LOGIN_BUTTON = Target.the("botón login")
            .located(By.id("sign_in_btnundefined"));

    /** Mensaje de error si las credenciales son incorrectas */
    public static final Target LOGIN_ERROR = Target.the("mensaje de error de login")
            .located(By.xpath("//label[@class='invalid']"));
    public static final Target USERNAME = Target.the("username").located(By.cssSelector(".username"));
    public static final Target PASSWORD = Target.the("password").located(By.cssSelector(".password"));
}
