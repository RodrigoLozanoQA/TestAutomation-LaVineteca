package task.favoritos;

import actions.Label;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page.favoritos.ConfirmacionFavoritoBlame5OvniPress;

public class Blame50vniPressConfirmation {
    private static final Logger log= LogManager.getLogger(Blame50vniPressConfirmation.class);
    public static Boolean goConfirmationBlame50vniPress (WebDriver webDriver){
        log.info("Mostrar el Producto confirmado de Blame50vniPress");
      return   Label.getLabelIsDiplayed(webDriver, ConfirmacionFavoritoBlame5OvniPress.nombreFavoritoBlame5OvniPress);
    }
}
