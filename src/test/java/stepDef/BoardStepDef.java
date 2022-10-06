package stepDef;

import data.DataInput;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.BlastPage;
import pages.BoardPage;
import pages.GroupChatPage;
import pages.HomePage;
import utils.WebElementUtils;

import java.io.IOException;

public class BoardStepDef {

    BoardPage boardPage = new BoardPage();
    HomePage homePage = new HomePage();
    BlastPage blastPage = new BlastPage();

    public String listBoardName;
    @When("User select Board card")
    public void userSelectBoardCard() {
        boardPage.clickBoardCard();
    }

    @Then("User on the Board page")
    public void verifyUserOnTheBoardPage() throws InterruptedException {
        Assert.assertTrue(boardPage.boardPageDisplayed());
    }

    @Given("User navigates to Board page")
    public void userNavigatesToBoardPage() throws InterruptedException {
        homePage.clickTeamGroup();
        Assert.assertTrue(homePage.teamPageDisplayed());
        boardPage.clickBoardCard();
        Assert.assertTrue(boardPage.boardPageDisplayed());
    }
    @Then("User on the Team page")
    public void userOnTheTeamPage() {
        Assert.assertTrue(homePage.teamPageDisplayed());
    }

    @When("User select team name")
    public void userSelectTeamName() {
        boardPage.clickTeamNameOnBoardBreadCrumb();
    }

    @When("User select home")
    public void userSelectHome() {
        boardPage.clickHomeOnBoardBreadCrumb();
    }

    @When("User select dropdown button")
    public void userSelectDropdownButton() {
        boardPage.clickDropDownButton();
    }

    @When("User choose Overview")
    public void userChooseOverview() {
        boardPage.clickDropDownListOverview();
    }

    @And("User choose Blast")
    public void userChooseBlast() {
        boardPage.clickDropDownListBlast();
    }

    @And("User choose Group Chat")
    public void userChooseGroupChat() {
        boardPage.clickDropDownListGroupChat();
    }

    @Then("Verify dropdown has appeared")
    public void verifyDropdownHasAppeared() {
        Assert.assertTrue(boardPage.dropDownListAppeared());
    }

    @When("User select Archived Items")
    public void userSelectArchivedItems() {
        boardPage.clickArchivedItems();
    }

    @Then("User on archived items menu")
    public void userOnArchivedItemsMenu() {
        Assert.assertTrue(boardPage.archivedItemsMenuDisplayed());
    }

    @When("User close archived item menu")
    public void userCloseArchivedItemMenu() {
        boardPage.clickCloseContainer();
    }

    @Given("User navigates to Archived items menu")
    public void userNavigatesToArchivedItemsMenu() throws InterruptedException {
        homePage.clickTeamGroup();
        Assert.assertTrue(homePage.teamPageDisplayed());
        boardPage.clickBoardCard();
        Assert.assertTrue(boardPage.boardPageDisplayed());
        boardPage.clickArchivedItems();
        Assert.assertTrue(boardPage.archivedItemsMenuDisplayed());
    }

    @When("User select switch to list")
    public void userSelectSwitchToList() {
        boardPage.clickSwitchToList();
    }

    @Then("User on Archived list menu")
    public void userOnArchivedListMenu() {
        Assert.assertTrue(boardPage.btnSwitchToCardDisplayed());
    }

    @When("User select switch to card")
    public void userSelectSwitchToCard() {
        boardPage.clickSwitchToList();
        boardPage.clickSwitchToCard();
    }

    @Then("User on Archived cards menu")
    public void userOnArchivedCardsMenu() {
        Assert.assertTrue(boardPage.btnSwitchToListDisplayed());
    }

    @When("User select Filter")
    public void userSelectFilter() {
        boardPage.clickFilterButton();
    }

    @Then("User on filter menu")
    public void userOnFilterMenu() {
        Assert.assertTrue(boardPage.filterMenuDisplayed());
    }

    @When("User close filter menu")
    public void userCloseFilterMenu() {
        boardPage.clickCloseContainer();
    }

    @When("User select Add list")
    public void userSelectAddList() throws InterruptedException {
        boardPage.clickAddList();
    }

    @Then("User on the form Add list")
    public void userOnTheFormAddList() {
        Assert.assertTrue(boardPage.formAddListDisplayed());
    }

    @When("User close form Add list")
    public void userCloseFormAddList() {
        boardPage.clickCloseCreateList();
    }

    @When("User submit blank form add list")
    public void userSubmitBlankFormAddList() {
        boardPage.clickCreateList();
    }

    @Then("User can't make some list")
    public void userCantMakeSomeList() {
        Assert.assertEquals("List name cannot be empty",boardPage.getPopupNotif());
    }

