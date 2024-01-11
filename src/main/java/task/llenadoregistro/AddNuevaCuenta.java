package task.llenadoregistro;

import actions.Click;
import actions.Enter;
import helper.DataProviderRegistro;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page.carrito.SelectPagoPage;
import page.datosregistro.DatosRegistroPage;

public class AddNuevaCuenta {
    private static final Logger log= LogManager.getLogger(AddNuevaCuenta.class);
    public static void agregarCuenta (WebDriver webDriver) {
        log.info("Caso de prueba de Registro");
        DataProviderRegistro dataProviderRegistro = new DataProviderRegistro();
        log.info("Cierro la Notificaciòn");
        Click.on(webDriver, DatosRegistroPage.Notificacion);
        log.info("Elijo el radio buton para el genero Varon Sr.");
        Click.on(webDriver, DatosRegistroPage.radiobtn);
        log.info("Registro los nombres");
        Enter.text(webDriver, DatosRegistroPage.firstname, dataProviderRegistro.getRegistroData().getFirstname()  );
        log.info("Registra los apellidos");
        Enter.text(webDriver, DatosRegistroPage.lastname, dataProviderRegistro.getRegistroData().getLastname()  );
        log.info("Registro el correo electronico");
        Enter.text(webDriver, DatosRegistroPage.email, dataProviderRegistro.getRegistroData().getEmail()  );
        log.info("Registro la contraseña");
        Enter.text(webDriver, DatosRegistroPage.password, dataProviderRegistro.getRegistroData().getPassword()  );
        log.info("Registro la fecha de nacimiento");
        Enter.text(webDriver, DatosRegistroPage.birthday, dataProviderRegistro.getRegistroData().getBirthday()  );
        log.info("Click para informacion acerca de darse de baja");
        Click.on(webDriver, DatosRegistroPage.selectinformacion);
        log.info("Click en boton Guardar");
        Click.on(webDriver, DatosRegistroPage.btnguardar);
    }
}
