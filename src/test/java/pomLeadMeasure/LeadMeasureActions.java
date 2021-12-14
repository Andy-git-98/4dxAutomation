package pomLeadMeasure;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LeadMeasureActions extends LeadMeasureElements{
    private WebDriver driver;
    private WebDriverWait wait;

    public LeadMeasureActions(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
        PageFactory.initElements(driver, this);
    }
}
