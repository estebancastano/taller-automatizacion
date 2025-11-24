package co.edu.udea.calidad.automatizacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductPage {
    public static final Target PRODUCT_LIST = Target.the("product list").located(By.cssSelector(".product"));
    public static final Target ADD_TO_CART = Target.the("add to cart").located(By.name("save_to_cart"));
    public static final Target QUANTITY = Target.the("quantity input").located(By.name("quantity"));
    public static final Target PRICE = Target.the("price input").located(By.name("price"));
    public static final Target PRODUCT_1 = Target.the("First product")
            .located(By.xpath("(//div[@class='product'])[1]"));

    public static final Target PRODUCT_2 = Target.the("Second product")
            .located(By.xpath("(//div[@class='product'])[2]"));

    public static final Target BACK_TO_PRODUCTS = Target.the("Back to product list")
            .located(By.id("backToProducts"));

}

