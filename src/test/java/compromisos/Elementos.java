package compromisos;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Elementos {

    @FindBy(xpath="/html/body/div[1]/div/div[1]/div[2]/div/div/div[2]/div[2]/ul/li[4]/a/div")
    protected WebElement BrujulaDeTrabajo;

    @FindBy(xpath="/html/body/div[1]/div/div[1]/div[2]/div/div/div[2]/div[2]/ul/li[4]/div/div/div/ul/li[1]/a")
    protected WebElement  BotonCompromiso;

    @FindBy(xpath="o,")
    protected WebElement BarraNavegacionSegundoBoton2023;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div[1]/div/div[2]/div[2]/div/div/a/button")
    protected WebElement leadButton;
}

}
