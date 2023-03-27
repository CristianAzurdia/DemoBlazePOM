package com.demoblaze.main.definitions;

import com.demoblaze.main.steps.GeneralSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;


public class GeneralDefinitions {

    @Steps
    GeneralSteps generalSteps;

    @Given("que un usuario visita la pagina principal")
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
    }

}
