package task.favoritos;

import actions.Label;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page.favoritos.ConfirmacionFavoritoClaymore26;

public class Claymore26Confirmation {
    private static final Logger log= LogManager.getLogger(Claymore26Confirmation.class);
    public static Boolean goConfirmationClaymore26 (WebDriver webDriver){
        log.info("Mostrar el Producto confirmado de Claymore26");
      return   Label.getLabelIsDiplayed(webDriver, ConfirmacionFavoritoClaymore26.nombreFavoritoClaymore26);
    }
}
