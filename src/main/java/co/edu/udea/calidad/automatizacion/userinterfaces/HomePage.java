package co.edu.udea.calidad.automatizacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {
    public static final Target USER_ICON = Target.the("user menu icon").located(By.id("menuUser"));
    public static final Target CREATE_ACCOUNT = Target.the("create new account link").located(By.cssSelector("a[data-ng-click='createNewAccount()']"));
    public static final Target CART_ICON = Target.the("cart icon").located(By.id("menuCart"));
    public static final Target HOME_TITLE = Target.the("home title").located(By.cssSelector("h1"));
    public static final Target SEARCH_INPUT = Target.the("search input").located(By.name("query"));
    public static final Target ERROR_MESSAGE = Target.the("login error message")
            .located(By.id("errorMessage"));

}

