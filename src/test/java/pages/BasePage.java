package pages;

import utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "(//a[@class='nav-link'])[1]")
    public WebElement homeLink_loc;

    @FindBy(xpath = "//a[.='Cart']")
    public WebElement cart_loc;
}
