package pomMCIs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Keys;

public class AddMemberActions extends AddMemberElements{
    private WebDriver driver;
    private WebDriverWait wait;

    public AddMemberActions(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
        PageFactory.initElements(driver, this);
    }

    public void clickSelectTeam(){
        wait.until(ExpectedConditions.visibilityOf(selectTeam)).click();
    }

    public void fillInputUser(String text){
        wait.until(ExpectedConditions.visibilityOf(inputUser)).sendKeys(text,Keys.DOWN,Keys.RETURN);
    }

    public void clickSelectRole(){
        wait.until(ExpectedConditions.visibilityOf(selectRole)).click();
    }

    public void clickButtonAdd(){
        wait.until(ExpectedConditions.visibilityOf(buttonAdd)).click();
    }
}
