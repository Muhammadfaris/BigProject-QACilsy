package pages;

import data.DataInput;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DriverUtils;
import utils.WebElementUtils;

public class BoardPage {

    public BoardPage() {
        PageFactory.initElements(DriverUtils.getDriver(), this);
    }
    BlastPage blastPage = new BlastPage();

    @FindBy(xpath = "(//div[@class='BoxMenu_container__1flgD'])[4]")
    WebElement boardCardAction;

    @FindBy(xpath = "//div[@class='BreadcrumbContainer_separateRoute__26-Ut']/span[.='Kanban Board']")
    WebElement boardPage;

    @FindBy(xpath = "//li[@class='MuiBreadcrumbs-li'][2]/div/a")
    WebElement teamNameBreadCrumb;

    @FindBy(xpath = "//li[@class='MuiBreadcrumbs-li'][1]/div/a[.='Home']")
    WebElement homeBreadCrumb;

    @FindBy(xpath = "//div[@class='OverviewOptionButton_icon__23xgd']")
    WebElement dropDownNavButton;

    @FindBy(xpath = "//div[@class='OverviewOptionPopUp_text__1pQoR']/p[.='Overview']")
    WebElement dropDownListOverview;

    @FindBy(xpath = "//div[@class='OverviewOptionPopUp_text__1pQoR']/p[.='Group Chat']")
    WebElement dropDownListGroupChat;

    @FindBy(xpath = "//div[@class='OverviewOptionPopUp_text__1pQoR']/p[.='Blast']")
    WebElement dropDownListBlast;

    @FindBy(xpath = "//div[@class='GlobalActionButton_text__31ND7']/p[.='Archived Items']")
    WebElement btnArchivedItems;

    @FindBy(xpath = "//div[@class='ArchivedItemsMenu_header__1txSL']")
    WebElement archivedItemsMenu;

    @FindBy(css = "[data-testid='CloseIcon']")
    WebElement closeBtnMenuContainer;

    @FindBy(xpath = "//button[@class='btn btn-dark btn-sm']/div[.='Switch to lists']")
    WebElement switchToListBtn;

    @FindBy(xpath = "//button[@class='btn btn-dark btn-sm']/div[.='Switch to cards']")
    WebElement switchToCardBtn;

    @FindBy(xpath = "//div[@class='GlobalActionButton_text__31ND7']/p[.='Filter']")
    WebElement filterBtn;

    @FindBy(xpath = "//div[@class='FilterContainer_header__3CJf-']/h1")
    WebElement filterMenu;

    @FindBy(xpath = "//button[@class='btn btn-outline-dark btn-block btn-sm']/div/div[.='Add List']")
    WebElement addListBtn;

    @FindBy(xpath = "//div[@class='CreateListButton_inputComment__1uzpm']/form")
    WebElement formAddList;

    @FindBy(xpath = "//div[@class='CreateListButton_inputComment__1uzpm']/form/div/input")
    WebElement inputListName;

    @FindBy(xpath = "//button[@class='btn btn-success btn-sm']/div")
    WebElement btnCreateList;

    @FindBy(xpath = "(//div[@class='ListContainer_headerSection__title__3FFoT'])[1]/div")
    WebElement valueListFirstOrder;

    @FindBy(css = ".CreateListButton_icon__12EJS")
    WebElement btnCloseCreateList;

    @FindBy(xpath ="//div[@id='notistack-snackbar']")
    WebElement popUpNotification;

    @FindBy(xpath ="(//div[@class='RoundActionMenu_container__2ta8s'])[1]")
    WebElement listActionMenuBtnFirstOrder;

    @FindBy(xpath ="//div[@class='BoxPopOver_BoxPopOver__1vCj0 BoxPopOver_BoxPopOver__left__9KRmE']")
    WebElement popOverMenuListAction;

    @FindBy(css ="[data-testid='CloseIcon']")
    WebElement closeIconListActionMenu;

    @FindBy(xpath ="//div[@class='OverlayButton_box__2jFLd']/div[.='Archive This List']")
    WebElement archiveThisList;

    @FindBy(xpath ="//*[contains(text(),'list has been moved to archived')]")
    WebElement popUpSuccessArchiveList;

