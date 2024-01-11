package order3Productos;

import conf.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.lavineteca.CargarPaginaLogin;
import task.login.Login;
import task.order.*;

public class OrderTest3Productos extends BaseTest {

    @Test(description = "Esta prueba verifica que muestre que la pagina compra de tres libros de anime de forma aumatizada")
    public void testOrder() throws InterruptedException {
        CargarPaginaLogin.onClick(driver);
        Login.ingresarCredenciales(driver);
        GoCatalog.goCatalog(driver);
        GoDateailsProduct.goCarrito(driver);
        OrderCarritoContinuo.carritoContinuo(driver);
        GoDateails1Product.goCarrito1(driver);
        OrderCarritoContinuo.carritoContinuo(driver);
        GoDateails2Product.goCarrito2(driver);
        OrderCarrito.carrito(driver);
        AddMetodoEnvio.metodoEnvio(driver);
        AddMetodoPago.metodoPago(driver);
        Assert.assertTrue(ConpraConfirmation.goConfirmation(driver));
        Thread.sleep(8000);
     }
}
