package task.order;

import actions.Click;
import actions.Enter;
import actions.SelectBy;
import model.Direction;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page.carrito.FormularyAddressPage;

public class AddAddress {
    private static final Logger log= LogManager.getLogger(AddAddress.class);
    public static void agregarDireccion (WebDriver webDriver) {
            log.info("Registra los datos de la direccion");
            Direction  direction = new Direction();
            log.info("Registra la direccion");
            Enter.text(webDriver, FormularyAddressPage.FormularioAddress1,direction.getDireccion());
            log.info("Registra la descripcion");
            Enter.text(webDriver, FormularyAddressPage.FormularioAddress2,direction.getDescripcion());
            log.info("Registra la zona");
            Enter.text(webDriver, FormularyAddressPage.FormularioZona,direction.getZona());
            log.info("Escoge la cuidad");
            SelectBy.selectByVisibleText(webDriver, FormularyAddressPage.FormularioCity,"Santa Cruz");
            log.info("Escoge el Pais");
            SelectBy.selectByVisibleText(webDriver, FormularyAddressPage.FormularioPais,"Bolivia");
            log.info("Registra el numero de celular");
            Enter.text(webDriver, FormularyAddressPage.FormularioNumero,direction.getTelefono());
            log.info("Click en boton aceptar");
            Click.on(webDriver, FormularyAddressPage.FormularioConfirmar);
     }
}