    @FindBy(xpath ="(//div[@class='ArchivedItemsLists_listName__3Wb-n'])[1]")
    WebElement valueArchivedListItems;

    @FindBy(xpath ="(//div[@class='ArchivedItemsLists_container__3XA4E'])[1]/div[2]/button")
    WebElement btnRestoreListBoard;

    //ini untuk card list urutan pertama
    @FindBy(xpath ="(//div[@class='ListContainer_ListContainer__buttonBottom__2kZAI'])[1]/a")
    WebElement addCard;

    @FindBy(xpath ="//div[@class='CreateCardForm_container__2ljHB']")
    WebElement formAddCard;

    @FindBy(xpath ="//input[@class='form-control']")
    WebElement inputNameCard;

    @FindBy(xpath ="//div[@class='Button_container__1WNuB']")
    WebElement btnCreateCard;

    //card list pertama
    @FindBy(xpath ="(//div[@class='SmallCard_SmallCard__xuek9'])[1]")
    WebElement createdCard;

    @FindBy(xpath ="//div[@class='CardDetailContainer_CardDetailContainer__smallSectionContainer__3qfM5']/" +
            "p[.='ADD TO CARD']")
    WebElement cardMenuEdit;

    @FindBy(xpath ="//button[@class='close']")
    WebElement btnCloseMedia;

    @FindBy(xpath ="//div[@class='ManageDesc_sectionEmptyDesc__md0ll']")
    WebElement notesInCardEdit;

    @FindBy(xpath ="//div[@class='fr-element fr-view']")
    WebElement inputFormEdit;

    @FindBy(xpath ="//button[@class='btn btn-success btn-sm']")
    WebElement saveBtnNotes;

    @FindBy(xpath ="//input[@class='Main_input__qq9k9 Main_secondary__2bXP3']")
    WebElement commentOnCard;

    @FindBy(xpath ="//div[@class='ManageDesc_sectionDesc__3SwZN']/div")
    WebElement valueNotesOnCard;

    @FindBy(xpath ="//div[@class='ManageDesc_editIcon__1I0bY']")
    WebElement editNotesBtn;

    @FindBy(xpath ="(//div[@class='More_container__2VGML'])[1]")
    WebElement threeDotsEditComment;

    @FindBy(xpath ="(//div[@class='CardDetailContainer_buttonAction__2Sfwo'])[2]")
    WebElement labelButtonOnDetailCard;

    @FindBy(xpath ="//div[@class='BoxPopOver_BoxPopOver__1vCj0']")
    WebElement labelPopOverMenu;

    @FindBy(xpath ="//div[@class='ToggleLabels_plusButton__3YgnQ']")
    WebElement addNewLabelPlusButton;

    @FindBy(xpath ="//div[@class='BoxPopOver_BoxPopOver__1vCj0']" +
            "/div[@class='ManageLabelsContainer_ManageLabelsContainer__Header__2ZJCk']")
    WebElement popOverNewLabelCreateMenu;

    @FindBy(xpath ="//div[@class='CreateLabel_sectionSmallTitle__2IayF'][1]/form/input")
    WebElement inputLabelName;

    @FindBy(xpath ="//div[@class='CreateLabel_CreateLabelContainer__body__1tydf']/div[5]")
    WebElement labelColorTurquoiseGreen;

    @FindBy(xpath ="//div[@class='CreateLabel_sectionFooter__3n5Ah']/button")
    WebElement createLabelButton;

    @FindBy(xpath ="//div[@class='ToggleLabels_ToggleLabelsContainer__body__18nDN']/div[last()]/div/div/p")
    WebElement valueNewLabel;

    @FindBy(xpath ="(//div[@class='CardDetailContainer_CardDetailContainer__smallSectionContainer__3qfM5'])[2]/p")
    public WebElement labelTxtSectionCardDetail;

    @FindBy(xpath ="//div[@class='ToggleLabels_ToggleLabelsContainer__body__18nDN']/div[last()]/div")
    WebElement lastLabelOrderThatExist;

    @FindBy(xpath ="//div[@class='ToggleLabels_sectionFooter__2b-PK']/button")
    WebElement applyLabelButton;

