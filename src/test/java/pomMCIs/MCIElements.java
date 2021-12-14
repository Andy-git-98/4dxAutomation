package pomMCIs;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MCIElements {
    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div[1]/div/div/div/div/div/a[1]/button")
    protected WebElement MCIButton;

    @FindBy(id = "inputVerb")
    protected WebElement inputVerb;

    @FindBy(id = "inputWhat")
    protected WebElement inputWhat;

    @FindBy(id = "mui-component-select-selectaxesNumber")
    protected WebElement selectAxisAmount;

    @FindBy(id = "mui-component-select-parentWig")
    protected WebElement selectLeaderMCI;
    //Select leader MCI (parent WIG)
    @FindBy(id = "inputDisplayName1")
    protected WebElement inputMCIName;
    //Leader MCI options
    @FindBy(xpath = "//li[contains(@tabindex,'0')]")
    protected WebElement option1;
    @FindBy(xpath = "//li[contains(@tabindex,'-1')]")
    protected WebElement option2;
    @FindBy(xpath = "//li[contains(@tabindex,'-2')]")
    protected WebElement option3;

    @FindBy(id = "inputX1")
    protected WebElement inputX1;

    @FindBy(id = "inputY1")
    protected WebElement inputY1;

    @FindBy(id = "inputlevel3_1")
    protected WebElement inputExpectedGoal;

    @FindBy(id = "inputlevel2_1")
    protected WebElement inputAcceptedGoal;

    @FindBy(id = "inputlevel1_1")
    protected WebElement inputFailedGoal;
    //Select data type
    @FindBy(id = "mui-component-select-selectDataTypeId1")
    protected WebElement selectDataType;
    //Data type options
    @FindBy(xpath = "//li[contains(text(), 'Numeric']")
    protected WebElement number;
    @FindBy(xpath = "//li[contains(text(), 'Porcentaje']")
    protected WebElement percent;
    @FindBy(xpath = "//li[contains(text(), 'Dólar']")
    protected WebElement dollar;
    @FindBy(xpath = "//li[contains(text(), 'Quetzales']")
    protected WebElement quetzal;
    @FindBy(xpath = "//li[contains(text(), 'Horas']")
    protected WebElement hour;

    @FindBy(id = "mui-component-select-selectYear")
    protected WebElement selectYear;

    @FindBy(id = "inputDescription")
    protected WebElement inputDescription;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div[1]/div/div/div[3]/div/div/div[2]/form/div[3]/button")
    protected WebElement buttonSave;
}
