package stepDef;

import data.DataInput;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.BoardPage;
import pages.GroupChatPage;
import pages.HomePage;
import pages.LoginPageCilsy;

import javax.xml.crypto.Data;
import java.io.IOException;

public class GroupChatStepDef {

    GroupChatPage groupChatPage = new GroupChatPage();
    LoginPageCilsy loginPageCilsy = new LoginPageCilsy();
    BoardPage boardPage = new BoardPage();
    HomePage homePage =new HomePage();

    @Given("User navigates to the Team page")
    public void userNavigatesToTheTeamPage() {
        homePage.clickTeamGroup();
        Assert.assertTrue(homePage.teamPageDisplayed());
    }

    @When("User select Group Chat card")
    public void userSelectGroupChatCard() {
        groupChatPage.clickGroupChatCard();
    }

    @Then("User on the Group Chat page")
    public void verifyUserOnTheGroupChatPage() throws InterruptedException {
        Assert.assertTrue(groupChatPage.groupChatDisplayed());
    }
    @When("User navigates to Group Chat page")
    public void userNavigatesToGroupChatPage() throws InterruptedException {
        homePage.clickTeamGroup();
        Assert.assertTrue(homePage.teamPageDisplayed());
        groupChatPage.clickGroupChatCard();
        Assert.assertTrue(groupChatPage.groupChatDisplayed());
    }

    @When("User sending some chat")
    public void userSendingSomeChat() {
        groupChatPage.sendingCharChat();
    }

    @Then("User should be can see their chat section")
    public void userShouldBeCanSeeTheirChatSection() throws InterruptedException {
        if (groupChatPage.getValueChat() == DataInput.randomChar){
            Assert.assertEquals(DataInput.randomChar,groupChatPage.getValueChat());
        } else if (groupChatPage.getValueChat() == DataInput.exampleLinkChat) {
            Assert.assertEquals(DataInput.exampleLinkChat,groupChatPage.getValueChat());
        } else if (groupChatPage.getValueChat() == DataInput.exampleLinkChatWithSpace) {
            Assert.assertEquals(DataInput.exampleLinkChatWithSpace,groupChatPage.getValueChat());
        } else if (groupChatPage.getValueChat() == DataInput.randomChar2) {
            Assert.assertEquals(DataInput.randomChar2,groupChatPage.getValueChat());
        }
    }

    @When("User sending some link address without space at the end")
    public void userSendingSomeLinkAddress() {
        groupChatPage.sendingLinkChatWithoutSpace();
    }

    @Given("User logs in with another account")
    public void userLogsInWithAnotherAccount() throws InterruptedException {
        loginPageCilsy.clickProfile();
        loginPageCilsy.clickLogout();
        Assert.assertTrue(loginPageCilsy.signInPageDisplayed());
        loginPageCilsy.signInWithToken2();
        Assert.assertTrue(loginPageCilsy.listCompanyDisplayed());
        loginPageCilsy.clickListCompany();
        Assert.assertTrue(loginPageCilsy.homePageDisplayed());
        Assert.assertTrue(loginPageCilsy.homePageCompanySekolahQADisplayed());
    }

    @And("Some message came in form another user")
    public void someMessageCameInFormAnotherUser() throws InterruptedException {
        if (groupChatPage.getValueChat() == DataInput.randomChar){
            Assert.assertEquals(DataInput.randomChar,groupChatPage.getValueChat());
        } else if (groupChatPage.getValueChat() == DataInput.exampleLinkChat) {
            Assert.assertEquals(DataInput.exampleLinkChat,groupChatPage.getValueChat());
        }
    }

    @And("User reply that message")
    public void userReplyThatMessage() {
        groupChatPage.sendingReplyCharChat();
    }

    @When("User sending some link address with space at the end")
    public void userSendingSomeLinkAddressWithSpaceAtTheEnd() {
        groupChatPage.sendingLinkChatWithSpace();
    }

    @And("User can navigates to that link")
    public void userCanNavigatesToThatLink() throws InterruptedException, IOException {
        groupChatPage.checkLinkAddressChat();
    }

    @When("User delete their chat")
    public void userDeleteTheirChat() throws InterruptedException {
        groupChatPage.deleteMessage();
    }

    @Then("User success delete their message")
    public void userSuccessDeleteTheirMessage() throws InterruptedException {
        Assert.assertEquals("Delete group chat message success",boardPage.getPopupNotif());
        Assert.assertEquals("This message was deleted",groupChatPage.getValueChat());
    }

    @When("User sending attach some picture")
    public void userSendingAttachSomePicture() throws InterruptedException {
        groupChatPage.uploadPicture();
    }

    @Then("User can access their upload file")
    public void userCanAccessTheirUploadFile() throws IOException, InterruptedException {
        Assert.assertEquals("Upload attachments is success",boardPage.getPopupNotif());
        groupChatPage.checkFileLinkChat();
    }

    @When("User sending attach some file document")
    public void userSendingAttachSomeFileDocument() throws InterruptedException {
        groupChatPage.uploadFile();
    }

    @And("User choose Board")
    public void userChooseBoard() {
        groupChatPage.clickDropDownListBoard();
    }
}
