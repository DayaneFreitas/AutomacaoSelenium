package Testes;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class Testes {
    String resultado;
    @Test
    public void loginComSucesso(){
        System.setProperty("webdriver.chrome.drive","/home/dayane/Downloads/chromedriver_linux64");
        MetodosTeste login = new MetodosTeste();
        login.visitaURL("https://mantis-prova.base2.com.br/login_page.php");
        login.Login("dayane.freitas","teste1412");
        //assertEquals("My View - MantisBT", resultado);

    }
    @Test
    public void loginInvalido(){
        System.setProperty("webdriver.chrome.drive","/home/dayane/Downloads/chromedriver_linux64");
        MetodosTeste login = new MetodosTeste();
        login.visitaURL("https://mantis-prova.base2.com.br/login_page.php");
        login.Login("dayane","teste1412");
        //assertNotEquals("My View - MantisBT", resultado);
    }
    @Test
    public void criarReport(){
        System.setProperty("webdriver.chrome.drive","/home/dayane/Downloads/chromedriver_linux64");
        MetodosTeste login = new MetodosTeste();
        login.visitaURL("https://mantis-prova.base2.com.br/login_page.php");
        login.Login("dayane.freitas","teste1412");
        login.CriaReport();
    }

}
