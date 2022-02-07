package pomMultipleUsers;

import com.github.javafaker.Faker;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pomLogin.LoginActions;
import systemTesting.InitDriver;

public class AddMultipleUsers extends InitDriver{
    private LoginActions loginActions;
    private UserActions userActions;
    Faker faker = new Faker();

    @BeforeClass(alwaysRun = true)
    public void goToMCIPage(){
        final String url = "http://web-app-lb-2066069832.us-east-2.elb.amazonaws.com/login";
        loginActions = new LoginActions(driver,wait);
        userActions = new UserActions(driver,wait);
        System.out.println(url);
        driver.get(url);

    }

    @Test(groups={"AddUsers"})
    public void loginUser(){
        loginActions.clickLoginButton();
        loginActions.fillMail("mario.cc@alliedglobal.com");
        loginActions.fillPassword("Abc123**");
        loginActions.sendLoginInfo();

        wait.until(ExpectedConditions.urlContains("dashboard"));
        String currentURL=loginActions.getCurrentPageUrl();
        if(!currentURL.contains("dashboard")){
            Assert.fail("Incorrect credentials");
        }
    }

    @Test(groups = {"AddUsers"})
    public void multipleUsers(){
        for (int i = 0; i < 2; i++) {
            driver.navigate().to("http://web-app-lb-2066069832.us-east-2.elb.amazonaws.com/admin/user/index");
            String fName = faker.name().firstName();
            String lName = faker.name().lastName();
            String mail = faker.internet().emailAddress();
            userActions.goToUsersForm();
            userActions.fillFirstName(fName);
            userActions.fillLastName(lName);
            userActions.chooseRole("Administrator");
            userActions.fillEmail(mail);
            userActions.fillPass(fName.concat("123**"));
            userActions.fillEmployeeCode("1000".concat(Integer.toString(faker.number().randomDigit())));
            userActions.fillPosition("QA");
            userActions.chooseManager("Oscar");
            userActions.chooseAccount("Devops");
            userActions.chooseCountry("Guatemala");
            userActions.saveUser();
            wait.until(ExpectedConditions.urlContains("index"));
        }
    }
}
