package task.menu;

import actions.Click;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page.menu.FavoritosPage;

public class ElegirPestañaFavoritos {
    private static final Logger log= LogManager.getLogger(ElegirPestañaFavoritos.class);

    public static void pestañaFavoritos  (WebDriver webDriver) throws InterruptedException {

        log.info("Click en la pestaña de Mis favoritos del Menu Principal");
        Click.on(webDriver, FavoritosPage.favoritosPage);
    }
}
