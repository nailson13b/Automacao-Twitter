package Pages;

import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import suporte.Generator;
import suporte.Screenshot;

public class LoginFormPage extends BasePage {
    public LoginFormPage(WebDriver navegador) {
        super(navegador);
    }

    public LoginFormPage digitarUsername(String username){
        navegador.findElement(By.xpath("/html/body/div/div/div/div[2]/main/div/div/div[2]/form/div/div[1]/label/div/div[2]/div/input")).sendKeys(username);
        Screenshot.tirar(navegador, Screenshot.caminho() + Generator.dataHoraParaArquivo() + "digitarUsername.png");

        return this;
    }
    public LoginFormPage digitarSenha(String password){
        navegador.findElement(By.xpath("/html/body/div/div/div/div[2]/main/div/div/div[2]/form/div/div[2]/label/div/div[2]/div/input")).sendKeys(password);
        Screenshot.tirar(navegador, Screenshot.caminho() + Generator.dataHoraParaArquivo() + "digitarSenha.png");

        return this;
    }
    public TwitterHomePage clicarLogIn(){
        navegador.findElement(By.xpath("/html/body/div/div/div/div[2]/main/div/div/div[2]/form/div/div[3]/div/div")).click();

        WebDriverWait wait = new WebDriverWait(navegador, 5);
        WebElement home;
        home = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div/div[2]/header/div/div/div/div[1]/div[2]/nav/a[5]/div/div[2]/span")));

        Screenshot.tirar(navegador, Screenshot.caminho() + Generator.dataHoraParaArquivo() + "TwitterHomePage.png");
        return new TwitterHomePage(navegador);
    }

    public TwitterHomePage fazerLogin(String username, String password){
        digitarUsername(username);
        digitarSenha(password);
        clicarLogIn();

        return new TwitterHomePage(navegador);
    }
}
