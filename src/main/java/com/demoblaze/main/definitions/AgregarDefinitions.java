package com.demoblaze.main.definitions;
import com.demoblaze.main.steps.AgregarSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
public class AgregarDefinitions {

    @Steps
    AgregarSteps agregarSteps;

    @Given("agregamos el primer articulo {string}")
    public void agregamosElPrimerArticulo(String nombreBTnAgregar) {
        agregarSteps.verificarBtnAgregarCarrito(nombreBTnAgregar);
    }
    @When("click en el boton de agregar al carrito")
    public void clickEnElBotonDeAgregarAlCarrito() {
        agregarSteps.clickBtnAgregarCarrito();
    }
    @Then("veo que el carrito tenga algun item")
    public void veoQueElCarritoTengaAlgunItem() {
        agregarSteps.verificarItemCarrito();
    }
}
