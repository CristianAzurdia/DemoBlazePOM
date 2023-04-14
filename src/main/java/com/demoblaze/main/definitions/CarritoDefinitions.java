package com.demoblaze.main.definitions;
import com.demoblaze.main.steps.CarritoSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
public class CarritoDefinitions {
    @Steps
    CarritoSteps carritoSteps;
    @Given("click al boton del carrito")
    public void clickAlBotonDelCarrito() {
        carritoSteps.clickBtnCarrito();

    }
    @When("vea el boton de checkout {string}")
    public void veaElBotonDeCheckout(String check) {
        carritoSteps.verificarBtnCheckout(check);
    }
    @Then("click al boton de checkout")
    public void clickAlBotonDeCheckout() {
        carritoSteps.clickBtnCheckout();
    }
    @When("ingreso mi nombre {string} mi apellido {string} y mi codigo postal {string}")
    public void ingresoMiNombreMiApellidoYMiCodigoPostal(String nombre, String apellido, String postalCode) {
        carritoSteps.ingresarDatosAlCarrito(nombre, apellido, postalCode);
    }
    @Then("click al boton de continuar")
    public void clickAlBotonDeContinuar() {
        carritoSteps.clickBtnContinue();
    }
}
