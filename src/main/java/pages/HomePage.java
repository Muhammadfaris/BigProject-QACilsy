package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DriverUtils;
import utils.WebElementUtils;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(DriverUtils.getDriver(), this);
    }

    // pilih team card
    @FindBy(xpath = "//div[@class='Card_text__22WoI']/h1[.='BigProject']")
    WebElement chooseGroupTeam;
    @FindBy(xpath = "//div[@class='GlobalActionButton_text__31ND7']")
    WebElement teamPage;


    public void clickTeamGroup(){
        WebElementUtils.waitElementClickable(chooseGroupTeam);
        chooseGroupTeam.click();
    }

    public boolean teamPageDisplayed(){
        WebElementUtils.waitForVisibleElement(teamPage);
        return teamPage.isDisplayed();
    }
}
