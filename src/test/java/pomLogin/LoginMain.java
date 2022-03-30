package pomLogin;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import systemTesting.InitDriver;

public class LoginMain extends InitDriver {

    private LoginActions loginActions;

    @BeforeClass(alwaysRun = true)
    public void goToLoginPage(){
        final String url = "http://web-app-lb-2066069832.us-east-2.elb.amazonaws.com/login";
        loginActions = new LoginActions(driver,wait);
        System.out.println(url);
        driver.get(url);
    }
    @Test(groups={"automation"})
    public void loginUser(){
        loginActions.clickLoginButton();
        loginActions.fillMail("mario.cc@alliedglobal.com");
        loginActions.fillPassword("Abc123**");
        loginActions.sendLoginInfo();

        wait.until(ExpectedConditions.urlContains("index"));
        String currentURL=loginActions.getCurrentPageUrl();
        if(!currentURL.contains("index")){
            Assert.fail("Incorrect credentials");
        }
    }
}
