package com.demoblaze.main.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class InicioPage extends PageObject {

    @FindBy(xpath = "//select[@class='product_sort_container']")
    private WebElement btnEmbudo;
    @FindBy(xpath = "//option[@value='hilo']")
    public WebElement optHiLow;

    @FindBy(xpath = "//button[@class='btn btn_primary btn_small btn_inventory']")
    public WebElement btnAgregarCarrito;

    @FindBy(xpath = "//span[@class='shopping_cart_badge']")
    public WebElement btnCarrito;

    public void clickEmbudo(){
        btnEmbudo.click();
    }

    public void clickOrdenamiento(){
        optHiLow.click();
    }

    public void clickAgregarCarrito(){
        btnAgregarCarrito.click();
    }

}
