package com.demoblaze.main.steps;

import com.demoblaze.main.pages.PrincipalPage;
import net.thucydides.core.annotations.ManagedPages;

public class GeneralSteps {

    @ManagedPages
    PrincipalPage principalPage;

    public void abrirPagina() {
        principalPage.open();
    }
}