    @When("User submit form add list")
    public void userSubmitFormAddList() {
        boardPage.inputListForm();
        boardPage.clickCreateList();
    }
    @Then("User success create list")
    public void userSuccessCreateList() {
        Assert.assertEquals("Creating list is success",boardPage.getPopupNotif());
        Assert.assertEquals(DataInput.randomChar,boardPage.getValueListFirstOrder());
    }

    @When("User create Card in the list board")
    public void userCreateCardInTheListBoard() {
        boardPage.clickAddCard();
        boardPage.inputCardNameForm();
        boardPage.clickCreateCard();
    }

    @Then("User success create card")
    public void userSuccessCreateCard() {
        Assert.assertTrue(boardPage.cardHasCreated());
        Assert.assertEquals("Creating card is success",boardPage.getPopupNotif());
    }


    @When("User select a card form list board")
    public void userSelectACardFormListBoard() {
        boardPage.clickFirstCard();
    }

    @Then("User on the card detail menu edit")
    public void userOnTheCardDetailMenuEdit() {
        Assert.assertTrue(boardPage.cardMenuEditDisplayed());
    }

    @And("User make some notes on card")
    public void userMakeSomeNotesOnCard() {
        boardPage.clickNotesOnEditCard();
        boardPage.makeSomeNotes();
        boardPage.clickSaveNotes();
    }

    @Then("User success create notes on card")
    public void userSuccessCreateNotesOnCard() {
        Assert.assertEquals("Update card is success",boardPage.getPopupNotif());
        Assert.assertEquals(DataInput.randomChar,boardPage.getValueNotesOnCard());
    }

    @And("User make some comment on card")
    public void userMakeSomeCommentOnCard() {
        boardPage.clickCommentOnEditCard();
        boardPage.makeSomeComment();
    }

    @Then("User success create comment on card")
    public void userSuccessCreateCommentOnCard() {
        Assert.assertEquals("Create comment is success",boardPage.getPopupNotif());
    }

    @When("User select Add card in the list board")
    public void userSelectAddCardInTheListBoard() {
        boardPage.clickAddCard();
    }

    @Then("User on the form Add card")
    public void userOnTheFormAddCard() {
        Assert.assertTrue(boardPage.formAddCardDisplayed());
    }

    @When("User close form add card")
    public void userCloseFormAddCard() {
        boardPage.clickCloseContainer();
    }

    @When("User submit blank form add card")
    public void userSubmitBlankFormAddCard() {
        boardPage.clickCreateCard();
    }

    @Then("User can't make some card")
    public void userCantMakeSomeCard() {
        Assert.assertEquals("Card name cannot be empty",boardPage.getPopupNotif());
    }

    @When("User close detail card")
    public void userCloseDetailCard() {
        boardPage.clickCloseDetailCard();
    }

    @When("User go to three dots icon")
    public void userGoToThreeDotsIcon() {
//        valueListName = boardPage.getValueListFirstOrder();
        boardPage.clickThreeDotsListActionMenu();
    }

    @And("User choose to archive this list")
    public void userChooseToArchiveThisList() {
        Assert.assertTrue(boardPage.popOverMenuListActionDisplayed());
        boardPage.clickArchiveOnListActionMenu();
    }

    @Then("User success archive their list")
    public void userSuccessArchiveTheirList() throws InterruptedException {
        Assert.assertTrue(boardPage.popUpSuccessArchiveList());
        boardPage.clickArchivedItems();
        Assert.assertTrue(boardPage.archivedItemsMenuDisplayed());
        boardPage.clickSwitchToList();
        boardPage.searchItems(DataInput.randomChar);
        Assert.assertEquals(DataInput.randomChar,boardPage.getValueArchivedListItems());
    }


    @Then("User should see popup menu list board")
    public void userShouldSeePopupMenuListBoard() {
        Assert.assertTrue(boardPage.popOverMenuListActionDisplayed());
    }

    @When("User close that popup menu")
    public void userCloseThatPopupMenu() {
        boardPage.clickClosePopOverListMenu();
    }

    @And("User restore some list")
    public void userRestoreSomeList() throws InterruptedException {
        boardPage.searchItems(DataInput.randomChar);
        boardPage.clickRestoreListBoard();
    }

    @Then("User success restore some list")
    public void userSuccessRestoreSomeList() {
        Assert.assertEquals("Unarchiving list with cards is success", boardPage.getPopupNotif());
        Assert.assertEquals(DataInput.randomChar,boardPage.getValueListFirstOrder());
    }

    @Given("User navigates to detail card")
    public void userNavigatesToDetailCard() throws InterruptedException {
        homePage.clickTeamGroup();
        Assert.assertTrue(homePage.teamPageDisplayed());
        boardPage.clickBoardCard();
        Assert.assertTrue(boardPage.boardPageDisplayed());
        boardPage.clickFirstCard();
        Assert.assertTrue(boardPage.cardMenuEditDisplayed());
    }

