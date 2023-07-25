Feature: To Test the GreenKart Add to Cart feature

  @smoke
  Scenario: Add two vegs to the add to cart itemlist
    Given User has to be logged
    And All the available Vegs should be listed
    Then User should click on two Items
    And Validate the Page Title "GreenKart - veg and fruits kart"

  Scenario: Validate whether there are vegs in the add to cart itemlist
    Given User has to be logged
    And All the available Vegs should be listed
    Then User should be able to navigate to item list
    And Validate the Page Title "GreenKart - veg and fruits kart"

    