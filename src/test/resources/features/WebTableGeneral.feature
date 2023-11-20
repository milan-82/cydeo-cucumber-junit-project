Feature: Some of the general functionality verifications

  Scenario: Dropdown options verification
    Given user is already logged in to The Web table app
    When user is on the “Order” page
    Then user sees below options under “product” dropdown
      | MoneyCog   |
      | Familybea  |
      | Screenable |


  Scenario: Payment options verifications
    Given user is already logged in to The Web table app
    When user is on the “Order” page
    Then user sees below radio buttons enabled Visa
    Then user sees below radio buttons enabled Mastercard
    Then user sees below radio buttons enabled American Express


  @wip
  Scenario Outline:  Order placement scenario
    Given user is already logged in to The Web table app
    When user is on the “Order” page
    And user enters quantity "<quantity>"
    Then user click to the calculate button
    And  user enters customer name "<customerName>"
    And  user enters street name "<street>"
    And  user enters city name "<city>"
    And  user enters state name "<state>"
    And  user enters zip code "<zipCode>"
    And  user selects payment option "<paymentType>"
    And  user enters card number "<cardNumber>"
    And  user enters expDate "<expDate>"
    And  user clicks to process order button
    Then user should see "<expectedName>" in the first row of the web table

    Examples:

      | quantity | customerName | street  | city | state | zipCode | paymentType      | cardNumber       | expDate | expectedName |
      | 3        | Jen Doe      | 7th st  | NY   | NY    | 99999   | Visa             | 1111222233334444 | 12/25   | Jen Doe      |
      | 4        | Jack Jons    | 17th st | BR   | AL    | 88888   | Maser Card       | 1111222233334444 | 02/26   | Jack Jons    |
      | 2        | John Wayne   | 77th st | DM   | IA    | 55555   | American Express | 1111222233334444 | 10/27   | John Wayne   |
