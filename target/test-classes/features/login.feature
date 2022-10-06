@login
Feature: Login
  User who has joined a company login with their credentials

  Scenario: Verify user can login with their credentials
    Given User logs in with their credentials
    When User select existing company that already joined
    Then Verify user on the Home page of the company