package task.menu;

import actions.Click;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page.menu.DireccionesPage;

public class ElegirPestañaDireccion {
    private static final Logger log= LogManager.getLogger(ElegirPestañaDireccion.class);

    public static void pestañaDireccion  (WebDriver webDriver) throws InterruptedException {

        log.info("Click en la pestaña de Añadir primera direccion del Menu Principal");
        Click.on(webDriver, DireccionesPage.direccionesPage);
    }
}
