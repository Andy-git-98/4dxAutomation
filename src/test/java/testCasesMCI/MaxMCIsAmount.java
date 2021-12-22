package testCasesMCI;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pomAddMember.AddMemberActions;
import pomLogin.LoginActions;
import pomMCIs.MCIActions;
import systemTesting.InitDriver;

public class MaxMCIsAmount extends InitDriver {
    private LoginActions loginActions;
    private MCIActions mciActions;
    private AddMemberActions addMemberActions;

    @BeforeClass(alwaysRun = true)
    public void goToMainPage(){
        final String url = "http://web-app-lb-2066069832.us-east-2.elb.amazonaws.com/login";
        loginActions = new LoginActions(driver,wait);
        mciActions = new MCIActions(driver,wait);
        addMemberActions = new AddMemberActions(driver,wait);
        System.out.println(url);
        driver.get(url);
    }

    @Test(groups={"TestCasesMCI"})
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
    @Test(groups={"TestCasesMCI"})
    public void multipleMCIs() throws Exception{
        boolean isLopping = true;
        int count = 0;
        while(isLopping){
            count += 1;
            mciActions.openMCIScreen();
            mciActions.fillVerb("Test"+Integer.toString(count));
            mciActions.fillWhat("systems");
            //mciActions.selectLeaderMCI(2);
            mciActions.fillMCIName("QA automation"+Integer.toString(count));
            mciActions.fillX1("0");
            mciActions.fillY1("10");
            mciActions.fillExpectedGoal("10");
            mciActions.fillAcceptedGoal("8");
            mciActions.fillFailedGoal("6");
            mciActions.selectYear("2021");
            mciActions.fillDesc("We want to test more systems");
            mciActions.saveMCI();

            Thread.sleep(5000);
            String currentURL=loginActions.getCurrentPageUrl();
            if(!currentURL.contains("/admin/dashboard")){
                isLopping = false;
                count = count -1;
            }
        }
        if(count > 3){
            Assert.fail("More than 3 WIGs were created");
        }
    }
}
