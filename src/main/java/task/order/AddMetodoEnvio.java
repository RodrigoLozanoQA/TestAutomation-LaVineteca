package task.order;

import actions.Click;
import actions.Enter;
import model.MetodoEnvio;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page.carrito.MetodoPage;

public class AddMetodoEnvio {
    private static final Logger log= LogManager.getLogger(AddMetodoEnvio.class);
    public static void metodoEnvio (WebDriver webDriver) {
        log.info("Registro del metodo de envio");
        MetodoEnvio metodoEnvio = new MetodoEnvio();
        log.info("Registro del comentario de envio");
        Enter.text(webDriver, MetodoPage.MesajeEnvio, metodoEnvio.getComentario());
        log.info("Click para confirmar el envio");
        Click.on(webDriver, MetodoPage.ConfirmarEnvio);
    }
}
