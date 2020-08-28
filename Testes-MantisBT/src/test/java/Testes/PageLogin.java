package Testes;

import static org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLogin {

    WebDriver navegador = new ChromeDriver();
    String loginValid;
    public String Login(String nome, String senha) {
        navegador.findElement(By.name("username")).sendKeys(nome);
        navegador.findElement(By.name("password")).sendKeys(senha);
        navegador.findElement(By.className("button")).click();
        loginValid = navegador.getTitle();
        return loginValid;
        //assertEquals("My View - MantisBT", loginValid);

    }
    //public PageLogin(WebDriver navegador){
        //this.navegador = navegador;
       // }
    public PageLogin visitaURL(String url){
        navegador.get(url);
        return this;
    }
}
