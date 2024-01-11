package task.menu;

import actions.Click;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page.menu.InformacionPage;

public class ElegirPestañaInformacion {
    private static final Logger log= LogManager.getLogger(ElegirPestañaInformacion.class);

    public static void pestañaInformacion  (WebDriver webDriver) throws InterruptedException {

        log.info("Click en la pestaña de Informacion del Menu Principal");
        Click.on(webDriver, InformacionPage.informacionPage);
    }
}
