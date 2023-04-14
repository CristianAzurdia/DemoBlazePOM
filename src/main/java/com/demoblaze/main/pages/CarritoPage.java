package com.demoblaze.main.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class CarritoPage extends PageObject {
    @FindBy(xpath = "//div[@id='shopping_cart_container']")
    public WebElement btnCarrito;
    @FindBy(xpath = "//button[@id='checkout']")
    public WebElement btnCheckout;
    @FindBy(xpath = "//input[@id='first-name']")
    public WebElement inpNombre;
    @FindBy(xpath = "//input[@id='last-name']")
    public WebElement inpApellido;
    @FindBy(xpath = "//input[@id='postal-code']")
    public WebElement inpPostalCode;
    @FindBy(xpath = "//input[@id='continue']")
    public WebElement inpContinue;
    public void clickBtnCarrito(){
        btnCarrito.click();
    }
    public void clickBtnCheckout(){
        btnCheckout.click();
    }
    public void clickBtnContinue(){
        waitFor(inpContinue).waitUntilClickable();
        inpContinue.click();
    }
    public void ingresarCredenciales(String nombre, String apellido, String postalCode){
        inpNombre.sendKeys(nombre);
        inpApellido.sendKeys(apellido);
        inpPostalCode.sendKeys(postalCode);
    }
}
