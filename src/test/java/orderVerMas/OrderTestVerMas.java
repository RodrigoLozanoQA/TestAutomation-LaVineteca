package orderVerMas;

import conf.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.lavineteca.CargarPaginaLogin;
import task.login.Login;
import task.order.*;

public class OrderTestVerMas extends BaseTest {

    @Test(description = "Esta prueba verifica que muestre que la pagina compra de un libro ya agotado")
    public void testOrder() throws InterruptedException {
        CargarPaginaLogin.onClick(driver);
        Login.ingresarCredenciales(driver);
        GoCatalog.goCatalog(driver);
        GoVerMas.verMas(driver);
        Assert.assertTrue(VerMasConfirmation.goVerMasConfirmation(driver));
        Thread.sleep(8000);
     }
}
