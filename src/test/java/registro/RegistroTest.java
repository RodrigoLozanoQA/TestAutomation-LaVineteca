package registro;

import conf.BaseTest;
import org.testng.annotations.Test;
import task.lavineteca.CargarPaginaLogin;
import task.llenadoregistro.AddNuevaCuenta;
import task.registro.Registro;

public class RegistroTest extends BaseTest {

    @Test(description = "Esta prueba verifica que muestre que un usuario puede registrarse")
    public void testRegistro()  throws InterruptedException {
        CargarPaginaLogin.onClick(driver);
        Registro.nuevoRegistro(driver);
        AddNuevaCuenta.agregarCuenta(driver);
        Thread.sleep(8000);
    }
}