    @FindBy(xpath ="(//div[@class='CardDetailContainer_CardDetailContainer__smallSectionContainer__3qfM5'])[2]" +
            "/div[last()]")
    WebElement getLastLabelThatApply;

    @FindBy(xpath ="(//div[@class='CardDetailContainer_buttonAction__2Sfwo'])[3]")
    WebElement dueDateButtonOnDetailCard;

    @FindBy(xpath ="//div[@class='BoxPopOver_BoxPopOver__1vCj0']" +
            "/div[@class='ManageDueDateContainer_ManageDueDateContainer__Header__1cm-S']")
    WebElement dueDatePopOverMenuOnDetailCard;

    @FindBy(xpath ="(//input[@class='MuiInput-input MuiInputBase-input MuiInputBase-inputAdornedEnd css-mnn31'])[2]")
    WebElement inputTimeDueDate;

    @FindBy(xpath ="//div[@class='ManageDueDateContainer_footer__3YRVh']/button[.='Save']")
    WebElement saveDueDateButton;

    @FindBy(xpath ="//div[@class='ManageDueDateContainer_footer__3YRVh']/button[.='Remove']")
    WebElement removeDueDateButton;

    @FindBy(xpath ="//div[@class='DateBox_DateBox__3UL8M']/p")
    public WebElement valueDueDateApplied;

    @FindBy(xpath ="(//div[@class='CardDetailContainer_buttonAction__2Sfwo'])[5]")
    WebElement moveCardButton;

    @FindBy(xpath ="//div[@class='BoxPopOver_BoxPopOver__1vCj0']" +
            "/div[@class='ManageMoveCard_ManageMoveCard__Header___y0NJ']")
    WebElement moveCardPopUpMenu;

    @FindBy(xpath ="//div[@class='ManageMoveCard_listSection__2sf4E']/div[1]")
    WebElement fieldDestinationListBoard;

    @FindBy(xpath ="//div[@class='ListNameOption_mainSection__3QQi6']/div/div/div[2]")
    WebElement selectDestinationListBoard;

    @FindBy(xpath ="//div[@class='ManageMoveCard_footer__8rWfV']/button")
    WebElement moveOKButton;

    @FindBy(xpath ="//div[@class='CardDetailContainer_listAndTeamSection__1QmSD']/p/a[1]")
    WebElement listNameThatCardLocated;

    @FindBy(xpath ="(//div[@class='Button_container__1WNuB'])[7]")
    WebElement archiveCardButtonOnDetailCard;

    @FindBy(xpath ="(//div[@class='SmallCard_SmallCard__xuek9'])[1]/div[3]/h1")
    WebElement firstCardValueName;

    @FindBy(xpath ="//div[@class='ArchivedItemsMenu_search__1B_5_']/form/input")
    WebElement inputSearchArchivedItems;

    @FindBy(xpath ="//div[@class='ArchivedItemsCards_action__2AziP']")
    WebElement restoreButton;


    public void clickBoardCard(){
        WebElementUtils.waitElementClickable(boardCardAction);
        boardCardAction.click();
    }

    public boolean boardPageDisplayed() throws InterruptedException {
        Thread.sleep(1000);
        WebElementUtils.waitForVisibleElement(boardPage);
        return boardPage.isDisplayed();
    }

    public void clickTeamNameOnBoardBreadCrumb(){
        WebElementUtils.waitElementClickable(teamNameBreadCrumb);
        teamNameBreadCrumb.click();
    }

    public void clickHomeOnBoardBreadCrumb(){
        WebElementUtils.waitElementClickable(homeBreadCrumb);
        homeBreadCrumb.click();
    }

    public void clickDropDownButton(){
        WebElementUtils.waitElementClickable(dropDownNavButton);
        dropDownNavButton.click();
    }

    public boolean dropDownListAppeared(){
        WebElementUtils.waitForVisibleElement(dropDownListOverview);
        return dropDownListOverview.isDisplayed();
    }

