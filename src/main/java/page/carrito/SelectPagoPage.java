package page.carrito;

import org.openqa.selenium.By;

public class SelectPagoPage {
    public static By PagoOption = By.id("payment-option-1");
    public static By PagoCondition = By.id("conditions_to_approve[terms-and-conditions]");
    public static By PagoAceptar = By.xpath("//*[contains(text(),'ACEPTAR')]");
 }
