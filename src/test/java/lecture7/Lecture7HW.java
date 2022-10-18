package lecture7;

import driver.SimpleDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.saucedemo.LoginPage;
import pageObjects.saucedemo.ProductPage;

public class Lecture7HW {
    @BeforeTest
    public void preconditions() {
        new SimpleDriver();
    }

    @Test
    public void loginTest1() {
        LoginPage loginPage = new LoginPage();
        loginPage.open();
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLogin();

        ProductPage productPage = new ProductPage();
        productPage.verifyPageTitle();
    }

    @Test
    public void loginTest2() {
        LoginPage loginPage = new LoginPage();
        loginPage.open();
        loginPage.enterUsername("locked_out_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLogin();

        ProductPage productPage = new ProductPage();
        productPage.verifyPageTitle();
    }

    @Test
    public void loginTest3() {
        LoginPage loginPage = new LoginPage();
        loginPage.open();
        loginPage.enterUsername("problem_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLogin();

        ProductPage productPage = new ProductPage();
        productPage.verifyPageTitle();
    }
}