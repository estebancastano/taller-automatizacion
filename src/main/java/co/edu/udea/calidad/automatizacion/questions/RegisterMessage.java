package co.edu.udea.calidad.automatizacion.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;
import co.edu.udea.calidad.automatizacion.userinterfaces.RegistrationPage;

public class RegisterMessage {

    public static Question<String> success() {
        return actor ->
                TextContent.of(RegistrationPage.SUCCESS_MESSAGE)
                        .viewedBy(actor)
                        .asString()
                        .trim();
    }

    public static Question<String> error() {
        return actor ->
                TextContent.of(RegistrationPage.ERROR_MESSAGE)
                        .viewedBy(actor)
                        .asString()
                        .trim();
    }
}
