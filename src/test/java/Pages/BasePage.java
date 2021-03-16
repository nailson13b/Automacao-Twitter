package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class BasePage {
    protected WebDriver navegador;

    public BasePage(WebDriver navegador){
        this.navegador = navegador;
    }

    public String capturarLoggedIn(){
        return navegador.findElement(By.xpath("/html/body/div/div/div/div[2]/header/div/div/div/div[2]/div/div/div[2]/div/div[2]/div/span")).getText();
    }

    public String capturarTextoBotao(){
        return navegador.findElement(By.xpath("/html/body/div/div/div/div[2]/main/div/div/div/div[1]/div/div[2]/div/div/section/div/div/div[1]/div/div/div/div[2]/div[1]/div[2]/div/div/span/span")).getText();
    }

    public String capturarBusca(){
        return navegador.findElement(By.xpath("/html/body/div/div/div/div[2]/main/div/div/div/div[1]/div/div[2]/div/div/section/div/div/div[1]/div/div/div/div[2]/div[1]/div[1]/a/div/div[2]/div/span")).getText();
    }





}
