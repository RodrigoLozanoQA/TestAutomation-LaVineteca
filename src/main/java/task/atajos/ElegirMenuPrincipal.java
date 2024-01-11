package task.atajos;

import actions.Click;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page.atajos.MenuPrincipalPage;

public class ElegirMenuPrincipal {
    private static final Logger log= LogManager.getLogger(ElegirMenuPrincipal.class);

    public static void menuPrincipal  (WebDriver webDriver) throws InterruptedException {

        log.info("Click en la casita que nos dirige a la Pagina Principal del Menu Principal");
        Click.on(webDriver, MenuPrincipalPage.menuPrincipalPage);
    }
}
