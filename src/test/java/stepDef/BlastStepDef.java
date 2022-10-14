package stepDef;

import data.DataInput;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.BlastPage;
import pages.BoardPage;
import pages.GroupChatPage;
import pages.HomePage;
import utils.WebElementUtils;

import java.io.IOException;

public class BlastStepDef {

    BlastPage blastPage = new BlastPage();
    HomePage homePage = new HomePage();
    BoardPage boardPage = new BoardPage();

    @When("User select Blast card")
    public void userSelectBlastCard() throws InterruptedException {
        blastPage.clickBlastCard();
    }

    @Then("User on the Blast page")
    public void verifyUserOnTheBlastPage() throws InterruptedException {
        Assert.assertTrue(blastPage.blastPageDisplayed());
    }


    @Given("User navigates to blast page")
    public void userNavigatesToBlastPage() throws InterruptedException {
        homePage.clickTeamGroup();
        Assert.assertTrue(homePage.teamPageDisplayed());
        blastPage.clickBlastCard();
        Assert.assertTrue(blastPage.blastPageDisplayed());
    }

    @When("User choose create blast")
    public void userChooseCreateBlast() {
        blastPage.clickCreateBlast();
    }

    @Then("User on the form create blast")
    public void userOnTheFormCreateBlast() {
        Assert.assertTrue(blastPage.blastEditMenuDisplayed());
    }

    @When("User want to cancel create blast")
    public void userWantToCancelCreateBlast() {
        blastPage.clickCancelCreateBlast();
    }

    @When("User submit blank form create blast")
    public void userSubmitBlankFormCreateBlast() {
        blastPage.clickPublishCreateBlast();
    }

    @Then("User should see error notification")
    public void userShouldSeeErrorNotification() {
        Assert.assertEquals("Field parameter not complete.",boardPage.getPopupNotif());
    }

    @When("User didnt fill the title of form to create blast")
    public void userDidntFillTheTitleOfFormToCreateBlast() {
        blastPage.inputNotesBlast();
        blastPage.clickPublishCreateBlast();
    }

    @Given("User navigates to form create blast page")
    public void userNavigatesToFormCreateBlastPage() throws InterruptedException {
        homePage.clickTeamGroup();
        Assert.assertTrue(homePage.teamPageDisplayed());
        blastPage.clickBlastCard();
        Assert.assertTrue(blastPage.blastPageDisplayed());
        blastPage.clickCreateBlast();
        Assert.assertTrue(blastPage.blastEditMenuDisplayed());
    }

    @Then("User success create blast with autocomplete due date")
    public void userSuccessCreateBlastWithAutocompleteDueDate() {
        Assert.assertEquals("Create post successful",boardPage.getPopupNotif());
        Assert.assertEquals(DataInput.randomChar,blastPage.getValueBlastTitle());
        Assert.assertTrue(blastPage.autoCompleteBlastPublishDisplayed());
    }

    @And("User attach some picture file on the blast content")
    public void userAttachSomePictureFileOnTheBlastContent() throws InterruptedException {
        blastPage.attachPictureFileOnCreateBlast();
    }

    @Then("User success create blast with attach picture file")
    public void userSuccessCreateBlastWithAttachPictureFile() throws IOException, InterruptedException {
        Assert.assertEquals("Create post successful",boardPage.getPopupNotif());
        Assert.assertEquals(DataInput.randomChar,blastPage.getValueBlastTitle());
        Assert.assertTrue(blastPage.autoCompleteBlastPublishDisplayed());
        boardPage.clickTeamNameOnBoardBreadCrumb();
        blastPage.clickBlastCard();
        blastPage.clickBlastFirstOrder();
        blastPage.checkPictureSrc();
    }

    @When("User set due date blast autocomplete in {int} day")
    public void userSetDueDateBlastAutocompleteInDay(int dueDate) {
        blastPage.inputTitleBlast();
        blastPage.inputNotesBlast();
        blastPage.clickCompleteType();
        blastPage.chooseAutoComplete();
        blastPage.clickDueDateType();
        blastPage.chooseDayDueDate(dueDate);
    }

