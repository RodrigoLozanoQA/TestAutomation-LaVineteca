package task.menu;

import actions.Click;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page.menu.ComentariosPage;

public class ElegirPestañaComentarios {
    private static final Logger log= LogManager.getLogger(ElegirPestañaComentarios.class);

    public static void pestañaComentarios  (WebDriver webDriver) throws InterruptedException {

        log.info("Click en la pestaña de Comentarios del Menu Principal");
        Click.on(webDriver, ComentariosPage.comentariosPage);
    }
}
