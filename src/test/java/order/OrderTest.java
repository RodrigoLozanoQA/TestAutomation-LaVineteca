package order;

import conf.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.order.*;
import task.lavineteca.CargarPaginaLogin;
import task.login.Login;

public class OrderTest extends BaseTest {

    @Test(description = "Esta prueba verifica que muestre la pagina de inisio de sesiòn")
    public void testOrder() throws InterruptedException {
        CargarPaginaLogin.onClick(driver);
        Login.ingresarCredenciales(driver);
        GoCatalog.goCatalog(driver);
        //ver detalle de producto
        GoDateailsProduct.goCarrito(driver);
        //flujo de compra
        OrderCarrito.carrito(driver);
        //Metodo del Envio
        AddMetodoEnvio.metodoEnvio(driver);
        //Metodo Pago
        AddMetodoPago.metodoPago(driver);
        //Para el Assert
        Assert.assertTrue(ConpraConfirmation.goConfirmation(driver));
     }
}
