package task.registro;

import actions.Click;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page.registro.RegistroPage;

public class Registro {
    private static final Logger log = LogManager.getLogger(Registro.class);
    public static void nuevoRegistro(WebDriver webDriver){

        log.info("Caso de prueba de registro de nuevo usuario");
        log.info("Cierro la Notificaciòn");
        Click.on(webDriver, RegistroPage.Notificacion);
        log.info("Pongo el boton registro nuevo");
        Click.on(webDriver, RegistroPage.Registro);
    }
}
