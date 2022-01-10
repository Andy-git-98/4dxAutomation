package pomLeadMeasure;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LeadMeasureActions extends LeadMeasureElements{
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions action;

    public LeadMeasureActions(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
        action = new Actions(driver);
        PageFactory.initElements(driver, this);
    }

    public void openLeadMeasureScreen(){
        wait.until(ExpectedConditions.visibilityOf(buttonLeadMeasure)).click();
    }

    public void chooseWIG(int option){
        wait.until(ExpectedConditions.visibilityOf(selectWIG)).click();
        if(option == 1) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div[3]/ul/li[1]"))).click();
        }
        if(option == 2) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div[3]/ul/li[2]"))).click();
        }
        if(option == 3) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div[3]/ul/li[3]"))).click();
        }
    }

    public void fillVerb(String text){
        action.moveToElement(inputVerb).build().perform();
        wait.until(ExpectedConditions.visibilityOf(inputVerb)).sendKeys(text);
    }

    public void fillMeasureGoal(String text){
        action.moveToElement(inputFocus).build().perform();
        wait.until(ExpectedConditions.visibilityOf(inputFocus)).sendKeys(text);
    }

    public void chooseFrequency(String frequency){
        action.moveToElement(selectConsistency).build().perform();
        wait.until(ExpectedConditions.visibilityOf(selectConsistency)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'"+frequency+"')]"))).click();
    }

    public void fillQualitativeStandard(String text){
        action.moveToElement(inputQuality).build().perform();
        wait.until(ExpectedConditions.visibilityOf(inputQuality)).sendKeys(text);
    }

    public void chooseSelectAxisAmount(String amount){
        action.moveToElement(selectAxisNumber).build().perform();
        wait.until(ExpectedConditions.visibilityOf(selectAxisNumber)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'"+amount+"')]"))).click();
    }

    public void fillMeasureName(String text){
        action.moveToElement(inputDisplayName1).build().perform();
        wait.until(ExpectedConditions.visibilityOf(inputDisplayName1)).sendKeys(text);
    }

    public void chooseSelectDataType(String type){
        action.moveToElement(selectDataTypeId1).build().perform();
        wait.until(ExpectedConditions.visibilityOf(selectDataTypeId1)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'"+type+"')]"))).click();
    }

    public void chooseSelectDirection(String direction){
        action.moveToElement(selectDirection).build().perform();
        wait.until(ExpectedConditions.visibilityOf(selectDirection)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'"+direction+"')]"))).click();
    }

    public void fillExpectedGoal(String text){
        action.moveToElement(inputY1).build().perform();
        wait.until(ExpectedConditions.visibilityOf(inputY1)).sendKeys(text);
    }

    public void fillAcceptableGoal(String text){
        action.moveToElement(inputX1).build().perform();
        wait.until(ExpectedConditions.visibilityOf(inputX1)).sendKeys(text);
    }

    public void fillDescription(String text){
        action.moveToElement(inputDescription).build().perform();
        wait.until(ExpectedConditions.visibilityOf(inputDescription)).sendKeys(text);
    }

    public void clickSave(){
        action.moveToElement(buttonSave).build().perform();
        wait.until(ExpectedConditions.visibilityOf(buttonSave)).click();
    }

    public void redirectToHomePage(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div/div[2]/div[2]/ul/li[1]/a/div"))).click();
    }
}
