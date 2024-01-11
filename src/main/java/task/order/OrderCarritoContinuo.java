package task.order;

import actions.Click;
import actions.Perform;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page.carrito.CarritoPage;

public class OrderCarritoContinuo {
    private static final Logger log= LogManager.getLogger(OrderCarritoContinuo.class);

    public static void carritoContinuo (WebDriver webDriver) throws InterruptedException {

        log.info("Click en el boton agregar producto");
        Click.onToLeftOf(webDriver, CarritoPage.agregarrProducto, CarritoPage.BotonComprarYa);
        log.info("Click en la pestaña articulo");
        Perform.perform(webDriver, CarritoPage.CarritoArticulo);
        Thread.sleep(5000);
        log.info("Click en el boton Carrito Compra");
        Click.onClickElementList(webDriver, CarritoPage.CarritoCompra,0);
        log.info("Click en el boton para seguir comprando");
        Click.on(webDriver, CarritoPage.ContinuarComprando);
    }
}
