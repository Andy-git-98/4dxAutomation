package CreacionLeadMeasure;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PredictivaAcciones extends Elementos{
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions action;


    public PredictivaAcciones(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
        action = new Actions(driver);
        PageFactory.initElements(driver, this);
    }

    public void apacharMCI(){
        //action.moveToElement(BarraNavegacionBotonWig).build().perform();
        wait.until(ExpectedConditions.visibilityOf(BarraNavegacionBotonWig)).click();
    }
    public void apachar2023PrimerBoton(){
        //action.moveToElement(BarraNavegacionBoton2023).build().perform();
        wait.until(ExpectedConditions.visibilityOf(BarraNavegacionBoton2023)).click();
    }
    public void apachar2023SegundoBoton(){
        //action.moveToElement(BarraNavegacionSegundoBoton2023).build().perform();
        wait.until(ExpectedConditions.visibilityOf(BarraNavegacionSegundoBoton2023)).click();
    }
    public void apacharLead(){
        action.moveToElement(leadButton).build().perform();
        wait.until(ExpectedConditions.visibilityOf(leadButton)).click();
    }
}
