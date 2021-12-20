package pomLeadMeasure;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeadMeasureElements {
    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div[1]/div/div/div/div/div/a[2]/button")
    protected WebElement buttonLeadMeasure;

    @FindBy(id = "mui-component-select-selectPredictiveType")
    protected WebElement selectWIG;

    @FindBy(id = "inputVerb")
    protected WebElement inputVerb;

    @FindBy(id = "inputFocus")
    protected WebElement inputFocus;

    @FindBy(id = "mui-component-select-selectConsistency")
    protected WebElement selectConsistency;

    @FindBy(id = "inputQuality")
    protected WebElement inputQuality;

    @FindBy(id = "mui-component-select-selectaxesNumber")
    protected WebElement selectAxisNumber;

    @FindBy(id = "inputDisplayName1")
    protected WebElement inputDisplayName1;

    @FindBy(id = "mui-component-select-selectDataTypeId1")
    protected WebElement selectDataTypeId1;

    @FindBy(id = "mui-component-select-selectDirection")
    protected WebElement selectDirection;

    @FindBy(id = "inputY1")
    protected WebElement inputY1;

    @FindBy(id = "inputX1")
    protected WebElement inputX1;

    @FindBy(id = "inputDescription")
    protected WebElement inputDescription;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div/div[2]/form/div[3]/button")
    protected WebElement buttonSave;

}
