package com.demoblaze.main.definitions;

import com.demoblaze.main.steps.FiltroSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class FiltroDefinitions {

    @Steps
    FiltroSteps filtroSteps;

    @Given("click al embudo")
    public void clickAlEmbudo() {
        filtroSteps.clickEmbudo();
    }
    @When("seleccionemos precio de mayor a menor")
    public void seleccionemosPrecioDeMayorAMenor() {
        filtroSteps.verificarOrdenamiento();
    }
    @Then("veo el texto {string}")
    public void veoElTexto(String ordenamiento) {
        filtroSteps.clickOrdenamiento();
    }


}
