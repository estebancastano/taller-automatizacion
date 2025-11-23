package co.edu.udea.calidad.automatizacion.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.Actor;

public class OpenHome implements Task {

    public static OpenHome now() { return new OpenHome(); }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url("/"));
    }
}
