package task.menu;

import actions.Click;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page.menu.CerrarSesionPage;

public class ElegirCerrarSesion {
    private static final Logger log= LogManager.getLogger(ElegirCerrarSesion.class);

    public static void cerrarSesion  (WebDriver webDriver) throws InterruptedException {

        log.info("Click en la pestaña Cerrar Sesion del Menu Principal");
        Click.on(webDriver, CerrarSesionPage.cerrarSesionPage);
    }
}
