package com.demoblaze.main.steps;

import com.demoblaze.main.exceptions.ExcepcionNavegacion;
import com.demoblaze.main.pages.PrincipalPage;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class GeneralSteps {

    @ManagedPages
    PrincipalPage principalPage;

    @Step
    public void abrirPagina() {
        principalPage.open();
    }

    @Step
    public void validarVisualizacionMenu() {
        assertThat("PRODUCT STORE", equalTo(principalPage.obtenerNombreLogo()));
        System.out.println(principalPage.obtenerNombreLogo());
    }

    @Step
    public void validarVentanasMenu(String ventana, String textoEsperado) {
        String textoActual;
        switch (ventana) {
            case "Contact":
                textoActual = principalPage.obtenerTextoVentanaContact();
                break;
            case "About us":
                textoActual = principalPage.obtenerTextoVentanaAboutUs();
                break;
            case "Cart":
                textoActual = principalPage.obtenerTextoVentanaCart();
                break;
            default:
                throw new ExcepcionNavegacion("La ventana a la que quiere redirigir no es correcta");
        }
        assertThat(textoActual, equalTo(textoEsperado));
    }

    @Step
    public void clickMenu(String menu) {
        switch (menu) {
            case "Contact":
                principalPage.clickContact();
                break;
            case "About us":
                principalPage.clickAboutUs();
                break;
            case "Cart":
                principalPage.clickCart();
                break;
            case "Home":
                principalPage.clickHome();
                break;
            default:
                throw new ExcepcionNavegacion("La opcion de navegacion proporcionada no es valida: " + menu);
        }
    }

    @Step
    public void cerrarVentanaDe(String ventana) {
        principalPage.cerrarVentana(ventana);
    }

    @Step
    public void clickEnCategoria(String value) {
        principalPage.clickCategoria(value);
    }

    @Step
    public void verificarProductosDeLaCategoria(String value) {
        String textoActual;
        String textoEsperado;
        switch (value) {
            case "Phones":
                textoActual = PrincipalPage.TEXTO_ESPERADO_PHONES;
                textoEsperado = principalPage.obtenerTextoElementoPhone();
                break;
            case "Laptops":
                textoActual = PrincipalPage.TEXTO_ESPERADO_LAPTOPS;
                textoEsperado = principalPage.obtenerTextoElementoLaptops();
                break;
            case "Monitors":
                textoActual = PrincipalPage.TEXTO_ESPERADO_MONITORS;
                textoEsperado = principalPage.obtenerTextoElementoMonitors();
                break;
            default:
                throw new ExcepcionNavegacion("la opcion de categorias no es correcta: " + value);
        }
        assertThat(textoActual, equalTo(textoEsperado));
    }

}
