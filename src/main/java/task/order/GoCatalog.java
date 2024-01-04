package task.order;

import actions.Click;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page.login.AccountPage;

public class GoCatalog {
    private static final Logger log= LogManager.getLogger(GoCatalog.class);
    public static void goCatalog(WebDriver webDriver) {

        log.info("Click en el boton incio");
        Click.on(webDriver, AccountPage.PaginaIncio);
    }
}