    @And("User publish their blast")
    public void userPublishTheirBlast() {
        blastPage.clickPublishCreateBlast();
    }

    @Then("User should see new blast")
    public void userShouldSeeNewBlast() {
        Assert.assertEquals(DataInput.randomChar,blastPage.getValueBlastTitle());
    }

//    @When("User set due date blast with manual date input")
//    public void userSetDueDateBlastWithManualDateInput() throws InterruptedException {
//        blastPage.inputTitleBlast();
//        blastPage.inputNotesBlast();
//        blastPage.clickCompleteType();
//        blastPage.chooseManualComplete();
//        blastPage.setDueDateManualInput();
//    }

    @Then("User success create blast with manual due date")
    public void userSuccessCreateBlastWithManualDueDate() {
        Assert.assertEquals("Create post successful",boardPage.getPopupNotif());
        Assert.assertEquals(DataInput.randomChar,blastPage.getValueBlastTitle());
        Assert.assertEquals(blastPage.getNewFormatDate(),blastPage.getDueDate());
    }

    @When("User set manual due date by datepicker")
    public void userSetManualDueDateByDatepicker() throws InterruptedException {
        blastPage.inputTitleBlast();
        blastPage.inputNotesBlast();
        blastPage.clickCompleteType();
        blastPage.chooseManualComplete();
        blastPage.clickDatePicker();
    }

    @And("User choose private type post")
    public void userChoosePrivateTypePost() {
        blastPage.clickPrivate();
    }

    @Then("User success create private blast")
    public void userSuccessCreatePrivateBlast() {
        Assert.assertEquals("Create post successful",boardPage.getPopupNotif());
        Assert.assertEquals(DataInput.randomChar,blastPage.getValueBlastTitle());
        Assert.assertTrue(blastPage.privatePostIconDisplayed());
    }


    @When("User choose blast that has been published")
    public void userChooseBlastThatHasBeenPublished() throws InterruptedException {
        blastPage.clickBlastFirstOrder();
    }

    @Then("User on the blast detail")
    public void userOnTheBlastDetail() throws InterruptedException {
        Assert.assertTrue(blastPage.blastDetailPage());
    }

    @When("User choose blast navigation name")
    public void userChooseBlastNavigationName() {
        blastPage.clickBlastNameBreadcrumb();
    }

    @Given("User navigates to blast detail page")
    public void userNavigatesToBlastDetailPage() throws InterruptedException {
        homePage.clickTeamGroup();
        Assert.assertTrue(homePage.teamPageDisplayed());
        blastPage.clickBlastCard();
        Assert.assertTrue(blastPage.blastPageDisplayed());
        blastPage.clickBlastFirstOrder();
        Assert.assertTrue(blastPage.blastDetailPage());
    }

    @When("User choose three dots icon")
    public void userChooseThreeDotsIcon() {
        blastPage.clickMeatballIconOnBlastDetail();
    }

    @And("User choose edit")
    public void userChooseEdit() {
        blastPage.clickEditOnBlastDetailPage();
    }

    @Then("User on the form edit blast page")
    public void userOnTheFormEditBlastPage() throws InterruptedException {
        Assert.assertTrue(blastPage.editBlastPageDisplayed());
    }

    @Given("User navigates to form edit blast page")
    public void userNavigatesToFormEditBlastPage() throws InterruptedException {
        homePage.clickTeamGroup();
        Assert.assertTrue(homePage.teamPageDisplayed());
        blastPage.clickBlastCard();
        Assert.assertTrue(blastPage.blastPageDisplayed());
        blastPage.clickBlastFirstOrder();
        Assert.assertTrue(blastPage.blastDetailPage());
        blastPage.clickMeatballIconOnBlastDetail();
        blastPage.clickEditOnBlastDetailPage();
        Assert.assertTrue(blastPage.editBlastPageDisplayed());
    }

