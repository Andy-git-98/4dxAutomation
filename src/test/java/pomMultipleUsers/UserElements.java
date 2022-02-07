package pomMultipleUsers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserElements {
    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div[1]/div/div[3]/div/div/div[1]/a/button")
    protected WebElement buttonAddUser;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div[1]/div/div[3]/div/div/div[2]/form/div[1]/div/div/div[1]/div/div/input")
    protected WebElement inputFirstName;

    @FindBy(id = "inputLastName")
    protected WebElement inputLastName;

    @FindBy(id = "mui-component-select-roleId")
    protected WebElement selectRole;

    @FindBy(id = "inputEmail")
    protected WebElement inputEmail;

    @FindBy(id = "inputPassword")
    protected WebElement inputPassword;

    @FindBy(id = "inputCode")
    protected WebElement inputCode;

    @FindBy(id = "inputPosition")
    protected WebElement inputPosition;

    @FindBy(id = "userList")
    protected WebElement userList;

    @FindBy(id = "accountList")
    protected WebElement accountList;

    @FindBy(id = "countriesList")
    protected WebElement countriesList;

    @FindBy(xpath = "//span[contains(text(),'Save')]")
    protected WebElement buttonSave;
}
