package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.AccountSummaryPage;
import utilities.Driver;

import java.util.HashSet;
import java.util.Set;

public class AccountSummarySteps {
    AccountSummaryPage accountSummaryPage = new AccountSummaryPage();

    @Then("Verify that header is {string}")
    public void verifyThatHeaderIs(String header) {
        String actualHeader = Driver.get().getTitle();
        Assert.assertEquals(header, actualHeader);
    }

    @Then("Verify that {string} table exists")
    public void verifyThatTableExists(String arg0) {
        HashSet<String> accTypes = new HashSet<>();
        for (WebElement element : accountSummaryPage.accountTypesList) {
            accTypes.add(element.getText());
        }
        Assert.assertTrue(accTypes.contains(arg0));
    }

    @Then("Verify that table has {string} header")
    public void verifyThatTableHasHeader(String head) {
        HashSet <String> creditHeaders = new HashSet<>();
        for (WebElement element  : accountSummaryPage.creditAccTableHeads) {
            creditHeaders.add(element.getText());
        }
        Assert.assertTrue(creditHeaders.contains(head));
    }
}
