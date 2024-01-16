package task.order;

import actions.Click;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page.carrito.AddCarrito1Page;

public class GoDateails1Product {
    private static final Logger log= LogManager.getLogger(GoDateails1Product.class);
     public static void goCarrito1(WebDriver webDriver){
         log.info("Click en el detalle del Producto");
         Click.on(webDriver, AddCarrito1Page.AnadirCarrito1);
    }
}