    @When("User edit their blast content")
    public void userEditTheirBlastContent() {
        blastPage.inputTitleBlastonEditPage();
        blastPage.inputNotesBlast();
    }

    @And("Edit due date complete with {int} days autocomplete")
    public void editDueDateCompleteWithDaysAutocomplete(int dueDate) {
        blastPage.clickCompleteType();
        blastPage.chooseAutoComplete();
        blastPage.clickResetAutoCompleDueDate();
        blastPage.clickDueDateType();
        blastPage.chooseDayDueDate(dueDate);
    }


    @Then("User success edit blast with autocomplete due date")
    public void userSuccessEditBlastWithAutocompleteDueDate() throws InterruptedException {
        Assert.assertEquals("Update post successful",boardPage.getPopupNotif());
        Assert.assertTrue(blastPage.editBlastPageDisplayed());
        blastPage.clickBlastNameBreadcrumb();
        Assert.assertEquals(DataInput.randomChar,blastPage.getValueBlastTitle());
        Assert.assertTrue(blastPage.autoCompleteBlastPublishDisplayed());
    }

    @Then("User success edit blast with private blast")
    public void userSuccessEditBlastWithPrivateBlast() throws InterruptedException {
        Assert.assertEquals("Update post successful",boardPage.getPopupNotif());
        Assert.assertTrue(blastPage.editBlastPageDisplayed());
        blastPage.clickBlastNameBreadcrumb();
        Assert.assertTrue(blastPage.blastPageDisplayed());
        Assert.assertEquals(DataInput.randomChar,blastPage.getValueBlastTitle());
        Assert.assertTrue(blastPage.privatePostIconDisplayed());
    }

    @When("User choose member that want to be notified")
    public void userChooseMemberThatWantToBeNotified() {
        blastPage.clickMemberBlastOrganizedBtn();
    }

    @Then("User on the form add or remove member menu")
    public void userOnTheFormAddRemoveMemberMenu() {
        Assert.assertTrue(blastPage.menuMemberBlastOrganizedDisplayed());
    }

    @And("User choose archive")
    public void userChooseArchive() {
        blastPage.clickArchiveOnBlastDetailPage();
    }

    @And("User submit the archive popup")
    public void userSubmitTheArchivePopup() {
        Assert.assertTrue(blastPage.popUpArchiveDecisionDisplayed());
        blastPage.clickArchiveBlastPopUp();
    }

    @Then("User success archive a blast")
    public void userSuccessArchiveABlast() {
        Assert.assertEquals("Archive Post successful",boardPage.getPopupNotif());
        Assert.assertTrue(blastPage.labelArchiveSuccess());
    }

    @And("User cancel submit the archive popup")
    public void userCancelSubmitTheArchivePopup() {
        Assert.assertTrue(blastPage.popUpArchiveDecisionDisplayed());
        blastPage.clickCancelArchiveBlastPopUp();
    }

    @When("User make a comment on comment box")
    public void userMakeACommentOnCommentBox() {
        blastPage.makeSomeCommentOnBlast();
    }

    @Then("User success make a comment on blast")
    public void userSuccessMakeACommentOnBlast() {
        Assert.assertEquals("Create comment on blast post successful",boardPage.getPopupNotif());
        Assert.assertEquals(DataInput.randomChar,blastPage.getValueComment());
    }

    @And("User post that comment")
    public void userPostThatComment() throws InterruptedException {
        blastPage.clickPostComment();
        Thread.sleep(700);
    }

    @And("User cancel that comment")
    public void userCancelThatComment() {
        blastPage.clickCancelPostComment();
    }

    @When("User choose to reply some comment")
    public void userChooseToReplySomeComment() {
        blastPage.clickReplyComment();
    }

