package task.lavineteca;

import actions.Click;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page.home.HomePage;

public class CargarPaginaLogin {
    private static final Logger log = LogManager.getLogger(CargarPaginaLogin.class);
    public static void onClick(WebDriver webDriver){
        log.info("Cargar pagina de login");
        Click.on(webDriver, HomePage.InicioSesion);
    }
}
