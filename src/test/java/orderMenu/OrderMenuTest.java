package orderMenu;

import conf.BaseTest;
import org.testng.annotations.Test;
import task.atajos.ElegirAtajoAtras;
import task.lavineteca.CargarPaginaLogin;
import task.login.Login;
import task.menu.*;
import task.order.*;

public class OrderMenuTest extends BaseTest {

    @Test(description = "Esta prueba verifica que muestre el menu de pestañas de porma aumatizada")
    public void testMenu() throws InterruptedException {
        CargarPaginaLogin.onClick(driver);
        Login.ingresarCredenciales(driver);
        ElegirPestañaInformacion.pestañaInformacion(driver);
        ElegirAtajoAtras.atajoAtras(driver);
        ElegirPestañaDireccion.pestañaDireccion(driver);
        ElegirAtajoAtras.atajoAtras(driver);
        ElegirPestañaHistorialPedidos.pestañaHistorialPedidos(driver);
        ElegirAtajoAtras.atajoAtras(driver);
        ElegirPestañaFacturasAbono.pestañaFacturasAbono(driver);
        ElegirAtajoAtras.atajoAtras(driver);
        ElegirPestañaCuponesDescuento.pestañaCuponesDescuento(driver);
        ElegirAtajoAtras.atajoAtras(driver);
        ElegirPestañaDevolucionesMercaderia.pestañaDevolucionesMercaderia(driver);
        ElegirAtajoAtras.atajoAtras(driver);
        ElegirPestañaComentariosProductos.pestañaComentariosProductos(driver);
        ElegirAtajoAtras.atajoAtras(driver);
        ElegirPestañaComentarios.pestañaComentarios(driver);
        ElegirAtajoAtras.atajoAtras(driver);
        ElegirPestañaFavoritos.pestañaFavoritos(driver);
        ElegirAtajoAtras.atajoAtras(driver);
        ElegirPestañaListasDeseos.pestañaListasDeseos(driver);
        ElegirAtajoAtras.atajoAtras(driver);
        ElegirCerrarSesion.cerrarSesion(driver);
        GoCatalog.goCatalog(driver);
        Thread.sleep(8000);
     }
}
