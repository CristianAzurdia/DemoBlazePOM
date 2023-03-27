#language:en
Feature: Navegación y categorías de productos en el sitio web

  Background: Usuario visita la página principal
    Given que un usuario visita la pagina principal

  Scenario: Navegar a través de las páginas principales
    Then el usuario puede ver el menu de navegacion
    When el usuario hace clic en "Contact"
    Then el usuario es redirigido a la ventana de "Contact" y ve el texto de "New message"
    And cierra la ventana de "Contact"
    When el usuario hace clic en "About us"
    When el usuario es redirigido a la ventana de "About us" y ve el texto de "About us"
    And cierra la ventana de "About us"
    When el usuario hace clic en "Cart"
    Then el usuario es redirigido a la ventana de "Cart" y ve el texto de "Products"
    When el usuario hace clic en "Home"
    Then el usuario puede ver el menu de navegacion

  Scenario Outline: Verificar categorías de productos
    When el usuario hace clic en la categoria "<category>"
    Then el usuario ve los productos de la categoria "<category>"

    Examples:
      | category |
      | Phones   |
      | Laptops  |
      | Monitors |