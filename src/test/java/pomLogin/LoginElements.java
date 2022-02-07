package pomLogin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginElements {
    @FindBy(xpath = "//span[contains(text(),'Log In')]")
    protected WebElement logInButton;

    @FindBy(id = "1-email")
    protected WebElement email;

    @FindBy(xpath = "//input[contains(@type,'password')]")
    protected WebElement password;

    @FindBy(className = "auth0-lock-submit")
    protected WebElement sendDataButton;
}
