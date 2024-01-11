package task.favoritos;

import actions.Click;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page.favoritos.AddFavoritoClaymore25;

public class ElegirFavoritoChaymore25 {
    private static final Logger log= LogManager.getLogger(ElegirFavoritoChaymore25.class);

    public static void favoritoChaymore25 (WebDriver webDriver) throws InterruptedException {

        log.info("Click en la Imagen de Chaymore 25");
        Click.on(webDriver, AddFavoritoClaymore25.addFavorito1);
    }
}
