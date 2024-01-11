package orderFavoritos3Libros;

import conf.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.atajos.ElegirAtajoAtras;
import task.favoritos.*;
import task.lavineteca.CargarPaginaLogin;
import task.lavineteca.CargarSesionIniciada;
import task.login.Login;
import task.menu.ElegirCerrarSesion;
import task.menu.ElegirPestañaFavoritos;
import task.order.GoCatalog;

public class OrderTestFavoritos3Libros extends BaseTest {

    @Test(description = "Esta prueba verifica que muestre que le puse favoritos a tres libros")
    public void testFavoritos3Libros() throws InterruptedException {
        CargarPaginaLogin.onClick(driver);
        Login.ingresarCredenciales(driver);
        GoCatalog.goCatalog(driver);
        ElegirFavoritoChaymore25.favoritoChaymore25(driver);
        MarcarFavoritoCorazon.favoritoCorazon(driver);
        GoCatalog.goCatalog(driver);
        CargarSesionIniciada.onClick(driver);
        ElegirPestañaFavoritos.pestañaFavoritos(driver);
        Assert.assertTrue(Claymore25Confirmation.goConfirmationClaymore25(driver));
        DesaparecerFavoritoCorazon.desaparecerFavoritoCorazon(driver);
        ElegirAtajoAtras.atajoAtras(driver);
        GoCatalog.goCatalog(driver);
        ElegirFavoritoChaymore26.favoritoChaymore26(driver);
        MarcarFavoritoCorazon.favoritoCorazon(driver);
        GoCatalog.goCatalog(driver);
        CargarSesionIniciada.onClick(driver);
        ElegirPestañaFavoritos.pestañaFavoritos(driver);
        Assert.assertTrue(Claymore26Confirmation.goConfirmationClaymore26(driver));
        DesaparecerFavoritoCorazon.desaparecerFavoritoCorazon(driver);
        ElegirAtajoAtras.atajoAtras(driver);
        GoCatalog.goCatalog(driver);
        ElegirFavoritoBlame50vniPress.favoritoBlame50vniPress(driver);
        MarcarFavoritoCorazon.favoritoCorazon(driver);
        GoCatalog.goCatalog(driver);
        CargarSesionIniciada.onClick(driver);
        ElegirPestañaFavoritos.pestañaFavoritos(driver);
        Assert.assertTrue(Blame50vniPressConfirmation.goConfirmationBlame50vniPress(driver));
        DesaparecerFavoritoCorazon.desaparecerFavoritoCorazon(driver);
        ElegirAtajoAtras.atajoAtras(driver);
        ElegirCerrarSesion.cerrarSesion(driver);
        GoCatalog.goCatalog(driver);
        Thread.sleep(8000);
     }
}
