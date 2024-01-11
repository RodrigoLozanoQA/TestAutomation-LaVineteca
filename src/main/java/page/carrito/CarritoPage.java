package page.carrito;

import org.openqa.selenium.By;

public class CarritoPage {
    public static By CarritoArticulo = By.xpath("//*[contains(text(),'artículo(s)')]");
    public static By CarritoCompra = By.xpath("//*[@title='Carrito de compras']");
    public static By RealizarCompra = By.xpath("//*[contains(text(),'Realizar compra')]");
    public static By BotonComprarYa = By.xpath("//*[contains(text(),'¡Comprar ya!')]");
    public static By ContinuarComprando = By.xpath("//*[@title='Continuar comprando']");
    public static By agregarrProducto = By.xpath("//*[contains(text(),'Añadir al carrito')]");
    public static By vermasproducto = By.xpath("//*[contains(text(),'Ver más')]");
}
