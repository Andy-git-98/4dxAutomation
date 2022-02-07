package pomMultipleUsers;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserActions extends UserElements {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions action;

    public UserActions(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
        action = new Actions(driver);
        PageFactory.initElements(driver, this);
    }

    public void goToUsersForm(){
        wait.until(ExpectedConditions.visibilityOf(buttonAddUser)).click();
    }

    public void fillFirstName(String text){
        wait.until(ExpectedConditions.visibilityOf(inputFirstName)).sendKeys(text);
    }

    public void fillLastName(String text){
        wait.until(ExpectedConditions.visibilityOf(inputLastName)).sendKeys(text);
    }

    public void chooseRole(String text){
        action.moveToElement(selectRole).build().perform();
        wait.until(ExpectedConditions.visibilityOf(selectRole)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='"+text+"']"))).click();
    }

    public void fillEmail(String text){
        action.moveToElement(inputEmail).build().perform();
        wait.until(ExpectedConditions.visibilityOf(inputEmail)).sendKeys(text);
    } 

    public void fillPass(String text){
        action.moveToElement(inputPassword).build().perform();
        wait.until(ExpectedConditions.visibilityOf(inputPassword)).sendKeys(text);
    }

    public void fillEmployeeCode(String text){
        action.moveToElement(inputCode).build().perform();
        wait.until(ExpectedConditions.visibilityOf(inputCode)).sendKeys(text);
    }

    public void fillPosition(String text){
        action.moveToElement(inputPosition).build().perform();
        wait.until(ExpectedConditions.visibilityOf(inputPosition)).sendKeys(text);
    }

    public void chooseManager(String text){
        action.moveToElement(userList).build().perform();
        wait.until(ExpectedConditions.visibilityOf(userList)).sendKeys(text, Keys.DOWN, Keys.RETURN);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'"+text+"')]"))).click();
    }

    public void chooseAccount(String text){
        action.moveToElement(accountList).build().perform();
        wait.until(ExpectedConditions.visibilityOf(accountList)).sendKeys(text, Keys.DOWN, Keys.RETURN);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'"+text+"')]"))).click();
    }

    public void chooseCountry(String text){
        action.moveToElement(countriesList).build().perform();
        wait.until(ExpectedConditions.visibilityOf(countriesList)).sendKeys(text, Keys.DOWN, Keys.RETURN);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'"+text+"')]"))).click();
    }

    public void saveUser(){
        action.moveToElement(buttonSave).build().perform();
        wait.until(ExpectedConditions.visibilityOf(buttonSave)).click();
    }
}