    @When("User attach some picture file on the notes card")
    public void userAttachSomePictureFileOnTheNotesCard() throws InterruptedException {
        boardPage.clickEditNotesBtn();
        blastPage.attachPictureFileOnCreateBlast();
        boardPage.clickSaveNotes();
    }

    @Then("User success attach picture file on the notes card")
    public void userSuccessAttachPictureFileOnTheNotesCard() throws IOException, InterruptedException {
        Assert.assertEquals("Update card is success",boardPage.getPopupNotif());
        blastPage.checkPictureSrc();
    }

    @When("User want to edit their comment on card")
    public void userWantToEditTheirCommentOnCard() {
        boardPage.clickThreeDotsEditComment();
        blastPage.clickEditComment();
    }

    @Then("User success edit a comment on card")
    public void userSuccessEditACommentOnCard() {
        Assert.assertEquals("Update comment is success",boardPage.getPopupNotif());
        Assert.assertEquals(DataInput.randomChar,blastPage.getValueComment());

    }

    @When("User want to delete their comment on the card")
    public void userWantToDeleteTheirCommentOnTheCard() {
        boardPage.clickThreeDotsEditComment();
        blastPage.clickDeleteComment();
        blastPage.clickOkeDeleteCommentPopUP();
    }

    @Then("User success delete a comment on card")
    public void userSuccessDeleteACommentOnCard() {
        Assert.assertEquals("delete comment is success",boardPage.getPopupNotif());
    }

    @Then("User success upload picture file on comment on card")
    public void userSuccessUploadPictureFileOnCommentOnCard() throws IOException, InterruptedException {
        Assert.assertEquals("Create comment is success",boardPage.getPopupNotif());
        blastPage.checkPictureSrc2();
    }

    @Given("User navigates to reply comment card page")
    public void userNavigatesToReplyCommentCardPage() throws InterruptedException {
        homePage.clickTeamGroup();
        Assert.assertTrue(homePage.teamPageDisplayed());
        boardPage.clickBoardCard();
        Assert.assertTrue(boardPage.boardPageDisplayed());
        boardPage.clickFirstCard();
        Assert.assertTrue(boardPage.cardMenuEditDisplayed());
        blastPage.clickReplyComment();
        Assert.assertTrue(blastPage.replyCommentPageDisplayed());
    }

    @Then("User success reply a comment on card")
    public void userSuccessReplyACommentOnCard() throws InterruptedException {
        Assert.assertEquals("Create discussion on card comment successful",boardPage.getPopupNotif());
        Assert.assertEquals(DataInput.randomChar,blastPage.getReplyComment());
    }

    @Then("User success edit reply comment on card")
    public void userSuccessEditReplyCommentOnCard() throws InterruptedException {
        Assert.assertEquals("Update discussion on card comment successful",boardPage.getPopupNotif());
        Assert.assertEquals(DataInput.randomChar,blastPage.getReplyComment());
    }

    @Then("User success delete reply comment on card")
    public void userSuccessDeleteReplyCommentOnCard() {
        Assert.assertEquals("Delete discussion on comment successful",boardPage.getPopupNotif());
        Assert.assertTrue(blastPage.commentNullDisplayed());
    }

    @Then("User success reply a comment with picture on card")
    public void userSuccessReplyACommentWithPictureOnCard() throws InterruptedException {
        Thread.sleep(800);
        Assert.assertEquals("Create discussion on card comment successful",boardPage.getPopupNotif());
    }

    @When("User choose label button")
    public void userChooseLabelButton() {
        boardPage.clickLabelButtonOnCardDetail();
    }

    @Then("User should be can see label menu popup")
    public void userShouldBeCanSeeLabelMenuPopup() {
        Assert.assertTrue(boardPage.labelPopOverMenuDisplayed());
    }

    @When("User create a new label for card")
    public void userCreateANewLabelForCard() {
        boardPage.clickLabelPlusButton();
        Assert.assertTrue(boardPage.labelPopOverNewLabelMenuDisplayed());
        boardPage.inputNewLabelName();
        boardPage.chooseLabelColor();
        boardPage.clickCreateLabel();
    }

    @Then("User should be can see new label appeared")
    public void userShouldBeCanSeeNewLabelAppeared() {
        Assert.assertEquals("Creating label for this board is success",boardPage.getPopupNotif());
        Assert.assertEquals(DataInput.randomChar2,boardPage.getValueNewLabel());
    }

    @When("User apply some existing label to this card")
    public void userApplySomeExistingLabelToThisCard() {
        boardPage.clickLastLabelOrderThatExist();
        boardPage.clickApplyLabel();
    }

