@Regression @Board
Feature: Board
  User should be able to make board and notes to track their progress

  Background: User who has joined a company login with their credentials
    Given User logs in with their credentials
    When User select existing company that already joined
    Then Verify user on the Home page of the company

  @Positive @Board_01
  Scenario: Verify user navigated to Board page when click Board card on Teams page
    Given User navigates to the Team page
    When User select Board card
    Then User on the Board page

  @Positive @Board_02
  Scenario: Verify user navigated to Teams page when user click Teams name breadcrumb on Board page
    Given User navigates to Board page
    When User select team name
    Then User on the Team page

  @Positive @Board_03
  Scenario: Verify user navigate to Home page when user click Home breadcrumb on Board page
    Given User navigates to Board page
    When User select home
    Then Verify user on the Home page of the company

  @Positive @Board_04
  Scenario: Verify user must see the menu list of the application when user select dropdown button on Board page
    Given User navigates to Board page
    When User select dropdown button
    Then Verify dropdown has appeared

  @Positive @Board_05
  Scenario: Verify user navigate to Teams page when user click Overview in dropdown menu on Board page
    Given User navigates to Board page
    When User select dropdown button
    And User choose Overview
    Then User on the Team page

  @Positive @Board_06
  Scenario: Verify user navigate to Blast page when user click Blast in dropdown menu on Board page
    Given User navigates to Board page
    When User select dropdown button
    And User choose Blast
    Then User on the Blast page

  @Positive @Board_07
  Scenario: Verify user navigate to Group chat page when user click Group chat in dropdown menu on Board page
    Given User navigates to Board page
    When User select dropdown button
    And User choose Group Chat
    Then User on the Group Chat page

  @Positive @Board_08
  Scenario: Verify user must see the menu list of archived items when user click Archived Items button on Board page
    Given User navigates to Board page
    When User select Archived Items
    Then User on archived items menu

  @Positive @Board_09
  Scenario: Verify user can close archived items menu when user click on archived items button on Board page
    Given User navigates to Board page
    And User select Archived Items
    And User on archived items menu
    When User select Archived Items
    Then User on the Board page

  @Positive @Board_10
  Scenario: Verify user can close archived items menu when user click close icon on Archived Items menu
    Given User navigates to Board page
    And User select Archived Items
    And User on archived items menu
    When User close archived item menu
    Then User on the Board page

  @Positive @Board_11
  Scenario: Verify user navigate to list archived items menu when user click switch to list on Archived Items menu
    Given User navigates to Archived items menu
    When User select switch to list
    Then User on Archived list menu

  @Positive @Board_12
  Scenario: Verify user navigate to cards archived items menu when user click switch to cards on Archived Items menu
    Given User navigates to Archived items menu
    When User select switch to card
    Then User on Archived cards menu

  @Positive @Board_13
  Scenario: Verify user must see the menu list of filter when user click Filter button on Board page
    Given User navigates to Board page
    When User select Filter
    Then User on filter menu

  @Positive @Board_14
  Scenario: Verify user should be able to close filter menu when user click close icon on Filter menu
    Given User navigates to Board page
    And User select Filter
    And User on filter menu
    When User close filter menu
    Then User on the Board page

  @Positive @Board_15
  Scenario: Verify user should be able to close filter menu when user click on Filter button on Board page
    Given User navigates to Board page
    And User select Filter
    And User on filter menu
    When User select Filter
    Then User on the Board page

  @Positive @Board_16
  Scenario: Verify user navigated to form add list when user click add list on Board page
    Given User navigates to Board page
    When User select Add list
    Then User on the form Add list

  @Positive @Board_17
  Scenario: Verify user can close the form create list when user click close icon in form add list on Board page
    Given User navigates to Board page
    And User select Add list
    And User on the form Add list
    When User close form Add list
    Then User on the Board page

  @Negative @Board_18
  Scenario: Verify user can not create new list when user submit blank form in create form list on Board page
    Given User navigates to Board page
    And User select Add list
    And User on the form Add list
    When User submit blank form add list
    Then User can't make some list

  @Positive @Board_19
  Scenario: Verify user can add new list when user fills the form for add new list on Board page
    Given User navigates to Board page
    And User select Add list
    And User on the form Add list
    When User submit form add list
    Then User success create list

  @Positive @Board_20
  Scenario: Verify user navigated to list action menu when user click meatball icon on list container
    Given User navigates to Board page
    When User go to three dots icon
    Then User should see popup menu list board

  @Positive @Board_21
  Scenario: Verify user should be able to close the list action menu when user click close icon on the list action menu
    Given User navigates to Board page
    And User go to three dots icon
    And User should see popup menu list board
    When User close that popup menu
    Then User on the Board page

  @Positive @Board_22
  Scenario: Verify user can archived their list container when user click Archive This List on list action
    Given User navigates to Board page
    When User go to three dots icon
    And User choose to archive this list
    Then User success archive their list

  @Positive @Board_23
  Scenario: Verify user can restore their archive list when user choose restore on the archived list menu
    Given User navigates to Board page
    When User select Archived Items
    And User select switch to list
    And User restore some list
    Then User success restore some list

  @Positive @Board_24
  Scenario: Verify user navigated to form add card when user click add card in list container on Board page
    Given User navigates to Board page
    When User select Add card in the list board
    Then User on the form Add card

  @Positive @Board_25
  Scenario: Verify user can close the form add card when user click close icon in form add card on list container
    Given User navigates to Board page
    And User select Add card in the list board
    And User on the form Add card
    When User close form add card
    Then User on the Board page

  @Negative @Board_26
  Scenario: Verify user can not add new card on list container when user submit blank form for create card
    Given User navigates to Board page
    And User select Add card in the list board
    And User on the form Add card
    When User submit blank form add card
    Then User can't make some card

  @Positive @Board_27
  Scenario: Verify user can add new card on list container when user fills form create new card
    Given User navigates to Board page
    When User create Card in the list board
    Then User success create card

  @Positive @Board_28
  Scenario: Verify user navigate to card detail when user click a card that created before
    Given User navigates to Board page
    When User select a card form list board
    Then User on the card detail menu edit

  @Positive @Board_29
  Scenario: Verify user can close card detail when user click close icon on the card detail
    Given User navigates to Board page
    And User select a card form list board
    And User on the card detail menu edit
    When User close detail card
    Then User on the Board page

  @Positive @Board_30
  Scenario: Verify user can add some notes when user click Notes input field in the card details
    Given User navigates to Board page
    When User select a card form list board
    And User on the card detail menu edit
    And User make some notes on card
    Then User success create notes on card

  @Positive @Board_31
  Scenario: Verify user can add some picture file on notes when user on the form detail card
    Given User navigates to detail card
    When User attach some picture file on the notes card
    Then User success attach picture file on the notes card

  @Positive @Board_32
  Scenario: Verify user can add some comment when user click comment input field in the card details
    Given User navigates to detail card
    When User make some comment on card
    And User post that comment
    Then User success create comment on card

  @Positive @Board_33
  Scenario: Verify user can cancel to add comment when user click close icon beside save button in the comment input field
    Given User navigates to detail card
    And User make some comment on card
    When User cancel that comment
    Then User on the card detail menu edit

  @Positive @Board_34
  Scenario: Verify user can edit their previously posted comment in the card detail when user click edit after click meatball icon
    Given User navigates to detail card
    When User want to edit their comment on card
    And User edit their comment
    And User post that comment
    Then User success edit a comment on card

  @Positive @Board_35
  Scenario: Verify user can delete their previously posted comment in the card detail when user click delete after click meatball icon
    Given User navigates to detail card
    When User want to delete their comment on the card
    Then User success delete a comment on card

  @Positive @Board_36
  Scenario: Verify user can add some picture file on their comment in the card form detail
    Given User navigates to detail card
    When User send picture on the comment
    And User post that comment
    Then User success upload picture file on comment on card

  @Positive @Board_37
  Scenario: Verify user navigate to reply comment page when user click reply below the existing comment
    Given User navigates to detail card
    When User choose to reply some comment
    Then User on the reply comment page

  @Positive @Board_38
  Scenario: Verify user can reply some comment on card when user fills comment on the reply comment page
    Given User navigates to reply comment card page
    When User make a comment on comment box
    And User post that comment
    Then User success reply a comment on card

  @Positive @Board_39
  Scenario: Verify user can edit their previously posted comment on the reply page comment when user click edit after click meatball icon
    Given User navigates to reply comment card page
    When User want to edit their comment
    And User edit their comment
    And User post that comment
    Then User success edit reply comment on card

  @Positive @Board_40
  Scenario: Verify user can delete their previously posted comment on the reply page comment when user click delete after click meatball icon
    Given User navigates to reply comment card page
    When User delete their comment
    Then User success delete reply comment on card

  @Positive @Board_41
  Scenario: Verify user can add some picture files on reply comment card
    Given User navigates to reply comment card page
    When User send picture on the comment
    And User post that comment
    Then User success reply a comment with picture on card

  @Positive @Board_42
  Scenario: Verify user navigated to Labels popover when user click Labels on the card details
    Given User navigates to detail card
    When User choose label button
    Then User should be can see label menu popup

  @Positive @Board_43
  Scenario: Verify user can close Labels popover when user click close icon on the Labels popover on the card details
    Given User navigates to detail card
    And User choose label button
    And User should be can see label menu popup
    When User close that popup menu
    Then User on the card detail menu edit

  @Positive @Board_44
  Scenario: Verify user can create new labels when user click Labels and click plus icon beside labels text on the card details
    Given User navigates to detail card
    And User choose label button
    And User should be can see label menu popup
    When User create a new label for card
    Then User should be can see new label appeared

  @Positive @Board_45
  Scenario: Verify user can choose and apply the label that exist when user click Labels on the card details
    Given User navigates to detail card
    And User choose label button
    And User should be can see label menu popup
    When User apply some existing label to this card
    Then User success apply labeling to card

  @Positive @Board_46
  Scenario: Verify user can remove labeling on card when user click again label that apply on the card detail
    Given User navigates to detail card
    And User choose label button
    And User should be can see label menu popup
    When User remove some label to this card
    Then User success remove label to this card

  @Positive @Board_47
  Scenario: Verify user navigate to change due date popover when user click Due Date on the card detail
    Given User navigates to detail card
    And User choose due date button
    Then User should be can see due date menu popup

  @Positive @Board_48
  Scenario: Verify user can close the Change Due Date popover menu on the card detail when user click close icon on that popover
    Given User navigates to detail card
    And User choose due date button
    And User should be can see due date menu popup
    When User close that popup menu
    Then User on the card detail menu edit

  @Positive @Board_49
  Scenario: Verify user can make some due date with they card chose when user click Due Date on the card detail
    Given User navigates to detail card
    And User choose due date button
    And User should be can see due date menu popup
    When User apply some due date on card
    Then User success apply due date on card

  @Positive @Board_50
  Scenario: Verify user can remove due date that have been apply before in card when user click Due Date on the card detail
    Given User navigates to detail card
    And User choose due date button
    And User should be can see due date menu popup
    When User remove some due date on card
    Then User success remove due date on card

  @Positive @Board_51
  Scenario: Verify user navigated to move card popover when user click Move button in the card details
    Given User navigates to detail card
    When User choose move button
    Then User should be can see move card menu popup

  @Positive @Board_52
  Scenario: Verify user can close move card popover when user click Move button in the card details and click close icon
    Given User navigates to detail card
    And User choose move button
    And User should be can see move card menu popup
    When User close that popup menu
    Then User on the card detail menu edit

  @Positive @Board_53
  Scenario: Verify user can move the card when user click Move button and choose which list user want to move in the card details
    Given User navigates to detail card
    And User choose move button
    And User should be can see move card menu popup
    When User choose list board destination to move a card
    Then User success move some card

  @Positive @Board_54
  Scenario: Verify user can archive a card when user click Archive button in the card detail
    Given User navigates to Board page
    When User archive their card on the detail card
    Then User success archive their card

  @Positive @Board_55
  Scenario: Verify user can restore a card on the archived card menu
    Given User navigates to Archived items menu
    When User search card name on archived items menu
    And User choose a card to restore that card
    Then User success restore some card



















