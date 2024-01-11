package task.lavineteca;

import actions.Click;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page.home.SesionIniciada;

public class CargarSesionIniciada {
    private static final Logger log = LogManager.getLogger(CargarSesionIniciada.class);
    public static void onClick(WebDriver webDriver){
        log.info("Cargar pagina de la sesion abierta");
        Click.on(webDriver, SesionIniciada.sesionIniciada);
    }
}
