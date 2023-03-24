#language:en
Feature: Navegación y categorías de productos en el sitio web

  Background: Usuario visita la página principal
    Given que un usuario visita la pagina principal

  Scenario: Navegar a través de las páginas principales
    Then el usuario puede ver el menu de navegacion
    When el usuario hace clic en "Contact"
    Then el usuario es redirigido a la ventana de "Contact Us"
    When el usuario hace clic en "About Us"
    When el usuario es redirigido a la ventana de "About Us"
    When el usuario hace clic en "Cart"
    Then el usuario es redirigido a la pagina del carrito de compras
    When el usuario hace clic en el logo del sitio web
    Then el usuario es redirigido a la pagina principal

  Scenario Outline: Verificar categorías de productos
    When el usuario hace clic en la categoria "<category>"
    Then el usuario ve los productos de la categoria "<category>"

    Examples:
      | category |
      | Phones   |
      | Laptops  |
      | Monitors |