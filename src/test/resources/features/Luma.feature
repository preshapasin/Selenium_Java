Feature: Complete shopping on Luma website.

  Scenario Outline: As a registered user, buy men tops and bottoms.
    Given I am an existing logged in user of Luma website
    When I hover to "<MAIN_TYPE>"
    And I hover on the "<DROPDOWN_TYPE>" category
    And I click on the "<TYPE_1>" category
    And I select "<SIZES>" and "<COLOUR>" of one product

    Examples:
      | MAIN_TYPE | DROPDOWN_TYPE | TYPE_1  | SIZES | COLOUR |
      | Men       | Tops          | Jackets | S     | Blue   |
      | Men       | Tops          | Jackets | M     | Red    |
      | Men       | Bottoms       | Pants   | 33    | Black  |

  Scenario: As a registered user, checkout my cart and verify order.
    When I proceed to checkout
#    And I provide a valid address for delivery
    And I select the shipping method
    And verify the order summary
    And I place the order
    Then my order is visible under My Orders




