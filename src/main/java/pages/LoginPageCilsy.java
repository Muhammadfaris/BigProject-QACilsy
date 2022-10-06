package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonUtils;
import utils.DriverUtils;
import utils.WebElementUtils;

public class LoginPageCilsy {

    public LoginPageCilsy() {
        PageFactory.initElements(DriverUtils.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='LoginButton_LoginButton__3qKtx']")
    WebElement loginPage;
    @FindBy(xpath = "//div[@class='HomeSubNavHeader_title__text__3ITET']")
    WebElement homePage;
    @FindBy(xpath = "//div[@class='MuiBox-root css-r7q7qr']/h1[.='Please select a company']")
    WebElement txtSelectCompany;
    @FindBy(xpath = "//div[@class='MuiBox-root css-0']/h1[.='Sekolah QA']")
    WebElement chooseCompanyListSekolahQA;

    @FindBy(xpath = "//div[@class='NavHeader_companyNameSection__12MiY']/p[.='Sekolah QA']")
    WebElement sekolahQACompanyHomePage;

    @FindBy(xpath = "//div[@class='NavHeader_navMemberSection__ApwJH']")
    WebElement profileButton;

    @FindBy(xpath = "(//div[@class='UserMenuContainer_iconSection__item__2s2GH'])[2]")
    WebElement logoutButton;

    public boolean signInPageDisplayed(){
        WebElementUtils.waitForVisibleElement(loginPage);
        return loginPage.isDisplayed();
    }

    public void signInWithToken1(){
        CommonUtils.getTokenGoogleAccount1(DriverUtils.getDriver());
    }

    public void signInWithToken2(){
        CommonUtils.getTokenGoogleAccount2(DriverUtils.getDriver());
    }

    public boolean listCompanyDisplayed(){
        WebElementUtils.waitForVisibleElement(txtSelectCompany);
        return txtSelectCompany.isDisplayed();
    }

    public void clickListCompany(){
        WebElementUtils.waitElementClickable(chooseCompanyListSekolahQA);
        chooseCompanyListSekolahQA.click();
    }

    public boolean homePageDisplayed(){
        WebElementUtils.waitForVisibleElement(homePage);
        return homePage.isDisplayed();
    }

    public boolean homePageCompanySekolahQADisplayed(){
        WebElementUtils.waitForVisibleElement(sekolahQACompanyHomePage);
        return sekolahQACompanyHomePage.isDisplayed();
    }

    public void clickProfile(){
        WebElementUtils.waitForVisibleElement(profileButton);
        profileButton.click();
    }

    public void clickLogout() throws InterruptedException {
        Thread.sleep(1000);
        WebElementUtils.waitForVisibleElement(logoutButton);
        logoutButton.click();
    }





}
