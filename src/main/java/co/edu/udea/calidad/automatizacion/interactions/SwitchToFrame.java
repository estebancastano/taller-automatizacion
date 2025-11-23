package co.edu.udea.calidad.automatizacion.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SwitchToFrame implements Interaction {

    private final Target frame;

    public SwitchToFrame(Target frame) {
        this.frame = frame;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        driver.switchTo().frame(frame.resolveFor(actor));
    }

    public static SwitchToFrame to(Target frame) {
        return instrumented(SwitchToFrame.class, frame);
    }
}
