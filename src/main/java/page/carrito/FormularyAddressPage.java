package page.carrito;

import org.openqa.selenium.By;

public class FormularyAddressPage {
    public static By FormularioAddress1 = By.xpath("//*[@name='address1']");
    public static By FormularioAddress2 = By.xpath("//*[@name='address2']");
    public static By FormularioZona = By.xpath("//*[@name='city']");
    public static By FormularioCity = By.xpath("//*[@name='id_state']");
    public static By FormularioPais = By.xpath("//*[@name='id_country']");
    public static By FormularioNumero = By.xpath("//*[@name='phone_mobile']");
    public static By FormularioConfirmar = By.xpath("//*[@name='confirm-addresses']");
}
