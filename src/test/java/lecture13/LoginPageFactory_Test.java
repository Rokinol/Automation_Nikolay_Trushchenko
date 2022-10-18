package lecture13;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjects.moodpanda.HomePage;
import pageObjects.moodpanda.LoginPage;
import pageObjects.baseObjects.BaseTest;

public class LoginPageFactory_Test extends BaseTest {

    @Parameters({"url", "email", "password"})
    @Test
    public void login_Test(String url, String email, String password) {
        new HomePage()
                .open()
                .clickGetStarted();
        new LoginPage()
                .enterEmail(email)
                .enterPassword(password)
                .clickLogin()
                .verifyErrorMessage("Your email or password is wrong");
    }
}