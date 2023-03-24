package com.demoblaze.main.definitions;

import com.demoblaze.main.steps.GeneralSteps;
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
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("el usuario hace clic en {string}")
    public void elUsuarioHaceClicEn(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("el usuario es redirigido a la ventana de {string}")
    public void elUsuarioEsRedirigidoALaVentanaDe(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("el usuario es redirigido a la pagina del carrito de compras")
    public void elUsuarioEsRedirigidoALaPaginaDelCarritoDeCompras() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("el usuario hace clic en el logo del sitio web")
    public void elUsuarioHaceClicEnElLogoDelSitioWeb() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("el usuario es redirigido a la pagina principal")
    public void elUsuarioEsRedirigidoALaPaginaPrincipal() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("el usuario hace clic en la categoria {string}")
    public void elUsuarioHaceClicEnLaCategoria(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("el usuario ve los productos de la categoria {string}")
    public void elUsuarioVeLosProductosDeLaCategoria(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
