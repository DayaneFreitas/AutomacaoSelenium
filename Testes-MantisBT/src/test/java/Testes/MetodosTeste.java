package Testes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MetodosTeste {

    WebDriver navegador = new ChromeDriver();
    String loginValid;
    public String Login(String nome, String senha) {
        navegador.findElement(By.name("username")).sendKeys(nome);
        navegador.findElement(By.name("password")).sendKeys(senha);
        navegador.findElement(By.className("button")).click();
        loginValid = navegador.getTitle();
        loginValid = navegador.getPageSource();
        return loginValid;


    }
    public void CriaReport(){
        navegador.findElement(By.linkText("Report Issue")).click();
        navegador.findElement(By.className("button")).click();
        WebElement categoria = navegador.findElement(By.name("category_id"));
        Select combo1 = new Select(categoria);
        combo1.selectByValue("33");
        WebElement reproducibility = navegador.findElement(By.name("reproducibility"));
        Select combo2 = new Select(reproducibility);
        combo2.selectByValue("100");
        WebElement severity = navegador.findElement(By.name("severity"));
        Select combo3 = new Select(severity);
        combo3.selectByValue("10");
        WebElement priority = navegador.findElement(By.name("priority"));
        Select combo4 = new Select(priority);
        combo4.selectByValue("10");
        WebElement profile_id = navegador.findElement(By.name("profile_id"));
        Select combo5 = new Select(profile_id);
        combo5.selectByValue("249");
        navegador.findElement(By.id("platform")).sendKeys("Mobile");
        navegador.findElement(By.id("os")).sendKeys("Android");
        navegador.findElement(By.id("os_build")).sendKeys("Oreo");
        navegador.findElement(By.name("summary")).sendKeys("xxx");
        navegador.findElement(By.name("description")).sendKeys("TesteSelenium");
        navegador.findElement(By.name("steps_to_reproduce")).sendKeys("Passos para reproduzir");
        navegador.findElement(By.name("additional_info")).sendKeys("Apenas testando");
        navegador.findElement(By.className("button")).click();

    }

    public MetodosTeste visitaURL(String url){
        navegador.get(url);
        return this;
    }
}
