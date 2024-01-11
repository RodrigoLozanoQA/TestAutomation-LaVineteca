package task.menu;

import actions.Click;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page.menu.ComentariosProductosPage;

public class ElegirPestañaComentariosProductos {
    private static final Logger log= LogManager.getLogger(ElegirPestañaComentariosProductos.class);

    public static void pestañaComentariosProductos  (WebDriver webDriver) throws InterruptedException {

        log.info("Click en la pestaña de Comentarios en productos del Menu Principal");
        Click.on(webDriver, ComentariosProductosPage.comentariosProductosPage);
    }
}
