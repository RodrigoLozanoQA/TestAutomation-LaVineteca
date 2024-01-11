package task.menu;

import actions.Click;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page.menu.HistorialPedidosPage;

public class ElegirPestañaHistorialPedidos {
    private static final Logger log= LogManager.getLogger(ElegirPestañaHistorialPedidos.class);

    public static void pestañaHistorialPedidos  (WebDriver webDriver) throws InterruptedException {

        log.info("Click en la pestaña de Historial de Pedidos del Menu Principal");
        Click.on(webDriver, HistorialPedidosPage.historialPedidosPage);
    }
}
