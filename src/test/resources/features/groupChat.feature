@Regression @Group_Chat
Feature: Group Chat

  User should be able to interact on Group Chat feature with another user

  Background: User who has joined a company login with their credentials
    Given User logs in with their credentials
    When User select existing company that already joined
    Then Verify user on the Home page of the company

  @Positive @GC_01
  Scenario: Verify user navigated to group chat page when user select Group Chat card on the team page
    Given User navigates to the Team page
    When User select Group Chat card
    Then User on the Group Chat page

  @Positive @GC_02
  Scenario: Verify user can make some chat when user fills input field chat on the group chat page
    Given User navigates to Group Chat page
    When User sending some chat
    Then User should be can see their chat section

  @Positive @GC_03
  Scenario: Verify user can receive some chat when another user sending some chat
    Given User logs in with another account
    When User navigates to Group Chat page
    And Some message came in form another user
    And User reply that message
    Then User should be can see their chat section

  @Negative @GC_04
  Scenario: Verify user can sending link address without space at end of char chat when user fills chatbox on group chat
    Given User navigates to Group Chat page
    When User sending some link address without space at the end
    Then User should be can see their chat section
    And User can navigates to that link

  @Positive @GC_05
  Scenario: Verify user can sending link address with space at end of char chat when user fills chatbox on group chat
    Given User navigates to Group Chat page
    When User sending some link address with space at the end
    Then User should be can see their chat section
    And User can navigates to that link

  @Positive @GC_06
  Scenario: Verify user can delete their message that has been sent when user choose menu delete in that chat
    Given User navigates to Group Chat page
    And User sending some chat
    And User should be can see their chat section
    When User delete their chat
    Then User success delete their message

  @Positive @GC_07
  Scenario: Verify user can attach some picture file when user choose attach file icon
    Given User navigates to Group Chat page
    When User sending attach some picture
    Then User can access their upload file

  @Positive @GC_08
  Scenario: Verify user can attach some document file when user choose attach file icon
    Given User navigates to Group Chat page
    When User sending attach some file document
    Then User can access their upload file

  @Positive @GC_09
  Scenario: Verify user navigate to Teams page when user click Teams name breadcrumb on the Group chat page
    Given User navigates to Group Chat page
    When User select team name
    Then User on the Team page

  @Positive @GC_10
  Scenario: Verify user navigate to Home page when user click Home breadcrumb on the Group chat page
    Given User navigates to Group Chat page
    When User select home
    Then Verify user on the Home page of the company

  @Positive @GC_11
  Scenario: Verify user must see the menu list of the application when user click dropdown button on the Group chat page
    Given User navigates to Group Chat page
    When User select dropdown button
    Then Verify dropdown has appeared

  @Positive @GC_12
  Scenario: Verify user navigate to Teams page when user click Overview in dropdown menu on the Group chat page
    Given User navigates to Group Chat page
    When User select dropdown button
    And User choose Overview
    Then User on the Team page

  @Positive @GC_13
  Scenario: Verify user navigate to Blast page when user click Blast in dropdown menu on the Group chat page
    Given User navigates to Group Chat page
    When User select dropdown button
    And User choose Blast
    Then User on the Blast page

  @Positive @GC_14
  Scenario: Verify user navigate to Board page when user click Board in dropdown menu on the Group chat page
    Given User navigates to Group Chat page
    When User select dropdown button
    And User choose Board
    Then User on the Board page






