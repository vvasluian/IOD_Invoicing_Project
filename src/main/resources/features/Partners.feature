Feature: Partners automation

  Scenario: Add new Partner on Partners page
    Given I am on the IOD website and I click on Partners button
    When I click Add new partner button on Partners page
    And I complete all needed fields and save new Partner
    Then I check if Partner was added