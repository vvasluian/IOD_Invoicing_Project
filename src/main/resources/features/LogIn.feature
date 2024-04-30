Feature: IOD Automation

#  Background: Authentication
#    Given I go to the IOD website
#    When I specify my credentials and click Login
#    Then I can log into my website

  Scenario: Add new Partner on Partners page
    Given I am on the IOD website and I click on Partners button
    When I click Add new partner button on Partners page
    And I complete all needed fields and save new Partner
    Then I check if Partner was added

  Scenario: Add new Project on Projects page
    Given I am on the IOD website and I click on Projects button
    When I click Add new project button on Projects page
    And I complete all needed fields and save new Project
    Then I check if Project was added