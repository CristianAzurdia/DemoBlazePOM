package com.demoblaze.main.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

@DefaultUrl("https://www.saucedemo.com/")
public class PrincipalPage extends PageObject {

    public static final String TEXTO_ESPERADO_PHONES = "Samsung galaxy s6";
    public static final String TEXTO_ESPERADO_LAPTOPS = "Sony vaio i5";
    public static final String TEXTO_ESPERADO_MONITORS = "Apple monitor 24";

    @FindBy(xpath = "//a[contains(text(),'Contact')]")
    private WebElement btnContact;
    @FindBy(xpath = "//a[contains(text(),'About us')]")
    private WebElement btnAboutUs;
    @FindBy(xpath = "//a[@id='cartur']")
    private WebElement btnCart;
    @FindBy(xpath = "//a[contains(text(),'Home')]")
    private WebElement btnHome;

    public void clickContact() {
        waitFor(btnContact).isClickable();
        btnContact.click();
    }

    public void clickAboutUs() {
        waitFor(btnAboutUs).isClickable();
        btnAboutUs.click();
    }

    public void clickCart() {
        waitFor(btnCart).isClickable();
        btnCart.click();
    }

    public void clickHome() {
        waitFor(btnHome).isClickable();
        btnHome.click();
    }

    public String obtenerNombreLogo() {
        WebElement elemento = getDriver().findElement(By.id("nava"));
        return elemento.getText();
    }

    public String obtenerTextoVentanaContact() {
        WebElement elemento = getDriver().findElement(By.xpath("//h5[@id='exampleModalLabel']"));
        waitFor(elemento).isVisible();
        return elemento.getText();
    }

    public String obtenerTextoVentanaAboutUs() {
        WebElement elemento = getDriver().findElement(By.xpath("//h5[contains(text(),'About us')]"));
        waitFor(elemento).isVisible();
        return elemento.getText();
    }

    public String obtenerTextoVentanaCart() {
        WebElement elemento = getDriver().findElement(By.xpath("//h2[contains(text(),'Products')]"));
        waitFor(elemento).isVisible();
        return elemento.getText();
    }

    public void cerrarVentana(String ventana) {
        Map<String, Integer> ventanaIndices = new HashMap<>();
        ventanaIndices.put("Contact", 1);
        ventanaIndices.put("About us", 4);
        ventanaIndices.put("Login", 3);
        ventanaIndices.put("Signup", 2);

        Integer indice = ventanaIndices.get(ventana);
        if (indice != null) {
            WebElement btnCerrar = getDriver().findElement(By.xpath("(//button[@class='close'])[" + indice + "]"));
            waitFor(btnCerrar).waitUntilClickable();
            btnCerrar.click();
        } else {
            throw new IllegalArgumentException("Nombre de ventana no es válido: " + ventana);
        }

        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("(//button[@class='close'])[" + indice + "]")));
    }

    public void clickCategoria(String categoria) {
        WebElement elementoCategoria = getDriver().findElement(By.xpath("//a[contains(text(),'" + categoria + "')]"));
        waitFor(elementoCategoria).waitUntilClickable();//el wait for es para darle esperas implicitas
        elementoCategoria.click();
    }

    public String obtenerTextoElementoPhone() {
        WebElement elemento = getDriver().findElement(By.xpath("//a[contains(text(),'Samsung galaxy s6')]"));
        waitFor(elemento).isVisible();
        return elemento.getText();
    }

    public String obtenerTextoElementoLaptops() {
        WebElement elemento = getDriver().findElement(By.xpath("//a[contains(text(),'Sony vaio i5')]"));
        waitFor(elemento).isVisible();
        return elemento.getText();
    }

    public String obtenerTextoElementoMonitors() {
        WebElement elemento = getDriver().findElement(By.xpath("//a[contains(text(),'Apple monitor 24')]"));
        waitFor(elemento).isVisible();
        return elemento.getText();
    }
}
