package com.demoblaze.main.definitions;

import com.demoblaze.main.steps.GeneralSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;


public class GeneralDefinitions {
    @Steps
    GeneralSteps generalSteps;

    @Given("que estoy en la pagina de inicio de saucedemo.com")
    public void queEstoyEnLaPaginaDeInicioDeSauceDemo() {
        // Abre la página de inicio de saucedemo.com en tu navegador
        generalSteps.abrirPagina();
    }

    @When("ingrese mi usuario {string} y mi contrasenia {string}")
    public void ingreseMiUsuarioYMiContrasenia(String usuario, String pass) {
        // Write code here that turns the phrase above into concrete actions
        generalSteps.ingresarCredenciales(usuario, pass);
    }

    @When("click al boton de login")
    public void clickAlBotonDeLogin() {
        // Write code here that turns the phrase above into concrete actions
        generalSteps.clickLogin();
    }

    @Then("veo la etiqueta {string}")
    public void veoLaEtiqueta(String etiqueta) {
        // Write code here that turns the phrase above into concrete actions
        generalSteps.verificarPagina(etiqueta);
    }



    /*@Given("que un usuario visita la pagina principal")
    public void queUnUsuarioVisitaLaPaginaPrincipal() {
        generalSteps.abrirPagina();
    }

    @Then("el usuario puede ver el menu de navegacion")
    public void elUsuarioPuedeVerElMenuDeNavegacion() {
        generalSteps.validarVisualizacionMenu();
    }

    @When("el usuario hace clic en {string}")
    public void elUsuarioHaceClicEnContact(String value) {
        generalSteps.clickMenu(value);
    }

    @Then("el usuario es redirigido a la ventana de {string} y ve el texto de {string}")
    public void elUsuarioEsRedirigidoALaVentanaDe(String value1, String value2) {
        generalSteps.validarVentanasMenu(value1, value2);
    }

    @And("cierra la ventana de {string}")
    public void cierraLaVentanaDeSomething(String value) {
        generalSteps.cerrarVentanaDe(value);
    }

    @When("el usuario hace clic en la categoria {string}")
    public void elUsuarioHaceClicEnLaCategoria(String value) {
        generalSteps.clickEnCategoria(value);
    }

    @Then("el usuario ve los productos de la categoria {string}")
    public void elUsuarioVeLosProductosDeLaCategoria(String value) {
        generalSteps.verificarProductosDeLaCategoria(value);
    }*/

}
