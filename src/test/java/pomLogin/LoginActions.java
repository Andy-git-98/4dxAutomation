package pomLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginActions extends LoginElements{
    private WebDriver driver;
    private WebDriverWait wait;

    public LoginActions(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
        PageFactory.initElements(driver, this);
    }

    public void clickLoginButton(){
        wait.until(ExpectedConditions.visibilityOf(logInButton)).click();
    }

    public void fillMail(String text){
        wait.until(ExpectedConditions.visibilityOf(email)).sendKeys(text);
    }
    public void fillPassword(String text){
        wait.until(ExpectedConditions.visibilityOf(password)).sendKeys(text);
    }
    public void sendLoginInfo(){
        wait.until(ExpectedConditions.visibilityOf(sendDataButton)).click();
    }
    public String getCurrentPageUrl(){
        return  driver.getCurrentUrl();
    }
}
