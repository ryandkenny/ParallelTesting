@node2Chrome
Feature: Test for running tests in parallel using cucumber
  Scenario: Run three tests in parallel (Chrome node 1)
    Given I get the url "https://www.duckduckgo.com"
    And I get the header
