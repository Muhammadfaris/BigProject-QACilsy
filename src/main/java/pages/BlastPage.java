package pages;

import data.DataInput;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DriverUtils;
import utils.WebElementUtils;

import javax.xml.crypto.Data;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class BlastPage {

    public BlastPage() {
        PageFactory.initElements(DriverUtils.getDriver(), this);
    }

    @FindBy(xpath = "(//div[@class='BoxMenu_container__1flgD'])[2]")
    WebElement blastCardAction;

    @FindBy(xpath = "(//li[@class='MuiBreadcrumbs-li'])[3]/div/div/span[.='Blast!']")
    WebElement blastPage;

    @FindBy(xpath = "//div[@class='GlobalActionButton_text__31ND7']/p")
    WebElement createBlastButton;

    @FindBy(xpath = "(//ol[@class='MuiBreadcrumbs-ol css-nhb8h9'])/li[last()]")
    WebElement createBlastPage;

    @FindBy(xpath = "//div[@class='CreateBlastPage_inputTitleSection__3vhfz']/textarea")
    WebElement inputTitleBlast;

    @FindBy(xpath = "//div[@class='fr-element fr-view']/p")
    WebElement inputDetailNotesBlast;

    @FindBy(xpath = "//button[@class='Main_container__3r1Cm']/div/h1[.='Cancel']")
    WebElement btnCancelCreateBlast;

    @FindBy(xpath = "(//button[@class='Main_container__3r1Cm'])[2]/div/h1")
    WebElement btnPublishCreateBlast;

    @FindBy(xpath = "(//div[@class='MuiSelect-select MuiSelect-standard " +
            "MuiInput-input MuiInputBase-input css-1cccqvr'])[1]")
    WebElement btnCompleteBlastType;

    @FindBy(xpath = "//ul[@class='MuiList-root MuiList-padding MuiMenu-list css-r8u8y9']/li[.='Auto complete']")
    WebElement autoCompleteTypeBlast;

    @FindBy(xpath = "//ul[@class='MuiList-root MuiList-padding MuiMenu-list css-r8u8y9']/li[.='Set due date manually']")
    WebElement manualCompleteTypeBlast;

    @FindBy(xpath = "(//div[@class='MuiFormControl-root css-13sljp9'])[2]")
    WebElement btnDueDateComplete;

    @FindBy(xpath = "//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiMenu-paper " +
            "MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation8 MuiPopover-paper css-177ic5c']/ul/li[1]")
    WebElement set1DaysCompleteBlastType;
    @FindBy(xpath = "//ul[@class='MuiList-root MuiList-padding MuiMenu-list css-r8u8y9']/li[.='3 Days from today']")
    WebElement set3DaysCompleteBlastType;
    @FindBy(xpath = "//ul[@class='MuiList-root MuiList-padding MuiMenu-list css-r8u8y9']/li[.='7 Days from today']")
    WebElement set7DaysCompleteBlastType;

    @FindBy(xpath = "//div[@class='Post_contentSection__header__date__2e_Ha']/p")
    WebElement autoCompleteTxtPublished;

    @FindBy(xpath = "(//div[@class='Post_contentSection__header__title__1uoy7'])[1]/div/h1")
    WebElement valueBlastContainerFirstOrder;

    @FindBy(xpath = "(//div[@class='Post_container__3xxgM'])[1]")
    WebElement blastPublishedFirstOrder;


    @FindBy(xpath = "//div[@class='MuiFormControl-root MuiTextField-root css-i44wyl']/div")
    WebElement manualFieldForm;

    @FindBy(xpath = "//div[@class='MuiFormControl-root MuiTextField-root css-i44wyl']/div/input")
    WebElement manualInputDate;

    @FindBy(xpath = "//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-slyssw']")
    WebElement btnCalendar;

    @FindBy(xpath = "//div[@class='MuiCalendarPicker-root css-1brzq0m']")
    WebElement calendarForm;

    @FindBy(xpath = "(//div[@class='css-1v994a0'])[1]")
    WebElement monthPick;

    @FindBy(xpath = "(//div[@class='css-1v994a0'])[2]")
    WebElement yearPick;

    @FindBy(xpath = "//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeStart" +
            " MuiIconButton-sizeSmall css-fp6ecq']")
    WebElement btnNextCalendar;

    @FindBy(xpath = "//div[@role='cell']/button")
    List<WebElement> dateListPick;

    @FindBy(xpath = "//span[@class='MuiSwitch-root MuiSwitch-sizeMedium css-ecvcn9']")
    WebElement privatePostSlider;

    @FindBy(css = ".MuiSvgIcon-fontSizeSmall")
    WebElement privatePostIcon;

    @FindBy(xpath = "//div[@class='GlobalActionButton_text__31ND7']")
    WebElement blastDetailPage;

    @FindBy(xpath = "//ol[@class='MuiBreadcrumbs-ol css-nhb8h9']/li[@class='MuiBreadcrumbs-li'][3]")
    WebElement blastsNameBreadcrumb;

    @FindBy(xpath = "//div[@class='More_container__2VGML']")
    WebElement meatballIconOnBlastDetailPage;

    @FindBy(xpath = "//div[@class='Basic_container__UtC8A']/div[1]")
    WebElement editOnDetailBlastPage;

    @FindBy(xpath = "//div[@class='Basic_container__UtC8A']/div[2]")
    WebElement archiveOnDetailBlastPage;

    @FindBy(xpath = "//div[@class='BreadcrumbContainer_separateRoute__26-Ut']")
    WebElement blastEditPage;

    @FindBy(xpath = "//div[@class='EditBlastPostPage_inputTitleSection__2211E']/textarea")
    WebElement inputTitleBlastOnEditPage;

    @FindBy(xpath = "//div[@class='EditBlastPostPage_selectDueDateOption__item__reset__2mDEq']/span")
    WebElement resetAutoCompleteDueDate;

    @FindBy(xpath = "//div[@class='ShowLimitMembers_container__1aumA']/div[last()]")
    WebElement memberBlastOrganizedBtn;

    @FindBy(xpath = "//div[@class='ManageSubscribersContainer_ManageSubscribersContainer__Title__1R7dy']")
    WebElement memberBlastOrganizedMenu;

    @FindBy(xpath = "//div[@class='MuiBox-root css-q5fqw0']")
    WebElement popUpArchiveDecision;

    @FindBy(xpath = "(//div[@class='MuiBox-root css-1lads1q'])[2]/button")
    WebElement btnArchivePopUp;

    @FindBy(xpath = "(//div[@class='MuiBox-root css-1lads1q'])[1]/button")
    WebElement btnCancelArchivePopUp;

    @FindBy(xpath = "//div[@class='PostBlastPage_archivedSection__3cJxy']/h1[.='This post is archived']")
    WebElement successArchiveBlastLabel;

    @FindBy(xpath = "//div[@class='Main_container__1eDyl']")
    WebElement commentBoxField;

    @FindBy(xpath = "//div[@class='fr-element fr-view']")
    WebElement commentBoxInput;

    @FindBy(xpath = "//button[@class='Main_container__3r1Cm'][2]")
    WebElement postSomeComment;

    @FindBy(xpath = "//button[@class='Main_container__3r1Cm'][1]")
    WebElement cancelPostSomeComment;

    @FindBy(xpath = "(//div[@class='CommentItem_commentTextContainer__8Gd1V'])[1]/div/p")
    WebElement getValueCommentBlast;

    @FindBy(xpath = "(//div[@class='CommentItem_discussSection__1_fte'])[1]/div/a")
    WebElement replyCommentBtn;

    @FindBy(xpath = "//div[@class='GlobalActionButton_text__31ND7']")
    WebElement replyCommentPage;

    @FindBy(xpath = "(//div[@class='CommentItem_commentTextContainer__8Gd1V'])[2]/div")
    WebElement resultReplyComment;

    @FindBy(xpath = "(//div[@class='More_container__2VGML'])[2]")
    WebElement threeDotsComment;

    @FindBy(xpath = "//div[@class='Item_container__3qBQE'][1]")
    WebElement editComment;

    @FindBy(xpath = "//div[@class='Item_container__3qBQE'][2]")
    WebElement deleteComment;

    @FindBy(xpath = "//div[@class='MuiBox-root css-1lads1q']/button[.='Delete']")
    WebElement okeDeleteCommentPopUp;

    @FindBy(xpath = "//div[@class='infiniteScroll']/p[.='No comments here yet...']")
    WebElement commentNull;

    @FindBy(xpath = "(//div[@class='fr-btn-grp fr-float-left'])[3]/button[4]")
    WebElement moreRichBtn;

    @FindBy(xpath = "//div[@class='fr-more-toolbar fr-expanded']/button[1]")
    WebElement imgBtn;
    @FindBy(xpath = "//div[@class='fr-form']/input")
    WebElement uploadFileInput;

    @FindBy(xpath = "//div[@class='fr-view']/p/img")
    WebElement valueAttributePicture;

    @FindBy(xpath = "(//div[@class='fr-view'])[2]/p/img")
    WebElement valueAttributePicture2;

    @FindBy(xpath = "(//div[@class='Box_DateBox__fI6QU Box_noClick__2_CPN'])[2][1]/p")
    WebElement dueDateOnBlastPage;



    public void clickBlastCard() throws InterruptedException {
        Thread.sleep(1000);
        WebElementUtils.waitElementClickable(blastCardAction);
        blastCardAction.click();
    }

    public boolean blastPageDisplayed() throws InterruptedException {
        Thread.sleep(2000);
        WebElementUtils.waitForVisibleElement(blastPage);
        WebElementUtils.waitForVisibleElement(createBlastButton);
        return blastPage.isDisplayed();
    }

    public void clickCreateBlast(){
        WebElementUtils.waitForVisibleElement(createBlastButton);
        createBlastButton.click();
    }

    public boolean blastEditMenuDisplayed(){
        return createBlastPage.isDisplayed();
    }

    public void clickCancelCreateBlast(){
        WebElementUtils.waitForVisibleElement(btnCancelCreateBlast);
        btnCancelCreateBlast.click();
    }

    public void clickPublishCreateBlast(){
        WebElementUtils.waitForVisibleElement(btnPublishCreateBlast);
        btnPublishCreateBlast.click();
    }

    public void inputTitleBlast() {
        WebElementUtils.waitForVisibleElement(inputTitleBlast);
        inputTitleBlast.click();
        inputTitleBlast.clear();
        inputTitleBlast.sendKeys(DataInput.randomChar);
    }
    public void inputNotesBlast(){
        WebElementUtils.waitForVisibleElement(inputDetailNotesBlast);
        inputDetailNotesBlast.click();
        inputDetailNotesBlast.clear();
        inputDetailNotesBlast.sendKeys(DataInput.randomChar2);
    }

    public String getValueBlastTitle(){
        WebElementUtils.waitForVisibleElement(valueBlastContainerFirstOrder);
        return valueBlastContainerFirstOrder.getText().trim();
    }

    public void clickBlastFirstOrder() throws InterruptedException {
        Thread.sleep(1000);
        WebElementUtils.waitForVisibleElement(blastPublishedFirstOrder);
        blastPublishedFirstOrder.click();
        Thread.sleep(1000);
    }

    public void scrollToUp() throws InterruptedException {
        WebElementUtils.scrollUp();
        Thread.sleep(1000);
    }


    public void clickCompleteType(){
        WebElementUtils.waitForVisibleElement(btnCompleteBlastType);
        btnCompleteBlastType.click();
    }
    public void chooseAutoComplete(){
        WebElementUtils.waitForVisibleElement(autoCompleteTypeBlast);
        autoCompleteTypeBlast.click();
    }

    public void chooseManualComplete(){
        WebElementUtils.waitForVisibleElement(manualCompleteTypeBlast);
        manualCompleteTypeBlast.click();
    }

    public void clickDueDateType(){
        WebElementUtils.waitForVisibleElement(btnDueDateComplete);
        btnDueDateComplete.click();
    }
    public void chooseDayDueDate(int dueDate){
        if (dueDate==1){
            WebElementUtils.waitForVisibleElement(set1DaysCompleteBlastType);
            set1DaysCompleteBlastType.click();
        } else if (dueDate==3) {
            WebElementUtils.waitForVisibleElement(set3DaysCompleteBlastType);
            set3DaysCompleteBlastType.click();
        } else if (dueDate==7) {
            WebElementUtils.waitForVisibleElement(set7DaysCompleteBlastType);
            set7DaysCompleteBlastType.click();
        }
    }

    public boolean autoCompleteBlastPublishDisplayed(){
        WebElementUtils.waitForVisibleElement(autoCompleteTxtPublished);
        return autoCompleteTxtPublished.isDisplayed();
    }

    public void clickPrivate(){
        WebElementUtils.waitForVisibleElement(privatePostSlider);
        privatePostSlider.click();
    }

    public boolean privatePostIconDisplayed(){
        WebElementUtils.waitForVisibleElement(privatePostIcon);
        return privatePostIcon.isDisplayed();
    }

    public boolean blastDetailPage() throws InterruptedException {
        Thread.sleep(1000);
        WebElementUtils.waitForVisibleElement(blastDetailPage);
        return blastDetailPage.isDisplayed();
    }
    public void clickBlastNameBreadcrumb(){
        WebElementUtils.waitForVisibleElement(blastsNameBreadcrumb);
        blastsNameBreadcrumb.click();
    }

    public void clickMeatballIconOnBlastDetail(){
        WebElementUtils.waitForVisibleElement(meatballIconOnBlastDetailPage);
        meatballIconOnBlastDetailPage.click();
    }

    public void clickEditOnBlastDetailPage(){
        WebElementUtils.waitForVisibleElement(editOnDetailBlastPage);
        editOnDetailBlastPage.click();
    }

    public void clickArchiveOnBlastDetailPage(){
        WebElementUtils.waitForVisibleElement(archiveOnDetailBlastPage);
        archiveOnDetailBlastPage.click();
    }

    public boolean editBlastPageDisplayed() throws InterruptedException {
        Thread.sleep(1000);
        WebElementUtils.waitForVisibleElement(blastEditPage);
        return blastEditPage.isDisplayed();
    }

    public void inputTitleBlastonEditPage(){
        WebElementUtils.waitForVisibleElement(inputTitleBlastOnEditPage);
        inputTitleBlastOnEditPage.click();
        inputTitleBlastOnEditPage.clear();
        inputTitleBlastOnEditPage.sendKeys(DataInput.randomChar);
    }

    public void clickResetAutoCompleDueDate(){
        WebElementUtils.waitForVisibleElement(resetAutoCompleteDueDate);
        resetAutoCompleteDueDate.click();
    }

    public void clickMemberBlastOrganizedBtn(){
        WebElementUtils.waitForVisibleElement(memberBlastOrganizedBtn);
        memberBlastOrganizedBtn.click();
    }

    public boolean menuMemberBlastOrganizedDisplayed(){
        WebElementUtils.waitForVisibleElement(memberBlastOrganizedMenu);
        return memberBlastOrganizedMenu.isDisplayed();
    }

    public boolean popUpArchiveDecisionDisplayed(){
        WebElementUtils.waitForVisibleElement(popUpArchiveDecision);
        return popUpArchiveDecision.isDisplayed();
    }

    public void clickArchiveBlastPopUp(){
        WebElementUtils.waitForVisibleElement(btnArchivePopUp);
        btnArchivePopUp.click();
    }

    public void clickCancelArchiveBlastPopUp(){
        WebElementUtils.waitForVisibleElement(btnCancelArchivePopUp);
        btnCancelArchivePopUp.click();
    }

    public boolean labelArchiveSuccess(){
        WebElementUtils.waitForVisibleElement(successArchiveBlastLabel);
        return successArchiveBlastLabel.isDisplayed();
    }

    public void makeSomeCommentOnBlast(){
        WebElementUtils.waitForVisibleElement(commentBoxField);
        commentBoxField.click();
        WebElementUtils.waitForVisibleElement(commentBoxInput);
        commentBoxInput.clear();
        commentBoxInput.sendKeys(DataInput.randomChar);
    }

    public void clickPostComment(){
        WebElementUtils.waitForVisibleElement(postSomeComment);
        postSomeComment.click();
    }

    public void clickCancelPostComment(){
        WebElementUtils.waitForVisibleElement(cancelPostSomeComment);
        cancelPostSomeComment.click();
    }

    public String getValueComment(){
        WebElementUtils.waitForVisibleElement(getValueCommentBlast);
        return getValueCommentBlast.getText();
    }

    public void clickReplyComment(){
        WebElementUtils.waitForVisibleElement(replyCommentBtn);
        replyCommentBtn.click();
    }

    public boolean replyCommentPageDisplayed() throws InterruptedException {
        Thread.sleep(1000);
        WebElementUtils.waitForVisibleElement(replyCommentPage);
        return replyCommentPage.isDisplayed();
    }

    public String getReplyComment() throws InterruptedException {
        Thread.sleep(1000);
        WebElementUtils.waitForVisibleElement(resultReplyComment);
        return resultReplyComment.getText();
    }

    public void clickThreeDotsComment(){
        WebElementUtils.waitForVisibleElement(threeDotsComment);
        threeDotsComment.click();
    }

    public void clickEditComment(){
        WebElementUtils.waitForVisibleElement(editComment);
        editComment.click();
    }

    public void makeSomeEditCommentOnBlast() throws InterruptedException {
        WebElementUtils.waitForVisibleElement(commentBoxInput);
        commentBoxInput.clear();
        Thread.sleep(500);
        commentBoxInput.sendKeys(DataInput.randomChar);
    }

    public void clickDeleteComment(){
        WebElementUtils.waitForVisibleElement(deleteComment);
        deleteComment.click();
    }

    public void clickOkeDeleteCommentPopUP(){
        WebElementUtils.waitForVisibleElement(okeDeleteCommentPopUp);
        okeDeleteCommentPopUp.click();
    }

    public boolean commentNullDisplayed(){
        return commentNull.isDisplayed();
    }

    public void makeSomePictureUploadOnComment() throws InterruptedException {
        WebElementUtils.waitForVisibleElement(commentBoxField);
        commentBoxField.click();
        WebElementUtils.waitForVisibleElement(commentBoxInput);
        moreRichBtn.click();
        WebElementUtils.waitForVisibleElement(imgBtn);
        imgBtn.click();
        Thread.sleep(1000);
        uploadFileInput.sendKeys(DataInput.pictureAddress);
        Thread.sleep(1000);
    }

    public void attachPictureFileOnCreateBlast() throws InterruptedException {
        WebElementUtils.waitForVisibleElement(moreRichBtn);
        moreRichBtn.click();
        WebElementUtils.waitForVisibleElement(imgBtn);
        imgBtn.click();
        Thread.sleep(500);
        uploadFileInput.sendKeys(DataInput.pictureAddress);
        Thread.sleep(1000);
    }

    public void checkLink(WebElement element) throws IOException, InterruptedException {
        String valueAttribute = element.getAttribute("src");
        System.out.println(valueAttribute);
        if (valueAttribute !=null){
            HttpURLConnection openLink = (HttpURLConnection) (new URL(valueAttribute).openConnection());
            openLink.setRequestMethod("HEAD");
            openLink.connect();
            Thread.sleep(1000);
            int responseCode = openLink.getResponseCode();
            System.out.println(responseCode);
        }
    }

    public void checkPictureSrc() throws IOException, InterruptedException {
        Thread.sleep(1000);
        checkLink(valueAttributePicture);
        Thread.sleep(1000);
    }

    public void checkPictureSrc2() throws IOException, InterruptedException {
        Thread.sleep(1000);
        checkLink(valueAttributePicture2);
        Thread.sleep(1000);
    }

    public void clickDatePicker() throws InterruptedException {
        btnCalendar.click();
        WebElementUtils.waitForVisibleElement(calendarForm);
        clickDateUtil(DataInput.dueDateManual);
    }

    public void clickDateUtil(String date) throws InterruptedException {
        String edate = date.split("-")[0];
        String emonth = date.split("-")[1];
        String eyear = date.split("-")[2];
//        System.out.println(eday+"*"+emonth+"*"+eyear);

        String pmonth = monthPick.getText().trim();
        String pyear = yearPick.getText().trim();

        while ((!pmonth.equals(emonth))||(!pyear.equals(eyear))){
            btnNextCalendar.click();
            pmonth = monthPick.getText().trim();
            pyear = yearPick.getText().trim();
        }
        for(WebElement e : dateListPick){
            if (e.getText().trim().equals(edate)){
                e.click();
                break;
            }
        }
    }

    public String getNewFormatInputDueDate(){
        String month = DataInput.dueDateManual.split("-")[1];

        if (month.equals("January")){
            month = "Jan";
        } else if (month.equals("February")) {
            month = "Feb";
        } else if (month.equals("March")) {
            month = "Mar";
        } else if (month.equals("April")) {
            month = "Apr";
        } else if (month.equals("May")) {
            month = "May";
        } else if (month.equals("June")) {
            month = "Jun";
        } else if (month.equals("July")) {
            month = "Jul";
        } else if (month.equals("August")) {
            month = "Aug";
        } else if (month.equals("September")) {
            month = "Sep";
        } else if (month.equals("October")) {
            month = "Oct";
        } else if (month.equals("November")) {
            month = "Nov";
        } else if (month.equals("December")) {
            month = "Dec";
        }
        return month;
    }

    public String getNewFormatDate(){
        String date = DataInput.dueDateManual.split("-")[0];
        String newMonth = getNewFormatInputDueDate();
        return newMonth+" "+date;
    }

    public String getDueDate(){
        WebElementUtils.waitForVisibleElement(dueDateOnBlastPage);
        return dueDateOnBlastPage.getText();
    }











}
