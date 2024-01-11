package task.favoritos;

import actions.Click;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page.favoritos.EliminarFavoritoCorazon;
import page.favoritos.FavoritoCorazon;

public class DesaparecerFavoritoCorazon {
    private static final Logger log= LogManager.getLogger(DesaparecerFavoritoCorazon.class);

    public static void desaparecerFavoritoCorazon (WebDriver webDriver) throws InterruptedException {

        log.info("Click en Eliminar el Corazon de Favoritos");
        Click.on(webDriver, EliminarFavoritoCorazon.eliminarfavoritoCorazon);
    }
}
