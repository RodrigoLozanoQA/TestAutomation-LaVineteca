package task.favoritos;

import actions.Label;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page.favoritos.ConfirmacionFavoritoClaymore25;

public class Claymore25Confirmation {
    private static final Logger log= LogManager.getLogger(Claymore25Confirmation.class);
    public static Boolean goConfirmationClaymore25 (WebDriver webDriver){
        log.info("Mostrar el Producto confirmado de Claymore25");
      return   Label.getLabelIsDiplayed(webDriver,ConfirmacionFavoritoClaymore25.nombreFavoritoClaymore25);
    }
}
