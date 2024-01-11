package task.order;

import actions.Label;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page.carrito.ConfirmationVerMasPage;

public class VerMasConfirmation {
    private static final Logger log= LogManager.getLogger(VerMasConfirmation.class);
    public static Boolean goVerMasConfirmation(WebDriver webDriver){
        log.info("Muestra el producto agotado");
      return   Label.getLabelIsDiplayed(webDriver, ConfirmationVerMasPage.ConfirmacionVerMas);
    }
}
