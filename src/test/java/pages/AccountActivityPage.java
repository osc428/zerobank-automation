package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AccountActivityPage extends BasePage{

    @FindBy(id = "aa_accountId")
    public WebElement accountMenu;

    @FindBy(xpath = "//div[@id='all_transactions_for_account']/table/thead/tr/th")
    public List<WebElement> tableHeaders;

}
