package task.order;

import actions.Click;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page.carrito.CarritoPage;

public class GoVerMas {
    private static final Logger log= LogManager.getLogger(GoVerMas.class);

    public static void verMas (WebDriver webDriver) throws InterruptedException {

        log.info("Click en el boton VER MAS para productos agotados");
        Click.on(webDriver, CarritoPage.vermasproducto);
        Thread.sleep(5000);
    }
}
