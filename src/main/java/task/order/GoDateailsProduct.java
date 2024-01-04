package task.order;

import actions.Click;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page.carrito.AddCarritoPage;

public class GoDateailsProduct {
    private static final Logger log= LogManager.getLogger(GoDateailsProduct.class);
     public static void goCarrito(WebDriver webDriver){
         log.info("Click en el detalle del Producto");
         Click.on(webDriver, AddCarritoPage.AñadirCarrito);
    }
}
