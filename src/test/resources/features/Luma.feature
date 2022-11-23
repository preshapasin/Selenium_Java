Feature: Complete shopping on Luma website.

  Scenario: As a registered user, buy men tops and bottoms.
    Given the customer is a registered logged in user on Luma website
    When the customer checks the Men's clothing section
    And the customer selects Jackets from Tops section
    And they select size and colour of the jackets
      | S | Blue |
      | M | Red  |
    And the customer selects Pants from Bottoms section
    And they select size and colour of the pants
      | 33 | Black |
    When the customer proceed to checkout
    And choose the address for delivery
    And then select the shipping method
    And the customer verifies the order summary
    And they place the order
    Then the order is visible under My Orders
