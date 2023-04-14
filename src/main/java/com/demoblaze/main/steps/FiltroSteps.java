package com.demoblaze.main.steps;

import com.demoblaze.main.pages.InicioPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class FiltroSteps {

    @Page
    InicioPage inicioPage;

    @Step
    public void clickEmbudo(){
        inicioPage.clickEmbudo();
    }
    @Step
    public void verificarOrdenamiento(){
        //inicioPage.verificarOrdenamiento();
        assertThat("Price (high to low)", equalTo(inicioPage.optHiLow.getText()));
    }
    @Step
    public void clickOrdenamiento(){
        inicioPage.clickOrdenamiento();
    }


}
