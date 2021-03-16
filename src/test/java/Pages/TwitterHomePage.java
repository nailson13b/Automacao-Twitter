package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import suporte.Generator;
import suporte.Screenshot;

import java.util.concurrent.TimeUnit;

public class TwitterHomePage extends BasePage {
    public TwitterHomePage(WebDriver navegador) {
        super(navegador);
    }

    public ExplorePage buscarNaSearchBar(String profile){
        navegador.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/form/div[1]/div/div/div[2]/input")).sendKeys(profile, Keys.ENTER);
        WebDriverWait wait = new WebDriverWait(navegador, 5);
        WebElement olharDigital;
        olharDigital = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div/div[2]/main/div/div/div/div[1]/div/div[2]/div/div/section/div/div/div[3]/div/div/div/div[2]/div[1]/div[1]/a/div/div[1]/div[1]/span/span")));
        String screenshotArquivo = "C:\\Users\\User\\Desktop\\Selenium\\Testes\\PrintScreens\\Twitter\\" + Generator.dataHoraParaArquivo() + "buscarNaSearchBar.png";
        Screenshot.tirar(navegador, screenshotArquivo);

        return new ExplorePage(navegador);
    }


}
