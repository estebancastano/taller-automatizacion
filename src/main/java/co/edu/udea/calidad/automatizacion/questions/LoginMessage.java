package co.edu.udea.calidad.automatizacion.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.questions.Text;
import co.edu.udea.calidad.automatizacion.userinterfaces.HomePage;

public class LoginMessage implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        try {
            return Text.of(HomePage.HOME_TITLE)
                    .viewedBy(actor)
                    .asString()
                    .trim();
        } catch (Exception e) {
            return "";
        }
    }

    public static LoginMessage value() {
        return new LoginMessage();
    }
}
