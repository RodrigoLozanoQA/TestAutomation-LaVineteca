package task.favoritos;

import actions.Click;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page.favoritos.AddFavoritoClaymore26;

public class ElegirFavoritoChaymore26 {
    private static final Logger log= LogManager.getLogger(ElegirFavoritoChaymore26.class);

    public static void favoritoChaymore26 (WebDriver webDriver) throws InterruptedException {

        log.info("Click en la Imagen de Chaymore 26");
        Click.on(webDriver, AddFavoritoClaymore26.addFavorito2);
    }
}
