package pages;

import data.DataInput;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DriverUtils;
import utils.WebElementUtils;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class GroupChatPage {

    public GroupChatPage() {
        PageFactory.initElements(DriverUtils.getDriver(), this);
    }

    @FindBy(xpath = "(//div[@class='BoxMenu_container__1flgD'])[1]")
    WebElement groupChatCardAction;

    @FindBy(xpath = "(//li[@class='MuiBreadcrumbs-li'])[3]")
    WebElement groupChatPage;

    @FindBy(xpath = "//div[@class='OverviewOptionPopUp_text__1pQoR']/p[.='Board']")
    WebElement dropDownListBoard;

    @FindBy(xpath = "//div[@class='fr-element fr-view']")
    WebElement inputChatField;

    @FindBy(xpath = "//div[@class='CreateMessage_send__2f1ZQ']")
    WebElement btnSendChat;

    @FindBy(xpath = "(//div[@class='Message_content__21YIN'])[1]")
    public static WebElement valueChat;

    @FindBy(xpath = "(//div[@class='fr-view'])[1]/p/a")
    public static WebElement valueAttributeChat;

    @FindBy(xpath = "(//div[@class='Message_iconOption__3F-Ru'])[1]")
    WebElement hiddenDeleteChatBtn;

    @FindBy(xpath = "//div[@class='MessageMenuPopUp_menu__1rkRG' and .='Delete Message']")
    WebElement deleteActionButtonMenu;

    @FindBy(xpath = "(//div[@class='infinite-scroll-component '])/div[1]//time")
    WebElement timeTxtChat;

    @FindBy(xpath = "//div[@class='Button_container__1WNuB' and .='Delete']")
    WebElement deleteFinalMessageBtn;

    @FindBy(xpath = "//div[@class='AttachFileContainer_container__3U9Wh']/input")
    WebElement btnUploadFile;

    @FindBy(xpath = "(//div[@class='Message_attachment__icon__2DYyN'])[1]/a")
    WebElement messageContentUploadFile;

    public void clickGroupChatCard(){
        WebElementUtils.waitElementClickable(groupChatCardAction);
        groupChatCardAction.click();
    }

    public boolean groupChatDisplayed() throws InterruptedException {
        Thread.sleep(2000);
        WebElementUtils.waitForVisibleElement(groupChatPage);
        return groupChatPage.isDisplayed();
    }

    public void clickDropDownListBoard(){
        WebElementUtils.waitForVisibleElement(dropDownListBoard);
        WebElementUtils.waitElementClickable(dropDownListBoard);
        dropDownListBoard.click();
    }

    public void sendingCharChat(){
        WebElementUtils.waitForVisibleElement(inputChatField);
        inputChatField.clear();
        inputChatField.sendKeys(DataInput.randomChar);
        btnSendChat.click();
    }

    public void sendingReplyCharChat(){
        WebElementUtils.waitForVisibleElement(inputChatField);
        inputChatField.clear();
        inputChatField.sendKeys(DataInput.randomChar2);
        btnSendChat.click();
    }

    public void sendingLinkChatWithoutSpace(){
        WebElementUtils.waitForVisibleElement(inputChatField);
        inputChatField.clear();
        inputChatField.sendKeys(DataInput.exampleLinkChat);
        btnSendChat.click();
    }

    public void sendingLinkChatWithSpace(){
        WebElementUtils.waitForVisibleElement(inputChatField);
        inputChatField.clear();
        inputChatField.sendKeys(DataInput.exampleLinkChatWithSpace);
        btnSendChat.click();
    }

    public String getValueChat() throws InterruptedException {
        Thread.sleep(2000);
//        WebElementUtils.waitForVisibleElement(valueChat);
        return valueChat.getText();
    }

    public void deleteMessage() throws InterruptedException {
        Thread.sleep(1000);
//        WebElementUtils.clickHiddenElement(hiddenDeleteChatBtn);
        WebElementUtils.waitForVisibleElement(timeTxtChat);
        timeTxtChat.click();
        WebElementUtils.waitForVisibleElement(hiddenDeleteChatBtn);
        hiddenDeleteChatBtn.click();
        WebElementUtils.waitForVisibleElement(deleteActionButtonMenu);
        deleteActionButtonMenu.click();
        WebElementUtils.waitForVisibleElement(deleteFinalMessageBtn);
        deleteFinalMessageBtn.click();
    }

    public void uploadPicture() throws InterruptedException {
        Thread.sleep(2000);
        btnUploadFile.sendKeys(DataInput.pictureAddress);
    }

    public void uploadFile() throws InterruptedException {
        Thread.sleep(2000);
        btnUploadFile.sendKeys(DataInput.fileDocumentAddress);
    }

    public void checkHrefLink(WebElement element) throws IOException, InterruptedException {
        String valueHref = element.getAttribute("href");
        System.out.println(valueHref);
        if (valueHref !=null){
            HttpURLConnection openLink = (HttpURLConnection) (new URL(valueHref).openConnection());
            openLink.setRequestMethod("HEAD");
            openLink.connect();
            Thread.sleep(1000);
            int responseCode = openLink.getResponseCode();
            System.out.println(responseCode);
        }
    }

    public void checkLinkAddressChat() throws IOException, InterruptedException {
        checkHrefLink(valueAttributeChat);
    }
    public void checkFileLinkChat() throws IOException, InterruptedException {
        checkHrefLink(messageContentUploadFile);
    }



}
