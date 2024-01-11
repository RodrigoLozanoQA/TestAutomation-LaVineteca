package orderFavoritos1Libro;

import conf.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.atajos.ElegirAtajoAtras;
import task.favoritos.Claymore25Confirmation;
import task.favoritos.DesaparecerFavoritoCorazon;
import task.favoritos.ElegirFavoritoChaymore25;
import task.favoritos.MarcarFavoritoCorazon;
import task.lavineteca.CargarPaginaLogin;
import task.lavineteca.CargarSesionIniciada;
import task.login.Login;
import task.menu.ElegirCerrarSesion;
import task.menu.ElegirPestañaFavoritos;
import task.order.*;

public class OrderTestFavoritos1Libro extends BaseTest {

    @Test(description = "Esta prueba verifica que muestre que le puse favoritos a un libro")
    public void testFavoritos1Libro() throws InterruptedException {
        CargarPaginaLogin.onClick(driver);
        Login.ingresarCredenciales(driver);
        GoCatalog.goCatalog(driver);
        ElegirFavoritoChaymore25.favoritoChaymore25(driver);
        MarcarFavoritoCorazon.favoritoCorazon(driver);
        CargarSesionIniciada.onClick(driver);
        ElegirPestañaFavoritos.pestañaFavoritos(driver);
        Assert.assertTrue(Claymore25Confirmation.goConfirmationClaymore25(driver));
        DesaparecerFavoritoCorazon.desaparecerFavoritoCorazon(driver);
        ElegirAtajoAtras.atajoAtras(driver);
        ElegirCerrarSesion.cerrarSesion(driver);
        GoCatalog.goCatalog(driver);
        Thread.sleep(8000);
     }
}