    @Then("User on the reply comment page")
    public void userOnTheReplyCommentPage() throws InterruptedException {
        Assert.assertTrue(blastPage.replyCommentPageDisplayed());
    }

    @Given("User navigates to reply comment page")
    public void userNavigatesToReplyCommentPage() throws InterruptedException {
        homePage.clickTeamGroup();
        Assert.assertTrue(homePage.teamPageDisplayed());
        blastPage.clickBlastCard();
        Assert.assertTrue(blastPage.blastPageDisplayed());
        blastPage.clickBlastFirstOrder();
        Assert.assertTrue(blastPage.blastDetailPage());
        blastPage.clickReplyComment();
        Assert.assertTrue(blastPage.replyCommentPageDisplayed());
    }

    @Then("User success reply a comment")
    public void userSuccessReplyAComment() throws InterruptedException {
        Assert.assertEquals("Create discussion on post comment successful",boardPage.getPopupNotif());
        Assert.assertEquals(DataInput.randomChar,blastPage.getReplyComment());

    }

    @When("User want to edit their comment")
    public void userWantToEditTheirComment() {
        blastPage.clickThreeDotsComment();
        blastPage.clickEditComment();
    }

    @Then("User success edit reply comment")
    public void userSuccessEditReplyComment() throws InterruptedException {
        Assert.assertEquals("Update discussion on blast comment successful",boardPage.getPopupNotif());
        Assert.assertEquals(DataInput.randomChar,blastPage.getReplyComment());
    }

    @And("User edit their comment")
    public void userEditTheirComment() throws InterruptedException {
        blastPage.makeSomeEditCommentOnBlast();
    }

    @When("User delete their comment")
    public void userDeleteTheirComment() {
        blastPage.clickThreeDotsComment();
        blastPage.clickDeleteComment();
        blastPage.clickOkeDeleteCommentPopUP();
    }

    @Then("User success delete reply comment")
    public void userSuccessDeleteReplyComment() throws InterruptedException {
        Assert.assertEquals("Delete discussion on comment successful",boardPage.getPopupNotif());
        Assert.assertTrue(blastPage.commentNullDisplayed());
    }

    @Then("User success reply a comment with picture")
    public void userSuccessReplyACommentWithPicture() {
        Assert.assertEquals("Create discussion on post comment successful",boardPage.getPopupNotif());
    }

    @When("User send picture on the comment")
    public void userSendPictureOnTheComment() throws InterruptedException {
        blastPage.makeSomePictureUploadOnComment();
    }

    @Then("User success upload picture file on comment")
    public void userSuccessUploadPictureFileOnComment() {
        Assert.assertEquals("Create comment on blast post successful",boardPage.getPopupNotif());
    }

    @Then("User success delete a comment")
    public void userSuccessDeleteAComment() {
        Assert.assertEquals("Delete comment on blast post successful",boardPage.getPopupNotif());
    }

    @Then("User success edit a comment")
    public void userSuccessEditAComment() {
        Assert.assertEquals("Update comment on blast post successful",boardPage.getPopupNotif());
        Assert.assertEquals(DataInput.randomChar,blastPage.getValueComment());
    }


    @And("Edit due date with manual due date by datepicker")
    public void editDueDateWithManualDueDateByDatepicker() throws InterruptedException {
        blastPage.clickCompleteType();
        blastPage.chooseManualComplete();
        blastPage.clickDatePicker();
    }

    @Then("User success edit blast with manual due date")
    public void userSuccessEditBlastWithManualDueDate() throws InterruptedException {
        Assert.assertEquals("Update post successful",boardPage.getPopupNotif());
        Assert.assertTrue(blastPage.editBlastPageDisplayed());
        blastPage.clickBlastNameBreadcrumb();
        Assert.assertTrue(blastPage.blastPageDisplayed());
        Assert.assertEquals(DataInput.randomChar,blastPage.getValueBlastTitle());
        Assert.assertEquals(blastPage.getNewFormatDate(),blastPage.getDueDate());
    }
}