    public void clickDropDownListOverview(){
        WebElementUtils.waitElementClickable(dropDownListOverview);
        dropDownListOverview.click();
    }
    public void clickDropDownListBlast(){
        WebElementUtils.waitForVisibleElement(dropDownListBlast);
        WebElementUtils.waitElementClickable(dropDownListBlast);
        dropDownListBlast.click();
    }
    public void clickDropDownListGroupChat(){
        WebElementUtils.waitForVisibleElement(dropDownListGroupChat);
        dropDownListGroupChat.click();
    }

    public void clickArchivedItems(){
        WebElementUtils.waitElementClickable(btnArchivedItems);
        btnArchivedItems.click();
    }

    public boolean archivedItemsMenuDisplayed(){
        WebElementUtils.waitForVisibleElement(archivedItemsMenu);
        return archivedItemsMenu.isDisplayed();
    }

    public String getValueArchivedListItems(){
        WebElementUtils.waitForVisibleElement(valueArchivedListItems);
        return valueArchivedListItems.getText() ;
    }

    public void clickRestoreListBoard(){
        WebElementUtils.waitForVisibleElement(btnRestoreListBoard);
        btnRestoreListBoard.click();
    }

    public void clickCloseContainer(){
        WebElementUtils.waitElementClickable(closeBtnMenuContainer);
        closeBtnMenuContainer.click();
    }

    public boolean btnSwitchToListDisplayed(){
        WebElementUtils.waitForVisibleElement(switchToListBtn);
        return switchToListBtn.isDisplayed();
    }

    public void clickSwitchToList(){
        WebElementUtils.waitElementClickable(switchToListBtn);
        switchToListBtn.click();
    }

    public boolean btnSwitchToCardDisplayed(){
        WebElementUtils.waitForVisibleElement(switchToCardBtn);
        return switchToCardBtn.isDisplayed();
    }

    public void clickSwitchToCard(){
        WebElementUtils.waitElementClickable(switchToCardBtn);
        switchToCardBtn.click();
    }

    public void clickFilterButton(){
        WebElementUtils.waitElementClickable(filterBtn);
        filterBtn.click();
    }

    public boolean filterMenuDisplayed(){
        WebElementUtils.waitForVisibleElement(filterMenu);
        return filterMenu.isDisplayed();
    }

    public void clickAddList() throws InterruptedException {
        WebElementUtils.waitForVisibleElement(addListBtn);
        addListBtn.click();
        Thread.sleep(1000);
    }

    public boolean formAddListDisplayed(){
        WebElementUtils.waitForVisibleElement(formAddList);
        return formAddList.isDisplayed();
    }

    public void inputListForm(){
        WebElementUtils.waitForVisibleElement(inputListName);
        inputListName.clear();
        inputListName.sendKeys(DataInput.randomChar);
    }

    public String getValueListFirstOrder(){
        WebElementUtils.waitForVisibleElement(valueListFirstOrder);
        return valueListFirstOrder.getText();
    }

    public void clickCreateList(){
        WebElementUtils.waitElementClickable(btnCreateList);
        btnCreateList.click();
    }
    public void clickCloseCreateList(){
        WebElementUtils.waitElementClickable(btnCloseCreateList);
        btnCloseCreateList.click();
    }

    public String getPopupNotif(){
        WebElementUtils.waitForVisibleElement(popUpNotification);
        return popUpNotification.getText();
    }

    public void clickThreeDotsListActionMenu(){
        WebElementUtils.waitForVisibleElement(listActionMenuBtnFirstOrder);
        listActionMenuBtnFirstOrder.click();
    }

    public boolean popOverMenuListActionDisplayed(){
        WebElementUtils.waitForVisibleElement(popOverMenuListAction);
        return popOverMenuListAction.isDisplayed();
    }

    public void clickClosePopOverListMenu(){
        WebElementUtils.waitForVisibleElement(closeIconListActionMenu);
        closeIconListActionMenu.click();
    }

    public void clickArchiveOnListActionMenu(){
        WebElementUtils.waitForVisibleElement(archiveThisList);
        archiveThisList.click();
    }

    public boolean popUpSuccessArchiveList(){
        WebElementUtils.waitForVisibleElement(popUpSuccessArchiveList);
        return popUpSuccessArchiveList.isDisplayed();
    }

