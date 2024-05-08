Feature: Projects automation

  Scenario: Add new Project on Projects page
    Given I am on the IOD website and I click on Projects button
    When I click Add new project button on Projects page
    And I complete all needed fields and save new Project
    Then I check if Project was added