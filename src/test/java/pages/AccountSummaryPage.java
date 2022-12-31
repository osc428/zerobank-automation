package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;
import java.util.Set;

public class AccountSummaryPage extends BasePage{

        @FindBy(xpath = "//h2")
        public List<WebElement> accountTypesList;

        @FindBy(xpath = "(//h2[text()='Credit Accounts']/following-sibling::div)[1]/div/table/thead/tr/th")
        public List<WebElement> creditAccTableHeads;

}
