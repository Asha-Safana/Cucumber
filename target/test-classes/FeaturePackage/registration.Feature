#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Book Registration Page

  #Background:
  #Given user launches Book application
  #And User clicks on MY Account
  @reg
  Scenario: User is able to register successfully
    Given user launches Book application
    And User clicks on MY Account
    When User enters Mobile , Password
    And clicks on Login button
    Then User should Land on the Home Page
   @reg @sanity
  Scenario: User is able to register successfully by passing value to step definition
    Given user launches Book application
    And User clicks on MY Account
    When User enters "877886443" , "bhjgh"
    And clicks on Login button
    Then User should Land on the Home Page

  Scenario: User is able to register successfully using the table
    Given user launches Book application
    And User clicks on MY Account
    When User enters required data
      | 8778864433 | hhkn |
    And clicks on Login button
    Then User should Land on the Home Page

  Scenario Outline: User is able to register successfully using the scenario outline
    Given user launches Book application
    And User clicks on MY Account
    When User enters "<Mobile>" , "<Phone>"
    And clicks on Login button
    Then User should Land on the Home Page

    Examples: 
      | Mobile     | Phone  |
      | 8778864433 | kjhkhj |
      | 6789989087 | dsersd |
