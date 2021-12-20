package pomLeadMeasure;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LeadMeasureActions extends LeadMeasureElements{
    private WebDriver driver;
    private WebDriverWait wait;

    public LeadMeasureActions(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
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
        wait.until(ExpectedConditions.visibilityOf(inputVerb)).sendKeys(text);
    }

    public void fillMeasureGoal(String text){
        wait.until(ExpectedConditions.visibilityOf(inputFocus)).sendKeys(text);
    }

    public void chooseFrequency(String frequency){
        wait.until(ExpectedConditions.visibilityOf(selectConsistency)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'"+frequency+"')]"))).click();
    }

    public void fillQualitativeStandard(String text){
        wait.until(ExpectedConditions.visibilityOf(inputQuality)).sendKeys(text);
    }

    public void chooseSelectAxisAmount(String amount){
        wait.until(ExpectedConditions.visibilityOf(selectAxisNumber)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'"+amount+"')]"))).click();
    }

    public void fillMeasureName(String text){
        wait.until(ExpectedConditions.visibilityOf(inputDisplayName1)).click();
    }

    public void chooseSelectDataType(String type){
        wait.until(ExpectedConditions.visibilityOf(selectDataTypeId1)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'"+type+"')]"))).click();
    }

    public void chooseSelectDirection(String direction){
        wait.until(ExpectedConditions.visibilityOf(selectDirection)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'"+direction+"')]"))).click();
    }

    public void fillExpectedGoal(String text){
        wait.until(ExpectedConditions.visibilityOf(inputY1)).sendKeys(text);
    }

    public void fillAcceptableGoal(String text){
        wait.until(ExpectedConditions.visibilityOf(inputX1)).sendKeys(text);
    }

    public void fillDescription(String text){
        wait.until(ExpectedConditions.visibilityOf(inputDescription)).sendKeys(text);
    }

    public void clickSave(){
        wait.until(ExpectedConditions.visibilityOf(buttonSave)).click();
    }
}
