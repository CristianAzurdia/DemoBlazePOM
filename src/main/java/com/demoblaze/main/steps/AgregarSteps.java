package com.demoblaze.main.steps;

import com.demoblaze.main.pages.InicioPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class AgregarSteps {
    @Page
    InicioPage inicioPage;

    @Step
    public void verificarBtnAgregarCarrito(String nombreBTnAgregar){
        assertThat(nombreBTnAgregar, equalTo(inicioPage.btnAgregarCarrito.getText()));
    }
    @Step
    public void clickBtnAgregarCarrito(){
        inicioPage.clickAgregarCarrito();
    }
    @Step
    public void verificarItemCarrito(){
        assertThat("1", equalTo(inicioPage.btnCarrito.getText()));
        System.out.println("Se encontro item en carrito");
    }
}
