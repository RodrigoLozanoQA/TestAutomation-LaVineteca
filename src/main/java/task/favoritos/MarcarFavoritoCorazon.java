package task.favoritos;

import actions.Click;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page.favoritos.FavoritoCorazon;

public class MarcarFavoritoCorazon {
    private static final Logger log= LogManager.getLogger(MarcarFavoritoCorazon.class);

    public static void favoritoCorazon (WebDriver webDriver) throws InterruptedException {

        log.info("Click en el Corazon de Favoritos");
        Click.on(webDriver, FavoritoCorazon.favoritoCorazon);
    }
}
