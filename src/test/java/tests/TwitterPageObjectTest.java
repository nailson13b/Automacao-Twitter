package tests;

import Pages.LoginPage;
import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.annotation.Param;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.*;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import suporte.Web;

import static org.junit.Assert.*;

@RunWith(DataDrivenTestRunner.class)
@DataLoader(filePaths = "TwitterPageObjectTest.csv")

public class TwitterPageObjectTest {
    private WebDriver navegador;

    @Before
    public void setUp() {
        navegador = Web.createChrome();
    }

    @Test
    public void validarLogin(
            @Param(name = "username") String username,
            @Param(name = "password") String password,
            @Param(name = "mensagemLogado") String mensagemLogado
    ) {
        String login = new LoginPage(navegador)
                .clicarLogIn()
                .digitarUsername(username)
                .digitarSenha(password)
                .clicarLogIn()
                .capturarLoggedIn();

        assertEquals(mensagemLogado, login);
    }

    @Test
    public void validarBusca(
            @Param(name = "username") String username,
            @Param(name = "password") String password,
            @Param(name = "profile") String profile,
            @Param(name = "mensagemBusca") String mensagemBusca
    ) {
        String buscar = new LoginPage(navegador)
                .clicarLogIn()
                .digitarUsername(username)
                .digitarSenha(password)
                .clicarLogIn()
                .buscarNaSearchBar(profile)
                .clicarPeople()
                .capturarBusca();

        assertEquals(mensagemBusca, buscar);
    }

    @Test
    public void validarFollow(
            @Param(name = "username") String username,
            @Param(name = "password") String password,
            @Param(name = "profile") String profile,
            @Param(name = "mensagemPerfilSeguido") String mensagemPerfilSeguido
    ) {
        String textoBotao = new LoginPage(navegador)
                .clicarLogIn()
                .digitarUsername(username)
                .digitarSenha(password)
                .clicarLogIn()
                .buscarNaSearchBar(profile)
                .clicarPeople()
                .seguirPerfil()
                .capturarTextoBotao();

        assertEquals(mensagemPerfilSeguido, textoBotao);
    }

    @After
    public void tearDown() {
        navegador.quit();
    }

}

