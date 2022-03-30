package CreacionLeadMeasure;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Elementos {
    @FindBy(xpath="//div[contains(text(),'WIG')]")
    protected WebElement BarraNavegacionBotonWig;

    @FindBy(xpath="//div[contains(text(),'2023')]")
    protected WebElement BarraNavegacionBoton2023;

    @FindBy(xpath="/html/body/div[1]/div/div[1]/div[2]/div/div/div[2]/div[2]/ul/li[2]/div/div/div/ul/li[1]/div/div/div/ul/li/a/div")
    protected WebElement BarraNavegacionSegundoBoton2023;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div[1]/div/div[2]/div[2]/div/div/a/button")
    protected WebElement leadButton;
}
