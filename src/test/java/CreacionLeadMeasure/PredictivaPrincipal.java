package CreacionLeadMeasure;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pomLeadMeasure.LeadMeasureActions;
import pomLogin.LoginActions;
import systemTesting.InitDriver;

public class PredictivaPrincipal extends InitDriver {
    private LoginActions loginActions;
    private PredictivaAcciones accionesDeLasPredictivas;
    private LeadMeasureActions leadMeasureActionsActions;


    @BeforeClass(alwaysRun = true)
    public void goToMCIPage() {
        final String url = "http://web-app-lb-2066069832.us-east-2.elb.amazonaws.com/login";
        loginActions = new LoginActions(driver, wait);
        accionesDeLasPredictivas = new PredictivaAcciones(driver, wait);
        leadMeasureActionsActions = new LeadMeasureActions(driver, wait);
        System.out.println(url);
        driver.get(url);
    }

    @Test(groups = {"General"})
    public void general() {
        loginActions.clickLoginButton();
        loginActions.fillMail("mario.cc@alliedglobal.com");
        loginActions.fillPassword("Abc123**");
        loginActions.sendLoginInfo();
        //wait.until(ExpectedConditions.urlContains("dashboard"));
        accionesDeLasPredictivas.apacharMCI();
        accionesDeLasPredictivas.apachar2023PrimerBoton();
        accionesDeLasPredictivas.apachar2023SegundoBoton();
        accionesDeLasPredictivas.apacharLead();
        leadMeasureActionsActions.fillVerb("Get");
        leadMeasureActionsActions.fillMeasureGoal("3");
        leadMeasureActionsActions.chooseFrequency("weekly");
        leadMeasureActionsActions.fillQualitativeStandard("assignments");
        leadMeasureActionsActions.chooseSelectAxisAmount("1");
        leadMeasureActionsActions.fillMeasureName("More clients");
        leadMeasureActionsActions.chooseSelectDataType("Numeric");
        leadMeasureActionsActions.chooseSelectDirection("Ascendent");
        leadMeasureActionsActions.fillExpectedGoal("3");
        leadMeasureActionsActions.fillAcceptableGoal("2");
        leadMeasureActionsActions.fillDescription("Test description");
        leadMeasureActionsActions.clickSave();
    }

}