    @Then("User success apply labeling to card")
    public void userSuccessApplyLabelingToCard() {
        Assert.assertEquals("toggle multiple labels card is success",boardPage.getPopupNotif());
        Assert.assertEquals(boardPage.getValueNewLabel(),boardPage.getLastLabelThatApply());
    }

    @When("User remove some label to this card")
    public void userRemoveSomeLabelToThisCard() {
        boardPage.clickLastLabelOrderThatExist();
        boardPage.clickApplyLabel();
    }

    @Then("User success remove label to this card")
    public void userSuccessRemoveLabelToThisCard() {
        Assert.assertEquals("toggle multiple labels card is success",boardPage.getPopupNotif());
        Assert.assertFalse(WebElementUtils.isElementVisible(boardPage.labelTxtSectionCardDetail));
    }

    @And("User choose due date button")
    public void userChooseDueDateButton() {
        boardPage.clickDueDateButtonOnDetailCard();
    }

    @Then("User should be can see due date menu popup")
    public void userShouldBeCanSeeDueDateMenuPopup() {
        Assert.assertTrue(boardPage.dueDatePopOverMenuOnDetailCardDisplayed());
    }

    @When("User apply some due date on card")
    public void userApplySomeDueDateOnCard() throws InterruptedException {
        boardPage.inputTimeDueDateOnDetailCard();
        blastPage.clickDatePicker();
        boardPage.clickSaveDueDate();
    }

    @Then("User success apply due date on card")
    public void userSuccessApplyDueDateOnCard() {
        Assert.assertEquals("Update card is success",boardPage.getPopupNotif());
        String actualValue = boardPage.getValueDueDateApplied();
        System.out.println(actualValue);
        String expectedValue = boardPage.formatDueDateApplied();
        System.out.println(expectedValue);
        Assert.assertTrue(actualValue.contains(expectedValue));
    }

    @When("User remove some due date on card")
    public void userRemoveSomeDueDateOnCard() {
        boardPage.clickRemoveDueDate();
    }

    @Then("User success remove due date on card")
    public void userSuccessRemoveDueDateOnCard() {
        Assert.assertEquals("Update card is success",boardPage.getPopupNotif());
        Assert.assertFalse(WebElementUtils.isElementVisible(boardPage.valueDueDateApplied));
    }

    @When("User choose move button")
    public void userChooseMoveButton() {
        boardPage.clickMoveOnDetailCard();
    }

    @Then("User should be can see move card menu popup")
    public void userShouldBeCanSeeMoveCardMenuPopup() {
        Assert.assertTrue(boardPage.movePopUpMenuOnDetailCardDisplayed());
    }

    @When("User choose list board destination to move a card")
    public void userChooseListBoardDestinationToMoveACard() throws InterruptedException {
        boardPage.clickCloseDetailCard();
        boardPage.addSecondListBoard();
        boardPage.clickFirstCard();
        Assert.assertTrue(boardPage.cardMenuEditDisplayed());
        boardPage.clickMoveOnDetailCard();
        Assert.assertTrue(boardPage.movePopUpMenuOnDetailCardDisplayed());
        boardPage.clickFieldDestinationListBoard();
        listBoardName = boardPage.getValueListDestination();
        boardPage.selectDestinationListBoard();
        boardPage.clickOKMoveCard();
    }

    @Then("User success move some card")
    public void userSuccessMoveSomeCard() throws InterruptedException {
        Thread.sleep(3500);
        Assert.assertEquals("Success!",boardPage.getPopupNotif());
        System.out.println(listBoardName);
        System.out.println(boardPage.getListNameThatCardLocated());
        Assert.assertEquals(listBoardName,boardPage.getListNameThatCardLocated());
    }

    @When("User archive their card on the detail card")
    public void userArchiveTheirCardOnTheDetailCard() throws InterruptedException {
        boardPage.clickFirstCard();
        boardPage.clickArchiveCardButtonOnDetailCard();
    }

    @Then("User success archive their card")
    public void userSuccessArchiveTheirCard() throws InterruptedException {
        String actualValue = boardPage.getPopupNotif();
        System.out.println(actualValue);
        Assert.assertTrue(actualValue.contains("card has been moved to archived"));
    }

    @When("User search card name on archived items menu")
    public void userSearchCardNameOnArchivedItemsMenu() throws InterruptedException {
        boardPage.searchItems(DataInput.randomChar);
    }

    @And("User choose a card to restore that card")
    public void userChooseACardToRestoreThatCard() {
        boardPage.clickRestoreButton();
    }

    @Then("User success restore some card")
    public void userSuccessRestoreSomeCard() {
        Assert.assertEquals("Unarchiving card is success",boardPage.getPopupNotif());
        Assert.assertEquals(DataInput.randomChar, boardPage.getFirstCardValueName());
    }
}
