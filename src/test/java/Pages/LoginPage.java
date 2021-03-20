package Pages;

import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import suporte.Generator;
import suporte.Screenshot;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver navegador) {
        super(navegador);

    }

    public LoginFormPage clicarLogIn(){
        // Clicar no Link que possui o texto "Log In"
        navegador.findElement(By.linkText("Log in")).click();
        Screenshot.tirar(navegador, Screenshot.caminho() + Generator.dataHoraParaArquivo() + "clicarLogin.png");

        return new LoginFormPage(navegador);
    }
}
