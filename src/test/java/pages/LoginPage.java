package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(className = "icon-signin")
    public WebElement signInNavButton;

    @FindBy(id = "user_login")
    public WebElement loginBox;

    @FindBy(id = "user_password")
    public WebElement passwordBox;

    @FindBy(css = "[name='submit']")
    public WebElement signInButton;

    @FindBy(xpath = "//div[starts-with(@class, 'alert')]")
    public WebElement alertMessage;

    public void login(){

    }
}
