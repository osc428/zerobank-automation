package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import pages.PayBillsPage;
import utilities.Driver;

public class PayBillsStepDefs {

    PayBillsPage payBillsPage = new PayBillsPage();
    @And("Verify Pay Bills page is shown")
    public void verifyPayBillsPageIsShown() {
        Driver.get().get("http://zero.webappsecurity.com/bank/pay-bills.html");
        Assert.assertEquals("http://zero.webappsecurity.com/bank/pay-bills.html", Driver.get().getCurrentUrl());
    }

    @Then("Verify that page title is {string}")
    public void verifyThatPageTitleIs(String arg0) {
        Assert.assertEquals(arg0, Driver.get().getTitle());
    }


    @When("User enters {string} and {string} and {string} and click the Pay button")
    public void userEntersAndAndAndClickThePayButton(String amount, String date, String description) {
        payBillsPage.amountBox.sendKeys(amount);
        payBillsPage.dateBox.sendKeys(date);
        payBillsPage.descriptionBox.sendKeys(description);
        payBillsPage.payButton.click();
    }

    @Then("Verify that {string} message is shown")
    public void verifyThatMessageIsShown(String expected) {
        String actual = payBillsPage.alertMessage.getText();
        Assert.assertEquals(expected, actual);
    }

    @When("User enters {string} and {string} and click the Pay button")
    public void userEntersAndAndClickThePayButton(String date, String description) {
        payBillsPage.dateBox.sendKeys(date);
        payBillsPage.descriptionBox.sendKeys(description);
        payBillsPage.payButton.click();
    }

    @When("User enters just {string} and {string} and click the Pay button")
    public void userEntersJustAndAndClickThePayButton(String amount, String description) {
        payBillsPage.amountBox.sendKeys(amount);
        payBillsPage.descriptionBox.sendKeys(description);
        payBillsPage.payButton.click();
    }

    @Then("Verify that {string} alert is shown")
    public void verifyThatAlertIsShown(String expected) {
       Assert.assertTrue(payBillsPage.amountBox.getAttribute("required").equals("true"));
    }


    @Then("Verify that {string} alert is shown but not {string} message")
    public void verifyThatAlertIsShownButNotMessage(String arg0, String arg1) {
       Assert.assertFalse(payBillsPage.alertContainer.isDisplayed());
    }

    @Then("Verify that {string} message is NOT shown")
    public void verifyThatMessageIsNOTShown(String arg0) {
        Assert.assertFalse(payBillsPage.alertContainer.isDisplayed());
    }
}
