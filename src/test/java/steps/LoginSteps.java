package steps;

import base.BaseTest;
import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import pages.LoginPage;

public class LoginSteps extends BaseTest {
    private LoginPage loginPage;

    @Given("que estou na página de login")
    public void abrirPaginaLogin() {
        loginPage = new LoginPage(page);
        loginPage.navigate();
    }

    @When("eu insiro o usuário {string}")
    public void inserirUsuario(String usuario) {
        loginPage.enterUsername(usuario);
    }

    @When("eu insiro a senha {string}")
    public void inserirSenha(String senha) {
        loginPage.enterPassword(senha);
    }

    @When("clico em login")
    public void clicarLogin() {
        loginPage.clickLogin();
    }

    @Then("devo ver a mensagem {string}")
    public void validarMensagem(String mensagemEsperada) {
        String mensagem = loginPage.getMessage();
        Assertions.assertTrue(mensagem.contains(mensagemEsperada),
                "Mensagem esperada não encontrada!");
    }
}
