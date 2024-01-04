package task.login;

import actions.Click;
import helper.DataProvider;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import actions.Enter;
import page.login.LoginPage;
import task.lavineteca.CargarPaginaLogin;

public class Login {
    private static final Logger log = LogManager.getLogger(Login.class);
    public static void ingresarCredenciales(WebDriver webDriver){

        log.info("Caso de prueba login");
        DataProvider dataProvider = new DataProvider();
        log.info("Cierro la Notificaciòn");
        Click.on(webDriver, LoginPage.Notificacion);
        log.info("Ingreso Email");
        Enter.text(webDriver, LoginPage.Loguarseemail,dataProvider.getLoginData().getEmail() );
        log.info("Ingreso el Password");
        Enter.text(webDriver, LoginPage.Loguarsepassword,dataProvider.getLoginData().getPassword() );
        log.info("Pongo el boton aceptar");
        Click.on(webDriver, LoginPage.Loguarseaceptar);
    }
}
