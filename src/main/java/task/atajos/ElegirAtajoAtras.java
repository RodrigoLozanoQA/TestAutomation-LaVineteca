package task.atajos;

import actions.Click;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page.atajos.AtajoAtrasPage;

public class ElegirAtajoAtras {
    private static final Logger log= LogManager.getLogger(ElegirAtajoAtras.class);

    public static void atajoAtras  (WebDriver webDriver) throws InterruptedException {

        log.info("Click en la flecha que un paso atras del Menu Principal");
        Click.on(webDriver, AtajoAtrasPage.atajoAtrasPage);
    }
}
