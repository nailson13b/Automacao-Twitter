package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import suporte.Generator;
import suporte.Screenshot;

import java.util.concurrent.TimeUnit;

public class ExplorePage extends BasePage {
    public ExplorePage(WebDriver navegador) {
        super(navegador);
    }

    public ExplorePage clicarPeople(){
        navegador.findElement(By.xpath("/html/body/div/div/div/div[2]/main/div/div/div/div[1]/div/div[1]/div[2]/nav/div/div[2]/div/div[3]/a/div/span")).click();

        WebDriverWait wait = new WebDriverWait(navegador, 5);
        WebElement people;
        people = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div/div[2]/main/div/div/div/div[1]/div/div[2]/div/div/section/div/div/div[1]/div/div/div/div[2]/div[1]/div[2]/div/div/span/span")));

        String screenshotArquivo = "C:\\Users\\User\\Desktop\\Selenium\\Testes\\PrintScreens\\Twitter\\" + Generator.dataHoraParaArquivo() + "clicarPeople.png";
        Screenshot.tirar(navegador, screenshotArquivo);

        return this;
    }
    public ExplorePage seguirPerfil(){
        navegador.findElement(By.xpath("/html/body/div/div/div/div[2]/main/div/div/div/div[1]/div/div[2]/div/div/section/div/div/div[1]/div/div/div/div[2]/div[1]/div[2]/div/div/span/span")).click();

        String screenshotArquivo = "C:\\Users\\User\\Desktop\\Selenium\\Testes\\PrintScreens\\Twitter\\" + Generator.dataHoraParaArquivo() + "seguirPerfil.png";
        Screenshot.tirar(navegador, screenshotArquivo);

        return this;
    }
}
