package pomLeadMeasure;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pomLogin.LoginActions;
import systemTesting.InitDriver;

public class LeadMeasureHappyPath extends InitDriver {
    private LoginActions loginActions;
    private LeadMeasureActions leadMeasureActionsActions;

    @BeforeClass(alwaysRun = true)
    public void goToLeadMeasurePage(){
        final String url = "http://web-app-lb-2066069832.us-east-2.elb.amazonaws.com/login";
        loginActions = new LoginActions(driver,wait);
        leadMeasureActionsActions = new LeadMeasureActions(driver,wait);
        System.out.println(url);
        driver.get(url);
    }

    @Test(groups={"HappyPath"})
    public void loginUser(){
        loginActions.clickLoginButton();
        loginActions.fillMail("mario.cc@alliedglobal.com");
        loginActions.fillPassword("Abc123**");
        loginActions.sendLoginInfo();
        String currentURL=loginActions.getCurrentPageUrl();
        wait.until(ExpectedConditions.urlContains("web-app-lb-2066069832.us-east-2.elb.amazonaws.com"));
        if(!currentURL.contains("web-app-lb-2066069832.us-east-2.elb.amazonaws.com")){
            Assert.fail("Incorrect credentials");
        }
    }

    @Test(groups = "HappyPath")
    public void newLeadMeasure(){
        leadMeasureActionsActions.openLeadMeasureScreen();
        leadMeasureActionsActions.chooseWIG(1);
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
