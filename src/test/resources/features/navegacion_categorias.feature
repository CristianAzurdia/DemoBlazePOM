#language:en
Feature: Abrir saucedemo.com

  Scenario: Abrir pagina de inicio de saucedemo.com
    Given que estoy en la pagina de inicio de saucedemo.com
    When ingrese mi usuario "standard_user" y mi contrasenia "secret_sauce"
    And click al boton de login
    Then veo la etiqueta "Products"

  Scenario: filtrar productos
    Given click al embudo
    When seleccionemos precio de mayor a menor
    Then veo el texto "Price (high to low)"

  Scenario: Agregar producto al carrito
    Given agregamos el primer articulo "Add to cart"
    When click en el boton de agregar al carrito
    Then veo que el carrito tenga algun item

  Scenario: checkout del carrito y llenar datos
    Given click al boton del carrito
    When vea el boton de checkout "Checkout"
    Then click al boton de checkout
    When ingreso mi nombre "Cristian" mi apellido "Azurdia" y mi codigo postal "01006"
    Then click al boton de continuar

