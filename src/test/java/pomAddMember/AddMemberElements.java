package pomAddMember;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddMemberElements {
    @FindBy(id = "mui-component-select-teamId")
    protected WebElement selectTeam;

    @FindBy(id = "userList")
    protected WebElement inputUser;

    @FindBy(id = "mui-component-select-dataRoleId")
    protected WebElement selectRole;

    @FindBy(xpath = "//span[contains(text(),'ADD')]")
    protected WebElement buttonAdd;
}
