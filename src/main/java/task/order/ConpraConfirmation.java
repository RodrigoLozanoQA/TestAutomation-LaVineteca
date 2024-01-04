package task.order;

import actions.Label;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page.carrito.ConfirmationPage;

public class ConpraConfirmation {
    private static final Logger log= LogManager.getLogger(ConpraConfirmation.class);
    public static Boolean goConfirmation(WebDriver webDriver){
        log.info("Mostrar el mensaje compra confirmada");
      return   Label.getLabelIsDiplayed(webDriver, ConfirmationPage.ConfirmacionPedido);
    }
}
