package order;

import conf.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.order.*;
import task.lavineteca.CargarPaginaLogin;
import task.login.Login;

public class OrderTest extends BaseTest {

    @Test(description = "Esta prueba verifica que muestre que la pagina compra de un libro de anime de porma aumatizada")
    public void testOrder() throws InterruptedException {
        CargarPaginaLogin.onClick(driver);
        Login.ingresarCredenciales(driver);
        GoCatalog.goCatalog(driver);
        GoDateailsProduct.goCarrito(driver);
        OrderCarrito.carrito(driver);
        AddMetodoEnvio.metodoEnvio(driver);
        AddMetodoPago.metodoPago(driver);
        Assert.assertTrue(ConpraConfirmation.goConfirmation(driver));
        Thread.sleep(8000);
     }
}
