package task.menu;

import actions.Click;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page.menu.FacturasAbonoPage;

public class ElegirPestañaFacturasAbono {
    private static final Logger log= LogManager.getLogger(ElegirPestañaFacturasAbono.class);

    public static void pestañaFacturasAbono  (WebDriver webDriver) throws InterruptedException {

        log.info("Click en la pestaña de Facturas por Abono del Menu Principal");
        Click.on(webDriver, FacturasAbonoPage.facturasAbonoPage);
    }
}
