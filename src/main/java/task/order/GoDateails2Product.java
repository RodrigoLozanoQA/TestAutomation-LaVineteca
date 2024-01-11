package task.order;

import actions.Click;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page.carrito.AddCarrito2Page;

public class GoDateails2Product {
    private static final Logger log= LogManager.getLogger(GoDateails2Product.class);
     public static void goCarrito2(WebDriver webDriver){
         log.info("Click en el detalle del Producto");
         Click.on(webDriver, AddCarrito2Page.AñadirCarrito2);
    }
}
