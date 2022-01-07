package Rergression;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pomAddMember.AddMemberActions;
import pomLeadMeasure.LeadMeasureActions;
import pomLogin.LoginActions;
import pomMCIs.MCIActions;
import systemTesting.InitDriver;

public class MaxLeadMeasureAmount extends InitDriver {
    private LoginActions loginActions;
    private LeadMeasureActions leadMeasureActions;

    @BeforeClass(alwaysRun = true)
    public void goToMainPage(){
        final String url = "http://web-app-lb-2066069832.us-east-2.elb.amazonaws.com/login";
        loginActions = new LoginActions(driver,wait);
        leadMeasureActions = new LeadMeasureActions(driver,wait);
        System.out.println(url);
        driver.get(url);
    }

    @Test(groups={"Regression"})
    public void loginUser(){
        loginActions.clickLoginButton();
        loginActions.fillMail("mario.cc@alliedglobal.com");
        loginActions.fillPassword("Abc123**");
        loginActions.sendLoginInfo();

        wait.until(ExpectedConditions.urlContains("web-app-lb-2066069832.us-east-2.elb.amazonaws.com"));
        String currentURL=loginActions.getCurrentPageUrl();
        if(!currentURL.contains("web-app-lb-2066069832.us-east-2.elb.amazonaws.com")){
            Assert.fail("Incorrect credentials");
        }
    }

    @Test(groups={"Regression"})
    public void multipleLeadMeasures() throws Exception{
        boolean isLopping = true;
        int count = 1;
        int wigNumber = 1;
        int genCount = 1;
        while(isLopping){
            leadMeasureActions.openLeadMeasureScreen();
            leadMeasureActions.chooseWIG(wigNumber);
            leadMeasureActions.fillVerb("Get");
            leadMeasureActions.fillMeasureGoal("3");
            leadMeasureActions.chooseFrequency("weekly");
            leadMeasureActions.fillQualitativeStandard("assignments");
            leadMeasureActions.chooseSelectAxisAmount("1");
            leadMeasureActions.fillMeasureName("More clients"+Integer.toString(count));
            leadMeasureActions.chooseSelectDataType("Numeric");
            leadMeasureActions.chooseSelectDirection("Ascendent");
            leadMeasureActions.fillExpectedGoal("3");
            leadMeasureActions.fillAcceptableGoal("2");
            leadMeasureActions.fillDescription("Test description");
            leadMeasureActions.clickSave();
            Thread.sleep(5000);
            String currentURL=loginActions.getCurrentPageUrl();
            if(!currentURL.contains("/admin/dashboard") && count == 4){
                //isLopping = false;
                count = 1;
                wigNumber += 1;
            }
            if(!currentURL.contains("/admin/dashboard") && genCount == 10){
                isLopping = false;
            }
            count += 1;
            genCount += 1;
        }
        /***if(count > 3){
            Assert.fail("More than 3 WIGs were created");
        }***/
    }
}
