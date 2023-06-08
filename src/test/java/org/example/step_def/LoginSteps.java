package org.example.step_def;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pages.LoginPage;

public class LoginSteps {
LoginPage loginPage=new LoginPage();
    @Given("^I am on homepage$")
    public void i_am_on_homepage() throws Throwable {

    }
    @When("^I click on login btn on homepage$")
    public void i_click_on_login_btn_on_homepage() throws Throwable {
        loginPage.clickOnLoginBtn();    }
    @And("^I enter username \"([^\"]*)\"$")
    public void iEnterUsername(String username) throws Throwable {
        loginPage.enterUserName(username);
    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password) throws Throwable {
        loginPage.enterPassword(password);
    }
    @And("^I click on login btn$")
    public void i_click_on_login_btn () throws Throwable {
        loginPage.enterLogin();
    }
    @Then("^I should see logout btn$")
    public void iShouldSeeLogoutBtn () {
        loginPage.visibleLogout();
    }
}

