package co.edu.udea.calidad.automatizacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductPage {
    public static final Target PRODUCT_LIST = Target.the("product list").located(By.cssSelector(".product"));
    public static final Target ADD_TO_CART = Target.the("add to cart").located(By.name("save_to_cart"));
    public static final Target QUANTITY = Target.the("quantity input").located(By.name("quantity"));
}

