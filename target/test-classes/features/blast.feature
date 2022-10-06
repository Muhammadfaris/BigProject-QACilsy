@Regression @Blast
Feature: Blast

  User should be able to make some announcement to all the group company member

  Background: User who has joined a company login with their credentials
    Given User logs in with their credentials
    When User select existing company that already joined
    Then Verify user on the Home page of the company

  @Positive @Blast_01
  Scenario: Verify user navigated to blast page when user click Blast card on the team page
    Given User navigates to the Team page
    When User select Blast card
    Then User on the Blast page

  @Positive @Blast_02
  Scenario: Verify user navigated to Teams page when user click Teams name breadcrumb on the Blast page
    Given User navigates to blast page
    When User select team name
    Then User on the Team page

  @Positive @Blast_03
  Scenario: Verify user navigated to Home page when user click Home breadcrumb on the Blast page
    Given User navigates to blast page
    When User select home
    Then Verify user on the Home page of the company

  @Positive @Blast_04
  Scenario: Verify user must see the menu list of the application when user click dropdown button on the Blast page
    Given User navigates to blast page
    When User select dropdown button
    Then Verify dropdown has appeared

  @Positive @Blast_05
  Scenario: Verify user navigated to Teams page when user click Overview in dropdown menu on the Blast page
    Given User navigates to blast page
    When User select dropdown button
    And User choose Overview
    Then User on the Team page

  @Positive @Blast_06
  Scenario: Verify user navigated to Board page when user click Board in dropdown menu on the Blast page
    Given User navigates to blast page
    When User select dropdown button
    And User choose Board
    Then User on the Board page

  @Positive @Blast_07
  Scenario: Verify user navigated to Group chat page when user click Group chat in dropdown menu on the Blast page
    Given User navigates to blast page
    When User select dropdown button
    And User choose Group Chat
    Then User on the Group Chat page

  @Positive @Blast_08
  Scenario: Verify user navigated to create blast page when user click Create Blast
    Given User navigates to blast page
    When User choose create blast
    Then User on the form create blast

  @Positive @Blast_09
  Scenario: Verify user can cancel to make some blast when user click cancel button on the create blast page
    Given User navigates to blast page
    And User choose create blast
    When User want to cancel create blast
    Then User on the Blast page

  @Negative @Blast_10
  Scenario: Verify user can not make create some blast when user click Publish button with blank tile & content blast
    Given User navigates to blast page
    And User choose create blast
    When User submit blank form create blast
    Then User should see error notification

  @Negative @Blast_11
  Scenario: Verify user can not make create some blast when user click Publish button with only fills content blast
    Given User navigates to blast page
    And User choose create blast
    When User didnt fill the title of form to create blast
    Then User should see error notification

  @Positive @Blast_12
  Scenario: Verify user can create blast with auto complete due date 1 day from now when user fills blast form on the create blast page
    Given User navigates to form create blast page
    When User set due date blast autocomplete in 1 day
    And User publish their blast
    Then User success create blast with autocomplete due date

  @Positive @Blast_13
  Scenario: Verify user can see blast from another user when user check their blast
    Given User logs in with another account
    When User navigates to blast page
    Then User should see new blast

  @Positive @Blast_14
  Scenario: Verify user can create blast with private and autocomplete type when user click create blast on blast page and turn on private in create blast page
    Given User navigates to form create blast page
    When User set due date blast autocomplete in 1 day
    And User choose private type post
    And User publish their blast
    Then User success create private blast

