package task.menu;

import actions.Click;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page.menu.ListasDeseosPage;

public class ElegirPestañaListasDeseos {
    private static final Logger log= LogManager.getLogger(ElegirPestañaListasDeseos.class);

    public static void pestañaListasDeseos  (WebDriver webDriver) throws InterruptedException {

        log.info("Click en la pestaña de Mis listas de deseos del Menu Principal");
        Click.on(webDriver, ListasDeseosPage.listasDeseosPage);
    }
}
