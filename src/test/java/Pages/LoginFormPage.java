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
        String screenshotArquivo = "C:\\Users\\User\\Desktop\\Selenium\\Testes\\PrintScreens\\Twitter\\" + Generator.dataHoraParaArquivo() + "digitarUsername.png";
        Screenshot.tirar(navegador, screenshotArquivo);

        return this;
    }
    public LoginFormPage digitarSenha(String password){
        navegador.findElement(By.xpath("/html/body/div/div/div/div[2]/main/div/div/div[2]/form/div/div[2]/label/div/div[2]/div/input")).sendKeys(password);

        String screenshotArquivo = "C:\\Users\\User\\Desktop\\Selenium\\Testes\\PrintScreens\\Twitter\\" + Generator.dataHoraParaArquivo() + "digitarSenha.png";
        Screenshot.tirar(navegador, screenshotArquivo);

        return this;
    }
    public TwitterHomePage clicarLogIn(){
        navegador.findElement(By.xpath("/html/body/div/div/div/div[2]/main/div/div/div[2]/form/div/div[3]/div/div")).click();

        WebDriverWait wait = new WebDriverWait(navegador, 5);
        WebElement home;
        home = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div/div[2]/header/div/div/div/div[1]/div[2]/nav/a[5]/div/div[2]/span")));

        String screenshotArquivo = "C:\\Users\\User\\Desktop\\Selenium\\Testes\\PrintScreens\\Twitter\\" + Generator.dataHoraParaArquivo() + "TwitterHomePage.png";
        Screenshot.tirar(navegador, screenshotArquivo);
        return new TwitterHomePage(navegador);
    }

    public TwitterHomePage fazerLogin(String username, String password){
        digitarUsername(username);
        digitarSenha(password);
        clicarLogIn();

        return new TwitterHomePage(navegador);
    }
}
