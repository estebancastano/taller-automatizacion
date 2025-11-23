package co.edu.udea.calidad.automatizacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistrationPage {
    public static final Target USERNAME = Target.the("register username").located(By.name("usernameRegisterPage"));
    public static final Target EMAIL = Target.the("register email").located(By.name("emailRegisterPage"));
    public static final Target PASSWORD = Target.the("register password").located(By.name("passwordRegisterPage"));
    public static final Target REPEAT_PASSWORD = Target.the("repeat password").located(By.name("confirm_passwordRegisterPage"));
    public static final Target FIRST_NAME = Target.the("first name").located(By.name("first_name"));
    public static final Target LAST_NAME = Target.the("last name").located(By.name("last_name"));
    public static final Target PHONE = Target.the("phone").located(By.name("phone_number"));
    public static final Target REGISTER_BUTTON = Target.the("register button").located(By.id("register_btn"));
    public static final Target SUCCESS_MESSAGE = Target.the("registration success").located(By.cssSelector(".success"));
    public static final Target ERROR_MESSAGE = Target.the("registration error").located(By.cssSelector(".error"));
}

