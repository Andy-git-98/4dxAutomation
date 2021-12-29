package testCasesMCI;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pomLogin.LoginActions;
import pomMCIs.MCIActions;
import systemTesting.InitDriver;

public class RequiredFieldsMCI extends InitDriver {
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

    @Test(groups={"Login"})
    public void loginUser(){
        loginActions.clickLoginButton();
        loginActions.fillMail("mario.cc@alliedglobal.com");
        loginActions.fillPassword("Abc123**");
        loginActions.sendLoginInfo();

        wait.until(ExpectedConditions.urlContains("web-app-lb-2066069832.us-east-2.elb.amazonaws.com"));
        String currentURL=loginActions.getCurrentPageUrl();
        if(!currentURL.contains("web-app-lb-2066069832.us-east-2.elb.amazonaws.com")){
            //Assert.fail("Incorrect credentials");
        }
    }

    @Test(groups={"TestCasesMCI"})
    public void testRequiredFields() throws Exception{
        System.out.println("2nd Test");
        String verb="Test";
        String what="required fields";
        String name="Test required fields";
        String x1="0";
        String y1="10";
        String expected="10";
        String accepted="8";
        String failed="6";
        for(int i = 0; i < 10; i++){
            switch (i){
                case 1:
                    mciActions.openMCIScreen();
                    //mciActions.fillVerb(verb);
                    mciActions.fillWhat(what);
                    mciActions.fillMCIName(name);
                    mciActions.fillX1(x1);
                    mciActions.fillY1(y1);
                    mciActions.fillExpectedGoal(expected);
                    mciActions.fillAcceptedGoal(accepted);
                    mciActions.fillFailedGoal(failed);
                    mciActions.saveMCI();
                    mciActions.findErrorMessage("Verb");
                    break;
                case 2:
                    driver.navigate().refresh();
                    mciActions.fillVerb(verb);
                    //mciActions.fillWhat(what);
                    mciActions.fillMCIName(name);
                    mciActions.fillX1(x1);
                    mciActions.fillY1(y1);
                    mciActions.fillExpectedGoal(expected);
                    mciActions.fillAcceptedGoal(accepted);
                    mciActions.fillFailedGoal(failed);
                    mciActions.saveMCI();
                    mciActions.findErrorMessage("What?");
                    break;
                case 3:
                    driver.navigate().refresh();
                    mciActions.fillVerb(verb);
                    mciActions.fillWhat(what);
                    //mciActions.fillMCIName(name);
                    mciActions.fillX1(x1);
                    mciActions.fillY1(y1);
                    mciActions.fillExpectedGoal(expected);
                    mciActions.fillAcceptedGoal(accepted);
                    mciActions.fillFailedGoal(failed);
                    mciActions.saveMCI();
                    mciActions.findErrorMessage("WIG Name");
                    break;
                case 4:
                    driver.navigate().refresh();
                    mciActions.fillVerb(verb);
                    mciActions.fillWhat(what);
                    mciActions.fillMCIName(name);
                    //mciActions.fillX1(x1);
                    mciActions.fillY1(y1);
                    mciActions.fillExpectedGoal(expected);
                    mciActions.fillAcceptedGoal(accepted);
                    mciActions.fillFailedGoal(failed);
                    mciActions.saveMCI();
                    mciActions.findErrorMessage("X1");
                    break;
                case 5:
                    driver.navigate().refresh();
                    mciActions.fillVerb(verb);
                    mciActions.fillWhat(what);
                    mciActions.fillMCIName(name);
                    mciActions.fillX1(x1);
                    //mciActions.fillY1(y1);
                    mciActions.fillExpectedGoal(expected);
                    mciActions.fillAcceptedGoal(accepted);
                    mciActions.fillFailedGoal(failed);
                    mciActions.saveMCI();
                    Thread.sleep(2000);
                    if (loginActions.getCurrentPageUrl().contains("/admin/dashboard")){
                        Assert.fail("Field Y1 is not required and should be");
                    }
                    break;
                case 6:
                    driver.navigate().refresh();
                    mciActions.fillVerb(verb);
                    mciActions.fillWhat(what);
                    mciActions.fillMCIName(name);
                    mciActions.fillX1(x1);
                    mciActions.fillY1(y1);
                    //mciActions.fillExpectedGoal(expected);
                    mciActions.fillAcceptedGoal(accepted);
                    mciActions.fillFailedGoal(failed);
                    mciActions.saveMCI();
                    mciActions.findErrorMessage("Level 3 Axis 1");
                    break;
                case 7:
                    driver.navigate().refresh();
                    mciActions.fillVerb(verb);
                    mciActions.fillWhat(what);
                    mciActions.fillMCIName(name);
                    mciActions.fillX1(x1);
                    mciActions.fillY1(y1);
                    mciActions.fillExpectedGoal(expected);
                    //mciActions.fillAcceptedGoal(accepted);
                    mciActions.fillFailedGoal(failed);
                    mciActions.saveMCI();
                    mciActions.findErrorMessage("Level 2 Axis 1");
                    break;
                case 8:
                    driver.navigate().refresh();
                    mciActions.fillVerb(verb);
                    mciActions.fillWhat(what);
                    mciActions.fillMCIName(name);
                    mciActions.fillX1(x1);
                    mciActions.fillY1(y1);
                    mciActions.fillExpectedGoal(expected);
                    mciActions.fillAcceptedGoal(accepted);
                    //mciActions.fillFailedGoal(failed);
                    mciActions.saveMCI();
                    mciActions.findErrorMessage("Level 1 Axis 1");
                    break;
                default:
                    break;
            }
        }
    }
}
