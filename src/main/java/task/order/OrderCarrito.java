package task.order;

import actions.Click;
import actions.IsDisplayed;
import actions.Perform;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page.carrito.CarritoPage;
import page.carrito.NewAddressPage;
import page.login.LoginPage;

public class OrderCarrito {
    private static final Logger log= LogManager.getLogger(OrderCarrito.class);

    public static void carrito (WebDriver webDriver) throws InterruptedException {

        log.info("Cierro la Notificaciòn");
        Click.on(webDriver, LoginPage.Notificacion);
        log.info("Click en el boton agregar producto");
        Click.onToLeftOf(webDriver,CarritoPage.agregarrProducto, CarritoPage.BotonComprarYa);
        log.info("Click en la pestaña articulo");
        Perform.perform(webDriver,CarritoPage.CarritoArticulo);
        Thread.sleep(5000);
        log.info("Click en el boton Carrito Compra");
        Click.onClickElementList(webDriver, CarritoPage.CarritoCompra,0);
        log.info("Click en el boton Realizar Compra");
        Click.on(webDriver, CarritoPage.RealizarCompra);
        validateOption(webDriver);
    }

   public static void validateOption(WebDriver webDriver){
        try {
            if(IsDisplayed.element(webDriver, NewAddressPage.AgregarDireccion)) {
                Click.on(webDriver, NewAddressPage.AgregarDireccion);
                AddAddress.agregarDireccion(webDriver);
            }
        }catch (Exception e){
            AddAddress.agregarDireccion(webDriver);
        }
    }
}
