package task.order;

import actions.Click;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page.carrito.SelectPagoPage;

public class AddMetodoPago {
        private static final Logger log= LogManager.getLogger(AddMetodoPago.class);
        public static void metodoPago (WebDriver webDriver) {
                log.info("Click en la primera opcion de pago");
                Click.on(webDriver, SelectPagoPage.PagoOption);
                log.info("Click en la segunda opcion de pago");
                Click.on(webDriver, SelectPagoPage.PagoCondition);
                log.info("Click en el boton aceptar");
                Click.on(webDriver, SelectPagoPage.PagoAceptar);
        }
}
