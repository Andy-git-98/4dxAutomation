package testCasesMCI;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pomLogin.LoginActions;
import pomMCIs.MCIActions;
import systemTesting.InitDriver;

public class DescendingMCI extends InitDriver {
    private LoginActions loginActions;
    private MCIActions mciActions;

    @BeforeClass(alwaysRun = true)
    public void goToMCIPage(){
        final String url = "http://web-app-lb-2066069832.us-east-2.elb.amazonaws.com/login";
        loginActions = new LoginActions(driver,wait);
        mciActions = new MCIActions(driver,wait);
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

    @Test(groups={"HappyPath"})
    public void newMCI(){
        mciActions.openMCIScreen();
        mciActions.fillVerb("Test");
        mciActions.fillWhat("systems");
        //mciActions.selectLeaderMCI(2);
        mciActions.fillMCIName("QA automation");
        mciActions.fillX1("10");
        mciActions.fillY1("0");
        mciActions.fillExpectedGoal("0");
        mciActions.fillAcceptedGoal("4");
        mciActions.fillFailedGoal("6");
        mciActions.selectYear("2021");
        mciActions.fillDesc("We want to test less systems");
        mciActions.saveMCI();
    }
}