#  @Positive @Blast_
#  Scenario: Verify user can create blast and set due date manually when user create blast and set due date manually with input date
#    Given User navigates to form create blast page
#    When User set due date blast with manual date input
##    And User publish their blast
##    Then User success create blast with manual due date

  @Positive @Blast_15
  Scenario: Verify user can create blast and set due date manually when user create blast and set due date manually with datepicker
    Given User navigates to form create blast page
    When User set manual due date by datepicker
    And User publish their blast
    Then User success create blast with manual due date

  @Positive @Blast_16
  Scenario: Verify user can create blast with auto complete due date 3 day from now when user fills blast form on the create blast page
    Given User navigates to form create blast page
    When User set due date blast autocomplete in 3 day
    And User publish their blast
    Then User success create blast with autocomplete due date

  @Positive @Blast_17
  Scenario: Verify user can create blast with auto complete due date 7 day from now when user fills blast form on the create blast page
    Given User navigates to form create blast page
    When User set due date blast autocomplete in 7 day
    And User publish their blast
    Then User success create blast with autocomplete due date

  @Positive @Blast_18
  Scenario: Verify user can make some blast with picture upload file
    Given User navigates to form create blast page
    When User set due date blast autocomplete in 7 day
    And User attach some picture file on the blast content
    And User publish their blast
    Then User success create blast with attach picture file

  @Positive @Blast_19
  Scenario: Verify user navigated to blast detail when user click blast container that has been published on the blast page
    Given User navigates to blast page
    When User choose blast that has been published
    Then User on the blast detail

  @Positive @Blast_20
  Scenario: Verify user navigated to blast page when user click Blast! breadcrumb on the blast detail page
    Given User navigates to blast page
    And User choose blast that has been published
    And User on the blast detail
    When User choose blast navigation name
    Then User on the Blast page

  @Positive @Blast_21
  Scenario: Verify user navigated to blast edit form when user click edit on the blast detail
    Given User navigates to blast detail page
    When User choose three dots icon
    And User choose edit
    Then User on the form edit blast page

  @Positive @Blast_22
  Scenario: Verify user can edit autocomplete due date and blast content has been published when user click meatball icon and click edit on the blast detail
    Given User navigates to form edit blast page
    When User edit their blast content
    And Edit due date complete with 3 days autocomplete
    And User publish their blast
    Then User success edit blast with autocomplete due date

  @Positive @Blast_23
  Scenario: Verify user can edit manual due date and blast content that has been published when user on the edit form blast page with choose by datepicker
    Given User navigates to form edit blast page
    When User edit their blast content
    And Edit due date with manual due date by datepicker
    And User publish their blast
    Then User success edit blast with manual due date

  @Positive @Blast_24
  Scenario: Verify user can edit privacy to private blast that has been published when user on the form edit blast page
    Given User navigates to form edit blast page
    When User edit their blast content
    And User choose private type post
    And User publish their blast
    Then User success edit blast with private blast

  @Positive @Blast_25
  Scenario: Verify user should be see member organized to notified menu on the form edit blast page
    Given User navigates to form edit blast page
    When User choose member that want to be notified
    Then User on the form add or remove member menu

  @Positive @Blast_26
  Scenario: Verify user can archive their blast has been published when user click meatball icon and click archive on the blast detail
    Given User navigates to blast detail page
    When User choose three dots icon
    And User choose archive
    And User submit the archive popup
    Then User success archive a blast

  @Positive @Blast_27
  Scenario: Verify user can cancel to archive their blast has been published when user click meatball icon and click archive on the blast detail
    Given User navigates to blast detail page
    When User choose three dots icon
    And User choose archive
    And User cancel submit the archive popup
    Then User on the form edit blast page

  @Positive @Blast_28
  Scenario: Verify user can comment on the blast that has been published when user fills some comment on the blast detail
    Given User navigates to blast detail page
    When User make a comment on comment box
    And User post that comment
    Then User success make a comment on blast

  @Positive @Blast_29
  Scenario: Verify user can cancel comment on the blast that has been published when user make some comment and cancel to post on the blast detail
    Given User navigates to blast detail page
    When User make a comment on comment box
    And User cancel that comment
    Then User on the blast detail

  @Positive @Blast_30
  Scenario: Verify user can edit their comment on the blast that has been published when user choose three dots icon and choose edit
    Given User navigates to blast detail page
    When User want to edit their comment
    And User edit their comment
    And User post that comment
    Then User success edit a comment

  @Positive @Blast_31
  Scenario: Verify user can delete their comment on the blast that has been published when user choose three dots icon and choose delete
    Given User navigates to blast detail page
    When User delete their comment
    Then User success delete a comment

  @Positive @Blast_32
  Scenario: Verify user can post picture comment on the blast that has been published when user upload some picture file on the blast detail
    Given User navigates to blast detail page
    When User send picture on the comment
    And User post that comment
    Then User success upload picture file on comment

  @Positive @Blast_33
  Scenario: Verify user navigated to reply comment page when user click reply below comment that existing
    Given User navigates to blast detail page
    When User choose to reply some comment
    Then User on the reply comment page

  @Positive @Blast_34
  Scenario: Verify user can reply some comment when user fills comment on the reply comment page
    Given User navigates to reply comment page
    When User make a comment on comment box
    And User post that comment
    Then User success reply a comment

  @Positive @Blast_35
  Scenario: Verify user can edit their reply comment when user fills comment on the reply comment page
    Given User navigates to reply comment page
    When User want to edit their comment
    And User edit their comment
    And User post that comment
    Then User success edit reply comment

  @Positive @Blast_36
  Scenario: Verify user can delete their reply comment when choose delete on the reply comment page
    Given User navigates to reply comment page
    When User delete their comment
    Then User success delete reply comment

  @Positive @Blast_37
  Scenario: Verify user can reply some comment with picture upload when user fills comment on the reply comment page
    Given User navigates to reply comment page
    When User send picture on the comment
    And User post that comment
    Then User success reply a comment with picture














