package co.edu.udea.calidad.automatizacion.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.interactions.Actions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Hover implements Interaction {

    private final Target target;

    public Hover(Target target) {
        this.target = target;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Actions actions = new Actions(BrowseTheWeb.as(actor).getDriver());
        actions.moveToElement(target.resolveFor(actor)).perform();
    }

    public static Hover over(Target target) {
        return instrumented(Hover.class, target);
    }
}
