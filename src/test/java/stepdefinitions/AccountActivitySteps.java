package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.AccountActivityPage;
import utilities.Driver;

import java.util.HashSet;
import java.util.List;

public class AccountActivitySteps {
    AccountActivityPage accountActivityPage = new AccountActivityPage();

    @And("Verify Account Activity page is shown")
    public void verifyAccountActivityPageIsShown() {
        Driver.get().get("http://zero.webappsecurity.com/bank/account-activity.html");
        Assert.assertEquals("http://zero.webappsecurity.com/bank/account-activity.html", Driver.get().getCurrentUrl());
    }

    @Then("Verify that title is {string}")
    public void verifyThatTitleIs(String title) {
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals(title, actualTitle);
    }

    @Then("verify that default value of Account menu is {string}")
    public void verifyThatDefaultValueOfAccountMenuIs(String expected) {
        Select select = new Select(accountActivityPage.accountMenu);
        String actual = select.getFirstSelectedOption().getText();
        Assert.assertEquals(expected, actual);
    }

    @Then("Verify that menu has {string} option:")
    public void verifyThatMenuHasOption(String opt) {
        Select select = new Select(accountActivityPage.accountMenu);
        List<WebElement> optionElements = select.getOptions();
        HashSet<String> options = new HashSet<>();
        for (WebElement element : optionElements) {
            options.add(element.getText());
        }
        Assert.assertTrue(options.contains(opt));
    }

    @Then("Verify that Transaction table has {string} header")
    public void verifyThatTransactionTableHasHeader(String head) {
        HashSet<String> headers = new HashSet<>();
        for (WebElement element : accountActivityPage.tableHeaders) {
            headers.add(element.getText());
        }
        Assert.assertTrue(headers.contains(head));
    }
}
