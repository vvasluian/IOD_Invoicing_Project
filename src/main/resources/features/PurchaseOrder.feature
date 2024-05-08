Feature: Purchase Order automation

  Scenario: Add new Purchase Order on Purchase Order page
    Given I am on the IOD website and I click on Purchase Order button
    When I click Add new Purchase Order button on Purchase order page
    And I complete all needed fields and save new Purchase Order
    Then I check if Purchase Order was added