package Testes;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class Login {
    String resultado;
    @Test
    public void loginComSucesso(){
        System.setProperty("webdriver.chrome.drive","/home/dayane/Downloads/chromedriver_linux64");
        PageLogin login = new PageLogin();
        login.visitaURL("https://mantis-prova.base2.com.br/login_page.php");
        resultado= login.Login("dayane.freitas","teste1412");
        assertEquals("My View - MantisBT", resultado);
    }
    @Test
    public void loginInvalido(){
        System.setProperty("webdriver.chrome.drive","/home/dayane/Downloads/chromedriver_linux64");
        PageLogin login = new PageLogin();
        login.visitaURL("https://mantis-prova.base2.com.br/login_page.php");
        resultado= login.Login("dayane","teste1412");
        assertNotEquals("My View - MantisBT", resultado);
    }

}
