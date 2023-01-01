package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class LoginStepDefs {

    LoginPage loginPage = new LoginPage();
    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));
        loginPage.signInNavButton.click();
    }
    @When("The user enters valid credentials")
    public void the_user_enters_valid_credentials() {
        loginPage.loginBox.sendKeys(ConfigurationReader.get("username"));
        loginPage.passwordBox.sendKeys(ConfigurationReader.get("password"));
        loginPage.signInButton.click();

    }
    @Then("verify Account Summary page is shown")
    public void verify_account_summary_page_is_shown() {
        Driver.get().get("http://zero.webappsecurity.com/bank/account-summary.html");
        Assert.assertEquals("http://zero.webappsecurity.com/bank/account-summary.html", Driver.get().getCurrentUrl());
    }
    @When("The user enters invalid credentials")
    public void the_user_enters_invalid_credentials() {
        loginPage.loginBox.sendKeys("userinvalid");
        loginPage.passwordBox.sendKeys("passwordinvalid");
        loginPage.signInButton.click();
    }
    @Then("verify {string} message is shown")
    public void verify_message_is_shown(String alertMessage) {
        String actualMessage = loginPage.alertMessage.getText();
        Assert.assertEquals(actualMessage, alertMessage);
    }

    @When("The user tries to login without entering any credentials")
    public void the_user_tries_to_login_without_entering_any_credentials() {
        loginPage.signInButton.click();
    }
}
