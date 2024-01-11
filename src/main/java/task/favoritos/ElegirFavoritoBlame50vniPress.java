package task.favoritos;

import actions.Click;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page.favoritos.AddFavoritoBlame5OvniPress;

public class ElegirFavoritoBlame50vniPress {
    private static final Logger log= LogManager.getLogger(ElegirFavoritoBlame50vniPress.class);

    public static void favoritoBlame50vniPress (WebDriver webDriver) throws InterruptedException {

        log.info("Click en la Imagen de Blame! 5 (Ovni Press)");
        Click.on(webDriver, AddFavoritoBlame5OvniPress.addFavorito3);
    }
}