    public void clickAddCard(){
        WebElementUtils.waitElementClickable(addCard);
        addCard.click();
    }

    public boolean formAddCardDisplayed(){
        WebElementUtils.waitForVisibleElement(formAddCard);
        return formAddCard.isDisplayed();
    }

    public void inputCardNameForm(){
        WebElementUtils.waitForVisibleElement(inputNameCard);
        inputNameCard.clear();
        inputNameCard.sendKeys(DataInput.randomChar);
    }

    public void clickCreateCard(){
        WebElementUtils.waitForVisibleElement(btnCreateCard);
        btnCreateCard.click();
    }
    public boolean cardHasCreated(){
        WebElementUtils.waitForVisibleElement(createdCard);
        return createdCard.isDisplayed();
    }

    public void clickFirstCard(){
        WebElementUtils.waitForVisibleElement(createdCard);
        createdCard.click();
    }

    public boolean cardMenuEditDisplayed(){
        WebElementUtils.waitForVisibleElement(cardMenuEdit);
        return cardMenuEdit.isDisplayed();
    }

    public void clickCloseDetailCard(){
        WebElementUtils.waitForVisibleElement(btnCloseMedia);
        btnCloseMedia.click();
    }

    public void clickNotesOnEditCard(){
        WebElementUtils.waitForVisibleElement(notesInCardEdit);
        notesInCardEdit.click();
    }

    public void makeSomeNotes(){
        WebElementUtils.waitForVisibleElement(inputFormEdit);
        inputFormEdit.clear();
        inputFormEdit.sendKeys(DataInput.randomChar);
    }

    public void clickSaveNotes(){
        WebElementUtils.waitForVisibleElement(saveBtnNotes);
        saveBtnNotes.click();
    }

    public void clickCommentOnEditCard(){
        WebElementUtils.waitForVisibleElement(commentOnCard);
        commentOnCard.click();
    }

    public void makeSomeComment(){
        WebElementUtils.waitForVisibleElement(inputFormEdit);
        inputFormEdit.clear();
        inputFormEdit.sendKeys(DataInput.randomChar);
    }

    public String getValueNotesOnCard(){
        WebElementUtils.waitForVisibleElement(valueNotesOnCard);
        return valueNotesOnCard.getText();
    }

    public void clickEditNotesBtn(){
        WebElementUtils.waitForVisibleElement(editNotesBtn);
        editNotesBtn.click();
    }

    public void clickThreeDotsEditComment(){
        WebElementUtils.waitForVisibleElement(threeDotsEditComment);
        threeDotsEditComment.click();
    }

    public void clickLabelButtonOnCardDetail(){
        WebElementUtils.waitForVisibleElement(labelButtonOnDetailCard);
        labelButtonOnDetailCard.click();
    }

    public boolean labelPopOverMenuDisplayed(){
        WebElementUtils.waitForVisibleElement(labelPopOverMenu);
        return labelPopOverMenu.isDisplayed();
    }
    public void clickLabelPlusButton(){
        WebElementUtils.waitForVisibleElement(addNewLabelPlusButton);
        addNewLabelPlusButton.click();
    }
    public boolean labelPopOverNewLabelMenuDisplayed(){
        WebElementUtils.waitForVisibleElement(popOverNewLabelCreateMenu);
        return popOverNewLabelCreateMenu.isDisplayed();
    }
    public void inputNewLabelName(){
        WebElementUtils.waitForVisibleElement(inputLabelName);
        inputLabelName.sendKeys(DataInput.randomChar2);
    }
    public void chooseLabelColor(){
        WebElementUtils.waitForVisibleElement(labelColorTurquoiseGreen);
        labelColorTurquoiseGreen.click();
    }
    public void clickCreateLabel(){
        WebElementUtils.waitForVisibleElement(createLabelButton);
        createLabelButton.click();
    }

    public String getValueNewLabel(){
        WebElementUtils.waitForVisibleElement(valueNewLabel);
        return valueNewLabel.getText();
    }

    public void clickLastLabelOrderThatExist(){
        WebElementUtils.waitForVisibleElement(lastLabelOrderThatExist);
        lastLabelOrderThatExist.click();
    }

