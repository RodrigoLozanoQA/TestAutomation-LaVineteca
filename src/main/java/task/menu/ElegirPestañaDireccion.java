package task.menu;

import actions.Click;
import actions.IsDisplayed;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page.menu.DireccionesPage;

public class ElegirPestañaDireccion {
    private static final Logger log= LogManager.getLogger(ElegirPestañaDireccion.class);

        public static void pestañaDireccion(WebDriver webDriver){
        try {
            if(IsDisplayed.element(webDriver, DireccionesPage.direccionesExistentesPage)) {
                log.info("Click en la pestaña de Direcciones del Menu Principal");
                Click.on(webDriver, DireccionesPage.direccionesExistentesPage);
            }
        }catch (Exception e){
            log.info("Click en la pestaña de Añadir primera direccion del Menu Principal");
            Click.on(webDriver, DireccionesPage.direccionesPage);
        }
    }
}
