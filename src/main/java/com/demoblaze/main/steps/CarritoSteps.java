package com.demoblaze.main.steps;

import com.demoblaze.main.pages.CarritoPage;
import com.demoblaze.main.pages.InicioPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class CarritoSteps {
    @Page
    CarritoPage carritoPage;

    @Step
    public void clickBtnCarrito(){
        carritoPage.clickBtnCarrito();
    }
    @Step
    public void verificarBtnCheckout(String check){
        assertThat(check, equalTo(carritoPage.btnCheckout.getText()));
    }
    @Step
    public void clickBtnCheckout(){
        carritoPage.clickBtnCheckout();
    }
    @Step
    public void ingresarDatosAlCarrito(String nombre, String apellido, String postalCode){
        carritoPage.ingresarCredenciales(nombre, apellido, postalCode);
    }
    @Step
    public void verificarBtnContinue(String id){
        assertThat(id, equalTo(carritoPage.inpContinue.getText()));
    }
    @Step
    public void clickBtnContinue(){
        carritoPage.clickBtnContinue();
    }
}
