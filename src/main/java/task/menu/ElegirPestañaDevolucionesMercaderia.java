package task.menu;

import actions.Click;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page.menu.DevolucionesMercaderiaPage;

public class ElegirPestañaDevolucionesMercaderia {
    private static final Logger log= LogManager.getLogger(ElegirPestañaDevolucionesMercaderia.class);

    public static void pestañaDevolucionesMercaderia  (WebDriver webDriver) throws InterruptedException {

        log.info("Click en la pestaña de Devoluciones de mercaderia del Menu Principal");
        Click.on(webDriver, DevolucionesMercaderiaPage.devolucionesMercaderiaPage);
    }
}
