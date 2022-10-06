package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPageCilsy;

public class LoginStepDef {

    LoginPageCilsy loginPageCilsy = new LoginPageCilsy();

    @Given("User logs in with their credentials")
    public void userLogsInWithTheirCredentials() {
        Assert.assertTrue(loginPageCilsy.signInPageDisplayed());
        loginPageCilsy.signInWithToken1();
    }

    @When("User select existing company that already joined")
    public void userSelectExistingCompanyThatAlreadyJoined() {
        Assert.assertTrue(loginPageCilsy.listCompanyDisplayed());
        loginPageCilsy.clickListCompany();
    }

    @Then("Verify user on the Home page of the company")
    public void verifyUserOnTheHomePageOfTheCompany() {
        Assert.assertTrue(loginPageCilsy.homePageDisplayed());
        Assert.assertTrue(loginPageCilsy.homePageCompanySekolahQADisplayed());
    }
}
