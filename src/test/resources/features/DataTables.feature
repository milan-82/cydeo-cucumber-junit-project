
Feature: Cucumber Data Tables implementation practices

  Scenario: List of fruits I like
    Then  user should se below list
      | orange     |
      | apple      |
      | kiwi       |
      | pear       |
      | watermelon |
      | cherry     |

    # Create a new scenario where we list the type of pets we love
    # Print out all the strings in the list

  Scenario: List of pet type I love
    Then I will share my favorites
      | Kangal           |
      | Husky            |
      | Golden Retriever |
      | German Shepard   |
      | Boxer            |
      | Siberian cat     |
      | Ragdoll cat      |


  Scenario: Officer reads data about driver
    Then officer is able to see any data he wants
      | name    | Jane         |
      | surname | Done         |
      | age     | 29           |
      | address | Chicago      |
      | zipcode | 60656        |
      | state   | IL           |
      | phone   | 111-111-1111 |

  @dataTable
  Scenario: User should be able to see all 12 months in months dropdown
    Given User is on the dropdowns page of practice tool
    Then User should see below info in month dropdown
      | January   |
      | February  |
      | March     |
      | April     |
      | May       |
      | June      |
      | July      |
      | August    |
      | September |
      | October   |
      | November  |
      | December  |



