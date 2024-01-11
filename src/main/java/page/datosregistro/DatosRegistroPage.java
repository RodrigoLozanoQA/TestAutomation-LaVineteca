package page.datosregistro;

import org.openqa.selenium.By;

public class DatosRegistroPage {
    public static By Notificacion = By.xpath("//*[@data-dismiss='st_notification_wrap']");
    public static By radiobtn = By.xpath("//*[contains(text(),'Sr.')]");
    public static By firstname = By.xpath("//*[@name='firstname']");
    public static By lastname = By.xpath("//*[@name='lastname']");
    public static By email = By.xpath("//*[@name='email']");
    public static By password = By.xpath("//*[@name='password']");
    public static By birthday = By.xpath("//*[@name='birthday']");
    public static By selectinformacion = By.xpath("//*[@name='newsletter']");
    public static By btnguardar = By.xpath("//*[@class='btn btn-primary btn-large js-submit-active btn-spin btn-full-width']");
}