    public void clickApplyLabel(){
        WebElementUtils.waitForVisibleElement(applyLabelButton);
        applyLabelButton.click();
    }

    public String getLastLabelThatApply(){
        WebElementUtils.waitForVisibleElement(getLastLabelThatApply);
        return getLastLabelThatApply.getText();
    }

    public void clickDueDateButtonOnDetailCard(){
        WebElementUtils.waitForVisibleElement(dueDateButtonOnDetailCard);
        dueDateButtonOnDetailCard.click();
    }

    public boolean dueDatePopOverMenuOnDetailCardDisplayed(){
        WebElementUtils.waitForVisibleElement(dueDatePopOverMenuOnDetailCard);
        return dueDatePopOverMenuOnDetailCard.isDisplayed();
    }

    public void inputTimeDueDateOnDetailCard(){
        WebElementUtils.waitForVisibleElement(inputTimeDueDate);
        WebElementUtils.deleteFieldWithBlock(inputTimeDueDate);
        inputTimeDueDate.sendKeys(DataInput.dueDateTimeOnCard);
    }

    public String getValueDueDateApplied(){
        WebElementUtils.waitForVisibleElement(valueDueDateApplied);
        return valueDueDateApplied.getText();
    }

    public String formatDueDateApplied(){
        String dateMonth =  blastPage.getNewFormatDate();
        String year = DataInput.dueDateManual.split("-")[2];
        String dateMonthYear = dateMonth+" "+year;
        return dateMonthYear+" "+DataInput.dueDateTime;
    }

    public void clickSaveDueDate(){
        WebElementUtils.waitForVisibleElement(saveDueDateButton);
        saveDueDateButton.click();
    }

    public void clickRemoveDueDate(){
        WebElementUtils.waitForVisibleElement(removeDueDateButton);
        removeDueDateButton.click();
    }

    public void clickMoveOnDetailCard(){
        WebElementUtils.waitForVisibleElement(moveCardButton);
        moveCardButton.click();
    }

    public boolean movePopUpMenuOnDetailCardDisplayed(){
        WebElementUtils.waitForVisibleElement(moveCardPopUpMenu);
        return moveCardPopUpMenu.isDisplayed();
    }

    public void clickFieldDestinationListBoard(){
        WebElementUtils.waitForVisibleElement(fieldDestinationListBoard);
        fieldDestinationListBoard.click();
    }

    public void selectDestinationListBoard(){
        WebElementUtils.waitForVisibleElement(selectDestinationListBoard);
        selectDestinationListBoard.click();
    }

    public String getValueListDestination(){
        WebElementUtils.waitForVisibleElement(selectDestinationListBoard);
        return selectDestinationListBoard.getText();
    }

    public void clickOKMoveCard(){
        WebElementUtils.waitForVisibleElement(moveOKButton);
        moveOKButton.click();
    }

    public String getListNameThatCardLocated(){
        WebElementUtils.waitForVisibleElement(listNameThatCardLocated);
        return listNameThatCardLocated.getText();
    }

    public void inputListForm2(){
        WebElementUtils.waitForVisibleElement(inputListName);
        inputListName.clear();
        inputListName.sendKeys(DataInput.randomChar2);
    }

    public void addSecondListBoard() throws InterruptedException {
        clickAddList();
        inputListForm2();
        clickCreateList();
        Thread.sleep(2000);
    }

    public void clickArchiveCardButtonOnDetailCard() throws InterruptedException {
        WebElementUtils.waitForVisibleElement(archiveCardButtonOnDetailCard);
        archiveCardButtonOnDetailCard.click();
        Thread.sleep(2000);
    }



    public String getFirstCardValueName(){
        WebElementUtils.waitForVisibleElement(firstCardValueName);
        return firstCardValueName.getText();
    }

    public void searchItems(String search) throws InterruptedException {
        WebElementUtils.waitForVisibleElement(inputSearchArchivedItems);
        inputSearchArchivedItems.sendKeys(search);
        Thread.sleep(2000);
    }

    public void clickRestoreButton(){
        WebElementUtils.waitForVisibleElement(restoreButton);
        restoreButton.click();
    }
}
