package pomMCIs;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MCIActions extends MCIElements {
    private WebDriver driver;
    private WebDriverWait wait;

    public MCIActions(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
        PageFactory.initElements(driver, this);
    }

    public void openMCIScreen() {
        wait.until(ExpectedConditions.visibilityOf(MCIButton)).click();
    }

    public void fillVerb(String text) {
        wait.until(ExpectedConditions.visibilityOf(inputVerb)).sendKeys(text);
    }

    public void fillWhat(String text) {
        wait.until(ExpectedConditions.visibilityOf(inputWhat)).sendKeys(text);
    }

    public void selectLeaderMCI(int option) {
        wait.until(ExpectedConditions.visibilityOf(selectLeaderMCI)).click();
        if(option == 1) {
            wait.until(ExpectedConditions.visibilityOf(option1)).click();
        }
        if(option == 2) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div[3]/ul/li[3]"))).click();
        }
        if(option == 3) {
            wait.until(ExpectedConditions.visibilityOf(option3)).click();
        }
    }

    public void fillMCIName(String text) {
        wait.until(ExpectedConditions.visibilityOf(inputMCIName)).sendKeys(text);
    }

    public void fillX1(String text) {
        wait.until(ExpectedConditions.visibilityOf(inputX1)).sendKeys(text);
    }

    public void fillY1(String text) {
        wait.until(ExpectedConditions.visibilityOf(inputY1)).sendKeys(text);
    }

    public void fillExpectedGoal(String text) {
        wait.until(ExpectedConditions.visibilityOf(inputExpectedGoal)).sendKeys(text);
    }

    public void fillAcceptedGoal(String text) {
        wait.until(ExpectedConditions.visibilityOf(inputAcceptedGoal)).sendKeys(text);
    }

    public void fillFailedGoal(String text) {
        wait.until(ExpectedConditions.visibilityOf(inputFailedGoal)).sendKeys(text);
    }

    public void selectDataTypeNumber() {
        wait.until(ExpectedConditions.visibilityOf(selectDataType)).click();
        wait.until(ExpectedConditions.visibilityOf(number)).click();
    }

    public void selectYear(String year){
        wait.until(ExpectedConditions.visibilityOf(selectYear)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'"+year+"')]"))).click();
    }

    public void fillDesc(String text){
        wait.until(ExpectedConditions.visibilityOf(inputDescription)).sendKeys(text);
    }

    public void saveMCI(){
        Actions action = new Actions(driver);
        action.moveToElement(buttonSave).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(buttonSave)).click();
    }
}