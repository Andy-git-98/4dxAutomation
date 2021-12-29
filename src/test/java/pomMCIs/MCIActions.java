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
    private Actions action;

    public MCIActions(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
        action = new Actions(driver);
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
        action.moveToElement(inputMCIName).build().perform();
        wait.until(ExpectedConditions.visibilityOf(inputMCIName)).sendKeys(text);
    }

    public void fillX1(String text) {
        action.moveToElement(inputX1).build().perform();
        wait.until(ExpectedConditions.visibilityOf(inputX1)).sendKeys(text);
    }

    public void fillY1(String text) {
        action.moveToElement(inputY1).build().perform();
        wait.until(ExpectedConditions.visibilityOf(inputY1)).sendKeys(text);
    }

    public void fillExpectedGoal(String text) {
        action.moveToElement(inputExpectedGoal).build().perform();
        wait.until(ExpectedConditions.visibilityOf(inputExpectedGoal)).sendKeys(text);
    }

    public void fillAcceptedGoal(String text) {
        action.moveToElement(inputAcceptedGoal).build().perform();
        wait.until(ExpectedConditions.visibilityOf(inputAcceptedGoal)).sendKeys(text);
    }

    public void fillFailedGoal(String text) {
        action.moveToElement(inputFailedGoal).build().perform();
        wait.until(ExpectedConditions.visibilityOf(inputFailedGoal)).sendKeys(text);
    }

    public void selectDataTypeNumber() {
        action.moveToElement(selectDataType).build().perform();
        wait.until(ExpectedConditions.visibilityOf(selectDataType)).click();
        wait.until(ExpectedConditions.visibilityOf(number)).click();
    }

    public void selectYear(String year){
        action.moveToElement(selectYear).build().perform();
        wait.until(ExpectedConditions.visibilityOf(selectYear)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'"+year+"')]"))).click();
    }

    public void fillDesc(String text){
        action.moveToElement(inputDescription).build().perform();
        wait.until(ExpectedConditions.visibilityOf(inputDescription)).sendKeys(text);
    }

    public void saveMCI(){
        action.moveToElement(buttonSave).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(buttonSave)).click();
    }

    public void findErrorMessage(String text){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(), 'The field "+text+" is required')]")));
    }

    //public void deleteMCIName() {
       // wait.until(ExpectedConditions.visibilityOf(inputMCIName)).clear();
    //}

}