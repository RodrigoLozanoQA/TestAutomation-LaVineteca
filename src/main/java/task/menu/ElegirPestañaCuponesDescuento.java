package task.menu;

import actions.Click;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page.menu.CuponesDescuentoPage;

public class ElegirPestañaCuponesDescuento {
    private static final Logger log= LogManager.getLogger(ElegirPestañaCuponesDescuento.class);

    public static void pestañaCuponesDescuento  (WebDriver webDriver) throws InterruptedException {

        log.info("Click en la pestaña de Cupones de descuento del Menu Principal");
        Click.on(webDriver, CuponesDescuentoPage.cuponesDescuentoPage);
    }
}
